package p022Oooo00O;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SessionConfig f469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f470OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f471OooO0oO;

    public /* synthetic */ o0000(o000OO o000oo2, String str, SessionConfig sessionConfig, o00Oo00 o00oo00) {
        this.f468OooO0Oo = o000oo2;
        this.f470OooO0o0 = str;
        this.f469OooO0o = sessionConfig;
        this.f471OooO0oO = o00oo00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000OO o000oo2 = this.f468OooO0Oo;
        String str = this.f470OooO0o0;
        SessionConfig sessionConfig = this.f469OooO0o;
        o00Oo00<?> o00oo00 = this.f471OooO0oO;
        o000oo2.getClass();
        o000oo2.OooOo00("Use case " + str + " RESET", null);
        o000oo2.f549OooO0Oo.OooO0o(str, sessionConfig, o00oo00);
        o000oo2.OooOOo0();
        o000oo2.OooOooo();
        o000oo2.Oooo0o0();
        if (o000oo2.f553OooO0oo == o000OO.OooOO0.OPENED) {
            o000oo2.OooOoo0();
        }
    }
}
