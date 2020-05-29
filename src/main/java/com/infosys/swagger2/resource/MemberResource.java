/**
 * 
 */
package com.infosys.swagger2.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.swagger2.model.Member;

import io.swagger.annotations.ApiOperation;

/**
 * @author Girish_Ramagiri
 *
 */
@RestController
@RequestMapping("/api")
public class MemberResource {

	ConcurrentMap<Integer, Member> members = new ConcurrentHashMap<>();

	@GetMapping("/v1/{memberId}")
	@ApiOperation(value = "Finds Member by ID", 
	notes = "Provide an ID to look up specific member", 
	response = Member.class)
	public Member getMember(@PathVariable int memberId) {
		return members.get(memberId);
	}

	@GetMapping("/v1")
	public List<Member> getAllMembers() {
		return new ArrayList<Member>(members.values());
	}

	@PostMapping("/v1")
	public Member addMember(@RequestBody Member member) {
		members.put(member.getMemberId(), member);
		return member;
	}

}
