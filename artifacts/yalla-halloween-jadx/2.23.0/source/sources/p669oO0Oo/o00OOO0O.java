package p669oO0Oo;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.yalla.netimage.listener.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends OooO00o<BitmapDrawable> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f60569OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<OooOO0, Unit> f60570OooO0oo;

    public o00OOO0O(OooOO0 oooOO1, o0o0Oo.OooO0OO.OooO00o oooO00o) {
        this.f60569OooO0oO = oooOO1;
        this.f60570OooO0oo = oooO00o;
    }

    @Override // com.yalla.netimage.listener.OooO00o
    public final void OooO0oo(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        int width = bitmapDrawable2.getBitmap().getWidth();
        Bitmap bitmap = bitmapDrawable2.getBitmap();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, widt… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = width / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapDrawable2.getBitmap(), 0.0f, 0.0f, paint);
        OooOO0 oooOO1 = this.f60569OooO0oO;
        oooOO1.OooO00o(bitmapCreateBitmap, "img_771");
        this.f60570OooO0oo.invoke(oooOO1);
    }
}
