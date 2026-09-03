package p089o000o000;

import Oooo000.Oooo0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f28695OooO00o;

    public static final class OooO00o extends o000000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Throwable f28696OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull Throwable error) {
            super(false);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f28696OooO0O0 = error;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f28695OooO00o == oooO00o.f28695OooO00o && Intrinsics.areEqual(this.f28696OooO0O0, oooO00o.f28696OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f28696OooO0O0.hashCode() + (this.f28695OooO00o ? 1231 : 1237);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error(endOfPaginationReached=");
            sbOooO0o0.append(this.f28695OooO00o);
            sbOooO0o0.append(", error=");
            sbOooO0o0.append(this.f28696OooO0O0);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0O0 extends o000000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f28697OooO0O0 = new OooO0O0();

        public OooO0O0() {
            super(false);
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof OooO0O0) && this.f28695OooO00o == ((OooO0O0) obj).f28695OooO00o;
        }

        public final int hashCode() {
            return this.f28695OooO00o ? 1231 : 1237;
        }

        @NotNull
        public final String toString() {
            return Oooo0.OooO0O0(OooO00o.OooO00o.OooO0o0("Loading(endOfPaginationReached="), this.f28695OooO00o, ')');
        }
    }

    public static final class OooO0OO extends o000000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f28698OooO0O0 = new OooO0OO(true);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f28699OooO0OO = new OooO0OO(false);

        public OooO0OO(boolean z) {
            super(z);
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof OooO0OO) && this.f28695OooO00o == ((OooO0OO) obj).f28695OooO00o;
        }

        public final int hashCode() {
            return this.f28695OooO00o ? 1231 : 1237;
        }

        @NotNull
        public final String toString() {
            return Oooo0.OooO0O0(OooO00o.OooO00o.OooO0o0("NotLoading(endOfPaginationReached="), this.f28695OooO00o, ')');
        }
    }

    public o000000(boolean z) {
        this.f28695OooO00o = z;
    }
}
