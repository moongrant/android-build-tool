package p130o00OO00o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.data.OooOOOO;
import java.io.InputStream;
import java.util.ArrayDeque;
import o00OO00O.OooOOO0;
import o00OO00O.Oooo0;
import o00OO00O.o000oOoO;
import o00OO00O.o00O0O;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements o0OoOo0<OooOOO0, InputStream> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000000O<Integer> f37193OooO0O0 = o000000O.OooO00o(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o000oOoO<OooOOO0, OooOOO0> f37194OooO00o;

    public static class OooO00o implements o00O0O<OooOOO0, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000oOoO<OooOOO0, OooOOO0> f37195OooO00o = new o000oOoO<>();

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<OooOOO0, InputStream> OooO0OO(oo000o oo000oVar) {
            return new o000OOo(this.f37195OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o000OOo(@Nullable o000oOoO<OooOOO0, OooOOO0> o000oooo2) {
        this.f37194OooO00o = o000oooo2;
    }

    @Override // o00OO00O.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull OooOOO0 oooOOO0) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull OooOOO0 oooOOO0, int i, int i2, @NonNull o00000 o00000Var) {
        OooOOO0 oooOOO1 = oooOOO0;
        o000oOoO<OooOOO0, OooOOO0> o000oooo2 = this.f37194OooO00o;
        if (o000oooo2 != null) {
            o000oOoO.OooO00o OooO00o2 = o000oOoO.OooO00o.OooO00o(oooOOO1);
            Oooo0 oooo0 = o000oooo2.f37120OooO00o;
            Object objOooO00o = oooo0.OooO00o(OooO00o2);
            ArrayDeque arrayDeque = o000oOoO.OooO00o.f37121OooO0Oo;
            synchronized (arrayDeque) {
                arrayDeque.offer(OooO00o2);
            }
            OooOOO0 oooOOO2 = (OooOOO0) objOooO00o;
            if (oooOOO2 == null) {
                oooo0.OooO0Oo(o000oOoO.OooO00o.OooO00o(oooOOO1), oooOOO1);
            } else {
                oooOOO1 = oooOOO2;
            }
        }
        return new o0OoOo0.OooO00o<>(oooOOO1, new OooOOOO(oooOOO1, ((Integer) o00000Var.OooO0OO(f37193OooO0O0)).intValue()));
    }
}
