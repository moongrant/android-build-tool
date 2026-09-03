package p137o00OO0oo;

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
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o00Oo0;
import io.agora.rtc.Constants;
import java.io.IOException;
import o00OO0O0.o00O0O;
import o00OO0OO.OooO0O0;
import o00OOO0.OooOOOO;
import o00OOO0O.OooO0OO;
import p133o00OO00o.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o0ooOOo f37384OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Rect f37385OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Rect f37386OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public o00O0O f37387OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public o00O0O f37388OooOooo;

    public o000oOoO(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f37384OooOoOO = new o0ooOOo(3);
        this.f37386OooOoo0 = new Rect();
        this.f37385OooOoo = new Rect();
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable OooO0OO oooO0OO, Object obj) {
        super.OooO0Oo(oooO0OO, obj);
        if (obj == o00Oo0.f12006Oooo0OO) {
            if (oooO0OO == null) {
                this.f37387OooOooO = null;
                return;
            } else {
                this.f37387OooOooO = new o00O0O(oooO0OO, null);
                return;
            }
        }
        if (obj == o00Oo0.f12009Oooo0oO) {
            if (oooO0OO == null) {
                this.f37388OooOooo = null;
            } else {
                this.f37388OooOooo = new o00O0O(oooO0OO, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        Bitmap bitmapOooOo00 = OooOo00();
        if (bitmapOooOo00 != null) {
            rectF.set(0.0f, 0.0f, OooOOOO.OooO0OO() * bitmapOooOo00.getWidth(), OooOOOO.OooO0OO() * bitmapOooOo00.getHeight());
            this.f11943OooOO0o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapOooOo00 = OooOo00();
        if (bitmapOooOo00 == null || bitmapOooOo00.isRecycled()) {
            return;
        }
        float fOooO0OO = OooOOOO.OooO0OO();
        o0ooOOo o0ooooo = this.f37384OooOoOO;
        o0ooooo.setAlpha(i);
        o00O0O o00o0o2 = this.f37387OooOooO;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = bitmapOooOo00.getWidth();
        int height = bitmapOooOo00.getHeight();
        Rect rect = this.f37386OooOoo0;
        rect.set(0, 0, width, height);
        int width2 = (int) (bitmapOooOo00.getWidth() * fOooO0OO);
        int height2 = (int) (bitmapOooOo00.getHeight() * fOooO0OO);
        Rect rect2 = this.f37385OooOoo;
        rect2.set(0, 0, width2, height2);
        canvas.drawBitmap(bitmapOooOo00, rect, rect2, o0ooooo);
        canvas.restore();
    }

    @Nullable
    public final Bitmap OooOo00() {
        OooO0O0 oooO0O0;
        Bitmap bitmap;
        o00O0O o00o0o2 = this.f37388OooOooo;
        if (o00o0o2 != null && (bitmap = (Bitmap) o00o0o2.OooO0o()) != null) {
            return bitmap;
        }
        String str = this.f11944OooOOO.f11915OooO0oO;
        LottieDrawable lottieDrawable = this.f11945OooOOO0;
        if (lottieDrawable.getCallback() == null) {
            oooO0O0 = null;
        } else {
            OooO0O0 oooO0O1 = lottieDrawable.f11768OooOO0o;
            if (oooO0O1 != null) {
                Drawable.Callback callback = lottieDrawable.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = oooO0O1.f37300OooO00o;
                if (!((context == null && context2 == null) || context2.equals(context))) {
                    lottieDrawable.f11768OooOO0o = null;
                }
            }
            if (lottieDrawable.f11768OooOO0o == null) {
                lottieDrawable.f11768OooOO0o = new OooO0O0(lottieDrawable.getCallback(), lottieDrawable.f11770OooOOO0, lottieDrawable.f11763OooO0o0.f11816OooO0Oo);
            }
            oooO0O0 = lottieDrawable.f11768OooOO0o;
        }
        if (oooO0O0 == null) {
            OooOO0 oooOO1 = lottieDrawable.f11763OooO0o0;
            com.airbnb.lottie.o000oOoO o000oooo2 = oooOO1 == null ? null : oooOO1.f11816OooO0Oo.get(str);
            if (o000oooo2 != null) {
                return o000oooo2.f11969OooO0Oo;
            }
            return null;
        }
        String str2 = oooO0O0.f37301OooO0O0;
        com.airbnb.lottie.o000oOoO o000oooo3 = oooO0O0.f37302OooO0OO.get(str);
        if (o000oooo3 == null) {
            return null;
        }
        Bitmap bitmap2 = o000oooo3.f11969OooO0Oo;
        if (bitmap2 != null) {
            return bitmap2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Constants.ERR_ALREADY_IN_RECORDING;
        String str3 = o000oooo3.f11968OooO0OO;
        if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                synchronized (OooO0O0.f37299OooO0Oo) {
                    oooO0O0.f37302OooO0OO.get(str).f11969OooO0Oo = bitmapDecodeByteArray;
                }
                return bitmapDecodeByteArray;
            } catch (IllegalArgumentException e) {
                o00OOO0.OooOO0.OooO0OO("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapOooO0o0 = OooOOOO.OooO0o0(BitmapFactory.decodeStream(oooO0O0.f37300OooO00o.getAssets().open(str2 + str3), null, options), o000oooo3.f11966OooO00o, o000oooo3.f11967OooO0O0);
                oooO0O0.OooO00o(bitmapOooO0o0, str);
                return bitmapOooO0o0;
            } catch (IllegalArgumentException e2) {
                o00OOO0.OooOO0.OooO0OO("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            o00OOO0.OooOO0.OooO0OO("Unable to open asset.", e3);
            return null;
        }
    }
}
