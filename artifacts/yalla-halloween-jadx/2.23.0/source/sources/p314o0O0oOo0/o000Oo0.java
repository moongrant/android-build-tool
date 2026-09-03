package p314o0O0oOo0;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00 f42594OooO0O0;

    public o000Oo0(Set<o000O00O> set, o000O00 o000o01) {
        this.f42593OooO00o = OooO0O0(set);
        this.f42594OooO0O0 = o000o01;
    }

    public static String OooO0O0(Set<o000O00O> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<o000O00O> it = set.iterator();
        while (it.hasNext()) {
            o000O00O next = it.next();
            sb.append(next.OooO00o());
            sb.append('/');
            sb.append(next.OooO0O0());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p314o0O0oOo0.o000OO0O
    public final String OooO00o() {
        Set setUnmodifiableSet;
        o000O00 o000o01 = this.f42594OooO0O0;
        synchronized (o000o01.f42590OooO00o) {
            setUnmodifiableSet = Collections.unmodifiableSet(o000o01.f42590OooO00o);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f42593OooO00o;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + OooO0O0(o000o01.OooO00o());
    }
}
