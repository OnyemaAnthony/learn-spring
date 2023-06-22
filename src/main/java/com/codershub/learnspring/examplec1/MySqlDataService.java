package com.codershub.learnspring.examplec1;

public class MySqlDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
}
