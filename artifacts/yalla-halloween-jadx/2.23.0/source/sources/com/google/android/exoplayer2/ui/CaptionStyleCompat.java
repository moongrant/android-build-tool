package com.google.android.exoplayer2.ui;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CaptionStyleCompat {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final CaptionStyleCompat f13748OooO0oO = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f13749OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f13750OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f13751OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f13752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Typeface f13753OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f13754OooO0o0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, @Nullable Typeface typeface) {
        this.f13749OooO00o = i;
        this.f13750OooO0O0 = i2;
        this.f13751OooO0OO = i3;
        this.f13752OooO0Oo = i4;
        this.f13754OooO0o0 = i5;
        this.f13753OooO0o = typeface;
    }
}
