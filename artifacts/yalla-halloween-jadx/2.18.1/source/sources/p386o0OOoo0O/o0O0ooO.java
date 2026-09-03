package p386o0OOoo0O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO extends o00O000o implements Iterable<o00O000o> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<o00O000o> f38886Oooo0o = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    @Override // p386o0OOoo0O.o00O000o
    public final String OooO0OO() {
        if (this.f38886Oooo0o.size() == 1) {
            return ((o00O000o) this.f38886Oooo0o.get(0)).OooO0OO();
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    public final void OooO0o0(o00O000o o00o000o2) {
        if (o00o000o2 == null) {
            o00o000o2 = o00O00.f38884OooO00o;
        }
        this.f38886Oooo0o.add(o00o000o2);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o0O0ooO) && ((o0O0ooO) obj).f38886Oooo0o.equals(this.f38886Oooo0o));
    }

    public final int hashCode() {
        return this.f38886Oooo0o.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    @Override // java.lang.Iterable
    public final Iterator<o00O000o> iterator() {
        return this.f38886Oooo0o.iterator();
    }
}
