package Enigma;

public class DeciduousTree extends Tree {

    private String leaves;

    public DeciduousTree(String name, String leaves, int height, String branches, String trunk){
        super(name, height, branches, trunk);
        this.leaves=leaves;
    }

    public void dropLeavesForWinter(){
        System.out.println("Drops leaves");
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "DeciduousTree{" +
                "leaves='" + leaves + '\'' +
                "height=" + getHeight() +
                ", branches='" + getBranches() + '\'' +
                ", trunk='" + getTrunk() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
