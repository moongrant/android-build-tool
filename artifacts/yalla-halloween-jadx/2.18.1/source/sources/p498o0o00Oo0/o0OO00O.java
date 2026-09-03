package p498o0o00Oo0;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f41354Oooo0o;

    public o0OO00O(Object obj) {
        this.f41354Oooo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f41354Oooo0o).observeForever(o0Oo0oo.f41356OooO00o);
    }
}
