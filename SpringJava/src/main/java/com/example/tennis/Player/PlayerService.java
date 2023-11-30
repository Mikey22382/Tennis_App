package com.example.tennis.Player;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class PlayerService {
    @GetMapping
	public List<Player> getPlayers() {
		return List.of(
            new Player("Aidan", 3.0)
        );
	}
}
