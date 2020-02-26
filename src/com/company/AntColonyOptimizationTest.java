package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AntColonyOptimizationTest {
        @Test
        public void testGenerateRandomMatrix() {
            AntColonyOptimization antTSP = new AntColonyOptimization(5);
            Assert.assertNotNull(antTSP.generateRandomMatrix(5));
        }

        @Test
        public void testStartAntOptimization() {
            AntColonyOptimization antTSP = new AntColonyOptimization(5);
            Assert.assertNotNull(antTSP.solve());
        }

}