package p303o0O0o00o;

import android.util.Log;
import com.google.firebase.messaging.OooO0OO;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f36198Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f36199Oooo0oO;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f36198Oooo0o = i;
        this.f36199Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36198Oooo0o) {
            case 0:
                OooOO0 oooOO1 = (OooOO0) this.f36199Oooo0oO;
                synchronized (oooOO1.f36201OooO00o) {
                    if (oooOO1.f36207OooO0oO != 3) {
                        long j = oooOO1.f36205OooO0o - 1;
                        oooOO1.f36205OooO0o = j;
                        if (j <= 0) {
                            if (j < 0) {
                                oooOO1.f36200OooO = new IllegalStateException();
                            } else {
                                oooOO1.f36202OooO0O0.OooO0O0();
                                try {
                                    try {
                                        oooOO1.f36203OooO0OO.start();
                                    } catch (IllegalStateException e) {
                                        oooOO1.f36200OooO = e;
                                    }
                                } catch (Exception e2) {
                                    oooOO1.f36200OooO = new IllegalStateException(e2);
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                return;
            case 1:
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) this.f36199Oooo0oO;
                Objects.requireNonNull(oooO00o);
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + oooO00o.f19203OooO00o.getAction() + " Releasing WakeLock.");
                oooO00o.OooO00o();
                return;
            default:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f36199Oooo0oO;
                PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isDestroyed() || this$0.isFinishing()) {
                    return;
                }
                this$0.OooOooo(false);
                return;
        }
    }
}
