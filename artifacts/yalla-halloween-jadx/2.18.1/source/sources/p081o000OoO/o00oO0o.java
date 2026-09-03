package p081o000OoO;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00oO0o {
    public static boolean OooO(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean OooO00o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, boolean z) {
        return !OooO(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @ColorInt
    public static int OooO0O0(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i) {
        if (OooO(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    @Nullable
    public static ColorStateList OooO0OO(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) {
        if (!OooO(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal<TypedValue> threadLocal = Oooo0.f28329OooO00o;
        try {
            return Oooo0.OooO00o(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static o000oOoO OooO0Oo(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i) {
        o000oOoO o000ooooOooO00o;
        if (OooO(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new o000oOoO(null, null, typedValue.data);
            }
            try {
                o000ooooOooO00o = o000oOoO.OooO00o(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                o000ooooOooO00o = null;
            }
            if (o000ooooOooO00o != null) {
                return o000ooooOooO00o;
            }
        }
        return new o000oOoO(null, null, 0);
    }

    public static int OooO0o(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, int i2) {
        return !OooO(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static float OooO0o0(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, float f) {
        return !OooO(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    @AnyRes
    public static int OooO0oO(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @StyleableRes int i) {
        if (OooO(xmlPullParser, "interpolator")) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    @Nullable
    public static String OooO0oo(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i) {
        if (OooO(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    @NonNull
    public static TypedArray OooOO0(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
