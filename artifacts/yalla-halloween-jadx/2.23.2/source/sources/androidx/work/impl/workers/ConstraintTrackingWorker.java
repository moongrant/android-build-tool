package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o000O00;
import androidx.work.OooO0OO;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.o00Ooo;
import oo0oOO0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.o0Oo0oo;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/OooO0OO;", "Lo00O0O0O/OooO0OO;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ConstraintTrackingWorker extends OooO0OO implements o00O0O0O.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Object f11581OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final WorkerParameters f11582OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile boolean f11583OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00000O<OooO0OO.OooO00o> f11584OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f11585OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.f11582OooO0oo = workerParameters;
        this.f11581OooO = new Object();
        this.f11584OooOO0O = new o00000O<>();
    }

    @Override // androidx.work.OooO0OO
    public final void OooO0O0() {
        OooO0OO oooO0OO = this.f11585OooOO0o;
        if (oooO0OO == null || oooO0OO.f11477OooO0o) {
            return;
        }
        oooO0OO.OooO0o0();
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0OO(@NotNull ArrayList workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        o0Oo0oo.OooO0Oo().OooO00o(OooO0O0.f60361OooO00o, "Constraints changed for " + workSpecs);
        synchronized (this.f11581OooO) {
            this.f11583OooOO0 = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.work.OooO0OO
    @NotNull
    public final o00000O OooO0Oo() {
        this.f11478OooO0o0.f11489OooO0OO.execute(new o000O00(this, 1));
        o00000O<OooO0OO.OooO00o> future = this.f11584OooOO0O;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0o(@NotNull List<o00Ooo> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }
}
