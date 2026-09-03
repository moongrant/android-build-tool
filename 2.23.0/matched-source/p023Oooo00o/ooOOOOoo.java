package p023Oooo00o;

import android.hardware.camera2.CameraCaptureSession;
import com.twitter.sdk.android.core.OooO0O0;
import com.twitter.sdk.android.core.models.OooOo;
import com.twitter.sdk.android.core.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ooOOOOoo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1010OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1011OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1012OooO0o0;

    public /* synthetic */ ooOOOOoo(int i, Object obj, Object obj2) {
        this.f1010OooO0Oo = i;
        this.f1012OooO0o0 = obj;
        this.f1011OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1010OooO0Oo;
        Object obj = this.f1011OooO0o;
        Object obj2 = this.f1012OooO0o0;
        switch (i) {
            case 0:
                ((oO00000.OooO0OO) obj2).f924OooO00o.onReady((CameraCaptureSession) obj);
                break;
            default:
                ((OooO0O0) obj2).OooO0Oo(new o000oOoO((OooOo) obj, null));
                break;
        }
    }
}
