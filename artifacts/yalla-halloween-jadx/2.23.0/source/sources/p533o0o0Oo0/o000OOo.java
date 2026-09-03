package p533o0o0Oo0;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.unit.IntSize;
import com.code.android.util.o0000O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f54721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f54722OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f54723OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54724OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f54725OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(boolean z, float f, boolean z2, int i, MutableFloatState mutableFloatState) {
        super(1);
        this.f54721OooO0Oo = z;
        this.f54723OooO0o0 = f;
        this.f54722OooO0o = z2;
        this.f54724OooO0oO = i;
        this.f54725OooO0oo = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        long packedValue = intSize.getPackedValue();
        boolean z = this.f54721OooO0Oo;
        MutableFloatState mutableFloatState = this.f54725OooO0oo;
        if (z) {
            mutableFloatState.setFloatValue((o0000O00.OooO0O0() - IntSize.m3925getWidthimpl(packedValue)) - this.f54723OooO0o0);
        } else if (!this.f54722OooO0o) {
            mutableFloatState.setFloatValue(this.f54724OooO0oO - (IntSize.m3925getWidthimpl(packedValue) / 2.0f));
        }
        return Unit.INSTANCE;
    }
}
