package p670oOooo0o;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000Ooo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SparseIntArray f60851OooO00o;

    public abstract int OooO00o(T t);

    public final void OooO0O0(int i, @LayoutRes int i2) {
        if (this.f60851OooO00o == null) {
            this.f60851OooO00o = new SparseIntArray();
        }
        this.f60851OooO00o.put(i, i2);
    }
}
