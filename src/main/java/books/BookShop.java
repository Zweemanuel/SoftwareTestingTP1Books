package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books) throws IndexOutOfBoundsException{
    	
       double cost = 0;
       double amount=0;
       int discounted = 0;
       double discount = 0;
       double notDiscounted = 0;
        
       if(books.length != 5) {
    	   throw new IndexOutOfBoundsException();
       }
       
       for(int i = 0 ;i <5 ;i++) {
    	   if(books[i]!=0) discounted++;
       }
       
       for(int j = 0;j<5;j++) {
    	   amount = amount + books[j];
       }
       
        notDiscounted = amount - discounted;
        
        switch(discounted) {
        
        	case 2:
        		discount = 0.07;
        		break;
        	case 3:
        		discount = 0.14;
        		break;
        	case 4:
        		discount = 0.28;
        		break;
        	case 5:
        		discount = 0.35;
        		break;
        	default: 
        		discount = 0;
        		break;
        }
        
       
        cost = discounted*8*(1-discount) + notDiscounted*8;
       
        return cost;
    }
    	 
       
}

