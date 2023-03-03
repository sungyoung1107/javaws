package ws0303;

import java.util.Random;

public class Loan extends Account {
   private double principal;
   private int contractPeriod;
   private int credit;
   private double spread;

   public Loan() {
   }
   // 수정이 필요한부분------------------------------------------
   //credit 을 분리해야하는데....ㅠㅠ?

   public Loan(String accName, double rate, double balance, String accType, double principal, int contractPeriod,
         int credit, double spread) {
      super(accName, rate, balance, accType);
      this.principal = principal;
      this.contractPeriod = contractPeriod;
      this.credit = credit;
      this.spread = spread;
   }

   // ------------------------------------------------------------------------
//   public double getPrincipal() {
//      double result = 0.0;
//      return result;
//   } 이거 대신에 tostring으로 잔액 불러오면 될듯...

   @Override
   public String toString() {
      return "Loan [principal=" + principal + "]";
   }

   @Override
   public double getInterest() {
      double totalRate = getRate() + spread;
      double result = 0.0;
      result = ((principal * (totalRate / 100)/12)*contractPeriod);
      return result;
      //만기일시상환기준 대출기간동안 총 납부해야하는 이자로 계산...
   }

   public void payBack(double money) {
      if (money <= 0) {
         System.out.println("금액이 잘못입력되었습니다.");
         return;
      }
      if (money > principal) {
         System.out.println("대출 잔액을 초과하였습니다..");
         return;
      }
      principal -= money;

   }

   public void totalRate(int credit) {
      double totalRate = getRate() + spread;

      if (credit >= 1 && credit < 4) {
         System.out.println("대출이 불가합니다.");
         return;
      } else if (credit >= 4 && credit < 6) {
         spread = 3.0;
      } else if (credit >= 6 && credit < 8) {
         spread = 2.0;
      } else if (credit >= 8) {
         spread = 1.0;
      }
      System.out.println(getAccName() + "님의 대출금리는" + totalRate + "입니다.");

   }

   public int getCdScore() {
      Random rd = new Random();
      credit = rd.nextInt(9) + 1;
      return credit;
   }
}