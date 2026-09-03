package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class WebvttCssStyle {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColorInt
    public int f13501OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f13504OooO0oo;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f13510OooOOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f13497OooO00o = "";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f13498OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Set<String> f13499OooO0OO = Collections.emptySet();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f13500OooO0Oo = "";

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f13502OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f13503OooO0oO = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f13496OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f13505OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f13506OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f13507OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f13509OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13508OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13511OooOOOo = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f13512OooOOo0 = false;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public static int OooO00o(int i, int i2, String str, @Nullable String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
