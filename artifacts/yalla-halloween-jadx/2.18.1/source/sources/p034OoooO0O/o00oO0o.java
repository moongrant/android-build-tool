package p034OoooO0O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public interface o00oO0o {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f3546OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f3547OooO0O0 = new OooO0OO();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public static final C0026OooO00o f3548OooO0OO = new C0026OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public static final OooO f3549OooO0Oo = new OooO();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public static final OooO0o f3551OooO0o0 = new OooO0o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f3550OooO0o = new OooO0O0();

        public static final class OooO implements o00oO0o {
            @Override // p034OoooO0O.o00oO0o
            public final long OooO00o(@NotNull o0OOO0o textLayoutResult, long j, boolean z, @Nullable o0OO00O o0oo00o2) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return OooO00o.OooO00o(textLayoutResult, j, new o0OOO0o(textLayoutResult));
            }
        }

        /* JADX INFO: renamed from: OoooO0O.o00oO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0026OooO00o implements o00oO0o {
            @Override // p034OoooO0O.o00oO0o
            public final long OooO00o(@NotNull o0OOO0o textLayoutResult, long j, boolean z, @Nullable o0OO00O o0oo00o2) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (o0OO00O.OooO0OO(j)) {
                    return o0Oo0oo.OooO00o((int) (j >> 32), StringsKt.getLastIndex(textLayoutResult.f26877OooO00o.f26885OooO00o), z, o0oo00o2 != null ? o0OO00O.OooO0oo(o0oo00o2.f26876OooO00o) : false);
                }
                return j;
            }
        }

        public static final class OooO0O0 implements o00oO0o {
            @Override // p034OoooO0O.o00oO0o
            public final long OooO00o(@NotNull o0OOO0o textLayoutResult, long j, boolean z, @Nullable o0OO00O o0oo00o2) {
                int iOooO0OO;
                int iOooO0OO2;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (o0oo00o2 == null) {
                    Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                    return OooO00o.OooO00o(textLayoutResult, j, new o0OOO0o(textLayoutResult));
                }
                if (o0OO00O.OooO0OO(j)) {
                    return o0Oo0oo.OooO00o((int) (j >> 32), StringsKt.getLastIndex(textLayoutResult.f26877OooO00o.f26885OooO00o), z, o0OO00O.OooO0oo(o0oo00o2.f26876OooO00o));
                }
                if (z) {
                    iOooO0OO2 = OooO0OO(textLayoutResult, (int) (j >> 32), (int) (o0oo00o2.f26876OooO00o >> 32), o0OO00O.OooO0Oo(j), true, o0OO00O.OooO0oo(j));
                    iOooO0OO = o0OO00O.OooO0Oo(j);
                } else {
                    int i = (int) (j >> 32);
                    iOooO0OO = OooO0OO(textLayoutResult, o0OO00O.OooO0Oo(j), o0OO00O.OooO0Oo(o0oo00o2.f26876OooO00o), i, false, o0OO00O.OooO0oo(j));
                    iOooO0OO2 = i;
                }
                return o000O0O0.OooO00o(iOooO0OO2, iOooO0OO);
            }

            public final int OooO0O0(o0OOO0o o0ooo0o2, int i, int i2, int i3, boolean z, boolean z2) {
                long jOooOOOO = o0ooo0o2.OooOOOO(i);
                int iOooOO0O = (int) (jOooOOOO >> 32);
                if (o0ooo0o2.OooO0oO(iOooOO0O) != i2) {
                    iOooOO0O = o0ooo0o2.OooOO0O(i2);
                }
                int iOooO0Oo = o0ooo0o2.OooO0oO(o0OO00O.OooO0Oo(jOooOOOO)) == i2 ? o0OO00O.OooO0Oo(jOooOOOO) : o0ooo0o2.OooO0o(i2, false);
                if (iOooOO0O == i3) {
                    return iOooO0Oo;
                }
                if (iOooO0Oo == i3) {
                    return iOooOO0O;
                }
                int i4 = (iOooOO0O + iOooO0Oo) / 2;
                if (z ^ z2) {
                    if (i <= i4) {
                        return iOooOO0O;
                    }
                } else if (i < i4) {
                    return iOooOO0O;
                }
                return iOooO0Oo;
            }

            public final int OooO0OO(o0OOO0o o0ooo0o2, int i, int i2, int i3, boolean z, boolean z2) {
                if (i == -1) {
                    return i2;
                }
                int iOooO0oO = o0ooo0o2.OooO0oO(i);
                if (iOooO0oO != o0ooo0o2.OooO0oO(i2)) {
                    return OooO0O0(o0ooo0o2, i, iOooO0oO, i3, z, z2);
                }
                boolean z3 = true;
                long jOooOOOO = o0ooo0o2.OooOOOO(i2);
                if (i2 != ((int) (jOooOOOO >> 32)) && i2 != o0OO00O.OooO0Oo(jOooOOOO)) {
                    z3 = false;
                }
                return !z3 ? i : OooO0O0(o0ooo0o2, i, iOooO0oO, i3, z, z2);
            }
        }

        public static final class OooO0OO implements o00oO0o {
            @Override // p034OoooO0O.o00oO0o
            public final long OooO00o(@NotNull o0OOO0o textLayoutResult, long j, boolean z, @Nullable o0OO00O o0oo00o2) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return j;
            }
        }

        public static final class OooO0o implements o00oO0o {
            @Override // p034OoooO0O.o00oO0o
            public final long OooO00o(@NotNull o0OOO0o textLayoutResult, long j, boolean z, @Nullable o0OO00O o0oo00o2) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return OooO00o.OooO00o(textLayoutResult, j, new o0ooOOo(textLayoutResult.f26877OooO00o.f26885OooO00o));
            }
        }

        public static final long OooO00o(o0OOO0o o0ooo0o2, long j, Function1 function1) {
            if (o0ooo0o2.f26877OooO00o.f26885OooO00o.length() == 0) {
                o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
                return o0OO00O.f26875OooO0OO;
            }
            int lastIndex = StringsKt.getLastIndex(o0ooo0o2.f26877OooO00o.f26885OooO00o);
            o0OO00O.OooO00o oooO00o2 = o0OO00O.f26874OooO0O0;
            long j2 = ((o0OO00O) function1.invoke(Integer.valueOf(RangesKt.coerceIn((int) (j >> 32), 0, lastIndex)))).f26876OooO00o;
            long j3 = ((o0OO00O) function1.invoke(Integer.valueOf(RangesKt.coerceIn(o0OO00O.OooO0Oo(j), 0, lastIndex)))).f26876OooO00o;
            return o000O0O0.OooO00o(o0OO00O.OooO0oo(j) ? o0OO00O.OooO0Oo(j2) : (int) (j2 >> 32), o0OO00O.OooO0oo(j) ? (int) (j3 >> 32) : o0OO00O.OooO0Oo(j3));
        }
    }

    long OooO00o(@NotNull o0OOO0o o0ooo0o2, long j, boolean z, @Nullable o0OO00O o0oo00o2);
}
