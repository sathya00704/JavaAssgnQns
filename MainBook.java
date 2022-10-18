import java.util.*;
class Publication
{
String title;
float price;
Scanner obj = new Scanner(System.in);

void getdata()
{
System.out.print("Enter title = ");
title = obj.next();
System.out.print("Enter price = ");
price = obj.nextFloat();
}

void putdata()
{
System.out.println("Title = " + title);
System.out.println("Price = " + price);
}

}

class Book extends Publication
{
int pages;

void getdata()
{
System.out.print("Enter number of pages = ");
pages = obj.nextInt();
}

void putdata()
{
System.out.println("Number of pages = " + pages);
}

}

class Tape extends Publication
{
float time;

void getdata()
{
System.out.print("Enter time (in mins) = ");
time = obj.nextFloat();
}

void putdata()
{
System.out.println("Time (in mins) = " + time);
}

}

class MainBook
{
public static void main(String args[])
{
Publication pub = new Publication();
Book[] arr = new Book[5];
Tape[] arr1 = new Tape[5];

pub.getdata();

for(int i=0;i<5;i++)
{
System.out.println("Instance-"+(i+1));

arr[i] = new Book();
arr[i].getdata();

arr1[i] = new Tape();
arr1[i].getdata();

System.out.println();
}

pub.putdata();
for(int i=0;i<5;i++)
{
arr[i].putdata();
arr1[i].putdata();
System.out.println();
}
}

}