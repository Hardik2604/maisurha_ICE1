/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 * @author sivagamasrinivasan
 * @author Hardikkumar Maisuriya
 * Student ID:991621036
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};
    public Card(String s, int v)
    {
        this.suits=s;
        this.value=v;
    }

    public Card(){}
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
    
    //method for suits
    /**
     * 
     * @return suit[k]= returns random value from suit[] array
     */
    public String ranSuit()
    {
        int k=(int)(Math.random()*4);  
        return SUITS[k];  
    }

    /**
     * 
     * @return random integer value between 1-13
     */
    public int ranValue()
    { 
        return (int)(1+Math.random()*13);
    }
}
