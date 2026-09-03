package p580o0oOoOo;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.yalla.yalla.util.netimage.listener.OooO00o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OO0.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000o0 extends OooO00o<BitmapDrawable> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f46710Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<OooOO0, Unit> f46711Oooo0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public oOo000o0(OooOO0 oooOO1, Function1<? super OooOO0, Unit> function1) {
        this.f46710Oooo0o = oooOO1;
        this.f46711Oooo0oO = function1;
    }

    @Override // com.yalla.yalla.util.netimage.listener.OooO00o
    public final void onSuccess(BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2 = bitmapDrawable;
        if (bitmapDrawable2 != null) {
            OooOO0 oooOO1 = this.f46710Oooo0o;
            Function1<OooOO0, Unit> function1 = this.f46711Oooo0oO;
            int width = bitmapDrawable2.getBitmap().getWidth();
            Bitmap bitmap = bitmapDrawable2.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            Bitmap bitmap2 = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap2);
            float f = width / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDrawable2.getBitmap(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, paint);
            Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
            oooOO1.OooO00o(bitmap2, "img_771");
            function1.invoke(oooOO1);
        }
    }
}
