package com.metu.demo2.sys.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.metu.demo2.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-12-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TUsersInformation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String userName;

    private String password;

    private LocalDateTime registerDate;

    private String email;

    private String servNum;

    private String sex;

    private BigDecimal age;

    private String status;


}
