package com.coloros.ocs.base.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.ocs.base.internal.safeparcel.AbstractSafeParcelable;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import p262o00ooOoo.v;
import p264o00ooo0.o00000;
import p265o00ooo00.Oooo0;
import p265o00ooo00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public class Status extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new o000oOoO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public PendingIntent f12635Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f12636Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12637Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f12638Oooo0oo;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f12636Oooo0o = i;
        this.f12637Oooo0oO = i2;
        this.f12638Oooo0oo = str;
        this.f12635Oooo = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.f12636Oooo0o == status.f12636Oooo0o && this.f12637Oooo0oO == status.f12637Oooo0oO) {
                String str = this.f12638Oooo0oo;
                String str2 = status.f12638Oooo0oo;
                if (str == str2 || (str != null && str.equals(str2))) {
                    PendingIntent pendingIntent = this.f12635Oooo;
                    PendingIntent pendingIntent2 = status.f12635Oooo;
                    if (pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12636Oooo0o), Integer.valueOf(this.f12637Oooo0oO), this.f12638Oooo0oo, this.f12635Oooo});
    }

    public final String toString() {
        v vVar = new v(this);
        String strOooO00o = this.f12638Oooo0oo;
        if (strOooO00o == null) {
            int i = this.f12637Oooo0oO;
            switch (i) {
                case -1:
                    strOooO00o = "SUCCESS_CACHE";
                    break;
                case 0:
                    strOooO00o = "SUCCESS";
                    break;
                case 1:
                    strOooO00o = "CONNECTED";
                    break;
                case 2:
                    strOooO00o = "CONNECTING";
                    break;
                case 3:
                    strOooO00o = "CONNECT_FAILED";
                    break;
                case 4:
                    strOooO00o = "DISCONNECT";
                    break;
                case 5:
                    strOooO00o = "SUCCESS_UNBIND";
                    break;
                case 6:
                    strOooO00o = "CANCELED";
                    break;
                case 7:
                    strOooO00o = "INTERNAL_ERROR";
                    break;
                case 8:
                    strOooO00o = "TASK_NULL";
                    break;
                case 9:
                    strOooO00o = "INTERRUPTED";
                    break;
                case 10:
                    strOooO00o = "TIMEOUT";
                    break;
                case 11:
                    strOooO00o = "API_NOT_CONNECTED";
                    break;
                case 12:
                    strOooO00o = "CLIENT_UNKNOWN";
                    break;
                case 13:
                    strOooO00o = "SERVICE_ABNORMAL_EXIT";
                    break;
                case 14:
                    strOooO00o = "RECONNECTING";
                    break;
                default:
                    switch (i) {
                        case 1001:
                            strOooO00o = "AUTHENTICATE_SUCCESS";
                            break;
                        case 1002:
                            strOooO00o = "AUTHENTICATE_FAIL";
                            break;
                        case 1003:
                            strOooO00o = "TIME_EXPIRED";
                            break;
                        case 1004:
                            strOooO00o = "AUTHCODE_EXPECTED";
                            break;
                        case 1005:
                            strOooO00o = "VERSION_INCOMPATIBLE";
                            break;
                        case 1006:
                            strOooO00o = "AUTHCODE_RECYCLE";
                            break;
                        case 1007:
                            strOooO00o = "AUTHCODE_INVALID";
                            break;
                        case 1008:
                            strOooO00o = "CAPABILITY_EXCEPTION";
                            break;
                        default:
                            strOooO00o = Oooo0.OooO00o(32, "unknown status code: ", i);
                            break;
                    }
                    break;
            }
        }
        vVar.OooO00o("statusCode", strOooO00o);
        vVar.OooO00o(ak.z, this.f12635Oooo);
        return vVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooO0O0 = o00000.OooO0O0(parcel, 20293);
        int i2 = this.f12637Oooo0oO;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f12636Oooo0o;
        parcel.writeInt(263144);
        parcel.writeInt(i3);
        String str = this.f12638Oooo0oo;
        if (str != null) {
            int iOooO0O1 = o00000.OooO0O0(parcel, 2);
            parcel.writeString(str);
            o00000.OooO00o(parcel, iOooO0O1);
        }
        PendingIntent pendingIntent = this.f12635Oooo;
        if (pendingIntent != null) {
            int iOooO0O2 = o00000.OooO0O0(parcel, 3);
            pendingIntent.writeToParcel(parcel, i);
            o00000.OooO00o(parcel, iOooO0O2);
        }
        o00000.OooO00o(parcel, iOooO0O0);
    }
}
