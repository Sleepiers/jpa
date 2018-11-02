package com.jpa.dao;

import com.jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @user zzw
 * @date 2018/11/2
 */
public interface UserDao extends CrudRepository<User, Integer>, JpaSpecificationExecutor {
    @Query(value = "SELECT b FROM User b")
    Page<User> getAll(Pageable pageRequest);

    User findByName(String name);
}
