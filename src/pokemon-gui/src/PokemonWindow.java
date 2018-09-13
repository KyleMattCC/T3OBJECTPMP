

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * @author Winfred Villaluna, Birgham Serrano, Kyle Chua
 * This class refers to the holder of pokemon data 
 */
public class PokemonWindow extends JFrame{
	/**
	 * Contains the window dimension of the game.
	 */
    private int windowDimension = 528;
	/**
	 * Contains the size of 1 unit tile
	 */
    private int tileSize = windowDimension / 11;
	/**
	 * Contains the size of the frame's height.
	 */
    private int frameDimension = windowDimension + tileSize/2;
	/**
	 * Contains the character size.
	 */
    private int characterSize = 42;
	/**
	 * Contains the movement unit of the player.
	 */
    private int movementDistance = tileSize;
	/**
	 * Contains the increase of the pokemon's movement along the x axis when caught
	 */
    int x1 = tileSize * 7;
	/**
	 * Contains the increase of the pokemon's movement along the y axis when caught
	 */
    int y1 = tileSize * 3 + 20;
	/**
	 *
	 */
    private int itemSize = 0;
	/**
	 * Contains the x-coordinate of the player in the seaty
	 */
    private	int seatyPosX;
	/**
	 * Contains the y-coordinate of the player in the seaty
	 */
    private	int seatyPosY;
	/**
	 * Counter variable
	 */
    private int i = 0;
	/**
	 * Counter variable
	 */
    private int j = 0;
	/**
	 * Label for the background image.
	 */
    private JLabel backgroundLabel;
	/**
	 * Holder of the character sprite.
	 */
    private JLabel characterLabel;
	/**
	 * Holder of the character sprite.
	 */
    private JLabel characterLabel1;
	/**
	 * Holder of the moves label.
	 */
    private JLabel movesLabel;
	/**
	 * Holder of the casts label.
	 */
    private JLabel castsLabel;
	/**
	 * Holder of the fame label.
	 */
    private JLabel fameLabel;
	/**
	 * Holder of the cash label.
	 */
    private JLabel cashLabel;
	/**
	 * Holder of the warning label.
	 */
    private JLabel warningLabel;
	/**
	 * Holder of the badge label.
	 */
     private JLabel badgeLabel;
	/**
	 * Holder of the day label.
	 */
    private JLabel dayLabel;
	/**
	 * Holder of the status label.
	 */
    private JLabel statusLabel;
	/**
	 * Holder of the map image.
	 */
    private JLabel mapLabel;
	/**
	 * Temporary map holder.
	 */
    private JLabel mapLabel1;
	/**
	 * Holder of the simulation backgrouund.
	 */
    private JLabel simulationLabel;
	/**
	 * Holder of the simulation cover.
	 */
    private JLabel simulLabel;
	/**
	 * Holder of the fishing animation image.
	 */
    private JLabel fisherLabel;
	/**
	 * Holder of the pokemon image.
	 */
    private JLabel pokemonLabel;
	/**
	 * Holder of the sign label..
	 */
    private JLabel signLabel;
	/**
	 * Holder of the blurred map images.
	 */
    private JLabel blurLabel;
	/**
	 * Holder of the menu image.
	 */
    private JLabel menuLabel;
	/**
	 * Holder of the shop image.
	 */
    private JLabel shopLabel;
	/**
	 * Holder of the store image.
	 */
    private JLabel storeLabel;
	/**
	 * Holder of the yes/no label.
	 */
    private JLabel yesNoLabel;
	/**
	 * Holder of the textfield area.
	 */
    
