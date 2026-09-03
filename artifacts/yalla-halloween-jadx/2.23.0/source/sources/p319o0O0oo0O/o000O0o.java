package p319o0O0oo0O;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.iap.OooO;
import java.util.concurrent.ExecutorService;
import p281o0O0O0oO.OooOO0;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting(otherwise = 3)
public final class o000O0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOOO0 f42671OooO0OO = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o000O0o f42672OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile SharedPreferences f42673OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorService f42674OooO0O0;

    @VisibleForTesting
    public o000O0o(ExecutorService executorService) {
        this.f42674OooO0O0 = executorService;
    }

    @Nullable
    public static Context OooO00o() {
        try {
            OooOO0.OooO0OO();
            OooOO0 oooOO0OooO0OO = OooOO0.OooO0OO();
            oooOO0OooO0OO.OooO00o();
            return oooOO0OooO0OO.f41949OooO00o;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final synchronized void OooO0O0(Context context) {
        if (this.f42673OooO00o == null && context != null) {
            this.f42674OooO0O0.execute(new OooO(2, this, context));
        }
    }

    public final void OooO0OO(long j, String str) {
        if (this.f42673OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f42673OooO00o == null) {
                return;
            }
        }
        this.f42673OooO00o.edit().putLong(str, j).apply();
    }

    public final void OooO0Oo(String str, double d) {
        if (this.f42673OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f42673OooO00o == null) {
                return;
            }
        }
        this.f42673OooO00o.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
    }

    public final void OooO0o(String str, boolean z) {
        if (this.f42673OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f42673OooO00o == null) {
                return;
            }
        }
        this.f42673OooO00o.edit().putBoolean(str, z).apply();
    }

    public final void OooO0o0(String str, String str2) {
        if (this.f42673OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f42673OooO00o == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f42673OooO00o.edit().remove(str).apply();
        } else {
            this.f42673OooO00o.edit().putString(str, str2).apply();
        }
    }
}
