package p433o0OoOOO0;

import androidx.appcompat.widget.o0000O0O;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Integer> f46861OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f46862OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(MutableLiveData<Integer> mutableLiveData, MutableState<Boolean> mutableState) {
        super(0);
        this.f46861OooO0Oo = mutableLiveData;
        this.f46862OooO0o0 = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        MutableLiveData<Integer> mutableLiveData = this.f46861OooO0Oo;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(3);
        }
        MutableState<Boolean> mutableState = this.f46862OooO0o0;
        if (mutableState != null) {
            z = mutableState.getValue().booleanValue();
        }
        if (z) {
            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0000O0O.OooO0O0("messageDot", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            mutableState.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
