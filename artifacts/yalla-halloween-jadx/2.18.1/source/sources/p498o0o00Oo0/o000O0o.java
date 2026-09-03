package p498o0o00Oo0;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f41315Oooo0o;

    public o000O0o(Object obj) {
        this.f41315Oooo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f41315Oooo0o).observeForever(o000O000.f41311OooO00o);
    }
}
