package androidx.fragment.app;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.o00O00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f5900OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5901OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f5902OooO0oO;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2, Object obj3) {
        this.f5899OooO0Oo = i;
        this.f5901OooO0o0 = obj;
        this.f5900OooO0o = obj2;
        this.f5902OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5899OooO0Oo;
        Object obj = this.f5902OooO0oO;
        Object obj2 = this.f5900OooO0o;
        Object obj3 = this.f5901OooO0o0;
        switch (i) {
            case 0:
                List awaitingContainerChanges = (List) obj3;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj2;
                OooOOO this$0 = (OooOOO) obj;
                Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (awaitingContainerChanges.contains(operation)) {
                    awaitingContainerChanges.remove(operation);
                    this$0.getClass();
                    View view = operation.f5954OooO0OO.mView;
                    SpecialEffectsController.Operation.State state = operation.f5952OooO00o;
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    state.OooO00o(view);
                }
                break;
            default:
                o00O00O o00o00o2 = (o00O00O) obj3;
                o00o00o2.getClass();
                o0O00 o0o00OooO0oo = ((ImmutableList.OooO00o) obj2).OooO0oo();
                o00o00o2.f34074OooO0OO.OooOoO0(o0o00OooO0oo, (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) obj);
                break;
        }
    }
}
