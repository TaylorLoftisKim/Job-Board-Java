import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class JobOpeningTest {

  @Test
  public void JobOpening_instantiatesCorrectly_true() {
    JobOpening myJobOpening = new JobOpening("Teacher");
    assertEquals(true, myJobOpening instanceof JobOpening);
  }

  @Test
  public void JobOpening_instantiatesWithDescription_String() {
    JobOpening myJobOpening = new JobOpening("Fifth Grade Teacher");
    assertEquals("Fifth Grade Teacher", myJobOpening.getDescription());
  }

  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    JobOpening myJobOpening = new JobOpening("Fifth Grade Teacher");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myJobOpening.getCreatedAt().getDayOfWeek());
  }

  @Test
  public void all_returnsAllInstancesOfJobOpening_true() {
    JobOpening myJobOpening1 = new JobOpening("Fifth Grade Teacher");
    JobOpening myJobOpening2 = new JobOpening("Bus Driver");
    assertEquals(true, JobOpening.all().contains(myJobOpening1));
    assertEquals(true, JobOpening.all().contains(myJobOpening2));
  }

  @Test
  public void clear_emptiesAllJobOpeningsFromArrayList_0() {
    JobOpening myJobOpening = new JobOpening("Fifth Grade Teacher");
    JobOpening.clear();
    assertEquals(JobOpening.all().size(), 0);
  }

  @Test
  public void getId_JobOpeningInstantiatesWithAnId_1() {
    JobOpening.clear();
    JobOpening myJobOpening = new JobOpening("Fifth Grade Teacher");
    assertEquals(1, myJobOpening.getId());
  }

  @Test
  public void find_returnsJobOpeningWithSameId_myJobOpening2() {
    JobOpening myJobOpening1 = new JobOpening("Fifth Grade Teacher");
    JobOpening myJobOpening2 = new JobOpening("Bus Driver");
    assertEquals(JobOpening.find(myJobOpening2.getId()), myJobOpening2);

  }
}
