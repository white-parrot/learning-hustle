package org.turtle.practice.api.coupon.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
@Table(name="PERMISSIONS")
public class Permission implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permissions_id_seq")
    @SequenceGenerator(name="permissions_id_seq", sequenceName = "permissions_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "permissions")
    private Set<User> users;
    @Override
    public String getAuthority() {
        return name;
    }
}
