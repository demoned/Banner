package com.bojun.bannerview.constants;

import com.bojun.bannerview.BannerViewPager;

public interface PageStyle {

    int NORMAL = 0;
    /**
     * @deprecated please use {@link BannerViewPager#setRevealWidth(int)} instead.
     */
    @Deprecated
    int MULTI_PAGE = 1 << 1;
    /**
     * Requires Api Version >= 21
     */
    int MULTI_PAGE_OVERLAP = 1 << 2;

    int MULTI_PAGE_SCALE = 1 << 3;
}
