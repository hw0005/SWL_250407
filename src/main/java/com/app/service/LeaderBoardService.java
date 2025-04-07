package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.domain.LeaderBoardRow;
import com.app.repository.ScoreCardRepository;

@Service
public class LeaderBoardService {
	private final ScoreCardRepository scoreCardRepository;
	
	LeaderBoardService(ScoreCardRepository scoreCardRepository) {
		this.scoreCardRepository = scoreCardRepository;
	}
	
	public List<LeaderBoardRow> getCurrentLeaderBoard() {
		return scoreCardRepository.findFirst10();
	}
}
