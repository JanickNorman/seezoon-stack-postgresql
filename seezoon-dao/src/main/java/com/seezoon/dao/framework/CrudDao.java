package com.seezoon.dao.framework;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.seezoon.dao.framework.entity.AbstractQueryCondition;
import com.seezoon.dao.framework.entity.BaseEntity;

/**
 * Contains basic CRUD definitions, DAO completes basic field validation
 *
 * @author hdf
 * @param <T>
 *            DB entity
 * @param <PK>
 *            Primary key - only supports simple primary keys (numeric and string) for rapid development
 */
public interface CrudDao<T extends BaseEntity<PK>, PK> extends BaseDao {

    /**
     * Generic delete, usually no delete permission in production, meaningless, can be commented out based on project needs
     *
     * @param pks
     * @return
     */
    int deleteByPrimaryKey(@NotEmpty PK... pks);

    /**
     * Insert
     *
     * @param records
     * @return
     */
    int insert(@NotEmpty T... records);

    /**
     * Query by primary key
     *
     * @param pk
     * @return
     */
    T selectByPrimaryKey(@NotNull PK pk);

    /**
     * Query
     *
     * @param condition
     * @return
     */
    List<T> selectByCondition(AbstractQueryCondition condition);

    /**
     * Selective update
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(@NotNull T record);

    /**
     * Full field update by primary key
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(@NotNull T record);
}
