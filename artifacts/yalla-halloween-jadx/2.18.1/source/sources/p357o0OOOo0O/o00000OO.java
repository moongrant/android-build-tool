package p357o0OOOo0O;

import p375o0OOo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO<T> implements o0OOO0o<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f38335OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f38336OooO00o = f38335OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile o0OOO0o<T> f38337OooO0O0;

    public o00000OO(o0OOO0o<T> o0ooo0o2) {
        this.f38337OooO0O0 = o0ooo0o2;
    }

    @Override // p375o0OOo0oo.o0OOO0o
    public final T get() {
        T t = (T) this.f38336OooO00o;
        Object obj = f38335OooO0OO;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f38336OooO00o;
                if (t == obj) {
                    t = this.f38337OooO0O0.get();
                    this.f38336OooO00o = t;
                    this.f38337OooO0O0 = null;
                }
            }
        }
        return t;
    }
}
