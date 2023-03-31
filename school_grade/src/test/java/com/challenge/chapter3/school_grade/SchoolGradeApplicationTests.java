package com.challenge.chapter3.school_grade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

@SpringBootTest
class SchoolGradeApplicationTests {

	Classroom classroom;
	School school;
	String GRADE_FILE_PATH = "C:\\dev\\Java\\Binar Academy\\Git Config\\school_grade\\src\\main\\resources\\data_sekolah.csv";
	String SCHOOL_FILE_PATH = "C:\\dev\\Java\\Binar Academy\\Git Config\\school_grade\\src\\main\\resources\\data_sekolah.txt";
	String CLASS_FILE_PATH = "C:\\dev\\Java\\Binar Academy\\Git Config\\school_grade\\src\\main\\resources\\data_per_kelas.txt";

	@BeforeEach
	void prepare(){
		classroom = new Classroom("XI MIPA 2", Arrays.asList("10","9","8","8","8","9","7","7","7","7"));
		school = new School(Arrays.asList("A", "B", "C", "D"), Arrays.asList("10", "10", "10", "9", "9", "9", "2", "3", "5", "7", "6", "7", "7", "5", "8", "8"));
	}

	@DisplayName("Success Test -> classroom.getModus()")
	@Test
	void testModusSuccess(){
		Assertions.assertEquals("7 (4)", classroom.getModus());
	}

	@DisplayName("Failed Test -> classroom.getModus()")
	@Test
	void testModusFailed(){
		Assertions.assertNotEquals("7 (10)", classroom.getModus());
	}

	@DisplayName("Success Test -> classroom.getMean()")
	@Test
	void testMeanSuccess(){
		Assertions.assertEquals(8.0,classroom.getMean());
	}

	@DisplayName("Failed Test -> classroom.getMean()")
	@Test
	void testMeanFailed(){
		Assertions.assertNotEquals(10,classroom.getMean());
	}

	@DisplayName("Success Test -> classroom.getMedian()")
	@Test
	void testMedianSuccess(){
		Assertions.assertEquals("8",classroom.getMedian());
	}

	@DisplayName("Failed Test -> classroom.getMedian()")
	@Test
	void testMedianFailed(){
		Assertions.assertNotEquals("10",classroom.getMedian());
	}

	@DisplayName("Success Test -> school.getMedian()")
	@Test
	void testMedianSchoolSuccess(){
		Assertions.assertEquals("8",school.getMedian());
	}

	@DisplayName("Failed Test -> school.getMedian()")
	@Test
	void testMedianSchoolFailed(){
		Assertions.assertNotEquals("10",school.getMedian());
	}

	@DisplayName("Success Test -> school.getModus()")
	@Test
	void testModusSchoolSuccess(){
		Assertions.assertEquals("7 (3) V1",school.getModus());
	}

	@DisplayName("Failed Test -> school.getModus()")
	@Test
	void testModusSchoolFailed(){
		Assertions.assertNotEquals("10 (6) V2",school.getModusV2());
	}

	@DisplayName("Success Test -> school.getMean()")
	@Test
	void testMeanSchoolSuccess(){
		var total = 0.0;
		for(String i: school.getGradeByClass()){
			total += Double.parseDouble(i);
		}
		var mean = total/school.getGradeByClass().size();
		Assertions.assertEquals(mean,school.getMean());
	}

	@DisplayName("Failed Test -> school.getMean()")
	@Test
	void testMeanSchoolFailed(){
		Assertions.assertNotEquals(10.0,school.getMean());
	}

	@DisplayName("Success Test -> Success read file")
	@Test
	void readFileTest() {
		Assertions.assertDoesNotThrow(() -> new FileReader(GRADE_FILE_PATH));
		Assertions.assertDoesNotThrow(() -> new FileReader(CLASS_FILE_PATH));
		Assertions.assertDoesNotThrow(() -> new FileReader(SCHOOL_FILE_PATH));
	}

	@DisplayName("Success Test -> Success check given path name is file")
	@Test
	void isFileTest() {
		File file = new File(SCHOOL_FILE_PATH);
		Assertions.assertTrue(file.isFile());
	}

	@DisplayName("Success Test -> Success read file")
	@Test
	void pathFileTest() {
		File file = new File(SCHOOL_FILE_PATH);
		Assertions.assertTrue(file.getAbsolutePath().endsWith("data_sekolah.txt"));
	}
}
