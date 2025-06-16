package main

import "fmt"

// 접근 제어자는 대소분자로 구분 -> 변수와 메서드 모두 해당
// 대문자 : public   -> 외부 패키지 접근 가능
// 소문자 : private  -> 외부 패키지 접근 불가

type Rectangle struct {
	Width float64
	Height float64
	point int64
}

// Area() 외부 패키지에서 접근 가능
func (r Rectangle) Area() float64 { 
	return r.Width * r.Height
}

// point() 외부에서 접근 불가
func (r Rectangle) get_point() float64 {
	return float64(r.point)
}

func main(){
	rect := Rectangle{
		Width: 5,
		Height: 10,
		point: 4,
	}

	p := rect.get_point()
	fmt.Println(p)
}