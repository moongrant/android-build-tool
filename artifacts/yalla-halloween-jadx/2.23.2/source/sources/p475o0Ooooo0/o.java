package p475o0Ooooo0;

import androidx.lifecycle.MutableLiveData;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends MutableLiveData<Boolean> {
    public o(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        Boolean bool = (Boolean) obj;
        super.setValue(bool);
        o00Ooo.OooO00o().OooO0o("isLogin", bool != null ? bool.booleanValue() : false);
    }
}
