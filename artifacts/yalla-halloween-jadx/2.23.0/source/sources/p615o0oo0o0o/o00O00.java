package p615o0oo0o0o;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.view.EvaAnimView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p607o0oo0OOo.m1;
import p609o0oo0OoO.p1;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EvaAnimView f57048OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ p1 f57049OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(EvaAnimView evaAnimView, p1 p1Var) {
        super(0);
        this.f57048OooO0Oo = evaAnimView;
        this.f57049OooO0o0 = p1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        m1 m1Var;
        EvaAnimView evaAnimView = this.f57048OooO0Oo;
        if (evaAnimView.getVisibility() != 0) {
            int i = EvaAnimView.f32973OooOOo;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("AnimView is GONE, can't play", "msg");
        } else {
            m1 m1Var2 = evaAnimView.f32975OooO0Oo;
            if (m1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                m1Var = null;
            } else {
                m1Var = m1Var2;
            }
            if (m1Var.OooO0O0()) {
                int i2 = EvaAnimView.f32973OooOOo;
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("is running can not start", "msg");
            } else {
                p1 p1Var = this.f57049OooO0o0;
                evaAnimView.f32980OooOO0 = p1Var;
                if (m1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    m1Var2 = null;
                }
                m1Var2.OooO0o(p1Var);
            }
        }
        return Unit.INSTANCE;
    }
}
