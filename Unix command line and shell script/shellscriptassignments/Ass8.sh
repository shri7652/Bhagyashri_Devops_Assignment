#!/bin/bash

read -p "Yourname?" name
read -p "yourlastname?" lname
read -p "AGE?" Age 
echo "greetings $name $lname"
fage=$(($age+10))
echo "ur age in 10 years would be" $fage


