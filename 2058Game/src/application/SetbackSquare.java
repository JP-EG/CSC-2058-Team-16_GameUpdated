package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SetbackSquare {

	private List<Setback> setbacks;

	public SetbackSquare() {

		setbacks = new ArrayList<>();

		setbacks.add(
				new Setback(
						1,
						"Eqipment break down",
						"Deduct 4 Equipment Efficiency Points from the player's inventory.",
						"Consequence: Display a message that construction tasks are delayed. For example,\n"
								+ "Equipment breakdown has caused a delay in construction. Please allocate additional time for task completion.",
						"Equipment Efficiency Points",
						4));
		setbacks.add(
				new Setback(
						2,
						"Budget Cutback",
						"Deduct $3,000 from the player's budget",
						"Consequence: Inform the player that their budget is reduced, \n"
								+ "limiting spending on equipment procurement tasks. Adjust your spending accordingly.",
						"Budget",
						300));
		setbacks.add(
				new Setback(
						3,
						"Weather Delay",
						"Deduct 2 Time Units from the player's inventory.",
						"Consequence: Communicate that weather-related delays will extend the time required for task completion.",
						"Time Units",
						2));
		setbacks.add(
				new Setback(
						4,
						"Technical Difficulties",
						"Deduct 2 Technical Expertise (Resource) from the player's inventory.",
						"Consequence: Inform the player that additional technical expertise is required \n"
								+ " to ensure the proper connection of the solar system.",
						"Technical Expertise",
						2));
		setbacks.add(
				new Setback(
						5,
						"Community Dispute",
						"Deduct 2 Community Engagement (Resource) from the player's inventory.",
						"Consequence: Let the player know that unresolved community disputes can\n"
								+ " lead to a decrease in community trust points.",
						"Community Engagement",
						2));
		setbacks.add(
				new Setback(
						6,
						"Material Shortage",
						"Deduct 2 Materials Units from the player's inventory.",
						"Consequence: Communicate that resource shortages affect construction progress and may delay task completion.",
						"Material Units",
						2));

	}

	public Setback randomSetback() {
		Random random = new Random();
		int randomIndex = random.nextInt(setbacks.size());

		return setbacks.get(randomIndex);
	}

}
