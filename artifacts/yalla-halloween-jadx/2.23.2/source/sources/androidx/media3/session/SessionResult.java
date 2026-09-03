package androidx.media3.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionResult implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9274OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f9275OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Bundle f9276OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f9272OooO0oO = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f9273OooO0oo = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f9271OooO = p080o000OoO.o00.Oooo00o(2);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Code {
    }

    static {
        new o00O0O0();
    }

    public SessionResult(int i) {
        this(i, Bundle.EMPTY);
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9272OooO0oO, this.f9274OooO0Oo);
        bundle.putBundle(f9273OooO0oo, this.f9276OooO0o0);
        bundle.putLong(f9271OooO, this.f9275OooO0o);
        return bundle;
    }

    public SessionResult(int i, Bundle bundle) {
        this(bundle, i, SystemClock.elapsedRealtime());
    }

    public SessionResult(Bundle bundle, int i, long j) {
        this.f9274OooO0Oo = i;
        this.f9276OooO0o0 = new Bundle(bundle);
        this.f9275OooO0o = j;
    }
}
