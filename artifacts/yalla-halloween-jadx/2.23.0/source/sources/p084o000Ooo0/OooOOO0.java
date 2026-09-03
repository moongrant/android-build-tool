package p084o000Ooo0;

import android.app.Notification;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35102OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Notification f35104OooO0OO;

    public OooOOO0(int i, int i2, @NonNull Notification notification) {
        this.f35102OooO00o = i;
        this.f35104OooO0OO = notification;
        this.f35103OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOOO0.class != obj.getClass()) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (this.f35102OooO00o == oooOOO0.f35102OooO00o && this.f35103OooO0O0 == oooOOO0.f35103OooO0O0) {
            return this.f35104OooO0OO.equals(oooOOO0.f35104OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35104OooO0OO.hashCode() + (((this.f35102OooO00o * 31) + this.f35103OooO0O0) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f35102OooO00o + ", mForegroundServiceType=" + this.f35103OooO0O0 + ", mNotification=" + this.f35104OooO0OO + '}';
    }
}
