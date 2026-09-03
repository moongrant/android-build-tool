package p383o0OOooO;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.selectPicture.view.photoview.PhotoView;
import com.yalla.netimage.listener.OooO;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o00O0OOO.OooO0OO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEngine.kt\ncom/yalla/yalla/app/engine/AppImageEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class o000OO00 implements OooO0OO {
    @Override // o00O0OOO.OooO0OO
    public final void OooO00o(@NotNull Context context, @NotNull String url, @NotNull PhotoView imageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((OooO) com.bumptech.glide.OooO0OO.OooO0Oo(context).OooO0o(context)).OooOOo0(url).OoooO0O(imageView);
    }

    @Override // o00O0OOO.OooO0OO
    public final void OooO0O0(@NotNull Context context, @NotNull Uri uri, @NotNull PhotoView imageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((OooO) com.bumptech.glide.OooO0OO.OooO0Oo(context).OooO0o(context)).OooOOOO(uri).OoooO0O(imageView);
    }
}
