package androidx.paging;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f10257OooO00o;

    public static final class OooO00o extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Throwable f10258OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull Throwable error) {
            super(false);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f10258OooO0O0 = error;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f10257OooO00o == oooO00o.f10257OooO00o && Intrinsics.areEqual(this.f10258OooO0O0, oooO00o.f10258OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f10258OooO0O0.hashCode() + (this.f10257OooO00o ? 1231 : 1237);
        }

        @NotNull
        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f10257OooO00o + ", error=" + this.f10258OooO0O0 + ')';
        }
    }

    public static final class OooO0O0 extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f10259OooO0O0 = new OooO0O0();

        public OooO0O0() {
            super(false);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO0O0) {
                if (this.f10257OooO00o == ((OooO0O0) obj).f10257OooO00o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f10257OooO00o ? 1231 : 1237;
        }

        @NotNull
        public final String toString() {
            return androidx.compose.animation.OooO0o.OooO00o(new StringBuilder("Loading(endOfPaginationReached="), this.f10257OooO00o, ')');
        }
    }

    public static final class OooO0OO extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f10260OooO0O0 = new OooO0OO(true);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f10261OooO0OO = new OooO0OO(false);

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO0OO) {
                if (this.f10257OooO00o == ((OooO0OO) obj).f10257OooO00o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f10257OooO00o ? 1231 : 1237;
        }

        @NotNull
        public final String toString() {
            return androidx.compose.animation.OooO0o.OooO00o(new StringBuilder("NotLoading(endOfPaginationReached="), this.f10257OooO00o, ')');
        }
    }

    public OooOOO0(boolean z) {
        this.f10257OooO00o = z;
    }
}
