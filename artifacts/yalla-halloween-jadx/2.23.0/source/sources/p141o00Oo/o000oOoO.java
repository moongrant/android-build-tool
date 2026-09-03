package p141o00Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000OOo f37499OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f37501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<Float> f37502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f37503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37504OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37505OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(MutableState<Float> mutableState, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, CoroutineScope coroutineScope, o000OOo o000ooo2, Function0<Unit> function0) {
        super(1);
        this.f37500OooO0Oo = mutableState;
        this.f37502OooO0o0 = list;
        this.f37501OooO0o = floatRef;
        this.f37503OooO0oO = floatRef2;
        this.f37504OooO0oo = coroutineScope;
        this.f37499OooO = o000ooo2;
        this.f37505OooOO0 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        Object obj;
        Function0<Unit> function0;
        float fFloatValue = f.floatValue();
        float fFloatValue2 = this.f37500OooO0Oo.getValue().floatValue();
        float f2 = this.f37501OooO0o.element;
        float f3 = this.f37503OooO0oO.element;
        float f4 = o0OoOo0.f37572OooO00o;
        Iterator<T> it = this.f37502OooO0o0.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next).floatValue()) - fFloatValue2);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next2).floatValue()) - fFloatValue2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f5 = (Float) obj;
        float fLerp = f5 != null ? MathHelpersKt.lerp(f2, f3, f5.floatValue()) : fFloatValue2;
        if (!(fFloatValue2 == fLerp)) {
            BuildersKt__Builders_commonKt.launch$default(this.f37504OooO0oo, null, null, new Oooo0(this.f37499OooO, fFloatValue2, fLerp, fFloatValue, this.f37505OooOO0, null), 3, null);
        } else if (!((Boolean) this.f37499OooO.f37492OooO0O0.getValue()).booleanValue() && (function0 = this.f37505OooOO0) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
