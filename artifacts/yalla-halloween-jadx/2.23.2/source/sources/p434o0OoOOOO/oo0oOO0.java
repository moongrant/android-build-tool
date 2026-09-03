package p434o0OoOOOO;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function2<WebPageInfo, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO f46998OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000OO f46999OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(o00O0OO o00o0oo2, o00000OO o00000oo2) {
        super(2);
        this.f46998OooO0Oo = o00o0oo2;
        this.f46999OooO0o0 = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(WebPageInfo webPageInfo, Boolean bool) {
        WebPageInfo webPageInfo2 = webPageInfo;
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        if (zBooleanValue) {
            BaseMomentDetailVM baseMomentDetailVM = this.f46998OooO0Oo.f46929OooO0Oo;
            if (baseMomentDetailVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMomentVM");
                baseMomentDetailVM = null;
            }
            baseMomentDetailVM.setHalfDialogWebPageInfo(webPageInfo2);
        } else {
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f46999OooO0o0.f38487OooO00o, webPageInfo2);
        }
        return Unit.INSTANCE;
    }
}
