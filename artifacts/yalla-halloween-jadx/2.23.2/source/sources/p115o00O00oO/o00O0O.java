package p115o00O00oO;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f36151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36152OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Notification f36153OooO0OO;

    public o00O0O(int i, int i2, @NonNull Notification notification) {
        this.f36151OooO00o = i;
        this.f36153OooO0OO = notification;
        this.f36152OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00O0O.class != obj.getClass()) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        if (this.f36151OooO00o == o00o0o2.f36151OooO00o && this.f36152OooO0O0 == o00o0o2.f36152OooO0O0) {
            return this.f36153OooO0OO.equals(o00o0o2.f36153OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36153OooO0OO.hashCode() + (((this.f36151OooO00o * 31) + this.f36152OooO0O0) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f36151OooO00o + ", mForegroundServiceType=" + this.f36152OooO0O0 + ", mNotification=" + this.f36153OooO0OO + '}';
    }
}
