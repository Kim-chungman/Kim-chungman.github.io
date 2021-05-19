---
layout:     post
title:      "Ubuntu_Linux_기본사용법"
subtitle:   " \"Linux Stuty\""
date:       2021-04-06 12:00
author:     "Chungman"
catalog: true
tags:
    - Linux_Study
---

## Linux 시작과 종료

< 시작과 종료 >


- 터미널과 콘솔에서 시스템 종료 명령실행 
- poweroff, shutdown -P now, halt -p, init0 실행

![image](https://user-images.githubusercontent.com/79954014/118771209-3efc8b80-b8bd-11eb-9e47-0edc8572bfd1.png)


- shutdown 명령어 옵션 중 now 부분에 시간을 지정하면 설정한 시간에 시스템이 종료됨

![image](https://user-images.githubusercontent.com/79954014/118771337-66535880-b8bd-11eb-9adb-3cc864995e3c.png)


< 우분투재부팅 >


- <컴퓨터끄기> 대신 <다시시작> 클릭 
- reboot, shutdown -r now, init6 명령으로도 재부팅 가능


< 로그아웃 >


- 리눅스는 여러 사용자가 동시에 접속하는 다중사용자(multiuser) 시스템
- 자신만 접속을 끝내는 로그아웃이 필요
- 만약 관리자가 자기 업무가 끝났다고 시스템을 종료해버리면, 시스템에 접속된 많은 사용자의 컴퓨터도 함께 종료됨 
- X 윈도우에서 로그아웃 : 바탕화면 오른쪽 위 ▼아이콘, <root>, <로그아웃>을 이어서 클릭
  
![image](https://user-images.githubusercontent.com/79954014/118771784-e974ae80-b8bd-11eb-8374-b1ca6eb508d0.png)


## shutdown 명령 실행


1. < 2번가상콘솔: root 사용자 >


- Ctrl + Alt + F2를 1초 정도 누르면 텍스트모드의 2번 가상콘솔이 나타남 
- root 사용자(비밀번호: password)로 접속하면 두번째 콘솔을 의미하는 ‘tty2’가 표시됨

![image](https://user-images.githubusercontent.com/79954014/118772102-4ec89f80-b8be-11eb-9a82-790147c95276.png)


2. < 3번가상콘솔: 우분투사용자 >


- Ctrl + Alt + F3을 눌러 텍스트모드의 3번 가상콘솔에서 ubuntu사용자(비밀번호: ubuntu)로 접속

![image](https://user-images.githubusercontent.com/79954014/118772350-9c450c80-b8be-11eb-9399-e17d669b01a4.png)


3. < 2번가상콘솔: root 사용자 > 


- 다시 Ctrl + Alt + F2 를 누르고 시스템을 5분 후에 종료하는 shutdown -h +5 명령 입력
- 5분 후 종료된다는 메시지를 확인한다.

![image](https://user-images.githubusercontent.com/79954014/118772528-d2828c00-b8be-11eb-99bb-87be38cbeedf.png)


4. < 3번가상콘솔: 우분투사용자 > 


- 다시 Ctrl + Alt + F3을 누르면 root 사용자에게 5분 후 종료된다는 메시지가 뜬다.
- Enter를 누르면 우분투 사용자는 현재 실행 중인 작업을 5분 동안 마무리 할 수 있다.
- 이 경고메시지는 매분 나타나며, 프롬프트를 보려면 Enter 누르면 된다.

![image](https://user-images.githubusercontent.com/79954014/118772837-28573400-b8bf-11eb-84fe-f6ee20a21ea5.png)


5. < 2번가상콘솔: root 사용자 >


- 다시 Ctrl + Alt + F2 누른다.
- 5분이 경과하기 전 shutdown -c 명령을 입력하면 예약된 시스템 종료 명령을 취소 가능하다.

![image](https://user-images.githubusercontent.com/79954014/118773060-62c0d100-b8bf-11eb-9beb-e0e7c01394e7.png)


6. < 3번가상콘솔: 우분투사용자 > 


- Ctrl + Alt + F3 을 눌러 3번 가상콘솔을 확인하면, shut down 명령 실행 취소 확인이 가능하다.

![image](https://user-images.githubusercontent.com/79954014/118773228-956ac980-b8bf-11eb-9310-578b38a04a01.png)


## shutdown -k 명령실행하기


1. < 2번가상콘솔: root 사용자 >


- Ctrl + Alt + F2 누르고 shutdown -k +10 명령 입력, 10분 후 시스템이 종료된다는 메시지가 나타나지만, 실제로는 종료되지않음.
- 다른 사람들에게 종료된다는 메시지만 보인다.

![image](https://user-images.githubusercontent.com/79954014/118773618-f72b3380-b8bf-11eb-8cf0-91c133d905b5.png)


2. < 3번가상콘솔: 우분투사용자 > 


- Ctrl + Alt + F3 눌러 3번 가상콘솔 확인, 우분투 사용자에게도 시스템이 종료된다는 메시지가 나타난다.
- Enter 누르면 프롬프트가 나오고 현재 작업을 마무리 할 수 있다.

![image](https://user-images.githubusercontent.com/79954014/118773881-2fcb0d00-b8c0-11eb-8513-d87ed35aad56.png)


3. shutdown -k +10 은 시간이 지나도 종료되지 않는다.


- 다만 10분 동안 1분에 한번씩 곧 시스템이 종료 될 것이다 하는 경고메시지를 준다. 
- 주어진 시간이 지나면 더 이상 경고메시지를 주지 않는다.


4. ctrl-alt-F3에서 exit, logout을 하고 종료하면 된다.

