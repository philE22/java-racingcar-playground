## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

## 문자열 덧셈 계산기

---
1. ',' ':' 을 구분자로 가지는 문자열을 받으면 기준으로 분리한 숫자의 합을 반환
2. 문자열 앞에 // \n 사이에 위치하는 문자열이 있으면 커스텀 가능
3. 계산기에 숫자 이외의 값 또는 음수가 오면 RuntimeException

### 기능 요구사항
1. , 혹은 : 을 기준으로 나눈다
2. 앞에 //, \n 이 있으면 커스텀 구분자를 사용한다.
3. "", null 이 들어오면 0 반환


## 자동차 경주 게임

---
기능 요구사항
1. 0 ~ 9 사이의 숫자의 랜덤 생성 기능
2. 4가 넘는지 확인하는 기능
3. , 기준으로 들어온 값을 이름으로 자동차로 만듦
4. 이름이 5자 초과하면 에러
5. 시도할 회수를 입력받음
6. 가장 멀리 이동한 자동차를 반환하는 기능












