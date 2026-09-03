package p315o0O0oOo;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41886OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo f41887OooO0O0;

    public o0000O00(Set<o0000O0> set, o0000oo o0000ooVar) {
        this.f41886OooO00o = OooO0O0(set);
        this.f41887OooO0O0 = o0000ooVar;
    }

    public static String OooO0O0(Set<o0000O0> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<o0000O0> it = set.iterator();
        while (it.hasNext()) {
            o0000O0 next = it.next();
            sb.append(next.OooO00o());
            sb.append('/');
            sb.append(next.OooO0O0());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p315o0O0oOo.o0000O
    public final String OooO00o() {
        Set setUnmodifiableSet;
        o0000oo o0000ooVar = this.f41887OooO0O0;
        synchronized (o0000ooVar.f41891OooO00o) {
            setUnmodifiableSet = Collections.unmodifiableSet(o0000ooVar.f41891OooO00o);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f41886OooO00o;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + OooO0O0(o0000ooVar.OooO00o());
    }
}
