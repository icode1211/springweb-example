package com.estsoft.hispring.repository;

import com.estsoft.hispring.controller.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// JPA
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
