package p597o0oo00o0;

import android.widget.EditText;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f56844OooO0Oo;

    public OooOO0O(OooOOO oooOOO) {
        this.f56844OooO0Oo = oooOOO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        OooOOO oooOOO = this.f56844OooO0Oo;
        oooOOO.f56849OooO0Oo = false;
        OooOOOO oooOOOO = oooOOO.f56847OooO0O0;
        if (oooOOOO == null || (editText = oooOOO.f56846OooO00o) == null) {
            return;
        }
        oooOOOO.OooO0OO(editText.getText().toString());
    }
}
