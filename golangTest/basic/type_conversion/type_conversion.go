package main

import "fmt"

func main(){
	var a int16 = 10
	// var b int32 = a 
	// Build Error: ... cannot use a (variable of type int16) as int32 value in variable declaration (exit status 1)
  var c int32 = int32(a)


	var d string = string(a)
	fmt.Println("d i= ", d)
	
	// conversion from int16 to string yields a string of one rune, not a string of digitsstringintconv...
	d = fmt.Sprint(a)
	fmt.Println("d = ", d)
	
	// fmt.Println(c+a)
	// invalid operation: c + a (mismatched types int32 and int16)compilerMismatchedTypes

	fmt.Println("c + a = ", c + int32(a))
}