package com.ysyeob.myutils.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "USER_NM")
    private String usrNm;

    @Column(name = "USER_EML")
    private String usrEml;

    @Column(name = "USER_PWD")
    private String usrPwd;

    @Column(name = "USER_ROL")
    private String usrRol;
}
