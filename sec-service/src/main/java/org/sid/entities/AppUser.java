package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private boolean actived;
    @ManyToMany(fetch = FetchType.EAGER )
    @JoinTable(name = "users_roles",joinColumns = { @JoinColumn(name = "user_id") },inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Collection<AppRole> roles = new ArrayList<>();

}
