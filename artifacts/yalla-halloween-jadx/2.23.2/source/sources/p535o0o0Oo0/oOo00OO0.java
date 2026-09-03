package p535o0o0Oo0;

import android.app.Activity;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 extends Lambda implements Function1<MomentReplyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54243OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<MomentReplyModel> f54244OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(MomentVideoVM momentVideoVM, Ref.ObjectRef<MomentReplyModel> objectRef) {
        super(1);
        this.f54243OooO0Oo = momentVideoVM;
        this.f54244OooO0o0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentReplyModel momentReplyModel) {
        MomentReplyModel it = momentReplyModel;
        Intrinsics.checkNotNullParameter(it, "it");
        oO00O0o onLogin = new oO00O0o(this.f54243OooO0Oo, this.f54244OooO0o0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
