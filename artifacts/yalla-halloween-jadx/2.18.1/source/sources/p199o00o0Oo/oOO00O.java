package p199o00o0Oo;

import android.view.MotionEvent;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f33215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f33216OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f33217OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00O000o f33218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f33219OooO0o0;

    public final void OooO00o(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - this.f33215OooO00o;
        float rawY = motionEvent.getRawY() - this.f33216OooO0O0;
        float fAbs = Math.abs(rawX);
        float fAbs2 = Math.abs(rawY);
        if (!(rawX == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            if (!(rawY == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                if (rawX > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    if (rawY > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (fAbs2 > fAbs) {
                            o00O000o o00o000o2 = this.f33218OooO0Oo;
                            Intrinsics.checkNotNull(o00o000o2);
                            o00o000o2.OooO0O0(motionEvent, fAbs2);
                            return;
                        } else {
                            o00O000o o00o000o3 = this.f33218OooO0Oo;
                            Intrinsics.checkNotNull(o00o000o3);
                            o00o000o3.OooO0o(motionEvent);
                            return;
                        }
                    }
                    if (fAbs2 > fAbs) {
                        o00O000o o00o000o4 = this.f33218OooO0Oo;
                        Intrinsics.checkNotNull(o00o000o4);
                        o00o000o4.OooO0Oo(motionEvent, -fAbs2);
                        return;
                    } else {
                        o00O000o o00o000o5 = this.f33218OooO0Oo;
                        Intrinsics.checkNotNull(o00o000o5);
                        o00o000o5.OooO0o(motionEvent);
                        return;
                    }
                }
                if (rawY > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    if (fAbs2 > fAbs) {
                        o00O000o o00o000o6 = this.f33218OooO0Oo;
                        Intrinsics.checkNotNull(o00o000o6);
                        o00o000o6.OooO0O0(motionEvent, fAbs2);
                        return;
                    } else {
                        o00O000o o00o000o7 = this.f33218OooO0Oo;
                        Intrinsics.checkNotNull(o00o000o7);
                        o00o000o7.OooO0o0(motionEvent);
                        return;
                    }
                }
                if (fAbs2 > fAbs) {
                    o00O000o o00o000o8 = this.f33218OooO0Oo;
                    Intrinsics.checkNotNull(o00o000o8);
                    o00o000o8.OooO0Oo(motionEvent, -fAbs2);
                    return;
                } else {
                    o00O000o o00o000o9 = this.f33218OooO0Oo;
                    Intrinsics.checkNotNull(o00o000o9);
                    o00o000o9.OooO0o0(motionEvent);
                    return;
                }
            }
        }
        if (rawX == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (!(rawY == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                if (rawY > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o00O000o o00o000o10 = this.f33218OooO0Oo;
                    Intrinsics.checkNotNull(o00o000o10);
                    o00o000o10.OooO0O0(motionEvent, fAbs2);
                } else {
                    o00O000o o00o000o11 = this.f33218OooO0Oo;
                    Intrinsics.checkNotNull(o00o000o11);
                    o00o000o11.OooO0Oo(motionEvent, fAbs2);
                }
            }
        }
        if (rawY == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (rawX == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return;
            }
            if (rawX > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                o00O000o o00o000o12 = this.f33218OooO0Oo;
                Intrinsics.checkNotNull(o00o000o12);
                o00o000o12.OooO0o(motionEvent);
            } else {
                o00O000o o00o000o13 = this.f33218OooO0Oo;
                Intrinsics.checkNotNull(o00o000o13);
                o00o000o13.OooO0o0(motionEvent);
            }
        }
    }
}
