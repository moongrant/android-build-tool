package p357o0OOOo0O;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p351o0OOOOo.OooOO0;
import p373o0OOo0o0.o0000;
import p373o0OOo0o0.o00000OO;
import p373o0OOo0o0.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O implements o0000, o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final Map<Class<?>, ConcurrentHashMap<o00000OO<Object>, Executor>> f38330OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public Queue<p373o0OOo0o0.o00000O<?>> f38331OooO0O0 = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f38332OooO0OO;

    public o00000O(Executor executor) {
        this.f38332OooO0OO = executor;
    }

    @Override // p373o0OOo0o0.o0000
    public final void OooO00o(o00000OO o00000oo2) {
        OooO0O0(this.f38332OooO0OO, o00000oo2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p373o0OOo0o0.o0000
    public final synchronized void OooO0O0(Executor executor, o00000OO o00000oo2) {
        Objects.requireNonNull(executor);
        if (!this.f38330OooO00o.containsKey(OooOO0.class)) {
            this.f38330OooO00o.put(OooOO0.class, new ConcurrentHashMap<>());
        }
        this.f38330OooO00o.get(OooOO0.class).put(o00000oo2, executor);
    }
}
