package p123o00O0o0;

import java.util.Arrays;
import java.util.List;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00Ooo<V, O> implements o00Oo0<V, O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o000OOo<V>> f30971OooO00o;

    public o00Ooo(List<o000OOo<V>> list) {
        this.f30971OooO00o = list;
    }

    @Override // p123o00O0o0.o00Oo0
    public final List<o000OOo<V>> OooO0O0() {
        return this.f30971OooO00o;
    }

    @Override // p123o00O0o0.o00Oo0
    public final boolean isStatic() {
        return this.f30971OooO00o.isEmpty() || (this.f30971OooO00o.size() == 1 && this.f30971OooO00o.get(0).OooO0OO());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f30971OooO00o.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f30971OooO00o.toArray()));
        }
        return sb.toString();
    }
}
