package org.example;

import org.example.tasks.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void jewelsShouldBeInStones() {

        Assert.assertEquals(6, Solution.numJewelsInStones("Aaa",
                "AAaaqzz"));

    }

    @Test
    public void jewelsAreNotInStones() {
        Assert.assertEquals(0, Solution.numJewelsInStones("z",
                "ZZZ"));
    }

    @Test
    public void arrayHasGoodPairs() {
        Assert.assertEquals(4, Solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
    @Test
    public void arrayHasOnlyGoodPairs() {
        Assert.assertEquals(6, Solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }
    @Test
    public void noGoodPairsInArray() {
        Assert.assertEquals(0, Solution.numIdenticalPairs(new int[]{1,2,3}));
    }
    @Test
    public void textShouldHaveBalloon(){
        Assert.assertEquals(2, Solution.maxNumberOfBalloons("ballutloonballllootryn"));
    }
    @Test
    public void textShouldHaveNoBalloon(){
        Assert.assertEquals(0, Solution.maxNumberOfBalloons("baloon"));
    }
}
