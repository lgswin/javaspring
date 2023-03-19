# 생략가능한 구문
* 초기화식 생략 가능
```
int i = 0;
for(; i < 10 ; ++) {
...
}
```

* 조건식 생략 가능
```
for(i = 0; ; i++) {
    sum += i;
    if(sum>200) break;
}
```

* 증감식 생략 가능
```
for(i = 0; i < 5 ;) {
    ...
    i = (++i) %10;
}
```

# continue
* 1부터 100까지 숫자중 3의 배수만 출력 -> 3의 배수가 아니면 pass 하고 3의 배수이면 출력
 ```
 int num;
 for (num = 1; num <=100; num++') {
    if (num%3) != 0) continue;
    System.out.println(num);
 }
 ```

