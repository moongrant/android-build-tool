package p248o00oo0o0;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.code.android.util.o0000;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import p557o0oOOooO.oO00o0;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0o implements o000OO00.OooO00o, oO00o0 {
    @Override // p557o0oOOooO.oO00o0
    public final void OooO00o(Editable editable, int i, int i2) {
        int i3 = MomentSendActivity.f25726Oooo0OO;
        editable.setSpan(new ForegroundColorSpan(o0000.OooO00o(o0OOO0o.color_00d8c9)), i, i2, 33);
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
