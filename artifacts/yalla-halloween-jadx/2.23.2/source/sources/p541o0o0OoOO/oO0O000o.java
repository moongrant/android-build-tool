package p541o0o0OoOO;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.unit.IntSize;
import com.code.android.util.o0000O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000o extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f55100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f55101OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f55102OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55103OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f55104OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000o(boolean z, float f, boolean z2, int i, MutableFloatState mutableFloatState) {
        super(1);
        this.f55100OooO0Oo = z;
        this.f55102OooO0o0 = f;
        this.f55101OooO0o = z2;
        this.f55103OooO0oO = i;
        this.f55104OooO0oo = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        long packedValue = intSize.getPackedValue();
        boolean z = this.f55100OooO0Oo;
        MutableFloatState mutableFloatState = this.f55104OooO0oo;
        if (z) {
            mutableFloatState.setFloatValue((o0000O00.OooO0OO() - IntSize.m3935getWidthimpl(packedValue)) - this.f55102OooO0o0);
        } else if (!this.f55101OooO0o) {
            mutableFloatState.setFloatValue(this.f55103OooO0oO - (IntSize.m3935getWidthimpl(packedValue) / 2.0f));
        }
        return Unit.INSTANCE;
    }
}
