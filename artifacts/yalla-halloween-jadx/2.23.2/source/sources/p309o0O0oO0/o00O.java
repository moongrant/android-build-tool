package p309o0O0oO0;

import OooOOOO.OooO00o;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ExecutorService;
import p311o0O0oO0o.o0O0O00;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting(otherwise = 3)
public final class o00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0O00 f41788OooO0OO = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static o00O f41789OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile SharedPreferences f41790OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorService f41791OooO0O0;

    @VisibleForTesting
    public o00O(ExecutorService executorService) {
        this.f41791OooO0O0 = executorService;
    }

    @Nullable
    public static Context OooO00o() {
        try {
            o0OOO0o.OooO0OO();
            o0OOO0o o0ooo0oOooO0OO = o0OOO0o.OooO0OO();
            o0ooo0oOooO0OO.OooO00o();
            return o0ooo0oOooO0OO.f57662OooO00o;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final synchronized void OooO0O0(Context context) {
        if (this.f41790OooO00o == null && context != null) {
            this.f41791OooO0O0.execute(new OooO00o(5, this, context));
        }
    }

    public final void OooO0OO(long j, String str) {
        if (this.f41790OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f41790OooO00o == null) {
                return;
            }
        }
        this.f41790OooO00o.edit().putLong(str, j).apply();
    }

    public final void OooO0Oo(String str, double d) {
        if (this.f41790OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f41790OooO00o == null) {
                return;
            }
        }
        this.f41790OooO00o.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
    }

    public final void OooO0o(String str, boolean z) {
        if (this.f41790OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f41790OooO00o == null) {
                return;
            }
        }
        this.f41790OooO00o.edit().putBoolean(str, z).apply();
    }

    public final void OooO0o0(String str, String str2) {
        if (this.f41790OooO00o == null) {
            OooO0O0(OooO00o());
            if (this.f41790OooO00o == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f41790OooO00o.edit().remove(str).apply();
        } else {
            this.f41790OooO00o.edit().putString(str, str2).apply();
        }
    }
}
