package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.OooOOOO;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p069o0000ooO.o0000O00;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @UnstableApi
    public final int f7114OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @UnstableApi
    public final int f7115OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    @UnstableApi
    public final String f7116OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    @UnstableApi
    public final androidx.media3.common.OooOO0 f7117OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @UnstableApi
    public final int f7118OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f7119OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @UnstableApi
    public final o0000O00 f7120OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f7108OooOOoo = o00.Oooo00o(1001);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f7111OooOo00 = o00.Oooo00o(1002);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f7110OooOo0 = o00.Oooo00o(1003);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f7112OooOo0O = o00.Oooo00o(1004);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f7113OooOo0o = o00.Oooo00o(1005);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final String f7109OooOo = o00.Oooo00o(1006);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface Type {
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    @CheckResult
    public final ExoPlaybackException OooO0OO(@Nullable OooOOOO.OooO0O0 oooO0O0) {
        return new ExoPlaybackException(getMessage(), getCause(), this.f6698OooO0Oo, this.f7114OooOO0o, this.f7116OooOOO0, this.f7115OooOOO, this.f7117OooOOOO, this.f7118OooOOOo, oooO0O0, this.f6699OooO0o0, this.f7119OooOOo);
    }

    @Override // androidx.media3.common.PlaybackException, androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f7108OooOOoo, this.f7114OooOO0o);
        bundle.putString(f7111OooOo00, this.f7116OooOOO0);
        bundle.putInt(f7110OooOo0, this.f7115OooOOO);
        androidx.media3.common.OooOO0 oooOO1 = this.f7117OooOOOO;
        if (oooOO1 != null) {
            bundle.putBundle(f7112OooOo0O, oooOO1.OooO0oO(false));
        }
        bundle.putInt(f7113OooOo0o, this.f7118OooOOOo);
        bundle.putBoolean(f7109OooOo, this.f7119OooOOo);
        return bundle;
    }

    public ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.f7114OooOO0o = bundle.getInt(f7108OooOOoo, 2);
        this.f7116OooOOO0 = bundle.getString(f7111OooOo00);
        this.f7115OooOOO = bundle.getInt(f7110OooOo0, -1);
        Bundle bundle2 = bundle.getBundle(f7112OooOo0O);
        this.f7117OooOOOO = bundle2 == null ? null : (androidx.media3.common.OooOO0) androidx.media3.common.OooOO0.f6396o00oO0o.OooO0OO(bundle2);
        this.f7118OooOOOo = bundle.getInt(f7113OooOo0o, 4);
        this.f7119OooOOo = bundle.getBoolean(f7109OooOo, false);
        this.f7120OooOOo0 = null;
    }

    public ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable androidx.media3.common.OooOO0 oooOO1, int i4, @Nullable OooOOOO.OooO0O0 oooO0O0, long j, boolean z) {
        super(str, th, i, j);
        o00Oo0.OooO00o(!z || i2 == 1);
        o00Oo0.OooO00o(th != null || i2 == 3);
        this.f7114OooOO0o = i2;
        this.f7116OooOOO0 = str2;
        this.f7115OooOOO = i3;
        this.f7117OooOOOO = oooOO1;
        this.f7118OooOOOo = i4;
        this.f7120OooOOo0 = oooO0O0;
        this.f7119OooOOo = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, @Nullable Throwable th, int i2, @Nullable String str, int i3, @Nullable androidx.media3.common.OooOO0 oooOO1, int i4, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(oooOO1);
            sb.append(", format_supported=");
            int i5 = o00.f34910OooO00o;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            sb.append(str2);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : androidx.camera.core.impl.OooOOOO.OooO00o(string, ": null"), th, i2, i, str, i3, oooOO1, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
