package p145o00Oo0;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOO0O;
import o00O0O.OooOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0000OO0 {

    public static final class OooO00o extends o0000OO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000O0o f32073OooO00o;

        public OooO00o(@NotNull o000O0o path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.f32073OooO00o = path;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && Intrinsics.areEqual(this.f32073OooO00o, ((OooO00o) obj).f32073OooO00o);
        }

        public final int hashCode() {
            return this.f32073OooO00o.hashCode();
        }
    }

    @Immutable
    public static final class OooO0O0 extends o0000OO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooOO0O f32074OooO00o;

        public OooO0O0(@NotNull OooOO0O rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            this.f32074OooO00o = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && Intrinsics.areEqual(this.f32074OooO00o, ((OooO0O0) obj).f32074OooO00o);
        }

        public final int hashCode() {
            return this.f32074OooO00o.hashCode();
        }
    }

    @Immutable
    public static final class OooO0OO extends o0000OO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooOOO f32075OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o0OoOo0 f32076OooO0O0;

        /* JADX WARN: Code duplicated, block: B:18:0x004d  */
        /* JADX WARN: Code duplicated, block: B:35:0x008f  */
        public OooO0OO(@NotNull OooOOO roundRect) {
            boolean z;
            boolean z2;
            o000O0o o000o0oOooO00o;
            Intrinsics.checkNotNullParameter(roundRect, "roundRect");
            this.f32075OooO00o = roundRect;
            boolean z3 = false;
            if (o00O0O.OooO00o.OooO0O0(roundRect.f30415OooO0oo) == o00O0O.OooO00o.OooO0O0(roundRect.f30414OooO0oO)) {
                if (o00O0O.OooO00o.OooO0O0(roundRect.f30414OooO0oO) == o00O0O.OooO00o.OooO0O0(roundRect.f30412OooO0o)) {
                    if (o00O0O.OooO00o.OooO0O0(roundRect.f30412OooO0o) == o00O0O.OooO00o.OooO0O0(roundRect.f30413OooO0o0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (o00O0O.OooO00o.OooO0OO(roundRect.f30415OooO0oo) == o00O0O.OooO00o.OooO0OO(roundRect.f30414OooO0oO)) {
                if (o00O0O.OooO00o.OooO0OO(roundRect.f30414OooO0oO) == o00O0O.OooO00o.OooO0OO(roundRect.f30412OooO0o)) {
                    if (o00O0O.OooO00o.OooO0OO(roundRect.f30412OooO0o) == o00O0O.OooO00o.OooO0OO(roundRect.f30413OooO0o0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                o000o0oOooO00o = null;
            } else {
                o000o0oOooO00o = o00Ooo.OooO00o();
                ((o0OoOo0) o000o0oOooO00o).OooO0oO(roundRect);
            }
            this.f32076OooO0O0 = (o0OoOo0) o000o0oOooO00o;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0OO) && Intrinsics.areEqual(this.f32075OooO00o, ((OooO0OO) obj).f32075OooO00o);
        }

        public final int hashCode() {
            return this.f32075OooO00o.hashCode();
        }
    }
}
