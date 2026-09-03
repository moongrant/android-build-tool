package androidx.media3.ui;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class CaptionStyleCompat {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final CaptionStyleCompat f9525OooO0oO = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f9526OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f9527OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f9528OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9529OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Typeface f9530OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9531OooO0o0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, @Nullable Typeface typeface) {
        this.f9526OooO00o = i;
        this.f9527OooO0O0 = i2;
        this.f9528OooO0OO = i3;
        this.f9529OooO0Oo = i4;
        this.f9531OooO0o0 = i5;
        this.f9530OooO0o = typeface;
    }
}
