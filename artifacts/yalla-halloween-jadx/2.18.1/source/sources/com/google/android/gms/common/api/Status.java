package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.umeng.analytics.pro.ak;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    public final PendingIntent f15197Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    public final int f15198Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    public final int f15199Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    public final String f15200Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    public final ConnectionResult f15201OoooO00;

    @NonNull
    @VisibleForTesting
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);

    @NonNull
    @VisibleForTesting
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);

    @NonNull
    @ShowFirstParty
    public static final Status zza = new Status(17);

    @NonNull
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(id = 4) ConnectionResult connectionResult) {
        this.f15198Oooo0o = i;
        this.f15199Oooo0oO = i2;
        this.f15200Oooo0oo = str;
        this.f15197Oooo = pendingIntent;
        this.f15201OoooO00 = connectionResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f15198Oooo0o == status.f15198Oooo0o && this.f15199Oooo0oO == status.f15199Oooo0oO && Objects.equal(this.f15200Oooo0oo, status.f15200Oooo0oo) && Objects.equal(this.f15197Oooo, status.f15197Oooo) && Objects.equal(this.f15201OoooO00, status.f15201OoooO00);
    }

    @Nullable
    public ConnectionResult getConnectionResult() {
        return this.f15201OoooO00;
    }

    @Nullable
    public PendingIntent getResolution() {
        return this.f15197Oooo;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    @CanIgnoreReturnValue
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.f15199Oooo0oO;
    }

    @Nullable
    public String getStatusMessage() {
        return this.f15200Oooo0oo;
    }

    @VisibleForTesting
    public boolean hasResolution() {
        return this.f15197Oooo != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f15198Oooo0o), Integer.valueOf(this.f15199Oooo0oO), this.f15200Oooo0oo, this.f15197Oooo, this.f15201OoooO00);
    }

    public boolean isCanceled() {
        return this.f15199Oooo0oO == 16;
    }

    public boolean isInterrupted() {
        return this.f15199Oooo0oO == 14;
    }

    @CheckReturnValue
    public boolean isSuccess() {
        return this.f15199Oooo0oO <= 0;
    }

    public void startResolutionForResult(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.f15197Oooo;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add(ak.z, this.f15197Oooo);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f15197Oooo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f15198Oooo0o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final String zza() {
        String str = this.f15200Oooo0oo;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.f15199Oooo0oO);
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, null, null);
    }

    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i) {
        this(1, i, str, connectionResult.getResolution(), connectionResult);
    }
}
