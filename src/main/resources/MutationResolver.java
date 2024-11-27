@Component
public class MutationResolver implements GraphQLMutationResolver {
	@Autowired
    private UserService userService;

    public User createUser(String fullname, String email, String password, String phone) {
        User user = new User();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        return userService.saveUser(user);
    }

    public User updateUser(Long id, String fullname, String email, String password, String phone) {
        User user = userService.getUserById(id);
        if (user != null) {
            user.setFullname(fullname);
            user.setEmail(email);
            user.setPassword(password);
            user.setPhone(phone);
            return userService.saveUser(user);
        }
        return null;
    }

    public Boolean deleteUser(Long id) {
        userService.deleteUser(id);
        return true;
    }
}
