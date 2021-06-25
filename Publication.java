class Publication{

    int price;
    String title;
    public Publication(int price, String title)
    {
        this.price = price;
        this.title = title;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
}
class Book extends Publication{
    int pageNo;
    public Book(int price, String title,int pageNo)
    {
        super(price, title);
        this.pageNo=pageNo;
    }
    public void display() {
        System.out.println("Book detail \nTitle ="+title+" \n price = "+price+" \n page no "+pageNo);
    }
    public int getPageNo()
    {
        return pageNo;
    }
    public void setPageNo(int pageNo)
    {
        this.pageNo = pageNo;
    }
}
class CD extends Publication
{
    int time;
    public CD(int price, String title,int time)
    {
        super(price, title);
        this.time=time;
    }
    public CD(int price, String title)
    {
        super(price, title);
    }
    public int getTime()
    {
        return time;
    }
    public void setTime(int time)
    {
        this.time = time;
    }

    public void display()
    {
        System.out.println("Audio \nTile ="+title+" \n price = "+price+" \n time "+time);
    }
}


class Main {

    public static void main(String[] args)
    {
        CD a=new CD(1200," BTS ",100);
        Book b=new Book(1500," THE SOUND AND THE FURY ",499);
        a.display();
        b.display();
    }

}