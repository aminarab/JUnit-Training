package com.tosan.junit.training.assertmap;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestMap {
	@Test
	public void testAssertMap() {

		Map<String, String> map = new HashMap<String, String>();
		map.put("j", "java");
		map.put("c", "c++");
		map.put("p", "python");
		map.put("n", "node");

		Map<String, String> expected = new HashMap<String, String>();
		expected.put("n", "node");
		expected.put("c", "c++");
		expected.put("j", "java");
		expected.put("p", "python");

		// All passed / true

		// 1. Test equal, ignore order
		assertThat(map, equalTo(expected));

		// 2. Test size
		assertThat(map.size(), equalTo(4));

		// 3. Test map entry, best!
		assertThat(map, IsMapContaining.hasEntry("n", "node"));

		assertThat(map, not(IsMapContaining.hasEntry("r", "ruby")));

		// 4. Test map key
		assertThat(map, IsMapContaining.hasKey("j"));

		// 5. Test map value
		assertThat(map, IsMapContaining.hasValue("node"));

	}

}
