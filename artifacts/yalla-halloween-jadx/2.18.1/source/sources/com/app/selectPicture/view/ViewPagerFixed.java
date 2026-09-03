package com.app.selectPicture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.booking.rtlviewpager.RtlViewPager;

/* JADX INFO: loaded from: classes.dex */
public class ViewPagerFixed extends RtlViewPager {
    public ViewPagerFixed(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean OooO0Oo(View view, boolean z, int i, int i2, int i3) {
        if (view == this || !(view instanceof ViewPager)) {
            return super.OooO0Oo(view, z, i, i2, i3);
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ViewPagerFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
