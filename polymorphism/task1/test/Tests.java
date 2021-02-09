import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();
    t.run();
    Assert.assertTrue("Did you assign bart to the first position?",t.patients[0] instanceof ChildPatient);
    Assert.assertTrue("Did you assign bart to the first position?",t.patients[0] instanceof Diagnosticable);
    Assert.assertTrue("An adult patient also an Employable?", t.patients[4] instanceof Employable);
    Assert.assertTrue("Is an adult patient a diagnosticable?", t.patients[4] instanceof Diagnosticable);
    Assert.assertTrue("Is Marge an adult patient?", t.patients[4] instanceof AdultPatient);
    Assert.assertTrue("Is bart a child patient?", t.patients[0] instanceof ChildPatient);
    Assert.assertTrue("Temp. Setters working?",((ChildPatient)(t.patients[0])).hasFever());
    Assert.assertEquals("Employable setters working?", ((Employable) t.patients[3]).getPreviousJobs().size(), 3);
  }
}