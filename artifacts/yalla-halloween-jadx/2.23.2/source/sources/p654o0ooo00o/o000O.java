package p654o0ooo00o;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p653o0ooo00O.o0000O0;
import p653o0ooo00O.o0000O00;
import p653o0ooo00O.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O implements o0OoOoOo.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f59395OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O0 f59396OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o0OoOoOo> f59397OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f59398OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0000O00 f59399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f59400OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f59401OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f59402OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f59403OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o000O(@NotNull o0000O0 call, @NotNull List<? extends o0OoOoOo> interceptors, int i, @Nullable o0000O00 o0000o00, @NotNull o0O00O0o request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f59396OooO00o = call;
        this.f59397OooO0O0 = interceptors;
        this.f59398OooO0OO = i;
        this.f59399OooO0Oo = o0000o00;
        this.f59401OooO0o0 = request;
        this.f59400OooO0o = i2;
        this.f59402OooO0oO = i3;
        this.f59403OooO0oo = i4;
    }

    public static o000O OooO0Oo(o000O o000o, int i, o0000O00 o0000o00, o0O00O0o o0o00o0o, int i2) {
        if ((i2 & 1) != 0) {
            i = o000o.f59398OooO0OO;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            o0000o00 = o000o.f59399OooO0Oo;
        }
        o0000O00 o0000o01 = o0000o00;
        if ((i2 & 4) != 0) {
            o0o00o0o = o000o.f59401OooO0o0;
        }
        o0O00O0o request = o0o00o0o;
        int i4 = (i2 & 8) != 0 ? o000o.f59400OooO0o : 0;
        int i5 = (i2 & 16) != 0 ? o000o.f59402OooO0oO : 0;
        int i6 = (i2 & 32) != 0 ? o000o.f59403OooO0oo : 0;
        o000o.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new o000O(o000o.f59396OooO00o, o000o.f59397OooO0O0, i3, o0000o01, request, i4, i5, i6);
    }

    @Override // o0ooOO0o.o0OoOoOo.OooO00o
    @NotNull
    public final o0O00O0o OooO00o() {
        return this.f59401OooO0o0;
    }

    @Override // o0ooOO0o.o0OoOoOo.OooO00o
    @Nullable
    public final o0000O0O OooO0O0() {
        o0000O00 o0000o00 = this.f59399OooO0Oo;
        if (o0000o00 == null) {
            return null;
        }
        return o0000o00.f59331OooO0o;
    }

    @Override // o0ooOO0o.o0OoOoOo.OooO00o
    @NotNull
    public final o0O00o00 OooO0OO(@NotNull o0O00O0o request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        List<o0OoOoOo> list = this.f59397OooO0O0;
        int size = list.size();
        int i = this.f59398OooO0OO;
        if (!(i < size)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f59395OooO++;
        o0000O00 o0000o00 = this.f59399OooO0Oo;
        if (o0000o00 != null) {
            if (!o0000o00.f59329OooO0OO.OooO0O0(request.f57828OooO00o)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f59395OooO == 1)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        o000O o000oOooO0Oo = OooO0Oo(this, i2, null, request, 58);
        o0OoOoOo o0oooooo = list.get(i);
        o0O00o00 o0o00o00Intercept = o0oooooo.intercept(o000oOooO0Oo);
        if (o0o00o00Intercept == null) {
            throw new NullPointerException("interceptor " + o0oooooo + " returned null");
        }
        if (o0000o00 != null) {
            if (!(i2 >= list.size() || o000oOooO0Oo.f59395OooO == 1)) {
                throw new IllegalStateException(("network interceptor " + o0oooooo + " must call proceed() exactly once").toString());
            }
        }
        if (o0o00o00Intercept.f57852OooOO0 != null) {
            return o0o00o00Intercept;
        }
        throw new IllegalStateException(("interceptor " + o0oooooo + " returned a response with no body").toString());
    }

    @Override // o0ooOO0o.o0OoOoOo.OooO00o
    @NotNull
    public final o0000O0 call() {
        return this.f59396OooO00o;
    }
}
