package p251o00ooO0O;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends o0000O00<Void> {
    public o0000(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // p251o00ooO0O.o0000O00
    public final void OooO00o(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            OooO0Oo(null);
        } else {
            OooO0OO(new zzq(null, "Invalid response to one way request"));
        }
    }

    @Override // p251o00ooO0O.o0000O00
    public final boolean OooO0O0() {
        return true;
    }
}
