package p578o0oOoOoo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0O00 extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f56502OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f56503OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f56504OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oOOo0O00(float f, MutableState<Float> mutableState, Function1<? super Float, Unit> function1) {
        super(1);
        this.f56502OooO0Oo = f;
        this.f56504OooO0o0 = mutableState;
        this.f56503OooO0o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        if (this.f56502OooO0Oo - fFloatValue >= 0.5f) {
            Float fValueOf = Float.valueOf(fFloatValue);
            MutableState<Float> mutableState = this.f56504OooO0o0;
            mutableState.setValue(fValueOf);
            Function1<Float, Unit> function1 = this.f56503OooO0o;
            if (function1 != null) {
                function1.invoke(Float.valueOf(mutableState.getValue().floatValue() * 1000));
            }
        }
        return Unit.INSTANCE;
    }
}
