package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o00oO0o;
import p078o000Oo0O.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String[] f8114OooOoo0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO00o f8113OooOoo = new OooO00o();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO0O0 f8115OooOooO = new OooO0O0();

    public class OooO00o implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class OooO0O0 extends Property<ImageView, Matrix> {
        public OooO0O0() {
            super(Matrix.class, "animatedTransform");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView2.animateTransform(matrix2);
                return;
            }
            if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                    imageView2.invalidate();
                    return;
                }
                return;
            }
            if (o00oO0o.f34973OooO00o) {
                try {
                    imageView2.animateTransform(matrix2);
                } catch (NoSuchMethodError unused) {
                    o00oO0o.f34973OooO00o = false;
                }
            }
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8116OooO00o;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f8116OooO00o = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8116OooO00o[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    @Override // androidx.transition.Transition
    public final void OooO(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull o00000O0 o00000o1) {
        Oooo0o0(o00000o1);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO0(@NonNull ViewGroup viewGroup, @Nullable o00000O0 o00000o1, @Nullable o00000O0 o00000o2) {
        if (o00000o1 == null || o00000o2 == null) {
            return null;
        }
        HashMap map = o00000o1.f34936OooO00o;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        HashMap map2 = o00000o2.f34936OooO00o;
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) o00000o2.f34937OooO0O0;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        OooO0O0 oooO0O0 = f8115OooOooO;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            OooO00o oooO00o = f8113OooOoo;
            o0ooOOo.OooO00o oooO00o2 = o0ooOOo.f34984OooO00o;
            return ObjectAnimator.ofObject(imageView, oooO0O0, oooO00o, oooO00o2, oooO00o2);
        }
        if (matrix == null) {
            matrix = o0ooOOo.f34984OooO00o;
        }
        if (matrix2 == null) {
            matrix2 = o0ooOOo.f34984OooO00o;
        }
        oooO0O0.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, oooO0O0, new OooOOO.OooO00o(), matrix, matrix2);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOOoo() {
        return f8114OooOoo0;
    }

    public final void Oooo0o0(o00000O0 o00000o1) {
        Matrix matrix;
        View view = o00000o1.f34937OooO0O0;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = o00000o1.f34936OooO00o;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i = OooO0OO.f8116OooO00o[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i != 2) {
                    matrix = new Matrix(imageView.getImageMatrix());
                } else {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f2 = intrinsicHeight;
                    float fMax = Math.max(width / f, height / f2);
                    int iRound = Math.round((width - (f * fMax)) / 2.0f);
                    int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                    Matrix matrix3 = new Matrix();
                    matrix3.postScale(fMax, fMax);
                    matrix3.postTranslate(iRound, iRound2);
                    matrix = matrix3;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    public ChangeImageTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
