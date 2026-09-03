package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class WebvttCssStyle {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColorInt
    public int f14684OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14687OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f14680OooO00o = "";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f14681OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Set<String> f14682OooO0OO = Collections.emptySet();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f14683OooO0Oo = "";

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f14685OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f14686OooO0oO = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f14679OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f14688OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f14689OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f14690OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14692OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f14691OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14693OooOOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14694OooOOOo = false;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public static int OooO0O0(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final int OooO00o() {
        int i = this.f14690OooOO0o;
        if (i == -1 && this.f14692OooOOO0 == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f14692OooOOO0 == 1 ? 2 : 0);
    }
}
