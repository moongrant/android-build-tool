package p650o0ooo;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.code.android.util.o0000O0;
import com.yalla.netimage.listener.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends OooO00o<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f58149OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f58150OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f58151OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ float f58152OooOO0;

    public a2(OooOO0 oooOO1, String str, int i, float f) {
        this.f58150OooO0oO = oooOO1;
        this.f58151OooO0oo = str;
        this.f58149OooO = i;
        this.f58152OooOO0 = f;
    }

    @Override // com.yalla.netimage.listener.OooO00o
    public final void OooO0oO(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        int width = bitmapDrawable2.getBitmap().getWidth();
        Bitmap bitmap = bitmapDrawable2.getBitmap();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = width / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapDrawable2.getBitmap(), 0.0f, 0.0f, paint);
        this.f58150OooO0oO.OooO00o(bitmapCreateBitmap, this.f58151OooO0oo);
        Paint paint2 = new Paint(1);
        paint2.setColor(this.f58149OooO);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        float f2 = this.f58152OooOO0;
        paint2.setStrokeWidth(o0000O0.OooO00o(f2));
        canvas.drawCircle(f, f, (width - o0000O0.OooO00o(f2)) / 2.0f, paint2);
    }
}
