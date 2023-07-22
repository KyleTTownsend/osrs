public class textHandler {
	public void startText(int ID) {
client c = (client) server.playerHandler.players[ID];
c.sendQuest("Renegadepkz Highscores", 6399);
c.sendQuest("  Renegadepkz", 640);
c.sendQuest(" Info about "+c.playerName+"", 663);
c.sendQuest("@or1@Players online: @gre@"+PlayerHandler.getPlayerCount()+" ", 7332);
c.sendQuest("@or1@Uptime: @gre@"+ (server.uptime / 2 / 60) +" Mins", 7333);
c.sendQuest("@or1@Combat: @gre@"+c.combatLevel+"", 7334);
if(c.donator == 0){
c.sendQuest("@or1@Donator: @red@No", 7336);
}
if(c.donator == 1){
c.sendQuest("@or1@Donator: @gre@Yes", 7336);
}
c.sendQuest("@or1@Name: @gre@"+c.playerName+" ", 7383);

if(c.playerRights == 1){
c.sendQuest("@or1@Rank: @gre@Moderator", 7338);
}
if(c.playerRights == 2){
c.sendQuest("@or1@Rank: @gre@Administrator", 7338);
}
if(c.playerRights == 3){
c.sendQuest("@or1@Rank: @gre@Owner", 7338);
}
if(c.playerRights == 4){
c.sendQuest("@or1@Rank: @gre@Hidden Owner", 7338);
}
if(c.playerRights == 0){
c.sendQuest("@or1@Rank: @gre@Normal Player", 7338);
}
if(c.playerName.equalsIgnoreCase("Jimmy")){
c.sendQuest("@or1@Rank: @gre@Owner", 7338);
}
c.sendQuest("@or1@Pest Control: @gre@"+c.pcPoints+"", 7340);
c.sendQuest("@or1@Assaults: @gre@"+c.assaultKills+"", 7346);
c.sendQuest("@or1@---------------------", 7341);
c.sendQuest("", 15239);
c.sendQuest("", 15241);
c.sendQuest("", 15240);
c.sendQuest("", 15242);
c.sendQuest("", 15243);
c.sendQuest("", 7342);
c.sendQuest("", 7337);
c.sendQuest("", 7343);
c.sendQuest("", 7335);
c.sendQuest("", 7344);
c.sendQuest("", 7345);
c.sendQuest("", 7347);
c.sendQuest("", 7348);

c.sendQuest("Renegadepkz! Highscores", 6399);
c.sendQuest("   Renegadepkz", 640);
c.sendQuest("", 15241);
c.sendQuest("", 15240);
c.sendQuest("", 15242);
c.sendQuest("", 15243);
c.sendQuest("", 7342);
c.sendQuest("", 7337);
c.sendQuest("", 7343);
c.sendQuest("", 7335);
c.sendQuest("", 7344);
c.sendQuest("", 7345);
c.sendQuest("", 7347);
c.sendQuest("", 7348);
c.sendQuest("Please enter your PIN using the buttons below.", 14920);
c.sendQuest("First click the FIRST digit", 15313);
c.sendQuest("1", 14883);
c.sendQuest("2", 14884);
c.sendQuest("3", 14885);
c.sendQuest("4", 14886);
c.sendQuest("5", 14887);
c.sendQuest("6", 14888);
c.sendQuest("7", 14889);
c.sendQuest("8", 14890);
c.sendQuest("9", 14891);
c.sendQuest("0", 14892);
c.sendQuest("I don't know it.", 14921);
c.sendQuest("Exit", 14922);
c.sendQuest("", 15075);
c.sendQuest("", 15076);
c.sendQuest("", 15176);
c.sendQuest("", 15171);
c.sendQuest("", 15079);
c.sendQuest("", 15080);
if(c.bankPin != -1){
    c.sendQuest("@gre@Set", 15105);
}
if(c.bankPin == -1){
    c.sendQuest("@red@NONE", 15105);
}
c.sendFrame126("The Bank of Renegadepkz - Deposit Box", 7421);
c.sendQuest("The Bank of Renegadepkz - Bank Pin", 14923);
c.sendQuest("", 15107);
c.sendQuest("Set Pin", 15078);
c.sendQuest("Delete Pin", 15082);
c.sendQuest("", 15107);
c.sendQuest("Set Pin", 15078);
c.sendQuest("The Bank of Renegadepkz",5383);
c.sendQuest("",4439);
c.sendQuest("Pest control", 10361);
c.sendQuest("Current points:", 10378);
c.sendQuest("Drag wep set", 10374);
c.sendQuest("Void Knight", 10375);
c.sendQuest("50 points", 10376);
c.sendQuest("200 point", 10377);
c.sendQuest("30 ice arrows", 6557);
c.sendQuest("1 point", 6559);
c.sendQuest("Bandos godsword", 16159);
c.sendQuest("         250 points", 16160);
c.sendQuest("Close Window", 15949);//Close Text
c.sendQuest("      acrylicx", 15950);//Title
c.sendQuest("", 15960);//Under Title
c.sendQuest("", 15959);//Beside ^
c.sendQuest("", 15961);//Beside ^
c.sendQuest("Client [V17]: Forums, Server chat section", 15951);//Bottom banner- top line
c.sendQuest("", 15955);//top line
c.sendQuest("", 15953);//top line
c.sendQuest("", 15958);//top line
c.sendQuest("", 15952);//Bottom banner- bottom line
c.sendQuest("         Latest update: Full magic", 15956);//bottom line
c.sendQuest("", 15954);//bottom line
c.sendQuest("", 15957);//bottom line
c.sendQuest("Skilling Area", 7457);
c.sendQuest("Train Skills", 7458);
    c.sendQuest("Thievining place", 13089);
    c.sendQuest("Visit the land of monkeys", 13090);
    c.sendQuest("@gre@0/0", 13093);
    c.sendQuest("@gre@0/0", 13094);

    c.sendQuest("Runecrafting", 16251);
    c.sendQuest("Orbs to points", 1259);
    c.sendQuest("Changes held orbs into points", 1260);
    c.sendQuest("Orbs to more points", 15879);
    c.sendQuest("Changes held orbs into more points", 15880);
    c.sendQuest("Home", 1300);
    c.sendQuest("Teleport to Home", 1301);
    c.sendQuest("Home", 13037);
    c.sendQuest("Teleport to Home", 13038);
    c.sendQuest("@gre@0/0", 13042);
    c.sendQuest("@gre@0/0", 13043);
    c.sendQuest("@gre@0/0", 13044);
    c.sendQuest("PKing", 1325);
    c.sendQuest("PK here", 1326);
    c.sendQuest("PKing", 13047);
    c.sendQuest("PK here", 13048);
    c.sendQuest("@gre@0/0", 13051);
    c.sendQuest("@gre@0/0", 13052);
    c.sendQuest("Beginning training", 1350);
    c.sendQuest("Training for lower levels", 1351);
    c.sendQuest("Beginning training", 13055);
    c.sendQuest("Training for lower levels", 13056);
    c.sendQuest("@gre@0/0", 13059);
    c.sendQuest("@gre@0/0", 13060);
    c.sendQuest("Catherby", 1382);
    c.sendQuest("Do fishing here", 1383);
    c.sendQuest("Catherby", 13063);
    c.sendQuest("Do fishing here", 13064);
    c.sendQuest("@gre@0/0", 13067);
    c.sendQuest("@gre@0/0", 13068);
    c.sendQuest("Monster tele", 1415);
    c.sendQuest("Fight with different monsters", 1416);
    c.sendQuest("Monster tele", 13071);
    c.sendQuest("Fight with different monsters", 13072);
    c.sendQuest("@gre@0/0", 13076);
    c.sendQuest("@gre@0/0", 13077);
    c.sendQuest("@gre@0/0", 13078);
    c.sendQuest("Minigame tele", 1454);
    c.sendQuest("Play awesome minigames", 1455);
    c.sendQuest("Minigame tele", 13081);
    c.sendQuest("Jimmy says Have Fun!", 13082);
    c.sendQuest("@gre@0/0", 13085);
    c.sendQuest("@gre@0/0", 13086);

    c.sendQuest("", 4297);
    c.sendQuest("", 4298);
    c.sendQuest("", 4299);
    c.sendQuest("", 4300);
    c.sendQuest("", 4301);
    c.sendQuest("", 4302);
    c.sendQuest("", 4303);
    c.sendQuest("", 4304);
    c.sendQuest("", 14872);
    c.sendQuest("", 664);
    c.sendQuest("", 8971);
    c.sendFrame126("", 6570);
    c.sendFrame126("", 6572);
    c.sendFrame126("", 6664);
		c.sendQuest("Using this will send a notification to all online mods",
				5967);
		c.sendQuest(
				"@yel@Then click below to indicate which of our rules is being broken.",
				5969);
		c.sendQuest("4: Bug abuse (includes noclip)", 5974);
		c.sendQuest("5: Staff impersonation", 5975);
		c.sendQuest("6: Monster luring or abuse", 5976);
		c.sendQuest("8: Item Duplication", 5978);
		c.sendQuest("10: Misuse of yell channel", 5980);
		c.sendQuest("12: Possible duped items", 5982);
	}
} // ends textHandler