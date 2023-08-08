package com.itl.consulting.test_task.entity.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "app_user")
public class AppUser {

    @Column(name = "id", columnDefinition = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login", columnDefinition = "логин")
    private String login;

    @Column(name = "password", columnDefinition = "пароль")
    private String password;

    @Column(name = "role", columnDefinition = "роль")
    private String role;

    @Column(name = "name", columnDefinition = "имя")
    private String name;

    @Column(name = "second_name", columnDefinition = "фамилия")
    private String secondName;
}
