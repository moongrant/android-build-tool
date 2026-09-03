package p578o0oOoOoo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0OOo000.OooO0O0;
import o0OOo000.OooO0OO;
import p455o0Ooo0O0.oo0o0Oo;
import p468o0OoooO0.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OoO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56459OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f56460OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OoO0(MutableState<Boolean> mutableState, oo0o0Oo oo0o0oo) {
        super(0);
        this.f56459OooO0Oo = mutableState;
        this.f56460OooO0o0 = oo0o0oo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f56459OooO0Oo.setValue(Boolean.FALSE);
        oo0o0Oo oo0o0oo = this.f56460OooO0o0;
        Float value = oo0o0oo.OooO0oo().f46616OooO00o.getValue();
        oo0o0oo.f46598OooO.setIntValue((int) (value != null ? value.floatValue() : 0.0f));
        OooO0OO oooO0OOOooO0o0 = oo0o0oo.OooO0o0();
        if (oooO0OOOooO0o0 != null) {
            oooO0OOOooO0o0.OooO0oO(oo0o0oo.OooO0oO() / 100.0f);
        }
        Float value2 = oo0o0oo.OooO0oo().f46617OooO0O0.getValue();
        oo0o0oo.f46607OooOO0.setIntValue((int) (value2 != null ? value2.floatValue() : 0.0f));
        OooO0O0 oooO0O0 = o0OOo000.f46938OooO00o;
        o0OOo000.f46938OooO00o.OooO0oO(oo0o0oo.OooO0O0() / 100.0f);
        return Unit.INSTANCE;
    }
}
