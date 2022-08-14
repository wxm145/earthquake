package com.earthquake.map.vo;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;

/**
 * @author wangxiaomiao
 * @create 2022-08-14 18:55
 */
public class DepthAndMagnitude {
    private BigDecimal minDepth;
    private BigDecimal maxDepth;
    private BigDecimal minMagnitude;
    private BigDecimal maxMagnitude;

    public BigDecimal getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(BigDecimal minDepth) {
        this.minDepth = minDepth;
    }

    public BigDecimal getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(BigDecimal maxDepth) {
        this.maxDepth = maxDepth;
    }

    public BigDecimal getMinMagnitude() {
        return minMagnitude;
    }

    public void setMinMagnitude(BigDecimal minMagnitude) {
        this.minMagnitude = minMagnitude;
    }

    public BigDecimal getMaxMagnitude() {
        return maxMagnitude;
    }

    public void setMaxMagnitude(BigDecimal maxMagnitude) {
        this.maxMagnitude = maxMagnitude;
    }
}
