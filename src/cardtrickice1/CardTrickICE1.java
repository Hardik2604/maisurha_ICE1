/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

import javax.swing.JOptionPane;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 *@author sivagamasrinivasan
 * @author Hardikkumar Maisuriya
 * Student ID:991621036
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Initializing the variables
        int value,counter=0;
        boolean find=true;
        String suit;
        // array of Card object- suit and value
        Card[] magichand= new Card[7];
        Card luckyCard=new Card();
        luckyCard.setValue(7);
        luckyCard.setSuits("Hearts");
        //JoptionPane to take input from user
        JOptionPane.showMessageDialog(null,"Enter the card details :");
        suit=JOptionPane.showInputDialog(null, "Suits:\n1.Spades\n2.Jack\n3.Hearts\n4.Diamonds\nEnter the suit : ","Suit Type",JOptionPane.OK_OPTION);
        value=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter any value from 1 to13: ","Value of card",JOptionPane.OK_OPTION));
        //object of a class - default constructor
        Card c=new Card();
        //adding random value and suit of card in array of object
        for(int i=0;i<magichand.length;i++)
        {
            magichand[i]= new Card(c.ranSuit(),c.ranValue());
        }   
        //Print the value and suit of card from array of object
        for (int i=0;i<magichand.length;i++)
        {
            System.out.println(magichand[i].getValue()+" of "+magichand[i].getSuits());
        }
        //Check whether the enetered card is available or not
        for(int j=0;j<7;j++)
        {
            if((magichand[j].getSuits().equalsIgnoreCase(suit) && magichand[j].getValue()==value))
            {
                find=true;
                break;
            }
            else
            {
                find=false;   
            }
            counter++;
        }
        if(find==true)
        {
            JOptionPane.showMessageDialog(null,"Card found at positin "+counter+" which is "+value+" of "+suit,"Card Found",JOptionPane.OK_OPTION);
        }
        else
        {
            JOptionPane.showMessageDialog(null,value+" of "+suit+" is not available!","Card Not Found!!",JOptionPane.OK_OPTION);
        }
    }    
}
