package p614o0oo0o0O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.mix.EvaSrc;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO0O {
    @NotNull
    public static Bitmap OooO00o(@NotNull EvaSrc src) {
        Paint.Align align;
        Intrinsics.checkNotNullParameter(src, "src");
        int i = src.f32948OooO0O0;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i2 = src.f32949OooO0OO;
        Bitmap bitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmap);
        Rect rect = new Rect(0, 0, i, i2);
        Rect rect2 = new Rect();
        TextPaint textPaint = new TextPaint();
        float f = src.f32957OooOO0o;
        textPaint.setTextSize(f);
        String str = src.f32958OooOOO0;
        if (Intrinsics.areEqual(str, "right")) {
            align = Paint.Align.RIGHT;
        } else {
            align = Intrinsics.areEqual(str, ViewHierarchyConstants.DIMENSION_LEFT_KEY) ? Paint.Align.LEFT : Paint.Align.CENTER;
        }
        textPaint.setTextAlign(align);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setAntiAlias(true);
        if (src.f32955OooOO0 == EvaSrc.Style.BOLD) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        textPaint.setColor(src.f32956OooOO0O);
        String string = TextUtils.ellipsize(src.f32946OooO, textPaint, i, TextUtils.TruncateAt.END).toString();
        float f2 = 0.8f;
        while (f2 > 0.1f) {
            textPaint.getTextBounds(string, 0, string.length(), rect2);
            if (rect2.width() <= rect.width()) {
                break;
            }
            f2 -= 0.1f;
            textPaint.setTextSize(f);
        }
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        int iCenterY = (rect.centerY() - (fontMetricsInt.top / 2)) - (fontMetricsInt.bottom / 2);
        String str2 = src.f32958OooOOO0;
        if (Intrinsics.areEqual(str2, ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
            canvas.drawText(string, rect.left, iCenterY, textPaint);
        } else if (Intrinsics.areEqual(str2, "right")) {
            canvas.drawText(string, rect.right, iCenterY, textPaint);
        } else {
            canvas.drawText(string, rect.centerX(), iCenterY, textPaint);
        }
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }
}
