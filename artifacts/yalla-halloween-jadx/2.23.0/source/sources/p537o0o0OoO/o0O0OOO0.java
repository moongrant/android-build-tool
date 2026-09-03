package p537o0o0OoO;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.code.android.util.o0000;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f55366OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f55367OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55368OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(int i, AppCompatActivity appCompatActivity, int i2) {
        super(1);
        this.f55366OooO0Oo = i;
        this.f55368OooO0o0 = i2;
        this.f55367OooO0o = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.KaVipDetails);
            Intrinsics.checkNotNullExpressionValue(url, "it");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.f32818OooO0o = true;
            webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.user_ka_vip_privilege_title));
            webPageInfo.f32827OooOOOO = o0oO0O0o.f47009o000000;
            webPageInfo.OooO00o("kaVipLevel", String.valueOf(this.f55366OooO0Oo));
            webPageInfo.OooO00o("privilegeId", String.valueOf(this.f55368OooO0o0));
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55367OooO0o, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
