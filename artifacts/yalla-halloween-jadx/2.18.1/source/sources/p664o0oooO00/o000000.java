package p664o0oooO00;

import OooO00o.OooO00o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f51818OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f51819OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<oo0o0Oo> f51820OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f51821OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f51822OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000000O f51823OooO0o0;

    public o000000(@NotNull o000000O taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f51823OooO0o0 = taskRunner;
        this.f51822OooO0o = name;
        this.f51820OooO0OO = new ArrayList();
    }

    public final void OooO00o() {
        byte[] bArr = o00OOO00.f51183OooO00o;
        synchronized (this.f51823OooO0o0) {
            if (OooO0O0()) {
                this.f51823OooO0o0.OooO0o0(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    public final boolean OooO0O0() {
        oo0o0Oo oo0o0oo = this.f51819OooO0O0;
        if (oo0o0oo != null) {
            Intrinsics.checkNotNull(oo0o0oo);
            if (oo0o0oo.f51840OooO0Oo) {
                this.f51821OooO0Oo = true;
            }
        }
        boolean z = false;
        for (int size = this.f51820OooO0OO.size() - 1; size >= 0; size--) {
            if (((oo0o0Oo) this.f51820OooO0OO.get(size)).f51840OooO0Oo) {
                oo0o0Oo oo0o0oo2 = (oo0o0Oo) this.f51820OooO0OO.get(size);
                o000000O.OooO0O0 oooO0O0 = o000000O.f51826OooOO0;
                if (o000000O.f51824OooO.isLoggable(Level.FINE)) {
                    o0O0O00.OooO00o(oo0o0oo2, this, "canceled");
                }
                this.f51820OooO0OO.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void OooO0OO(@NotNull oo0o0Oo task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f51823OooO0o0) {
            if (!this.f51818OooO00o) {
                if (OooO0o0(task, j, false)) {
                    this.f51823OooO0o0.OooO0o0(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.f51840OooO0Oo) {
                o000000O.OooO0O0 oooO0O0 = o000000O.f51826OooOO0;
                if (o000000O.f51824OooO.isLoggable(Level.FINE)) {
                    o0O0O00.OooO00o(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                o000000O.OooO0O0 oooO0O1 = o000000O.f51826OooOO0;
                if (o000000O.f51824OooO.isLoggable(Level.FINE)) {
                    o0O0O00.OooO00o(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final void OooO0o() {
        byte[] bArr = o00OOO00.f51183OooO00o;
        synchronized (this.f51823OooO0o0) {
            this.f51818OooO00o = true;
            if (OooO0O0()) {
                this.f51823OooO0o0.OooO0o0(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    public final boolean OooO0o0(@NotNull oo0o0Oo task, long j, boolean z) {
        String string;
        Intrinsics.checkNotNullParameter(task, "task");
        Objects.requireNonNull(task);
        Intrinsics.checkNotNullParameter(this, "queue");
        o000000 o000000Var = task.f51837OooO00o;
        if (o000000Var != this) {
            if (!(o000000Var == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task.f51837OooO00o = this;
        }
        long jNanoTime = this.f51823OooO0o0.f51833OooO0oO.nanoTime();
        long j2 = jNanoTime + j;
        int iIndexOf = this.f51820OooO0OO.indexOf(task);
        if (iIndexOf != -1) {
            if (task.f51838OooO0O0 <= j2) {
                o000000O.OooO0O0 oooO0O0 = o000000O.f51826OooOO0;
                if (o000000O.f51824OooO.isLoggable(Level.FINE)) {
                    o0O0O00.OooO00o(task, this, "already scheduled");
                }
                return false;
            }
            this.f51820OooO0OO.remove(iIndexOf);
        }
        task.f51838OooO0O0 = j2;
        o000000O.OooO0O0 oooO0O1 = o000000O.f51826OooOO0;
        if (o000000O.f51824OooO.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("run again after ");
                sbOooO0o0.append(o0O0O00.OooO0O0(j2 - jNanoTime));
                string = sbOooO0o0.toString();
            } else {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("scheduled after ");
                sbOooO0o1.append(o0O0O00.OooO0O0(j2 - jNanoTime));
                string = sbOooO0o1.toString();
            }
            o0O0O00.OooO00o(task, this, string);
        }
        Iterator it = this.f51820OooO0OO.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((oo0o0Oo) it.next()).f51838OooO0O0 - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f51820OooO0OO.size();
        }
        this.f51820OooO0OO.add(size, task);
        return size == 0;
    }

    @NotNull
    public final String toString() {
        return this.f51822OooO0o;
    }
}
