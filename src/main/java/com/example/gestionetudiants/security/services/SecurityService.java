package ma.enset.tp67.security.services;

import ma.enset.tp67.security.entities.AppRole;
import ma.enset.tp67.security.entities.AppUser;

public interface SecurityService {

    AppUser saveNewUser(String username, String password, String rePassword);
    AppRole saveNewRole(String roleName, String description);
    void addRoleToUser(String username, String roleName);
    void removeRoleFromUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
}
