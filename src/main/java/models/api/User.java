
package models.api;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SuppressWarnings("unused")
public class User {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Boolean rememberMe;
    private String timezone;
    private UUID id;
    private Boolean active;
    private String anonymous;
    private List<String> authorities;
}
