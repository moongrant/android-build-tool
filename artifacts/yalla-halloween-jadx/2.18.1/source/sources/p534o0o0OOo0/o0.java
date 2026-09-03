package p534o0o0OOo0;

import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f43513Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(0);
        this.f43513Oooo0o = deleteAccountSubmitActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Me_account_delete_delete_continue");
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f43513Oooo0o;
        DeleteAccountSubmitActivity.OooO00o oooO00o = DeleteAccountSubmitActivity.f21745Ooooo0o;
        Objects.requireNonNull(deleteAccountSubmitActivity);
        String strValueOf = String.valueOf(OooOOO.f41216OooO00o.OooOoO().getValue());
        oo0oOO0 oo0ooo0 = new oo0oOO0(deleteAccountSubmitActivity);
        oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.delete_account));
        oo0ooo0.OooOo0O(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.delete_account_confirm_content1), strValueOf));
        TextView textView = oo0ooo0.OooOOO().f34400OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvMessage");
        oo0o0O0.OooO0o0(textView, new String[]{strValueOf}, o000O0O0.OooO00o(R.color.app_color_));
        oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.Delete));
        oo0ooo0.OooOo0o(new o0O000(deleteAccountSubmitActivity));
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOOO0();
        return Unit.INSTANCE;
    }
}
