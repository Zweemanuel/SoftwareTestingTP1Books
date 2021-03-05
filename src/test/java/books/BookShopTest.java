package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */

	BookShop bs = new BookShop("emanuel");
	int[] books = {1,2,0,0,0};
	int[] books2 = {3,3,3,3,3};
	int[] books3 = {5,1,1,1,1,1};
	int[] books4 = {1,1,1};
	int[] books5 = {};
	int[] books6 = {0,0,0,0,0};
    @Test
    public void myFirstTest(){
    	assertEquals(22.88, bs.cost(books));
    }
    
    @Test
    public void test2(){
    	assertEquals(106, bs.cost(books2));
    }
    
    @Test
    public void test3(){
    	assertThrows(IndexOutOfBoundsException.class, () -> { bs.cost(books3); });
    }
    
    @Test
    public void test4(){
    	assertThrows(IndexOutOfBoundsException.class, () -> { bs.cost(books4); });
    }
    
    @Test
    public void test5(){
    	assertThrows(IndexOutOfBoundsException.class, ()->{bs.cost(books5);});
    }
    
    @Test
    public void test6(){
    	assertEquals(0, bs.cost(books6));
    }
    
    
}