package p159o00OoOO0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.ArrayDeque;
import o00OoO.OooOOO0;
import o00OoO.Oooo0;
import o00OoO.o000oOoO;
import o00OoO.o00O0O;
import o00OoO.o0OoOo0;
import o00OoO.oo000o;
import p154o00Oo0oo.o0OO00O;
import p154o00Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements o0OoOo0<OooOOO0, InputStream> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0OO00O<Integer> f38018OooO0O0 = o0OO00O.OooO00o(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o000oOoO<OooOOO0, OooOOO0> f38019OooO00o;

    public static class OooO00o implements o00O0O<OooOOO0, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000oOoO<OooOOO0, OooOOO0> f38020OooO00o = new o000oOoO<>();

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<OooOOO0, InputStream> OooO0Oo(oo000o oo000oVar) {
            return new OooOOOO(this.f38020OooO00o);
        }
    }

    public OooOOOO(@Nullable o000oOoO<OooOOO0, OooOOO0> o000oooo2) {
        this.f38019OooO00o = o000oooo2;
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull OooOOO0 oooOOO0) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull OooOOO0 oooOOO0, int i, int i2, @NonNull oo0o0Oo oo0o0oo) {
        OooOOO0 oooOOO1 = oooOOO0;
        o000oOoO<OooOOO0, OooOOO0> o000oooo2 = this.f38019OooO00o;
        if (o000oooo2 != null) {
            o000oOoO.OooO00o OooO00o2 = o000oOoO.OooO00o.OooO00o(oooOOO1);
            Oooo0 oooo0 = o000oooo2.f37882OooO00o;
            Object objOooO00o = oooo0.OooO00o(OooO00o2);
            ArrayDeque arrayDeque = o000oOoO.OooO00o.f37883OooO0Oo;
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
        return new o0OoOo0.OooO00o<>(oooOOO1, new com.bumptech.glide.load.data.OooOOOO(oooOOO1, ((Integer) oo0o0oo.OooO0OO(f38018OooO0O0)).intValue()));
    }
}
