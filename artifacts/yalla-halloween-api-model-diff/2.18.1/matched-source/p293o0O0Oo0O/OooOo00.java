package p293o0O0Oo0O;

import android.os.Looper;
import android.widget.Toast;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o00O000;
import p318o0O0oOo.o000OOo0;
import p515o0o0O00.o00O00;
import p539o0o0Oo00.OooOO0;
import p617o0oo0o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f35752Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f35753Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f35754Oooo0oo;

    public /* synthetic */ OooOo00(Object obj, Object obj2, int i) {
        this.f35752Oooo0o = i;
        this.f35753Oooo0oO = obj;
        this.f35754Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35752Oooo0o) {
            case 0:
                OooO00o.C0096OooO00o c0096OooO00o = (OooO00o.C0096OooO00o) this.f35753Oooo0oO;
                Format format = (Format) this.f35754Oooo0oo;
                OooO00o oooO00o = c0096OooO00o.f13553OooO0O0;
                int i = o000OOo0.f36740OooO00o;
                oooO00o.Oooo0O0(format);
                break;
            default:
                String errorType = (String) this.f35753Oooo0oO;
                Throwable e = (Throwable) this.f35754Oooo0oo;
                OooOO0 oooOO1 = OooOO0.f44125OooO00o;
                Intrinsics.checkNotNullParameter(errorType, "$errorType");
                Intrinsics.checkNotNullParameter(e, "$e");
                try {
                    Looper.prepare();
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    Toast toastMakeText = Toast.makeText(o00O000.OooO00o(), errorType + ": " + Oooo0.OooO00o(e), 1);
                    toastMakeText.setGravity(17, 0, 0);
                    toastMakeText.show();
                    Looper.loop();
                    OooOO0.f44131OooO0oO = true;
                } catch (Exception e2) {
                    o00O00.OooO0o0("CrashHandler", "handleException Toast error" + e2);
                    return;
                }
                break;
        }
    }
}
