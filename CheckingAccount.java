public class CheckingAccount implements Bnak {
    @Override
    public void(String AccountNumber){
        System.out.println("CheckingAccount Details", + AccountNumber);
    }
    @Override
    public void(double balance){
        System.out.println("CheckingAccount Details", + balance);
    }
    @Override
    public void(int Bnakcode){
        System.out.println("CheckingAccount Details", + Bnakcode);
    }
    @Override
    public void(double limit){
        System.out.println("CheckingAccount Details", + limit);
    }


    public CheckingAccount() {

    }
}
