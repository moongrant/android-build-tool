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
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 1)
    public final Intent f14094OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("this")
    public OooO f14095OooO0o0;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@NonNull @SafeParcelable.Param(id = 1) Intent intent) {
        this.f14094OooO0Oo = intent;
    }

    @Nullable
    public String getCollapseKey() {
        return this.f14094OooO0Oo.getStringExtra("collapse_key");
    }

    @NonNull
    public synchronized Map<String, String> getData() {
        if (this.f14095OooO0o0 == null) {
            Bundle extras = this.f14094OooO0Oo.getExtras();
            OooO oooO = new OooO();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith("google.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                            oooO.put(str, str2);
                        }
                    }
                }
            }
            this.f14095OooO0o0 = oooO;
        }
        return this.f14095OooO0o0;
    }

    @Nullable
    public String getFrom() {
        return this.f14094OooO0Oo.getStringExtra("from");
    }

    @NonNull
    public Intent getIntent() {
        return this.f14094OooO0Oo;
    }

    @Nullable
    public String getMessageId() {
        Intent intent = this.f14094OooO0Oo;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Nullable
    public String getMessageType() {
        return this.f14094OooO0Oo.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        Intent intent = this.f14094OooO0Oo;
        String stringExtra = intent.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        return "normal".equals(stringExtra) ? 2 : 0;
    }

    public int getPriority() {
        Intent intent = this.f14094OooO0Oo;
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        return "normal".equals(stringExtra) ? 2 : 0;
    }

    @Nullable
    public byte[] getRawData() {
        return this.f14094OooO0Oo.getByteArrayExtra("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.f14094OooO0Oo.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Bundle extras = this.f14094OooO0Oo.getExtras();
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
        return this.f14094OooO0Oo.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle extras = this.f14094OooO0Oo.getExtras();
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
        SafeParcelWriter.writeParcelable(parcel, 1, this.f14094OooO0Oo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
