package p553o0oOOoOO;

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
import p476o0OooooO.o0OOo000;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VipModel f56058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f56059OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(AppCompatActivity appCompatActivity, VipModel vipModel) {
        super(1);
        this.f56058OooO0Oo = vipModel;
        this.f56059OooO0o0 = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserKaVip);
            Intrinsics.checkNotNull(str2);
            webPageInfo.OooO0o0(c1.OooO0O0(str2, "kaVipLevel", String.valueOf(this.f56058OooO0Oo.getKaVipLv())));
            webPageInfo.f32282OooO0o = true;
            webPageInfo.f32291OooOOOO = o0OOo000.f48310o00O0Oo;
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f56059OooO0o0, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
