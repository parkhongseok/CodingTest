package main

import "fmt"

func vals() (int, int, int) {
	return 13, 37, 101
}

func main() {
	a, b, _ := vals()
	fmt.Println("a:", a)
	fmt.Println("b:", b)

	_, _, c := vals()
	fmt.Println("c:", c)
}