package p074o000O0oo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f28222OooO00o = new String[0];

    @RequiresApi(30)
    public static class OooO00o {
        public static void OooO00o(@NonNull EditorInfo editorInfo, CharSequence charSequence) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
        }
    }

    @NonNull
    public static String[] OooO00o(@NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f28222OooO00o;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f28222OooO00o;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f28222OooO00o;
    }

    public static boolean OooO0O0(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    public static void OooO0OO(@NonNull EditorInfo editorInfo, @Nullable String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void OooO0Oo(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            OooO00o.OooO00o(editorInfo, charSequence);
            return;
        }
        Objects.requireNonNull(charSequence);
        if (i >= 30) {
            OooO00o.OooO00o(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
        int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
        int length = charSequence.length();
        if (i4 < 0 || i5 > length) {
            OooO0o0(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            OooO0o0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            OooO0o0(editorInfo, charSequence, i4, i5);
            return;
        }
        int i7 = i5 - i4;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(charSequence.length() - i5, i9 - Math.min(i4, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i4, i9 - iMin);
        int i10 = i4 - iMin2;
        if (OooO0O0(charSequence, i10, 0)) {
            i10++;
            iMin2--;
        }
        if (OooO0O0(charSequence, (i5 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i5, iMin + i5)) : charSequence.subSequence(i10, iMin2 + i8 + iMin + i10);
        int i11 = iMin2 + 0;
        OooO0o0(editorInfo, charSequenceConcat, i11, i8 + i11);
    }

    public static void OooO0o0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
