package anhthu.BaiTapWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anhthu.BaiTapWeb.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
