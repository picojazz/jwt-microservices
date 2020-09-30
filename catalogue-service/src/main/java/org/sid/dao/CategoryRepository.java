package org.sid.dao;

import org.sid.entities.Category;
import org.sid.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestController
public interface CategoryRepository extends MongoRepository<Category,String> {

}
