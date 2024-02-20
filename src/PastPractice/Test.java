package PastPractice;

class Bank {
     int getInterest(){return 0;}
}
class SBI extends Bank {
    int getInterest(){return 8;}
}

class ICICI extends Bank {
    int getInterest(){return 7;}
}

class AXIS extends Bank {
    int getInterest(){return 9;}
}

class Test {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("PastPractice.SBI Rate of Interest: " + s.getInterest());
        System.out.println("PastPractice.ICICI Rate of Interest: " + i.getInterest());
        System.out.println("PastPractice.AXIS Rate of Interest: " + a.getInterest());
    }
}
