package com.app.selectPicture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.booking.rtlviewpager.RtlViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116o00O0OOo.OooOO0O;
import p116o00O0OOo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u001d\b\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001c\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/app/selectPicture/view/HackyViewPager;", "Lcom/booking/rtlviewpager/RtlViewPager;", "Lo00O0OOo/OooOOO;", "Oooooo0", "Lo00O0OOo/OooOOO;", "getTouchManage", "()Lo00O0OOo/OooOOO;", "setTouchManage", "(Lo00O0OOo/OooOOO;)V", "touchManage", "Landroid/view/GestureDetector;", "Oooooo", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "setGestureDetector", "(Landroid/view/GestureDetector;)V", "gestureDetector", "", "OoooooO", "Z", "getCanScroll", "()Z", "setCanScroll", "(Z)V", "canScroll", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LibSelectPicture_release"}, k = 1, mv = {1, 8, 0})
public final class HackyViewPager extends RtlViewPager {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OooOOO touchManage;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name and from kotlin metadata */
    public boolean canScroll;

    public HackyViewPager(@Nullable Context context) {
        super(context);
        this.canScroll = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        OooOOO oooOOO = this.touchManage;
        if (oooOOO != null) {
            Intrinsics.checkNotNullParameter(ev, "ev");
            if (oooOOO.f36569OooO0Oo != null) {
                int action = ev.getAction();
                if (action == 0) {
                    OooOO0O oooOO0O = oooOOO.f36569OooO0Oo;
                    Intrinsics.checkNotNull(oooOO0O);
                    oooOO0O.OooO00o(ev);
                    oooOOO.f36566OooO00o = ev.getRawX();
                    oooOOO.f36567OooO0O0 = ev.getRawY();
                    ev.getX();
                    oooOOO.f36568OooO0OO = ev.getY();
                } else if (action == 1) {
                    OooOO0O oooOO0O2 = oooOOO.f36569OooO0Oo;
                    Intrinsics.checkNotNull(oooOO0O2);
                    oooOO0O2.OooO0Oo(ev);
                    if (oooOOO.f36570OooO0o0) {
                        oooOOO.OooO00o(ev);
                    }
                } else if (action == 2 && !oooOOO.f36570OooO0o0) {
                    oooOOO.OooO00o(ev);
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
    public final OooOOO getTouchManage() {
        return this.touchManage;
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

    public final void setTouchManage(@Nullable OooOOO oooOOO) {
        this.touchManage = oooOOO;
    }

    public HackyViewPager(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.canScroll = true;
    }
}
