package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Cue {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Cue f14617OooOOOo = new Cue("", null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f14618OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final CharSequence f14619OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f14620OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Bitmap f14621OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f14622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f14623OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14624OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f14625OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f14626OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f14627OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f14628OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f14629OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f14630OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f14631OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f14632OooOOOO;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f14634OooO00o = null;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Bitmap f14635OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f14636OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f14637OooO0Oo = -3.4028235E38f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f14639OooO0o0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f14638OooO0o = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f14640OooO0oO = -3.4028235E38f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f14641OooO0oo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f14633OooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f14642OooOO0 = -3.4028235E38f;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f14643OooOO0O = -3.4028235E38f;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f14644OooOO0o = -3.4028235E38f;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f14646OooOOO0 = false;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @ColorInt
        public int f14645OooOOO = -16777216;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f14647OooOOOO = Integer.MIN_VALUE;

        public final Cue OooO00o() {
            return new Cue(this.f14634OooO00o, this.f14636OooO0OO, this.f14635OooO0O0, this.f14637OooO0Oo, this.f14639OooO0o0, this.f14638OooO0o, this.f14640OooO0oO, this.f14641OooO0oo, this.f14633OooO, this.f14642OooOO0, this.f14643OooOO0O, this.f14644OooOO0o, this.f14646OooOOO0, this.f14645OooOOO, this.f14647OooOOOO);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6) {
        if (charSequence == null) {
            Objects.requireNonNull(bitmap);
        } else {
            o00000O0.OooO00o(bitmap == null);
        }
        this.f14619OooO00o = charSequence;
        this.f14620OooO0O0 = alignment;
        this.f14621OooO0OO = bitmap;
        this.f14622OooO0Oo = f;
        this.f14624OooO0o0 = i;
        this.f14623OooO0o = i2;
        this.f14625OooO0oO = f2;
        this.f14626OooO0oo = i3;
        this.f14618OooO = f4;
        this.f14627OooOO0 = f5;
        this.f14628OooOO0O = z;
        this.f14629OooOO0o = i5;
        this.f14631OooOOO0 = i4;
        this.f14630OooOOO = f3;
        this.f14632OooOOOO = i6;
    }
}
