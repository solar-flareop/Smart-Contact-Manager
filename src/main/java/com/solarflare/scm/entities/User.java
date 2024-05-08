package com.solarflare.scm.entities;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(length = 200)
    private String about;
    private String profilePic;
    private String phoneNumber;

    // Info
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // Auth Provider
    private Providers providerString = Providers.SELF;
    private String providerUserId;

    // Mapping
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

}
