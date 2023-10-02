package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class JobTest {

    //TODO: Create your unit tests here
Job job1;
Job job2;
Job job3;
@BeforeEach
public  void createTestData()
{
    job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
        new PositionType("Quality control"), new CoreCompetency("Persistence"));
    job2 = new Job("Web Developer", new Employer("LaunchCode"),new Location("St. Louis"), new PositionType("Front-end developer"),
   new CoreCompetency("JavaScript"));
    job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));


}
@Test
    public void testSettingJobId()
{
    String message = "IDs of two different Job objects should be distinct";
    int actual=job1.getId();
    int expected=job2.getId();
    assertNotEquals(expected,actual,message);
}
@Test
    public void testJobConstructorSetsAllFields()
{
    String message = "Constructor sets all fields correctly";


    assertEquals("Product tester", job1.getName(), message);


    Employer actualEmployer = job1.getEmployer();
    assertTrue(actualEmployer instanceof Employer, message);
    assertEquals("ACME", actualEmployer.getValue(), message);

    Location actualLocation = job1.getLocation();
   assertTrue(actualLocation instanceof Location, message);
   assertEquals("Desert", actualLocation.getValue(), message);


    PositionType actualPositionType = job1.getPositionType();
    assertTrue(actualPositionType instanceof PositionType, message);
    assertEquals("Quality control", actualPositionType.getValue(), message);


    CoreCompetency actualCoreCompetency = job1.getCoreCompetency();
    assertTrue(actualCoreCompetency instanceof CoreCompetency, message);
    assertEquals("Persistence", actualCoreCompetency.getValue(), message);
}




    @Test
    public void testJobsForEquality(){
        String message = "Jobs with different IDs should not be considered equal";
        boolean condition= job1.equals((job2));
        assertFalse(condition,message);
    }

@Test

    public void testToStringStartsAndEndsWithNewLine() {
        String message = "String should start and end with a new line";
        String result = job1.toString();
        boolean condition = result.startsWith(System.lineSeparator()) && result.endsWith(System.lineSeparator());
        assertTrue(condition,message);
    }
@Test
    public void testToStringContainsCorrectLabelsAndData()
{
    String message ="String should contains correct label and data";
    String result= "\n"+"ID: " + job1.getId() + "\n"+
              "Name: " + "Product tester" + "\n" +
            "Employer: " + "ACME"+  "\n"  +
            "Location: " + "Desert" + "\n" +
            "Position Type: " + "Quality control" + "\n" +
            "Core Competency: " + "Persistence" + "\n";
    String actualResult = job1.toString();
    assertEquals(result, actualResult, message);
}
    @Test
    public void testToStringHandlesEmptyField(){
    String message =" String handles empty field";
    String result="\n"+"ID: " + job3.getId() + "\n"+
            "Name: " + "Ice cream tester" + "\n" +
            "Employer: "+"Data not available"+"\n"  +
            "Location: " + "Home" + "\n" +
            "Position Type: " + "UX" + "\n" +
            "Core Competency: " + "Tasting ability" + "\n";
        String actualResult = job3.toString();
        assertEquals(result, actualResult, message);
    }

}


