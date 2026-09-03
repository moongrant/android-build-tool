package p519o0o0O0oO;

import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class n5 extends Lambda implements Function1<FragmentActivity, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f52442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f52443OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(String str, Function0<Unit> function0) {
        super(1);
        this.f52442OooO0Oo = str;
        this.f52443OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FragmentActivity fragmentActivity) {
        FragmentActivity it = fragmentActivity;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OO00O o0oo00o2 = new o0OO00O(it);
        o0oo00o2.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.gift_Wealth_dialog_unlock_XXX_level), this.f52442OooO0Oo));
        o0oo00o2.OooOOOO(oO00OOo0.Upgrade_wealth_level);
        o0oo00o2.OooOo0(new m5(this.f52443OooO0o0));
        o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Cancel));
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
