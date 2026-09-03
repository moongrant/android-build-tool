package p639o0ooOO0o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO0O0 f57434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57435OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f57436OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oo0oOO0 f57437OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f57438OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList f57439OooO0o0;

    public o00OO00O(@NotNull o00OO0O0 taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f57434OooO00o = taskRunner;
        this.f57435OooO0O0 = name;
        this.f57439OooO0o0 = new ArrayList();
    }

    public final void OooO00o() {
        byte[] bArr = o0O000o0.f57386OooO00o;
        synchronized (this.f57434OooO00o) {
            if (OooO0O0()) {
                this.f57434OooO00o.OooO0o0(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean OooO0O0() {
        oo0oOO0 oo0ooo0 = this.f57437OooO0Oo;
        if (oo0ooo0 != null) {
            Intrinsics.checkNotNull(oo0ooo0);
            if (oo0ooo0.f57452OooO0O0) {
                this.f57438OooO0o = true;
            }
        }
        ArrayList arrayList = this.f57439OooO0o0;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (((oo0oOO0) arrayList.get(size)).f57452OooO0O0) {
                    oo0oOO0 oo0ooo1 = (oo0oOO0) arrayList.get(size);
                    if (o00OO0O0.f57440OooO.isLoggable(Level.FINE)) {
                        o00O.OooO00o(oo0ooo1, this, "canceled");
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

    public final void OooO0OO(@NotNull oo0oOO0 task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f57434OooO00o) {
            if (!this.f57436OooO0OO) {
                if (OooO0Oo(task, j, false)) {
                    this.f57434OooO00o.OooO0o0(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.f57452OooO0O0) {
                o00OO0O0 o00oo0o1 = o00OO0O0.f57441OooO0oo;
                if (o00OO0O0.f57440OooO.isLoggable(Level.FINE)) {
                    o00O.OooO00o(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                o00OO0O0 o00oo0o2 = o00OO0O0.f57441OooO0oo;
                if (o00OO0O0.f57440OooO.isLoggable(Level.FINE)) {
                    o00O.OooO00o(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean OooO0Oo(@NotNull oo0oOO0 task, long j, boolean z) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        o00OO00O o00oo00o = task.f57453OooO0OO;
        if (o00oo00o != this) {
            if (!(o00oo00o == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task.f57453OooO0OO = this;
        }
        long jNanoTime = this.f57434OooO00o.f57442OooO00o.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.f57439OooO0o0;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf != -1) {
            if (task.f57454OooO0Oo <= j2) {
                if (o00OO0O0.f57440OooO.isLoggable(Level.FINE)) {
                    o00O.OooO00o(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        task.f57454OooO0Oo = j2;
        if (o00OO0O0.f57440OooO.isLoggable(Level.FINE)) {
            o00O.OooO00o(task, this, z ? Intrinsics.stringPlus("run again after ", o00O.OooO0O0(j2 - jNanoTime)) : Intrinsics.stringPlus("scheduled after ", o00O.OooO0O0(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((oo0oOO0) it.next()).f57454OooO0Oo - jNanoTime > j) {
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
        byte[] bArr = o0O000o0.f57386OooO00o;
        synchronized (this.f57434OooO00o) {
            this.f57436OooO0OO = true;
            if (OooO0O0()) {
                this.f57434OooO00o.OooO0o0(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final String toString() {
        return this.f57435OooO0O0;
    }
}
