package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionToken implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f9279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f9278OooO0o0 = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f9277OooO0o = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: androidx.media3.session.SessionToken$1, reason: invalid class name */
    class AnonymousClass1 extends ResultReceiver {
        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            throw null;
        }
    }

    public interface OooO00o extends androidx.media3.common.OooO0OO {
        int OooO00o();

        @Nullable
        ComponentName OooO0O0();

        String getPackageName();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenType {
    }

    static {
        new p042OooooO0.o00O0();
    }

    public SessionToken(int i, int i2, int i3, String str, OooOOO0 oooOOO0, Bundle bundle) {
        str.getClass();
        IBinder iBinderAsBinder = oooOOO0.asBinder();
        bundle.getClass();
        this.f9279OooO0Oo = new o00O0OO0(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof SessionToken) {
            return this.f9279OooO0Oo.equals(((SessionToken) obj).f9279OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9279OooO0Oo.hashCode();
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        OooO00o oooO00o = this.f9279OooO0Oo;
        boolean z = oooO00o instanceof o00O0OO0;
        String str = f9278OooO0o0;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(f9277OooO0o, oooO00o.toBundle());
        return bundle;
    }

    public final String toString() {
        return this.f9279OooO0Oo.toString();
    }

    public SessionToken(Bundle bundle) {
        String str = f9278OooO0o0;
        p080o000OoO.o00Oo0.OooO0O0(bundle.containsKey(str), "Impl type needs to be set.");
        int i = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f9277OooO0o);
        bundle2.getClass();
        if (i == 0) {
            this.f9279OooO0Oo = (OooO00o) o00O0OO0.f9467OooOo0O.OooO0OO(bundle2);
        } else {
            this.f9279OooO0Oo = (OooO00o) oo0o0O0.f9505OooOOOo.OooO0OO(bundle2);
        }
    }
}
