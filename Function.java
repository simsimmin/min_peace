package min;

public class Function {
    public static void main(String[] arg) {
        AccountView accountView = new AccountView();
        ProgramController programController = new ProgramController();

        ExitStatus exitStatus = programController.getProgramModel().getExitStatus();

        while (exitStatus == ExitStatus.CONTINUE) {

            accountView.menu(programController);

        }
    }
}
