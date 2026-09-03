package p102o000oo;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f29801OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f29802OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Notification f29803OooO0OO;

    public OooOOO(int i, @NonNull Notification notification, int i2) {
        this.f29801OooO00o = i;
        this.f29803OooO0OO = notification;
        this.f29802OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOOO.class != obj.getClass()) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        if (this.f29801OooO00o == oooOOO.f29801OooO00o && this.f29802OooO0O0 == oooOOO.f29802OooO0O0) {
            return this.f29803OooO0OO.equals(oooOOO.f29803OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29803OooO0OO.hashCode() + (((this.f29801OooO00o * 31) + this.f29802OooO0O0) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f29801OooO00o + ", mForegroundServiceType=" + this.f29802OooO0O0 + ", mNotification=" + this.f29803OooO0OO + '}';
    }
}
