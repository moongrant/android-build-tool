package p487o0o00O;

import androidx.camera.core.impl.OooOOOO;
import com.yalla.yalla.ui.activity.main.TopActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p423o0OoO0OO.o000;
import p423o0OoO0OO.o00O00OO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopActivity f48895OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(TopActivity topActivity) {
        super(0);
        this.f48895OooO0Oo = topActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strOooOO0O;
        TopActivity topActivity = this.f48895OooO0Oo;
        o000O o000o = new o000O(topActivity);
        int i = TopActivity.f25114OooOooO;
        o000o.OooOoO0(topActivity.OooOoO0().getDialogResource(topActivity.f25117OooOo0)[0].intValue());
        o000o.OooOOoo(topActivity.OooOoO0().getDialogResource(topActivity.f25117OooOo0)[1].intValue());
        String strOooO0OO = o000.OooO0OO(topActivity, o000000.I_got_it);
        Intrinsics.checkNotNullParameter(strOooO0OO, "<this>");
        if (o00O00OO.OooO0o(strOooO0OO)) {
            String strSubstring = strOooO0OO.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNullParameter(strSubstring, "<this>");
            String strOooOO0O2 = o00O00OO.OooOO0O(strSubstring);
            String strSubstring2 = strOooO0OO.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNullParameter(strSubstring2, "<this>");
            strOooOO0O = OooOOOO.OooO00o(strOooOO0O2, o00O00OO.OooO0oo(strSubstring2));
        } else {
            Intrinsics.checkNotNullParameter(strOooO0OO, "<this>");
            strOooOO0O = o00O00OO.OooOO0O(strOooO0OO);
        }
        o000o.OooOOOo(strOooOO0O);
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
