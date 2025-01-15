package Kapital.repository;

import Kapital.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IGenericRepository<T,K> extends CrudRepository<Address,Long> {
}
