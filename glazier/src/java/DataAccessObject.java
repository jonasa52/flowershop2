
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class DataAccessObject // ansvaret for at hendet data 
{

    public int getGlassPrice()// henter glassprice i databaen
    {

        try
        {
            String query = "SELECT `price` FROM `table` WHERE `name` = 'glass';";
            Statement stmt = new DBConnector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            if (res.next())
            {
                int price = res.getInt("price");
                return price;

            }
            return 0;

        } catch (Exception ex)
        {

            ex.printStackTrace();
            return 0;

        }

    }

    public int getFrametprice(String type) // henter rammen prisen 
    {

        try
        {
            String query = "SELECT `price` FROM `table` WHERE `name` = '" + type + "';";
            Statement stmt = new DBConnector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);
            if (res.next())
            {
                int price = res.getInt("price");
                return price;

            }
            return -1;

        } catch (Exception ex)
        {

            ex.printStackTrace();
            return -1;
        }

    }

    public static void main(String[] args)
    {
        //System.out.println(new DataAccessObject().getGlassPrice(0));
    }

}
