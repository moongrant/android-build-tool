package p325o0O0oo0o;

import OooO00o.OooO00o;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final WebResourceRequest f36924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final WebResourceError f36925OooO0O0;

    public o000O00(@Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f36924OooO00o = webResourceRequest;
        this.f36925OooO0O0 = error;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o01 = (o000O00) obj;
        return Intrinsics.areEqual(this.f36924OooO00o, o000o01.f36924OooO00o) && Intrinsics.areEqual(this.f36925OooO0O0, o000o01.f36925OooO0O0);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f36924OooO00o;
        return this.f36925OooO0O0.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("WebViewError(request=");
        sbOooO0o0.append(this.f36924OooO00o);
        sbOooO0o0.append(", error=");
        sbOooO0o0.append(this.f36925OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
