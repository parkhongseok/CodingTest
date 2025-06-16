package main

import "fmt"


func short_assignment(){
	// Short Assignment Statement (:=) ->  지역변수 선언 시 사용 가능
	temp := 1
	fmt.Println(temp)
}


func main(){
	fmt.Println("=== variables ===")
// var <변수명> <type> = <초기값>
var a int
fmt.Println("a:", a)

var f float32 = 15.
fmt.Println("f:", f)

var i, j, k int = 1, 2, 3
fmt.Println("i, j, k:", i, j, k)

var d = 5 // type 추론에 의한 생략 가능 -> 이땐 초기화 필요
fmt.Println("d:", d)
fmt.Println()

// constant
fmt.Println("=== constants ===")
const str = "hello \n my name is hh"

fmt.Println("str:", str)

const text = `hello \n
my name is hh`
fmt.Println("text: ", text)
fmt.Println()

const (
	plan_a = "golang1"
	plan_b = "golang2"
	plan_c = "golang3"
)

fmt.Println("plan_a:", plan_a)
fmt.Println("plan_b:", plan_b)
fmt.Println("plan_c:", plan_c)
fmt.Println()

const (
	num_1 = iota
	num_2
	num_3
)
fmt.Println("num_1:", num_1)
fmt.Println("num_2:", num_2)
fmt.Println("num_3:", num_3)
fmt.Println()



}