
public class PriceCalculationClass
{

//    private double width;
//    private double higth;
//    private int price;

//    public PriceCalculationClass(double width, double higth, int price)
//    {
//        this.width = width;
//        this.higth = higth;
//        this.price = price;
//    }
   
    // metoden og  parmet 
    public double Go(int heigth, int width, String type)
    {
       // araet      
        double area = (heigth / 100d) * (width / 100d);
        // ramme størlen 
        double framsize = (2 * (heigth / 100d)) +( 2*(width/ 100d));
        // henter i dataAccessobject 
        int glassM2price = new DataAccessObject().getGlassPrice();
        int frameMprice = new DataAccessObject().getFrametprice(type);
        // pris for ramme per merer og ramme størlen 
        double frameprice = frameMprice * framsize;
        //glas prisen og glas per m2 * area 
        double glassprice = glassM2price * area;
        
        System.out.println(glassprice);
        System.out.println(frameprice);
        // den fule pris 
        double totalPrice = glassprice +frameprice; 
        return totalPrice;

    }








    //hvor mange metter en ramme har 
//    public double totalFrames(double higth, double width, String type)
//    {
//        // h*b*h*b 
//        return (higth + width + higth + width) * new DataAccessObject().getFrametprice(type);
//    }
//
//    // hvor mange m2 der er 
////    public double m2()
////    {
////
////    }
//// priserne for rammen 
//    public double priceForFrames(double higth, double width, String type)
//    {
//
//        return totalFrames(higth, width, type) + new DataAccessObject().getFrametprice(type);
//    }
//
//    // prisne for glasseren 
//    public double galssetForVidonet(double higth, double width)
//    {
//        // 300 pr km2 
//        int m2price = new DataAccessObject().getGlassPrice();
//
//        return higth * width * m2price;
//
//    }
//
//// den totale prise 
//    public double totalePrice(double higth, double width, String type)
//    {
//        // galspris + rammepris = vindopris 
//        return galssetForVidonet(higth, width) + priceForFrames(higth, width, type);
//        //return priceForFrames(double higth, double width, String type)+galssetForVidonet(double higth, double width);
//    }

    
    // test for om det viker 
    public static void main(String[] args)
    {
        PriceCalculationClass pcc = new PriceCalculationClass();
        pcc.Go(100, 100, "type 1");
    }
}
