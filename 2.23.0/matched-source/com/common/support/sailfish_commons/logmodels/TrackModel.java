package com.common.support.sailfish_commons.logmodels;

import androidx.annotation.Keep;
import androidx.compose.animation.Oooo000;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020HJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020IJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u001fJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0004J\b\u0010J\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001a\u0010(\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR6\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000201002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020100@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001a\u0010>\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\b¨\u0006K"}, d2 = {"Lcom/common/support/sailfish_commons/logmodels/TrackModel;", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", "()V", "appChannel", "", "getAppChannel", "()Ljava/lang/String;", "setAppChannel", "(Ljava/lang/String;)V", "appEnv", "", "getAppEnv", "()I", "setAppEnv", "(I)V", "appName", "getAppName", "setAppName", RemoteConfigConstants$RequestFieldKey.APP_VERSION, "getAppVersion", "setAppVersion", "carrier", "getCarrier", "setCarrier", "deviceBrand", "getDeviceBrand", "setDeviceBrand", "deviceModel", "getDeviceModel", "setDeviceModel", "doneAtTime", "", "getDoneAtTime", "()J", "eventId", "getEventId", "setEventId", "eventName", "getEventName", "setEventName", "eventTime", "getEventTime", "setEventTime", "(J)V", "eventType", "getEventType", "setEventType", "<set-?>", "", "", "extInfo", "getExtInfo", "()Ljava/util/Map;", "networkType", "getNetworkType", "setNetworkType", "osVersion", "getOsVersion", "setOsVersion", "url", "getUrl", "setUrl", "userId", "getUserId", "setUserId", "uuid", "getUuid", "setUuid", "addExtInfo", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "", "toString", "sailfish-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TrackModel extends BaseModel {
    private int appEnv;
    private long eventTime;
    private int eventType;
    private int networkType;

    @NotNull
    private String uuid = "";

    @NotNull
    private String userId = "";

    @NotNull
    private String osVersion = "";

    @NotNull
    private String url = "";

    @NotNull
    private String eventId = "";

    @NotNull
    private String eventName = "";

    @NotNull
    private String appName = "";

    @NotNull
    private String appVersion = "";

    @NotNull
    private String appChannel = "";

    @NotNull
    private String deviceBrand = "";

    @NotNull
    private String deviceModel = "";

    @NotNull
    private String carrier = "";

    @NotNull
    private Map<String, Object> extInfo = new LinkedHashMap();
    private final long doneAtTime = System.currentTimeMillis();

    public final void addExtInfo(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (key.length() == 0) {
            return;
        }
        this.extInfo.put(key, value);
    }

    @NotNull
    public final String getAppChannel() {
        return this.appChannel;
    }

    public final int getAppEnv() {
        return this.appEnv;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getCarrier() {
        return this.carrier;
    }

    @NotNull
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final long getDoneAtTime() {
        return this.doneAtTime;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @NotNull
    public final Map<String, Object> getExtInfo() {
        return this.extInfo;
    }

    public final int getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final void setAppChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appChannel = str;
    }

    public final void setAppEnv(int i) {
        this.appEnv = i;
    }

    public final void setAppName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appName = str;
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setCarrier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.carrier = str;
    }

    public final void setDeviceBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceBrand = str;
    }

    public final void setDeviceModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceModel = str;
    }

    public final void setEventId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setEventTime(long j) {
        this.eventTime = j;
    }

    public final void setEventType(int i) {
        this.eventType = i;
    }

    public final void setNetworkType(int i) {
        this.networkType = i;
    }

    public final void setOsVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVersion = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TrackModel(uuid='");
        sb.append(this.uuid);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', osVersion='");
        sb.append(this.osVersion);
        sb.append("', eventTime=");
        sb.append(this.eventTime);
        sb.append(", url='");
        sb.append(this.url);
        sb.append("', eventId='");
        sb.append(this.eventId);
        sb.append("', eventName='");
        sb.append(this.eventName);
        sb.append("', eventType=");
        sb.append(this.eventType);
        sb.append(", appName='");
        sb.append(this.appName);
        sb.append("', appVersion='");
        sb.append(this.appVersion);
        sb.append("', appChannel='");
        sb.append(this.appChannel);
        sb.append("', appEnv=");
        sb.append(this.appEnv);
        sb.append(", networkType=");
        sb.append(this.networkType);
        sb.append(", deviceBrand='");
        sb.append(this.deviceBrand);
        sb.append("', deviceModel='");
        sb.append(this.deviceModel);
        sb.append("', carrier='");
        sb.append(this.carrier);
        sb.append("', extInfo=");
        sb.append(this.extInfo);
        sb.append(", doneAtTime=");
        return Oooo000.OooO0OO(sb, this.doneAtTime, ')');
    }

    public final void addExtInfo(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.extInfo.put(key, Boolean.valueOf(value));
    }

    public final void addExtInfo(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.extInfo.put(key, Long.valueOf(value));
    }

    public final void addExtInfo(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.extInfo.put(key, Double.valueOf(value));
    }
}
