package main

import "fmt"

// 상속 => 구조체 임베딩(struct embedding)을 통한 조합(composition)으로 대체
// [link] https://gobyexample.com/struct-embedding

type base struct {
	num int
}

func (b base) describe() string {
	return fmt.Sprintf("base with num=%v", b.num)
}

type container struct {
	base
	str string
}

func main(){

	co := container{
		base: base{
			num: 1,
		},
		str: "hello world",
	}
	fmt.Printf("co={num: %v, str: %v}\n", co.num, co.str)
	fmt.Println("also num:", co.base.num)
	fmt.Println("describe:", co.describe())
	
	type describer interface {
			describe() string
	}

	var d describer = co
	fmt.Println("describer:", d.describe())
}