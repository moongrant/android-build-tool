package p491o0o00O0o;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p650o0ooo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f48943OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(1);
        this.f48943OooO0Oo = deleteAccountCheckActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        DeleteAccountCheckActivity fragmentActivity = this.f48943OooO0Oo;
        if (zBooleanValue) {
            fragmentActivity.OooOo0();
            int i = o000000.facebook_update_dialog_unbind_Content;
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            o000O o000o = new o000O(fragmentActivity);
            o000o.OooOoO0(o000000.facebook_update_dialog_Title);
            o000o.OooOOoo(i);
            o000o.OooOo(true);
            o000o.OooOOOO(o000000.facebook_update_dialog_Update);
            o000o.OooOo0(o0O00o0.f58639OooO0Oo);
            o000o.OooOO0o();
        } else {
            OpenAuthManager openAuthManager = fragmentActivity.f24714OooOo0o;
            if (openAuthManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openAuthManager");
                openAuthManager = null;
            }
            openAuthManager.OooO00o();
        }
        return Unit.INSTANCE;
    }
}
