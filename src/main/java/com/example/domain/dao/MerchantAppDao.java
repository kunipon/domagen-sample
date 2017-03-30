package com.example.domain.dao;

import com.example.domain.entity.MerchantApp;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 * @author k_kawasaki
 */
@Dao
@ConfigAutowireable
public interface MerchantAppDao {

    /**
     * @param appId
     * @return the MerchantApp entity
     */
    @Select
    MerchantApp selectById(Integer appId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(MerchantApp entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(MerchantApp entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(MerchantApp entity);
}