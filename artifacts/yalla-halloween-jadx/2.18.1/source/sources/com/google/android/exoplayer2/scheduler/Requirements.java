package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import com.facebook.internal.AnalyticsEvents;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f14600Oooo0o;

    public class OooO00o implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i) {
            return new Requirements[i];
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i) {
        this.f14600Oooo0o = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    public final int OooO00o(Context context) {
        int i;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        boolean zIsDeviceIdleMode;
        int intExtra;
        if ((this.f14600Oooo0o & 1) != 0) {
            Object systemService = context.getSystemService("connectivity");
            Objects.requireNonNull(systemService);
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i = this.f14600Oooo0o & 3;
            } else {
                if (o000OOo0.f36740OooO00o < 24 || !((activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16))) {
                    if (((this.f14600Oooo0o & 2) != 0) && connectivityManager.isActiveNetworkMetered()) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                } else {
                    i = this.f14600Oooo0o & 3;
                }
            }
        } else {
            i = 0;
        }
        if ((this.f14600Oooo0o & 8) != 0) {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (!(intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1)) == 2 || intExtra == 5))) {
                i |= 8;
            }
        }
        if ((this.f14600Oooo0o & 4) != 0) {
            Object systemService2 = context.getSystemService("power");
            Objects.requireNonNull(systemService2);
            PowerManager powerManager = (PowerManager) systemService2;
            int i2 = o000OOo0.f36740OooO00o;
            if (i2 >= 23) {
                zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
            } else {
                zIsDeviceIdleMode = i2 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
            }
            if (!zIsDeviceIdleMode) {
                i |= 4;
            }
        }
        if ((this.f14600Oooo0o & 16) != 0) {
            return !(context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i | 16 : i;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f14600Oooo0o == ((Requirements) obj).f14600Oooo0o;
    }

    public final int hashCode() {
        return this.f14600Oooo0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14600Oooo0o);
    }
}
