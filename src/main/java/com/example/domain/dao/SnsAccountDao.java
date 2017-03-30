package com.example.domain.dao;

import com.example.domain.entity.SnsAccount;
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
public interface SnsAccountDao {

    /**
     * @param snsAccountSeq
     * @return the SnsAccount entity
     */
    @Select
    SnsAccount selectById(Integer snsAccountSeq);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(SnsAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(SnsAccount entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(SnsAccount entity);
}