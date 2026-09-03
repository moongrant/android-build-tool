package p231o00oOoO;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final WebResourceRequest f39838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final WebResourceError f39839OooO0O0;

    public o00000O(@Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f39838OooO00o = webResourceRequest;
        this.f39839OooO0O0 = error;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O)) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return Intrinsics.areEqual(this.f39838OooO00o, o00000o.f39838OooO00o) && Intrinsics.areEqual(this.f39839OooO0O0, o00000o.f39839OooO0O0);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f39838OooO00o;
        return this.f39839OooO0O0.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "WebViewError(request=" + this.f39838OooO00o + ", error=" + this.f39839OooO0O0 + ')';
    }
}
