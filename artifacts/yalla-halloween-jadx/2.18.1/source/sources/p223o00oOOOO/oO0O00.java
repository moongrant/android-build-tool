package p223o00oOOOO;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000O;
import p217o00oO00o.o00000O0;
import p224o00oOOOo.oO0o0000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public abstract class oO0O00<T> implements o00000O0<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0o0000 f33791OooO00o = oO0o0000.OooO00o();

    public class OooO00o implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f33792OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f33793OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ boolean f33794OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ DecodeFormat f33795OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PreferredColorSpace f33796OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ DownsampleStrategy f33797OooO0o0;

        /* JADX INFO: renamed from: o00oOOOO.oO0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0352OooO00o implements ImageDecoder.OnPartialImageListener {
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public OooO00o(int i, int i2, boolean z, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f33792OooO00o = i;
            this.f33793OooO0O0 = i2;
            this.f33794OooO0OO = z;
            this.f33795OooO0Oo = decodeFormat;
            this.f33797OooO0o0 = downsampleStrategy;
            this.f33796OooO0o = preferredColorSpace;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (oO0O00.this.f33791OooO00o.OooO0O0(this.f33792OooO00o, this.f33793OooO0O0, this.f33794OooO0OO, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f33795OooO0Oo == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0352OooO00o());
            Size size = imageInfo.getSize();
            int width = this.f33792OooO00o;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f33793OooO0O0;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fOooO0O0 = this.f33797OooO0o0.OooO0O0(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fOooO0O0);
            int iRound2 = Math.round(size.getHeight() * fOooO0O0);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Resizing from [");
                sbOooO0o0.append(size.getWidth());
                sbOooO0o0.append("x");
                sbOooO0o0.append(size.getHeight());
                sbOooO0o0.append("] to [");
                sbOooO0o0.append(iRound);
                sbOooO0o0.append("x");
                sbOooO0o0.append(iRound2);
                sbOooO0o0.append("] scaleFactor: ");
                sbOooO0o0.append(fOooO0O0);
                Log.v("ImageDecoder", sbOooO0o0.toString());
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                if (i >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (this.f33796OooO0o == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }

    @Override // p217o00oO00o.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull ImageDecoder.Source source, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }

    public abstract o00OOOO0<T> OooO0OO(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // p217o00oO00o.o00000O0
    @Nullable
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public final o00OOOO0<T> OooO00o(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        DecodeFormat decodeFormat = (DecodeFormat) o00000Var.OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o.f12513OooO0o);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) o00000Var.OooO0OO(DownsampleStrategy.f12509OooO0o);
        o000000O<Boolean> o000000o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f12512OooO;
        return OooO0OO(source, i, i2, new OooO00o(i, i2, o00000Var.OooO0OO(o000000o2) != null && ((Boolean) o00000Var.OooO0OO(o000000o2)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) o00000Var.OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO00o.f12514OooO0oO)));
    }
}
