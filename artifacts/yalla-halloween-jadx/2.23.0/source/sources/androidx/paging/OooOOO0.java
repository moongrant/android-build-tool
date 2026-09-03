package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f7163OooO00o;

    public static final class OooO00o extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Throwable f7164OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull Throwable error) {
            super(false);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f7164OooO0O0 = error;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f7163OooO00o == oooO00o.f7163OooO00o && Intrinsics.areEqual(this.f7164OooO0O0, oooO00o.f7164OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7164OooO0O0.hashCode() + (this.f7163OooO00o ? 1231 : 1237);
        }

        @NotNull
        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f7163OooO00o + ", error=" + this.f7164OooO0O0 + ')';
        }
    }

    public static final class OooO0O0 extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f7165OooO0O0 = new OooO0O0();

        public OooO0O0() {
            super(false);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO0O0) {
                if (this.f7163OooO00o == ((OooO0O0) obj).f7163OooO00o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7163OooO00o ? 1231 : 1237;
        }

        @NotNull
        public final String toString() {
            return androidx.compose.animation.OooO0o.OooO00o(new StringBuilder("Loading(endOfPaginationReached="), this.f7163OooO00o, ')');
        }
    }

    public static final class OooO0OO extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f7166OooO0O0 = new OooO0OO(true);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f7167OooO0OO = new OooO0OO(false);

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO0OO) {
                if (this.f7163OooO00o == ((OooO0OO) obj).f7163OooO00o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7163OooO00o ? 1231 : 1237;
        }

        @NotNull
        public final String toString() {
            return androidx.compose.animation.OooO0o.OooO00o(new StringBuilder("NotLoading(endOfPaginationReached="), this.f7163OooO00o, ')');
        }
    }

    public OooOOO0(boolean z) {
        this.f7163OooO00o = z;
    }
}
