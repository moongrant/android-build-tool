package p158o00OoOO;

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
import p154o00Oo0oo.o0OO00O;
import p154o00Oo0oo.oo0o0Oo;
import p160o00OoOOO.o000000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 28)
public final class o00O0O implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000000 f38010OooO00o = o000000.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38011OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38012OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DecodeFormat f38013OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f38014OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DownsampleStrategy f38015OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final PreferredColorSpace f38016OooO0oO;

    public class OooO00o implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public o00O0O(int i, int i2, @NonNull oo0o0Oo oo0o0oo) {
        this.f38011OooO0O0 = i;
        this.f38012OooO0OO = i2;
        this.f38013OooO0Oo = (DecodeFormat) oo0o0oo.OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o.f13083OooO0o);
        this.f38015OooO0o0 = (DownsampleStrategy) oo0o0oo.OooO0OO(DownsampleStrategy.f13079OooO0o);
        o0OO00O<Boolean> o0oo00o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f13082OooO;
        this.f38014OooO0o = oo0o0oo.OooO0OO(o0oo00o2) != null && ((Boolean) oo0o0oo.OooO0OO(o0oo00o2)).booleanValue();
        this.f38016OooO0oO = (PreferredColorSpace) oo0o0oo.OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o.f13084OooO0oO);
    }

    public final void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        boolean z = false;
        if (this.f38010OooO00o.OooO0OO(this.f38011OooO0O0, this.f38012OooO0OO, this.f38014OooO0o, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f38013OooO0Oo == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new OooO00o());
        Size size = imageInfo.getSize();
        int width = this.f38011OooO0O0;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f38012OooO0OO;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fOooO0O0 = this.f38015OooO0o0.OooO0O0(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fOooO0O0);
        int iRound2 = Math.round(size.getHeight() * fOooO0O0);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fOooO0O0);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f38016OooO0oO;
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
