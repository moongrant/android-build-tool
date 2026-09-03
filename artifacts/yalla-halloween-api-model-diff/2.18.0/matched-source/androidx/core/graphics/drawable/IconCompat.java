package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final PorterDuff.Mode f7852OooOO0O = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f7853OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f7854OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f7855OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] f7856OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable f7857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f7858OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f7859OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList f7860OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PorterDuff.Mode f7861OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String f7862OooOO0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    @RequiresApi(23)
    public static class OooO00o {
        @DrawableRes
        @IdRes
        public static int OooO00o(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return OooO0OO.OooO00o(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        @Nullable
        public static String OooO0O0(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return OooO0OO.OooO0O0(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        public static int OooO0OO(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return OooO0OO.OooO0OO(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        public static Uri OooO0Oo(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return OooO0OO.OooO0Oo(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        @DoNotInline
        public static Icon OooO0o(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            String strOooO0O0;
            InputStream inputStreamOpenInputStream;
            int i = iconCompat.f7854OooO00o;
            switch (i) {
                case -1:
                    return (Icon) iconCompat.f7855OooO0O0;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f7855OooO0O0);
                    break;
                case 2:
                    if (i == -1 && Build.VERSION.SDK_INT >= 23) {
                        strOooO0O0 = OooO0O0(iconCompat.f7855OooO0O0);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("called getResPackage() on " + iconCompat);
                        }
                        String str = iconCompat.f7862OooOO0;
                        strOooO0O0 = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f7855OooO0O0).split(CertificateUtil.DELIMITER, -1)[0] : iconCompat.f7862OooOO0;
                    }
                    iconCreateWithBitmap = Icon.createWithResource(strOooO0O0, iconCompat.f7859OooO0o0);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f7855OooO0O0, iconCompat.f7859OooO0o0, iconCompat.f7858OooO0o);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f7855OooO0O0);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.OooO00o((Bitmap) iconCompat.f7855OooO0O0, false)) : OooO0O0.OooO0O0((Bitmap) iconCompat.f7855OooO0O0);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = OooO0o.OooO00o(iconCompat.OooO0Oo());
                    } else {
                        if (context == null) {
                            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Context is required to resolve the file uri of the icon: ");
                            sbOooO0O0.append(iconCompat.OooO0Oo());
                            throw new IllegalArgumentException(sbOooO0O0.toString());
                        }
                        Uri uriOooO0Oo = iconCompat.OooO0Oo();
                        String scheme = uriOooO0Oo.getScheme();
                        if ("content".equals(scheme) || ShareInternalUtility.STAGING_PARAM.equals(scheme)) {
                            try {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriOooO0Oo);
                            } catch (Exception e) {
                                Log.w("IconCompat", "Unable to load image from URI: " + uriOooO0Oo, e);
                                inputStreamOpenInputStream = null;
                            }
                        } else {
                            try {
                                inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f7855OooO0O0));
                            } catch (FileNotFoundException e2) {
                                Log.w("IconCompat", "Unable to load image from path: " + uriOooO0Oo, e2);
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream == null) {
                            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Cannot load adaptive icon from uri: ");
                            sbOooO0O1.append(iconCompat.OooO0Oo());
                            throw new IllegalStateException(sbOooO0O1.toString());
                        }
                        if (Build.VERSION.SDK_INT < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.OooO00o(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                        } else {
                            iconCreateWithBitmap = OooO0O0.OooO0O0(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f7860OooO0oO;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f7861OooO0oo;
            if (mode != IconCompat.f7852OooOO0O) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        @DoNotInline
        public static Drawable OooO0o0(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }
    }

    @RequiresApi(26)
    public static class OooO0O0 {
        @DoNotInline
        public static Drawable OooO00o(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        public static Icon OooO0O0(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi(28)
    public static class OooO0OO {
        @DoNotInline
        public static int OooO00o(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        public static String OooO0O0(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        public static int OooO0OO(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        public static Uri OooO0Oo(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @RequiresApi(30)
    public static class OooO0o {
        @DoNotInline
        public static Icon OooO00o(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f7854OooO00o = -1;
        this.f7856OooO0OO = null;
        this.f7857OooO0Oo = null;
        this.f7859OooO0o0 = 0;
        this.f7858OooO0o = 0;
        this.f7860OooO0oO = null;
        this.f7861OooO0oo = f7852OooOO0O;
        this.f7853OooO = null;
    }

    @VisibleForTesting
    public static Bitmap OooO00o(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat OooO0O0(@NonNull String str, @DrawableRes int i) {
        Objects.requireNonNull(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f7859OooO0o0 = i;
        iconCompat.f7855OooO0O0 = str;
        iconCompat.f7862OooOO0 = str;
        return iconCompat;
    }

    @DrawableRes
    public final int OooO0OO() {
        int i = this.f7854OooO00o;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return OooO00o.OooO00o(this.f7855OooO0O0);
        }
        if (i == 2) {
            return this.f7859OooO0o0;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public final Uri OooO0Oo() {
        int i = this.f7854OooO00o;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return OooO00o.OooO0Oo(this.f7855OooO0O0);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f7855OooO0O0);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @NonNull
    @RequiresApi(23)
    @Deprecated
    public final Icon OooO0o0() {
        if (Build.VERSION.SDK_INT >= 23) {
            return OooO00o.OooO0o(this, null);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    @NonNull
    public final String toString() {
        String str;
        if (this.f7854OooO00o == -1) {
            return String.valueOf(this.f7855OooO0O0);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f7854OooO00o) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f7854OooO00o) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f7855OooO0O0).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f7855OooO0O0).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f7862OooOO0);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(OooO0OO())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f7859OooO0o0);
                if (this.f7858OooO0o != 0) {
                    sb.append(" off=");
                    sb.append(this.f7858OooO0o);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f7855OooO0O0);
                break;
        }
        if (this.f7860OooO0oO != null) {
            sb.append(" tint=");
            sb.append(this.f7860OooO0oO);
        }
        if (this.f7861OooO0oo != f7852OooOO0O) {
            sb.append(" mode=");
            sb.append(this.f7861OooO0oo);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f7856OooO0OO = null;
        this.f7857OooO0Oo = null;
        this.f7859OooO0o0 = 0;
        this.f7858OooO0o = 0;
        this.f7860OooO0oO = null;
        this.f7861OooO0oo = f7852OooOO0O;
        this.f7853OooO = null;
        this.f7854OooO00o = i;
    }
}
