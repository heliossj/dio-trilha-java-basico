package model;

public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 30;
    private Pet pet;


    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo" );
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina esta no máximo");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 30){
            System.out.println("A capacidade de shampoo da máquina esta no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public Boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina esta suja, para colocar pet é necessária limpa-la");
            return;
        }
        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + "está na máquina neste momento");
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + "foi colocado na máquina");
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi tirado da maquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}
