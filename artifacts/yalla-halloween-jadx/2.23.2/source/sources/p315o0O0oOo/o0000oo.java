package p315o0O0oOo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile o0000oo f41890OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f41891OooO00o = new HashSet();

    public final Set<o0000O0> OooO00o() {
        Set<o0000O0> setUnmodifiableSet;
        synchronized (this.f41891OooO00o) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f41891OooO00o);
        }
        return setUnmodifiableSet;
    }
}
