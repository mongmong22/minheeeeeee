# Git

## Git

**정의 - 분산 버전 관리 프로그램**

파일의 수정이력을 저장해 준다. 어디서든 쓸 수 있게끔 해당 정보를 분산하여 저장하기 때문에 한 pc에서 데이터가 소실되더라도 복구가 쉽다는 장점이 있다. 하지만, 버전이슈(충돌)나 용량문제가 생길 수도 있다는 문제점이 있다.

→ 충돌방지를 위해 pull하고 수정하기!

**3가지 공간으로 나누어진다.**

Working Directory : 현재 내가 작업을 하고 있는 곳. (분장실)

Staging Area : 기록으로 남기고 싶은 파일이 있는 곳. (무대)

Repository : 기록들이 저장되는 곳. (앨범)

**Remote Repository 원격 저장소**

gitlab, github, bitbucket 등

**README.md**

프로젝트에 대한 설명등을 적어두는 파일.

**.gitignore 폴더**

git이 관리할 필요가 없는 파일들을 둔다. 해당 폴더 안에 작성한 파일은 push를 해도 올라가지 않는다. → 참고사이트 : [https://gitignore.io/](https://gitignore.io/)

개인정보나 운영체제, IDE등에서 활용되는 파일 등을 선언한다.

## git bash (CLI(Command Line Interface))

폴더 생성 후 마우스 우클릭 → Git bash here

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8c65ac89-06af-4c24-9789-193f1b05904e/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a8e6b0f9-e60f-4ca4-85c5-f1d10e2b6781/Untitled.png)

touch : 파일생성
mkdir : 폴더를 생성
ls(list segment) : 현재 내가 위치한 디렉토리의 파일,폴더를 모두 확인
rm(remove) : 폴더 혹은 파일을 지움.
cd(change directory) : 디렉터리 이동
ctrl + L : git bash 초기화.

**관리를 위한 명령어**

git status : 위 3공간 전체를 아울러 상태를 확인하는 명령어

git init : 해당 폴더를 git으로 관리하겠다는 명령어로 .git이라는 폴더가 생성되어 기록이 저장된다.
(최상위 폴더에만 할 것. 하위 폴더는 자동으로 따라서 관리가 되고 있다.)

git add (파일/폴더/.) : 파일 등을 Working Directory 에서 Staging Area로 올리는 명령어 (.(점)은 모든내용을 올리고 싶을 때!)

git commit -m “파일”: Staging Area 에서 Repository로 기록을 남기는 명령.
→ name(작성자의 이름, 이메일), message 등 을 입력해야한다.
초기 설정 : $ git config --global [user.name](http://user.name/) "이름" $ git config --global user.email "메일 주소"
확인 : $ git config —global -I

git push : Repository에 있는 것을 깃허브, 깃랩 등 원격 저장소로 올릴 수 있음.
↔ 반대로 원격 저장소에서 가져오는 경우 pull.

git log : commit의 내역을 확인할 수 있음. (작성자,메세지, 시간 등)

---

### 마크다운 문법 연습해보기

[https://github.com/marktext/marktext](https://github.com/marktext/marktext)
