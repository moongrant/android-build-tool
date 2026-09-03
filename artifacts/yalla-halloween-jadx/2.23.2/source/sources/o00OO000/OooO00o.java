package o00OO000;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p123o00O0o0.Oooo000;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o00oO0o;
import p131o00O0oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f37063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f37064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37065OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f37066OooO0Oo;

    /* JADX INFO: renamed from: o00OO000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0419OooO00o implements OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f37067OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f37068OooO0OO;

        @JvmOverloads
        public C0419OooO00o() {
            this(0, 3);
        }

        @Override // o00OO000.OooO0OO.OooO00o
        @NotNull
        public final OooO0OO OooO00o(@NotNull OooO0o oooO0o, @NotNull o0Oo0oo o0oo0oo2) {
            if (o0oo0oo2 instanceof o000000O) {
                return ((o000000O) o0oo0oo2).f36786OooO0OO == DataSource.MEMORY_CACHE ? new OooO0O0(oooO0o, o0oo0oo2) : new OooO00o(oooO0o, o0oo0oo2, this.f37067OooO0O0, this.f37068OooO0OO);
            }
            return new OooO0O0(oooO0o, o0oo0oo2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0419OooO00o) {
                C0419OooO00o c0419OooO00o = (C0419OooO00o) obj;
                if (this.f37067OooO0O0 == c0419OooO00o.f37067OooO0O0 && this.f37068OooO0OO == c0419OooO00o.f37068OooO0OO) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f37067OooO0O0 * 31) + (this.f37068OooO0OO ? 1231 : 1237);
        }

        public C0419OooO00o(int i, int i2) {
            i = (i2 & 1) != 0 ? 100 : i;
            this.f37067OooO0O0 = i;
            this.f37068OooO0OO = false;
            if (!(i > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }
    }

    @JvmOverloads
    public OooO00o(@NotNull OooO0o oooO0o, @NotNull o0Oo0oo o0oo0oo2, int i, boolean z) {
        this.f37063OooO00o = oooO0o;
        this.f37064OooO0O0 = o0oo0oo2;
        this.f37065OooO0OO = i;
        this.f37066OooO0Oo = z;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // o00OO000.OooO0OO
    public final void OooO00o() {
        OooO0o oooO0o = this.f37063OooO00o;
        Drawable drawableOooO0Oo = oooO0o.OooO0Oo();
        o0Oo0oo o0oo0oo2 = this.f37064OooO0O0;
        Oooo000 oooo000 = new Oooo000(drawableOooO0Oo, o0oo0oo2.OooO00o(), o0oo0oo2.OooO0O0().f11665OooOoo, this.f37065OooO0OO, ((o0oo0oo2 instanceof o000000O) && ((o000000O) o0oo0oo2).f36790OooO0oO) ? false : true, this.f37066OooO0Oo);
        if (o0oo0oo2 instanceof o000000O) {
            oooO0o.OooO00o(oooo000);
        } else if (o0oo0oo2 instanceof o00oO0o) {
            oooO0o.OooO0OO(oooo000);
        }
    }
}
