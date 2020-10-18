public class Main {
    public static void main(String[] args) {

        System.out.println("Basics of cooking meat: \n");

        Meat meat = new Meat();
        meat.boil();


        Beef beef = new Beef();
        beef.fry();


        Poultry chix = new Poultry();
        chix.boil();
        chix.cook();
        chix.fry();

        System.out.println("Average weight of chicken breast: ");
        chix.setWeight(180);
        chix.getWeight();
    }
}


class Meat {
    public void cook () {
        System.out.println("Meat can be cooked and it has to be over 75 degrees of Celsius if you want to eat it");
    }
    public void fry () {
        System.out.println("Meat can be fried on a pan or in a fryer");
    }
    public void boil () {
        System.out.println("Meat shouldn't be boiled except situations you making a soup");
    }
}


class Beef extends Meat{
    public void cook () {
        System.out.println("Rare - 55 degrees Celsius, Medium - 65 degrees Celsius");
    }
    public void fry () {
        System.out.println("Rare - 55 degrees Celsius, Medium - 65 degrees Celsius");
    }
}


class Poultry extends Meat{

    private int weight;

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void getWeight() {
        System.out.println(weight+" grams");
    }


    public void boil () {
        System.out.println("In restaurant where I work we used to boil breast before drowning it into a creamy sauce");
    }
}