package Enigma;

public abstract class Tree {


    private int height;
    private String branches;
    private String trunk;
    private String name;

    public Tree(int height, String branches, String trunk){
        this.branches=branches;
        this.height=height;
        this.trunk=trunk;

    }
    public Tree(String name,int height, String branches, String trunk){
        this.name=name;
        this.branches=branches;
        this.height=height;
        this.trunk=trunk;

    }

    public void grow(){
        this.height++;
    }
    public void lookMajestic(){
        System.out.println(this.name +" looks majestic");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBranches() {
        return branches;
    }

    public void setBranches(String branches) {
        this.branches = branches;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", branches='" + branches + '\'' +
                ", trunk='" + trunk + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

