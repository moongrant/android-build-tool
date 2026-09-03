package p487o0o00O;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.main.WebVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48897OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(WebActivity webActivity) {
        super(1);
        this.f48897OooO0Oo = webActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        o0000O00.OooO0OO("onReceivedTitle", "title = " + str2);
        int i = WebActivity.f25130OooOoO0;
        WebActivity webActivity = this.f48897OooO0Oo;
        if (webActivity.OooOoO0().getShowToolbar()) {
            WebVM webVMOooOoO0 = webActivity.OooOoO0();
            if (str2 == null) {
                str2 = "";
            }
            webVMOooOoO0.setToolbarTitle(str2);
        }
        return Unit.INSTANCE;
    }
}
