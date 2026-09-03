package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final EmojiCompat.OooOOOO f5620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0OoOo0 f5621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EmojiCompat.OooO f5622OooO0OO;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f5623OooO00o = 1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0OoOo0.OooO00o f5624OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0OoOo0.OooO00o f5625OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0OoOo0.OooO00o f5626OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5627OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f5628OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f5629OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int[] f5630OooO0oo;

        public OooO(o0OoOo0.OooO00o oooO00o, boolean z, int[] iArr) {
            this.f5624OooO0O0 = oooO00o;
            this.f5625OooO0OO = oooO00o;
            this.f5629OooO0oO = z;
            this.f5630OooO0oo = iArr;
        }

        public final void OooO00o() {
            this.f5623OooO00o = 1;
            this.f5625OooO0OO = this.f5624OooO0O0;
            this.f5627OooO0o = 0;
        }

        public final boolean OooO0O0() {
            int[] iArr;
            p060o0000o0.o0OoOo0 o0oooo0OooO0OO = this.f5625OooO0OO.f5664OooO0O0.OooO0OO();
            int iOooO00o = o0oooo0OooO0OO.OooO00o(6);
            if ((iOooO00o == 0 || o0oooo0OooO0OO.f34261OooO0O0.get(iOooO00o + o0oooo0OooO0OO.f34260OooO00o) == 0) ? false : true) {
                return true;
            }
            if (this.f5628OooO0o0 == 65039) {
                return true;
            }
            return this.f5629OooO0oO && ((iArr = this.f5630OooO0oo) == null || Arrays.binarySearch(iArr, this.f5625OooO0OO.f5664OooO0O0.OooO00o(0)) < 0);
        }
    }

    public static class OooO00o implements OooO0O0<o00oO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00oO0o f5631OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final EmojiCompat.OooOOOO f5632OooO0O0;

        public OooO00o(@Nullable o00oO0o o00oo0o2, EmojiCompat.OooOOOO oooOOOO) {
            this.f5631OooO00o = o00oo0o2;
            this.f5632OooO0O0 = oooOOOO;
        }

        @Override // androidx.emoji2.text.OooOo00.OooO0O0
        public final boolean OooO00o(@NonNull CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if ((typefaceEmojiRasterizer.f5650OooO0OO & 4) > 0) {
                return true;
            }
            if (this.f5631OooO00o == null) {
                this.f5631OooO00o = new o00oO0o(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((EmojiCompat.OooO0o) this.f5632OooO0O0).getClass();
            this.f5631OooO00o.setSpan(new o00Oo0(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.OooOo00.OooO0O0
        public final o00oO0o getResult() {
            return this.f5631OooO00o;
        }
    }

    public interface OooO0O0<T> {
        boolean OooO00o(@NonNull CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        T getResult();
    }

    public static class OooO0OO implements OooO0O0<OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5633OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5634OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5635OooO0OO = -1;

        public OooO0OO(int i) {
            this.f5633OooO00o = i;
        }

        @Override // androidx.emoji2.text.OooOo00.OooO0O0
        public final boolean OooO00o(@NonNull CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i3 = this.f5633OooO00o;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.f5634OooO0O0 = i;
            this.f5635OooO0OO = i2;
            return false;
        }

        @Override // androidx.emoji2.text.OooOo00.OooO0O0
        public final OooO0OO getResult() {
            return this;
        }
    }

    public static class OooO0o implements OooO0O0<OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f5636OooO00o;

        public OooO0o(String str) {
            this.f5636OooO00o = str;
        }

        @Override // androidx.emoji2.text.OooOo00.OooO0O0
        public final boolean OooO00o(@NonNull CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f5636OooO00o)) {
                return true;
            }
            typefaceEmojiRasterizer.f5650OooO0OO = (typefaceEmojiRasterizer.f5650OooO0OO & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.OooOo00.OooO0O0
        public final OooO0o getResult() {
            return this;
        }
    }

    public OooOo00(@NonNull o0OoOo0 o0oooo0, @NonNull EmojiCompat.OooO0o oooO0o, @NonNull androidx.emoji2.text.OooO oooO, @NonNull Set set) {
        this.f5620OooO00o = oooO0o;
        this.f5621OooO0O0 = o0oooo0;
        this.f5622OooO0OO = oooO;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            OooO0OO(str, 0, str.length(), 1, true, new OooO0o(str));
        }
    }

    public static boolean OooO00o(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        OooOo[] oooOoArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (oooOoArr = (OooOo[]) editable.getSpans(selectionStart, selectionEnd, OooOo.class)) != null && oooOoArr.length > 0) {
            for (OooOo oooOo : oooOoArr) {
                int spanStart = editable.getSpanStart(oooOo);
                int spanEnd = editable.getSpanEnd(oooOo);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean OooO0O0(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if ((typefaceEmojiRasterizer.f5650OooO0OO & 3) == 0) {
            EmojiCompat.OooO oooO = this.f5622OooO0OO;
            p060o0000o0.o0OoOo0 o0oooo0OooO0OO = typefaceEmojiRasterizer.OooO0OO();
            int iOooO00o = o0oooo0OooO0OO.OooO00o(8);
            if (iOooO00o != 0) {
                o0oooo0OooO0OO.f34261OooO0O0.getShort(iOooO00o + o0oooo0OooO0OO.f34260OooO00o);
            }
            androidx.emoji2.text.OooO oooO2 = (androidx.emoji2.text.OooO) oooO;
            oooO2.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.OooO.f5607OooO0O0;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = oooO2.f5608OooO00o;
            String string = sb.toString();
            int i3 = p052o00000oO.OooOOO0.f33995OooO00o;
            boolean zOooO00o = o00000oO.OooOOO0.OooO00o.OooO00o(textPaint, string);
            int i4 = typefaceEmojiRasterizer.f5650OooO0OO & 4;
            typefaceEmojiRasterizer.f5650OooO0OO = zOooO00o ? i4 | 2 : i4 | 1;
        }
        return (typefaceEmojiRasterizer.f5650OooO0OO & 3) == 2;
    }

    public final <T> T OooO0OO(@NonNull CharSequence charSequence, @IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2, @IntRange(from = ULong.MIN_VALUE) int i3, boolean z, OooO0O0<T> oooO0O0) {
        char c;
        o0OoOo0.OooO00o oooO00o = null;
        OooO oooO = new OooO(this.f5621OooO0O0.f5661OooO0OO, false, null);
        int iCharCount = i;
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i4 = 0;
        boolean z2 = true;
        int iCharCount2 = iCharCount;
        while (iCharCount2 < i2 && i4 < i3 && z2) {
            SparseArray<o0OoOo0.OooO00o> sparseArray = oooO.f5625OooO0OO.f5663OooO00o;
            o0OoOo0.OooO00o oooO00o2 = sparseArray == null ? oooO00o : sparseArray.get(iCodePointAt);
            if (oooO.f5623OooO00o == 2) {
                if (oooO00o2 != null) {
                    oooO.f5625OooO0OO = oooO00o2;
                    oooO.f5627OooO0o++;
                } else {
                    if (iCodePointAt == 65038) {
                        oooO.OooO00o();
                    } else {
                        if (!(iCodePointAt == 65039)) {
                            o0OoOo0.OooO00o oooO00o3 = oooO.f5625OooO0OO;
                            if (oooO00o3.f5664OooO0O0 != null) {
                                if (oooO.f5627OooO0o != 1) {
                                    oooO.f5626OooO0Oo = oooO00o3;
                                    oooO.OooO00o();
                                } else if (oooO.OooO0O0()) {
                                    oooO.f5626OooO0Oo = oooO.f5625OooO0OO;
                                    oooO.OooO00o();
                                } else {
                                    oooO.OooO00o();
                                }
                                c = 3;
                            } else {
                                oooO.OooO00o();
                            }
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (oooO00o2 == null) {
                oooO.OooO00o();
                c = 1;
            } else {
                oooO.f5623OooO00o = 2;
                oooO.f5625OooO0OO = oooO00o2;
                oooO.f5627OooO0o = 1;
                c = 2;
            }
            oooO.f5628OooO0o0 = iCodePointAt;
            if (c != 1) {
                if (c == 2) {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                } else if (c == 3) {
                    if (z || !OooO0O0(charSequence, iCharCount, iCharCount2, oooO.f5626OooO0Oo.f5664OooO0O0)) {
                        boolean zOooO00o = oooO0O0.OooO00o(charSequence, iCharCount, iCharCount2, oooO.f5626OooO0Oo.f5664OooO0O0);
                        i4++;
                        iCharCount = iCharCount2;
                        z2 = zOooO00o;
                    } else {
                        iCharCount = iCharCount2;
                    }
                }
                oooO00o = null;
            } else {
                iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                if (iCharCount < i2) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            }
            iCharCount2 = iCharCount;
            oooO00o = null;
        }
        if ((oooO.f5623OooO00o == 2 && oooO.f5625OooO0OO.f5664OooO0O0 != null && (oooO.f5627OooO0o > 1 || oooO.OooO0O0())) && i4 < i3 && z2 && (z || !OooO0O0(charSequence, iCharCount, iCharCount2, oooO.f5625OooO0OO.f5664OooO0O0))) {
            oooO0O0.OooO00o(charSequence, iCharCount, iCharCount2, oooO.f5625OooO0OO.f5664OooO0O0);
        }
        return oooO0O0.getResult();
    }
}
