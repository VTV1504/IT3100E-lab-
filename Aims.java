public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Peter Pan",
                "Animation", "Wilfred Jackson", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Tinker Bell and the Great Fairy Rescue",
                "Animation", "Bradley Raymond", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Little Mermaid",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("Total Cost is: ");
        System.out.print(anOrder.totalCost());
    }
}
