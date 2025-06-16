package main

import "fmt"

type Rectangle struct {
	Width  float64
	Height float64
}

// (r Rectangle)라는 receiver를 통해 구조체 밖에서 별도로 메서드 선언
func (r Rectangle) Area() float64 {
	return r.Width * r.Height
}


func main() {
	rectangle := Rectangle{
		Width: 10,
		Height: 5,
	}

	area := rectangle.Area()

	fmt.Println("area is", area)
}