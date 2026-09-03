package p597o0oo00o0;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f56852OooO0Oo;

    public OooOOO0(OooOOO oooOOO) {
        this.f56852OooO0Oo = oooOOO;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OooOO0O oooOO0O;
        OooOOO oooOOO = this.f56852OooO0Oo;
        if (oooOOO.f56849OooO0Oo) {
            return;
        }
        oooOOO.f56849OooO0Oo = true;
        Handler handler = oooOOO.f56851OooO0o0;
        if (handler == null || (oooOO0O = oooOOO.f56850OooO0o) == null) {
            return;
        }
        handler.postDelayed(oooOO0O, oooOOO.f56848OooO0OO);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
