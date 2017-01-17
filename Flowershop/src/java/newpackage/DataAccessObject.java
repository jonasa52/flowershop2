package newpackage;


import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class DataAccessObject
{

    public int getFlowerPrice()
    {

        try
        {
            String query = "SELECT pris FROM udvalg;";
            Statement stmt = new DBConnector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

            if (res.next())
            {
                int price = res.getInt("pris");
                return price;

            }
            return 0;

        } catch (Exception ex)
        {
            ex.printStackTrace();
            return 0;
        }
    }

    public String getFlowerType(String name)
    {

        try
        {
            String query = "SELECT art FROM udvalg;";
            Statement stmt = new DBConnector().getConnection().createStatement();
            ResultSet res = stmt.executeQuery(query);

            if (res.next())
            {
                String type = res.getString("art");
                return type;
            }
            return null;
        } catch (Exception ex)
        {

            ex.printStackTrace();
            return null;

        }

    }


public static void main (String[] args) {
    System.out.println(new DataAccessObject().getFlowerPrice());
}

}
