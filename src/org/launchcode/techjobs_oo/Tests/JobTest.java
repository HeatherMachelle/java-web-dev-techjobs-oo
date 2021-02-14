package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {

    Job job1 = new Job();
    Job job2 = new Job();
    Job testJob;
    Job testEmptyJob;

    @Before
    public void createJobObject(){
        testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Before
    public void createEmptyJobObject(){
        testEmptyJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId(){
        assertTrue((job1.getId() != job2.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(testJob.getName(), "Product tester");
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(),"Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");
    }

    @Test
    public void testJobsforEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue((!job1.equals(job2)));
    }

    @Test
    public void toStringFormat(){
        assertEquals(testJob.toString(), "\n"+
                "ID: " + testJob.getId() + "\n" +
                "Name: Product tester\n"+
                "Employer: ACME\n"+
                "Location: Desert\n"+
                "PositionType: Quality control\n"+
                "Core Competency: Persistence\n"
        );
    }

    @Test
    public void toStringEmpty(){
        assertEquals(testEmptyJob.toString(), "\n"+
                "ID: " + testEmptyJob.getId() + "\n" +
                "Name: Data not available\n"+
                "Employer: Data not available\n"+
                "Location: Data not available\n"+
                "PositionType: Data not available\n"+
                "Core Competency: Data not available\n");
    }


}