    private JLabel  tackleLabel;
    private JLabel  rodLabel;
    private JLabel  lineLabel;
    private JLabel  lureLabel;
    private JLabel  reelLabel;
    private JLabel  boatLabel;
    private JLabel engineLabel;
    
    
    private JTextField textField;
	/**
	 * Holder of the image icons.
	 */
    private ImageIcon image;
	/**
	 * Holder of the x coordinate.
	 */
    
    
    private int x;
	/**
	 * Holder of the y coordinate.
	 */
    private int y;
	/**
	 * Holder of the frames to be shown in map.
	 */
    private int frame = 1;
	/**
	 * Holder of the textures to be shown in map.
	 */
    private int texture = 1;
	/**
	 * Delays things.
	 */
    private int stopper = 1;
	/**
	 * Another delayer.
	 */
    private int stopper1 = 1;
	/**
	 * Holds the maximum casts.
	 */
    private int casts;
	/**
	 * Holds the maximum moves.
	 */
    private double moves;
	/**
	 * Holds the fame.
	 */
    private int fame;
	/**
	 * Holds the cash at hand..
	 */
    private long cash;
	/**
	 * Holds the day counter.
	 */
    private int day = 1;
	/**
	 * Holds the speed in seconds. 
	 */
    private int s = 5;
	/**
	 * Holds the options possible.
	 */
    int option = 0;
	/**
	 * Holds the value of 1. 
	 */
    private int first = 1;
	/*
	 * Holds a destination place.
	 */ 
    private String srcFolder = "images/";
	/*
	 * Holds a destination place.
	 */ 
    private String subFolder = "";
	/*
	 * Holds a destination place.
	 */ 
    private String frameType = "frame";
	/*
	 * Holds a destination place.
	 */ 
    private String gender = "boy";
	/*
	 * Holds a destination place.
	 */ 
    private String orientation = "down";
	/*
	 * Holds a destination place.
	 */ 
    private String boatType = "Row Boat";
	/*
	 * Holds a destination place.
	 */ 
    private String extension = ".gif";
	/*
	 * Holds a destination place.
	 */ 
    private String facingTo = orientation;
	/*
	 * Holds a destination place.
	 */ 
    private String noMovesWarning = "WarningNoMoves";
	/*
	 * Holds a string query
	 */ 
    private String noCastsWarning = "WarningNoFish";
	/*
	 * Holds a string query
	 */ 
    private String backToPortWarning = "NO MORE MOVES AND CASTS AVAILABLE. \nDO YOU WANT TO STAY?(Y)/(N)";
	/*
	 * Holds a string query
	 */ 
    private String headingBackToPort = "WarningBackToPort";
	/*
	 * Holds a string query
	 */ 
    private String noMoney = "WarningMoneyNotEnough";
	/**
	 * Boolean holding whether a player can move again after pressing the move button
	 */
    private boolean isMovable = true;
        /**
	 * Boolean holding whether a player can press the button again
	 */
    private boolean isPressable = true;
         /**
	 * Boolean holding whether a player is in the seaty
	 */
    private boolean seatyLife = true;
    /**
	 * Boolean holding whether a player is in the initial position in the seaty
	 */   
    private boolean firstPosition = true;
        /**
	 * Boolean holding whether a player has closed the menu
	 */    
    private boolean closeMenu = false;
        /**
	 * Boolean holding whether a player is in the submenu
	 */ 
    private boolean atSubMenu = false;
        /**
	 * Boolean holding whether a player has closed the shop menu
	 */ 
    private boolean closeShop = false;
        /**
	 * Boolean holding whether a player is at the store
	 */ 
    private boolean atStore = false;
        /**
	 * Boolean holding whether a player is shopping
	 */ 
    private boolean atShop = false;
        /**
	 * Boolean holding whether a player is in the shop menu
	 */ 
    private boolean atSubShop = false;
        /**
	 * Font holding the font style, size, color
	 */ 
    private Font font;
        /**
	 * Color determines the color of the font
	 */
    private Color color;
        /**
	 * Player will hold the character and its profile
	 */
    private Player player = new Player ("Bhosxz", gender);
        /**
	 * An array consisting of all the locales
	 */
    private ArrayList <Locale> maps = new ArrayList <Locale> ();
        /**
	 * Timer class to be used for smooth movement of the character
	 */
    Timer timer;
        /**
	 * Timer class to be used for smooth movement of the character
	 */
    Timer timer1;
         /**
	 * Timer class to be used for smooth movement of the character
	 */
    Timer timer2;
         /**
	 * Seaty holds all the properties and methods for the Seaty class
	 */
    private Seaty seaty;
        /**
	 * seaty holds all the properties and methods for the Store class
	 */
    private Store store;
        /**
	 * curLocale gets the current locale the player is in
	 */
    private Locale curLocale = new Locale("Lake of Rage", 0);
        /**
	 * Boolean holding whether the game has ended
	 */
    private boolean endGame = false;
       /**
	 * Tells whether the day is ended by player or not.
	 */
	private boolean endDay = false;
    /**
	 * Tells whether the player is in the intro screen.
	 */
	private boolean inIntro = true;
    /**
	 * Tells whether the player is in the game sequence.
	 */
	private boolean inGame = false;
    /**
	 * Tells whether the player is to be in the Seaty.
	 */
	private boolean returnSeaty = true;
    
	
	/** 
	 * Sets up the window for the game.
	 */
    
    
    
    public PokemonWindow(){
        super();
        setElements();
    }
    
