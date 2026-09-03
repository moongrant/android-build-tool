package p491o0o00O0o;

import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p650o0ooo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f49069OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(UntieAccountBindActivity untieAccountBindActivity) {
        super(1);
        this.f49069OooO0Oo = untieAccountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        UntieAccountBindActivity fragmentActivity = this.f49069OooO0Oo;
        if (zBooleanValue) {
            int i = o000000.facebook_update_dialog_login_Content;
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            o000O o000o = new o000O(fragmentActivity);
            o000o.OooOoO0(o000000.facebook_update_dialog_Title);
            o000o.OooOOoo(i);
            o000o.OooOo(true);
            o000o.OooOOOO(o000000.facebook_update_dialog_Update);
            o000o.OooOo0(o0O00o0.f58639OooO0Oo);
            o000o.OooOO0o();
        } else {
            int i2 = UntieAccountBindActivity.f24887OooOo;
            fragmentActivity.OooOo().OooO00o();
        }
        return Unit.INSTANCE;
    }
}
