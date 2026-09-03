package p294o0O0Oo0O;

import android.os.Looper;
import android.widget.Toast;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o00O000;
import p319o0O0oOo.o00;
import p517o0o0O00.o00O00;
import p541o0o0Oo00.OooOO0;
import p619o0oo0o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f35773Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f35774OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f35775OoooO00;

    public /* synthetic */ OooOo00(Object obj, Object obj2, int i) {
        this.f35773Oooo = i;
        this.f35775OoooO00 = obj;
        this.f35774OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35773Oooo) {
            case 0:
                OooO00o.C0096OooO00o c0096OooO00o = (OooO00o.C0096OooO00o) this.f35775OoooO00;
                Format format = (Format) this.f35774OoooO0;
                OooO00o oooO00o = c0096OooO00o.f13570OooO0O0;
                int i = o00.f36680OooO00o;
                oooO00o.Oooo0O0(format);
                break;
            default:
                String errorType = (String) this.f35775OoooO00;
                Throwable e = (Throwable) this.f35774OoooO0;
                OooOO0 oooOO1 = OooOO0.f44140OooO00o;
                Intrinsics.checkNotNullParameter(errorType, "$errorType");
                Intrinsics.checkNotNullParameter(e, "$e");
                try {
                    Looper.prepare();
                    o00O000 o00o001 = o00O000.f34368OooO00o;
                    Toast toastMakeText = Toast.makeText(o00O000.OooO00o(), errorType + ": " + Oooo0.OooO00o(e), 1);
                    toastMakeText.setGravity(17, 0, 0);
                    toastMakeText.show();
                    Looper.loop();
                    OooOO0.f44146OooO0oO = true;
                } catch (Exception e2) {
                    o00O00.OooO0o0("CrashHandler", "handleException Toast error" + e2);
                    return;
                }
                break;
        }
    }
}
