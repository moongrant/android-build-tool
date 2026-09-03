package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO extends Lambda implements Function1<o00000O0.o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f682Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f683Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f684Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i) {
        super(1);
        this.f682Oooo0o = f;
        this.f683Oooo0oO = closedFloatingPointRange;
        this.f684Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0.o0OO00O o0oo00o2) {
        o00000O0.o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        o00000O0.o0ooOOo.OooO(semantics, new o00000O0.OooOO0(((Number) RangesKt.coerceIn(Float.valueOf(this.f682Oooo0o), this.f683Oooo0oO)).floatValue(), this.f683Oooo0oO, this.f684Oooo0oo));
        return Unit.INSTANCE;
    }
}
