package reqres_objects;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    String name;
    String job;
    int id;
}
