package p519o0o0O0oO;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements Observer<Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f53173OooO0Oo;

    public v1(RoomMoraGameListDialog roomMoraGameListDialog) {
        this.f53173OooO0Oo = roomMoraGameListDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        int iIntValue = num.intValue();
        this.f53173OooO0Oo.f27954OooOO0O.setText(o0000.OooO0OO(oO00OOo0.mora) + ": " + iIntValue);
    }
}
