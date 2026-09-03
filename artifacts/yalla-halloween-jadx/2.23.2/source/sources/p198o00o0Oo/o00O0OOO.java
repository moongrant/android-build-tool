package p198o00o0Oo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0OOO extends FunctionReferenceImpl implements Function1<Float, Float> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39037OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f39038OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f39039OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f39037OooO0Oo = closedFloatingPointRange;
        this.f39039OooO0o0 = floatRef;
        this.f39038OooO0o = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f) {
        float fFloatValue = f.floatValue();
        return Float.valueOf(o00OO0O0.OooO00o.access$invoke$scaleToOffset(this.f39037OooO0Oo, this.f39039OooO0o0, this.f39038OooO0o, fFloatValue));
    }
}
