package com.app.selectPicture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.booking.rtlviewpager.RtlViewPager;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p199o00o0Oo.o00O000o;
import p199o00o0Oo.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001b\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/app/selectPicture/view/HackyViewPager;", "Lcom/booking/rtlviewpager/RtlViewPager;", "Landroid/view/GestureDetector;", "o0000O00", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "setGestureDetector", "(Landroid/view/GestureDetector;)V", "gestureDetector", "", "o0000oo", "Z", "getCanScroll", "()Z", "setCanScroll", "(Z)V", "canScroll", "Lo00o0Oo/oOO00O;", "touchManage", "Lo00o0Oo/oOO00O;", "getTouchManage", "()Lo00o0Oo/oOO00O;", "setTouchManage", "(Lo00o0Oo/oOO00O;)V", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LibSelectPicture_release"}, k = 1, mv = {1, 7, 1})
public final class HackyViewPager extends RtlViewPager {

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    @Nullable
    public oOO00O f12332o0000;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name and from kotlin metadata */
    public boolean canScroll;

    public HackyViewPager(@Nullable Context context) {
        super(context);
        this.canScroll = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        oOO00O ooo00o = this.f12332o0000;
        if (ooo00o != null) {
            Intrinsics.checkNotNullParameter(ev, "ev");
            if (ooo00o.f33218OooO0Oo != null) {
                int action = ev.getAction();
                if (action == 0) {
                    o00O000o o00o000o2 = ooo00o.f33218OooO0Oo;
                    Intrinsics.checkNotNull(o00o000o2);
                    o00o000o2.OooO00o(ev);
                    ooo00o.f33215OooO00o = ev.getRawX();
                    ooo00o.f33216OooO0O0 = ev.getRawY();
                    ev.getX();
                    ooo00o.f33217OooO0OO = ev.getY();
                } else if (action == 1) {
                    o00O000o o00o000o3 = ooo00o.f33218OooO0Oo;
                    Intrinsics.checkNotNull(o00o000o3);
                    o00o000o3.OooO0OO(ev);
                    if (ooo00o.f33219OooO0o0) {
                        ooo00o.OooO00o(ev);
                    }
                } else if (action == 2 && !ooo00o.f33219OooO0o0) {
                    ooo00o.OooO00o(ev);
                }
            }
        }
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    public final boolean getCanScroll() {
        return this.canScroll;
    }

    @Nullable
    public final GestureDetector getGestureDetector() {
        return this.gestureDetector;
    }

    @Nullable
    /* JADX INFO: renamed from: getTouchManage, reason: from getter */
    public final oOO00O getF12332o0000() {
        return this.f12332o0000;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        try {
            return this.canScroll && super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        try {
            return this.canScroll && super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void setCanScroll(boolean z) {
        this.canScroll = z;
    }

    public final void setGestureDetector(@Nullable GestureDetector gestureDetector) {
        this.gestureDetector = gestureDetector;
    }

    public final void setTouchManage(@Nullable oOO00O ooo00o) {
        this.f12332o0000 = ooo00o;
    }

    public HackyViewPager(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.canScroll = true;
    }
}
