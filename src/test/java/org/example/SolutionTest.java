package org.example;

import org.example.tasks.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void numJewelsInStones_JewelsAreInStones_Success() {
        Assert.assertEquals(6, Solution.numJewelsInStones("Aaa", "AAaaqzz"));
    }

    @Test
    public void numJewelsInStones_JewelsAreNotInStones() {
        Assert.assertEquals(0, Solution.numJewelsInStones("z", "ZZZ"));
    }

    @Test
    public void numIdenticalPairs_ArrayHasGoodPairs() {
        Assert.assertEquals(4, Solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
    @Test
    public void numIdenticalPairs_ArrayOnlyHasGoodPairs() {
        Assert.assertEquals(6, Solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }
    @Test
    public void numIdenticalPairs_ArrayHasNoGoodPairs() {
        Assert.assertEquals(0, Solution.numIdenticalPairs(new int[]{1,2,3}));
    }
    @Test
    public void maxNumberOfBalloons_TextConsistsWordBalloon(){
        Assert.assertEquals(2, Solution.maxNumberOfBalloons("ballutloonballllootryn"));
    }
    @Test
    public void maxNumberOfBalloons_TextDoesntConsistWordBalloon(){
        Assert.assertEquals(0, Solution.maxNumberOfBalloons("baloon"));
    }
}
