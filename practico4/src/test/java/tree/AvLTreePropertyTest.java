package tree;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;




public class AvLTreePropertyTest { 
	
	
    @Provide
	private  Arbitrary<AvlTree> exhaustiveTreeGenerator() {
			//TODO
		return null;
	}
	
    
    //You can change or add what you think is necessary 
	//about this property, this is just a template.
    @Property(tries = 11)
   	public void avlTreProperty(@ForAll("exhaustiveTreeGenerator") AvlTree avl, @ForAll @IntRange(min = 1, max = 11)int i) {
    	
    	Assume.that(!avl.contains(i));
    	
    	int oldSize = avl.size();
    	avl.insert(i);
    	
    	assertThat(avl.size(),is(oldSize +1)); 	
    }

}
