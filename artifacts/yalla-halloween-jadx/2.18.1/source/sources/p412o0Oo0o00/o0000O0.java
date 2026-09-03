package p412o0Oo0o00;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Deque<o00000O> f39275OooO00o;

    public o0000O0() {
        new ArrayDeque();
        new ArrayDeque();
        this.f39275OooO00o = new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayDeque, java.util.Deque<o0Oo0o00.o00000O>] */
    public final synchronized void OooO00o(o00000O o00000o) {
        if (!this.f39275OooO00o.remove(o00000o)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
