package newpackage;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class PriceCalularionClass
{

    Scanner antal = new Scanner(System.in);
    private int fragt = 50;
    double totalpris;

    public double Calularion()
    {

// henter i dataAccessobject 
        int flowerprice = new DataAccessObject().getFlowerPrice();

// udrenge total prisen 
        int input = antal.nextInt();
        System.out.println("you want" + input + " flowers");
        System.out.println(flowerprice);
        totalpris = flowerprice * input;

        System.out.println(" you total pris is " + totalpris);
        return totalpris;

    }
// udreng total prisne + fragen

    public double FullfagetPrice()
    {
        double futlfaget = totalpris + fragt;
        return futlfaget;

    }

//  udreng prisen over x antal kr for at se om kunden få gritse fraget  
    public double Freefaget()
    {

        if (totalpris > 600.00)
        {

            System.out.println("you get free shipping");

        }

        return totalpris;

    }

}
