package p669oO0Oo;

import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f60517OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(Ref.IntRef intRef) {
        super(1);
        this.f60517OooO0Oo = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        long packedValue = intSize.getPackedValue();
        this.f60517OooO0Oo.element = IntSize.m3924getHeightimpl(packedValue);
        return Unit.INSTANCE;
    }
}
