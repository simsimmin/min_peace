package min;

public class ProgramController {
    private ProgramModel programModel=new ProgramModel();
    public void exit(){
        programModel.setExitStatus(ExitStatus.EXIT);
    }

    public ProgramController(){
        programModel=new ProgramModel();
    }

    public ProgramModel getProgramModel() {
        return programModel;
    }
    public void setProgramModel(ProgramModel programModel) {
        this.programModel = programModel;
    }
}
