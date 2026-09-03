package p498o0o00Oo0;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f41323Oooo0o;

    public o00O0000(Object obj) {
        this.f41323Oooo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f41323Oooo0o).observeForever(o00.f41292OooO00o);
    }
}
