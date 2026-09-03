package p601o0oo00oO;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f57377OooO0Oo;

    public o0000O0O(o000OO o000oo2) {
        this.f57377OooO0Oo = o000oo2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        o0000O0 o0000o1;
        o000OO o000oo2 = this.f57377OooO0Oo;
        if (o000oo2.f57382OooO0Oo) {
            return;
        }
        o000oo2.f57382OooO0Oo = true;
        Handler handler = o000oo2.f57384OooO0o0;
        if (handler == null || (o0000o1 = o000oo2.f57383OooO0o) == null) {
            return;
        }
        handler.postDelayed(o0000o1, o000oo2.f57381OooO0OO);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
