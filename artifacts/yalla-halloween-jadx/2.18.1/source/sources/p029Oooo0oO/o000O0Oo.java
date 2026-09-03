package p029Oooo0oO;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public interface o000O0Oo {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o implements o000O0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f2258OooO00o;

        public OooO00o(int i) {
            this.f2258OooO00o = i;
            if (!(i > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }

        @Override // p029Oooo0oO.o000O0Oo
        @NotNull
        public final List<Integer> OooO00o(@NotNull OooO oooO, int i, int i2) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            int i3 = this.f2258OooO00o;
            int i4 = i - ((i3 - 1) * i2);
            int i5 = i4 / i3;
            int i6 = i4 % i3;
            ArrayList arrayList = new ArrayList(i3);
            int i7 = 0;
            while (i7 < i3) {
                arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
                i7++;
            }
            return arrayList;
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof OooO00o) && this.f2258OooO00o == ((OooO00o) obj).f2258OooO00o;
        }

        public final int hashCode() {
            return -this.f2258OooO00o;
        }
    }

    @NotNull
    List<Integer> OooO00o(@NotNull OooO oooO, int i, int i2);
}
