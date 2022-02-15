package com.ssafy.db.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssafy.db.entity.User;
import com.ssafy.db.entity.meeting.Meeting;

/**
 * 미팅 모델 관련 디비 쿼리 생성을 위한 JPA Query Method 인터페이스 정의.
 */
@Repository
public interface MeetingRepository extends JpaRepository<Meeting, Integer> {
	Optional<Meeting> findByUrl(String url);
}