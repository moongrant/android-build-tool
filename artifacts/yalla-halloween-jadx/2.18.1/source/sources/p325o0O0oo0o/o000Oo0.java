package p325o0O0oo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o000Oo0 {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends o000Oo0 {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            Objects.requireNonNull((OooO00o) obj);
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "Data(data=null, baseUrl=null)";
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 extends o000Oo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f36974OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f36975OooO0O0;

        public OooO0O0(@NotNull String url, @NotNull Map<String, String> additionalHttpHeaders) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
            this.f36974OooO00o = url;
            this.f36975OooO0O0 = additionalHttpHeaders;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f36974OooO00o, oooO0O0.f36974OooO00o) && Intrinsics.areEqual(this.f36975OooO0O0, oooO0O0.f36975OooO0O0);
        }

        public final int hashCode() {
            return this.f36975OooO0O0.hashCode() + (this.f36974OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Url(url=");
            sbOooO0o0.append(this.f36974OooO00o);
            sbOooO0o0.append(", additionalHttpHeaders=");
            sbOooO0o0.append(this.f36975OooO0O0);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }
}
