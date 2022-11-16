package com.ms.email.dtos;


import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
public class EmailDto {

    private long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    
}
