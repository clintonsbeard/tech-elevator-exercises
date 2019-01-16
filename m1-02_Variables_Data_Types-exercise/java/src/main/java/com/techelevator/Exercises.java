package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);
		
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		
		int raccoonsPlayingInWoods = 3;
		int raccoonsThatLeft = 2;
		int raccoonsLeftInWoods = raccoonsPlayingInWoods - raccoonsThatLeft;
		System.out.println(raccoonsLeftInWoods);

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfFlowersWithoutBees = numberOfFlowers - numberOfBees;
		System.out.println(numberOfFlowersWithoutBees);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int pigeonsAlreadyEating = 1;
		int newPigeonsEating = 1;
		int pigeonsEatingNow = pigeonsAlreadyEating + newPigeonsEating;
		System.out.println(pigeonsEatingNow);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		
		int owlsAlreadyOnFence = 3;
		int newOwlsOnFence = 2;
		int owlsOnFenceNow = owlsAlreadyOnFence + newOwlsOnFence;
		System.out.println(owlsOnFenceNow);

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		
		int beaversCurrentlyBuildingDam = 2;
		int beaversThatStopBuildingToSwim = 1;
		int totalBeaversBuildingDam = beaversCurrentlyBuildingDam - beaversThatStopBuildingToSwim;
		System.out.println(totalBeaversBuildingDam);

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		
		int toucansAlreadyOnTreeLimb = 2;
		int newToucansOnTreeLimb = 1;
		int toucansOnTreeLimbNow = toucansAlreadyOnTreeLimb + newToucansOnTreeLimb;
		System.out.println(toucansOnTreeLimbNow);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		
		int numberOfSquirrelsInTree = 4;
		int numberOfNutsInTree = 2;
		int numberOfSquirrelsWithoutNuts = numberOfSquirrelsInTree - numberOfNutsInTree;
		System.out.println(numberOfSquirrelsWithoutNuts);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double quarterMoney = 0.25D;
		double dimeMoney = 0.10D;
		double nickelMoney = 0.05D;
		double totalMoneyAmount = quarterMoney + dimeMoney + (2.0 * nickelMoney);
		System.out.println(totalMoneyAmount);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		
		int mrsBrierClassMuffinsBaked = 18;
		int mrsMacAdamsClassMuffinsBaked = 20;
		int mrsFlanneryClassMuffinsBaked = 17;
		int totalClassMuffinsBaked = mrsBrierClassMuffinsBaked + mrsMacAdamsClassMuffinsBaked + mrsFlanneryClassMuffinsBaked;
		System.out.println(totalClassMuffinsBaked);		

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		double costOfYoyo = 0.24D;
		double costOfWhistle = 0.14D;
		double totalSpentOnToys = costOfYoyo + costOfWhistle;
		System.out.println(totalSpentOnToys);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int inchesOfSnowAtMrsHiltsHouse = 29;
		int inchesOfSnowAtBrecknockElementarySchool = 17;
		int howMuchMoreSnowAtHouseThanSchool = inchesOfSnowAtMrsHiltsHouse - inchesOfSnowAtBrecknockElementarySchool;
		System.out.println(howMuchMoreSnowAtHouseThanSchool);

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		int moneyInWallet = 10;
		int costOfToyTruck  = 3;
		int costOfPencil = 2;
		int moneyLeftInWallet = moneyInWallet - costOfToyTruck - costOfPencil;
		System.out.println(moneyInWallet);

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		
		int amountOfMarblesCollected = 16;
		int amountOfMarblesLost = 7;
		int amountOfMarblesNow = amountOfMarblesCollected - amountOfMarblesLost;
		System.out.println(amountOfMarblesNow);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		
		int amountOfSeashellsHad = 19;
		int amountOfSeashellsWanted = 25;
		int amountOfSeashellsNeeded = amountOfSeashellsWanted - amountOfSeashellsHad;
		System.out.println(amountOfSeashellsNeeded);	
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		
		int totalAmountOfBalloons = 17;
		int amountOfRedBalloons = 8;
		int amountOfGreenBalloons = totalAmountOfBalloons - amountOfRedBalloons;
		System.out.println(amountOfGreenBalloons);	

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int amountOfBooksAlreadyOnShelf = 38;
		int amountOfNewBooks = 10;
		int amountOfBooksNow = amountOfBooksAlreadyOnShelf + amountOfNewBooks;
		System.out.println(amountOfBooksNow);	

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		
		int amountOfLegsOnBee = 6;
		int amountOfBees = 8;
		int totalAmountOfBeesLegs = amountOfLegsOnBee * amountOfBees;
		System.out.println(totalAmountOfBeesLegs);	

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		
		double costOfIceCreamCone = 0.99D;
		double costOfTwoIceCreamCones = 0.99D * 2;
		System.out.println(costOfTwoIceCreamCones);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		
		int numberOfRocksOwned = 64;
		int numberOfRocksWanted = 125;
		int numberOfRocksNeeded = numberOfRocksWanted - numberOfRocksOwned;
		System.out.println(numberOfRocksNeeded);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		
		int numberOfMarblesOwned = 38;
		int numberOfMarblesLost = 15;
		int numberOfMarblesLeft = numberOfMarblesOwned - numberOfMarblesLost;
		System.out.println(numberOfMarblesLeft);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		
		int numberOfMilesToConcert = 78;
		int numberOfMilesAlreadyDriven = 32;
		int numberOfMilesLeft = numberOfMilesToConcert - numberOfMilesAlreadyDriven;
		System.out.println(numberOfMilesLeft);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		int minutesShovelingSnowSaturday = 90;
		int minutesShovelingSnowSunday = 45;
		int totalMinutesShovelingSnow = minutesShovelingSnowSaturday + minutesShovelingSnowSunday;
		System.out.println(totalMinutesShovelingSnow);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		
		int numberOfHotDogs = 6;
		double costOfHotDogs = 0.50D;
		double totalCostOfHotDogs = numberOfHotDogs * costOfHotDogs;
		System.out.println(totalCostOfHotDogs);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		
		double amountOfMoney = 0.50D;
		double costOfOnePencil = 0.07D;
		double amountOfPossiblePencils = amountOfMoney / costOfOnePencil;
		System.out.println(amountOfPossiblePencils);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		
		int totalNumberOfButterfliesSeen = 33;
		int orangeButterfliesSeen = 20;
		int redButterfliesSeen = totalNumberOfButterfliesSeen - orangeButterfliesSeen;
		System.out.println(redButterfliesSeen);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyGivenToClerk = 1.00D;
		double costOfCandy = 0.54D;
		double amountOfChange = moneyGivenToClerk - costOfCandy;
		System.out.println(amountOfChange);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		
		int treesAlreadyInBackyard = 13;
		int newTreesPlanted = 12;
		int totalTreesInBackyard = treesAlreadyInBackyard + newTreesPlanted;
		System.out.println(totalTreesInBackyard);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int hoursInDay = 24;
		int daysUntilGrandma = 2;
		int hoursUntilGrandma = hoursInDay * daysUntilGrandma;
		System.out.println(hoursUntilGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		
		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalPiecesOfGum = numberOfCousins * piecesOfGumPerCousin;
		System.out.println(totalPiecesOfGum);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		double amountOfMoneyInWallet = 3.00D;
		double costOfCandyBar = 1.00D;
		double changeFromCandyBar = amountOfMoneyInWallet - costOfCandyBar;
		System.out.println(changeFromCandyBar);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		
		int boatsOnLake = 5;
		int peoplePerBoat = 3;
		int peopleInBoats = boatsOnLake * peoplePerBoat;
		System.out.println(peopleInBoats);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		
		int numberOfLegosOwned = 380;
		int numberOfLegosLost = 57;
		int numberOfLegosNow = numberOfLegosOwned - numberOfLegosLost;
		System.out.println(numberOfLegosNow);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		
		int muffinsBaked = 35;
		int muffinsDesired = 83;
		int muffinsStillNeeded = muffinsDesired - muffinsBaked;
		System.out.println(muffinsStillNeeded);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		
		int numberOfCrayonsOwnedByWilly = 1400;
		int numberOfCrayonsOwnedByLucy = 290;
		int howManyMoreCrayonsDoesWillyOwn = numberOfCrayonsOwnedByWilly - numberOfCrayonsOwnedByLucy;
		System.out.println(howManyMoreCrayonsDoesWillyOwn);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		
		int numberOfStickersPerPage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickersOnPages = numberOfStickersPerPage * numberOfPages;
		System.out.println(totalNumberOfStickersOnPages);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		
		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = numberOfCupcakes / numberOfChildren;
		System.out.println(numberOfCupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		
		int numberOfCookies = 47;
		int numberOfCookiesPerJar = 6;
		int numberOfCookiesWithoutJar = numberOfCookies % numberOfCookiesPerJar;
		System.out.println(numberOfCookiesWithoutJar);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		
		int numberOfCroissants = 59;
		int numberOfNeighbors = 8;
		int numberOfExtraCroissants = numberOfCroissants % numberOfNeighbors;
		System.out.println(numberOfExtraCroissants);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int 

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
