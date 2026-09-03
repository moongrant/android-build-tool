package p430o0OoOOO0;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p520o0o0O0oo.x6;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function2<WebPageInfo, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0o f45762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ x6 f45763OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o000O0o o000o0o2, x6 x6Var) {
        super(2);
        this.f45762OooO0Oo = o000o0o2;
        this.f45763OooO0o0 = x6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(WebPageInfo webPageInfo, Boolean bool) {
        WebPageInfo webPageInfo2 = webPageInfo;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        if (zBooleanValue) {
            BaseMomentDetailVM baseMomentDetailVM = this.f45762OooO0Oo.f45776OooO0Oo;
            if (baseMomentDetailVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMomentVM");
                baseMomentDetailVM = null;
            }
            baseMomentDetailVM.setHalfDialogWebPageInfo(webPageInfo2);
        } else {
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f45763OooO0o0.f10133OooO00o, webPageInfo2);
        }
        return Unit.INSTANCE;
    }
}
