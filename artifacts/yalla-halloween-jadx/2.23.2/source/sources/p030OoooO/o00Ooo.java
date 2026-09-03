package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00Ooo<V> implements OooOO0O<List<V>> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000Oo0.OooO00o<List<V>> f1352OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public List<? extends OooOO0O<? extends V>> f1353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f1354OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ArrayList f1355OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AtomicInteger f1356OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final o000Oo0.OooO0o f1357OooO0oo = o000Oo0.OooO00o(new o0OoOo0(this));

    public o00Ooo(@NonNull ArrayList arrayList, boolean z, @NonNull o0ooOOo o0ooooo) {
        this.f1353OooO0Oo = arrayList;
        this.f1355OooO0o0 = new ArrayList(arrayList.size());
        this.f1354OooO0o = z;
        this.f1356OooO0oO = new AtomicInteger(arrayList.size());
        OooO0oo(new o00O0O(this), o00oO0o.OooO00o());
        if (this.f1353OooO0Oo.isEmpty()) {
            this.f1352OooO.OooO0O0(new ArrayList(this.f1355OooO0o0));
            return;
        }
        for (int i = 0; i < this.f1353OooO0Oo.size(); i++) {
            this.f1355OooO0o0.add(null);
        }
        List<? extends OooOO0O<? extends V>> list = this.f1353OooO0Oo;
        for (int i2 = 0; i2 < list.size(); i2++) {
            OooOO0O<? extends V> oooOO0O = list.get(i2);
            oooOO0O.OooO0oo(new o00Oo0(this, i2, oooOO0O), o0ooooo);
        }
    }

    @Override // com.google.common.util.concurrent.OooOO0O
    public final void OooO0oo(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f1357OooO0oo.f57741OooO0o0.OooO0oo(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        List<? extends OooOO0O<? extends V>> list = this.f1353OooO0Oo;
        if (list != null) {
            Iterator<? extends OooOO0O<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.f1357OooO0oo.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (List) this.f1357OooO0oo.f57741OooO0o0.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1357OooO0oo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1357OooO0oo.isDone();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final Object get() throws ExecutionException, InterruptedException {
        List<? extends OooOO0O<? extends V>> list = this.f1353OooO0Oo;
        if (list != null && !isDone()) {
            loop0: for (OooOO0O<? extends V> oooOO0O : list) {
                while (!oooOO0O.isDone()) {
                    try {
                        oooOO0O.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f1354OooO0o) {
                            return (List) this.f1357OooO0oo.get();
                        }
                    }
                }
            }
        }
        return (List) this.f1357OooO0oo.get();
    }
}
