package androidx.activity;

import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2186OooO0o0;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f2185OooO0Oo = i;
        this.f2186OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[PHI: r1
      0x0049: PHI (r1v7 java.util.concurrent.Executor) = (r1v5 java.util.concurrent.Executor), (r1v9 java.util.concurrent.Executor) binds: [B:18:0x0041, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Executor executor2 = null;
        int i = this.f2185OooO0Oo;
        Object obj = this.f2186OooO0o0;
        switch (i) {
            case 0:
                ComponentActivity.OooOO0 oooOO1 = (ComponentActivity.OooOO0) obj;
                Runnable runnable = oooOO1.f2153OooO0o0;
                if (runnable != null) {
                    runnable.run();
                    oooOO1.f2153OooO0o0 = null;
                }
                break;
            default:
                o0O0O00 this$0 = (o0O0O00) obj;
                int i2 = o0O0O00.f34792OooOO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean zHasActiveObservers = this$0.hasActiveObservers();
                if (this$0.f34798OooO0o.compareAndSet(false, true) && zHasActiveObservers) {
                    boolean z = this$0.f34796OooO0OO;
                    RoomDatabase roomDatabase = this$0.f34794OooO00o;
                    if (z) {
                        executor = roomDatabase.f7886OooO0OO;
                        if (executor == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                        } else {
                            executor2 = executor;
                        }
                    } else {
                        executor = roomDatabase.f7885OooO0O0;
                        if (executor == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                        } else {
                            executor2 = executor;
                        }
                    }
                    executor2.execute(this$0.f34793OooO);
                    break;
                }
                break;
        }
    }
}
