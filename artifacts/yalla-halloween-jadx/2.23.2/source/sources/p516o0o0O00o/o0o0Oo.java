package p516o0o0O00o;

import androidx.compose.ui.Alignment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.o0OO0oO0;
import p644o0ooOOo.oO000;
import p644o0ooOOo.oO0OoOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<o0OO0oO0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Alignment f51676OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO f51677OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(Alignment alignment, o0OO o0oo) {
        super(1);
        this.f51676OooO0Oo = alignment;
        this.f51677OooO0o0 = o0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO0oO0 o0oo0oo1) {
        o0OO0oO0 constrainAs = o0oo0oo1;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment topCenter = companion.getTopCenter();
        Alignment alignment = this.f51676OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(alignment, topCenter);
        o0OO o0oo = this.f51677OooO0o0;
        if (zAreEqual) {
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58022OooO0OO, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getTopStart())) {
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58022OooO0OO, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getTopEnd())) {
            oO000.OooO00o(constrainAs.f58051OooO0oO, o0oo.f58022OooO0OO, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getBottomCenter())) {
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58024OooO0o0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getBottomStart())) {
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58024OooO0o0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58048OooO0Oo, o0oo.f58021OooO0O0, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getBottomEnd())) {
            oO000.OooO00o(constrainAs.f58050OooO0o0, o0oo.f58024OooO0o0, 0.0f, 6);
            oO0OoOO0.OooO00o(constrainAs.f58049OooO0o, o0oo.f58023OooO0Oo, 0.0f, 6);
        }
        return Unit.INSTANCE;
    }
}
