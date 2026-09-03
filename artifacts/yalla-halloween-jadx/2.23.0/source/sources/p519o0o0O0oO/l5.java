package p519o0o0O0oO;

import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class l5 extends Lambda implements Function1<FragmentActivity, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<WebPageInfo, Unit> f52421OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l5(Function1<? super WebPageInfo, Unit> function1) {
        super(1);
        this.f52421OooO0Oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FragmentActivity fragmentActivity) {
        FragmentActivity ac = fragmentActivity;
        Intrinsics.checkNotNullParameter(ac, "ac");
        o0OO00O o0oo00o2 = new o0OO00O(ac);
        o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.gift_Wealth_dialog_unlock_title));
        o0oo00o2.OooOOOO(oO00OOo0.gift_Wealth_dialog_unlock_button);
        o0oo00o2.OooOo0(new k5(ac, this.f52421OooO0Oo));
        o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Cancel));
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
