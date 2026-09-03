package p524o0o0O0oO;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Integer> f43075Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f43076Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(MutableLiveData<Integer> mutableLiveData, o0O00OO<Boolean> o0o00oo2) {
        super(0);
        this.f43075Oooo0o = mutableLiveData;
        this.f43076Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<Integer> mutableLiveData = this.f43075Oooo0o;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(3);
        }
        o0O00OO<Boolean> o0o00oo2 = this.f43076Oooo0oO;
        if (o0o00oo2 != null && o0o00oo2.getValue().booleanValue()) {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0o0().OooOOOO(false);
            this.f43076Oooo0oO.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
