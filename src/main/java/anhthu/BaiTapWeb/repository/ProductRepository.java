package anhthu.BaiTapWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anhthu.BaiTapWeb.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
