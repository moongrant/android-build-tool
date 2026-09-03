package p036OoooOOo;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.OooOOO0;
import java.util.ArrayDeque;
import p022Oooo00O.o0OO0oO0;

/* JADX INFO: loaded from: classes.dex */
public class o0000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1469OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayDeque<T> f1470OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f1471OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0000O00<T> f1472OooO0Oo;

    public o0000(int i, @Nullable o0OO0oO0 o0oo0oo1) {
        this.f1469OooO00o = i;
        this.f1470OooO0O0 = new ArrayDeque<>(i);
        this.f1472OooO0Oo = o0oo0oo1;
    }

    @NonNull
    public final T OooO00o() {
        T tRemoveLast;
        synchronized (this.f1471OooO0OO) {
            tRemoveLast = this.f1470OooO0O0.removeLast();
        }
        return tRemoveLast;
    }

    public void OooO0O0(@NonNull T t) {
        T tOooO00o;
        synchronized (this.f1471OooO0OO) {
            tOooO00o = this.f1470OooO0O0.size() >= this.f1469OooO00o ? OooO00o() : null;
            this.f1470OooO0O0.addFirst(t);
        }
        if (this.f1472OooO0Oo == null || tOooO00o == null) {
            return;
        }
        ((OooOOO0) tOooO00o).close();
    }

    public final boolean OooO0OO() {
        boolean zIsEmpty;
        synchronized (this.f1471OooO0OO) {
            zIsEmpty = this.f1470OooO0O0.isEmpty();
        }
        return zIsEmpty;
    }
}
