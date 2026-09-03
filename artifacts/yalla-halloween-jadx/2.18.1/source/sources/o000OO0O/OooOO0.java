package o000OO0O;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0<T> implements OooO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f28236OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f28237OooO0O0;

    public OooOO0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f28236OooO00o = new Object[i];
    }

    @Override // o000OO0O.OooO
    public boolean OooO00o(@NonNull T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f28237OooO0O0;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (this.f28236OooO00o[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f28236OooO00o;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f28237OooO0O0 = i + 1;
        return true;
    }

    @Override // o000OO0O.OooO
    public T OooO0O0() {
        int i = this.f28237OooO0O0;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f28236OooO00o;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f28237OooO0O0 = i - 1;
        return t;
    }
}
