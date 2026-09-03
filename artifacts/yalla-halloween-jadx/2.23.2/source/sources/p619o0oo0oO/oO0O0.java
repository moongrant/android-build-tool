package p619o0oo0oO;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.view.EvaAnimView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p612o0oo0OoO.r5;
import p616o0oo0o00.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EvaAnimView f57555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f57556OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(EvaAnimView evaAnimView, Oooo0 oooo0) {
        super(0);
        this.f57555OooO0Oo = evaAnimView;
        this.f57556OooO0o0 = oooo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        r5 r5Var;
        EvaAnimView evaAnimView = this.f57555OooO0Oo;
        if (evaAnimView.getVisibility() != 0) {
            int i = EvaAnimView.f32438OooOOo;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("AnimView is GONE, can't play", "msg");
        } else {
            r5 r5Var2 = evaAnimView.f32440OooO0Oo;
            if (r5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                r5Var = null;
            } else {
                r5Var = r5Var2;
            }
            if (r5Var.OooO0O0()) {
                int i2 = EvaAnimView.f32438OooOOo;
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("is running can not start", "msg");
            } else {
                Oooo0 oooo0 = this.f57556OooO0o0;
                evaAnimView.f32445OooOO0 = oooo0;
                if (r5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    r5Var2 = null;
                }
                r5Var2.OooO0o(oooo0);
            }
        }
        return Unit.INSTANCE;
    }
}
