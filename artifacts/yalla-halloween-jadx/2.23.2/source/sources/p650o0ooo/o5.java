package p650o0ooo;

import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 extends Lambda implements Function1<FragmentActivity, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f58763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58764OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(String str, Function0<Unit> function0) {
        super(1);
        this.f58763OooO0Oo = str;
        this.f58764OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FragmentActivity fragmentActivity) {
        FragmentActivity it = fragmentActivity;
        Intrinsics.checkNotNullParameter(it, "it");
        o000O o000o = new o000O(it);
        o000o.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.gift_Wealth_dialog_unlock_XXX_level), this.f58763OooO0Oo));
        o000o.OooOOOO(o000000.Upgrade_wealth_level);
        o000o.OooOo0(new n5(this.f58764OooO0o0));
        o000o.OooOo0o(o0000.OooO0OO(o000000.Cancel));
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
