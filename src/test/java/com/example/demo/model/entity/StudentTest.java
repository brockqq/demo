package com.example.demo.model.entity;





import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student student = new  Student("Brock", "Lin");
		String actual = "Lin Brock";
		assertThat(actual).isEqualTo(student.getFullName());
		
	}

}
