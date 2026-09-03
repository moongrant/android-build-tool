package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class TtmlStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public String f14664OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f14665OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f14666OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14667OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f14669OooO0o0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f14673OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public String f14674OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f14677OooOOOO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14668OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14670OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14671OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f14663OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14672OooOO0 = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14676OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f14675OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14678OooOOOo = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public final TtmlStyle OooO00o(@Nullable TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        String str;
        if (ttmlStyle != null) {
            if (!this.f14666OooO0OO && ttmlStyle.f14666OooO0OO) {
                this.f14665OooO0O0 = ttmlStyle.f14665OooO0O0;
                this.f14666OooO0OO = true;
            }
            if (this.f14671OooO0oo == -1) {
                this.f14671OooO0oo = ttmlStyle.f14671OooO0oo;
            }
            if (this.f14663OooO == -1) {
                this.f14663OooO = ttmlStyle.f14663OooO;
            }
            if (this.f14664OooO00o == null && (str = ttmlStyle.f14664OooO00o) != null) {
                this.f14664OooO00o = str;
            }
            if (this.f14668OooO0o == -1) {
                this.f14668OooO0o = ttmlStyle.f14668OooO0o;
            }
            if (this.f14670OooO0oO == -1) {
                this.f14670OooO0oO = ttmlStyle.f14670OooO0oO;
            }
            if (this.f14675OooOOO == -1) {
                this.f14675OooOOO = ttmlStyle.f14675OooOOO;
            }
            if (this.f14677OooOOOO == null && (alignment = ttmlStyle.f14677OooOOOO) != null) {
                this.f14677OooOOOO = alignment;
            }
            if (this.f14678OooOOOo == -1) {
                this.f14678OooOOOo = ttmlStyle.f14678OooOOOo;
            }
            if (this.f14672OooOO0 == -1) {
                this.f14672OooOO0 = ttmlStyle.f14672OooOO0;
                this.f14673OooOO0O = ttmlStyle.f14673OooOO0O;
            }
            if (!this.f14669OooO0o0 && ttmlStyle.f14669OooO0o0) {
                this.f14667OooO0Oo = ttmlStyle.f14667OooO0Oo;
                this.f14669OooO0o0 = true;
            }
            if (this.f14676OooOOO0 == -1 && (i = ttmlStyle.f14676OooOOO0) != -1) {
                this.f14676OooOOO0 = i;
            }
        }
        return this;
    }

    public final int OooO0O0() {
        int i = this.f14671OooO0oo;
        if (i == -1 && this.f14663OooO == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f14663OooO == 1 ? 2 : 0);
    }
}
