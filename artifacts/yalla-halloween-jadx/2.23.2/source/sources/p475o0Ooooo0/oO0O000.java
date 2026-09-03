package p475o0Ooooo0;

import androidx.appcompat.widget.o0000O0O;
import androidx.lifecycle.MutableLiveData;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 extends MutableLiveData<Boolean> {
    public oO0O000(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        Boolean bool = (Boolean) obj;
        super.setValue(bool);
        oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        oo0ooo0oOooO0o0.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0000O0O.OooO0O0("welcome", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, zBooleanValue);
    }
}
