package com.coloros.ocs.base.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.coloros.ocs.base.internal.safeparcel.AbstractSafeParcelable;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import p263o00ooOoo.y;
import p265o00ooo0.o00000;
import p266o00ooo00.Oooo0;
import p266o00ooo00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public class Status extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new o000oOoO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12650Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f12651OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12652OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public PendingIntent f12653OoooO0O;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f12650Oooo = i;
        this.f12652OoooO00 = i2;
        this.f12651OoooO0 = str;
        this.f12653OoooO0O = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.f12650Oooo == status.f12650Oooo && this.f12652OoooO00 == status.f12652OoooO00) {
                String str = this.f12651OoooO0;
                String str2 = status.f12651OoooO0;
                if (str == str2 || (str != null && str.equals(str2))) {
                    PendingIntent pendingIntent = this.f12653OoooO0O;
                    PendingIntent pendingIntent2 = status.f12653OoooO0O;
                    if (pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12650Oooo), Integer.valueOf(this.f12652OoooO00), this.f12651OoooO0, this.f12653OoooO0O});
    }

    public final String toString() {
        y yVar = new y(this);
        String strOooO00o = this.f12651OoooO0;
        if (strOooO00o == null) {
            int i = this.f12652OoooO00;
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
        yVar.OooO00o("statusCode", strOooO00o);
        yVar.OooO00o(ak.z, this.f12653OoooO0O);
        return yVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooO0O0 = o00000.OooO0O0(parcel, 20293);
        int i2 = this.f12652OoooO00;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.f12650Oooo;
        parcel.writeInt(263144);
        parcel.writeInt(i3);
        String str = this.f12651OoooO0;
        if (str != null) {
            int iOooO0O1 = o00000.OooO0O0(parcel, 2);
            parcel.writeString(str);
            o00000.OooO00o(parcel, iOooO0O1);
        }
        PendingIntent pendingIntent = this.f12653OoooO0O;
        if (pendingIntent != null) {
            int iOooO0O2 = o00000.OooO0O0(parcel, 3);
            pendingIntent.writeToParcel(parcel, i);
            o00000.OooO00o(parcel, iOooO0O2);
        }
        o00000.OooO00o(parcel, iOooO0O0);
    }
}
