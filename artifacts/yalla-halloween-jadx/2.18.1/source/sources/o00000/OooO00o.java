package o00000;

import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;
import p708oo000o.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final HashMap<OooO0O0, WeakReference<C0278OooO00o>> f26570OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: o00000.OooO00o$OooO00o, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0278OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooOOO0 f26571OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f26572OooO0O0;

        public C0278OooO00o(@NotNull OooOOO0 imageVector, int i) {
            Intrinsics.checkNotNullParameter(imageVector, "imageVector");
            this.f26571OooO00o = imageVector;
            this.f26572OooO0O0 = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0278OooO00o)) {
                return false;
            }
            C0278OooO00o c0278OooO00o = (C0278OooO00o) obj;
            return Intrinsics.areEqual(this.f26571OooO00o, c0278OooO00o.f26571OooO00o) && this.f26572OooO0O0 == c0278OooO00o.f26572OooO0O0;
        }

        public final int hashCode() {
            return (this.f26571OooO00o.hashCode() * 31) + this.f26572OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ImageVectorEntry(imageVector=");
            sbOooO0o0.append(this.f26571OooO00o);
            sbOooO0o0.append(", configFlags=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f26572OooO0O0, ')');
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Resources.Theme f26573OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f26574OooO0O0;

        public OooO0O0(@NotNull Resources.Theme theme, int i) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.f26573OooO00o = theme;
            this.f26574OooO0O0 = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f26573OooO00o, oooO0O0.f26573OooO00o) && this.f26574OooO0O0 == oooO0O0.f26574OooO0O0;
        }

        public final int hashCode() {
            return (this.f26573OooO00o.hashCode() * 31) + this.f26574OooO0O0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Key(theme=");
            sbOooO0o0.append(this.f26573OooO00o);
            sbOooO0o0.append(", id=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f26574OooO0O0, ')');
        }
    }
}
