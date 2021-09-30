package Enigma;

public class Conifer extends Tree {

    private String needle;
    public Conifer(String name, String needle, int height, String branches, String trunk){
        super(name, height, branches, trunk);
        this.needle=needle;
    }

    public void sting(){
        System.out.println("String random animal");
    }

    public String getNeedle() {
        return needle;
    }

    public void setNeedle(String needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return "DeciduousTree{" +
                "needles='" + needle + '\'' +
                "height=" + getHeight() +
                ", branches='" + getBranches() + '\'' +
                ", trunk='" + getTrunk() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
