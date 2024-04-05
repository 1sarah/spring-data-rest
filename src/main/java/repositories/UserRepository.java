package repositories;


import entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource( path = "users",collectionResourceRel = "users")
public interface UserRepository extends PagingAndSortingRepository<User, UUID> {
    List<User> findByName(@Param("name") String name);
}
