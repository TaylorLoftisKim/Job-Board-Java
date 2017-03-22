import org.junit.*;
import static org.junit.Assert.*;

public class CityTest {

  @Test
  public void newCity_instantiatesCorrectly() {
    City testCity = new City("Portland");
    JobOpening testJobOpening = new JobOpening("Teacher");
    assertEquals(true, testCity instanceof City);
  }

  @Test
  public void getCityName_cityInstantiatesWithName_Portland() {
    City testCity = new City("Portland");
    assertEquals("Portland", testCity.getCityName());
  }

  @Test
  public void all_returnsAllInstancesOfCity_true() {
    City testCity1 = new City("Portland");
    City testCity2 = new City("Seattle");
    assertEquals(true, City.all().contains(testCity1));
    assertEquals(true, City.all().contains(testCity2));
  }

  @Test
  public void clear_emptiesAllCitiesFromList_0() {
    City testCity = new City("Portland");
    City.clear();
    assertEquals(0, City.all().size());
  }

  @Test
  public void getId_citiesInstantiatesWithAnId_1() {
    City testCity = new City("Portland");
    assertEquals(1, testCity.getId());
  }

  @Test
  public void find_returnsCityWithSameId_testCity2() {
    City.clear();
    City testCity1 = new City("Portland");
    City testCity2 = new City("Seattle");
    assertEquals(City.find(testCity2.getId()), testCity2);
  }

  @Test
  public void getJobOpenings_initiallyReturnsEmptyList_ArrayList() {
    City.clear();
    City testCity = new City("Portland");
    assertEquals(0, testCity.getJobOpenings().size());
  }

  @Test
  public void addJobOpening_addsJobOpeningToList_true() {
    City testCity = new City("Portland");
    JobOpening testJobOpening = new JobOpening("Teacher");
    testCity.addJobOpening(testJobOpening);
    assertEquals(true, testCity.getJobOpenings().contains(testJobOpening));
  }
}
