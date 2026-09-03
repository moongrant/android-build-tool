package p153o00Oo0oO;

import java.io.IOException;
import java.util.Objects;
import p144o00Oo.OooO0o;
import p158o00OoO0o.OooO0OO;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements o00oOoo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o f32192Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f32193Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f32194Oooo0oo;

    public o00000(o00000O0 o00000o1, OooO0o oooO0o, int i) {
        this.f32194Oooo0oo = o00000o1;
        this.f32192Oooo0o = oooO0o;
        this.f32193Oooo0oO = i;
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onFailure(o0O0ooO o0o0ooo, IOException iOException) {
        this.f32194Oooo0oo.OooO0OO(o0o0ooo, iOException, this.f32192Oooo0o, -1, iOException.getMessage(), this.f32193Oooo0oO);
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onResponse(o0O0ooO o0o0ooo, o00OOOO0 o00oooo1) {
        o00OOOOo o00ooooo2;
        try {
            try {
                if (((o00O0OO) o0o0ooo).f51737OoooOo0) {
                    this.f32194Oooo0oo.OooO0OO(o0o0ooo, new IOException("Canceled!"), this.f32192Oooo0o, -2, OooO0OO.OooO00o(o00oooo1), this.f32193Oooo0oO);
                    o00OOOOo o00ooooo3 = o00oooo1.f51441OoooO;
                    if (o00ooooo3 != null) {
                        o00ooooo3.close();
                        return;
                    }
                    return;
                }
                Objects.requireNonNull(this.f32192Oooo0o);
                if (!o00oooo1.OooO0Oo()) {
                    this.f32194Oooo0oo.OooO0OO(o0o0ooo, new IOException("request failed , reponse's code is : " + o00oooo1.f51443OoooO00), this.f32192Oooo0o, o00oooo1.f51443OoooO00, OooO0OO.OooO00o(o00oooo1), this.f32193Oooo0oO);
                    o00OOOOo o00ooooo4 = o00oooo1.f51441OoooO;
                    if (o00ooooo4 != null) {
                        o00ooooo4.close();
                        return;
                    }
                    return;
                }
                Object objOooO0Oo = this.f32192Oooo0o.OooO0Oo(o00oooo1);
                o00000O0 o00000o1 = this.f32194Oooo0oo;
                OooO0o oooO0o = this.f32192Oooo0o;
                int i = this.f32193Oooo0oO;
                Objects.requireNonNull(o00000o1);
                if (oooO0o != null) {
                    o00000o1.f32200OooO0O0.OooO00o().execute(new o00000O(oooO0o, objOooO0Oo, i));
                }
                o00ooooo2 = o00oooo1.f51441OoooO;
                if (o00ooooo2 == null) {
                    return;
                }
                o00ooooo2.close();
            } catch (Exception e) {
                this.f32194Oooo0oo.OooO0OO(o0o0ooo, e, this.f32192Oooo0o, -3, OooO0OO.OooO00o(o00oooo1), this.f32193Oooo0oO);
                o00ooooo2 = o00oooo1.f51441OoooO;
                if (o00ooooo2 == null) {
                }
            }
        } catch (Throwable th) {
            o00OOOOo o00ooooo5 = o00oooo1.f51441OoooO;
            if (o00ooooo5 != null) {
                o00ooooo5.close();
            }
            throw th;
        }
    }
}
