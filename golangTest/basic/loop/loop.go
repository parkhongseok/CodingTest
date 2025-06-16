package main

import "fmt"

func main() {
	// 1. 기본 for 루프
	fmt.Println("=== 기본 for 루프 ===")
	for i := 0; i < 5; i++ {
		fmt.Println("i =", i)
	}

	// 2. while처럼 쓰기
	fmt.Println("=== while처럼 쓰기 ===")
	x := 3
	for x > 0 {
		fmt.Println("x =", x)
		x--
	}

	// 3. 무한 루프 (break 필수)
	fmt.Println("=== 무한 루프 ===")
	cnt := 0
	for {
		fmt.Println("무한 루프 중, cnt =", cnt)
		if cnt == 5 {
			break
		}
		cnt++
	}

}