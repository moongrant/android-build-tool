package o0O0O00;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00OO00O;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
public interface OooOO0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f35237OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final C0361OooO00o f35238OooO0O0 = new C0361OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public static final OooO f35239OooO0OO = new OooO();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f35240OooO0Oo = new OooO0OO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public static final OooO0o f35242OooO0o0 = new OooO0o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public static final C0362OooOO0 f35241OooO0o = new C0362OooOO0();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f35243OooO0oO = new OooO0O0();

        public static final class OooO implements OooOO0 {
            @Override // o0O0O00.OooOO0
            public final long OooO00o(long j, long j2) {
                float fMin = Math.min(o00OO00O.OooO0OO(j, j2), o00OO00O.OooO0O0(j, j2));
                return o000O0Oo.OooO00o(fMin, fMin);
            }
        }

        /* JADX INFO: renamed from: o0O0O00.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0361OooO00o implements OooOO0 {
            @Override // o0O0O00.OooOO0
            public final long OooO00o(long j, long j2) {
                float fMax = Math.max(o00OO00O.OooO0OO(j, j2), o00OO00O.OooO0O0(j, j2));
                return o000O0Oo.OooO00o(fMax, fMax);
            }
        }

        public static final class OooO0O0 implements OooOO0 {
            @Override // o0O0O00.OooOO0
            public final long OooO00o(long j, long j2) {
                return o000O0Oo.OooO00o(o00OO00O.OooO0OO(j, j2), o00OO00O.OooO0O0(j, j2));
            }
        }

        public static final class OooO0OO implements OooOO0 {
            @Override // o0O0O00.OooOO0
            public final long OooO00o(long j, long j2) {
                float fOooO0O0 = o00OO00O.OooO0O0(j, j2);
                return o000O0Oo.OooO00o(fOooO0O0, fOooO0O0);
            }
        }

        public static final class OooO0o implements OooOO0 {
            @Override // o0O0O00.OooOO0
            public final long OooO00o(long j, long j2) {
                float fOooO0OO = o00OO00O.OooO0OO(j, j2);
                return o000O0Oo.OooO00o(fOooO0OO, fOooO0OO);
            }
        }

        /* JADX INFO: renamed from: o0O0O00.OooOO0$OooO00o$OooOO0, reason: collision with other inner class name */
        public static final class C0362OooOO0 implements OooOO0 {
            @Override // o0O0O00.OooOO0
            public final long OooO00o(long j, long j2) {
                if (o00O0O.OooOo00.OooO0Oo(j) <= o00O0O.OooOo00.OooO0Oo(j2) && o00O0O.OooOo00.OooO0O0(j) <= o00O0O.OooOo00.OooO0O0(j2)) {
                    return o000O0Oo.OooO00o(1.0f, 1.0f);
                }
                float fMin = Math.min(o00OO00O.OooO0OO(j, j2), o00OO00O.OooO0O0(j, j2));
                return o000O0Oo.OooO00o(fMin, fMin);
            }
        }
    }

    long OooO00o(long j, long j2);
}
