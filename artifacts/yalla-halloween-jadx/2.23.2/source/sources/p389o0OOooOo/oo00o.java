package p389o0OOooOo;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.selectPicture.view.photoview.PhotoView;
import com.bumptech.glide.OooO0OO;
import com.yalla.netimage.listener.OooO;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p138o00OOOo.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEngine.kt\ncom/yalla/yalla/app/engine/AppImageEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class oo00o implements OooO0o {
    @Override // p138o00OOOo.OooO0o
    public final void OooO00o(@NotNull Context context, @NotNull String url, @NotNull PhotoView imageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((OooO) OooO0OO.OooO0Oo(context).OooO0OO(context)).OooOOo(url).OoooO0O(imageView);
    }

    @Override // p138o00OOOo.OooO0o
    public final void OooO0O0(@NotNull Context context, @NotNull Uri uri, @NotNull PhotoView imageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ((OooO) OooO0OO.OooO0Oo(context).OooO0OO(context)).OooOOOo(uri).OoooO0O(imageView);
    }
}
