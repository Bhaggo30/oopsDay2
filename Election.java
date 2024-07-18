package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class Election {
    // Using a map to store candidates with their votes
    private Map<String, Integer> candidates;

    public Election() {
        candidates = new HashMap<>();
    }

    // Add a new candidate to the election
    public void addCandidate(String name) {
        name = name.toLowerCase();
        if (!candidates.containsKey(name)) { // if the candidate does not exist
            candidates.put(name, 0);
            System.out.println("Candidate " + name + " added successfully.");
        } else {
            System.out.println("Candidate " + name + " already exists.");
        }
    }

    // Allow a voter to cast their vote for a candidate
    public void castVote(String name) {
        name = name.toLowerCase();
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
            System.out.println("Vote cast for " + name + ".");
        } else {
            System.out.println("Candidate " + name + " does not exist.");
        }
    }

    // Display total votes received by each candidate
    public void displayVotes() {
        System.out.println("Votes received by each candidate:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    // Show all candidates in the election
    public void showAllCandidates() {
        System.out.println("Candidates:");
        for (String candidate : candidates.keySet()) {
            System.out.println(candidate);
        }
    }

    // Declare the winner of the election
    public void declareWinner() {
        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        if (winner != null) {
            System.out.println("The winner of the election is " + winner + " with " + maxVotes + " votes.");
        } else {
            System.out.println("No votes cast in the election.");
        }
    }
}
