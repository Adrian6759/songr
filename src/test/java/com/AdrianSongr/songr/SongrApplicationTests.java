package com.AdrianSongr.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test void testingReviewConstructor(){
		Album testReview = new Album("Title", "Artist", 10, 25.5, "http://www.example.com/docs/resource1.html" );

		assertEquals("Title", testReview.getTitle());
		assertEquals("Artist", testReview.getArtist());
		assertEquals(10, testReview.getSongCount());
		assertEquals(25.5, testReview.getLength());
		assertEquals("http://www.example.com/docs/resource1.html", testReview.getImageURL());
	}



}
