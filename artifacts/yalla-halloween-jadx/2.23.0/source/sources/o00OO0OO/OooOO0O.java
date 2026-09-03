package o00OO0OO;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p103o000oo00.o000OO;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o0000oo;
import p532o0o0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<ImageHeaderParser> f37254OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f37255OooO0O0;

    public static final class OooO00o implements p127o00O0oo.o0000<Drawable> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AnimatedImageDrawable f37256OooO0Oo;

        public OooO00o(AnimatedImageDrawable animatedImageDrawable) {
            this.f37256OooO0Oo = animatedImageDrawable;
        }

        @Override // p127o00O0oo.o0000
        public final void OooO00o() {
            AnimatedImageDrawable animatedImageDrawable = this.f37256OooO0Oo;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // p127o00O0oo.o0000
        @NonNull
        public final Class<Drawable> OooO0O0() {
            return Drawable.class;
        }

        @Override // p127o00O0oo.o0000
        @NonNull
        public final Drawable get() {
            return this.f37256OooO0Oo;
        }

        @Override // p127o00O0oo.o0000
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.f37256OooO0Oo;
            int intrinsicHeight = animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            char[] cArr = o0000oo.f54571OooO00o;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i = o0000oo.OooO00o.f54574OooO00o[config.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    i2 = 2;
                } else {
                    i2 = 4;
                    if (i == 4) {
                        i2 = 8;
                    }
                }
            }
            return i2 * intrinsicHeight * 2;
        }
    }

    public static final class OooO0O0 implements o00000O0<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0O f37257OooO00o;

        public OooO0O0(OooOO0O oooOO0O) {
            this.f37257OooO00o = oooOO0O;
        }

        @Override // p126o00O0oOo.o00000O0
        public final p127o00O0oo.o0000<Drawable> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(byteBuffer);
            this.f37257OooO00o.getClass();
            return OooOO0O.OooO00o(sourceCreateSource, i, i2, o00000Var);
        }

        @Override // p126o00O0oOo.o00000O0
        public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull o00000 o00000Var) throws IOException {
            ImageHeaderParser.ImageType imageTypeOooO0O0 = com.bumptech.glide.load.OooO00o.OooO0O0(this.f37257OooO00o.f37254OooO00o, byteBuffer);
            return imageTypeOooO0O0 == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeOooO0O0 == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }
    }

    public static final class OooO0OO implements o00000O0<InputStream, Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0O f37258OooO00o;

        public OooO0OO(OooOO0O oooOO0O) {
            this.f37258OooO00o = oooOO0O;
        }

        @Override // p126o00O0oOo.o00000O0
        public final p127o00O0oo.o0000<Drawable> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(oo0o0Oo.OooO0O0(inputStream));
            this.f37258OooO00o.getClass();
            return OooOO0O.OooO00o(sourceCreateSource, i, i2, o00000Var);
        }

        @Override // p126o00O0oOo.o00000O0
        public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull o00000 o00000Var) throws IOException {
            OooOO0O oooOO0O = this.f37258OooO00o;
            ImageHeaderParser.ImageType imageTypeOooO0OO = com.bumptech.glide.load.OooO00o.OooO0OO(oooOO0O.f37255OooO0O0, inputStream, oooOO0O.f37254OooO00o);
            return imageTypeOooO0OO == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeOooO0OO == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }
    }

    public OooOO0O(ArrayList arrayList, o0000 o0000Var) {
        this.f37254OooO00o = arrayList;
        this.f37255OooO0O0 = o0000Var;
    }

    public static OooO00o OooO00o(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new o00OO0.OooOO0O(i, i2, o00000Var));
        if (o00OO0OO.OooO0O0.OooO00o(drawableDecodeDrawable)) {
            return new OooO00o(o000OO.OooO00o(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
