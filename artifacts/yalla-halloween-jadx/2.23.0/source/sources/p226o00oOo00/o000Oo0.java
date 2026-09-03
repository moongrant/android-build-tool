package p226o00oOo00;

import android.util.SparseArray;
import p022Oooo00O.o0OO0oO0;
import p245o00oo0o.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000Oo0<V> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O00<V> f39895OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<V> f39894OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39893OooO00o = -1;

    public o000Oo0(o0OO0oO0 o0oo0oo1) {
        this.f39895OooO0OO = o0oo0oo1;
    }

    public final V OooO00o(int i) {
        SparseArray<V> sparseArray;
        if (this.f39893OooO00o == -1) {
            this.f39893OooO00o = 0;
        }
        while (true) {
            int i2 = this.f39893OooO00o;
            sparseArray = this.f39894OooO0O0;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f39893OooO00o--;
        }
        while (this.f39893OooO00o < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f39893OooO00o + 1)) {
            this.f39893OooO00o++;
        }
        return sparseArray.valueAt(this.f39893OooO00o);
    }
}
