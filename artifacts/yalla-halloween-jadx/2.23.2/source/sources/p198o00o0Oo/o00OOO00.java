package p198o00o0Oo;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f39146OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f39147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f39148OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39149OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f39150OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f39151OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOO00(boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.f39147OooO0Oo = z;
        this.f39149OooO0o0 = closedFloatingPointRange;
        this.f39148OooO0o = i;
        this.f39150OooO0oO = f;
        this.f39151OooO0oo = function1;
        this.f39146OooO = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (!this.f39147OooO0Oo) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        SemanticsPropertiesKt.setProgress$default(semantics, null, new o00OO(this.f39149OooO0o0, this.f39148OooO0o, this.f39150OooO0oO, this.f39151OooO0oo, this.f39146OooO), 1, null);
        return Unit.INSTANCE;
    }
}
