package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import p101o000oOoo.oO00O0o;
import p101o000oOoo.oO0Oo0oo;
import p101o000oOoo.oO0OoOO0;

/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final String[] f9466o0OoOo0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final TypeEvaluator<Matrix> f9467ooOO = new OooO00o();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final Property<ImageView, Matrix> f9465o00O0O = new OooO0O0(Matrix.class);

    public class OooO00o implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class OooO0O0 extends Property<ImageView, Matrix> {
        public OooO0O0(Class cls) {
            super(cls, "animatedTransform");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            oO0OoOO0.OooO00o(imageView, matrix);
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f9468OooO00o;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f9468OooO00o = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9468OooO00o[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    @Override // androidx.transition.Transition
    public final void OooO0o(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    @Override // androidx.transition.Transition
    public final void OooOO0(@NonNull oO00O0o oo00o0o) {
        Oooo0o0(oo00o0o);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @Override // androidx.transition.Transition
    @Nullable
    public final Animator OooOOO(@NonNull ViewGroup viewGroup, @Nullable oO00O0o oo00o0o, @Nullable oO00O0o oo00o0o2) {
        if (oo00o0o == null || oo00o0o2 == null) {
            return null;
        }
        Rect rect = (Rect) oo00o0o.f29742OooO00o.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) oo00o0o2.f29742OooO00o.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) oo00o0o.f29742OooO00o.get("android:changeImageTransform:matrix");
        Object obj = (Matrix) oo00o0o2.f29742OooO00o.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && obj == null) || (matrix != null && matrix.equals(obj));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) oo00o0o2.f29743OooO0O0;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            Property<ImageView, Matrix> property = f9465o00O0O;
            TypeEvaluator<Matrix> typeEvaluator = f9467ooOO;
            oO0Oo0oo.OooO00o oooO00o = oO0Oo0oo.f29760OooO00o;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{oooO00o, oooO00o});
        }
        if (matrix == null) {
            matrix = oO0Oo0oo.f29760OooO00o;
        }
        if (obj == null) {
            obj = oO0Oo0oo.f29760OooO00o;
        }
        Property<ImageView, Matrix> property2 = f9465o00O0O;
        property2.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property2, (TypeEvaluator) new OooOO0O.OooO00o(), (Object[]) new Matrix[]{matrix, obj});
    }

    @Override // androidx.transition.Transition
    @NonNull
    public final String[] OooOo00() {
        return f9466o0OoOo0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void Oooo0o0(oO00O0o oo00o0o) {
        Matrix matrix;
        View view = oo00o0o.f29743OooO0O0;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = oo00o0o.f29742OooO00o;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                matrix = new Matrix(imageView.getImageMatrix());
            } else {
                int i = OooO0OO.f9468OooO00o[imageView.getScaleType().ordinal()];
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
