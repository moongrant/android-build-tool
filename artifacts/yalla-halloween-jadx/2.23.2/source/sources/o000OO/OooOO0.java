package o000OO;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0<T> implements OooO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f34376OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34377OooO0O0;

    public OooOO0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f34376OooO00o = new Object[i];
    }

    @Override // o000OO.OooO
    public boolean OooO00o(@NonNull T t) {
        int i;
        Object[] objArr;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f34377OooO0O0;
            objArr = this.f34376OooO00o;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f34377OooO0O0 = i + 1;
        return true;
    }

    @Override // o000OO.OooO
    public T OooO0O0() {
        int i = this.f34377OooO0O0;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f34376OooO00o;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f34377OooO0O0 = i - 1;
        return t;
    }
}
