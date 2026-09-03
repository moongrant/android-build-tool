package p535o0o0OOoO;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.main.TopActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.oo0oOO0;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOOOoo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopActivity f43717Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(TopActivity topActivity) {
        super(0);
        this.f43717Oooo0o = topActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strOooOO0;
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f43717Oooo0o);
        TopActivity topActivity = this.f43717Oooo0o;
        TopActivity.OooO00o oooO00o = TopActivity.f22092ooOO;
        oo0ooo0.OooOoo(topActivity.OooOooO().getDialogResource(topActivity.f22095Ooooo0o)[0].intValue());
        oo0ooo0.OooOo0(topActivity.OooOooO().getDialogResource(topActivity.f22095Ooooo0o)[1].intValue());
        String strOooO0OO = OooOOO.OooO0OO(R.string.I_got_it);
        Intrinsics.checkNotNullParameter(strOooO0OO, "<this>");
        if (o00O0.OooO0o0(strOooO0OO)) {
            StringBuilder sb = new StringBuilder();
            String strSubstring = strOooO0OO.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(o00O0.OooOO0(strSubstring));
            String strSubstring2 = strOooO0OO.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            Intrinsics.checkNotNullParameter(strSubstring2, "<this>");
            sb.append(o00O0.OooO0o(strSubstring2));
            strOooOO0 = sb.toString();
        } else {
            strOooOO0 = o00O0.OooOO0(strOooO0OO);
        }
        oo0ooo0.OooOOo0(strOooOO0);
        oo0ooo0.OooOOO0();
        return Unit.INSTANCE;
    }
}
