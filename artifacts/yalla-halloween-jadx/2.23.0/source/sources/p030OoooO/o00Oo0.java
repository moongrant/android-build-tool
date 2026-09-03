package p030OoooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooO00o;
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
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00Oo0<V> implements OooO00o<List<V>> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O000.OooO00o<List<V>> f1381OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public List<? extends OooO00o<? extends V>> f1382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f1383OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ArrayList f1384OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AtomicInteger f1385OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final o00O000.OooO0o f1386OooO0oo = o00O000.OooO00o(new o000oOoO(this));

    public o00Oo0(@NonNull ArrayList arrayList, boolean z, @NonNull o0ooOOo o0ooooo) {
        this.f1382OooO0Oo = arrayList;
        this.f1384OooO0o0 = new ArrayList(arrayList.size());
        this.f1383OooO0o = z;
        this.f1385OooO0oO = new AtomicInteger(arrayList.size());
        OooO(new o0OoOo0(this), o00oO0o.OooO00o());
        if (this.f1382OooO0Oo.isEmpty()) {
            this.f1381OooO.OooO0O0(new ArrayList(this.f1384OooO0o0));
            return;
        }
        for (int i = 0; i < this.f1382OooO0Oo.size(); i++) {
            this.f1384OooO0o0.add(null);
        }
        List<? extends OooO00o<? extends V>> list = this.f1382OooO0Oo;
        for (int i2 = 0; i2 < list.size(); i2++) {
            OooO00o<? extends V> oooO00o = list.get(i2);
            oooO00o.OooO(new o00O0O(this, i2, oooO00o), o0ooooo);
        }
    }

    @Override // com.google.common.util.concurrent.OooO00o
    public final void OooO(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f1386OooO0oo.f57402OooO0o0.OooO(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        List<? extends OooO00o<? extends V>> list = this.f1382OooO0Oo;
        if (list != null) {
            Iterator<? extends OooO00o<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z);
            }
        }
        return this.f1386OooO0oo.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (List) this.f1386OooO0oo.f57402OooO0o0.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1386OooO0oo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1386OooO0oo.isDone();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final Object get() throws ExecutionException, InterruptedException {
        List<? extends OooO00o<? extends V>> list = this.f1382OooO0Oo;
        if (list != null && !isDone()) {
            loop0: for (OooO00o<? extends V> oooO00o : list) {
                while (!oooO00o.isDone()) {
                    try {
                        oooO00o.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f1383OooO0o) {
                            return (List) this.f1386OooO0oo.get();
                        }
                    }
                }
            }
        }
        return (List) this.f1386OooO0oo.get();
    }
}
