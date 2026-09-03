package p304o0O0o00o;

import android.util.Log;
import com.google.firebase.messaging.OooO0OO;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f36217Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f36218OoooO00;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f36217Oooo = i;
        this.f36218OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36217Oooo) {
            case 0:
                OooOO0 oooOO1 = (OooOO0) this.f36218OoooO00;
                synchronized (oooOO1.f36220OooO00o) {
                    if (oooOO1.f36226OooO0oO != 3) {
                        long j = oooOO1.f36224OooO0o - 1;
                        oooOO1.f36224OooO0o = j;
                        if (j <= 0) {
                            if (j < 0) {
                                oooOO1.f36219OooO = new IllegalStateException();
                            } else {
                                oooOO1.f36221OooO0O0.OooO0O0();
                                try {
                                    try {
                                        oooOO1.f36222OooO0OO.start();
                                    } catch (IllegalStateException e) {
                                        oooOO1.f36219OooO = e;
                                    }
                                } catch (Exception e2) {
                                    oooOO1.f36219OooO = new IllegalStateException(e2);
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                return;
            case 1:
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) this.f36218OoooO00;
                Objects.requireNonNull(oooO00o);
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + oooO00o.f19222OooO00o.getAction() + " Releasing WakeLock.");
                oooO00o.OooO00o();
                return;
            default:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f36218OoooO00;
                PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22185o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isDestroyed() || this$0.isFinishing()) {
                    return;
                }
                this$0.OooOooo(false);
                return;
        }
    }
}
