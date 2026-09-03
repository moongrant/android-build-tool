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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f5435OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextPaint f5443OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f5444OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0 f5445OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final RectF f5432OooOO0o = new RectF();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f5434OooOOO0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f5433OooOOO = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f5436OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f5437OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f5438OooO0OO = -1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f5439OooO0Oo = -1.0f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f5441OooO0o0 = -1.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f5440OooO0o = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f5442OooO0oO = false;

    @RequiresApi(29)
    public static class OooO extends OooO0o {
        @Override // androidx.appcompat.widget.o00Ooo.OooO0o, androidx.appcompat.widget.o00Ooo.OooOO0
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.o00Ooo.OooOO0
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
        @Override // androidx.appcompat.widget.o00Ooo.OooOO0
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) o00Ooo.OooO0o0(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class OooOO0 {
        public void OooO00o(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean OooO0O0(TextView textView) {
            return ((Boolean) o00Ooo.OooO0o0(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public o00Ooo(@NonNull TextView textView) {
        this.f5435OooO = textView;
        this.f5444OooOO0 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f5445OooOO0O = new OooO();
        } else if (i >= 23) {
            this.f5445OooOO0O = new OooO0o();
        } else {
            this.f5445OooOO0O = new OooOO0();
        }
    }

    @Nullable
    public static Method OooO0Oo(@NonNull String str) {
        try {
            Method declaredMethod = f5434OooOOO0.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f5434OooOOO0.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static <T> T OooO0o0(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) OooO0Oo(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    public final boolean OooO() {
        return !(this.f5435OooO instanceof AppCompatEditText);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o() {
        if (OooO() && this.f5436OooO00o != 0) {
            if (this.f5437OooO0O0) {
                if (this.f5435OooO.getMeasuredHeight() <= 0 || this.f5435OooO.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f5445OooOO0O.OooO0O0(this.f5435OooO) ? 1048576 : (this.f5435OooO.getMeasuredWidth() - this.f5435OooO.getTotalPaddingLeft()) - this.f5435OooO.getTotalPaddingRight();
                int height = (this.f5435OooO.getHeight() - this.f5435OooO.getCompoundPaddingBottom()) - this.f5435OooO.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f5432OooOO0o;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fOooO0OO = OooO0OO(rectF);
                    if (fOooO0OO != this.f5435OooO.getTextSize()) {
                        OooO0o(0, fOooO0OO);
                    }
                }
            }
            this.f5437OooO0O0 = true;
        }
    }

    public final int[] OooO0O0(int[] iArr) {
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

    public final int OooO0OO(RectF rectF) {
        CharSequence transformation;
        int length = this.f5440OooO0o.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            int i5 = this.f5440OooO0o[i4];
            CharSequence text = this.f5435OooO.getText();
            TransformationMethod transformationMethod = this.f5435OooO.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f5435OooO)) != null) {
                text = transformation;
            }
            int i6 = Build.VERSION.SDK_INT;
            int iOooO0O0 = OooO00o.OooO0O0(this.f5435OooO);
            TextPaint textPaint = this.f5443OooO0oo;
            if (textPaint == null) {
                this.f5443OooO0oo = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f5443OooO0oo.set(this.f5435OooO.getPaint());
            this.f5443OooO0oo.setTextSize(i5);
            Layout.Alignment alignment = (Layout.Alignment) OooO0o0(this.f5435OooO, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            StaticLayout staticLayoutOooO00o = i6 >= 23 ? OooO0OO.OooO00o(text, alignment, iRound, iOooO0O0, this.f5435OooO, this.f5443OooO0oo, this.f5445OooOO0O) : OooO00o.OooO00o(text, alignment, iRound, this.f5435OooO, this.f5443OooO0oo);
            if ((iOooO0O0 == -1 || (staticLayoutOooO00o.getLineCount() <= iOooO0O0 && staticLayoutOooO00o.getLineEnd(staticLayoutOooO00o.getLineCount() - 1) == text.length())) && ((float) staticLayoutOooO00o.getHeight()) <= rectF.bottom) {
                int i7 = i4 + 1;
                i3 = i2;
                i2 = i7;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f5440OooO0o[i3];
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0o(int i, float f) {
        Context context = this.f5444OooOO0;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f5435OooO.getPaint().getTextSize()) {
            this.f5435OooO.getPaint().setTextSize(fApplyDimension);
            boolean zOooO00o = OooO0O0.OooO00o(this.f5435OooO);
            if (this.f5435OooO.getLayout() != null) {
                this.f5437OooO0O0 = false;
                try {
                    Method methodOooO0Oo = OooO0Oo("nullLayouts");
                    if (methodOooO0Oo != null) {
                        methodOooO0Oo.invoke(this.f5435OooO, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zOooO00o) {
                    this.f5435OooO.forceLayout();
                } else {
                    this.f5435OooO.requestLayout();
                }
                this.f5435OooO.invalidate();
            }
        }
    }

    public final boolean OooO0oO() {
        if (OooO() && this.f5436OooO00o == 1) {
            if (!this.f5442OooO0oO || this.f5440OooO0o.length == 0) {
                int iFloor = ((int) Math.floor((this.f5441OooO0o0 - this.f5439OooO0Oo) / this.f5438OooO0OO)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f5438OooO0OO) + this.f5439OooO0Oo);
                }
                this.f5440OooO0o = OooO0O0(iArr);
            }
            this.f5437OooO0O0 = true;
        } else {
            this.f5437OooO0O0 = false;
        }
        return this.f5437OooO0O0;
    }

    public final boolean OooO0oo() {
        int[] iArr = this.f5440OooO0o;
        int length = iArr.length;
        boolean z = length > 0;
        this.f5442OooO0oO = z;
        if (z) {
            this.f5436OooO00o = 1;
            this.f5439OooO0Oo = iArr[0];
            this.f5441OooO0o0 = iArr[length - 1];
            this.f5438OooO0OO = -1.0f;
        }
        return z;
    }

    public final void OooOO0(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f5436OooO00o = 1;
        this.f5439OooO0Oo = f;
        this.f5441OooO0o0 = f2;
        this.f5438OooO0OO = f3;
        this.f5442OooO0oO = false;
    }
}
