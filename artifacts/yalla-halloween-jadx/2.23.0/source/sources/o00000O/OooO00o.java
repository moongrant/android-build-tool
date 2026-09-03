package o00000O;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.os.BuildCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.ULong;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends ContextCompat {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f33927OooO0OO = 0;

    @RequiresApi(32)
    public static class OooO {
        @DoNotInline
        public static boolean OooO00o(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: o00000O.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(16)
    public static class C0392OooO00o {
        @DoNotInline
        public static void OooO00o(Activity activity) {
            activity.finishAffinity();
        }

        @DoNotInline
        public static void OooO0O0(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        @DoNotInline
        public static void OooO0OO(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    @RequiresApi(21)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(Activity activity) {
            activity.finishAfterTransition();
        }

        @DoNotInline
        public static void OooO0O0(Activity activity) {
            activity.postponeEnterTransition();
        }

        @DoNotInline
        public static void OooO0OO(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        public static void OooO0Oo(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @DoNotInline
        public static void OooO0o0(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @RequiresApi(23)
    public static class OooO0OO {
        @DoNotInline
        public static void OooO00o(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @DoNotInline
        public static void OooO0O0(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        @DoNotInline
        public static boolean OooO0OO(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RequiresApi(31)
    public static class OooO0o {
        @DoNotInline
        public static boolean OooO00o(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @DoNotInline
        @SuppressLint({"BanUncheckedReflection"})
        public static boolean OooO0O0(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooOO0 {
        void validateRequestPermissionsRequestCode(int i);
    }

    @RequiresApi(21)
    public static class OooOO0O extends SharedElementCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0o0Oo f33928OooO00o;

        public OooOO0O(oo0o0Oo oo0o0oo) {
            this.f33928OooO00o = oo0o0oo;
        }

        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap bitmapCreateBitmap;
            Bitmap bitmap;
            oo0o0Oo oo0o0oo = this.f33928OooO00o;
            oo0o0oo.getClass();
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        bitmap = null;
                    } else {
                        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                        } else {
                            int i = (int) (intrinsicWidth * fMin);
                            int i2 = (int) (intrinsicHeight * fMin);
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                            bitmap = bitmapCreateBitmap2;
                        }
                    }
                    if (bitmap != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                            return bundle;
                        }
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        return bundle;
                    }
                }
            }
            int iRound = Math.round(rectF.width());
            int iRound2 = Math.round(rectF.height());
            if (iRound <= 0 || iRound2 <= 0) {
                bitmapCreateBitmap = null;
            } else {
                float fMin2 = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
                int i7 = (int) (iRound * fMin2);
                int i8 = (int) (iRound2 * fMin2);
                if (oo0o0oo.f33983OooO00o == null) {
                    oo0o0oo.f33983OooO00o = new Matrix();
                }
                oo0o0oo.f33983OooO00o.set(matrix);
                oo0o0oo.f33983OooO00o.postTranslate(-rectF.left, -rectF.top);
                oo0o0oo.f33983OooO00o.postScale(fMin2, fMin2);
                bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                canvas2.concat(oo0o0oo.f33983OooO00o);
                view.draw(canvas2);
            }
            return bitmapCreateBitmap;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.f33928OooO00o.getClass();
            if (!(parcelable instanceof Bundle)) {
                if (!(parcelable instanceof Bitmap)) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap((Bitmap) parcelable);
                return imageView;
            }
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmap);
            imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView2.getScaleType() != ImageView.ScaleType.MATRIX) {
                return imageView2;
            }
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
            return imageView2;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f33928OooO00o.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            this.f33928OooO00o.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f33928OooO00o.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f33928OooO00o.getClass();
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f33928OooO00o.getClass();
            OooO0OO.OooO00o(onSharedElementsReadyListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static void OooO0Oo(@NonNull ComponentActivity componentActivity, @NonNull String[] strArr, @IntRange(from = ULong.MIN_VALUE) int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException(o0O00o0.OooO0O0(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (!BuildCompat.OooO0OO() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (componentActivity instanceof OooOO0) {
            ((OooOO0) componentActivity).validateRequestPermissionsRequestCode(i);
        }
        OooO0OO.OooO0O0(componentActivity, strArr, i);
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public static boolean OooO0o0(@NonNull Activity activity, @NonNull String str) {
        if (!BuildCompat.OooO0OO() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return OooO.OooO00o(activity, str);
        }
        return i == 31 ? OooO0o.OooO0O0(activity, str) : OooO0OO.OooO0OO(activity, str);
    }
}
