package p357o0OOOo0O;

import java.util.Set;
import p375o0OOo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00Oo0 implements o00oO0o {
    @Override // p357o0OOOo0O.o00oO0o
    public <T> T OooO00o(Class<T> cls) {
        o0OOO0o<T> o0ooo0oOooO0O0 = OooO0O0(cls);
        if (o0ooo0oOooO0O0 == null) {
            return null;
        }
        return o0ooo0oOooO0O0.get();
    }

    @Override // p357o0OOOo0O.o00oO0o
    public <T> Set<T> OooO0Oo(Class<T> cls) {
        return OooO0OO(cls).get();
    }
}
