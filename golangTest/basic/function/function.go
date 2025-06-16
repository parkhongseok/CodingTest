package main

import "fmt"

func Add(x, y int) int {
	return x + y
}

func main(){
	result := Add(3, 3)

	fmt.Println(result) 
}