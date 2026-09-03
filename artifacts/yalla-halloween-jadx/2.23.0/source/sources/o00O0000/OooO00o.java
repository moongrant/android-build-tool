package o00O0000;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104o000oo0O.o00O00;
import p109o000ooo.o00Oo0;
import p109o000ooo.o00oO0o;
import p109o000ooo.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f36263OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00oO0o f36264OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f36265OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f36266OooO0Oo;

    /* JADX INFO: renamed from: o00O0000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0419OooO00o implements OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f36267OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f36268OooO0OO;

        @JvmOverloads
        public C0419OooO00o() {
            this(0, 3);
        }

        @Override // o00O0000.OooO0OO.OooO00o
        @NotNull
        public final OooO0OO OooO00o(@NotNull OooO0o oooO0o, @NotNull o00oO0o o00oo0o2) {
            if (o00oo0o2 instanceof o0O0O00) {
                return ((o0O0O00) o00oo0o2).f35851OooO0OO == DataSource.MEMORY_CACHE ? new OooO0O0(oooO0o, o00oo0o2) : new OooO00o(oooO0o, o00oo0o2, this.f36267OooO0O0, this.f36268OooO0OO);
            }
            return new OooO0O0(oooO0o, o00oo0o2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0419OooO00o) {
                C0419OooO00o c0419OooO00o = (C0419OooO00o) obj;
                if (this.f36267OooO0O0 == c0419OooO00o.f36267OooO0O0 && this.f36268OooO0OO == c0419OooO00o.f36268OooO0OO) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f36267OooO0O0 * 31) + (this.f36268OooO0OO ? 1231 : 1237);
        }

        public C0419OooO00o(int i, int i2) {
            i = (i2 & 1) != 0 ? 100 : i;
            this.f36267OooO0O0 = i;
            this.f36268OooO0OO = false;
            if (!(i > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }
    }

    @JvmOverloads
    public OooO00o(@NotNull OooO0o oooO0o, @NotNull o00oO0o o00oo0o2, int i, boolean z) {
        this.f36263OooO00o = oooO0o;
        this.f36264OooO0O0 = o00oo0o2;
        this.f36265OooO0OO = i;
        this.f36266OooO0Oo = z;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // o00O0000.OooO0OO
    public final void OooO00o() {
        OooO0o oooO0o = this.f36263OooO00o;
        Drawable drawableOooO0Oo = oooO0o.OooO0Oo();
        o00oO0o o00oo0o2 = this.f36264OooO0O0;
        o00O00 o00o01 = new o00O00(drawableOooO0Oo, o00oo0o2.OooO00o(), o00oo0o2.OooO0O0().f8575OooOoo, this.f36265OooO0OO, ((o00oo0o2 instanceof o0O0O00) && ((o0O0O00) o00oo0o2).f35855OooO0oO) ? false : true, this.f36266OooO0Oo);
        if (o00oo0o2 instanceof o0O0O00) {
            oooO0o.OooO00o(o00o01);
        } else if (o00oo0o2 instanceof o00Oo0) {
            oooO0o.OooO0OO(o00o01);
        }
    }
}
