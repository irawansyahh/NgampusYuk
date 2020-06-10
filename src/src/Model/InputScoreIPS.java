package Model;

/**
 *
 * @author Irawansyah
 * 
 */

public class InputScoreIPS{
    private String english;
    private String indonesian;
    private String math;
    private String electivesubjects;

    public InputScoreIPS(String english, String indonesian, String math, String electivesubjects) {
        this.english = english;
        this.indonesian = indonesian;
        this.math = math;
        this.electivesubjects = electivesubjects;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getIndonesian() {
        return indonesian;
    }

    public void setIndonesian(String indonesian) {
        this.indonesian = indonesian;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getElectivesubjects() {
        return electivesubjects;
    }

    public void setElectivesubjects(String electivesubjects) {
        this.electivesubjects = electivesubjects;
    }
    
    
    
}