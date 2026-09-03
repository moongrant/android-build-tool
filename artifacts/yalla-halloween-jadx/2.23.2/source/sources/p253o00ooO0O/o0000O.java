package p253o00ooO0O;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends o0000OO0<Void> {
    public o0000O(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // p253o00ooO0O.o0000OO0
    public final void OooO00o(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            OooO0Oo(null);
        } else {
            OooO0OO(new zzq(null, "Invalid response to one way request"));
        }
    }

    @Override // p253o00ooO0O.o0000OO0
    public final boolean OooO0O0() {
        return true;
    }
}
