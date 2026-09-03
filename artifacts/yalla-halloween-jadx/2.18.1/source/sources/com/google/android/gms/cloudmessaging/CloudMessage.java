package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 1)
    public Intent f15070Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @GuardedBy("this")
    public Map<String, String> f15071Oooo0oO;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@NonNull @SafeParcelable.Param(id = 1) Intent intent) {
        this.f15070Oooo0o = intent;
    }

    public static int OooO00o(@Nullable String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.f15070Oooo0o.getStringExtra("collapse_key");
    }

    @NonNull
    public synchronized Map<String, String> getData() {
        if (this.f15071Oooo0oO == null) {
            Bundle extras = this.f15070Oooo0o.getExtras();
            Oooo0 oooo0 = new Oooo0();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith("google.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                            oooo0.put(str, str2);
                        }
                    }
                }
            }
            this.f15071Oooo0oO = oooo0;
        }
        return this.f15071Oooo0oO;
    }

    @Nullable
    public String getFrom() {
        return this.f15070Oooo0o.getStringExtra("from");
    }

    @NonNull
    public Intent getIntent() {
        return this.f15070Oooo0o;
    }

    @Nullable
    public String getMessageId() {
        String stringExtra = this.f15070Oooo0o.getStringExtra("google.message_id");
        return stringExtra == null ? this.f15070Oooo0o.getStringExtra("message_id") : stringExtra;
    }

    @Nullable
    public String getMessageType() {
        return this.f15070Oooo0o.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        String stringExtra = this.f15070Oooo0o.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = this.f15070Oooo0o.getStringExtra("google.priority");
        }
        return OooO00o(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.f15070Oooo0o.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(this.f15070Oooo0o.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = this.f15070Oooo0o.getStringExtra("google.priority");
        }
        return OooO00o(stringExtra);
    }

    @Nullable
    public byte[] getRawData() {
        return this.f15070Oooo0o.getByteArrayExtra("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.f15070Oooo0o.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Bundle extras = this.f15070Oooo0o.getExtras();
        Object obj = extras != null ? extras.get("google.sent_time") : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(strValueOf);
            Log.w("CloudMessage", sb.toString());
            return 0L;
        }
    }

    @Nullable
    public String getTo() {
        return this.f15070Oooo0o.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle extras = this.f15070Oooo0o.getExtras();
        Object obj = extras != null ? extras.get("google.ttl") : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w("CloudMessage", sb.toString());
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f15070Oooo0o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
