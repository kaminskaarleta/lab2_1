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
		int key = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));		
		assertThat(result.getPosition(), is(key));

	}
	
	@Test
	public void seqLength1_shouldNotFind() {
		int seq[] = {1};
		int key = 2;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(false));	
		assertThat(result.getPosition(), is(-1));
	}
	
	@Test
	public void seqLengthGreater1_shouldFindAtFirstIndex() {
		int seq[] = {1,2,3};
		int key = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(result.getPosition(), is(key));		
	}
	
	@Test
	public void seqLengthGreater1_shouldFindAtLastIndex() {
		int seq[] = {1,2,3};
		int key = 3;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(result.getPosition(), is(seq.length));		
	}
	
	@Test
	public void seqLengthGreater1_shouldFindAtCentreIndex() {
		int seq[] = {1,2,3};
		int key = 2;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(result.getPosition(), is((seq.length+1)/2));		
	}
	
	@Test
	public void seqLengthGreater1_shouldNotFind() {
		int seq[] = {1,2,3};
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.isFound(), is(false));
		assertThat(result.getPosition(), is(-1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void seqLength0_shouldGetException() {
		int seq[] = {};
		SearchResult result = BinarySearch.search(5, seq);
	}
	
	@Test
	public void seqLegthIsEvenNumber_shouldBeTrue() {
		int seq[] = {1,2,3,4};
		int key = 4;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(result.getPosition(), is(key));
	}
	
	@Test
	public void seqLegthIsOddNumber_shouldBeTrue() {
		int seq[] = {1,2,3,4,5};
		int key = 4;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(result.getPosition(), is(key));
	}
}
