package p474o0o00;

import android.view.View;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f47254OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        super(1);
        this.f47254OooO0Oo = loginOnRoomDialogActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.TermsOfService);
        webPageInfo.OooO0o0(o0000O.f44170o000oOoO);
        webPageInfo.OooO00o("type", "1");
        int i = WebActivity.f25584OooOoO0;
        LoginOnRoomDialogActivity loginOnRoomDialogActivity = this.f47254OooO0Oo;
        WebActivity.OooO00o.OooO00o(loginOnRoomDialogActivity, webPageInfo);
        loginOnRoomDialogActivity.finish();
        return Unit.INSTANCE;
    }
}
