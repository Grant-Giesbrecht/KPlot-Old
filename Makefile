#Makefile for java KPlot and tests

all: Example1.class Example1.java KPlot.class
	java Example1

Example1.class: Example1.java
	javac Example1.java
