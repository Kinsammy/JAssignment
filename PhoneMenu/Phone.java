package appPackages;


import java.util.Scanner;

public class Phone{
    Scanner input = new Scanner(System.in);
    private int mainMenu;
    private int phoneBook;
    private int chat;
    private int callRegister;
    private int tones;
    private int settings;
    private int callDivert;
    private int games;
    private int calculator;
    private int reminders;
    private int clock;
    private int profiles;
    private int simServices;
    private int switchOff;

    public void mainMenu() {
        System.out.println("""
                1. Phone book
                2. Message
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminder
                11. Clock
                12. Profiles
                13. SIM services
                0. Back
                00. SwitchOff
                """);


        System.out.println("Press 1 - 13 to pick a menu or press 0 to go back or press 00 to switch-off: ");
        int menuOption = input.nextInt();
        switch (menuOption) {
            case 1 -> phoneBook();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> callRegister();
            case 5 -> tones();
            case 6 -> settings();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculator();
            case 10 -> reminders();
            case 11 -> clock();
            case 12 -> profiles();
            case 13 -> simServices();
            case 14 -> switchOff();
        }


    }


    public void phoneBook() {
        System.out.println("""
                1. Search
                2. Service Nos
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b' card
                8. Options
                9. Speed dials
                10. Voice tags
                0. back
                00. SwitchOff
                """);

                System.out.println("Choose from 1-10 to pick a menu or 0 to go back or 00 to SwitchOff: ");
                int phoneBookMenu = input.nextInt();
                switch (phoneBookMenu) {
                    case 1 -> {
                        System.out.println("1. Search");
                        phoneBook();
                    }
                    case 2 -> {
                        System.out.println("2. Service Nos.");
                        phoneBook();
                    }
                    case 3 -> {
                        System.out.println("3. Add name");
                        phoneBook();
                    }
                    case 4 -> {
                        System.out.println("4. Erase");
                        phoneBook();
                    }
                    case 5 -> {
                        System.out.println("5. Edit");
                        phoneBook();
                    }
                    case 6 -> {
                        System.out.println("6. Assign tone");
                        phoneBook();
                    }
                    case 7 -> {
                        System.out.println("7. Send b' card");
                        phoneBook();
                    }
                    case 8 -> {
                        System.out.println("8. Options");
                        System.out.println("Press 1 to see Options: ");
                        int opt = input.nextInt();
                        System.out.println("""
                                1. Type of view
                                2. Memory status
                                """);
                        phoneBook();

                        System.out.println("Select either 1 or 2 to pick an option: ");
                        int options = input.nextInt();
                        switch (options) {
                            case 1 -> {
                                System.out.println("1. Type of view");
                                phoneBook();
                            }
                            case 2 -> {
                                System.out.println("2. Memory status");
                                phoneBook();
                            }
                        }
                    }
                    case 9 -> {
                        System.out.println("9. Speed dials");
                        phoneBook();
                    }
                    case 10 -> {
                        System.out.println("10. Voice tags");
                        phoneBook();
                    }
                    case 0 -> mainMenu();
                    default -> switchOff();
                }

    }

