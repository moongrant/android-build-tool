package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class Cue {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f6227OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final CharSequence f6228OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f6229OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f6230OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Bitmap f6231OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6232OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f6233OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6234OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f6235OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f6236OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f6237OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f6238OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f6239OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f6240OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final float f6241OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f6242OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f6243OooOOo0;

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

    @UnstableApi
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f6244OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f6245OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Bitmap f6246OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f6247OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Layout.Alignment f6248OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f6249OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f6250OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f6251OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f6252OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f6253OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f6254OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final float f6255OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f6256OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final float f6257OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @ColorInt
        public final int f6258OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final int f6259OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final float f6260OooOOo0;

        public OooO00o(Cue cue) {
            this.f6245OooO00o = cue.f6228OooO00o;
            this.f6246OooO0O0 = cue.f6231OooO0Oo;
            this.f6247OooO0OO = cue.f6229OooO0O0;
            this.f6248OooO0Oo = cue.f6230OooO0OO;
            this.f6250OooO0o0 = cue.f6233OooO0o0;
            this.f6249OooO0o = cue.f6232OooO0o;
            this.f6251OooO0oO = cue.f6234OooO0oO;
            this.f6252OooO0oo = cue.f6235OooO0oo;
            this.f6244OooO = cue.f6227OooO;
            this.f6253OooOO0 = cue.f6239OooOOO;
            this.f6254OooOO0O = cue.f6241OooOOOO;
            this.f6255OooOO0o = cue.f6236OooOO0;
            this.f6257OooOOO0 = cue.f6237OooOO0O;
            this.f6256OooOOO = cue.f6238OooOO0o;
            this.f6258OooOOOO = cue.f6240OooOOO0;
            this.f6259OooOOOo = cue.f6242OooOOOo;
            this.f6260OooOOo0 = cue.f6243OooOOo0;
        }

        public final Cue OooO00o() {
            return new Cue(this.f6245OooO00o, this.f6247OooO0OO, this.f6248OooO0Oo, this.f6246OooO0O0, this.f6250OooO0o0, this.f6249OooO0o, this.f6251OooO0oO, this.f6252OooO0oo, this.f6244OooO, this.f6253OooOO0, this.f6254OooOO0O, this.f6255OooOO0o, this.f6257OooOOO0, this.f6256OooOOO, this.f6258OooOOOO, this.f6259OooOOOo, this.f6260OooOOo0);
        }
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
        new Cue("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        OooO0o.OooO0oO(0);
        OooO0o.OooO0oO(1);
        OooO0o.OooO0oO(2);
        OooO0o.OooO0oO(3);
        OooO0o.OooO0oO(4);
        OooO0o.OooO0oO(5);
        OooO0o.OooO0oO(6);
        OooO0o.OooO0oO(7);
        OooO0o.OooO0oO(8);
        OooO0o.OooO0oO(9);
        OooO0o.OooO0oO(10);
        OooO0o.OooO0oO(11);
        OooO0o.OooO0oO(12);
        OooO0o.OooO0oO(13);
        OooO0o.OooO0oO(14);
        OooO0o.OooO0oO(15);
        OooO0o.OooO0oO(16);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            o000O000.OooO00o.OooO00o(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f6228OooO00o = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6228OooO00o = charSequence.toString();
        } else {
            this.f6228OooO00o = null;
        }
        this.f6229OooO0O0 = alignment;
        this.f6230OooO0OO = alignment2;
        this.f6231OooO0Oo = bitmap;
        this.f6233OooO0o0 = f;
        this.f6232OooO0o = i;
        this.f6234OooO0oO = i2;
        this.f6235OooO0oo = f2;
        this.f6227OooO = i3;
        this.f6236OooOO0 = f4;
        this.f6237OooOO0O = f5;
        this.f6238OooOO0o = z;
        this.f6240OooOOO0 = i5;
        this.f6239OooOOO = i4;
        this.f6241OooOOOO = f3;
        this.f6242OooOOOo = i6;
        this.f6243OooOOo0 = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (TextUtils.equals(this.f6228OooO00o, cue.f6228OooO00o) && this.f6229OooO0O0 == cue.f6229OooO0O0 && this.f6230OooO0OO == cue.f6230OooO0OO) {
            Bitmap bitmap = cue.f6231OooO0Oo;
            Bitmap bitmap2 = this.f6231OooO0Oo;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f6233OooO0o0 == cue.f6233OooO0o0 && this.f6232OooO0o == cue.f6232OooO0o && this.f6234OooO0oO == cue.f6234OooO0oO && this.f6235OooO0oo == cue.f6235OooO0oo && this.f6227OooO == cue.f6227OooO && this.f6236OooOO0 == cue.f6236OooOO0 && this.f6237OooOO0O == cue.f6237OooOO0O && this.f6238OooOO0o == cue.f6238OooOO0o && this.f6240OooOOO0 == cue.f6240OooOOO0 && this.f6239OooOOO == cue.f6239OooOOO && this.f6241OooOOOO == cue.f6241OooOOOO && this.f6242OooOOOo == cue.f6242OooOOOo && this.f6243OooOOo0 == cue.f6243OooOOo0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6228OooO00o, this.f6229OooO0O0, this.f6230OooO0OO, this.f6231OooO0Oo, Float.valueOf(this.f6233OooO0o0), Integer.valueOf(this.f6232OooO0o), Integer.valueOf(this.f6234OooO0oO), Float.valueOf(this.f6235OooO0oo), Integer.valueOf(this.f6227OooO), Float.valueOf(this.f6236OooOO0), Float.valueOf(this.f6237OooOO0O), Boolean.valueOf(this.f6238OooOO0o), Integer.valueOf(this.f6240OooOOO0), Integer.valueOf(this.f6239OooOOO), Float.valueOf(this.f6241OooOOOO), Integer.valueOf(this.f6242OooOOOo), Float.valueOf(this.f6243OooOOo0)});
    }
}
