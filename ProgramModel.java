package min;

public class ProgramModel {
    private ExitStatus exitStatus = ExitStatus.CONTINUE;

    public ExitStatus getExitStatus() {
        return exitStatus;
    }
    public void setExitStatus(ExitStatus exitStatus) {
        this.exitStatus = exitStatus;
    }
}
