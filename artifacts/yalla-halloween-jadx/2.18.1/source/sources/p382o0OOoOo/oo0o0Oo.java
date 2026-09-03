package p382o0OOoOo;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f38850OooO0O0;

    public oo0o0Oo(Set<o000OOo> set, o0O0O00 o0o0o00) {
        this.f38849OooO00o = OooO0O0(set);
        this.f38850OooO0O0 = o0o0o00;
    }

    public static String OooO0O0(Set<o000OOo> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<o000OOo> it = set.iterator();
        while (it.hasNext()) {
            o000OOo next = it.next();
            sb.append(next.OooO00o());
            sb.append('/');
            sb.append(next.OooO0O0());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p382o0OOoOo.o00000
    public final String OooO00o() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        o0O0O00 o0o0o00 = this.f38850OooO0O0;
        synchronized (((Set) o0o0o00.f38845OooO00o)) {
            setUnmodifiableSet = Collections.unmodifiableSet((Set) o0o0o00.f38845OooO00o);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return this.f38849OooO00o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38849OooO00o);
        sb.append(' ');
        o0O0O00 o0o0o01 = this.f38850OooO0O0;
        synchronized (((Set) o0o0o01.f38845OooO00o)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((Set) o0o0o01.f38845OooO00o);
        }
        sb.append(OooO0O0(setUnmodifiableSet2));
        return sb.toString();
    }
}
