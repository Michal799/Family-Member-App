package com.example.demo.dto.dtoResponse;

import com.example.demo.dto.dtoEntities.FamilyMember;

import java.util.ArrayList;
import java.util.List;

public class FamilyMemberResponse {
    private String familyName;
    private List<FamilyMember> familyMember = new ArrayList<>();

    public String getFamilyName() { return familyName; }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<FamilyMember> getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(List<FamilyMember> familyMember) {
        this.familyMember = familyMember;
    }
}