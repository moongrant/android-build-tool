package p464o0Oooo;

import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.o0OO00O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends MutableLiveData<Boolean> {
    public o0O00o00(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        Boolean bool = (Boolean) obj;
        super.setValue(bool);
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        o0o0o00OooO0o0.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0OO00O.OooO00o("welcome", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, zBooleanValue);
    }
}
