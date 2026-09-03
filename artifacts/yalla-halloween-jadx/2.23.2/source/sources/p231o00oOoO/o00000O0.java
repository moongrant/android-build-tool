package p231o00oOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public abstract class o00000O0 {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends o00000O0 {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            ((OooO00o) obj).getClass();
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "Data(data=null, baseUrl=null, encoding=null, mimeType=null, historyUrl=null)";
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 extends o00000O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f39840OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f39841OooO0O0;

        public OooO0O0(@NotNull String url, @NotNull Map<String, String> additionalHttpHeaders) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(additionalHttpHeaders, "additionalHttpHeaders");
            this.f39840OooO00o = url;
            this.f39841OooO0O0 = additionalHttpHeaders;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f39840OooO00o, oooO0O0.f39840OooO00o) && Intrinsics.areEqual(this.f39841OooO0O0, oooO0O0.f39841OooO0O0);
        }

        public final int hashCode() {
            return this.f39841OooO0O0.hashCode() + (this.f39840OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Url(url=" + this.f39840OooO00o + ", additionalHttpHeaders=" + this.f39841OooO0O0 + ')';
        }
    }
}
