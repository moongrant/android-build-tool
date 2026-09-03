package p491o0o00O0o;

import android.widget.TextView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p423o0OoO0OO.o00O0O0O;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f48953OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(0);
        this.f48953OooO0Oo = deleteAccountSubmitActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = DeleteAccountSubmitActivity.f24720OooOo0;
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f48953OooO0Oo;
        deleteAccountSubmitActivity.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strValueOf = String.valueOf(o0O00oO0.OooOOoo().getValue());
        o000O o000o = new o000O(deleteAccountSubmitActivity);
        o000o.OooOoO(o0000.OooO0OO(o000000.delete_account));
        o000o.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.delete_account_confirm_content1), strValueOf));
        TextView tvMessage = o000o.OooOOO0().f39392OooO0o0;
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        o00O0O0O.OooO0Oo(tvMessage, o0000.OooO00o(o0OOO0o.app_color_), strValueOf);
        o000o.OooOOOo(o0000.OooO0OO(o000000.Delete));
        o000o.OooOo0(new o000O0Oo(deleteAccountSubmitActivity));
        o000o.OooOo(true);
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
