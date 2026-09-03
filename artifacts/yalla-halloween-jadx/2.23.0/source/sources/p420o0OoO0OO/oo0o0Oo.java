package p420o0OoO0OO;

import java.io.IOException;
import o0OoO.OooO0O0;
import p423o0OoO0o0.Oooo0;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo implements oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f45561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000000 f45562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f45563OooO0o0;

    public oo0o0Oo(o000000 o000000Var, Oooo0 oooo0, int i) {
        this.f45562OooO0o = o000000Var;
        this.f45561OooO0Oo = oooo0;
        this.f45563OooO0o0 = i;
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onFailure(o00O00o0 o00o00o1, IOException iOException) {
        this.f45562OooO0o.OooO0OO((oO0Oo0oo) o00o00o1, iOException, this.f45561OooO0Oo, -1, iOException.getMessage(), this.f45563OooO0o0);
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onResponse(o00O00o0 o00o00o1, o0oOOo o0oooo) {
        int i = this.f45563OooO0o0;
        Oooo0 oooo0 = this.f45561OooO0Oo;
        try {
            try {
                if (((oO0Oo0oo) o00o00o1).f59667OooOOoo) {
                    this.f45562OooO0o.OooO0OO((oO0Oo0oo) o00o00o1, new IOException("Canceled!"), this.f45561OooO0Oo, -2, OooO0O0.OooO00o(o0oooo), this.f45563OooO0o0);
                    o0O0o o0o0o = o0oooo.f57347OooOO0;
                    if (o0o0o != null) {
                        o0o0o.close();
                        return;
                    }
                    return;
                }
                oooo0.getClass();
                boolean zOooO0oO = o0oooo.OooO0oO();
                o0O0o o0o0o2 = o0oooo.f57347OooOO0;
                if (zOooO0oO) {
                    Object objOooO0Oo = oooo0.OooO0Oo(o0oooo);
                    o000000 o000000Var = this.f45562OooO0o;
                    o000000Var.getClass();
                    o000000Var.f45543OooO0O0.OooO00o().execute(new o000OOo(oooo0, objOooO0Oo, i));
                    if (o0o0o2 != null) {
                        o0o0o2.close();
                        return;
                    }
                    return;
                }
                this.f45562OooO0o.OooO0OO((oO0Oo0oo) o00o00o1, new IOException("request failed , reponse's code is : " + o0oooo.f57345OooO0oO), this.f45561OooO0Oo, o0oooo.f57345OooO0oO, OooO0O0.OooO00o(o0oooo), this.f45563OooO0o0);
                if (o0o0o2 != null) {
                    o0o0o2.close();
                }
            } catch (Exception e) {
                this.f45562OooO0o.OooO0OO((oO0Oo0oo) o00o00o1, e, this.f45561OooO0Oo, -3, OooO0O0.OooO00o(o0oooo), this.f45563OooO0o0);
                o0O0o o0o0o3 = o0oooo.f57347OooOO0;
                if (o0o0o3 != null) {
                    o0o0o3.close();
                }
            }
        } catch (Throwable th) {
            o0O0o o0o0o4 = o0oooo.f57347OooOO0;
            if (o0o0o4 != null) {
                o0o0o4.close();
            }
            throw th;
        }
    }
}
