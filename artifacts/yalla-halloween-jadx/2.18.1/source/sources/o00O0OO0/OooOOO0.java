package o00O0OO0;

import Oooo000.Oooo0;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final MemoryCache$Key f30584OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f30585OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final DataSource f30586OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f30587OooO0Oo;

        public OooO00o(@Nullable MemoryCache$Key memoryCache$Key, boolean z, @NotNull DataSource dataSource, boolean z2) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            this.f30584OooO00o = memoryCache$Key;
            this.f30585OooO0O0 = z;
            this.f30586OooO0OO = dataSource;
            this.f30587OooO0Oo = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f30584OooO00o, oooO00o.f30584OooO00o) && this.f30585OooO0O0 == oooO00o.f30585OooO0O0 && this.f30586OooO0OO == oooO00o.f30586OooO0OO && this.f30587OooO0Oo == oooO00o.f30587OooO0Oo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public final int hashCode() {
            MemoryCache$Key memoryCache$Key = this.f30584OooO00o;
            int iHashCode = (memoryCache$Key == null ? 0 : memoryCache$Key.hashCode()) * 31;
            boolean z = this.f30585OooO0O0;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int iHashCode2 = (this.f30586OooO0OO.hashCode() + ((iHashCode + r1) * 31)) * 31;
            boolean z2 = this.f30587OooO0Oo;
            return iHashCode2 + (z2 ? 1 : z2);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Metadata(memoryCacheKey=");
            sbOooO0o0.append(this.f30584OooO00o);
            sbOooO0o0.append(", isSampled=");
            sbOooO0o0.append(this.f30585OooO0O0);
            sbOooO0o0.append(", dataSource=");
            sbOooO0o0.append(this.f30586OooO0OO);
            sbOooO0o0.append(", isPlaceholderMemoryCacheKeyPresent=");
            return Oooo0.OooO0O0(sbOooO0o0, this.f30587OooO0Oo, ')');
        }
    }

    @Nullable
    public abstract Drawable OooO00o();

    @NotNull
    public abstract coil.request.OooO00o OooO0O0();
}
