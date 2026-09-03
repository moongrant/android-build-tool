package p172o00OooO;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 implements TextWatcher {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f32692Oooo0o;

    public o00O0O00(o00O0O0 o00o0o0) {
        this.f32692Oooo0o = o00o0o0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        o00O0 o00o1;
        o00O0O0 o00o0o0 = this.f32692Oooo0o;
        if (o00o0o0.f32689OooO0Oo) {
            return;
        }
        o00o0o0.f32689OooO0Oo = true;
        Handler handler = o00o0o0.f32691OooO0o0;
        if (handler == null || (o00o1 = o00o0o0.f32690OooO0o) == null) {
            return;
        }
        handler.postDelayed(o00o1, o00o0o0.f32688OooO0OO);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
