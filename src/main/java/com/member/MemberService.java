package com.member;



import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    Member createMember(Member member);

    List<Member> getAllMembers();
}