package com.example.domain.entity;

import java.time.LocalDate;
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
@Table(name = "merchant_app")
public class MerchantApp {

    /** */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    public Integer appId;

    /** */
    @Column(name = "app_name")
    public String appName;

    /** */
    @Column(name = "foster")
    public String foster;

    /** */
    @Column(name = "is_active")
    public Short isActive;

    /** */
    @Column(name = "os_type")
    public Short osType;

    /** */
    @Column(name = "package_name")
    public String packageName;

    /** */
    @Column(name = "start_date")
    public LocalDate startDate;

    /** */
    @Column(name = "updated_by")
    public String updatedBy;

    /** */
    @Column(name = "updated_on")
    public LocalDateTime updatedOn;

    /** */
    @Column(name = "vendor_id")
    public Integer vendorId;
}