package boywigh.engineersday;

/**
 * Created by boywigh on 2/9/17.
 */

public class RegisterTeam {
    public static int choice=0;
    public static String pname="";
    public static String pclass="";
    public static String psec="";
    public static String pnumber="";

    public String getPnumber()
    {
        return pnumber;
    }

    public String getPname(){
        return pname;
    }

    public String getPsec(){
        return psec;
    }

    public String getPclass() {
        return pclass;
    }

    public int getChoice() {
        return choice;
    }

    public void setPnumber(String pnumber) {
        this.pnumber=pnumber;
    }

    public void setClass(String pclass) {
        this.pclass=pclass;
    }

    public void setPsec(String psec) {
        this.psec=psec;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

}
