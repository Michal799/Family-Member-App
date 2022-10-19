package com.example.demo.services;

import com.example.demo.dto.dtoRepositories.FamilyMemberRepository;
import com.example.demo.dto.dtoRequest.FamilyMemberRequest;
import com.example.demo.dto.dtoResponse.FamilyMemberResponse;
import com.example.demo.dto.dtoEntities.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyMemberService {

    @Autowired
    private FamilyMemberRepository familyMemberRepository;


    public void createFamilyMember(FamilyMemberRequest familyMemberRequest) {
        familyMemberRequest.getFamilyMemberRequest().forEach(member -> {
            FamilyMember familyMember = new FamilyMember();
            familyMember.setFamilyName(member.getFamilyName());
            familyMember.setGivenName(member.getGivenName());
            familyMember.setAge(member.getAge());
            familyMember.setFamilyId(familyMember.getFamilyId());
            familyMemberRepository.save(familyMember);
        });
    }

    public FamilyMemberResponse getFamilyMember(int id) {
        List<FamilyMember> familyMembers = familyMemberRepository.findByFamilyId(id);
        FamilyMemberResponse familyMemberResponse = new FamilyMemberResponse();
        familyMemberResponse.setFamilyMember(familyMembers);
        return familyMemberResponse;
    }

}