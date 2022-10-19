package com.example.demo.dto.dtoRequest;

import java.util.ArrayList;
import java.util.List;

public class FamilyMemberRequest {

        private String familyName;
        private String givenName;
        private int age;
        private int familyId;
        private List<FamilyMemberRequest> familyMemberRequest = new ArrayList<>();

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getFamilyName() {
                return familyName;
        }

        public void setFamilyName(String familyName) {
                this.familyName = familyName;
        }

        public String getGivenName() {
                return givenName;
        }

        public void setGivenName(String givenName) {
                this.givenName = givenName;
        }

        public int getFamilyId() {return familyId;}

        public void setFamilyId(int familyId) {
                this.familyId = familyId;
        }

        public List<FamilyMemberRequest> getFamilyMemberRequest() {
                return familyMemberRequest;
        }
}
