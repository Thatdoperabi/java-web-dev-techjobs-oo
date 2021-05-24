package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        //Arrange
        Job testJobOne = new Job();
        Job testJobTwo = new Job();

        //Act
       int testJobCompare = testJobOne.getId() + 1;
        //Assert
        assertEquals(testJobCompare, testJobTwo.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
     Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     String testJobName = testJobOne.getName();
     assertTrue(testJobName.equals("Product tester"));

    }

    @Test
    public void testJobsForEquality() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJobOne.equals(testJobTwo));
    }

    @Test
    public void testJobToString() {
        //Arrange
        String expectedOutput = "\nID:1\nName:Product tester\nEmployer:ACME\nLocation:Desert\nPosition Type:Quality control\nCore Competency:Persistence\n";
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Act
        assertEquals(expectedOutput, testJobOne.toString());
        //Assert
    }


}

//(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency)
