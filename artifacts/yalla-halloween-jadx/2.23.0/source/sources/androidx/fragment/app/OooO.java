package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements o0000oO.oo000o.OooO00o, o00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f5881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5882OooO0o0;

    public /* synthetic */ OooO(Object obj, Object obj2) {
        this.f5881OooO0Oo = obj;
        this.f5882OooO0o0 = obj2;
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OooooO0();
    }

    @Override // o0000oO.oo000o.OooO00o
    public final void onCancel() {
        Animator animator = (Animator) this.f5881OooO0Oo;
        SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.f5882OooO0o0;
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }
}
