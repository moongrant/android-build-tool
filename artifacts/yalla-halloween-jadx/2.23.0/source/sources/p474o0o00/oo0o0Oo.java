package p474o0o00;

import android.widget.TextView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f47356OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(0);
        this.f47356OooO0Oo = deleteAccountSubmitActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = DeleteAccountSubmitActivity.f25179OooOo0;
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f47356OooO0Oo;
        deleteAccountSubmitActivity.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strValueOf = String.valueOf(o000000O.OooOOoo().getValue());
        o0OO00O o0oo00o2 = new o0OO00O(deleteAccountSubmitActivity);
        o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.delete_account));
        o0oo00o2.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.delete_account_confirm_content1), strValueOf));
        TextView textView = o0oo00o2.OooOOO0().f38476OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvMessage");
        o000O0o.OooO0Oo(textView, o0000.OooO00o(oO00O0o.app_color_), strValueOf);
        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Delete));
        o0oo00o2.OooOo0(new o000000O(deleteAccountSubmitActivity));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
