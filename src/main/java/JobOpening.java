import java.util.ArrayList;
import java.time.LocalDateTime;

public class JobOpening {
  private String mJobTitle;
  private String mDescription;
  private LocalDateTime mCreatedAt;
  private static ArrayList<JobOpening> instances = new ArrayList<JobOpening>();
  private int mId;

  public JobOpening(String description) {
    mDescription = description;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static ArrayList<JobOpening> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static JobOpening find(int id) {
    return instances.get(id - 1);
  }

}
