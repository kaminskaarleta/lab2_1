package lab2_1;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {	
	
	
	
	@Test
	public void seqLength1_shouldFind() {
		int seq[] = {1};
		SearchResult result = BinarySearch.search(1, seq);
		assertThat(result.isFound(), is(true));		
	}
	
	@Test
	public void seqLength1_shouldNotFind() {
		int seq[] = {1};
		SearchResult result = BinarySearch.search(2, seq);
		assertThat(result.isFound(), is(false));		
	}
	
	@Test
	public void seqLengthGreater1_shouldFindAtFirstIndex() {
		int seq[] = {1,2,3};
		SearchResult result = BinarySearch.search(1, seq);
		assertThat(result.getPosition(), is(1));		
	}
	
	@Test
	public void seqLengthGreater1_shouldFindAtLastIndex() {
		int seq[] = {1,2,3};
		SearchResult result = BinarySearch.search(3, seq);
		assertThat(result.getPosition(), is(seq.length));		
	}
	
	@Test
	public void seqLengthGreater1_shouldFindAtCentreIndex() {
		int seq[] = {1,2,3};
		SearchResult result = BinarySearch.search(2, seq);
		assertThat(result.getPosition(), is((seq.length+1)/2));		
	}
	
	@Test
	public void seqLengthGreater1_shouldNotFind() {
		int seq[] = {1,2,3};
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.isFound(), is(false));		
	}
	
}
