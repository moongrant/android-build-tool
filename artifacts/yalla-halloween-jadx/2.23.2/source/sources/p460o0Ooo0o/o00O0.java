package p460o0Ooo0o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0 {
    public static void OooO00o(@NotNull Canvas canvas, @NotNull Bitmap bitmap, @NotNull Rect srcRect, @NotNull Rect dstRect, @Nullable Paint paint) {
        Rect rect;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(srcRect, "srcRect");
        Intrinsics.checkNotNullParameter(dstRect, "dstRect");
        float fWidth = srcRect.width() / srcRect.height();
        float fWidth2 = dstRect.width() / dstRect.height();
        if (fWidth <= fWidth2) {
            if (fWidth < fWidth2) {
                int iHeight = (srcRect.height() - ((int) (srcRect.width() / fWidth2))) / 2;
                rect = new Rect(srcRect.left, srcRect.top + iHeight, srcRect.right, srcRect.bottom - iHeight);
            }
            canvas.drawBitmap(bitmap, srcRect, dstRect, paint);
        }
        int iWidth = (srcRect.width() - ((int) (srcRect.height() * fWidth2))) / 2;
        rect = new Rect(srcRect.left + iWidth, srcRect.top, srcRect.right - iWidth, srcRect.bottom);
        srcRect = rect;
        canvas.drawBitmap(bitmap, srcRect, dstRect, paint);
    }
}
