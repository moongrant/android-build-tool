package p666o0oooO0o;

import OooO00o.OooO00o;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00O00O;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p663o0oooO0.o00O0OO;
import p663o0oooO0.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00o0o implements o00OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f51878OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f51879OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O0OO f51880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<o00OO00O> f51881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f51882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f51883OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00O0OO0 f51884OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f51885OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f51886OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public oOo00o0o(@NotNull o00O0OO call, @NotNull List<? extends o00OO00O> interceptors, int i, @Nullable o00O0OO0 o00o0oo1, @NotNull o00OOO00 request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f51880OooO0O0 = call;
        this.f51881OooO0OO = interceptors;
        this.f51882OooO0Oo = i;
        this.f51884OooO0o0 = o00o0oo1;
        this.f51883OooO0o = request;
        this.f51885OooO0oO = i2;
        this.f51886OooO0oo = i3;
        this.f51878OooO = i4;
    }

    public static oOo00o0o OooO0Oo(oOo00o0o ooo00o0o, int i, o00O0OO0 o00o0oo1, o00OOO00 o00ooo01, int i2) {
        if ((i2 & 1) != 0) {
            i = ooo00o0o.f51882OooO0Oo;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            o00o0oo1 = ooo00o0o.f51884OooO0o0;
        }
        o00O0OO0 o00o0oo2 = o00o0oo1;
        if ((i2 & 4) != 0) {
            o00ooo01 = ooo00o0o.f51883OooO0o;
        }
        o00OOO00 request = o00ooo01;
        int i4 = (i2 & 8) != 0 ? ooo00o0o.f51885OooO0oO : 0;
        int i5 = (i2 & 16) != 0 ? ooo00o0o.f51886OooO0oo : 0;
        int i6 = (i2 & 32) != 0 ? ooo00o0o.f51878OooO : 0;
        Objects.requireNonNull(ooo00o0o);
        Intrinsics.checkNotNullParameter(request, "request");
        return new oOo00o0o(ooo00o0o.f51880OooO0O0, ooo00o0o.f51881OooO0OO, i3, o00o0oo2, request, i4, i5, i6);
    }

    @Override // o0ooo0o0.o00OO00O.OooO00o
    @NotNull
    public final o00OOO00 OooO00o() {
        return this.f51883OooO0o;
    }

    @Override // o0ooo0o0.o00OO00O.OooO00o
    @NotNull
    public final o00OOOO0 OooO0O0(@NotNull o00OOO00 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.f51882OooO0Oo < this.f51881OooO0OO.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f51879OooO00o++;
        o00O0OO0 o00o0oo1 = this.f51884OooO0o0;
        if (o00o0oo1 != null) {
            if (!o00o0oo1.f51754OooO0o0.OooO0O0(request.f51425OooO0O0)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("network interceptor ");
                sbOooO0o0.append(this.f51881OooO0OO.get(this.f51882OooO0Oo - 1));
                sbOooO0o0.append(" must retain the same host and port");
                throw new IllegalStateException(sbOooO0o0.toString().toString());
            }
            if (!(this.f51879OooO00o == 1)) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("network interceptor ");
                sbOooO0o1.append(this.f51881OooO0OO.get(this.f51882OooO0Oo - 1));
                sbOooO0o1.append(" must call proceed() exactly once");
                throw new IllegalStateException(sbOooO0o1.toString().toString());
            }
        }
        oOo00o0o ooo00o0oOooO0Oo = OooO0Oo(this, this.f51882OooO0Oo + 1, null, request, 58);
        o00OO00O o00oo00o = this.f51881OooO0OO.get(this.f51882OooO0Oo);
        o00OOOO0 o00oooo0Intercept = o00oo00o.intercept(ooo00o0oOooO0Oo);
        if (o00oooo0Intercept == null) {
            throw new NullPointerException("interceptor " + o00oo00o + " returned null");
        }
        if (this.f51884OooO0o0 != null) {
            if (!(this.f51882OooO0Oo + 1 >= this.f51881OooO0OO.size() || ooo00o0oOooO0Oo.f51879OooO00o == 1)) {
                throw new IllegalStateException(("network interceptor " + o00oo00o + " must call proceed() exactly once").toString());
            }
        }
        if (o00oooo0Intercept.f51441OoooO != null) {
            return o00oooo0Intercept;
        }
        throw new IllegalStateException(("interceptor " + o00oo00o + " returned a response with no body").toString());
    }

    @Override // o0ooo0o0.o00OO00O.OooO00o
    @Nullable
    public final o00O00O OooO0OO() {
        o00O0OO0 o00o0oo1 = this.f51884OooO0o0;
        if (o00o0oo1 != null) {
            return o00o0oo1.f51750OooO0O0;
        }
        return null;
    }
}
