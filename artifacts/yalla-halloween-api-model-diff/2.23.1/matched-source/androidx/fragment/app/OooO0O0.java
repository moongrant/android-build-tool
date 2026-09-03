package androidx.fragment.app;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f5905OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5906OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f5907OooO0oO;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2, Object obj3) {
        this.f5904OooO0Oo = i;
        this.f5906OooO0o0 = obj;
        this.f5905OooO0o = obj2;
        this.f5907OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5904OooO0Oo;
        Object obj = this.f5907OooO0oO;
        Object obj2 = this.f5905OooO0o;
        Object obj3 = this.f5906OooO0o0;
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
                    View view = operation.f5959OooO0OO.mView;
                    SpecialEffectsController.Operation.State state = operation.f5957OooO00o;
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    state.OooO00o(view);
                }
                break;
            default:
                oOO00O ooo00o = (oOO00O) obj3;
                ooo00o.getClass();
                o0O00 o0o00OooO0oo = ((ImmutableList.OooO00o) obj2).OooO0oo();
                ooo00o.f34135OooO0OO.OooOoO0(o0o00OooO0oo, (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) obj);
                break;
        }
    }
}
