package o00O00OO;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Oooo0<V, O> implements Oooo000<V, O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00O0O00.OooO00o<V>> f36354OooO00o;

    public Oooo0(List<o00O0O00.OooO00o<V>> list) {
        this.f36354OooO00o = list;
    }

    @Override // o00O00OO.Oooo000
    public final List<o00O0O00.OooO00o<V>> OooO0O0() {
        return this.f36354OooO00o;
    }

    @Override // o00O00OO.Oooo000
    public final boolean isStatic() {
        List<o00O0O00.OooO00o<V>> list = this.f36354OooO00o;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && list.get(0).OooO0OO();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List<o00O0O00.OooO00o<V>> list = this.f36354OooO00o;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
