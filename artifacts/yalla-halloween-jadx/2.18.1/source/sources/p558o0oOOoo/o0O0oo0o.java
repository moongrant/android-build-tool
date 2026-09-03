package p558o0oOOoo;

import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo0o implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO f44812OooO00o;

    public o0O0oo0o(o0O00OO o0o00oo2) {
        this.f44812OooO00o = o0o00oo2;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        RoomVoteDialog roomVoteDialog = (RoomVoteDialog) this.f44812OooO00o.getValue();
        if (roomVoteDialog != null) {
            roomVoteDialog.OooOO0O();
        }
        this.f44812OooO00o.setValue(null);
    }
}
