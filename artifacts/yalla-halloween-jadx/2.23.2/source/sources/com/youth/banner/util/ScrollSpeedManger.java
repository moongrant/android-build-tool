package com.youth.banner.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00oO0o;
import androidx.viewpager2.widget.ViewPager2;
import com.youth.banner.Banner;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class ScrollSpeedManger extends LinearLayoutManager {
    private Banner banner;

    public ScrollSpeedManger(Banner banner, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        super(banner.getContext(), linearLayoutManager.getOrientation(), false);
        this.banner = banner;
    }

    public static void reflectLayoutManager(Banner banner) {
        if (banner.getScrollTime() < 100) {
            return;
        }
        try {
            ViewPager2 viewPager2 = banner.getViewPager2();
            RecyclerView recyclerView = (RecyclerView) viewPager2.getChildAt(0);
            recyclerView.setOverScrollMode(2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            ScrollSpeedManger scrollSpeedManger = new ScrollSpeedManger(banner, recyclerView, linearLayoutManager);
            recyclerView.setLayoutManager(scrollSpeedManger);
            Field declaredField = RecyclerView.Oooo000.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            declaredField.set(linearLayoutManager, recyclerView);
            Field declaredField2 = ViewPager2.class.getDeclaredField("mLayoutManager");
            declaredField2.setAccessible(true);
            declaredField2.set(viewPager2, scrollSpeedManger);
            Field declaredField3 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
            declaredField3.setAccessible(true);
            Object obj = declaredField3.get(viewPager2);
            if (obj != null) {
                Field declaredField4 = obj.getClass().getDeclaredField("mLayoutManager");
                declaredField4.setAccessible(true);
                declaredField4.set(obj, scrollSpeedManger);
            }
            Field declaredField5 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
            declaredField5.setAccessible(true);
            Object obj2 = declaredField5.get(viewPager2);
            if (obj2 != null) {
                Field declaredField6 = obj2.getClass().getDeclaredField("mLayoutManager");
                declaredField6.setAccessible(true);
                declaredField6.set(obj2, scrollSpeedManger);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        o00oO0o o00oo0o2 = new o00oO0o(recyclerView.getContext()) { // from class: com.youth.banner.util.ScrollSpeedManger.1
            @Override // androidx.recyclerview.widget.o00oO0o
            public int calculateTimeForDeceleration(int i2) {
                return ScrollSpeedManger.this.banner.getScrollTime();
            }
        };
        o00oo0o2.setTargetPosition(i);
        startSmoothScroll(o00oo0o2);
    }
}
