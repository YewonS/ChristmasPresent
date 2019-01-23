package ChristmasPresentItem;

import java.util.Scanner;

public class MainScreen {

    static ChristmasGift poster = new ChristmasGift("우리가족", "København 포스터");
    static ChristmasGift hyggeBag = new ChristmasGift("장워니", "Hygge 에코백");
    static ChristmasGift chokolades = new ChristmasGift("답십리 식구들", "초콜렛");
    static ChristmasGift hudaBeauty = new ChristmasGift("쩡뚜", "후다뷰티 리퀴드립");
    static ChristmasGift hyggeShirt = new ChristmasGift("수영이", "Hygge 티셔츠");
    static ChristmasGift currywurst = new ChristmasGift("수화니", "Curry Heini's 커리부어스트 소스");
    static ChristmasGift legoKeyRing = new ChristmasGift("철원 or 현택", "배트맨 / 아이언맨 레고 키링");

    static ChristmasGift[] christmasGift = {poster, hyggeBag, chokolades, hudaBeauty, hyggeShirt, currywurst, legoKeyRing};


    public static void drawSanta(){

        System.out.println("          ____  ");
        System.out.println("        {} _  \\ ");
        System.out.println("           |__ \\");
        System.out.println("          /_____\\ ");
        System.out.println("          \\o o)\\) _______");
        System.out.println("          (<  ) /#######\\");
        System.out.println("       __{'~` }#########| ");
        System.out.println("      /  {   _}_/########|");
        System.out.println("     /   {  / _|#/ )####|");
        System.out.println("    /   \\_~/ /_ \\  |####|");
        System.out.println("    \\______\\/  \\ | |####|");
        System.out.println("     \\__________\\|/#####|");
        System.out.println("      |__[X]_____/ \\###/ ");
        System.out.println("      /___________\\");
        System.out.println("       |    |/    | ");
        System.out.println("       |___/ |___/ ");
        System.out.println("      _|   /_|   / ");
        System.out.println("     (___,_(___,_) ");

    }

    public static void mainScreen(){

        System.out.println();
        drawSanta();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("   크리스마스 & 새해 선물의 주인이 누구일까요?");
        System.out.println("-----------------------------------------");
        System.out.println();

    }

    public static void viewOption(){

        System.out.println();
        System.out.println("다음은 선물 리스트입니다. 각 번호를 입력하면 해당 선물의 주인이 누구인지 알려드립니다.");
        System.out.println("번호를 입력해주세요: ");
        System.out.println();
        int i = 1;
        for(ChristmasGift christmasGiftItem: christmasGift){
            System.out.println(i + ". " + christmasGiftItem.getGift());
            i++;
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        result(option);

    }

    public static void result(int option){

        switch(option){
            case 1:
                System.out.println("선물의 주인은 : " + christmasGift[0].getName() + " 입니다.");
                viewOption();
                break;
            case 2:
                System.out.println("선물의 주인은 : " + christmasGift[1].getName() + " 입니다.");
                viewOption();
                break;
            case 3:
                System.out.println("선물의 주인은 : " + christmasGift[2].getName() + " 입니다.");
                viewOption();
                break;
            case 4:
                System.out.println("선물의 주인은 : " + christmasGift[3].getName() + " 입니다.");
                viewOption();
                break;
            case 5:
                System.out.println("선물의 주인은 : " + christmasGift[4].getName() + " 입니다.");
                viewOption();
                break;
            case 6:
                System.out.println("선물의 주인은 : " + christmasGift[5].getName() + " 입니다.");
                viewOption();
                break;
            case 7:
                System.out.println("선물의 주인은 : " + christmasGift[6].getName() + " 입니다.");
                System.out.println("어떤 키링을 원하는지는 철원이와 현택이가 이야기해서 정하세요.");
                viewOption();
                break;
            default:
                System.out.println("잘못된 입력값입니다. 다시 시도해 주세요.");
                viewOption();
        }

    }


}
