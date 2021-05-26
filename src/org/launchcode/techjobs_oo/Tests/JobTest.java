package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    private Job testJobOne, testJobTwo, testJobThree, testJobFour, testJobFive;

    @Before
    public void createJobObjects() {
        testJobOne = new Job();
        testJobTwo = new Job();
        testJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobFive = new Job("Product tester", new Employer("ACME"), new Location(), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId() {
        //Arrange
        //Act
       int testJobCompare = testJobOne.getId() + 1;
        //Assert
        assertEquals(testJobCompare, testJobTwo.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
     String testJobName = testJobThree.getName();
     assertTrue(testJobName.equals("Product tester"));

    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJobThree.equals(testJobFour));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        char firstChar = testJobFour.toString().charAt(0);
        char lastChar = testJobFour.toString().charAt(testJobFour.toString().length() - 1);

        assertEquals(Character.toString(firstChar), "\n");
        assertEquals(Character.toString(lastChar), "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        //Arrange
        String expectedOutput = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: %s\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", testJobThree.getId(), testJobThree.getName(), testJobThree.getEmployer(), testJobThree.getLocation(), testJobThree.getPositionType(), testJobThree.getCoreCompetency());
        //Act
        assertEquals(expectedOutput, testJobThree.toString());
        //Assert
    }

    @Test
    public void testToStringDataNotAvailableIfFieldIsEmpty() {
        String expectedOutput = String.format("\nID: %d\n" +
                "Name: %s\n" +
                "Employer: %s\n" +
                "Location: Data not available\n" +
                "Position Type: %s\n" +
                "Core Competency: %s\n", testJobFive.getId(), testJobFive.getName(), testJobFive.getEmployer(),  testJobFive.getPositionType(), testJobFive.getCoreCompetency());

        assertEquals(expectedOutput, testJobFive.toString());


    }


}


