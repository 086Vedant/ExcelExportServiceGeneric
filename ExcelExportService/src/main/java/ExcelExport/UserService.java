package ExcelExport;

import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

//Service class for managing users. Handling business logic related to user management.
@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepo;

    @Transactional
    public List<User> getAllUsers() {
        return userRepo.listAll();
    }    
}
