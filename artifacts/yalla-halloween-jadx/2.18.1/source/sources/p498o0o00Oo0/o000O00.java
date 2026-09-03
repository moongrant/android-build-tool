package p498o0o00Oo0;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f41310Oooo0o;

    public o000O00(Object obj) {
        this.f41310Oooo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f41310Oooo0o).observeForever(o000Oo0.f41320OooO00o);
    }
}
