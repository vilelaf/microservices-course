package com.example.hruser.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name= "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String roleName;

    public Role() {
    }

    public Role(String id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return roleName.equals(role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName);
    }
}
