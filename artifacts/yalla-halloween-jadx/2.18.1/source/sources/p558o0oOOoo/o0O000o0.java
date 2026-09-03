package p558o0oOOoo;

import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000o0 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f44764OooO00o;

    public o0O000o0(o0O00OO o0o00oo2) {
        this.f44764OooO00o = o0o00oo2;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        TreasureBoxDialog treasureBoxDialog = (TreasureBoxDialog) this.f44764OooO00o.getValue();
        if (treasureBoxDialog != null && treasureBoxDialog.OooO0OO()) {
            treasureBoxDialog.OooO0O0();
        }
        this.f44764OooO00o.setValue(null);
    }
}
