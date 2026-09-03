package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new o000000O();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final Bundle f19818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p190o00o0O.OooO f19819OooO0o0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f19818OooO0Oo = bundle;
    }

    @NonNull
    public final Map<String, String> getData() {
        if (this.f19819OooO0o0 == null) {
            p190o00o0O.OooO oooO = new p190o00o0O.OooO();
            Bundle bundle = this.f19818OooO0Oo;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        oooO.put(str, str2);
                    }
                }
            }
            this.f19819OooO0o0 = oooO;
        }
        return this.f19819OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f19818OooO0Oo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
