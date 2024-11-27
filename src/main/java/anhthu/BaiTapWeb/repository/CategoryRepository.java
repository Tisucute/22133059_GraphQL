package anhthu.BaiTapWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anhthu.BaiTapWeb.Entity.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {

}
