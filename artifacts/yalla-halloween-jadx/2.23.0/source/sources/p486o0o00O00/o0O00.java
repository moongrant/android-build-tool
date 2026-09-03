package p486o0o00O00;

import androidx.camera.core.impl.OooOOOO;
import com.yalla.yalla.ui.activity.main.TopActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.o00oO0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopActivity f48336OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(TopActivity topActivity) {
        super(0);
        this.f48336OooO0Oo = topActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strOooOO0O;
        TopActivity topActivity = this.f48336OooO0Oo;
        o0OO00O o0oo00o2 = new o0OO00O(topActivity);
        int i = TopActivity.f25568OooOooO;
        o0oo00o2.OooOoO0(topActivity.OooOoO0().getDialogResource(topActivity.f25571OooOo0)[0].intValue());
        o0oo00o2.OooOOoo(topActivity.OooOoO0().getDialogResource(topActivity.f25571OooOo0)[1].intValue());
        String strOooO0OO = o00oO0o.OooO0OO(topActivity, oO00OOo0.I_got_it);
        Intrinsics.checkNotNullParameter(strOooO0OO, "<this>");
        if (o0000O0O.OooO0o(strOooO0OO)) {
            String strSubstring = strOooO0OO.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.checkNotNullParameter(strSubstring, "<this>");
            String strOooOO0O2 = o0000O0O.OooOO0O(strSubstring);
            String strSubstring2 = strOooO0OO.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNullParameter(strSubstring2, "<this>");
            strOooOO0O = OooOOOO.OooO00o(strOooOO0O2, o0000O0O.OooO0oo(strSubstring2));
        } else {
            Intrinsics.checkNotNullParameter(strOooO0OO, "<this>");
            strOooOO0O = o0000O0O.OooOO0O(strOooO0OO);
        }
        o0oo00o2.OooOOOo(strOooOO0O);
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
