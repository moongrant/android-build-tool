package p644o0ooOOo;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class o0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ArrayList f58052OooO00o = new ArrayList();

    @Stable
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Object f58053OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f58054OooO0O0;

        public OooO00o(@NotNull Integer id, int i) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f58053OooO00o = id;
            this.f58054OooO0O0 = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f58053OooO00o, oooO00o.f58053OooO00o) && this.f58054OooO0O0 == oooO00o.f58054OooO0O0;
        }

        public final int hashCode() {
            return (this.f58053OooO00o.hashCode() * 31) + this.f58054OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalAnchor(id=");
            sb.append(this.f58053OooO00o);
            sb.append(", index=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f58054OooO0O0, ')');
        }
    }

    @Stable
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Object f58055OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f58056OooO0O0;

        public OooO0O0(@NotNull Integer id, int i) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f58055OooO00o = id;
            this.f58056OooO0O0 = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f58055OooO00o, oooO0O0.f58055OooO00o) && this.f58056OooO0O0 == oooO0O0.f58056OooO0O0;
        }

        public final int hashCode() {
            return (this.f58055OooO00o.hashCode() * 31) + this.f58056OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("VerticalAnchor(id=");
            sb.append(this.f58055OooO00o);
            sb.append(", index=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f58056OooO0O0, ')');
        }
    }
}
