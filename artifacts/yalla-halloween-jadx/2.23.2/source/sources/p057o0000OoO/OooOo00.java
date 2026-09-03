package p057o0000OoO;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p547o0oO0Ooo.u4;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends OooOOO<OooOo00> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooOo f33710OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f33711OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f33712OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Object obj) {
        super(obj);
        u4.OooO00o oooO00o = u4.f55830OooOo00;
        this.f33710OooOOo = null;
        this.f33711OooOOoo = Float.MAX_VALUE;
        this.f33712OooOo00 = false;
    }

    public final void OooO0OO() {
        if (!(this.f33710OooOOo.f33702OooO0O0 > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f33681OooO0o) {
            this.f33712OooOo00 = true;
        }
    }
}
