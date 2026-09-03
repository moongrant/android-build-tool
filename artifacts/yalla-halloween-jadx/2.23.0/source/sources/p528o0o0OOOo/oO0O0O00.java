package p528o0o0OOOo;

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
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O00 extends Lambda implements Function1<MomentReplyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53939OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<MomentReplyModel> f53940OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O00(MomentVideoVM momentVideoVM, Ref.ObjectRef<MomentReplyModel> objectRef) {
        super(1);
        this.f53939OooO0Oo = momentVideoVM;
        this.f53940OooO0o0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentReplyModel momentReplyModel) {
        MomentReplyModel it = momentReplyModel;
        Intrinsics.checkNotNullParameter(it, "it");
        oO0O0 onLogin = new oO0O0(this.f53939OooO0Oo, this.f53940OooO0o0);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
        } else {
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
