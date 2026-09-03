package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f2189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f2190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f2191OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("lock")
    @NotNull
    public final ArrayList f2192OooO0Oo;

    public OooOo(@NotNull ComponentActivity.OooO executor, @NotNull OooO0OO reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f2189OooO00o = reportFullyDrawn;
        this.f2190OooO0O0 = new Object();
        this.f2192OooO0Oo = new ArrayList();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o() {
        synchronized (this.f2190OooO0O0) {
            this.f2191OooO0OO = true;
            Iterator it = this.f2192OooO0Oo.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            this.f2192OooO0Oo.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
