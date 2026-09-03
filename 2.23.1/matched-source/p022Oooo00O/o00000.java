package p022Oooo00O;

import android.os.Bundle;
import androidx.camera.core.ImageCapture;
import com.facebook.login.LoginLogger;
import java.util.Objects;
import p029Oooo0oo.o0OOOO00;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f472OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f473OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f474OooO0o0;

    public /* synthetic */ o00000(int i, Object obj, Object obj2) {
        this.f472OooO0Oo = i;
        this.f474OooO0o0 = obj;
        this.f473OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f472OooO0Oo;
        Object obj = this.f473OooO0o;
        Object obj2 = this.f474OooO0o0;
        switch (i) {
            case 0:
                o000OO o000oo2 = (o000OO) obj2;
                o000O0.OooO00o oooO00o = (o000O0.OooO00o) obj;
                o0O000Oo o0o000oo2 = o000oo2.f567OooOo0O;
                if (o0o000oo2 != null) {
                    oooO00o.OooO0O0(Boolean.valueOf(o000oo2.f549OooO0Oo.OooO0Oo(o000OO.OooOo0o(o0o000oo2))));
                } else {
                    oooO00o.OooO0O0(Boolean.FALSE);
                }
                break;
            case 1:
                ImageCapture.OooOOO0 oooOOO0 = (ImageCapture.OooOOO0) obj;
                ImageCapture.OooOO0 oooOO0OooO0o = ((o0OOOO00) obj2).OooO0o();
                Objects.requireNonNull(oooOO0OooO0o);
                Objects.requireNonNull(oooOOO0);
                oooOO0OooO0o.OooO0O0(oooOOO0);
                break;
            default:
                LoginLogger.m4175logHeartbeatEvent$lambda0((LoginLogger) obj2, (Bundle) obj);
                break;
        }
    }
}
