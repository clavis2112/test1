package spending_management_project.repo;



import spending_management_project.enums.ValidFlag;
import spending_management_project.po.Role;
import java.util.Optional;

/**
 * Role's repository.
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/16/15
 * @since JDK1.8
 */
public interface RoleRepository extends CustomRepository<Role, Long> {

  Optional<Role> findByNameAndValidFlag(String name, ValidFlag validFlag);

}
