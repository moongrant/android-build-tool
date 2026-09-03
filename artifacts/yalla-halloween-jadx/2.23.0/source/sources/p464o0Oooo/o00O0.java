package p464o0Oooo;

import androidx.lifecycle.MutableLiveData;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends MutableLiveData<Boolean> {
    public o00O0(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        Boolean bool = (Boolean) obj;
        super.setValue(bool);
        o00Oo0.OooO00o().OooO0o("isLogin", bool != null ? bool.booleanValue() : false);
    }
}
