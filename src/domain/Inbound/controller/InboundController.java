package domain.Inbound.controller;

import common.ValidCheck;
import dto.UserDto;

import java.util.Scanner;

public class InboundController {

    private final ValidCheck validCheck;
    private final InboundCheckController inboundCheckController;
    private final InboundSearchController inboundSearchController;
    private final InboundInsertController inboundInsertController;
    private final InboundDeleteController inboundDeleteController;


    Scanner sc = new Scanner(System.in);

    public InboundController(ValidCheck validCheck, InboundCheckController inboundCheckController, InboundSearchController inboundSearchController, InboundInsertController inboundInsertController, InboundDeleteController inboundDeleteController) {
        this.validCheck = validCheck;
        this.inboundCheckController = inboundCheckController;
        this.inboundSearchController = inboundSearchController;
        this.inboundInsertController = inboundInsertController;
        this.inboundDeleteController = inboundDeleteController;

    }


    /**
     * 관리자 입고관리 메인
     */
    public void inboundAdminMain() {
        System.out.println("관리자 입고관리입니다.");
        System.out.println("1.입고요청확인 2.현황조회 3.나가기");
        int a = validCheck.inputNumRegex();
        switch (a){
            case 1: inboundCheckController.check(); break;
            case 2:
                System.out.println("1.전체조회 2. 업체별조회 3.나가기 ");
                a = validCheck.inputNumRegex();
                switch (a){
                    case 1:inboundSearchController.SearchAll(); break;
                    case 2:inboundSearchController.SearchOne(); break;
                }
            case 3: break;
        }

    }

    /**
     *회원 입고관리 메인
     */
    public void inboundUserMain(UserDto userDto) {

        System.out.println("회원 입고관리입니다.");
        System.out.println("1.입고요청 2.입고요청취소 3.현황조회");
        int a = validCheck.inputNumRegex();
        switch (a){
            case 1:inboundInsertController.insertrun(userDto); break;
            case 2:inboundDeleteController.delete(userDto); break;
            case 3:inboundSearchController.userSearchAll(userDto); break;
        }
    }


}
