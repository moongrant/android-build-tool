package o000OOO;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import o0OOO0O0.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooO0O0<OooO0o> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooO f28280OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f28281OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f28282OooOo00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(Object obj) {
        super(obj);
        OooO0OO oooO0OO = OooOO0O.f38076Ooooo0o;
        this.f28280OooOOo = null;
        this.f28281OooOOoo = Float.MAX_VALUE;
        this.f28282OooOo00 = false;
    }

    public final void OooO0Oo() {
        if (!(this.f28280OooOOo.f28241OooO0O0 > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f28272OooO0o) {
            this.f28282OooOo00 = true;
        }
    }
}
