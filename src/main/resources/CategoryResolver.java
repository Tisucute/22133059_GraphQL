@Component
public class CategoryResolver implements GraphQLQueryResolver {
	@Autowired
    private CategoryService categoryService;

    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }
}
