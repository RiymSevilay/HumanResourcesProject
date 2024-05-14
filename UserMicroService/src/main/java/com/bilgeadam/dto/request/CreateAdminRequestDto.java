package com.bilgeadam.dto.request;

import com.bilgeadam.utility.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAdminRequestDto {
    private String token;
    private String name;
    private String secondName;
    private String surname;
    private String secondSurname;
    private String personalEmail;
    private String identityNumber;
    private String birthPlace;
    private String occupation;
    private String address;
    private String phone;
    private Long salary;
    private LocalDate birthDate;
    private LocalDate jobStart;
}
