package p134o00OO0o;

import java.util.Arrays;
import java.util.List;
import o00OOO0O.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00000O0<V, O> implements o00000<V, O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO00o<V>> f37316OooO00o;

    public o00000O0(List<OooO00o<V>> list) {
        this.f37316OooO00o = list;
    }

    @Override // p134o00OO0o.o00000
    public final List<OooO00o<V>> OooO0O0() {
        return this.f37316OooO00o;
    }

    @Override // p134o00OO0o.o00000
    public final boolean isStatic() {
        List<OooO00o<V>> list = this.f37316OooO00o;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && list.get(0).OooO0OO();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List<OooO00o<V>> list = this.f37316OooO00o;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
