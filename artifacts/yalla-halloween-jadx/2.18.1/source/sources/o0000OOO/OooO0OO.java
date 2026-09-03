package o0000OOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object[] f27519OooO00o = new Object[256];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27520OooO0O0;

    public final T OooO00o() {
        int i = this.f27520OooO0O0;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f27519OooO00o;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f27520OooO0O0 = i - 1;
        return t;
    }

    public final boolean OooO0O0(T t) {
        int i = this.f27520OooO0O0;
        Object[] objArr = this.f27519OooO00o;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f27520OooO0O0 = i + 1;
        return true;
    }
}
