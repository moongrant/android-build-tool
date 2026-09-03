package com.coloros.ocs.base.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.OooO0OO;
import com.coloros.ocs.base.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p210o00o0oo.o0O0000O;
import p211o00o0oo0.o00;
import p212o00o0ooo.o0O00OOO;

/* JADX INFO: loaded from: classes2.dex */
public class Status extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new o0O0000O();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f13563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f13564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f13565OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final PendingIntent f13566OooO0oO;

    public Status(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f13563OooO0Oo = i;
        this.f13565OooO0o0 = i2;
        this.f13564OooO0o = str;
        this.f13566OooO0oO = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f13563OooO0Oo != status.f13563OooO0Oo || this.f13565OooO0o0 != status.f13565OooO0o0) {
            return false;
        }
        String str = this.f13564OooO0o;
        String str2 = status.f13564OooO0o;
        if (!(str == str2 || (str != null && str.equals(str2)))) {
            return false;
        }
        PendingIntent pendingIntent = this.f13566OooO0oO;
        PendingIntent pendingIntent2 = status.f13566OooO0oO;
        return pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13563OooO0Oo), Integer.valueOf(this.f13565OooO0o0), this.f13564OooO0o, this.f13566OooO0oO});
    }

    public final String toString() {
        o00 o00Var = new o00(this);
        String strOooO00o = this.f13564OooO0o;
        if (strOooO00o == null) {
            int i = this.f13565OooO0o0;
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
                            strOooO00o = OooO0OO.OooO00o(32, "unknown status code: ", i);
                            break;
                    }
                    break;
            }
        }
        o00Var.OooO00o(strOooO00o, "statusCode");
        o00Var.OooO00o(this.f13566OooO0oO, "resolution");
        return o00Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(262145);
        parcel.writeInt(this.f13565OooO0o0);
        parcel.writeInt(263144);
        parcel.writeInt(this.f13563OooO0Oo);
        String str = this.f13564OooO0o;
        if (str != null) {
            parcel.writeInt(-65534);
            parcel.writeInt(0);
            int iDataPosition2 = parcel.dataPosition();
            parcel.writeString(str);
            o0O00OOO.OooO00o(parcel, iDataPosition2);
        }
        PendingIntent pendingIntent = this.f13566OooO0oO;
        if (pendingIntent != null) {
            parcel.writeInt(-65533);
            parcel.writeInt(0);
            int iDataPosition3 = parcel.dataPosition();
            pendingIntent.writeToParcel(parcel, i);
            o0O00OOO.OooO00o(parcel, iDataPosition3);
        }
        o0O00OOO.OooO00o(parcel, iDataPosition);
    }
}
