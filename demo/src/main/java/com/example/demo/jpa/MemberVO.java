package com.example.demo.jpa;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member")
public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mbrNo;

    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Builder
    public MemberVO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(long mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
