package com.app.base.framework.view.viewPagerCycle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p151o00Oo0o.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public class ViewPagerCycle extends ViewPager {

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public float f11747o0000;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public float f11748o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public float f11749o00000oo;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public OooO00o f11750o0000O00;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public View f11751o0000Ooo;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public CloseMove f11752o0000oo;

    public enum CloseMove {
        CloseLeft,
        CloseRight,
        CloseLeftOrRight
    }

    public interface OooO00o {
        void OooO00o();
    }

    public ViewPagerCycle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11749o00000oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f11747o0000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final boolean OooOoo0(MotionEvent motionEvent) {
        if (this.f11752o0000oo == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f11748o00000oO;
        CloseMove closeMove = this.f11752o0000oo;
        if (closeMove == CloseMove.CloseLeft && x > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return true;
        }
        if (closeMove == CloseMove.CloseRight && x < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return true;
        }
        if (closeMove == CloseMove.CloseLeftOrRight && (x <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || x >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            return true;
        }
        this.f11748o00000oO = motionEvent.getX();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: Exception -> 0x0092, all -> 0x0096, TryCatch #1 {Exception -> 0x0092, blocks: (B:3:0x0001, B:36:0x008e, B:11:0x0012, B:13:0x0016, B:15:0x0030, B:16:0x0036, B:17:0x003b, B:20:0x0042, B:27:0x0069, B:29:0x006d, B:24:0x0062, B:26:0x0066, B:30:0x0071, B:32:0x0075, B:33:0x007b, B:35:0x008b), top: B:42:0x0001, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[Catch: Exception -> 0x0092, all -> 0x0096, TryCatch #1 {Exception -> 0x0092, blocks: (B:3:0x0001, B:36:0x008e, B:11:0x0012, B:13:0x0016, B:15:0x0030, B:16:0x0036, B:17:0x003b, B:20:0x0042, B:27:0x0069, B:29:0x006d, B:24:0x0062, B:26:0x0066, B:30:0x0071, B:32:0x0075, B:33:0x007b, B:35:0x008b), top: B:42:0x0001, outer: #0 }] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float fAbs;
        OooO00o oooO00o;
        View view;
        try {
            try {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (this.f11752o0000oo != null) {
                        this.f11748o00000oO = motionEvent.getX();
                    }
                    this.f11749o00000oo = motionEvent.getRawY();
                    this.f11747o0000 = motionEvent.getRawX();
                    View view2 = this.f11751o0000Ooo;
                    if (view2 != null) {
                        view2.setEnabled(false);
                    }
                } else if (action == 1) {
                    fAbs = Math.abs(motionEvent.getRawX() - this.f11747o0000);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.f11749o00000oo);
                    if ((fAbs >= 5.0f || fAbs2 < 5.0f) && (oooO00o = this.f11750o0000O00) != null) {
                        oooO00o.OooO00o();
                    }
                    view = this.f11751o0000Ooo;
                    if (view != null) {
                        view.setEnabled(true);
                    }
                } else if (action == 2) {
                    if (this.f11751o0000Ooo != null) {
                        if (Math.abs(motionEvent.getRawX() - this.f11747o0000) >= Math.abs(motionEvent.getRawY() - this.f11749o00000oo)) {
                            this.f11751o0000Ooo.setEnabled(false);
                        } else {
                            this.f11751o0000Ooo.setEnabled(true);
                        }
                    }
                    if (OooOoo0(motionEvent)) {
                        return true;
                    }
                } else if (action == 3) {
                    fAbs = Math.abs(motionEvent.getRawX() - this.f11747o0000);
                    float fAbs3 = Math.abs(motionEvent.getRawY() - this.f11749o00000oo);
                    if (fAbs >= 5.0f) {
                        oooO00o.OooO00o();
                    } else {
                        oooO00o.OooO00o();
                    }
                    view = this.f11751o0000Ooo;
                    if (view != null) {
                        view.setEnabled(true);
                    }
                }
                super.dispatchTouchEvent(motionEvent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } catch (Throwable unused) {
            return true;
        }
    }

    public void setCloseMove(CloseMove closeMove) {
        this.f11752o0000oo = closeMove;
    }

    public void setMyOnClick(OooO00o oooO00o) {
        this.f11750o0000O00 = oooO00o;
    }

    public void setOnPageChangeListener(o00Ooo o00ooo2) {
        super.setOnPageChangeListener((ViewPager.OooOOO0) null);
    }

    public void setViewParent(View view) {
        this.f11751o0000Ooo = view;
    }

    public ViewPagerCycle(Context context) {
        super(context);
        this.f11749o00000oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f11747o0000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }
}
