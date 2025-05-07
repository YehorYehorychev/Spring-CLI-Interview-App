package com.yehorychev.interviewapp.components;

public class ComponentDependsOnAAndB {
    private final ComponentA componentA;
    private final ComponentB componentB;

    public ComponentDependsOnAAndB(ComponentA bean1, ComponentB bean2) {
        this.componentA = bean1;
        this.componentB = bean2;
    }

    public void printMessage() {
        componentA.printMessage();
        componentB.printMessage();
        System.out.println("Message from class: " + getClass().getName());
    }
}
