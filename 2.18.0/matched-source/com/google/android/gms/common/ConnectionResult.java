package com.google.android.gms.common;

import OooO0O0.OooO00o;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.umeng.analytics.pro.ak;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final int DEVELOPER_ERROR = 10;

    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    @KeepForSdk
    public static final int UNKNOWN = -1;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15126Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getResolution", id = 3)
    public final PendingIntent f15127OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorCode", id = 2)
    public final int f15128OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    public final String f15129OoooO0O;

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @Nullable @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(id = 4) String str) {
        this.f15126Oooo = i;
        this.f15128OoooO00 = i2;
        this.f15127OoooO0 = pendingIntent;
        this.f15129OoooO0O = str;
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this.f15126Oooo = 1;
        this.f15128OoooO00 = i;
        this.f15127OoooO0 = pendingIntent;
        this.f15129OoooO0O = str;
    }

    @NonNull
    public static String OooO00o(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return OooO00o.OooO00o("UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f15128OoooO00 == connectionResult.f15128OoooO00 && Objects.equal(this.f15127OoooO0, connectionResult.f15127OoooO0) && Objects.equal(this.f15129OoooO0O, connectionResult.f15129OoooO0O);
    }

    public int getErrorCode() {
        return this.f15128OoooO00;
    }

    @Nullable
    public String getErrorMessage() {
        return this.f15129OoooO0O;
    }

    @Nullable
    public PendingIntent getResolution() {
        return this.f15127OoooO0;
    }

    public boolean hasResolution() {
        return (this.f15128OoooO00 == 0 || this.f15127OoooO0 == null) ? false : true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f15128OoooO00), this.f15127OoooO0, this.f15129OoooO0O);
    }

    public boolean isSuccess() {
        return this.f15128OoooO00 == 0;
    }

    public void startResolutionForResult(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.f15127OoooO0;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("statusCode", OooO00o(this.f15128OoooO00));
        stringHelper.add(ak.z, this.f15127OoooO0);
        stringHelper.add(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, this.f15129OoooO0O);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15126Oooo);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCode());
        SafeParcelWriter.writeParcelable(parcel, 3, getResolution(), i, false);
        SafeParcelWriter.writeString(parcel, 4, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }
}
