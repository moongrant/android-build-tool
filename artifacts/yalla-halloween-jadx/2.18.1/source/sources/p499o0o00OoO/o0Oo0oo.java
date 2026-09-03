package p499o0o00OoO;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f41372Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f41373Oooo0oO;

    public o0Oo0oo(Object obj, o0OO00O o0oo00o2) {
        this.f41372Oooo0o = obj;
        this.f41373Oooo0oO = o0oo00o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f41372Oooo0o).observeForever(new o0OOO0o(this.f41373Oooo0oO));
    }
}
