package o000O;

import android.util.SparseArray;
import p080o000OoO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo<V> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00<V> f33883OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<V> f33882OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f33881OooO00o = -1;

    public o0Oo0oo(o0ooOOo o0ooooo) {
        this.f33883OooO0OO = o0ooooo;
    }

    public final V OooO00o(int i) {
        SparseArray<V> sparseArray;
        if (this.f33881OooO00o == -1) {
            this.f33881OooO00o = 0;
        }
        while (true) {
            int i2 = this.f33881OooO00o;
            sparseArray = this.f33882OooO0O0;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f33881OooO00o--;
        }
        while (this.f33881OooO00o < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f33881OooO00o + 1)) {
            this.f33881OooO00o++;
        }
        return sparseArray.valueAt(this.f33881OooO00o);
    }
}