    private void message(){
        System.out.println("Press 1 to see Messages menu:");
        int messagesMenu = input.nextInt();
        System.out.println("""
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor
                0. back
                00. SwitchOff
                """);

            System.out.println("Choose from 1- 10 to pick a Messages menu or press 0 to go back or press 00 to switch off: ");
            int messagesOption = input.nextInt();
            switch (messagesOption) {
                case 1 -> {
                    System.out.println("1. Write messages");
                    message();
                }
                case 2 -> {
                    System.out.println("2. Inbox");
                    message();
                }
                case 3 -> {
                    System.out.println("3. Outbox");
                    message();
                }
                case 4 -> {
                    System.out.println("4. Picture messages");
                    message();
                }
                case 5 -> {
                    System.out.println("5. Templates");
                    message();
                }
                case 6 -> {
                    System.out.println("6. Smileys");
                    message();
                }
                case 7 -> {
                    System.out.println("7. Message settings");
                    System.out.println("Press 1 to see Message settings menu");
                    int messageSettingMenu = input.nextInt();
                    System.out.println("""
                            1. Set
                            2. Common
                            """);

                    System.out.println("Select 1 or 2 to pick a list");
                    int messageSettings = input.nextInt();
                    switch (messageSettings) {
                        case 1 -> {
                            System.out.println("1. Set");
                            System.out.println("Press 1 to see Set lists: ");
                            int setList = input.nextInt();
                            System.out.println("""
                                    1. Message centre number
                                    2. Message sent as
                                    3. Message validity
                                    """);
                            System.out.println("Choose from 1-3 to pick a set list");
                            int sets = input.nextInt();
                            switch (sets) {
                                case 1 -> {
                                    System.out.println("1. Message centre number");
                                    message();
                                }
                                case 2 -> {
                                    System.out.println("2. Message sent as");
                                    message();
                                }
                                case 3 -> {
                                    System.out.println("3. Message validity");
                                    message();
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("2. Common");
                            System.out.println("Press 1 to see Common lists: ");
                            int commonList = input.nextInt();
                            System.out.println("""
                                    1. Delivery reports
                                    2. Reply via same centre
                                    3. Character support
                                    """);
                            System.out.println("Choose from 1-3 to pick a Common list: ");
                            int common = input.nextInt();
                            switch (common) {
                                case 1 -> {
                                    System.out.println("1. Delivery reports");
                                    message();
                                }
                                case 2 -> {
                                    System.out.println("2. Reply via same centre");
                                    message();
                                }
                                case 3 -> {
                                    System.out.println("3. Character support");
                                    message();
                                }
                            }
                        }
                    }
                }
                case 8 -> {
                    System.out.println("8. Info service");
                    message();
                }
                case 9 -> {
                    System.out.println("9. Voice mailbox number");
                    message();
                }
                case 10 -> {
                    System.out.println("10. Service command editor");
                    message();
                }
                case 0 -> mainMenu();
                default -> switchOff();
            }

    }

    private  void chat(){
        System.out.println("Press 1 to chat or press 0 to go back or press 00 to switch off: ");
        int chatOption = input.nextInt();
        switch (chatOption){
            case 1 -> System.out.println("Chat");
            case 0 -> mainMenu();
            default -> switchOff();
        }
    }

    private void callRegister(){
            System.out.println("Press 1 to see Call register option: ");
            int call = input.nextInt();
        System.out.println("""
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit
                """);


                System.out.println("Choose from 1-8 to pick call register or press 0 to go back or press 00 to switch off");
                int callOptions = input.nextInt();
                switch (callOptions) {
                    case 1 -> {
                        System.out.println("1. Missed calls");
                        callRegister();
                    }
                    case 2 -> {
                        System.out.println("2. Received calls");
                        callRegister();
                    }
                    case 3 -> {
                        System.out.println("3. Dialled numbers");
                        callRegister();
                    }
                    case 4 -> {
                        System.out.println("4. Erase recent call lists");
                        callRegister();
                    }
                    case 5 -> {
                        System.out.println("5. Show call duration");
                        System.out.println("Press 1 to show call duration: ");
                        int callDuration = input.nextInt();
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """);

                        System.out.println("Choose from 1-5 to show a call duration: ");
                        int showCallDuration = input.nextInt();
                        switch (showCallDuration) {
                            case 1 -> {
                                System.out.println("1. Last call duration");
                                callRegister();
                            }
                            case 2 -> {
                                System.out.println("2. All calls' duration");
                                callRegister();
                            }
                            case 3 -> {
                                System.out.println("3. Received calls' duration");
                                callRegister();
                            }
                            case 4 -> {
                                System.out.println("4. Dialled calls' duration");
                                callRegister();
                            }
                            case 5 -> {
                                System.out.println("5. Clear timers");
                                callRegister();
                            }
                        }
                    }
                    case 6 -> {
                        System.out.println("6. Show call costs");
                        System.out.println("Press 1 to Show call costs: ");
                        int callCosts = input.nextInt();
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear timer
                                """);

                        System.out.println("Choose from 1-3 to show a  call cost");
                        int showCallCost = input.nextInt();
                        switch (showCallCost) {
                            case 1 -> {
                                System.out.println("1. Last call cost");
                                callRegister();
                            }
                            case 2 -> System.out.println("2. All calls' cost");
                            case 3 -> System.out.println("3. Clear timer");
                        }
                    }
                    case 7 -> {
                        System.out.println("7. Call cost settings");
                        System.out.println("Press 1 to see the Call cost settings: ");
                        int callCost = input.nextInt();
                        System.out.println("1. Call cost limit");
                        System.out.println("2. Show costs in");

                        System.out.println("Select either 1 or 2 to pick Call cost settings: ");
                        int callCostSettings = input.nextInt();
                        switch (callCostSettings) {
                            case 1 -> {
                                System.out.println("1. Call cost limit");
                                callRegister();
                            }
                            case 2 -> {
                                System.out.println("2. Show costs in");
                                callRegister();
                            }
                        }
                    }
                    case 8 -> {
                        System.out.println("8. Prepaid credit");
                        callRegister();
                    }
                    case 0 -> mainMenu();
                    default -> switchOff();

                }

    }

    private void tones() {

            System.out.println("Press 1 to see Tones menu: ");
            int tonesMenu = input.nextInt();
        System.out.println("""
                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver
                """);

                System.out.println("Choose from 1-9 to pick a Tone menu or press 0 to go back or press 00 to switchOff: ");
                int tonesOption = input.nextInt();
                switch (tonesOption) {
                    case 1 -> {
                        System.out.println("1. Ringing tone");
                        tones();
                    }
                    case 2 -> {
                        System.out.println("2. Ringing volume");
                        tones();
                    }
                    case 3 -> {
                        System.out.println("3. Incoming call alert");
                        tones();
                    }
                    case 4 -> {
                        System.out.println("4. Composer");
                        tones();
                    }
                    case 5 -> {
                        System.out.println("5. Message alert tone");
                        tones();
                    }
                    case 6 -> {
                        System.out.println("6. Keypad tones");
                        tones();
                    }
                    case 7 -> {
                        System.out.println("7. Warning and game tones");
                        tones();
                    }
                    case 8 -> {
                        System.out.println("8. Vibrating alert");
                        tones();
                    }
                    case 9 -> {
                        System.out.println("9. Screen saver");
                        tones();
                    }
                    case 0 -> mainMenu();
                    default -> switchOff();
                }


    }

    private void settings() {
            System.out.println("Press 1 to see Setting lists: ");
            int settingList = input.nextInt();
        System.out.println("""
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                """);

            System.out.println("Choose from 1-4 to pick a Setting or press 0 to go back or press 00 to switchOff: ");
            int settingsOption = input.nextInt();
            switch (settingsOption) {
                case 1 -> {
                    System.out.println("1. Call settings");
                    System.out.println("Press 1 to see Call settings: ");
                    int call = input.nextInt();
                    System.out.println("""
                            1. Automatic redial
                            2. Speed dialling
                            3. Call waiting options
                            4. Own number sending
                            5. Phone line in use
                            6. Automatic answer
                            """);

                    System.out.println("Choose from 1-6 to pick a Call settings: ");
                    int callSetting = input.nextInt();
                    switch (callSetting) {
                        case 1 -> {
                            System.out.println("1. Automatic redial");
                            settings();
                        }
                        case 2 -> {
                            System.out.println("2. Speed dialling");
                            settings();
                        }
                        case 3 -> {
                            System.out.println("3. Call waiting options");
                            settings();
                        }
                        case 4 -> {
                            System.out.println("4. Own number sending");
                            settings();
                        }
                        case 5 -> {
                            System.out.println("5. Phone line in use");
                            settings();
                        }
                        case 6 -> {
                            System.out.println("6. Automatic answer");
                            settings();
                        }
                    }
                }
                case 2 -> {
                    System.out.println("2. Phone settings");
                    System.out.println("Press 1 to see Phone settings: ");
                    int phone = input.nextInt();
                    System.out.println("""
                            1. Language
                            2. Cell info display
                            3. Welcome note
                            4. Network selection
                            5. Lights
                            6. Confirm SIM service actions
                            """);


                    System.out.println("Choose from 1-6 to pick a phone setting: ");
                    int phoneSettings = input.nextInt();
                    switch (phoneSettings) {
                        case 1 -> {
                            System.out.println("1. Language");
                            settings();
                        }
                        case 2 -> {
                            System.out.println("2. Cell info display");
                            settings();
                        }
                        case 3 -> {
                            System.out.println("3. Welcome note");
                            settings();
                        }
                        case 4 -> {
                            System.out.println("4. Network selection");
                            settings();
                        }
                        case 5 -> {
                            System.out.println("5. Lights");
                            settings();
                        }
                        case 6 -> {
                            System.out.println("6. Confirm SIM service actions");
                            settings();
                        }
                    }
                }
                case 3 -> {
                    System.out.println("3. Security settings");
                    System.out.println("Press 1 to see Security settings: ");
                    int security = input.nextInt();
                    System.out.println("""
                            1. PIN code request
                            2. Call barring service
                            3. Fixed dialling
                            4. Closed user group
                            5. Phone security
                            6. Change access codes
                            """);

                    System.out.println("Choose from 1-6 to pick a Security setting: ");
                    int securitySettings = input.nextInt();
                    switch (securitySettings) {
                        case 1 -> {
                            System.out.println("1. PIN code request");
                            settings();
                        }
                        case 2 -> {
                            System.out.println("2. Call barring service");
                            settings();
                        }
                        case 3 -> {
                            System.out.println("3. Fixed dialling");
                            settings();
                        }
                        case 4 -> {
                            System.out.println("4. Closed user group");
                            settings();
                        }
                        case 5 -> {
                            System.out.println("5. Phone security");
                            settings();
                        }
                        case 6 -> {
                            System.out.println("6. Change access codes");
                            settings();
                        }
                    }

                }
                case 4 -> {
                    System.out.println("4. Restore factory settings");
                    settings();
                }

                case 0 -> mainMenu();
                default -> switchOff();
            }

    }

    private void callDivert() {
        System.out.println("Press 1 to enter call divert or press 0 to go back or press 00 to switch off: ");
        int divertOption = input.nextInt();
        switch (divertOption){
            case 1 -> System.out.println("Call divert");
            case 0 -> mainMenu();
            default -> switchOff();
        }
    }

    private void games(){
        System.out.println("Press 1 to play games or press 0 to go back or press 00 to switch off: ");
        int gameOption = input.nextInt();
        switch (gameOption) {
            case 1 -> System.out.println("Games");
            case 0 -> mainMenu();
            default -> switchOff();
        }
    }

    private void calculator(){
        System.out.println("Press 1 to use calculator or press 0 to go back or press 00 to switch off: ");
        int calculatorOption = input.nextInt();
        switch (calculatorOption) {
            case 1 -> System.out.println("Calculator");
            case 0 -> mainMenu();
            default -> switchOff();
        }

    }

    private void reminders(){
        System.out.println("Press 1 for reminders or press 0 to go back or press 00 to switch off: ");
        int reminderOption = input.nextInt();
        switch (reminderOption){
            case 1 -> System.out.println("Reminders");
            case 0 -> mainMenu();
            default -> switchOff();
        }
    }

    private void clock() {
            System.out.println("Press 1 to see the Clock lists: ");
            int clockLists = input.nextInt();
        System.out.println("""
                1. Alarm clock
                2. Clock settings
                3. Date settings
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                """);

            System.out.println("Choose from 1-6 to pick a Clock list or press 0 to go back or press 00 to switch off: ");
            int clockOption = input.nextInt();
            switch (clockOption) {
                case 1 -> {
                    System.out.println("1. Alarm clock");
                    clock();
                }
                case 2 -> {
                    System.out.println("2. Clock settings");
                    clock();
                }
                case 3 -> {
                    System.out.println("3. Date setting");
                    clock();
                }
                case 4 -> {
                    System.out.println("4. Stopwatch");
                    clock();
                }
                case 5 -> {
                    System.out.println("5. Countdown timer");
                    clock();
                }
                case 6 -> {
                    System.out.println("6. Auto update of date and time");
                    clock();
                }

                case 0 -> mainMenu();
                default -> switchOff();
            }


    }

    private void profiles(){
        System.out.println("Press 1 to see profiles or press 0 to go back or press 00 to switch off: ");
        int profileOption = input.nextInt();
        switch (profileOption) {
            case 1 -> System.out.println("Profiles");
            case 0 -> mainMenu();
            default -> switchOff();
        }
    }

    private void simServices() {
        System.out.println("Press 1 for SIM services or press 0 to go back or press 00 to switch off: ");
        int simServiceOption = input.nextInt();
        switch (simServiceOption){
            case 1 -> System.out.println("SIM services");
            case 0 -> mainMenu();
            default -> switchOff();
        }
    }

    public void switchOff(){
        System.out.println("Good bye!");
        int option = input.nextInt();
    }




}
