package p328o0O0ooOO;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00oO extends o0oOOo<Void> {
    public oo00oO(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // p328o0O0ooOO.o0oOOo
    public final void OooO00o(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            OooO0Oo(null);
        } else {
            OooO0OO(new zzq("Invalid response to one way request", null));
        }
    }

    @Override // p328o0O0ooOO.o0oOOo
    public final boolean OooO0O0() {
        return true;
    }
}
