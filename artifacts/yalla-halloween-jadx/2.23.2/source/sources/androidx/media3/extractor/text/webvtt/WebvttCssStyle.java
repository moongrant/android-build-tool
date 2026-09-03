package androidx.media3.extractor.text.webvtt;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class WebvttCssStyle {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColorInt
    public int f8851OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f8854OooO0oo;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f8860OooOOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f8847OooO00o = "";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f8848OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Set<String> f8849OooO0OO = Collections.emptySet();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f8850OooO0Oo = "";

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f8852OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f8853OooO0oO = false;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f8846OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f8855OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f8856OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f8857OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f8859OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f8858OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f8861OooOOOo = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f8862OooOOo0 = false;

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
