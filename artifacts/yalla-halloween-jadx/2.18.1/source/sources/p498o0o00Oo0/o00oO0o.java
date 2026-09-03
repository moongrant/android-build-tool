package p498o0o00Oo0;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f41350Oooo0o;

    public o00oO0o(Object obj) {
        this.f41350Oooo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f41350Oooo0o).observeForever(oo000o.f41359OooO00o);
    }
}
