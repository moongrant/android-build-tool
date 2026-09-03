package p511o0o0O;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO0Oo0oo;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51057OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(o00000OO o00000oo2) {
        super(1);
        this.f51057OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000OO o00000oo2 = this.f51057OooO0Oo;
        o00000oo2.getClass();
        oO0Oo0oo oo0oo0ooOooO0Oo = o00Ooo.OooO0Oo();
        oo0oo0ooOooO0Oo.getClass();
        oo0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + o0O00oO0.OooOOo0().getValue(), true);
        ConstraintLayout customGiftWarnContainer = o00000oo2.OooOOo0().f44504OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer, "customGiftWarnContainer");
        o000O.OooO0O0(customGiftWarnContainer);
        return Unit.INSTANCE;
    }
}
