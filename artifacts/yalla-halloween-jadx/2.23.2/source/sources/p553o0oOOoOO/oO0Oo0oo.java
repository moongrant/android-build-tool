package p553o0oOOoOO;

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
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f56134OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f56135OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f56136OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(int i, AppCompatActivity appCompatActivity, int i2) {
        super(1);
        this.f56134OooO0Oo = i;
        this.f56136OooO0o0 = i2;
        this.f56135OooO0o = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.KaVipDetails);
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.f32282OooO0o = true;
            webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.user_ka_vip_privilege_title));
            webPageInfo.f32291OooOOOO = o0OOo000.f48197o00000;
            webPageInfo.OooO00o("kaVipLevel", String.valueOf(this.f56134OooO0Oo));
            webPageInfo.OooO00o("privilegeId", String.valueOf(this.f56136OooO0o0));
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f56135OooO0o, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
