import java.util.*;

class Solution {
	public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[player.length]; // player 길이 만큼 answer 생성

		HashMap<String, Integer> mappedByPlayer = new HashMap<>();
		HashMap<Integer, String> mappedByRank = new Hashmap<>();

// mappedByPlayer, mappedByRank 초기화
		for(int i = 0; i < players.length; i++) {
			mappedByPlayer.put(players[i], i);
			mappedByRank.put(i, players[i]);
		}

		for(int i = 0; i < callings.length; i++) {
//callings의 배열 인덱스와 그에 따른 player 추출.
			int currentRank = mappedByPlayer.get(callings[i]);
			String player = mappedByRank.get(currentRank);

//callings[i] 앞의 player 
			String frontPlayer = mappedByRank.get(currentRank - 1);

// swap
			mappedByPlayer.put(player, currentRank - 1);
			mappedByPlayer.put(frontPlayer, currentRank);

			mappedByRank.put(currentRank - 1, player);
			mappedByRank.put(currentRank, currentPlayer);
		}

		for(int i = 0; i < answer.length; i++) {
			answer[i] = mappedByPlayer.get(i);	
		}

		return answer;
	}
}