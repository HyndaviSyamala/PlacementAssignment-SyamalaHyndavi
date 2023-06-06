package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ineuron.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
