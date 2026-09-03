package p660o0ooo0o0;

import java.io.Closeable;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p663o0oooO0.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOOO0 implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final String f51437Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O0000 f51438Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f51439Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Protocol f51440Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public final o00OOOOo f51441OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public final oo0oOO0 f51442OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f51443OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final o00O f51444OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final o00OOOO0 f51445OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public final o00OOOO0 f51446OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final long f51447OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final long f51448OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public final o00O0OO0 f51449OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public final o00OOOO0 f51450o000oOoO;

    public o00OOOO0(@NotNull o00OOO00 request, @NotNull Protocol protocol, @NotNull String message, int i, @Nullable oo0oOO0 oo0ooo0, @NotNull o00O headers, @Nullable o00OOOOo o00ooooo2, @Nullable o00OOOO0 o00oooo1, @Nullable o00OOOO0 o00oooo2, @Nullable o00OOOO0 o00oooo3, long j, long j2, @Nullable o00O0OO0 o00o0oo1) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f51439Oooo0oO = request;
        this.f51440Oooo0oo = protocol;
        this.f51437Oooo = message;
        this.f51443OoooO00 = i;
        this.f51442OoooO0 = oo0ooo0;
        this.f51444OoooO0O = headers;
        this.f51441OoooO = o00ooooo2;
        this.f51445OoooOO0 = o00oooo1;
        this.f51450o000oOoO = o00oooo2;
        this.f51446OoooOOO = o00oooo3;
        this.f51447OoooOOo = j;
        this.f51448OoooOo0 = j2;
        this.f51449OoooOoO = o00o0oo1;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final o00O0000 OooO00o() {
        o00O0000 o00o0001 = this.f51438Oooo0o;
        if (o00o0001 != null) {
            return o00o0001;
        }
        o00O0000 o00o0000OooO0O0 = o00O0000.f51263OooOOOo.OooO0O0(this.f51444OoooO0O);
        this.f51438Oooo0o = o00o0000OooO0O0;
        return o00o0000OooO0O0;
    }

    @JvmOverloads
    @Nullable
    public final String OooO0O0(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strOooO00o = this.f51444OoooO0O.OooO00o(name);
        return strOooO00o != null ? strOooO00o : str;
    }

    public final boolean OooO0Oo() {
        int i = this.f51443OoooO00;
        return 200 <= i && 299 >= i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o00OOOOo o00ooooo2 = this.f51441OoooO;
        if (o00ooooo2 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        o00ooooo2.close();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Response{protocol=");
        sbOooO0o0.append(this.f51440Oooo0oo);
        sbOooO0o0.append(", code=");
        sbOooO0o0.append(this.f51443OoooO00);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.f51437Oooo);
        sbOooO0o0.append(", url=");
        sbOooO0o0.append(this.f51439Oooo0oO.f51425OooO0O0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public o00OOOO0 f51451OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00OOO00 f51452OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Protocol f51453OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f51454OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f51455OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public o00O.OooO00o f51456OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public oo0oOO0 f51457OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o00OOOOo f51458OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public o00OOOO0 f51459OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public o00OOOO0 f51460OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f51461OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f51462OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public o00O0OO0 f51463OooOOO0;

        public OooO00o() {
            this.f51454OooO0OO = -1;
            this.f51456OooO0o = new o00O.OooO00o();
        }

        @NotNull
        public final o00OOOO0 OooO00o() {
            int i = this.f51454OooO0OO;
            if (!(i >= 0)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("code < 0: ");
                sbOooO0o0.append(this.f51454OooO0OO);
                throw new IllegalStateException(sbOooO0o0.toString().toString());
            }
            o00OOO00 o00ooo01 = this.f51452OooO00o;
            if (o00ooo01 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f51453OooO0O0;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f51455OooO0Oo;
            if (str != null) {
                return new o00OOOO0(o00ooo01, protocol, str, i, this.f51457OooO0o0, this.f51456OooO0o.OooO0Oo(), this.f51458OooO0oO, this.f51459OooO0oo, this.f51451OooO, this.f51460OooOO0, this.f51461OooOO0O, this.f51462OooOO0o, this.f51463OooOOO0);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @NotNull
        public final OooO00o OooO0O0(@Nullable o00OOOO0 o00oooo1) {
            OooO0OO("cacheResponse", o00oooo1);
            this.f51451OooO = o00oooo1;
            return this;
        }

        public final void OooO0OO(String str, o00OOOO0 o00oooo1) {
            if (o00oooo1 != null) {
                if (!(o00oooo1.f51441OoooO == null)) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".body != null").toString());
                }
                if (!(o00oooo1.f51445OoooOO0 == null)) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".networkResponse != null").toString());
                }
                if (!(o00oooo1.f51450o000oOoO == null)) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".cacheResponse != null").toString());
                }
                if (!(o00oooo1.f51446OoooOOO == null)) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo(str, ".priorResponse != null").toString());
                }
            }
        }

        @NotNull
        public final OooO00o OooO0Oo(@NotNull o00O headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f51456OooO0o = headers.OooO0OO();
            return this;
        }

        @NotNull
        public final OooO00o OooO0o(@NotNull Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f51453OooO0O0 = protocol;
            return this;
        }

        @NotNull
        public final OooO00o OooO0o0(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f51455OooO0Oo = message;
            return this;
        }

        @NotNull
        public final OooO00o OooO0oO(@NotNull o00OOO00 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f51452OooO00o = request;
            return this;
        }

        public OooO00o(@NotNull o00OOOO0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f51454OooO0OO = -1;
            this.f51452OooO00o = response.f51439Oooo0oO;
            this.f51453OooO0O0 = response.f51440Oooo0oo;
            this.f51454OooO0OO = response.f51443OoooO00;
            this.f51455OooO0Oo = response.f51437Oooo;
            this.f51457OooO0o0 = response.f51442OoooO0;
            this.f51456OooO0o = response.f51444OoooO0O.OooO0OO();
            this.f51458OooO0oO = response.f51441OoooO;
            this.f51459OooO0oo = response.f51445OoooOO0;
            this.f51451OooO = response.f51450o000oOoO;
            this.f51460OooOO0 = response.f51446OoooOOO;
            this.f51461OooOO0O = response.f51447OoooOOo;
            this.f51462OooOO0o = response.f51448OoooOo0;
            this.f51463OooOOO0 = response.f51449OoooOoO;
        }
    }
}
