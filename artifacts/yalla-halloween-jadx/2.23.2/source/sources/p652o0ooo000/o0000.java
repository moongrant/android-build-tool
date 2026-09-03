package p652o0ooo000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O00 f59276OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f59277OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f59278OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00000O f59279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f59280OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList f59281OooO0o0;

    public o0000(@NotNull o0000O00 taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f59276OooO00o = taskRunner;
        this.f59277OooO0O0 = name;
        this.f59281OooO0o0 = new ArrayList();
    }

    public final void OooO00o() {
        byte[] bArr = oO000o00.f58124OooO00o;
        synchronized (this.f59276OooO00o) {
            if (OooO0O0()) {
                this.f59276OooO00o.OooO0o0(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean OooO0O0() {
        o00000O o00000o = this.f59279OooO0Oo;
        if (o00000o != null) {
            Intrinsics.checkNotNull(o00000o);
            if (o00000o.f59283OooO0O0) {
                this.f59280OooO0o = true;
            }
        }
        ArrayList arrayList = this.f59281OooO0o0;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((o00000O) arrayList.get(size)).f59283OooO0O0) {
                    o00000O o00000o2 = (o00000O) arrayList.get(size);
                    if (o0000O00.f59286OooO.isLoggable(Level.FINE)) {
                        o00000OO.OooO00o(o00000o2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final void OooO0OO(@NotNull o00000O task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f59276OooO00o) {
            if (!this.f59278OooO0OO) {
                if (OooO0Oo(task, j, false)) {
                    this.f59276OooO00o.OooO0o0(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.f59283OooO0O0) {
                o0000O00 o0000o00 = o0000O00.f59287OooO0oo;
                if (o0000O00.f59286OooO.isLoggable(Level.FINE)) {
                    o00000OO.OooO00o(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                o0000O00 o0000o01 = o0000O00.f59287OooO0oo;
                if (o0000O00.f59286OooO.isLoggable(Level.FINE)) {
                    o00000OO.OooO00o(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean OooO0Oo(@NotNull o00000O task, long j, boolean z) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        o0000 o0000Var = task.f59284OooO0OO;
        if (o0000Var != this) {
            if (!(o0000Var == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task.f59284OooO0OO = this;
        }
        long jNanoTime = this.f59276OooO00o.f59288OooO00o.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f59281OooO0o0;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf != -1) {
            if (task.f59285OooO0Oo <= j2) {
                if (o0000O00.f59286OooO.isLoggable(Level.FINE)) {
                    o00000OO.OooO00o(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        task.f59285OooO0Oo = j2;
        if (o0000O00.f59286OooO.isLoggable(Level.FINE)) {
            o00000OO.OooO00o(task, this, z ? Intrinsics.stringPlus("run again after ", o00000OO.OooO0O0(j2 - jNanoTime)) : Intrinsics.stringPlus("scheduled after ", o00000OO.OooO0O0(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((o00000O) it.next()).f59285OooO0Oo - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, task);
        return size == 0;
    }

    public final void OooO0o0() {
        byte[] bArr = oO000o00.f58124OooO00o;
        synchronized (this.f59276OooO00o) {
            this.f59278OooO0OO = true;
            if (OooO0O0()) {
                this.f59276OooO00o.OooO0o0(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final String toString() {
        return this.f59277OooO0O0;
    }
}
