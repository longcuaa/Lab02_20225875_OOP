package lab02;

class Aims{
    public static void main(String[] args){
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1=new DigitalVideoDisc(title:"",);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2= new DigitalVideoDisc(...);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3=new DigitalVideoDisc(...);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println(x:"Total cost is:");
        System.out.printf(format:"%.3f",anOrder.totalCost();)

    }

}