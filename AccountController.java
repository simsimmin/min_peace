package min;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountController {
    private List<AccountModel> accountModels = new ArrayList<>();
    private AccountModel accountModel;

    public void join(){
        System.out.println("고객님의 이름을 입력해 주셍");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("password 입력해주셍");
        int password = scanner.nextInt();
        //password규칙 웅앵웅
        accountModel = new AccountModel(name, password);
        accountModels.add(accountModel);
        System.out.println("계정생성완료");
    }
    public void login(){
        System.out.println("이름 입력");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        accountModel = findAccount(name);
        if(accountModel==null){
            System.out.println("없는 계정입니다");
            return;
        }
        System.out.println("비밀번호 입력");
        int password = scanner.nextInt();
    }
    public AccountModel findAccount(String name) {
        for (AccountModel accountModel : accountModels) {
            if (accountModel.getName().equals(name)) {
                System.out.println("찾은 이름"+accountModel.getName());
                return accountModel;
            }
        }
        return null;
    }
    public void showAccounts(){
        for(AccountModel accountModel:accountModels){
            System.out.println("계정 이름: "+accountModel.getName()+
                " 계정 비번: "+accountModel.getPassword());
        }
    }
}
