package p647o0ooOooo;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p646o0ooOoo.oO000OOo;
import p646o0ooOoo.oO0Oo0oo;
import p646o0ooOoo.oO0o0o;

/* JADX INFO: loaded from: classes5.dex */
public final class nc implements o00OOO00.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f59714OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO0Oo0oo f59715OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<o00OOO00> f59716OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f59717OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final oO0o0o f59718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f59719OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f59720OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f59721OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f59722OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public nc(@NotNull oO0Oo0oo call, @NotNull List<? extends o00OOO00> interceptors, int i, @Nullable oO0o0o oo0o0o, @NotNull o00OOOOo request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f59715OooO00o = call;
        this.f59716OooO0O0 = interceptors;
        this.f59717OooO0OO = i;
        this.f59718OooO0Oo = oo0o0o;
        this.f59720OooO0o0 = request;
        this.f59719OooO0o = i2;
        this.f59721OooO0oO = i3;
        this.f59722OooO0oo = i4;
    }

    public static nc OooO0Oo(nc ncVar, int i, oO0o0o oo0o0o, o00OOOOo o00ooooo2, int i2) {
        if ((i2 & 1) != 0) {
            i = ncVar.f59717OooO0OO;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            oo0o0o = ncVar.f59718OooO0Oo;
        }
        oO0o0o oo0o0o2 = oo0o0o;
        if ((i2 & 4) != 0) {
            o00ooooo2 = ncVar.f59720OooO0o0;
        }
        o00OOOOo request = o00ooooo2;
        int i4 = (i2 & 8) != 0 ? ncVar.f59719OooO0o : 0;
        int i5 = (i2 & 16) != 0 ? ncVar.f59721OooO0oO : 0;
        int i6 = (i2 & 32) != 0 ? ncVar.f59722OooO0oo : 0;
        ncVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new nc(ncVar.f59715OooO00o, ncVar.f59716OooO0O0, i3, oo0o0o2, request, i4, i5, i6);
    }

    @Override // o0ooO0oO.o00OOO00.OooO00o
    @NotNull
    public final o00OOOOo OooO00o() {
        return this.f59720OooO0o0;
    }

    @Override // o0ooO0oO.o00OOO00.OooO00o
    @NotNull
    public final o0oOOo OooO0O0(@NotNull o00OOOOo request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        List<o00OOO00> list = this.f59716OooO0O0;
        int size = list.size();
        int i = this.f59717OooO0OO;
        if (!(i < size)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f59714OooO++;
        oO0o0o oo0o0o = this.f59718OooO0Oo;
        if (oo0o0o != null) {
            if (!oo0o0o.f59691OooO0OO.OooO0O0(request.f57313OooO00o)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
            }
            if (!(this.f59714OooO == 1)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        nc ncVarOooO0Oo = OooO0Oo(this, i2, null, request, 58);
        o00OOO00 o00ooo01 = list.get(i);
        o0oOOo o0ooooIntercept = o00ooo01.intercept(ncVarOooO0Oo);
        if (o0ooooIntercept == null) {
            throw new NullPointerException("interceptor " + o00ooo01 + " returned null");
        }
        if (oo0o0o != null) {
            if (!(i2 >= list.size() || ncVarOooO0Oo.f59714OooO == 1)) {
                throw new IllegalStateException(("network interceptor " + o00ooo01 + " must call proceed() exactly once").toString());
            }
        }
        if (o0ooooIntercept.f57347OooOO0 != null) {
            return o0ooooIntercept;
        }
        throw new IllegalStateException(("interceptor " + o00ooo01 + " returned a response with no body").toString());
    }

    @Override // o0ooO0oO.o00OOO00.OooO00o
    @Nullable
    public final oO000OOo OooO0OO() {
        oO0o0o oo0o0o = this.f59718OooO0Oo;
        if (oo0o0o == null) {
            return null;
        }
        return oo0o0o.f59693OooO0o;
    }

    @Override // o0ooO0oO.o00OOO00.OooO00o
    @NotNull
    public final oO0Oo0oo call() {
        return this.f59715OooO00o;
    }
}
