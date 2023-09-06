package min;
import java.util.Scanner;

public class AccountView {
    private AccountController accountController = new AccountController();

    public void menu(ProgramController programController){
        System.out.println("1.가입 2.로그인 3.종료 4.계정 목록 보기");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        switch(inputNum){
            case 1:
                accountController.join();
                break;
            case 2:
                accountController.login();
                break;
            case 3:
                programController.exit();
                break;
            case 4:
                accountController.showAccounts();
                break;
        }
    }
}
