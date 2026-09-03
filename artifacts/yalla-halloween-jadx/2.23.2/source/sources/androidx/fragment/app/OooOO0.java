package androidx.fragment.app;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO.OooO0OO f5911OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f5912OooO0o0;

    public /* synthetic */ OooOO0(OooOOO.OooO0OO oooO0OO, SpecialEffectsController.Operation operation) {
        this.f5911OooO0Oo = oooO0OO;
        this.f5912OooO0o0 = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOOO.OooO0OO transitionInfo = this.f5911OooO0Oo;
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        SpecialEffectsController.Operation operation = this.f5912OooO0o0;
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.OooO00o();
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
        }
    }
}
