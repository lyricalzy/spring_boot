package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Long> {

    // findBy 뒤에 칼럼명을 붙여주면 검색이 가능하다
    public List<MemberVO> findById(String id);

    public List<MemberVO> findByName(String name);

    public List<MemberVO> findByNameLike(String keyword);
}
