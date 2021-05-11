#!/bin/bash


echo "This are the items in the menu, please select any one"

echo "1.Tomato Soup"
echo "2.Chicken Noodles"
echo "3.Mango Milkshake "

read -p "What would you like to have?" choice

case $choice in	
	"1") echo "Your tomato soup would be right with you"
	 ;;
	"2") echo "Your Chicken soup would be right with you"
	 ;;
	 "3") echo "Your Mango milkshake would be right with you"
	 ;;
	 *) echo "Please select from the menu"
 esac
												   
