package main

import "fmt"

func main() {
	num := 7

	if num%2 == 0 {
		fmt.Println("짝수입니다.")
	} else if num%2 != 0 && num < 10 {
		fmt.Println("10보다 작은 홀수입니다.")
	} else {
		fmt.Println("기타입니다.")
	}

	// 조건식 내에서 변수 선언도 가능
	if another := 42; another > 40 {
		fmt.Println("another는 40보다 큽니다.")
	}
}