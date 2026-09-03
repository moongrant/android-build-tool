package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class TtmlStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public String f13478OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f13479OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f13480OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f13483OooO0o0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f13487OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public String f13488OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f13491OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f13492OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public TextEmphasis f13493OooOOo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13482OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13484OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f13485OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f13477OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f13486OooOO0 = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f13490OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13489OooOOO = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f13494OooOOo0 = -1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f13495OooOOoo = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    @CanIgnoreReturnValue
    public final void OooO00o(@Nullable TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f13480OooO0OO && ttmlStyle.f13480OooO0OO) {
                this.f13479OooO0O0 = ttmlStyle.f13479OooO0O0;
                this.f13480OooO0OO = true;
            }
            if (this.f13485OooO0oo == -1) {
                this.f13485OooO0oo = ttmlStyle.f13485OooO0oo;
            }
            if (this.f13477OooO == -1) {
                this.f13477OooO = ttmlStyle.f13477OooO;
            }
            if (this.f13478OooO00o == null && (str = ttmlStyle.f13478OooO00o) != null) {
                this.f13478OooO00o = str;
            }
            if (this.f13482OooO0o == -1) {
                this.f13482OooO0o = ttmlStyle.f13482OooO0o;
            }
            if (this.f13484OooO0oO == -1) {
                this.f13484OooO0oO = ttmlStyle.f13484OooO0oO;
            }
            if (this.f13489OooOOO == -1) {
                this.f13489OooOOO = ttmlStyle.f13489OooOOO;
            }
            if (this.f13491OooOOOO == null && (alignment2 = ttmlStyle.f13491OooOOOO) != null) {
                this.f13491OooOOOO = alignment2;
            }
            if (this.f13492OooOOOo == null && (alignment = ttmlStyle.f13492OooOOOo) != null) {
                this.f13492OooOOOo = alignment;
            }
            if (this.f13494OooOOo0 == -1) {
                this.f13494OooOOo0 = ttmlStyle.f13494OooOOo0;
            }
            if (this.f13486OooOO0 == -1) {
                this.f13486OooOO0 = ttmlStyle.f13486OooOO0;
                this.f13487OooOO0O = ttmlStyle.f13487OooOO0O;
            }
            if (this.f13493OooOOo == null) {
                this.f13493OooOOo = ttmlStyle.f13493OooOOo;
            }
            if (this.f13495OooOOoo == Float.MAX_VALUE) {
                this.f13495OooOOoo = ttmlStyle.f13495OooOOoo;
            }
            if (!this.f13483OooO0o0 && ttmlStyle.f13483OooO0o0) {
                this.f13481OooO0Oo = ttmlStyle.f13481OooO0Oo;
                this.f13483OooO0o0 = true;
            }
            if (this.f13490OooOOO0 != -1 || (i = ttmlStyle.f13490OooOOO0) == -1) {
                return;
            }
            this.f13490OooOOO0 = i;
        }
    }
}
