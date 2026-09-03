package p163o00OoOo0;

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
import p124o00O0o00.o0000O0;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;
import p158o00OoOO.o00O0O;
import p174o00OooOo.o00O0;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<ImageHeaderParser> f38099OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f38100OooO0O0;

    public static final class OooO00o implements o00oOoo<Drawable> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AnimatedImageDrawable f38101OooO0Oo;

        public OooO00o(AnimatedImageDrawable animatedImageDrawable) {
            this.f38101OooO0Oo = animatedImageDrawable;
        }

        @Override // p144o00Oo.o00oOoo
        public final void OooO00o() {
            AnimatedImageDrawable animatedImageDrawable = this.f38101OooO0Oo;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // p144o00Oo.o00oOoo
        @NonNull
        public final Class<Drawable> OooO0OO() {
            return Drawable.class;
        }

        @Override // p144o00Oo.o00oOoo
        @NonNull
        public final Drawable get() {
            return this.f38101OooO0Oo;
        }

        @Override // p144o00Oo.o00oOoo
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.f38101OooO0Oo;
            int intrinsicHeight = animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            char[] cArr = o00OO0O0.f38351OooO00o;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i = o00OO0O0.OooO00o.f38354OooO00o[config.ordinal()];
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

    public static final class OooO0O0 implements o0O0O00<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00oO0o f38102OooO00o;

        public OooO0O0(o00oO0o o00oo0o2) {
            this.f38102OooO00o = o00oo0o2;
        }

        @Override // p154o00Oo0oo.o0O0O00
        public final boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull oo0o0Oo oo0o0oo) throws IOException {
            ImageHeaderParser.ImageType imageTypeOooO0O0 = com.bumptech.glide.load.OooO00o.OooO0O0(this.f38102OooO00o.f38099OooO00o, byteBuffer);
            return imageTypeOooO0O0 == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeOooO0O0 == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }

        @Override // p154o00Oo0oo.o0O0O00
        public final o00oOoo<Drawable> OooO0O0(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(byteBuffer);
            this.f38102OooO00o.getClass();
            return o00oO0o.OooO00o(sourceCreateSource, i, i2, oo0o0oo);
        }
    }

    public static final class OooO0OO implements o0O0O00<InputStream, Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00oO0o f38103OooO00o;

        public OooO0OO(o00oO0o o00oo0o2) {
            this.f38103OooO00o = o00oo0o2;
        }

        @Override // p154o00Oo0oo.o0O0O00
        public final boolean OooO00o(@NonNull InputStream inputStream, @NonNull oo0o0Oo oo0o0oo) throws IOException {
            o00oO0o o00oo0o2 = this.f38103OooO00o;
            ImageHeaderParser.ImageType imageTypeOooO0OO = com.bumptech.glide.load.OooO00o.OooO0OO(o00oo0o2.f38100OooO0O0, inputStream, o00oo0o2.f38099OooO00o);
            return imageTypeOooO0OO == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeOooO0OO == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }

        @Override // p154o00Oo0oo.o0O0O00
        public final o00oOoo<Drawable> OooO0O0(@NonNull InputStream inputStream, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(o00O0.OooO0O0(inputStream));
            this.f38103OooO00o.getClass();
            return o00oO0o.OooO00o(sourceCreateSource, i, i2, oo0o0oo);
        }
    }

    public o00oO0o(ArrayList arrayList, OooO0o oooO0o) {
        this.f38099OooO00o = arrayList;
        this.f38100OooO0O0 = oooO0o;
    }

    public static OooO00o OooO00o(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new o00O0O(i, i2, oo0o0oo));
        if (o0OoOo0.OooO00o(drawableDecodeDrawable)) {
            return new OooO00o(o0000O0.OooO00o(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
