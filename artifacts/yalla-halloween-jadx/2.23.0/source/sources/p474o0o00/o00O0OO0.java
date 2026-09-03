package p474o0o00;

import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneBindActivity f47271OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(PhoneBindActivity phoneBindActivity) {
        super(1);
        this.f47271OooO0Oo = phoneBindActivity;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        boolean zBooleanValue = it.booleanValue();
        PhoneBindActivity phoneBindActivity = this.f47271OooO0Oo;
        if (zBooleanValue) {
            int i = PhoneBindActivity.f25241OooOo0o;
            LinearLayout linearLayout = phoneBindActivity.OooOo().f57458OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llBindNum");
            o000OO00.OooOOOO(linearLayout);
        } else {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o000000O.OooOoO0()) {
                int i2 = PhoneBindActivity.f25241OooOo0o;
                LinearLayout linearLayout2 = phoneBindActivity.OooOo().f57458OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llBindNum");
                o000OO00.OooOOOO(linearLayout2);
            } else {
                int i3 = PhoneBindActivity.f25241OooOo0o;
                LinearLayout linearLayout3 = phoneBindActivity.OooOo().f57458OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llBindNum");
                o000OO00.OooO0O0(linearLayout3);
            }
        }
        return Unit.INSTANCE;
    }
}
