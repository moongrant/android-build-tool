package p138o00OOOo;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.OooO0OO;
import com.yalla.yalla.util.netimage.listener.OooO;
import com.yalla.yalla.util.netimage.listener.OooO0o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p200o00o0Oo0.o0000;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 implements o0000 {
    @Override // p200o00o0Oo0.o0000
    public final void OooO00o(@NotNull Context context, @NotNull String url, @NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((OooO) OooO0OO.OooO(context)).OooOOO(url).Oooo0oO(imageView);
    }

    @Override // p200o00o0Oo0.o0000
    public final void OooO0O0(@NotNull Context context, @NotNull Uri uri, @NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((OooO0o) ((OooO) OooO0OO.OooO(context)).OooO0OO().Oooo(uri)).Oooo0oO(imageView);
    }
}
