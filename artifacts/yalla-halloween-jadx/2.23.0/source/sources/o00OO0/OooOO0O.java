package o00OO0;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import o00OO0O0.o00Oo0;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 28)
public final class OooOO0O implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f37055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37056OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f37057OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DecodeFormat f37058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f37059OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DownsampleStrategy f37060OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final PreferredColorSpace f37061OooO0oO;

    public class OooO00o implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public OooOO0O(int i, int i2, @NonNull o00000 o00000Var) {
        if (o00Oo0.f37229OooOO0 == null) {
            synchronized (o00Oo0.class) {
                if (o00Oo0.f37229OooOO0 == null) {
                    o00Oo0.f37229OooOO0 = new o00Oo0();
                }
            }
        }
        this.f37055OooO00o = o00Oo0.f37229OooOO0;
        this.f37056OooO0O0 = i;
        this.f37057OooO0OO = i2;
        this.f37058OooO0Oo = (DecodeFormat) o00000Var.OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o.f9992OooO0o);
        this.f37060OooO0o0 = (DownsampleStrategy) o00000Var.OooO0OO(DownsampleStrategy.f9988OooO0o);
        o000000O<Boolean> o000000o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f9991OooO;
        this.f37059OooO0o = o00000Var.OooO0OO(o000000o2) != null && ((Boolean) o00000Var.OooO0OO(o000000o2)).booleanValue();
        this.f37061OooO0oO = (PreferredColorSpace) o00000Var.OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o.f9993OooO0oO);
    }

    public final void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        boolean z = false;
        if (this.f37055OooO00o.OooO00o(this.f37056OooO0O0, this.f37057OooO0OO, this.f37059OooO0o, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f37058OooO0Oo == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new OooO00o());
        Size size = imageInfo.getSize();
        int width = this.f37056OooO0O0;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f37057OooO0OO;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fOooO0O0 = this.f37060OooO0o0.OooO0O0(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fOooO0O0);
        int iRound2 = Math.round(size.getHeight() * fOooO0O0);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fOooO0O0);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f37061OooO0oO;
        if (preferredColorSpace != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                if (i >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }
}
