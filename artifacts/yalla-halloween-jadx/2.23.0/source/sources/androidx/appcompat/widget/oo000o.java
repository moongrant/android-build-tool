package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final RectF f3361OooOO0o = new RectF();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> f3362OooOOO0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f3363OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextPaint f3371OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f3372OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0o f3373OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f3364OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f3365OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f3366OooO0OO = -1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f3367OooO0Oo = -1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f3369OooO0o0 = -1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f3368OooO0o = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f3370OooO0oO = false;

    @RequiresApi(29)
    public static class OooO extends OooO0o {
        @Override // androidx.appcompat.widget.oo000o.OooO0o, androidx.appcompat.widget.oo000o.OooOO0
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.oo000o.OooOO0
        public boolean OooO0O0(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    @RequiresApi(16)
    public static final class OooO00o {
        @NonNull
        @DoNotInline
        public static StaticLayout OooO00o(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, @NonNull TextView textView, @NonNull TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @DoNotInline
        public static int OooO0O0(@NonNull TextView textView) {
            return textView.getMaxLines();
        }
    }

    @RequiresApi(18)
    public static final class OooO0O0 {
        @DoNotInline
        public static boolean OooO00o(@NonNull View view) {
            return view.isInLayout();
        }
    }

    @RequiresApi(23)
    public static final class OooO0OO {
        @NonNull
        @DoNotInline
        public static StaticLayout OooO00o(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull OooOO0 oooOO1) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                oooOO1.OooO00o(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    @RequiresApi(23)
    public static class OooO0o extends OooOO0 {
        @Override // androidx.appcompat.widget.oo000o.OooOO0
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) oo000o.OooO0o0("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class OooOO0 {
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean OooO0O0(TextView textView) {
            return ((Boolean) oo000o.OooO0o0("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public oo000o(@NonNull TextView textView) {
        this.f3363OooO = textView;
        this.f3372OooOO0 = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3373OooOO0O = new OooO();
        } else {
            this.f3373OooOO0O = new OooO0o();
        }
    }

    public static int[] OooO0O0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    @Nullable
    public static Method OooO0Oo(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f3362OooOOO0;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object OooO0o0(@NonNull String str, @NonNull Object obj, @NonNull Object obj2) {
        try {
            return OooO0Oo(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final boolean OooO() {
        return !(this.f3363OooO instanceof AppCompatEditText);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o() {
        if (OooO() && this.f3364OooO00o != 0) {
            if (this.f3365OooO0O0) {
                if (this.f3363OooO.getMeasuredHeight() <= 0 || this.f3363OooO.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3373OooOO0O.OooO0O0(this.f3363OooO) ? ZegoConstants.ErrorMask.RoomServerErrorMask : (this.f3363OooO.getMeasuredWidth() - this.f3363OooO.getTotalPaddingLeft()) - this.f3363OooO.getTotalPaddingRight();
                int height = (this.f3363OooO.getHeight() - this.f3363OooO.getCompoundPaddingBottom()) - this.f3363OooO.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3361OooOO0o;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fOooO0OO = OooO0OO(rectF);
                    if (fOooO0OO != this.f3363OooO.getTextSize()) {
                        OooO0o(fOooO0OO, 0);
                    }
                }
            }
            this.f3365OooO0O0 = true;
        }
    }

    public final int OooO0OO(RectF rectF) {
        CharSequence transformation;
        int length = this.f3368OooO0o.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f3368OooO0o[i4];
            TextView textView = this.f3363OooO;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int iOooO0O0 = OooO00o.OooO0O0(textView);
            TextPaint textPaint = this.f3371OooO0oo;
            if (textPaint == null) {
                this.f3371OooO0oo = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3371OooO0oo.set(textView.getPaint());
            this.f3371OooO0oo.setTextSize(i5);
            StaticLayout staticLayoutOooO00o = OooO0OO.OooO00o(text, (Layout.Alignment) OooO0o0("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iOooO0O0, this.f3363OooO, this.f3371OooO0oo, this.f3373OooOO0O);
            if ((iOooO0O0 == -1 || (staticLayoutOooO00o.getLineCount() <= iOooO0O0 && staticLayoutOooO00o.getLineEnd(staticLayoutOooO00o.getLineCount() - 1) == text.length())) && ((float) staticLayoutOooO00o.getHeight()) <= rectF.bottom) {
                int i6 = i4 + 1;
                i3 = i2;
                i2 = i6;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f3368OooO0o[i3];
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0o(float f, int i) {
        Context context = this.f3372OooOO0;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3363OooO;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zOooO00o = OooO0O0.OooO00o(textView);
            if (textView.getLayout() != null) {
                this.f3365OooO0O0 = false;
                try {
                    Method methodOooO0Oo = OooO0Oo("nullLayouts");
                    if (methodOooO0Oo != null) {
                        methodOooO0Oo.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zOooO00o) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean OooO0oO() {
        if (OooO() && this.f3364OooO00o == 1) {
            if (!this.f3370OooO0oO || this.f3368OooO0o.length == 0) {
                int iFloor = ((int) Math.floor((this.f3369OooO0o0 - this.f3367OooO0Oo) / this.f3366OooO0OO)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f3366OooO0OO) + this.f3367OooO0Oo);
                }
                this.f3368OooO0o = OooO0O0(iArr);
            }
            this.f3365OooO0O0 = true;
        } else {
            this.f3365OooO0O0 = false;
        }
        return this.f3365OooO0O0;
    }

    public final boolean OooO0oo() {
        int[] iArr = this.f3368OooO0o;
        int length = iArr.length;
        boolean z = length > 0;
        this.f3370OooO0oO = z;
        if (z) {
            this.f3364OooO00o = 1;
            this.f3367OooO0Oo = iArr[0];
            this.f3369OooO0o0 = iArr[length - 1];
            this.f3366OooO0OO = -1.0f;
        }
        return z;
    }

    public final void OooOO0(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f3364OooO00o = 1;
        this.f3367OooO0Oo = f;
        this.f3369OooO0o0 = f2;
        this.f3366OooO0OO = f3;
        this.f3370OooO0oO = false;
    }
}