            /**
	 * Sets the elements for the game.
	 */
    private void setElements(){
        setSize(windowDimension + 5, windowDimension + 26  + tileSize/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pokemon Fishing World!");
        setLayout(null);
        
        seaty = new Seaty();
        
        backgroundLabel = new JLabel("");
        backgroundLabel.setBounds(0, 0, frameDimension, frameDimension);
        backgroundLabel.setIcon(new ImageIcon(srcFolder + "start-background.jpg"));
        
        characterLabel = new JLabel("");
        characterLabel.setBounds(x, y, characterSize, characterSize);
        
        characterLabel1 = new JLabel("");
        characterLabel1.setBounds(x, y, characterSize, characterSize);
        
        mapLabel = new JLabel("");
        mapLabel.setBounds(0, tileSize/2, windowDimension, windowDimension);
        
        mapLabel1 = new JLabel("");
        mapLabel1.setBounds(0, tileSize/2, windowDimension, windowDimension);
        
        blurLabel = new JLabel("");
        blurLabel.setBounds(0, tileSize/2, windowDimension, windowDimension);
        
        storeLabel = new JLabel("");
        storeLabel.setBounds(0, tileSize/2, windowDimension, windowDimension);
        
        warningLabel = new JLabel("");
        warningLabel.setBounds(0, frameDimension - 80, windowDimension, 80);
        warningLabel.setIcon(new ImageIcon("images/warning.png"));
        warningLabel.setVisible(false);
        
        badgeLabel = new JLabel("");
        badgeLabel.setBounds(200, tileSize * 2, 100, 100);
        badgeLabel.setVisible(false);
        
        signLabel = new JLabel("");
        signLabel.setBounds(tileSize * 3, tileSize, 232 , 60);
        signLabel.setIcon(new ImageIcon("images/sign.png"));
        signLabel.setVisible(false);
        
        yesNoLabel = new JLabel("");
        yesNoLabel.setBounds(windowDimension - 117, frameDimension - 80 - 111, 117, 111);
        yesNoLabel.setIcon(new ImageIcon(srcFolder + "misc/ChoiceOption1.gif"));
        yesNoLabel.setVisible(false);
        
        simulationLabel = new JLabel("");
        simulationLabel.setBounds(0, frameDimension/3, windowDimension, tileSize * 3);
        simulLabel = new JLabel("");
        simulLabel.setBounds(0, frameDimension/3, windowDimension, tileSize * 3);
        
        fisherLabel = new JLabel("");
        fisherLabel.setBounds(0, tileSize * 4, 418, 124);
        
        pokemonLabel = new JLabel("");
        pokemonLabel.setBounds(x1, y1, 98, 120);
        
        menuLabel = new JLabel("");
        menuLabel.setBounds(windowDimension-216, tileSize * 2, 216, 288);
        
        statusLabel = new JLabel("");
        statusLabel.setBounds(0,0,windowDimension,24);
        statusLabel.setIcon(new ImageIcon(srcFolder + "misc/StatusBarSeaty.png"));
        statusLabel.setVisible(false);
        
        /*tackleLabel;
        private JLabel  rodLabel;
        private JLabel  lineLabel;
        private JLabel  lureLabel;
        private JLabel  reelLabel;
        private JLabel  boatLabel;
        private JLabel engineLabel;*/
        
        shopLabel = new JLabel("");
        //shopLabel.setBounds(0, tileSize/2, windowDimension, windowDimension)
        
        font = new Font("PKMNRSEU_0", Font.PLAIN, 20);
        color = new Color(96, 96, 96);
        
        dayLabel = new JLabel("");
        dayLabel.setBounds(39, 1, 100, 20);
        dayLabel.setFont(font);
        dayLabel.setForeground(color);
        
        tackleLabel = new JLabel("");
        rodLabel = new JLabel("");
        lineLabel = new JLabel("");
        lureLabel = new JLabel("");
        reelLabel = new JLabel("");
        boatLabel = new JLabel("");
        engineLabel = new JLabel("");
        
        tackleLabel.setBounds(260, 35, 270, 64);
        rodLabel.setBounds(260, 99, 270, 64);
        lineLabel.setBounds(260, 163, 270, 64);
        lureLabel.setBounds(260, 227, 270, 64);
        reelLabel.setBounds(260, 291, 270, 64);
        boatLabel.setBounds(260, 355, 270, 64);
        engineLabel.setBounds(260, 419, 270, 64);
        
        tackleLabel.setFont(font);
        rodLabel.setFont(font);
        lineLabel.setFont(font);
        lureLabel.setFont(font);
        reelLabel.setFont(font);
        boatLabel.setFont(font);
        engineLabel.setFont(font);
        
        tackleLabel.setForeground(color);
        rodLabel.setForeground(color);
        lineLabel.setForeground(color);
        lureLabel.setForeground(color);
        reelLabel.setForeground(color);
        boatLabel.setForeground(color);
        engineLabel.setForeground(color);
        
        setMisc();
        setPlayer();
        
        add(tackleLabel);
        add(rodLabel);
        add(lureLabel);
        add(reelLabel);
        add(lineLabel);
        add(engineLabel);
        add(boatLabel);
        add(fisherLabel);
        add(badgeLabel);
        add(pokemonLabel);
        add(simulationLabel);
        add(simulLabel);
        add(signLabel);
        add(yesNoLabel);
        add(warningLabel);
        add(dayLabel);
        add(movesLabel);
        add(castsLabel);
        add(fameLabel);
        add(cashLabel);
        add(shopLabel);
        add(menuLabel);
        add(characterLabel1);
        add(characterLabel);
        add(storeLabel);
        add(blurLabel);
        add(statusLabel);
        add(mapLabel1);
        add(mapLabel);
        add(backgroundLabel);
        
        
        
        updateMisc();
        updatePlayerStats();
        hideMisc();
        hidePlayerStats();
        
        addKeyListeners();
        
    }
        /**
	 * Sets the status bar of the window
	 */
    
    private void setMisc(){
        dayLabel = new JLabel("");
        dayLabel.setBounds(39, 1, 100, 20);
        dayLabel.setFont(font);
        dayLabel.setForeground(color);
        
        cashLabel = new JLabel("");
        cashLabel.setBounds(132, 1, 100, 20);
        cashLabel.setFont(font);
        cashLabel.setForeground(color);     
    }
        /**
	 * Displays the status bar.
	 */
    private void displayMisc(){
        dayLabel.setVisible(true);
        cashLabel.setVisible(true);
    }
        /**
	 * Hides the status bar.
	 */
    private void hideMisc(){
        dayLabel.setVisible(false);
        cashLabel.setVisible(false);
    }
    /**
	 * Updates the info in the status bar.
	 */
    
    private void updateMisc(){
        dayLabel.setText("" + day);
        
        cash = player.getCash();
        cashLabel.setText("" + cash);
    }
    /**
	 * Sets up the player's equipment.
	 */
    private void setPlayer(){
        moves = player.getEquipment(curLocale).getMoves();
        casts = player.getEquipment(curLocale).getCasts();
        
        int caughtTreasure = 0;
        
        movesLabel = new JLabel ("");
        movesLabel.setBounds(265, 1, 100, 20);
        movesLabel.setFont(font);
        movesLabel.setForeground(color);
        
        castsLabel = new JLabel("");
        castsLabel.setBounds(378, 1, 100, 20);
        castsLabel.setFont(font);
        castsLabel.setForeground(color);
        
        fameLabel = new JLabel("");
        fameLabel.setBounds(480, 1, 100, 20);
        fameLabel.setFont(font);
        fameLabel.setForeground(color);
        
    }
        /**
	 * Displays the fishing related statuses of the player.
	 */
    private void displayPlayerStats(){
        movesLabel.setVisible(true);
        castsLabel.setVisible(true);
        fameLabel.setVisible(true);
    }
    	/**
	 * Updates the fishing related statuses of the player.
	 */
    private void updatePlayerStats(){
        movesLabel.setText("" + (int)moves);
        castsLabel.setText("" + casts);
        
        fame = player.getFame(curLocale);
        fameLabel.setText("" + fame);
    }
    	/**
	 * Hides the fishing related statuses of the player.
	 */
 private void hidePlayerStats(){
        movesLabel.setVisible(false);
        castsLabel.setVisible(false);
        fameLabel.setVisible(false);
    }
    	/**
	 * Adds key listeners 
	 */
    private void addKeyListeners(){
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundLabelKeyPressed(evt);
            }
            
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {  
                backgroundLabelKeyReleased(evt);
            }
        });
    }
    /**
	 * Adds the necessary conditions for the game to understand key press properly.
	 * @param evt KeyEvent that checks what key is pressed by the player. 
	 */
    private void backgroundLabelKeyPressed(java.awt.event.KeyEvent evt) {
        int code = evt.getKeyCode();
        if(!endGame){
            if(inIntro){
                if(code == KeyEvent.VK_J){
                    backgroundLabel.setIcon(new ImageIcon(srcFolder + frameType + frame +".png"));
                    frame++;
                    System.out.println(frame);
                }
                if(frame > 1){
                    inIntro = false;
                    inGame = true;
                }
            }
            if(inGame){
                statusLabel.setVisible(true);
                displayMisc();
                //displayPlayerStats();
                if(day <= 30){
                
                if(seatyLife){
                    hidePlayerStats();
                    statusLabel.setIcon(new ImageIcon(srcFolder + "misc/StatusBarSeaty.png"));
                }
                    
                    if(!seatyLife && code == KeyEvent.VK_M || closeMenu){
                        System.out.println("pasok sa menu");
                        
                        menuLabel.setBounds(windowDimension-216, tileSize * 2, 216, 288);
                        if(atSubMenu){
                            closeMenu = !closeMenu;
                            atSubMenu = false;
                        }
                        closeMenu = !closeMenu;
                        goToMenu(code);
                    }
                    
                    if(code == KeyEvent.VK_K && atShop || closeShop){
                        if(facingTo.equals("left")){
                            shopLabel.setBounds(0, tileSize * 2, 216, 288);
                
                        if(atSubShop){
                            closeShop = !closeShop;
                        }
                        closeShop = !closeShop;
                        
                        shopping(code);
                        }
                    }
                    
                    if(!seatyLife && code == KeyEvent.VK_E){
                        code = KeyEvent.VK_N;
                        moves = 0;
                        casts = 0;
                    }
                    
                    if (moves < 1 && casts < 1){
                        warningLabel.setIcon(new ImageIcon(srcFolder + "misc/WarningNoFishAndMoves.png"));
                        warningLabel.setVisible(true);
                        System.out.println("yesno");
                        yesNoLabel.setVisible(true);
                        
                        if(code == KeyEvent.VK_S){
                            yesNoLabel.setIcon(new ImageIcon(srcFolder + "misc/ChoiceOption2.gif"));
                            option = 2;
                            
                        }
                        else if (code == KeyEvent.VK_W){
                            yesNoLabel.setIcon(new ImageIcon(srcFolder + "misc/ChoiceOption1.gif"));
                            option = 1;
                        }
                        
                        else if(code == KeyEvent.VK_J){
                            warningLabel.setVisible(false);
                            if(option == 1){
                                System.out.println("option 1");
                                displayWarning(warningLabel, headingBackToPort);
                                endDay();
                            }
                            else if (option == 2){
                                characterLabel.setVisible(false);
                                characterLabel1.setVisible(true);
                                seatyLife = true;
                                firstPosition = true;

                                day++;

                                warningLabel.setVisible(false);

                                reset();  
                            }
                            yesNoLabel.setVisible(false);
                            
                        }
                    
                        /*else if(code == KeyEvent.VK_N){
                        characterLabel1.setVisible(true);
                        seatyLife = true;
                        firstPosition = true;
                        
                        day++;
                        
                        warningLabel.setVisible(false);
                        
                        reset();
                        }*/
                        code = -1;
                    }
                
                    if (code == KeyEvent.VK_R){
                        reset();
                    }
                    
                    if(firstPosition){
                        System.out.println("Pasok!");
                            
                        backToSeaty(5,2);
                        reset();
                    }
                    
                    firstPosition = false;
               
                    if (isPressable){
                    if(isMovable){
                        isMovable = false;
                        if(seatyLife && !atShop){
                            switch (code){
                                case KeyEvent.VK_W: seatyRun("up");
                                    break;
                                case KeyEvent.VK_S: seatyRun("down");
                                    break;
                                case KeyEvent.VK_D: seatyRun("right") ;
                                    break;
                                case KeyEvent.VK_A: seatyRun("left");
                            }
                        }

                        else if (!seatyLife){
                           //displayPlayerStats();
                            switch (code){
                                case KeyEvent.VK_W: movePlayer("up");
                                    break;
                                case KeyEvent.VK_S: movePlayer("down");
                                    break;
                                case KeyEvent.VK_D: movePlayer("right");
                                    break;
                                case KeyEvent.VK_A: movePlayer("left");
                                    break;
                                case KeyEvent.VK_F: fish();
                            }
                            
                            updatePlayerStats();
                            //displayPlayerStats();
                        }
                    }     
                }
                updateMisc();
                isPressable = true;
                
            }
            
                else this.setVisible(false);
            } 
        }
        
    }
    	/**
	 * Checks of key release instance
	 * @param evt checks when the key is released
	 */ 
    private void backgroundLabelKeyReleased(java.awt.event.KeyEvent evt) {
            isMovable = true;
    }    
    
	/**
	 * Displays warnings
	 */ 
    private void displayWarning(JLabel label, String text){
        label.setVisible(true);
        label.setIcon(new ImageIcon(srcFolder + "misc/" + text + ".png"));
        delay(1500, label);
        
    }
    /**
	 * Decreases the moves for the day.
	 */
    private void decreaseMoves(){
        if(player.getEquipment(curLocale).getBoat().hasEngine()){
            moves -= 0.5;
        }
        else{
            moves--;
        }
    }
    	/**
	 * Allows delay for movements of the player.
	 * @param ss timer noting the length in seconds
	 */
    private void delay(int ss){
        timer = new Timer (ss, new ActionListener() {
                       
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           try {
                               Thread.sleep(2000);
                           } catch (InterruptedException ex) {
                               Logger.getLogger(PokemonWindow.class.getName()).log(Level.SEVERE, null, ex);
                           }
                       }
                   });
                   timer.setCoalesce(true);
                   timer.setRepeats(false);
                   timer.start(); 
    }
    
        /**
	 * Delays screen and displays given label
	 * @param ss timer noting the length in seconds
	 * @param label label to be displayed on delay
	 */
    private void delay(int ss, final JLabel label){
        timer2 = new Timer (ss, new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           isPressable = true;
                           label.setVisible(false);
                       }
                   });
                   
                   timer2.setRepeats(false);
                   timer2.setCoalesce(false);
                   timer2.start();
                   isPressable = false;
                   
    }
        /**
	 * An extended version of the delay, with more warnings to display
	 *@param ss timer noting the length in seconds
	 *@param label1 One of the labels to be displayed
	 *@param lable2 One of the labels to be displayed
	 *@param label3 One of the labels to be displayed
	 */
    private void delay(int ss, final JLabel label1, final JLabel label2, final JLabel label3){
        timer = new Timer (ss, new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                            isPressable = true;
                            label1.setVisible(false);
                            label2.setVisible(false);
                            label3.setVisible(false);
                            
                       }
                   });
                   
                   timer.setRepeats(false);
                   timer.setCoalesce(false);
                   timer.start();
                   isPressable = false;
    }
    	/**
	 * Allows the smooth movement of the player
	 * @param label image holding the character image.
	 * @param direction String showing the direction of movement
	 * @param ss timer noting the length in seconds
	 */ 
    private void smoothMove(final JLabel label, final String direction, int ss){
                 timer1 = new Timer(ss, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        isPressable = false;
                        switch(direction){
                            case "up": y1--;
                                break;
                            case "down": y1++;
                                break;
                            case "right": x1++;
                                break;
                            case "left": x1--;
                                break;
                        }
                        label.setBounds(x1, y1, 150, 185);
                        stopper1++;
                        if(stopper1 > movementDistance){
                            timer1.stop();
                            stopper1 = 1;
                            isPressable = true;
                        } 
                    }
                });
                timer1.start();
       
    }
    	/**
	 * This method allows movement of the character, without the control of its speed
	 * @label contains the image of the character to be moved.
	 * @direction contains the direction of movement.
	 */
        private void smoothMove(final JLabel label, final String direction){
        subFolder = "CharacterSprites/";
        extension = ".gif";
        label.setIcon(new ImageIcon(srcFolder + subFolder + gender + "run" + orientation + extension));    
        s = 7;
                 timer = new Timer(s, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        isPressable = false;
                        switch(direction){
                            case "up": y--;
                                break;
                            case "down": y++;
                                break;
                            case "right": x++;
                                break;
                            case "left": x--;
                                break;
                        }
                        label.setBounds(x, y, characterSize, characterSize);
                        stopper++;
                        if(stopper > movementDistance){
                            timer.stop();
                            subFolder = "CharacterSprites/";
                            extension = ".png";
                            label.setIcon(new ImageIcon(srcFolder + subFolder + "boystand" + orientation + extension));
                            stopper = 1;
                            isPressable = true;
                        } 
                    }
                });
                timer.start();
       
    }
   	/**
	 * This method allows a smooth moevement.
	 * @param direction shows the direction of the movement.
	 */      
    private void smoothMove(final String direction){
            
        s = 5;
                 timer = new Timer(s, new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        isPressable = false;
                        switch(direction){
                            case "up": y--;
                                break;
                            case "down": y++;
                                break;
                            case "right": x++;
                                break;
                            case "left": x--;
                                break;
                        }
                        characterLabel.setBounds(x, y, characterSize, characterSize);
                        stopper++;
                        if(stopper > movementDistance){
                            timer.stop();
                            stopper = 1;
                            isPressable = true;
                        } 
                    }
                });
                timer.start();
       
    }
    	/** 
	 * Allows the movement to do a swift smooth motion of a bounce.
	 * @param direction String holding the direction of movement.
	 */ 
    private void rubberBandEffect(final String direction){
        s = 2;
        
                 timer = new Timer(s * 10, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        isPressable = false;
                        if(stopper <= movementDistance/4){
                            switch(direction){
                                case "up": y--;
                                     break;
                                case "down": y++;
                                     break;
                                case "right": x++;
                                     break;
                                case "left": x--; 
                                     break;
                            }
                            characterLabel.setBounds(x, y, characterSize, characterSize);
                            stopper++;
                        }
                        else if(stopper > movementDistance/4){
                            switch(direction){
                                case "up": y++;
                                     break;
                                case "down": y--;
                                     break;
                                case "right": x--;
                                     break;
                                case "left": x++; 
                                     break;
                            }
                            characterLabel.setBounds(x, y, characterSize, characterSize);
                            stopper++;
                            if(stopper > movementDistance/2){
                                timer.stop();
                                stopper = 1;
                                isPressable = true;
                            }
                        }
                    }
                });
                timer.start();
        
    }
    	/**
	 * Allows the player to move.
	 * @param direction String holding the direction of movement.
	 */ 
    private void movePlayer(String direction){
            orientation = direction;
                if(facingTo.equals(direction)){
                    if(moves > 0){
                        if(player.move(direction, curLocale)){
                            if(curLocale.accessCoordinate(player.getPosY(), player.getPosX()).getName().equals("Port")){
                                portToSeaty();
                            }
                            else{
                                smoothMove(direction);
                                decreaseMoves();
                            }
                        }
                        else{
                            rubberBandEffect(orientation);
                        }
                    }
                    else if (moves < 1 && casts > 0){
                        displayWarning(warningLabel, noMovesWarning);
                    }
                }
                else{
                    subFolder = "gifboats/";
                    extension = ".gif";
                    boatType = player.getEquipment(curLocale).getBoatName();
                    characterLabel.setIcon(new ImageIcon(srcFolder + subFolder + gender + "/" + boatType + orientation + extension));
                    facingTo = orientation;
                }
        
		player.changeFishPos(orientation);
    }
    /**
	 * This method allows the player to move inside the Seaty.
	 * @direction String holding the direction of movement.
	 */ 
    private void seatyRun(String direction){
        orientation = direction; 
        
        //System.out.println(player.getPosX() + "," + player.getPosY());
        
        if(!atStore){
            System.out.println("SDAAS");
            
            if(!(facingTo.equals(direction))){
                subFolder = "CharacterSprites/";
                extension = ".png";
                    
                characterLabel1.setIcon(new ImageIcon(srcFolder + subFolder + "boystand" + orientation + extension));
                facingTo = orientation;
                player.changeFishPos(direction);
            } 
            
            if(seaty.accessCoordinate(player.getPosY(), player.getPosX()).getName().equals("Locale Entrance")){
                //System.out.println(seaty.accessCoordinate(player.getPosY(), player.getPosX()).getName());
                curLocale = ((Locale)seaty.getEntranceLocale(player.getPosY(), player.getPosX()));
                if(curLocale.isAccessible()){
                    seatyPosX = player.getFishPosX();
                    seatyPosY = player.getFishPosY();
                    goToMap(curLocale);
                }
                else{
                    System.out.println("sdfgsdfgsdfgsd");
                    displayWarning(warningLabel, "WarningNotAllowedToEnter");
                }
            }
            
            else if(seaty.accessCoordinate(player.getFishPosY(), player.getFishPosX()).getName().equals("Sign")){
                System.out.println(player.getFishPosY() +"" + player.getFishPosX());
                if(player.getFishPosY() == 3 && player.getFishPosX() == 1){
                    System.out.println("panot");
                    displayWarning(signLabel, "texture1");
                }
                else if(player.getFishPosY() == 6 && player.getFishPosX() == 1){
                    displayWarning(signLabel, "texture3");
                }
                else if(player.getFishPosY() == 3 && player.getFishPosX() == 9){
                    displayWarning(signLabel, "texture2");
                }
                
                else if(player.getFishPosY() == 6 && player.getFishPosX() == 9){
                    displayWarning(signLabel, "texture4");
                }
                
                else if(player.getFishPosY() == 9 && player.getFishPosX() == 6){
                    displayWarning(signLabel, "texture5");
                }
                
            }
            
            else if(seaty.accessCoordinate(player.getFishPosY(), player.getFishPosX()).getName().equals("Store Entrance")){
                System.out.println("Store");
                store = (Store)(seaty.getEntranceLocale(player.getFishPosY(), player.getFishPosX()));
                atStore = true;
                seatyPosX = player.getPosX();
                seatyPosY = player.getPosY();
                goToShop();
                first++;       
            } 
            
            if(facingTo.equals(direction)){
                if(player.move(direction, seaty)){
                    System.out.println("waggalwaww");
                    smoothMove(characterLabel1, direction);
                    player.changeFishPos(direction);
                }
            }
        }
        
        else if(atStore){
            if(store.accessCoordinate(player.getPosY(), player.getPosX()).getName().equals("Exit") && facingTo.equals("down")){
                System.out.println("CHECK");
                backToSeaty(seatyPosX, seatyPosY);
                
            }
            else if(facingTo.equals(direction)){
                if(player.move(direction, store)){
                    smoothMove(characterLabel1, direction);
                    player.changeFishPos(direction);
                }  
            }
                
            else{
                subFolder = "CharacterSprites/";
                extension = ".png";
                    
                characterLabel1.setIcon(new ImageIcon(srcFolder + subFolder + "boystand" + orientation + extension));
                facingTo = orientation;
                player.changeFishPos(direction);
            } 
            
            if(store.accessCoordinate(player.getPosY(), player.getPosX()).getName().equals("Shop") && facingTo.equals("left")){
                System.out.println("Shopping");
                atShop = true;
            }
            
            
            
            first++;
        }  
        
        
    }
    	/**
     * This method allows the player to fish.
	 */           
    private void fish(){
        if (casts > 0){
            if(player.canFish(curLocale)){
		player.fish(curLocale);
                battleMode(player.isCaught());
                casts--;
            }
        }
        else{
            displayWarning(warningLabel, noCastsWarning);
        }
    }
    
	/** 
	 * Resets all moves and cast to maximum possible.
	 */
    private void reset(){
        moves = player.getEquipment(curLocale).getMoves();
        casts = player.getEquipment(curLocale).getCasts();
    }
    	/**
	 * This method allows the player to enter an encounter instance with the pokemon
	 * @param caught tells whether a pokemon is caught or not. 
	 */ 
    private void battleMode(boolean caught){
        isPressable = false;
        int ss = 10;
        boolean initialDelay = true;
        blurLabel.setIcon(new ImageIcon(srcFolder + "Textures/" + "textureblur" + (curLocale.getMapIndex()+1) + ".png"));
        blurLabel.setVisible(true);
        
        simulLabel.setIcon(new ImageIcon(srcFolder + "simulation1.png"));
        simulLabel.setVisible(true);
        
        simulationLabel.setIcon(new ImageIcon(srcFolder + "simulation2.gif"));
        simulationLabel.setVisible(true);
        
        subFolder = "CharacterSprites/";
        
        fisherLabel.setIcon(new ImageIcon(srcFolder + subFolder + "boyfishing.gif" ));
        fisherLabel.setVisible(true);
        
        if(caught){
            ss = 20;
            String pokemonName = curLocale.accessCoordinate(player.getFishPosY(), player.getFishPosX()).getName();
            System.out.println(pokemonName);
            if(pokemonName.equals("treasure")){
                displayWarning(warningLabel, "WarningTreasureCaught");
            }
            else if(pokemonName.equals("legendary")){
                displayWarning(badgeLabel, "Badges/badge" + (curLocale.getMapIndex() + 1));
            }
            else{
                displayWarning(warningLabel, "WarningPokemonCaught");
            }
            pokemonLabel.setIcon(new ImageIcon(srcFolder + "Objects/texture" + (curLocale.getMapIndex()+1) + pokemonName + ".png"));
            pokemonLabel.setVisible(true);
            
            pokemonLabel.setBounds(x1, y1 += movementDistance, 98, 120);
            
            smoothMove(pokemonLabel, "up", ss);
            //smoothMove(badgeLabel, "up", ss);
            
            //delay(ss * 3/2 * 100, badgeLabel);
            delay(ss * 3/2 * 100,pokemonLabel);
            
            isPressable = true;
        }
        
        
        
        delay(ss * 3/2 * 100, fisherLabel, simulationLabel, simulLabel);
        delay(ss * 3/2 * 100, blurLabel);
        
    }
    	/**
	 * This allows the player to go to the next map.
	 * @param map Locale to be visited by player
	 */
    private void goToMap(Locale map){
        statusLabel.setIcon(new ImageIcon(srcFolder + "misc/StatusBar.png"));
        characterLabel1.setVisible(false);
        seatyLife = false;
        subFolder = "Textures/";
        extension = ".png";
        mapLabel1.setIcon(new ImageIcon(srcFolder + subFolder + "texture" + (map.getMapIndex() + 1) + extension));
        reset();
        //setPlayer();
        updatePlayerStats();
        displayPlayerStats();

        x = map.accessPortX();
        y = map.accessPortY();

        player.setPosX(x);
        player.setPosY(y);
        facingTo = map.getOrientation();
        player.changeFishPos(facingTo);
        System.out.println(x + "start" + y);

        x = tileSize * x + 3;
        y = tileSize * y  + tileSize/2;
        
        //setPlayer();
        characterLabel.setBounds(x, y, characterSize, characterSize);
        subFolder = "gifboats/";
        extension = ".gif";
        boatType = player.getEquipment(curLocale).getBoatName();      
        characterLabel.setIcon(new ImageIcon(srcFolder + subFolder + gender + "/" + boatType + facingTo + extension));
        characterLabel.setVisible(true);
    }
    	/** 
	 * The method returns the opposite direction.
	 * @param direction String holding the direction
	 * @return opposite direction
	 */
    private String oppositeDirection(String direction){
        switch(direction){
            case "up": return "down";
            case "down": return "up";
            case "right": return "left";
            case "left": return "right";
                
        }
        
        return "";
    }
    	/**
	 * Allows the player to go to the menu options.
	 */
    private void goToMenu(int code){
        isPressable = false;
        menuLabel.setVisible(true);
        System.out.println("menu");
        
        switch (code){
            case KeyEvent.VK_W: i--;
                                closeMenu = true;
                break;
            case KeyEvent.VK_S: i++;
                                closeMenu = true;
                break;
        }
        i = (i % 4 + 4) % 4;
        
        
        menuLabel.setIcon(new ImageIcon("images/misc/Menu" + (i + 1) +".png"));
        
        if(code == KeyEvent.VK_J){
            atSubMenu = true;
            switch(i){
                case 0: 
                    menuLabel.setIcon(new ImageIcon("images/misc/bag.png"));
                    menuLabel.setBounds(0, tileSize/2, windowDimension, windowDimension);
                    displayEquipments();
                    closeMenu = true;
                    break;
                case 1: 
                    menuLabel.setIcon(new ImageIcon("images/misc/boyprofile.gif"));
                    menuLabel.setBounds(0, tileSize/2, windowDimension, windowDimension);
                    
                    closeMenu = true;
                    break;
                case 2: 
                    endDay();
                    atSubMenu = false;
                    break;
                case 3: 
                    closeMenu = false; 
                    atSubMenu = false;
                    break;    
            }
        }
        if ( !atSubMenu){
            hideInventory();
        }
        
        if(!closeMenu){
            
            menuLabel.setVisible(false);
            i = 0;
        }
    }
        /**
	 * Allows the player to go to shop.
	 */
    private void goToShop(){
       
            //System.out.println("agay");
            x = 5;
            y = 10;
            
            player.setPosX(x);
            player.setPosY(y);
            
            x = tileSize * x;
            y = y *tileSize + tileSize/2;
            
            characterLabel1.setBounds(x, y, characterSize, characterSize);
            characterLabel1.setVisible(true);
			
            atStore = true;
        
       
        //System.out.println(storeTerrain.getStoreIndex());
        mapLabel1.setIcon(new ImageIcon(srcFolder + "Textures/Shop.png"));
    }
    /*
	 * Allows the player to buy.
	 * @param code holds the value of item to be shopped
	 */
    public void shopping(int code){
        //setPlayer();
        /*moves = player.getEquipment(curLocale).getMoves();
        casts = player.getEquipment(curLocale).getCasts();*/
        closeShop = true;
        shopLabel.setVisible(true);
        String item = "";
        isPressable = false;
        
        System.out.println("HULI KA BALBON!");
        
        switch (code){
            case KeyEvent.VK_W: 
                if(atSubShop){
                    j--;
                }
                else{
                    i--;
                }
                closeShop = true;
                break;
            case KeyEvent.VK_S:
                if(atSubShop){
                    j++;
                }
                else{
                    System.out.println("Hindi to sub");
                    i++;
                }
                closeShop = true;
                break;
        }
        i = (i % 8 + 8) % 8;
        
        shopLabel.setIcon(new ImageIcon (srcFolder+ "misc/StoreOption" + (i + 1) +".png"));
        
        
        if(itemSize > 0){
        j = (j % (itemSize) + (itemSize)) % (itemSize);
            System.out.println("J aafter" + j);
        }
        
        if(code == KeyEvent.VK_J || atSubShop){
            
            switch(i){
                case 0:
                    item = "TackleBoxes";
                    itemSize = store.getTackleBoxNum();
                    System.out.println("case0");
                    
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopTackleBox(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                    }
                    atSubShop = true;
                    closeShop = true;
                    break;
                case 1: 
                    item = "Rods";
                    itemSize = store.getRodNum();
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopRod(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                        
                    }
                    atSubShop = true;
                    closeShop = true;
                    break;
                case 2: 
                    System.out.println("asdfasdf");
                    item = "Lines";
                    itemSize = store.getLineNum();
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopLine(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                        
                    }
                    atSubShop = true;
                    closeShop = true;
                    break;
                case 3: 
                    item = "Reels";
                    itemSize = store.getReelNum();
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopReel(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                    }
                    atSubShop = true;
                    closeShop = true;
                    break;
                case 4: 
                    item = "Lures";
                    itemSize = store.getLureNum();
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopLure(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                    }
                    atSubShop = true;
                    closeShop = true;
                    break;
                case 5: 
                    item = "Boats";
                    itemSize = store.getBoatNum();
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopBoat(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                    }
                    atSubShop = true;
                    closeShop = true;
                    break; 
                case 6: 
                    item = "Engine";
                    itemSize = store.getEngineNum();
                    shopLabel.setIcon(new ImageIcon(srcFolder + "misc/StoreOption" + item + (j + 1)+".png"));
                    shopLabel.setBounds(0, tileSize*2, 241, 154);
                    
                    if(code == KeyEvent.VK_J && atSubShop && j < itemSize){
                        if(store.shopEngine(j, player)){
                            displayWarning(warningLabel, "WarningSuccessful");
                            
                        }
                        else
                            displayWarning(warningLabel, noMoney);
                    }
                    atSubShop = true;
                    closeShop = true;
                    break;      
                case 7: 
                    shopLabel.setVisible(false);
                    closeShop = false; 
                    atSubShop = false;
                    //atShop = false;
                    break;    
            }
            itemSize++;
            
            if(code == KeyEvent.VK_J && j == itemSize -1){
                j = 0;
                shopLabel.setIcon(new ImageIcon (srcFolder+ "misc/StoreOption" + (i + 1) +".png"));
                shopLabel.setBounds(0, tileSize * 2, 216, 288);
                atSubShop = false;
            }
        }
        
        if(!closeShop){
            System.out.println("LAbas");
            shopLabel.setVisible(false);
            atShop = false;
            closeShop = false;
            i = 0;
        }
        boatType = player.getEquipment(curLocale).getBoatName();
       characterLabel.setIcon(new ImageIcon(srcFolder + subFolder + gender + "/" + boatType + orientation + extension));
    }
    	/** 
	 * This method returns the player to Seaty
	 * @param seatyPosX x coordinate holding the player's position in the Seaty
	 * @param seatyPosY y coordinate holding the player's position in the Seaty
	 */
    public void backToSeaty(int seatyPosX, int seatyPosY){
        //setPlayer();
        characterLabel1.setVisible(false);
        atStore = false;
        seatyLife = true;
	//System.out.println("Labas!");
                            
        subFolder = "Textures/";
        extension = ".png";
        mapLabel1.setIcon(new ImageIcon(srcFolder + subFolder + "Seaty" + extension));
                            
                            
        player.setPosX(seatyPosX);
        player.setPosY(seatyPosY);
                            
        x = seatyPosX * tileSize ;
        y = tileSize * seatyPosY + tileSize/2 - 3;
        facingTo = "down";
                            
        characterLabel1.setBounds(x, y, characterSize, characterSize);
                            
		subFolder = "CharacterSprites/";
		extension = ".png";
		
        characterLabel1.setIcon(new ImageIcon(srcFolder + subFolder + "boystand" + "down" + extension));
        characterLabel1.setVisible(true);
	}
    	/** 
	 * This method returns the player to Seaty from the port
	 * 
	 */
    public void portToSeaty(){
        characterLabel.setVisible(false);
        seatyLife = true;
        
        backToSeaty(5, 2);
        
        day++;
        
        warningLabel.setVisible(false);
        
        reset();
    }
        /** 
	 * This method ends the day
	 * 
	 */
    private void endDay() {
                            x = (curLocale.accessPortX()) * tileSize + 3;
                            y = (curLocale.accessPortY()) * tileSize + tileSize/2;
                         
                            characterLabel.setBounds(x,y,characterSize, characterSize);
                         
                            subFolder = "gifboats/";
                            extension = ".gif";
                            boatType = player.getEquipment(curLocale).getBoatName();
                            characterLabel.setIcon(new ImageIcon(srcFolder + subFolder + gender + "/" + boatType + "down" + extension));
                            characterLabel.setVisible(true);
                         
                            player.setPosX(curLocale.accessPortX());
                            player.setPosY(curLocale.accessPortY());
                         
                            facingTo = curLocale.getOrientation();
                            
                            reset();
                         
                            day++;
    }
    
    public void displayEquipments(){
        tackleLabel.setText("" + player.getEquipment(curLocale).getTackleBoxName());
        rodLabel.setText("" + player.getEquipment(curLocale).getRodName());
        lineLabel.setText("" + player.getEquipment(curLocale).getLineName());
        lureLabel.setText("" + player.getEquipment(curLocale).getLureName());
        reelLabel.setText("" + player.getEquipment(curLocale).getReelName());
        boatLabel.setText("" + player.getEquipment(curLocale).getBoatName());
        
        if(player.getEquipment(curLocale).getBoat().hasEngine())
            engineLabel.setText("Team Aqua Engine");
        else
            engineLabel.setText("");
        
        displayInventory();
    }
    
    public void hideInventory(){
        tackleLabel.setVisible(false);
        rodLabel.setVisible(false);
        lineLabel.setVisible(false);
        lureLabel.setVisible(false);
        reelLabel.setVisible(false);
        boatLabel.setVisible(false);
        engineLabel.setVisible(false);
    }

public void displayInventory(){
        tackleLabel.setVisible(true);
        rodLabel.setVisible(true);
        lineLabel.setVisible(true);
        lureLabel.setVisible(true);
        reelLabel.setVisible(true);
        boatLabel.setVisible(true);
        engineLabel.setVisible(true);
    }
}    


