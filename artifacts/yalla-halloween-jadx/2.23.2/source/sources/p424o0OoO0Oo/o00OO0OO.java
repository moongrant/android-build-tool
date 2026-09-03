package p424o0OoO0Oo;

import java.io.IOException;
import p428o0OoO0oo.o00OOOO0;
import p431o0OoOO0o.o000000O;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO implements o00OOO00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f46732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00OOO00 f46733OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f46734OooO0o0;

    public o00OO0OO(o00OOO00 o00ooo00, o00OOOO0 o00oooo1, int i) {
        this.f46733OooO0o = o00ooo00;
        this.f46732OooO0Oo = o00oooo1;
        this.f46734OooO0o0 = i;
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onFailure(o00OO o00oo2, IOException iOException) {
        this.f46733OooO0o.OooO0OO((o0000O0) o00oo2, iOException, this.f46732OooO0Oo, -1, iOException.getMessage(), this.f46734OooO0o0);
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onResponse(o00OO o00oo2, o0O00o00 o0o00o01) {
        int i = this.f46734OooO0o0;
        o00OOOO0 o00oooo1 = this.f46732OooO0Oo;
        try {
            try {
                if (((o0000O0) o00oo2).f59319OooOOoo) {
                    this.f46733OooO0o.OooO0OO((o0000O0) o00oo2, new IOException("Canceled!"), this.f46732OooO0Oo, -2, o000000O.OooO00o(o0o00o01), this.f46734OooO0o0);
                    o0O00oO0 o0o00oo1 = o0o00o01.f57852OooOO0;
                    if (o0o00oo1 != null) {
                        o0o00oo1.close();
                        return;
                    }
                    return;
                }
                o00oooo1.getClass();
                boolean zOooO0oO = o0o00o01.OooO0oO();
                o0O00oO0 o0o00oo2 = o0o00o01.f57852OooOO0;
                if (zOooO0oO) {
                    Object objOooO0Oo = o00oooo1.OooO0Oo(o0o00o01);
                    o00OOO00 o00ooo00 = this.f46733OooO0o;
                    o00ooo00.getClass();
                    o00ooo00.f46737OooO0O0.OooO00o().execute(new o00OO(o00oooo1, objOooO0Oo, i));
                    if (o0o00oo2 != null) {
                        o0o00oo2.close();
                        return;
                    }
                    return;
                }
                this.f46733OooO0o.OooO0OO((o0000O0) o00oo2, new IOException("request failed , reponse's code is : " + o0o00o01.f57850OooO0oO), this.f46732OooO0Oo, o0o00o01.f57850OooO0oO, o000000O.OooO00o(o0o00o01), this.f46734OooO0o0);
                if (o0o00oo2 != null) {
                    o0o00oo2.close();
                }
            } catch (Exception e) {
                this.f46733OooO0o.OooO0OO((o0000O0) o00oo2, e, this.f46732OooO0Oo, -3, o000000O.OooO00o(o0o00o01), this.f46734OooO0o0);
                o0O00oO0 o0o00oo3 = o0o00o01.f57852OooOO0;
                if (o0o00oo3 != null) {
                    o0o00oo3.close();
                }
            }
        } catch (Throwable th) {
            o0O00oO0 o0o00oo4 = o0o00o01.f57852OooOO0;
            if (o0o00oo4 != null) {
                o0o00oo4.close();
            }
            throw th;
        }
    }
}
