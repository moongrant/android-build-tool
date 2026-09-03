package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class Cue implements OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final String f6878OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final Cue f6879OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f6880OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f6881OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f6882OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final String f6883OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final String f6884OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String f6885OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String f6886OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final String f6887OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String f6888OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final String f6889Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final String f6890Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final String f6891Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final String f6892Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final String f6893Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final String f6894Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @UnstableApi
    public static final o000O000.OooO00o f6895Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final String f6896Oooo0o0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f6897OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final CharSequence f6898OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f6899OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f6900OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Bitmap f6901OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f6902OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f6903OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f6904OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f6905OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f6906OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f6907OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f6908OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f6909OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f6910OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f6911OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f6912OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float f6913OooOo00;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    static {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f6915OooO00o = "";
        f6879OooOo0 = oooO00o.OooO00o();
        f6880OooOo0O = o00.Oooo00o(0);
        f6881OooOo0o = o00.Oooo00o(1);
        f6878OooOo = o00.Oooo00o(2);
        f6883OooOoO0 = o00.Oooo00o(3);
        f6882OooOoO = o00.Oooo00o(4);
        f6884OooOoOO = o00.Oooo00o(5);
        f6886OooOoo0 = o00.Oooo00o(6);
        f6885OooOoo = o00.Oooo00o(7);
        f6887OooOooO = o00.Oooo00o(8);
        f6888OooOooo = o00.Oooo00o(9);
        f6890Oooo000 = o00.Oooo00o(10);
        f6891Oooo00O = o00.Oooo00o(11);
        f6892Oooo00o = o00.Oooo00o(12);
        f6889Oooo0 = o00.Oooo00o(13);
        f6893Oooo0O0 = o00.Oooo00o(14);
        f6894Oooo0OO = o00.Oooo00o(15);
        f6896Oooo0o0 = o00.Oooo00o(16);
        f6895Oooo0o = new o000O000.OooO00o();
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            o00Oo0.OooO00o(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f6898OooO0Oo = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6898OooO0Oo = charSequence.toString();
        } else {
            this.f6898OooO0Oo = null;
        }
        this.f6900OooO0o0 = alignment;
        this.f6899OooO0o = alignment2;
        this.f6901OooO0oO = bitmap;
        this.f6902OooO0oo = f;
        this.f6897OooO = i;
        this.f6903OooOO0 = i2;
        this.f6904OooOO0O = f2;
        this.f6905OooOO0o = i3;
        this.f6907OooOOO0 = f4;
        this.f6906OooOOO = f5;
        this.f6908OooOOOO = z;
        this.f6909OooOOOo = i5;
        this.f6911OooOOo0 = i4;
        this.f6910OooOOo = f3;
        this.f6912OooOOoo = i6;
        this.f6913OooOo00 = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (TextUtils.equals(this.f6898OooO0Oo, cue.f6898OooO0Oo) && this.f6900OooO0o0 == cue.f6900OooO0o0 && this.f6899OooO0o == cue.f6899OooO0o) {
            Bitmap bitmap = cue.f6901OooO0oO;
            Bitmap bitmap2 = this.f6901OooO0oO;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f6902OooO0oo == cue.f6902OooO0oo && this.f6897OooO == cue.f6897OooO && this.f6903OooOO0 == cue.f6903OooOO0 && this.f6904OooOO0O == cue.f6904OooOO0O && this.f6905OooOO0o == cue.f6905OooOO0o && this.f6907OooOOO0 == cue.f6907OooOOO0 && this.f6906OooOOO == cue.f6906OooOOO && this.f6908OooOOOO == cue.f6908OooOOOO && this.f6909OooOOOo == cue.f6909OooOOOo && this.f6911OooOOo0 == cue.f6911OooOOo0 && this.f6910OooOOo == cue.f6910OooOOo && this.f6912OooOOoo == cue.f6912OooOOoo && this.f6913OooOo00 == cue.f6913OooOo00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6898OooO0Oo, this.f6900OooO0o0, this.f6899OooO0o, this.f6901OooO0oO, Float.valueOf(this.f6902OooO0oo), Integer.valueOf(this.f6897OooO), Integer.valueOf(this.f6903OooOO0), Float.valueOf(this.f6904OooOO0O), Integer.valueOf(this.f6905OooOO0o), Float.valueOf(this.f6907OooOOO0), Float.valueOf(this.f6906OooOOO), Boolean.valueOf(this.f6908OooOOOO), Integer.valueOf(this.f6909OooOOOo), Integer.valueOf(this.f6911OooOOo0), Float.valueOf(this.f6910OooOOo), Integer.valueOf(this.f6912OooOOoo), Float.valueOf(this.f6913OooOo00)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f6880OooOo0O, this.f6898OooO0Oo);
        bundle.putSerializable(f6881OooOo0o, this.f6900OooO0o0);
        bundle.putSerializable(f6878OooOo, this.f6899OooO0o);
        bundle.putParcelable(f6883OooOoO0, this.f6901OooO0oO);
        bundle.putFloat(f6882OooOoO, this.f6902OooO0oo);
        bundle.putInt(f6884OooOoOO, this.f6897OooO);
        bundle.putInt(f6886OooOoo0, this.f6903OooOO0);
        bundle.putFloat(f6885OooOoo, this.f6904OooOO0O);
        bundle.putInt(f6887OooOooO, this.f6905OooOO0o);
        bundle.putInt(f6888OooOooo, this.f6911OooOOo0);
        bundle.putFloat(f6890Oooo000, this.f6910OooOOo);
        bundle.putFloat(f6891Oooo00O, this.f6907OooOOO0);
        bundle.putFloat(f6892Oooo00o, this.f6906OooOOO);
        bundle.putBoolean(f6893Oooo0O0, this.f6908OooOOOO);
        bundle.putInt(f6889Oooo0, this.f6909OooOOOo);
        bundle.putInt(f6894Oooo0OO, this.f6912OooOOoo);
        bundle.putFloat(f6896Oooo0o0, this.f6913OooOo00);
        return bundle;
    }

    @UnstableApi
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f6914OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f6915OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Bitmap f6916OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f6917OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f6918OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f6919OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f6920OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f6921OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f6922OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f6923OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f6924OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f6925OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f6926OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f6927OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @ColorInt
        public int f6928OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f6929OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f6930OooOOo0;

        public OooO00o() {
            this.f6915OooO00o = null;
            this.f6916OooO0O0 = null;
            this.f6917OooO0OO = null;
            this.f6918OooO0Oo = null;
            this.f6920OooO0o0 = -3.4028235E38f;
            this.f6919OooO0o = Integer.MIN_VALUE;
            this.f6921OooO0oO = Integer.MIN_VALUE;
            this.f6922OooO0oo = -3.4028235E38f;
            this.f6914OooO = Integer.MIN_VALUE;
            this.f6923OooOO0 = Integer.MIN_VALUE;
            this.f6924OooOO0O = -3.4028235E38f;
            this.f6925OooOO0o = -3.4028235E38f;
            this.f6927OooOOO0 = -3.4028235E38f;
            this.f6926OooOOO = false;
            this.f6928OooOOOO = -16777216;
            this.f6929OooOOOo = Integer.MIN_VALUE;
        }

        public final Cue OooO00o() {
            return new Cue(this.f6915OooO00o, this.f6917OooO0OO, this.f6918OooO0Oo, this.f6916OooO0O0, this.f6920OooO0o0, this.f6919OooO0o, this.f6921OooO0oO, this.f6922OooO0oo, this.f6914OooO, this.f6923OooOO0, this.f6924OooOO0O, this.f6925OooOO0o, this.f6927OooOOO0, this.f6926OooOOO, this.f6928OooOOOO, this.f6929OooOOOo, this.f6930OooOOo0);
        }

        public OooO00o(Cue cue) {
            this.f6915OooO00o = cue.f6898OooO0Oo;
            this.f6916OooO0O0 = cue.f6901OooO0oO;
            this.f6917OooO0OO = cue.f6900OooO0o0;
            this.f6918OooO0Oo = cue.f6899OooO0o;
            this.f6920OooO0o0 = cue.f6902OooO0oo;
            this.f6919OooO0o = cue.f6897OooO;
            this.f6921OooO0oO = cue.f6903OooOO0;
            this.f6922OooO0oo = cue.f6904OooOO0O;
            this.f6914OooO = cue.f6905OooOO0o;
            this.f6923OooOO0 = cue.f6911OooOOo0;
            this.f6924OooOO0O = cue.f6910OooOOo;
            this.f6925OooOO0o = cue.f6907OooOOO0;
            this.f6927OooOOO0 = cue.f6906OooOOO;
            this.f6926OooOOO = cue.f6908OooOOOO;
            this.f6928OooOOOO = cue.f6909OooOOOo;
            this.f6929OooOOOo = cue.f6912OooOOoo;
            this.f6930OooOOo0 = cue.f6913OooOo00;
        }
    }
}
