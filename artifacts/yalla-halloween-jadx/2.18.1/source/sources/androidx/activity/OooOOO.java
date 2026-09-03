package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f4327OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public CopyOnWriteArrayList<OooO00o> f4328OooO0O0 = new CopyOnWriteArrayList<>();

    public OooOOO(boolean z) {
        this.f4327OooO00o = z;
    }

    @MainThread
    public abstract void OooO00o();

    @MainThread
    public final void OooO0O0() {
        Iterator<OooO00o> it = this.f4328OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
