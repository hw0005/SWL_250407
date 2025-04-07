package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.domain.BadgeCard;
import java.util.List;


public interface BadgeCardRepository extends JpaRepository<BadgeCard, Long> {
	List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(final Long userId);
}
