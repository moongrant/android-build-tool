package p498o0o00Oo0;

import androidx.lifecycle.MutableLiveData;
import java.util.Objects;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o00O0O;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends MutableLiveData<Boolean> {
    public o000OOo(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        Boolean bool = (Boolean) obj;
        super.setValue(bool);
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Objects.requireNonNull(o00o0oOooO00o);
        o00o0oOooO00o.OooO0o(o000O0O0.OooO00o(-19098891427344L), zBooleanValue);
    }
}
