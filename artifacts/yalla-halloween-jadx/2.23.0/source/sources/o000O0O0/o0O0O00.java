package o000O0O0;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class o0O0O00<T> extends LiveData<T> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f34792OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0OO00O f34793OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f34794OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo00 f34795OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f34796OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Callable<T> f34797OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f34798OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f34799OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f34800OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f34801OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final androidx.activity.OooOOO0 f34802OooOO0;

    /* JADX WARN: Type inference failed for: r2v2, types: [o000O0O0.o0OO00O] */
    public o0O0O00(@NotNull RoomDatabase database, @NotNull OooOo00 container, @NotNull Callable computeFunction, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f34794OooO00o = database;
        this.f34795OooO0O0 = container;
        this.f34796OooO0OO = false;
        this.f34797OooO0Oo = computeFunction;
        this.f34799OooO0o0 = new oo0o0Oo(tableNames, this);
        this.f34798OooO0o = new AtomicBoolean(true);
        this.f34800OooO0oO = new AtomicBoolean(false);
        this.f34801OooO0oo = new AtomicBoolean(false);
        this.f34793OooO = new Runnable() { // from class: o000O0O0.o0OO00O
            /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                AtomicBoolean atomicBoolean;
                boolean z;
                o0O0O00 this$0 = this.f34803OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f34801OooO0oo.compareAndSet(false, true)) {
                    OooOo oooOo = this$0.f34794OooO00o.f7889OooO0o0;
                    oooOo.getClass();
                    oo0o0Oo observer = this$0.f34799OooO0o0;
                    Intrinsics.checkNotNullParameter(observer, "observer");
                    oooOo.OooO00o(new OooOo.OooO(oooOo, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.f34800OooO0oO;
                    boolean zCompareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = this$0.f34798OooO0o;
                    if (zCompareAndSet) {
                        Object objCall = null;
                        z = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                objCall = this$0.f34797OooO0Oo.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        }
                        if (z) {
                            this$0.postValue(objCall);
                        }
                        atomicBoolean2.set(false);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                } while (atomicBoolean.get());
            }
        };
        this.f34802OooOO0 = new androidx.activity.OooOOO0(this, 1);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Executor executor;
        super.onActive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        OooOo00 oooOo00 = this.f34795OooO0O0;
        oooOo00.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        oooOo00.f34756OooO0O0.add(this);
        boolean z = this.f34796OooO0OO;
        RoomDatabase roomDatabase = this.f34794OooO00o;
        if (z) {
            executor = roomDatabase.f7886OooO0OO;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                executor = null;
            }
        } else {
            executor = roomDatabase.f7885OooO0O0;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
        }
        executor.execute(this.f34793OooO);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        OooOo00 oooOo00 = this.f34795OooO0O0;
        oooOo00.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        oooOo00.f34756OooO0O0.remove(this);
    }
}
