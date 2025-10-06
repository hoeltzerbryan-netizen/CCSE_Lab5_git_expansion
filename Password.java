public class Password extends Account {
    private String accountUser;
    private String password;

    Password(double i) {
        super(i);
        accountUser = "";
        password = "";
    }
    Password(String u, String p,double i) {
        super(i);
        accountUser = u;
        password = p;
    }
    Boolean isPass(String p){
        if(password.equals(p))
            return true;
        return false;
    }
    String getAccountUser(){
        return accountUser;
    }

    public String toString(){
        return "correct password continue!";
    }
}