package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 implements SessionToken.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bundle f9506OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final MediaSessionCompat.Token f9507OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f9508OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9509OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final ComponentName f9510OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f9511OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f9499OooOO0 = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f9500OooOO0O = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f9501OooOO0o = p080o000OoO.o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f9503OooOOO0 = p080o000OoO.o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f9502OooOOO = p080o000OoO.o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f9504OooOOOO = p080o000OoO.o00.Oooo00o(5);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final androidx.compose.foundation.text.OooO00o f9505OooOOOo = new androidx.compose.foundation.text.OooO00o();

    public oo0o0O0(@Nullable MediaSessionCompat.Token token, int i, int i2, @Nullable ComponentName componentName, String str, Bundle bundle) {
        this.f9507OooO0Oo = token;
        this.f9509OooO0o0 = i;
        this.f9508OooO0o = i2;
        this.f9510OooO0oO = componentName;
        this.f9511OooO0oo = str;
        this.f9506OooO = bundle;
    }

    @Override // androidx.media3.session.SessionToken.OooO00o
    public final int OooO00o() {
        return this.f9509OooO0o0;
    }

    @Override // androidx.media3.session.SessionToken.OooO00o
    @Nullable
    public final ComponentName OooO0O0() {
        return this.f9510OooO0oO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof oo0o0O0)) {
            return false;
        }
        oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
        int i = oo0o0o0.f9508OooO0o;
        int i2 = this.f9508OooO0o;
        if (i2 != i) {
            return false;
        }
        if (i2 == 100) {
            return p080o000OoO.o00.OooO00o(this.f9507OooO0Oo, oo0o0o0.f9507OooO0Oo);
        }
        if (i2 != 101) {
            return false;
        }
        return p080o000OoO.o00.OooO00o(this.f9510OooO0oO, oo0o0o0.f9510OooO0oO);
    }

    @Override // androidx.media3.session.SessionToken.OooO00o
    public final String getPackageName() {
        return this.f9511OooO0oo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9508OooO0o), this.f9510OooO0oO, this.f9507OooO0Oo});
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        String str = f9499OooOO0;
        MediaSessionCompat.Token token = this.f9507OooO0Oo;
        if (token == null) {
            bundle = null;
        } else {
            token.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("android.support.v4.media.session.TOKEN", token);
            synchronized (token.f2109OooO0Oo) {
                android.support.v4.media.session.OooO0O0 oooO0O0 = token.f2110OooO0o;
                if (oooO0O0 != null) {
                    p063o0000oO.Oooo0.OooO0O0(bundle3, "android.support.v4.media.session.EXTRA_BINDER", oooO0O0.asBinder());
                }
                p113o00O00Oo.OooOo oooOo = token.f2112OooO0oO;
                if (oooOo != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putParcelable("a", new ParcelImpl(oooOo));
                    bundle3.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle4);
                }
            }
            bundle = bundle3;
        }
        bundle2.putBundle(str, bundle);
        bundle2.putInt(f9500OooOO0O, this.f9509OooO0o0);
        bundle2.putInt(f9501OooOO0o, this.f9508OooO0o);
        bundle2.putParcelable(f9503OooOOO0, this.f9510OooO0oO);
        bundle2.putString(f9502OooOOO, this.f9511OooO0oo);
        bundle2.putBundle(f9504OooOOOO, this.f9506OooO);
        return bundle2;
    }

    public final String toString() {
        return "SessionToken {legacyToken=" + this.f9507OooO0Oo + "}";
    }
}
