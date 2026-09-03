package p650o0ooo;

import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class m5 extends Lambda implements Function1<FragmentActivity, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebPageInfo, Unit> f58394OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5(Function1<? super WebPageInfo, Unit> function1) {
        super(1);
        this.f58394OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FragmentActivity fragmentActivity) {
        FragmentActivity ac = fragmentActivity;
        Intrinsics.checkNotNullParameter(ac, "ac");
        o000O o000o = new o000O(ac);
        o000o.OooOo00(o0000.OooO0OO(o000000.gift_Wealth_dialog_unlock_title));
        o000o.OooOOOO(o000000.gift_Wealth_dialog_unlock_button);
        o000o.OooOo0(new l5(ac, this.f58394OooO0Oo));
        o000o.OooOo0o(o0000.OooO0OO(o000000.Cancel));
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
