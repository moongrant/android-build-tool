package p426o0OoOO;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.o0OO00O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Integer> f45612OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f45613OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(MutableLiveData<Integer> mutableLiveData, MutableState<Boolean> mutableState) {
        super(0);
        this.f45612OooO0Oo = mutableLiveData;
        this.f45613OooO0o0 = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        MutableLiveData<Integer> mutableLiveData = this.f45612OooO0Oo;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(3);
        }
        MutableState<Boolean> mutableState = this.f45613OooO0o0;
        if (mutableState != null) {
            z = mutableState.getValue().booleanValue();
        }
        if (z) {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o0OO00O.OooO00o("messageDot", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            mutableState.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
