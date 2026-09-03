package p110o000ooo0;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p440o0OoOo0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class o000O000<T> extends LiveData<T> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f35899OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35900OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f35901OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000OOo f35902OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f35903OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Callable<T> f35904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f35905OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000 f35906OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f35907OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f35908OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final androidx.media3.session.o0Oo0oo f35909OooOO0;

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.media3.session.o0Oo0oo] */
    public o000O000(@NotNull RoomDatabase database, @NotNull o000OOo container, @NotNull Callable computeFunction, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f35901OooO00o = database;
        this.f35902OooO0O0 = container;
        this.f35903OooO0OO = false;
        this.f35904OooO0Oo = computeFunction;
        this.f35906OooO0o0 = new o000(tableNames, this);
        final int i = 1;
        this.f35905OooO0o = new AtomicBoolean(true);
        this.f35907OooO0oO = new AtomicBoolean(false);
        this.f35908OooO0oo = new AtomicBoolean(false);
        this.f35900OooO = new o0Oo0oo(this, i);
        this.f35909OooOO0 = new Runnable() { // from class: androidx.media3.session.o0Oo0oo
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor;
                int i2 = i;
                Object obj = this;
                switch (i2) {
                    case 0:
                        ((o000oOoO) obj).release();
                        break;
                    default:
                        p110o000ooo0.o000O000 this$0 = (p110o000ooo0.o000O000) obj;
                        int i3 = p110o000ooo0.o000O000.f35899OooOO0O;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        boolean zHasActiveObservers = this$0.hasActiveObservers();
                        if (this$0.f35905OooO0o.compareAndSet(false, true) && zHasActiveObservers) {
                            boolean z = this$0.f35903OooO0OO;
                            RoomDatabase roomDatabase = this$0.f35901OooO00o;
                            if (z) {
                                executor = roomDatabase.f10980OooO0OO;
                                if (executor == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                                    executor = null;
                                }
                            } else {
                                executor = roomDatabase.f10979OooO0O0;
                                if (executor == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                                    executor = null;
                                }
                            }
                            executor.execute(this$0.f35900OooO);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Executor executor;
        super.onActive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        o000OOo o000ooo2 = this.f35902OooO0O0;
        o000ooo2.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        o000ooo2.f35924OooO0O0.add(this);
        boolean z = this.f35903OooO0OO;
        RoomDatabase roomDatabase = this.f35901OooO00o;
        if (z) {
            executor = roomDatabase.f10980OooO0OO;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                executor = null;
            }
        } else {
            executor = roomDatabase.f10979OooO0O0;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
        }
        executor.execute(this.f35900OooO);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        o000OOo o000ooo2 = this.f35902OooO0O0;
        o000ooo2.getClass();
        Intrinsics.checkNotNullParameter(this, "liveData");
        o000ooo2.f35924OooO0O0.remove(this);
    }
}
