package androidx.appcompat.widget;

import android.util.Log;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.OooOO0O;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p117o00O0OOo.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3265OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3266OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f3265OooO0Oo = i;
        this.f3266OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3265OooO0Oo) {
            case 0:
                ((Toolbar) this.f3266OooO0o0).OooOO0o();
                return;
            default:
                final ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f3266OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f11595OooOO0O.f36330OooO0Oo instanceof o00O0OOo.o00000O0.OooO0O0) {
                    return;
                }
                String strOooO0O0 = this$0.f11489OooO0o0.f11499OooO0O0.OooO0O0("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo = p115o00O00oO.o0Oo0oo.OooO0Oo();
                Intrinsics.checkNotNullExpressionValue(o0oo0ooOooO0Oo, "get()");
                if (strOooO0O0 == null || strOooO0O0.length() == 0) {
                    o0oo0ooOooO0Oo.OooO0O0(oo0oOO0.OooO0O0.f60327OooO00o, "No worker to delegate to.");
                    p117o00O0OOo.o00000OO<androidx.work.OooO0OO.OooO00o> future = this$0.f11595OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    future.OooO(new androidx.work.OooO0OO.OooO00o.C0185OooO00o());
                    return;
                }
                androidx.work.OooO0OO oooO0OOOooO00o = this$0.f11489OooO0o0.f11503OooO0o0.OooO00o(this$0.f11487OooO0Oo, strOooO0O0, this$0.f11593OooO0oo);
                this$0.f11596OooOO0o = oooO0OOOooO00o;
                if (oooO0OOOooO00o == null) {
                    o0oo0ooOooO0Oo.OooO00o(oo0oOO0.OooO0O0.f60327OooO00o, "No worker to delegate to.");
                    p117o00O0OOo.o00000OO<androidx.work.OooO0OO.OooO00o> future2 = this$0.f11595OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(future2, "future");
                    future2.OooO(new androidx.work.OooO0OO.OooO00o.C0185OooO00o());
                    return;
                }
                oo00o.o00000O0 o00000o0OooO0Oo = oo00o.o00000O0.OooO0Oo(this$0.f11487OooO0Oo);
                Intrinsics.checkNotNullExpressionValue(o00000o0OooO0Oo, "getInstance(applicationContext)");
                o00O0OO.oo000o oo000oVarOooOo0 = o00000o0OooO0Oo.f60187OooO0OO.OooOo0();
                String string = this$0.f11489OooO0o0.f11498OooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                o00O0OO.o00Ooo o00oooOooO0oo = oo000oVarOooOo0.OooO0oo(string);
                if (o00oooOooO0oo == null) {
                    p117o00O0OOo.o00000OO<androidx.work.OooO0OO.OooO00o> future3 = this$0.f11595OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(future3, "future");
                    String str = oo0oOO0.OooO0O0.f60327OooO00o;
                    future3.OooO(new androidx.work.OooO0OO.OooO00o.C0185OooO00o());
                    return;
                }
                o00O0OO0.o000oOoO o000oooo2 = o00000o0OooO0Oo.f60193OooOO0;
                Intrinsics.checkNotNullExpressionValue(o000oooo2, "workManagerImpl.trackers");
                o00O0O0O.OooO0o oooO0o = new o00O0O0O.OooO0o(o000oooo2, this$0);
                oooO0o.OooO0Oo(CollectionsKt.listOf(o00oooOooO0oo));
                String string2 = this$0.f11489OooO0o0.f11498OooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
                if (!oooO0o.OooO0OO(string2)) {
                    o0oo0ooOooO0Oo.OooO00o(oo0oOO0.OooO0O0.f60327OooO00o, "Constraints not met for delegate " + strOooO0O0 + ". Requesting retry.");
                    p117o00O0OOo.o00000OO<androidx.work.OooO0OO.OooO00o> future4 = this$0.f11595OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(future4, "future");
                    future4.OooO(new androidx.work.OooO0OO.OooO00o.OooO0O0());
                    return;
                }
                o0oo0ooOooO0Oo.OooO00o(oo0oOO0.OooO0O0.f60327OooO00o, "Constraints met for delegate " + strOooO0O0);
                try {
                    androidx.work.OooO0OO oooO0OO = this$0.f11596OooOO0o;
                    Intrinsics.checkNotNull(oooO0OO);
                    final p117o00O0OOo.o00000OO o00000ooOooO0Oo = oooO0OO.OooO0Oo();
                    Intrinsics.checkNotNullExpressionValue(o00000ooOooO0Oo, "delegate!!.startWork()");
                    o00000ooOooO0Oo.OooO0oo(new Runnable() { // from class: oo0oOO0.OooO00o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConstraintTrackingWorker this$1 = this$0;
                            OooOO0O<? extends androidx.work.OooO0OO.OooO00o> innerFuture = o00000ooOooO0Oo;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
                            synchronized (this$1.f11592OooO) {
                                if (this$1.f11594OooOO0) {
                                    o00000OO<androidx.work.OooO0OO.OooO00o> future5 = this$1.f11595OooOO0O;
                                    Intrinsics.checkNotNullExpressionValue(future5, "future");
                                    String str2 = OooO0O0.f60327OooO00o;
                                    future5.OooO(new androidx.work.OooO0OO.OooO00o.OooO0O0());
                                } else {
                                    this$1.f11595OooOO0O.OooOO0O(innerFuture);
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }, this$0.f11489OooO0o0.f11500OooO0OO);
                    return;
                } catch (Throwable th) {
                    String str2 = oo0oOO0.OooO0O0.f60327OooO00o;
                    String strOooO00o = p004OooO0oO.o000oOoO.OooO00o("Delegated worker ", strOooO0O0, " threw exception in startWork.");
                    if (((o00O00oO.o0Oo0oo.OooO00o) o0oo0ooOooO0Oo).f36155OooO0OO <= 3) {
                        Log.d(str2, strOooO00o, th);
                    }
                    synchronized (this$0.f11592OooO) {
                        if (!this$0.f11594OooOO0) {
                            p117o00O0OOo.o00000OO<androidx.work.OooO0OO.OooO00o> future5 = this$0.f11595OooOO0O;
                            Intrinsics.checkNotNullExpressionValue(future5, "future");
                            future5.OooO(new androidx.work.OooO0OO.OooO00o.C0185OooO00o());
                            return;
                        } else {
                            o0oo0ooOooO0Oo.OooO00o(str2, "Constraints were unmet, Retrying.");
                            p117o00O0OOo.o00000OO<androidx.work.OooO0OO.OooO00o> future6 = this$0.f11595OooOO0O;
                            Intrinsics.checkNotNullExpressionValue(future6, "future");
                            future6.OooO(new androidx.work.OooO0OO.OooO00o.OooO0O0());
                            return;
                        }
                    }
                }
        }
    }
}
