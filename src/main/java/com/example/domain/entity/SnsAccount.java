package com.example.domain.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * @author k_kawasaki
 */
@Entity
@Table(name = "sns_account")
public class SnsAccount {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sns_account_seq")
    public Integer snsAccountSeq;

    /** */
    @Column(name = "sns_account_id")
    public String snsAccountId;

    /** */
    @Column(name = "sns_account_name")
    public String snsAccountName;

    /** */
    @Column(name = "sns_type")
    public Integer snsType;

    /** */
    @Column(name = "updated_by")
    public String updatedBy;

    /** */
    @Column(name = "updated_on")
    public LocalDateTime updatedOn;

    /** */
    @Column(name = "app_id")
    public Integer appId;
}