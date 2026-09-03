package p037OoooOo0;

import androidx.camera.core.OooO0o;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import o000OO.OooO00o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00oOoo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1612OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Serializable f1613OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1614OooO0o0;

    public /* synthetic */ o00oOoo(Object obj, Serializable serializable, int i) {
        this.f1612OooO0Oo = i;
        this.f1614OooO0o0 = obj;
        this.f1613OooO0o = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1612OooO0Oo;
        Serializable serializable = this.f1613OooO0o;
        Object obj = this.f1614OooO0o0;
        switch (i) {
            case 0:
                o00O000 o00o001 = (o00O000) obj;
                o00o001.getClass();
                ((OooO00o) ((AtomicReference) serializable).get()).accept(new OooO0o(o00o001));
                break;
            default:
                com.google.android.exoplayer2.audio.OooO0o.OooO00o oooO00o = (com.google.android.exoplayer2.audio.OooO0o.OooO00o) obj;
                oooO00o.getClass();
                int i2 = o0O00.f40595OooO00o;
                oooO00o.f11611OooO0O0.OooO0o0((Exception) serializable);
                break;
        }
    }
}
