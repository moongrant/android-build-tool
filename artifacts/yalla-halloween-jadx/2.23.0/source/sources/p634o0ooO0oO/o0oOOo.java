package p634o0ooO0oO;

import java.io.Closeable;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p646o0ooOoo.oO0o0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oOOo implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final oo0O f57341OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f57342OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f57343OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Protocol f57344OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f57345OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o00OO0OO f57346OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o0O0o f57347OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o0oOOo f57348OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final o0oOOo f57349OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f57350OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final o0oOOo f57351OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f57352OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final oO0o0o f57353OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o00O00OO f57354OooOOo0;

    public o0oOOo(@NotNull o00OOOOo request, @NotNull Protocol protocol, @NotNull String message, int i, @Nullable o00OO0OO o00oo0oo, @NotNull oo0O headers, @Nullable o0O0o o0o0o, @Nullable o0oOOo o0oooo, @Nullable o0oOOo o0oooo2, @Nullable o0oOOo o0oooo3, long j, long j2, @Nullable oO0o0o oo0o0o) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f57342OooO0Oo = request;
        this.f57344OooO0o0 = protocol;
        this.f57343OooO0o = message;
        this.f57345OooO0oO = i;
        this.f57346OooO0oo = o00oo0oo;
        this.f57341OooO = headers;
        this.f57347OooOO0 = o0o0o;
        this.f57348OooOO0O = o0oooo;
        this.f57349OooOO0o = o0oooo2;
        this.f57351OooOOO0 = o0oooo3;
        this.f57350OooOOO = j;
        this.f57352OooOOOO = j2;
        this.f57353OooOOOo = oo0o0o;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final o00O00OO OooO00o() {
        o00O00OO o00o00oo2 = this.f57354OooOOo0;
        if (o00o00oo2 != null) {
            return o00o00oo2;
        }
        o00O00OO o00o00oo3 = o00O00OO.f57155OooOOO;
        o00O00OO o00o00ooOooO0O0 = o00O00OO.OooO0O0.OooO0O0(this.f57341OooO);
        this.f57354OooOOo0 = o00o00ooOooO0O0;
        return o00o00ooOooO0O0;
    }

    @JvmOverloads
    @Nullable
    public final String OooO0OO(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strOooO00o = this.f57341OooO.OooO00o(name);
        return strOooO00o == null ? str : strOooO00o;
    }

    public final boolean OooO0oO() {
        int i = this.f57345OooO0oO;
        return 200 <= i && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o0O0o o0o0o = this.f57347OooOO0;
        if (o0o0o == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        o0o0o.close();
    }

    @NotNull
    public final String toString() {
        return "Response{protocol=" + this.f57344OooO0o0 + ", code=" + this.f57345OooO0oO + ", message=" + this.f57343OooO0o + ", url=" + this.f57342OooO0Oo.f57313OooO00o + '}';
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public o0oOOo f57355OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00OOOOo f57356OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Protocol f57357OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f57358OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f57359OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public oo0O.OooO00o f57360OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o00OO0OO f57361OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o0O0o f57362OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public o0oOOo f57363OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public o0oOOo f57364OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f57365OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f57366OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public oO0o0o f57367OooOOO0;

        public OooO00o() {
            this.f57358OooO0OO = -1;
            this.f57360OooO0o = new oo0O.OooO00o();
        }

        public static void OooO0O0(o0oOOo o0oooo, String str) {
            if (o0oooo == null) {
                return;
            }
            if (!(o0oooo.f57347OooOO0 == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
            }
            if (!(o0oooo.f57348OooOO0O == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
            }
            if (!(o0oooo.f57349OooOO0o == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
            }
            if (!(o0oooo.f57351OooOOO0 == null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
            }
        }

        @NotNull
        public final o0oOOo OooO00o() {
            int i = this.f57358OooO0OO;
            if (!(i >= 0)) {
                throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(i)).toString());
            }
            o00OOOOo o00ooooo2 = this.f57356OooO00o;
            if (o00ooooo2 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.f57357OooO0O0;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f57359OooO0Oo;
            if (str != null) {
                return new o0oOOo(o00ooooo2, protocol, str, i, this.f57361OooO0o0, this.f57360OooO0o.OooO0OO(), this.f57362OooO0oO, this.f57363OooO0oo, this.f57355OooO, this.f57364OooOO0, this.f57365OooOO0O, this.f57366OooOO0o, this.f57367OooOOO0);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @NotNull
        public final void OooO0OO(@NotNull oo0O headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            oo0O.OooO00o oooO00oOooO0Oo = headers.OooO0Oo();
            Intrinsics.checkNotNullParameter(oooO00oOooO0Oo, "<set-?>");
            this.f57360OooO0o = oooO00oOooO0Oo;
        }

        public OooO00o(@NotNull o0oOOo response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f57358OooO0OO = -1;
            this.f57356OooO00o = response.f57342OooO0Oo;
            this.f57357OooO0O0 = response.f57344OooO0o0;
            this.f57358OooO0OO = response.f57345OooO0oO;
            this.f57359OooO0Oo = response.f57343OooO0o;
            this.f57361OooO0o0 = response.f57346OooO0oo;
            this.f57360OooO0o = response.f57341OooO.OooO0Oo();
            this.f57362OooO0oO = response.f57347OooOO0;
            this.f57363OooO0oo = response.f57348OooOO0O;
            this.f57355OooO = response.f57349OooOO0o;
            this.f57364OooOO0 = response.f57351OooOOO0;
            this.f57365OooOO0O = response.f57350OooOOO;
            this.f57366OooOO0o = response.f57352OooOOOO;
            this.f57367OooOOO0 = response.f57353OooOOOo;
        }
    }
}
