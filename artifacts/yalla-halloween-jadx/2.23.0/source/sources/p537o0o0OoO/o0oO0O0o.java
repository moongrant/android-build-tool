package p537o0o0OoO;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.VipModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipModel f55398OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f55399OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(AppCompatActivity appCompatActivity, VipModel vipModel) {
        super(1);
        this.f55398OooO0Oo = vipModel;
        this.f55399OooO0o0 = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserKaVip);
            Intrinsics.checkNotNullExpressionValue(url, "url");
            webPageInfo.OooO0o0(oOo0o00.OooO0O0(url, "kaVipLevel", String.valueOf(this.f55398OooO0Oo.getKaVipLv())));
            webPageInfo.f32818OooO0o = true;
            webPageInfo.f32827OooOOOO = p469o0OoooOO.o0oO0O0o.f47118o00O0OOo;
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55399OooO0o0, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
