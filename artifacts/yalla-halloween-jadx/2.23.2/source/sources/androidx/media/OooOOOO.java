package androidx.media;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f6160OooO0O0 = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f6161OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile OooOOOO f6162OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p068o0000oo0.OooOOOO f6163OooO00o;

    public interface OooO00o {
        boolean OooO00o(OooOo.OooO00o oooO00o);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo.OooO00o f6164OooO00o;

        public OooO0O0(@NonNull String str, int i, int i2) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f6164OooO00o = new OooOo00.OooO00o(str, i, i2);
            } else {
                this.f6164OooO00o = new OooOo.OooO00o(str, i, i2);
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                return this.f6164OooO00o.equals(((OooO0O0) obj).f6164OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f6164OooO00o.hashCode();
        }
    }

    public OooOOOO(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6163OooO00o = new OooOo00(context);
        } else {
            this.f6163OooO00o = new p068o0000oo0.OooOOOO(context);
        }
    }
}
