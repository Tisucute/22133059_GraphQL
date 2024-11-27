
@Component
public class UserResolver implements GraphQLQueryResolver {
	@Autowired
    private UserService userService;

    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
