package o0000OO;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Function1<o00000, Unit>> f27369OooO00o = new ArrayList();

    @Stable
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Object f27370OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f27371OooO0O0;

        public OooO00o(@NotNull Object id, int i) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f27370OooO00o = id;
            this.f27371OooO0O0 = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f27370OooO00o, oooO00o.f27370OooO00o) && this.f27371OooO0O0 == oooO00o.f27371OooO0O0;
        }

        public final int hashCode() {
            return (this.f27370OooO00o.hashCode() * 31) + this.f27371OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HorizontalAnchor(id=");
            sbOooO0o0.append(this.f27370OooO00o);
            sbOooO0o0.append(", index=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f27371OooO0O0, ')');
        }
    }

    @Stable
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Object f27372OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f27373OooO0O0;

        public OooO0O0(@NotNull Object id, int i) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f27372OooO00o = id;
            this.f27373OooO0O0 = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f27372OooO00o, oooO0O0.f27372OooO00o) && this.f27373OooO0O0 == oooO0O0.f27373OooO0O0;
        }

        public final int hashCode() {
            return (this.f27372OooO00o.hashCode() * 31) + this.f27373OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("VerticalAnchor(id=");
            sbOooO0o0.append(this.f27372OooO00o);
            sbOooO0o0.append(", index=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f27373OooO0O0, ')');
        }
    }
}
