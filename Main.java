import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Main implements Runnable, ActionListener{
  int card = 52;
  int cCount;
    int[] cap = new int[card];
    Random cardChoice = new Random();
      int randCard;
        int randCard2; 
      int randCard3;
      int randCard4;
      int randCard5;
      int randCard6;
      int randCard7;
      int randCard8;
      int randCard9;
      int randCard10;
      int randCard11;
  // Class Variables  
  JPanel mainPanel;
  JLabel bust;
  JLabel blackJack;
  JLabel win;
  JLabel push;
  JButton play;
  JButton hit;
  JButton doubleCurrent;
  JButton stay;
  JTextArea dealerCard;
  JTextArea userCard;
  JTextArea askBet;
  JTextField betAmmount;
  JTextField playerMoney;
  JTextArea playerMoneyInput; 

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("BlackJack");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    mainPanel = new JPanel();
    mainPanel.setLayout(null);
    frame.add(mainPanel);
    // Adding in all the buttons that are needed to play BlackJack
play = new JButton("play");
play.setBounds(320, 10, 150, 40);
play.addActionListener(this);
play.setActionCommand("play");
mainPanel.add(play);

// adds in the button to give you one more card
hit = new JButton("Hit");
hit.setBounds(320, 500, 150, 40);
hit.addActionListener(this);
hit.setActionCommand("hit");
mainPanel.add(hit);

// adds in the button to get another card and double your bet
doubleCurrent = new JButton("Double");
doubleCurrent.setBounds(100, 500, 150, 40);
doubleCurrent.addActionListener(this);
doubleCurrent.setActionCommand("doubleCurrent");
mainPanel.add(doubleCurrent);

// adds the button to allow the user to end their turn and not take another card
stay = new JButton("Stay");
stay.setBounds(540, 500, 150, 40);
stay.addActionListener(this);
stay.setActionCommand("stay");
mainPanel.add(stay);

// Adding the text area for the values of the user and dealers cards
dealerCard = new JTextArea("");
dealerCard.setBounds(320, 110, 150, 40);
mainPanel.add(dealerCard);


userCard = new JTextArea("");
userCard.setBounds(320, 400, 150, 40);
mainPanel.add(userCard);

// adding how much the user would like to bet on the game
askBet = new JTextArea("How much would you like to bet?");
askBet.setBounds(300, 200, 215, 20);
mainPanel.add(askBet);

betAmmount = new JTextField();
betAmmount.setBounds(320, 260, 150, 40);
mainPanel.add(betAmmount);

playerMoney = new JTextField();
playerMoney.setBounds(100, 260, 150, 40);
playerMoney.addActionListener(this);
playerMoney.setActionCommand("moneyP");
mainPanel.add(playerMoney);

playerMoneyInput = new JTextArea("How much money do you have?");
playerMoneyInput.setBounds(75, 200, 200, 20);
mainPanel.add(playerMoneyInput);

}
// method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
  int cCount = 2;
  
  for(int i = 0; i < cCount ; i++){

if(command.equals("Play")){
cCount = 2;
}
if(command.equals("hit")){
cCount = cCount + 1;
} if(command.equals("doubleCurrent")){
  cCount = cCount + 1;
} if(command.equals("stay")){
  cCount = cCount;
}

}
}

  
  public void cards(ActionEvent e){
    String command = e.getActionCommand();
    //creating a random number gen for blackJack
    int card = 52;
    int[] cap = new int[card];
     for(int i = 0; i < cap.length ; i++){
      //assigning each number of the array a numerical value based off of BlackJack rules
      cap[1] = 11;
      cap[2] = 2;
      cap[3] = 3;
      cap[4] = 4;
      cap[5] = 5;
      cap[6] = 6;
      cap[7] = 7;
      cap[8] = 8;
      cap[9] = 9;
      cap[10] = 10;
      cap[11] = 10;
      cap[12] = 10;
      cap[13] = 10;
      cap[14] = 11;
      cap[15] = 2;
      cap[16] = 3;
      cap[17] = 4;
      cap[18] = 5;
      cap[19] = 6;
      cap[20] = 7;
      cap[21] = 8;
      cap[22] = 9;
      cap[23] = 10;
      cap[24] = 10;
      cap[25] = 10;
      cap[26] = 10;
      cap[27] = 11;
      cap[28] = 2;
      cap[29] = 3;
      cap[30] = 4;
      cap[31] = 5;
      cap[32] = 6;
      cap[33] = 7;
      cap[34] = 8;
      cap[35] = 9;
      cap[36] = 10;
      cap[37] = 10;
      cap[38] = 10;
      cap[39] = 10;
      cap[40] = 11;
      cap[41] = 2;
      cap[42] = 3;
      cap[43] = 4;
      cap[44] = 5;
      cap[45] = 6;
      cap[46] = 7;
      cap[47] = 8;
      cap[48] = 9;
      cap[49] = 10;
      cap[50] = 10;
      cap[51] = 10;
      cap[52] = 10;
     }

     // this is setting up the different values of the cards on the table
      Random cardChoice = new Random();
      int randCard = cardChoice.nextInt(52);
      int randCard2 = cardChoice.nextInt(52);
      int randCard3 = cardChoice.nextInt(52);
      int randCard4 = cardChoice.nextInt(52);
      int randCard5 = cardChoice.nextInt(52);
      int randCard6 = cardChoice.nextInt(52);
      int randCard7 = cardChoice.nextInt(52);
      int randCard8 = cardChoice.nextInt(52);
      int randCard9 = cardChoice.nextInt(52);
      int randCard10 = cardChoice.nextInt(52);
      int randCard11 = cardChoice.nextInt(52);
     
      if( command.equals("play") ){
   
      userCard.setText("" + cap[randCard] + cap[randCard2]);
      dealerCard.setText("" + cap[randCard7] + cap[randCard8]);
}
if(command.equals("Hit")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3]);

  // this section is for everything that can happen after hit is pressed
  if(command.equals("Hit")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3] + cap[randCard4]);
  if (command.equals("Hit")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3] + cap[randCard4] + cap[randCard5]);
  if(command.equals("Double")){
    userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3] + cap[randCard4] + cap[randCard5]);
  }
 if(command.equals("Double")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3] + cap[randCard4]);
  if (command.equals("Hit")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3] + cap[randCard4] + cap[randCard5]);
  if(command.equals("Double")){
    userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3] + cap[randCard4] + cap[randCard5]);
  if(command.equals("Stay")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3]);
  }
 }
  }
  }
}
}
if(command.equals("Double")){
  userCard.setText("" + cap[randCard] + cap[randCard2] + cap[randCard3]);
    }
    if(command.equals("Stay")){
  userCard.setText("" + cap[randCard] + cap[randCard2]);
    }
}
  }
  }
  public void dealerAi(){
    //Setting up the rules that the dealer follows
   String value = dealerCard.getText();
int valueC = Integer.parseInt(value);
String value2 = userCard.getText();
int valueP = Integer.parseInt(value2);
  
    for(int i = 0; i < 11 ; i++){
if (valueP == valueC){
  userCard.setText("You tied");
}
else if (valueC == 21){
 dealerCard.setText("" + cap[randCard7] + cap[randCard8]);
}
  if (valueP >= 20){
 for(int i2 = 1; i2< 11 ; i2++){
  if (valueC <= 16){
dealerCard.setText("" + cap[randCard7] + cap[randCard8] + cap[randCard9]);
if(valueC <= 16){
  dealerCard.setText("" + cap[randCard7] + cap[randCard8] + cap[randCard9] + cap[randCard10]);
  if (valueC >= 22){
    dealerCard.setText("" + cap[randCard7] + cap[randCard8] + cap[randCard9] + cap[randCard10]);
  }
}
}
 else if (valueC <= 20){
dealerCard.setText("" + cap[randCard7] + cap[randCard8]);
}
 else if (valueC >= 22){
dealerCard.setText("" + cap[randCard7] + cap[randCard8] + cap[randCard9]);
}
    
    else if (valueP <= 22){
      userCard.setText("You lose");
    } 
    else if (valueP == 21){
      userCard.setText("You win");
    }
     else if(valueC > valueP){
      userCard.setText("You lose");
    }
    else if (valueC < valueP){
      userCard.setText("You win");
    }
else if (cCount == 5){
  userCard.setText("You win");
}
    }
  }
  if (valueC >= 22){
    cap[1] = 1;
    cap[14] = 1;
    cap[27] = 1;
    cap[40] = 1;
  }
  if (valueP >= 22){
    cap[1] = 1;
    cap[14] = 1;
    cap[27] = 1;
    cap[40] = 1;
  }
  }

  }
  public void playerMoneyAmmount(ActionEvent e){
    String command = e.getActionCommand();
    //this section will calculate how much money the player has if they win or lose
 String userCard3 = userCard.getText();
    String firstMoney = playerMoney.getText();
    String betMoney = askBet.getText();
    int playerM = Integer.parseInt(firstMoney);
    int betM = Integer.parseInt(betMoney);

    if(userCard3 == "You lose"){
      int lose = betM - playerM;
      playerMoney.setText("" + lose);
    }
    else if (userCard3 == "You win"){
      int win = betM + playerM;
      playerMoney.setText("" + win);
    }
    else if (userCard3 == "You tied"){
      int tie = betM;
      playerMoney.setText("" + tie);
    }
    else if (betM > playerM){
      playerMoney.setText("You don't have that much money");
    }
    else if (betM == 0){
      playerMoney.setText("You have no more money");
    }
  
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }

     
  



