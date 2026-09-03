package p116o00O0OOo;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f36566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f36567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f36568OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooOO0O f36569OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f36570OooO0o0;

    public final void OooO00o(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - this.f36566OooO00o;
        float rawY = motionEvent.getRawY() - this.f36567OooO0O0;
        float fAbs = Math.abs(rawX);
        float fAbs2 = Math.abs(rawY);
        if (!(rawX == 0.0f)) {
            if (!(rawY == 0.0f)) {
                if (rawX > 0.0f) {
                    if (rawY > 0.0f) {
                        if (fAbs2 > fAbs) {
                            OooOO0O oooOO0O = this.f36569OooO0Oo;
                            Intrinsics.checkNotNull(oooOO0O);
                            oooOO0O.OooO0O0(motionEvent, fAbs2);
                            return;
                        } else {
                            OooOO0O oooOO0O2 = this.f36569OooO0Oo;
                            Intrinsics.checkNotNull(oooOO0O2);
                            oooOO0O2.OooO0o(motionEvent);
                            return;
                        }
                    }
                    if (fAbs2 > fAbs) {
                        OooOO0O oooOO0O3 = this.f36569OooO0Oo;
                        Intrinsics.checkNotNull(oooOO0O3);
                        oooOO0O3.OooO0OO(motionEvent, -fAbs2);
                        return;
                    } else {
                        OooOO0O oooOO0O4 = this.f36569OooO0Oo;
                        Intrinsics.checkNotNull(oooOO0O4);
                        oooOO0O4.OooO0o(motionEvent);
                        return;
                    }
                }
                if (rawY > 0.0f) {
                    if (fAbs2 > fAbs) {
                        OooOO0O oooOO0O5 = this.f36569OooO0Oo;
                        Intrinsics.checkNotNull(oooOO0O5);
                        oooOO0O5.OooO0O0(motionEvent, fAbs2);
                        return;
                    } else {
                        OooOO0O oooOO0O6 = this.f36569OooO0Oo;
                        Intrinsics.checkNotNull(oooOO0O6);
                        oooOO0O6.OooO0o0(motionEvent);
                        return;
                    }
                }
                if (fAbs2 > fAbs) {
                    OooOO0O oooOO0O7 = this.f36569OooO0Oo;
                    Intrinsics.checkNotNull(oooOO0O7);
                    oooOO0O7.OooO0OO(motionEvent, -fAbs2);
                    return;
                } else {
                    OooOO0O oooOO0O8 = this.f36569OooO0Oo;
                    Intrinsics.checkNotNull(oooOO0O8);
                    oooOO0O8.OooO0o0(motionEvent);
                    return;
                }
            }
        }
        if (rawX == 0.0f) {
            if (!(rawY == 0.0f)) {
                if (rawY > 0.0f) {
                    OooOO0O oooOO0O9 = this.f36569OooO0Oo;
                    Intrinsics.checkNotNull(oooOO0O9);
                    oooOO0O9.OooO0O0(motionEvent, fAbs2);
                } else {
                    OooOO0O oooOO0O10 = this.f36569OooO0Oo;
                    Intrinsics.checkNotNull(oooOO0O10);
                    oooOO0O10.OooO0OO(motionEvent, fAbs2);
                }
            }
        }
        if (rawY == 0.0f) {
            if (rawX == 0.0f) {
                return;
            }
            if (rawX > 0.0f) {
                OooOO0O oooOO0O11 = this.f36569OooO0Oo;
                Intrinsics.checkNotNull(oooOO0O11);
                oooOO0O11.OooO0o(motionEvent);
            } else {
                OooOO0O oooOO0O12 = this.f36569OooO0Oo;
                Intrinsics.checkNotNull(oooOO0O12);
                oooOO0O12.OooO0o0(motionEvent);
            }
        }
    }
}
