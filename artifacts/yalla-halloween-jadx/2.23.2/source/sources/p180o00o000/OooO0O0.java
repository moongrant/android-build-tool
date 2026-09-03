package p180o00o000;

import android.util.SparseIntArray;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SparseIntArray f38399OooO00o;

    public abstract int OooO00o(T t);

    public final void OooO0O0(int i, @LayoutRes int i2) {
        if (this.f38399OooO00o == null) {
            this.f38399OooO00o = new SparseIntArray();
        }
        this.f38399OooO00o.put(i, i2);
    }
}
