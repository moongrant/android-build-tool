package com.yalla.yalla.data.db.model;

import android.support.v4.media.session.OooO0OO;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.code.android.util.o0OoOo0;
import com.facebook.AccessToken;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b.\b\u0007\u0018\u0000 N2\u00020\u0001:\u0002NOB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010M\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\"\u0010/\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001e\u00108\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R \u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\"\u0010>\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010D\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR \u0010G\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR \u0010J\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\b¨\u0006P"}, d2 = {"Lcom/yalla/yalla/data/db/model/BuriedPoint;", "", "()V", "appChannel", "", "getAppChannel", "()Ljava/lang/String;", "setAppChannel", "(Ljava/lang/String;)V", RemoteConfigConstants$RequestFieldKey.APP_VERSION, "getAppVersion", "setAppVersion", "carrier", "getCarrier", "setCarrier", "deviceBrand", "getDeviceBrand", "setDeviceBrand", "deviceId", "getDeviceId", "setDeviceId", "deviceModel", "getDeviceModel", "setDeviceModel", "eventId", "getEventId", "setEventId", "eventTime", "", "getEventTime", "()J", "setEventTime", "(J)V", "eventType", "", "getEventType", "()I", "setEventType", "(I)V", "extInfoEntity", "getExtInfoEntity", "()Ljava/lang/Object;", "setExtInfoEntity", "(Ljava/lang/Object;)V", "extInfoString", "getExtInfoString", "setExtInfoString", "id", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "ip", "getIp", "setIp", "os", "getOs", "setOs", "osVersion", "getOsVersion", "setOsVersion", ContributionFragment.ARG_1, "getRoomId", "()Ljava/lang/Long;", "setRoomId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "sessionId", "getSessionId", "setSessionId", "url", "getUrl", "setUrl", "userId", "getUserId", "setUserId", "toString", "Companion", "Factory", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Entity(tableName = "BuriedPointTable")
public final class BuriedPoint {

    @NotNull
    private static final String UNIQUE_SESSION_ID;

    @SerializedName("app_channel")
    @ColumnInfo(name = "app_channel")
    @Nullable
    private String appChannel;

    @SerializedName("app_version")
    @ColumnInfo(name = "app_version")
    @Nullable
    private String appVersion;

    @SerializedName("carrier")
    @ColumnInfo(name = "carrier")
    @Nullable
    private String carrier;

    @SerializedName("device_brand")
    @ColumnInfo(name = "device_brand")
    @Nullable
    private String deviceBrand;

    @SerializedName("device_id")
    @ColumnInfo(name = "device_id")
    @Nullable
    private String deviceId;

    @SerializedName("device_model")
    @ColumnInfo(name = "device_model")
    @Nullable
    private String deviceModel;

    @SerializedName("event_id")
    @ColumnInfo(name = "event_id")
    @Nullable
    private String eventId;

    @SerializedName("event_time")
    @ColumnInfo(name = "event_time")
    private long eventTime;

    @SerializedName("event_type")
    @ColumnInfo(name = "event_type")
    private int eventType;

    @SerializedName("ext_info")
    @Ignore
    @Nullable
    private Object extInfoEntity;

    @ColumnInfo(name = "ext_info")
    @Nullable
    private transient String extInfoString;

    @PrimaryKey(autoGenerate = true)
    @Nullable
    private Integer id;

    @SerializedName("ip")
    @ColumnInfo(name = "ip")
    @Nullable
    private String ip;

    @SerializedName("os")
    @ColumnInfo(name = "os")
    private int os;

    @SerializedName("os_version")
    @ColumnInfo(name = "os_version")
    @Nullable
    private String osVersion;

    @SerializedName("room_id")
    @ColumnInfo(name = "room_id")
    @Nullable
    private Long roomId;

    @SerializedName("session_id")
    @ColumnInfo(name = "session_id")
    @Nullable
    private String sessionId;

    @SerializedName("url")
    @ColumnInfo(name = "url")
    @Nullable
    private String url;

    @SerializedName(AccessToken.USER_ID_KEY)
    @ColumnInfo(name = AccessToken.USER_ID_KEY)
    @Nullable
    private String userId;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tJ(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/data/db/model/BuriedPoint$Factory;", "", "()V", "create", "Lcom/yalla/yalla/data/db/model/BuriedPoint;", "eventId", "", "url", "extInfo", "", "createClog", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory {
        public static final int $stable = 0;

        @NotNull
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BuriedPoint create$default(Factory factory, String str, String str2, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return factory.create(str, str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BuriedPoint createClog$default(Factory factory, String str, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return factory.createClog(str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final BuriedPoint create(@NotNull String eventId, @NotNull String url, @Nullable Map<String, ? extends Object> extInfo) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(url, "url");
            BuriedPoint buriedPoint = new BuriedPoint();
            buriedPoint.setDeviceId(o000000.OooO00o());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            buriedPoint.setUserId(l != null ? o0OoOo0.OooOOO0("", l) : null);
            buriedPoint.setOs(2);
            buriedPoint.setOsVersion(o000000.OooO0Oo());
            buriedPoint.setSessionId(BuriedPoint.UNIQUE_SESSION_ID);
            buriedPoint.setAppVersion(oo0o0Oo.OooO0Oo());
            buriedPoint.setAppChannel(oOO0.OooO00o(oOO0.f57167OooO00o));
            buriedPoint.setIp("");
            buriedPoint.setDeviceBrand(o000000.OooO0O0());
            buriedPoint.setDeviceModel(o000000.OooO0OO());
            Long value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
            if (value == null) {
                value = 0L;
            }
            buriedPoint.setRoomId(value);
            buriedPoint.setCarrier("");
            buriedPoint.setEventId(eventId);
            buriedPoint.setUrl(url);
            buriedPoint.setExtInfoEntity(extInfo);
            return buriedPoint;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final BuriedPoint createClog(@NotNull String url, @Nullable Map<String, ? extends Object> extInfo) {
            Intrinsics.checkNotNullParameter(url, "url");
            BuriedPoint buriedPoint = new BuriedPoint();
            buriedPoint.setDeviceId(o000000.OooO00o());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            buriedPoint.setUserId(l != null ? o0OoOo0.OooOOO0("", l) : null);
            buriedPoint.setOs(2);
            buriedPoint.setOsVersion(o000000.OooO0Oo());
            buriedPoint.setSessionId(BuriedPoint.UNIQUE_SESSION_ID);
            buriedPoint.setAppVersion(oo0o0Oo.OooO0Oo());
            buriedPoint.setAppChannel(oOO0.OooO00o(oOO0.f57167OooO00o));
            buriedPoint.setIp("");
            buriedPoint.setDeviceBrand(o000000.OooO0O0());
            buriedPoint.setDeviceModel(o000000.OooO0OO());
            Long value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
            if (value == null) {
                value = 0L;
            }
            buriedPoint.setRoomId(value);
            buriedPoint.setCarrier("");
            buriedPoint.setUrl(url);
            buriedPoint.setExtInfoEntity(extInfo);
            return buriedPoint;
        }
    }

    static {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        UNIQUE_SESSION_ID = string;
    }

    @Nullable
    public final String getAppChannel() {
        return this.appChannel;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    public final long getEventTime() {
        return this.eventTime;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @Nullable
    public final Object getExtInfoEntity() {
        return this.extInfoEntity;
    }

    @Nullable
    public final String getExtInfoString() {
        return this.extInfoString;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    public final int getOs() {
        return this.os;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    public final Long getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setAppChannel(@Nullable String str) {
        this.appChannel = str;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setCarrier(@Nullable String str) {
        this.carrier = str;
    }

    public final void setDeviceBrand(@Nullable String str) {
        this.deviceBrand = str;
    }

    public final void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setDeviceModel(@Nullable String str) {
        this.deviceModel = str;
    }

    public final void setEventId(@Nullable String str) {
        this.eventId = str;
    }

    public final void setEventTime(long j) {
        this.eventTime = j;
    }

    public final void setEventType(int i) {
        this.eventType = i;
    }

    public final void setExtInfoEntity(@Nullable Object obj) {
        this.extInfoEntity = obj;
    }

    public final void setExtInfoString(@Nullable String str) {
        this.extInfoString = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setIp(@Nullable String str) {
        this.ip = str;
    }

    public final void setOs(int i) {
        this.os = i;
    }

    public final void setOsVersion(@Nullable String str) {
        this.osVersion = str;
    }

    public final void setRoomId(@Nullable Long l) {
        this.roomId = l;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        String str = this.eventId;
        int i = this.eventType;
        String str2 = this.url;
        long j = this.eventTime;
        StringBuilder sb = new StringBuilder("BuriedPoint(id=");
        sb.append(num);
        sb.append(", eventId=");
        sb.append(str);
        sb.append(", eventType=");
        sb.append(i);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", eventTime=");
        return OooO0OO.OooO0O0(sb, j, ")");
    }
}
