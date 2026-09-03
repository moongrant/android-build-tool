package p641o0ooOO0o;

import java.io.Closeable;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p653o0ooo00O.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00o00 implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0O000 f57846OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f57847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f57848OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Protocol f57849OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f57850OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o0O0000O f57851OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o0O00oO0 f57852OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o0O00o00 f57853OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final o0O00o00 f57854OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f57855OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final o0O00o00 f57856OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f57857OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final o0000O00 f57858OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public oo0O f57859OooOOo0;

    public o0O00o00(@NotNull o0O00O0o request, @NotNull Protocol protocol, @NotNull String message, int i, @Nullable o0O0000O o0o0000o2, @NotNull o0O000 headers, @Nullable o0O00oO0 o0o00oo1, @Nullable o0O00o00 o0o00o01, @Nullable o0O00o00 o0o00o02, @Nullable o0O00o00 o0o00o03, long j, long j2, @Nullable o0000O00 o0000o00) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f57847OooO0Oo = request;
        this.f57849OooO0o0 = protocol;
        this.f57848OooO0o = message;
        this.f57850OooO0oO = i;
        this.f57851OooO0oo = o0o0000o2;
        this.f57846OooO = headers;
        this.f57852OooOO0 = o0o00oo1;
        this.f57853OooOO0O = o0o00o01;
        this.f57854OooOO0o = o0o00o02;
        this.f57856OooOOO0 = o0o00o03;
        this.f57855OooOOO = j;
        this.f57857OooOOOO = j2;
        this.f57858OooOOOo = o0000o00;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final oo0O OooO00o() {
        oo0O oo0o = this.f57859OooOOo0;
        if (oo0o != null) {
            return oo0o;
        }
        oo0O oo0o2 = oo0O.f57969OooOOO;
        oo0O oo0oOooO0O0 = oo0O.OooO0O0.OooO0O0(this.f57846OooO);
        this.f57859OooOOo0 = oo0oOooO0O0;
        return oo0oOooO0O0;
    }

    @JvmOverloads
    @Nullable
    public final String OooO0OO(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strOooO00o = this.f57846OooO.OooO00o(name);
        return strOooO00o == null ? str : strOooO00o;
    }

    public final boolean OooO0oO() {
        int i = this.f57850OooO0oO;
        return 200 <= i && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o0O00oO0 o0o00oo1 = this.f57852OooOO0;
        if (o0o00oo1 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        o0o00oo1.close();
    }

    @NotNull
    public final String toString() {
        return "Response{protocol=" + this.f57849OooO0o0 + ", code=" + this.f57850OooO0oO + ", message=" + this.f57848OooO0o + ", url=" + this.f57847OooO0Oo.f57828OooO00o + '}';
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public o0O00o00 f57860OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o0O00O0o f57861OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Protocol f57862OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f57863OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f57864OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public o0O000.OooO00o f57865OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o0O0000O f57866OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o0O00oO0 f57867OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public o0O00o00 f57868OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public o0O00o00 f57869OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f57870OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f57871OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public o0000O00 f57872OooOOO0;

        public OooO00o() {
            this.f57863OooO0OO = -1;
            this.f57865OooO0o = new o0O000.OooO00o();
        }

        public static void OooO0O0(o0O00o00 o0o00o01, String str) {
            if (o0o00o01 == null) {
                return;
            }
            if (!(o0o00o01.f57852OooOO0 == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
            }
            if (!(o0o00o01.f57853OooOO0O == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
            }
            if (!(o0o00o01.f57854OooOO0o == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
            }
            if (!(o0o00o01.f57856OooOOO0 == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
            }
        }

        @NotNull
        public final o0O00o00 OooO00o() {
            int i = this.f57863OooO0OO;
            if (!(i >= 0)) {
                throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(i)).toString());
            }
            o0O00O0o o0o00o0o = this.f57861OooO00o;
            if (o0o00o0o == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f57862OooO0O0;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f57864OooO0Oo;
            if (str != null) {
                return new o0O00o00(o0o00o0o, protocol, str, i, this.f57866OooO0o0, this.f57865OooO0o.OooO0OO(), this.f57867OooO0oO, this.f57868OooO0oo, this.f57860OooO, this.f57869OooOO0, this.f57870OooOO0O, this.f57871OooOO0o, this.f57872OooOOO0);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @NotNull
        public final void OooO0OO(@NotNull o0O000 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            o0O000.OooO00o oooO00oOooO0Oo = headers.OooO0Oo();
            Intrinsics.checkNotNullParameter(oooO00oOooO0Oo, "<set-?>");
            this.f57865OooO0o = oooO00oOooO0Oo;
        }

        public OooO00o(@NotNull o0O00o00 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f57863OooO0OO = -1;
            this.f57861OooO00o = response.f57847OooO0Oo;
            this.f57862OooO0O0 = response.f57849OooO0o0;
            this.f57863OooO0OO = response.f57850OooO0oO;
            this.f57864OooO0Oo = response.f57848OooO0o;
            this.f57866OooO0o0 = response.f57851OooO0oo;
            this.f57865OooO0o = response.f57846OooO.OooO0Oo();
            this.f57867OooO0oO = response.f57852OooOO0;
            this.f57868OooO0oo = response.f57853OooOO0O;
            this.f57860OooO = response.f57854OooOO0o;
            this.f57869OooOO0 = response.f57856OooOOO0;
            this.f57870OooOO0O = response.f57855OooOOO;
            this.f57871OooOO0o = response.f57857OooOOOO;
            this.f57872OooOOO0 = response.f57858OooOOOo;
        }
    }
}
