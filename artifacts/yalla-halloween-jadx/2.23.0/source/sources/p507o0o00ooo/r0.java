package p507o0o00ooo;

import androidx.compose.ui.Alignment;
import com.android.billingclient.api.o000;
import com.android.billingclient.api.o000Oo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p642o0ooOOo.o0OO0;
import p642o0ooOOo.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends Lambda implements Function1<o0OO0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Alignment f50201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OO0O0 f50202OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Alignment alignment, o0OO0O0 o0oo0o1) {
        super(1);
        this.f50201OooO0Oo = alignment;
        this.f50202OooO0o0 = o0oo0o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO0 o0oo1) {
        o0OO0 constrainAs = o0oo1;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment topCenter = companion.getTopCenter();
        Alignment alignment = this.f50201OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(alignment, topCenter);
        o0OO0O0 o0oo0o1 = this.f50202OooO0o0;
        if (zAreEqual) {
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59541OooO0OO, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getTopStart())) {
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59541OooO0OO, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getTopEnd())) {
            o000.OooO00o(constrainAs.f59524OooO0oO, o0oo0o1.f59541OooO0OO, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getBottomCenter())) {
            o000.OooO00o(constrainAs.f59523OooO0o0, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getBottomStart())) {
            o000.OooO00o(constrainAs.f59523OooO0o0, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59521OooO0Oo, o0oo0o1.f59540OooO0O0, 0.0f, 6);
        } else if (Intrinsics.areEqual(alignment, companion.getBottomEnd())) {
            o000.OooO00o(constrainAs.f59523OooO0o0, o0oo0o1.f59543OooO0o0, 0.0f, 6);
            o000Oo0.OooO0OO(constrainAs.f59522OooO0o, o0oo0o1.f59542OooO0Oo, 0.0f, 6);
        }
        return Unit.INSTANCE;
    }
}
