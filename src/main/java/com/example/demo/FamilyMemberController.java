package com.example.demo;

import com.example.demo.dto.dtoRepositories.FamilyMemberRepository;
import com.example.demo.dto.dtoRequest.FamilyMemberRequest;
import com.example.demo.dto.dtoResponse.FamilyMemberResponse;
import com.example.demo.services.FamilyMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@Validated
public class FamilyMemberController {

    @Autowired
    private FamilyMemberRepository familyMemberRepository;
    @Autowired
    private FamilyMemberService familyMemberService;

    @GetMapping("/getFamilyMember")
    public ResponseEntity<FamilyMemberResponse> get(@RequestBody @PathVariable @Valid int id ) {
        return ResponseEntity.ok(familyMemberService.getFamilyMember(id));
    }

    @PostMapping("/createFamilyMember")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody FamilyMemberRequest familyMember) {
        familyMemberService.createFamilyMember(familyMember);
    }
}