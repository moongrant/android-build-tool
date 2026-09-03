package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f54865OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(MutableState<IntSize> mutableState) {
        super(1);
        this.f54865OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        this.f54865OooO0Oo.setValue(IntSize.m3927boximpl(intSize.getPackedValue()));
        return Unit.INSTANCE;
    }
}
