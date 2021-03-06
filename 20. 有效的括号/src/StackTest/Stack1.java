package StackTest;

import java.util.EmptyStackException;
import java.util.Stack;

/*
 * 栈是Vector的子类，它实现了一个标准的后进先出的栈。
 * 堆栈之定义了默认的构造函数，用来创建一个空栈。
 * 
 *打印出栈的内容类似于一个数组的形式
 *stack[42, 66, 99]
 * 
 * 
 */
public class Stack1 {
	static void showPush(Stack<Integer> st,int a){
		st.push(new Integer(a));
		System.out.println("push( "+a  +" )");
		System.out.println("stack"+ st);
	}
	static void showpop(Stack<Integer> st){
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack"+st);
	}
	public static void main(String[] args){
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("statck"+st);
		showPush(st,42);
		showPush(st,66);
		showPush(st,99);
		showpop(st);
		showpop(st);
		showpop(st);
		try{
			showpop(st);
		}catch(EmptyStackException e){
			System.out.println("Empty Stack");
		}
	}
}
