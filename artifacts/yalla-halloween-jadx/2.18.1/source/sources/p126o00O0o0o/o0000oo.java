package p126o00O0o0o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.OooO0O0;
import com.airbnb.lottie.OooOo;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.io.IOException;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.o0OOO0o;
import p124o00O0o00.OooO;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;
import p131o00O0oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Rect f31052OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final oo0oOO0.OooO00o f31053OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Rect f31054OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public OooOO0O<ColorFilter, ColorFilter> f31055OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public OooOO0O<Bitmap, Bitmap> f31056Oooo000;

    public o0000oo(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f31053OooOoo0 = new oo0oOO0.OooO00o(3);
        this.f31052OooOoo = new Rect();
        this.f31054OooOooO = new Rect();
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        Bitmap bitmapOooOo0o = OooOo0o();
        if (bitmapOooOo0o != null) {
            rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o000O0Oo.OooO0OO() * bitmapOooOo0o.getWidth(), o000O0Oo.OooO0OO() * bitmapOooOo0o.getHeight());
            this.f10176OooOOO0.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        super.OooO0o0(t, o000000o2);
        if (t == o000oOoO.f10234Oooo0OO) {
            if (o000000o2 == null) {
                this.f31055OooOooo = null;
                return;
            } else {
                this.f31055OooOooo = new o0OOO0o(o000000o2, null);
                return;
            }
        }
        if (t == o000oOoO.f10237Oooo0oO) {
            if (o000000o2 == null) {
                this.f31056Oooo000 = null;
            } else {
                this.f31056Oooo000 = new o0OOO0o(o000000o2, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapOooOo0o = OooOo0o();
        if (bitmapOooOo0o == null || bitmapOooOo0o.isRecycled()) {
            return;
        }
        float fOooO0OO = o000O0Oo.OooO0OO();
        this.f31053OooOoo0.setAlpha(i);
        OooOO0O<ColorFilter, ColorFilter> oooOO0O = this.f31055OooOooo;
        if (oooOO0O != null) {
            this.f31053OooOoo0.setColorFilter(oooOO0O.OooO0o());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f31052OooOoo.set(0, 0, bitmapOooOo0o.getWidth(), bitmapOooOo0o.getHeight());
        this.f31054OooOooO.set(0, 0, (int) (bitmapOooOo0o.getWidth() * fOooO0OO), (int) (bitmapOooOo0o.getHeight() * fOooO0OO));
        canvas.drawBitmap(bitmapOooOo0o, this.f31052OooOoo, this.f31054OooOooO, this.f31053OooOoo0);
        canvas.restore();
    }

    @Nullable
    public final Bitmap OooOo0o() {
        OooO oooO;
        Bitmap bitmapOooO0o;
        OooOO0O<Bitmap, Bitmap> oooOO0O = this.f31056Oooo000;
        if (oooOO0O != null && (bitmapOooO0o = oooOO0O.OooO0o()) != null) {
            return bitmapOooO0o;
        }
        String str = this.f10177OooOOOO.f10146OooO0oO;
        LottieDrawable lottieDrawable = this.f10175OooOOO;
        if (lottieDrawable.getCallback() == null) {
            oooO = null;
        } else {
            OooO oooO2 = lottieDrawable.f10003o000oOoO;
            if (oooO2 != null) {
                Drawable.Callback callback = lottieDrawable.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if (!((context == null && oooO2.f30977OooO00o == null) || oooO2.f30977OooO00o.equals(context))) {
                    lottieDrawable.f10003o000oOoO = null;
                }
            }
            if (lottieDrawable.f10003o000oOoO == null) {
                lottieDrawable.f10003o000oOoO = new OooO(lottieDrawable.getCallback(), lottieDrawable.f9992OoooOOO, lottieDrawable.f9993OoooOOo, lottieDrawable.f9985Oooo0oO.f10044OooO0Oo);
            }
            oooO = lottieDrawable.f10003o000oOoO;
        }
        if (oooO == null) {
            com.airbnb.lottie.OooOO0O oooOO0O2 = lottieDrawable.f9985Oooo0oO;
            OooOo oooOo = oooOO0O2 == null ? null : oooOO0O2.f10044OooO0Oo.get(str);
            if (oooOo != null) {
                return oooOo.f10077OooO0Oo;
            }
            return null;
        }
        OooOo oooOo2 = oooO.f30980OooO0Oo.get(str);
        if (oooOo2 == null) {
            return null;
        }
        Bitmap bitmap = oooOo2.f10077OooO0Oo;
        if (bitmap != null) {
            return bitmap;
        }
        OooO0O0 oooO0O0 = oooO.f30979OooO0OO;
        if (oooO0O0 != null) {
            Bitmap bitmapOooO00o = oooO0O0.OooO00o();
            if (bitmapOooO00o == null) {
                return bitmapOooO00o;
            }
            oooO.OooO00o(str, bitmapOooO00o);
            return bitmapOooO00o;
        }
        String str2 = oooOo2.f10076OooO0OO;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Constants.ERR_ALREADY_IN_RECORDING;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                oooO.OooO00o(str, bitmapDecodeByteArray);
                return bitmapDecodeByteArray;
            } catch (IllegalArgumentException e) {
                o000Oo0.OooO0Oo("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(oooO.f30978OooO0O0)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapOooO0o0 = o000O0Oo.OooO0o0(BitmapFactory.decodeStream(oooO.f30977OooO00o.getAssets().open(oooO.f30978OooO0O0 + str2), null, options), oooOo2.f10074OooO00o, oooOo2.f10075OooO0O0);
                oooO.OooO00o(str, bitmapOooO0o0);
                return bitmapOooO0o0;
            } catch (IllegalArgumentException e2) {
                o000Oo0.OooO0Oo("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            o000Oo0.OooO0Oo("Unable to open asset.", e3);
            return null;
        }
    }
}
