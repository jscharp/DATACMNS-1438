package nl.joris.datacmns1438.repository;

import nl.joris.datacmns1438.model.RootEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RootEntityRepository extends MongoRepository<RootEntity, String> {

}
