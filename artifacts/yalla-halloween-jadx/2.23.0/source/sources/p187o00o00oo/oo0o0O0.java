package p187o00o00oo;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final WebResourceRequest f38756OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final WebResourceError f38757OooO0O0;

    public oo0o0O0(@Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f38756OooO00o = webResourceRequest;
        this.f38757OooO0O0 = error;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0O0)) {
            return false;
        }
        oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
        return Intrinsics.areEqual(this.f38756OooO00o, oo0o0o0.f38756OooO00o) && Intrinsics.areEqual(this.f38757OooO0O0, oo0o0o0.f38757OooO0O0);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f38756OooO00o;
        return this.f38757OooO0O0.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "WebViewError(request=" + this.f38756OooO00o + ", error=" + this.f38757OooO0O0 + ')';
    }
}
