package nl.joris.datacmns1438;

import nl.joris.datacmns1438.model.RootEntity;
import nl.joris.datacmns1438.repository.RootEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataCMNS1438ApplicationTests {

    @Autowired
    private RootEntityRepository rootEntityRepository;

    @Test
    void shouldPersistRootEntity() {
        rootEntityRepository.save(new RootEntity());
    }
}
