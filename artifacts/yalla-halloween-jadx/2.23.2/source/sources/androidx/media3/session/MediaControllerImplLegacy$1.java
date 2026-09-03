package androidx.media3.session;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
class MediaControllerImplLegacy$1 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        new SessionResult(i, bundle);
        throw null;
    }
}
