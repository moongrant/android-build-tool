package p314o0O0oOo0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile o000O00 f42589OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f42590OooO00o = new HashSet();

    public final Set<o000O00O> OooO00o() {
        Set<o000O00O> setUnmodifiableSet;
        synchronized (this.f42590OooO00o) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f42590OooO00o);
        }
        return setUnmodifiableSet;
    }
}
