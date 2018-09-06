package com.teamsankya.calculator;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

	@Test
	public void addIntTest() {

		int sum = Addition.add(20, 30);
		Assert.assertEquals(50, sum);
	}

}
