package com.app.domain;

import java.util.Collections;
import java.util.List;

import com.app.common.Badge;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class GameStats {
	private final Long userId;
	private final int score;
	private final List<Badge> badges;
	
	public static GameStats emptyStats(final Long userId) {
		return new GameStats(userId, 0, Collections.emptyList());
	}
	
	public List<Badge> getBadges() {
		return Collections.unmodifiableList(badges);
	}
	
	
}
