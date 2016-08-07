package myservermod;

import com.youthdigital.servermod.game.*;

public class Game extends TeamData {
  
  public Game(ChatColors teamColor, String teamNameDisplay) {
    super("All Players", teamColor, teamNameDisplay);
  }
  
  public static void setupGameRules() {
    
    GameInfo.setServerDescription("A  Awesome Minecraft Server by Mallory");
    GameInfo.addToWhitelist("Beanie200, Dr1230, Adsion200, BenCloneTrooper");
    GameInfo.addToOPs("Beanie200");
    
    GameInfo.disableMobSpawning();
    GameInfo.disableBlockBreaking();
    
    GameInfo.setTime(0);
    GameInfo.setDifficulty(2);
    GameInfo.isRaining(false);
    GameInfo.setPVP(true);
    
  }
  
  @Override
  public void onUpdate() {
    
  }
  
  @Override
  public void onResetGameToLobby() {
    
  }
  
  @Override
  public void onStartGame() {
    
  }
  
}