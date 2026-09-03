package p057o0000OoO;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p273o0O00Oo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends OooOOO<OooOo00> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooOo f34223OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f34224OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f34225OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Object obj) {
        super(obj);
        OooOOO0.OooO00o oooO00o = OooOOO0.f41726OooOo00;
        this.f34223OooOOo = null;
        this.f34224OooOOoo = Float.MAX_VALUE;
        this.f34225OooOo00 = false;
    }

    public final void OooO0OO() {
        if (!(this.f34223OooOOo.f34215OooO0O0 > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f34194OooO0o) {
            this.f34225OooOo00 = true;
        }
    }
}
