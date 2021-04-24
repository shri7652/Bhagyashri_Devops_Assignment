#!/bin/bash
#script that runs three commands:

echo "79+29 is"
expr 79+29
echo $?


#remove a file that does not exist in the current directory
rm /mnt/c/Users/bhagy/shellscriptassignments

echo $?

echo "42-39 is"
expr 42-39 
echo $?

