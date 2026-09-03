package p037OoooOo0;

import androidx.camera.core.OooO0o;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import o000OO.OooO00o;
import o000OOO.o0OoOo0;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0ooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Serializable f1583OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1584OooO0o0;

    public /* synthetic */ o0O0ooO(Object obj, Serializable serializable, int i) {
        this.f1582OooO0Oo = i;
        this.f1584OooO0o0 = obj;
        this.f1583OooO0o = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1582OooO0Oo;
        Serializable serializable = this.f1583OooO0o;
        Object obj = this.f1584OooO0o0;
        switch (i) {
            case 0:
                o00oOoo o00oooo2 = (o00oOoo) obj;
                o00oooo2.getClass();
                ((OooO00o) ((AtomicReference) serializable).get()).accept(new OooO0o(o00oooo2));
                break;
            default:
                o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) obj;
                oooO00o.getClass();
                int i2 = o00.f34910OooO00o;
                oooO00o.f34594OooO0O0.OooO((Exception) serializable);
                break;
        }
    }
}
