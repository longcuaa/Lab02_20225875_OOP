package lab02;
class DigitalVideoDisc{
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title){
        this.title=title;
    }

    public DigitalVideoDisc(String title, String category , float cost ){
        this.title=title;
        this.category=category;
        this.cost=cost;
    }

    public DigitalVideoDisc(String title, String category,String directory, int length,float cost){
        this.title=title;
        this.category=category;
        this.directory=directory;
        this.length=length;
        this.cost=cost;
    }

    public String getTitle(){
        return this.title;
    }
    public String getCategory(){
        return this.category;
    }
 
    public String getDirectory(){
        return this.directory;
    }
    public int getlength(){
        return this.length;
    }
    public float getCost(){
        return this.cost;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setCategory(){
        this.category=category;
    }
    public void setDirectory(){
        this.directory=directory;
    }
    public void setLength(){
        this.length=length;
    }
    public void setCost(){
        this.cost=cost;
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd=new DigitalVideoDisc(title:"Spy x Family", category:"anime", cost:"5$");
        dvd.setLength(length:10);
        System.out.println(dvd.getTitle());
        System.out.println(dvd.getCategory());
        System.out.println(length);

    }
        }


