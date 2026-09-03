package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import p230o00oOoO0.o0000O00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Cue implements OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final String f13382OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final Cue f13383OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f13384OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f13385OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String f13386OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final String f13387OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final String f13388OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String f13389OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String f13390OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final String f13391OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String f13392OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final String f13393Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final String f13394Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final String f13395Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final String f13396Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final String f13397Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final String f13398Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0000O00 f13399Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final String f13400Oooo0o0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f13401OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final CharSequence f13402OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f13403OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Layout.Alignment f13404OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Bitmap f13405OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f13406OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f13407OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float f13408OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f13409OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f13410OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f13411OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f13412OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f13413OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f13414OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f13415OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f13416OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float f13417OooOo00;

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
        oooO00o.f13419OooO00o = "";
        f13383OooOo0 = oooO00o.OooO00o();
        f13384OooOo0O = o0O00.Oooo00O(0);
        f13385OooOo0o = o0O00.Oooo00O(1);
        f13382OooOo = o0O00.Oooo00O(2);
        f13387OooOoO0 = o0O00.Oooo00O(3);
        f13386OooOoO = o0O00.Oooo00O(4);
        f13388OooOoOO = o0O00.Oooo00O(5);
        f13390OooOoo0 = o0O00.Oooo00O(6);
        f13389OooOoo = o0O00.Oooo00O(7);
        f13391OooOooO = o0O00.Oooo00O(8);
        f13392OooOooo = o0O00.Oooo00O(9);
        f13394Oooo000 = o0O00.Oooo00O(10);
        f13395Oooo00O = o0O00.Oooo00O(11);
        f13396Oooo00o = o0O00.Oooo00O(12);
        f13393Oooo0 = o0O00.Oooo00O(13);
        f13397Oooo0O0 = o0O00.Oooo00O(14);
        f13398Oooo0OO = o0O00.Oooo00O(15);
        f13400Oooo0o0 = o0O00.Oooo00O(16);
        f13399Oooo0o = new o0000O00();
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            o00O000o.OooO00o(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f13402OooO0Oo = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13402OooO0Oo = charSequence.toString();
        } else {
            this.f13402OooO0Oo = null;
        }
        this.f13404OooO0o0 = alignment;
        this.f13403OooO0o = alignment2;
        this.f13405OooO0oO = bitmap;
        this.f13406OooO0oo = f;
        this.f13401OooO = i;
        this.f13407OooOO0 = i2;
        this.f13408OooOO0O = f2;
        this.f13409OooOO0o = i3;
        this.f13411OooOOO0 = f4;
        this.f13410OooOOO = f5;
        this.f13412OooOOOO = z;
        this.f13413OooOOOo = i5;
        this.f13415OooOOo0 = i4;
        this.f13414OooOOo = f3;
        this.f13416OooOOoo = i6;
        this.f13417OooOo00 = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        if (TextUtils.equals(this.f13402OooO0Oo, cue.f13402OooO0Oo) && this.f13404OooO0o0 == cue.f13404OooO0o0 && this.f13403OooO0o == cue.f13403OooO0o) {
            Bitmap bitmap = cue.f13405OooO0oO;
            Bitmap bitmap2 = this.f13405OooO0oO;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f13406OooO0oo == cue.f13406OooO0oo && this.f13401OooO == cue.f13401OooO && this.f13407OooOO0 == cue.f13407OooOO0 && this.f13408OooOO0O == cue.f13408OooOO0O && this.f13409OooOO0o == cue.f13409OooOO0o && this.f13411OooOOO0 == cue.f13411OooOOO0 && this.f13410OooOOO == cue.f13410OooOOO && this.f13412OooOOOO == cue.f13412OooOOOO && this.f13413OooOOOo == cue.f13413OooOOOo && this.f13415OooOOo0 == cue.f13415OooOOo0 && this.f13414OooOOo == cue.f13414OooOOo && this.f13416OooOOoo == cue.f13416OooOOoo && this.f13417OooOo00 == cue.f13417OooOo00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13402OooO0Oo, this.f13404OooO0o0, this.f13403OooO0o, this.f13405OooO0oO, Float.valueOf(this.f13406OooO0oo), Integer.valueOf(this.f13401OooO), Integer.valueOf(this.f13407OooOO0), Float.valueOf(this.f13408OooOO0O), Integer.valueOf(this.f13409OooOO0o), Float.valueOf(this.f13411OooOOO0), Float.valueOf(this.f13410OooOOO), Boolean.valueOf(this.f13412OooOOOO), Integer.valueOf(this.f13413OooOOOo), Integer.valueOf(this.f13415OooOOo0), Float.valueOf(this.f13414OooOOo), Integer.valueOf(this.f13416OooOOoo), Float.valueOf(this.f13417OooOo00)});
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f13384OooOo0O, this.f13402OooO0Oo);
        bundle.putSerializable(f13385OooOo0o, this.f13404OooO0o0);
        bundle.putSerializable(f13382OooOo, this.f13403OooO0o);
        bundle.putParcelable(f13387OooOoO0, this.f13405OooO0oO);
        bundle.putFloat(f13386OooOoO, this.f13406OooO0oo);
        bundle.putInt(f13388OooOoOO, this.f13401OooO);
        bundle.putInt(f13390OooOoo0, this.f13407OooOO0);
        bundle.putFloat(f13389OooOoo, this.f13408OooOO0O);
        bundle.putInt(f13391OooOooO, this.f13409OooOO0o);
        bundle.putInt(f13392OooOooo, this.f13415OooOOo0);
        bundle.putFloat(f13394Oooo000, this.f13414OooOOo);
        bundle.putFloat(f13395Oooo00O, this.f13411OooOOO0);
        bundle.putFloat(f13396Oooo00o, this.f13410OooOOO);
        bundle.putBoolean(f13397Oooo0O0, this.f13412OooOOOO);
        bundle.putInt(f13393Oooo0, this.f13413OooOOOo);
        bundle.putInt(f13398Oooo0OO, this.f13416OooOOoo);
        bundle.putFloat(f13400Oooo0o0, this.f13417OooOo00);
        return bundle;
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f13418OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public CharSequence f13419OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Bitmap f13420OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f13421OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Layout.Alignment f13422OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f13423OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f13424OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13425OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f13426OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f13427OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f13428OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f13429OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f13430OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f13431OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @ColorInt
        public int f13432OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f13433OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f13434OooOOo0;

        public OooO00o() {
            this.f13419OooO00o = null;
            this.f13420OooO0O0 = null;
            this.f13421OooO0OO = null;
            this.f13422OooO0Oo = null;
            this.f13424OooO0o0 = -3.4028235E38f;
            this.f13423OooO0o = Integer.MIN_VALUE;
            this.f13425OooO0oO = Integer.MIN_VALUE;
            this.f13426OooO0oo = -3.4028235E38f;
            this.f13418OooO = Integer.MIN_VALUE;
            this.f13427OooOO0 = Integer.MIN_VALUE;
            this.f13428OooOO0O = -3.4028235E38f;
            this.f13429OooOO0o = -3.4028235E38f;
            this.f13431OooOOO0 = -3.4028235E38f;
            this.f13430OooOOO = false;
            this.f13432OooOOOO = -16777216;
            this.f13433OooOOOo = Integer.MIN_VALUE;
        }

        public final Cue OooO00o() {
            return new Cue(this.f13419OooO00o, this.f13421OooO0OO, this.f13422OooO0Oo, this.f13420OooO0O0, this.f13424OooO0o0, this.f13423OooO0o, this.f13425OooO0oO, this.f13426OooO0oo, this.f13418OooO, this.f13427OooOO0, this.f13428OooOO0O, this.f13429OooOO0o, this.f13431OooOOO0, this.f13430OooOOO, this.f13432OooOOOO, this.f13433OooOOOo, this.f13434OooOOo0);
        }

        public OooO00o(Cue cue) {
            this.f13419OooO00o = cue.f13402OooO0Oo;
            this.f13420OooO0O0 = cue.f13405OooO0oO;
            this.f13421OooO0OO = cue.f13404OooO0o0;
            this.f13422OooO0Oo = cue.f13403OooO0o;
            this.f13424OooO0o0 = cue.f13406OooO0oo;
            this.f13423OooO0o = cue.f13401OooO;
            this.f13425OooO0oO = cue.f13407OooOO0;
            this.f13426OooO0oo = cue.f13408OooOO0O;
            this.f13418OooO = cue.f13409OooOO0o;
            this.f13427OooOO0 = cue.f13415OooOOo0;
            this.f13428OooOO0O = cue.f13414OooOOo;
            this.f13429OooOO0o = cue.f13411OooOOO0;
            this.f13431OooOOO0 = cue.f13410OooOOO;
            this.f13430OooOOO = cue.f13412OooOOOO;
            this.f13432OooOOOO = cue.f13413OooOOOo;
            this.f13433OooOOOo = cue.f13416OooOOoo;
            this.f13434OooOOo0 = cue.f13417OooOo00;
        }
    }
}
