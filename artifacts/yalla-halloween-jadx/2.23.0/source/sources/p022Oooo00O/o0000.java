package p022Oooo00O;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f467OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SessionConfig f468OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f469OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0o0Oo f470OooO0oO;

    public /* synthetic */ o0000(o000OO o000oo2, String str, SessionConfig sessionConfig, o0o0Oo o0o0oo) {
        this.f467OooO0Oo = o000oo2;
        this.f469OooO0o0 = str;
        this.f468OooO0o = sessionConfig;
        this.f470OooO0oO = o0o0oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000OO o000oo2 = this.f467OooO0Oo;
        String str = this.f469OooO0o0;
        SessionConfig sessionConfig = this.f468OooO0o;
        o0o0Oo<?> o0o0oo = this.f470OooO0oO;
        o000oo2.getClass();
        o000oo2.OooOo00("Use case " + str + " RESET", null);
        o000oo2.f550OooO0Oo.OooO0o(str, sessionConfig, o0o0oo);
        o000oo2.OooOOo0();
        o000oo2.OooOooo();
        o000oo2.Oooo0o0();
        if (o000oo2.f554OooO0oo == o000OO.OooOO0.OPENED) {
            o000oo2.OooOoo0();
        }
    }
}
