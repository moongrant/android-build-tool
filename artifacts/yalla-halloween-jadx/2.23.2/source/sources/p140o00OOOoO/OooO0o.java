package p140o00OOOoO;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f37508OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f37509OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f37510OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO0O0 f37511OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f37512OooO0o0;

    public final void OooO00o(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - this.f37508OooO00o;
        float rawY = motionEvent.getRawY() - this.f37509OooO0O0;
        float fAbs = Math.abs(rawX);
        float fAbs2 = Math.abs(rawY);
        if (!(rawX == 0.0f)) {
            if (!(rawY == 0.0f)) {
                if (rawX > 0.0f) {
                    if (rawY > 0.0f) {
                        if (fAbs2 > fAbs) {
                            OooO0O0 oooO0O0 = this.f37511OooO0Oo;
                            Intrinsics.checkNotNull(oooO0O0);
                            oooO0O0.OooO0O0(motionEvent, fAbs2);
                            return;
                        } else {
                            OooO0O0 oooO0O1 = this.f37511OooO0Oo;
                            Intrinsics.checkNotNull(oooO0O1);
                            oooO0O1.OooO0o(motionEvent);
                            return;
                        }
                    }
                    if (fAbs2 > fAbs) {
                        OooO0O0 oooO0O2 = this.f37511OooO0Oo;
                        Intrinsics.checkNotNull(oooO0O2);
                        oooO0O2.OooO0OO(motionEvent, -fAbs2);
                        return;
                    } else {
                        OooO0O0 oooO0O3 = this.f37511OooO0Oo;
                        Intrinsics.checkNotNull(oooO0O3);
                        oooO0O3.OooO0o(motionEvent);
                        return;
                    }
                }
                if (rawY > 0.0f) {
                    if (fAbs2 > fAbs) {
                        OooO0O0 oooO0O4 = this.f37511OooO0Oo;
                        Intrinsics.checkNotNull(oooO0O4);
                        oooO0O4.OooO0O0(motionEvent, fAbs2);
                        return;
                    } else {
                        OooO0O0 oooO0O5 = this.f37511OooO0Oo;
                        Intrinsics.checkNotNull(oooO0O5);
                        oooO0O5.OooO0o0(motionEvent);
                        return;
                    }
                }
                if (fAbs2 > fAbs) {
                    OooO0O0 oooO0O6 = this.f37511OooO0Oo;
                    Intrinsics.checkNotNull(oooO0O6);
                    oooO0O6.OooO0OO(motionEvent, -fAbs2);
                    return;
                } else {
                    OooO0O0 oooO0O7 = this.f37511OooO0Oo;
                    Intrinsics.checkNotNull(oooO0O7);
                    oooO0O7.OooO0o0(motionEvent);
                    return;
                }
            }
        }
        if (rawX == 0.0f) {
            if (!(rawY == 0.0f)) {
                if (rawY > 0.0f) {
                    OooO0O0 oooO0O8 = this.f37511OooO0Oo;
                    Intrinsics.checkNotNull(oooO0O8);
                    oooO0O8.OooO0O0(motionEvent, fAbs2);
                } else {
                    OooO0O0 oooO0O9 = this.f37511OooO0Oo;
                    Intrinsics.checkNotNull(oooO0O9);
                    oooO0O9.OooO0OO(motionEvent, fAbs2);
                }
            }
        }
        if (rawY == 0.0f) {
            if (rawX == 0.0f) {
                return;
            }
            if (rawX > 0.0f) {
                OooO0O0 oooO0O10 = this.f37511OooO0Oo;
                Intrinsics.checkNotNull(oooO0O10);
                oooO0O10.OooO0o(motionEvent);
            } else {
                OooO0O0 oooO0O11 = this.f37511OooO0Oo;
                Intrinsics.checkNotNull(oooO0O11);
                oooO0O11.OooO0o0(motionEvent);
            }
        }
    }
}
