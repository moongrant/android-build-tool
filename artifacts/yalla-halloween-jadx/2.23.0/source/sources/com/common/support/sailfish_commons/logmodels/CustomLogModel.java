package com.common.support.sailfish_commons.logmodels;

import androidx.annotation.Keep;
import androidx.compose.animation.Oooo000;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0017J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u000201J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\nJ\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004J\u0016\u00102\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0017J\u0016\u00102\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\nJ\u0016\u00102\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0004J\b\u00103\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR6\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 @BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R6\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 @BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u00064"}, d2 = {"Lcom/common/support/sailfish_commons/logmodels/CustomLogModel;", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", "()V", RemoteConfigConstants$RequestFieldKey.APP_VERSION, "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "doneAtTime", "", "getDoneAtTime", "()J", "iden", "getIden", "setIden", "level", "getLevel", "setLevel", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "networkAvailable", "", "getNetworkAvailable", "()Z", "setNetworkAvailable", "(Z)V", "networkType", "getNetworkType", "setNetworkType", "<set-?>", "", "", "opsExpand", "getOpsExpand", "()Ljava/util/Map;", NativeProtocol.WEB_DIALOG_PARAMS, "getParams", ViewHierarchyConstants.TAG_KEY, "getTag", "setTag", "time", "getTime", "setTime", "addOpsExpand", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "addParams", "toString", "sailfish-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CustomLogModel extends BaseModel {
    private boolean networkAvailable;

    @NotNull
    private String iden = "";

    @NotNull
    private String message = "";

    @NotNull
    private String level = "";

    @NotNull
    private String time = "";

    @NotNull
    private String appVersion = "";

    @NotNull
    private String networkType = "";

    @NotNull
    private String tag = "";

    @NotNull
    private Map<String, Object> params = new LinkedHashMap();

    @NotNull
    private Map<String, Object> opsExpand = new LinkedHashMap();
    private final long doneAtTime = System.currentTimeMillis();

    public final void addOpsExpand(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (key.length() == 0) {
            return;
        }
        this.opsExpand.put(key, value);
    }

    public final void addParams(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (key.length() == 0) {
            return;
        }
        this.params.put(key, value);
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final long getDoneAtTime() {
        return this.doneAtTime;
    }

    @NotNull
    public final String getIden() {
        return this.iden;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean getNetworkAvailable() {
        return this.networkAvailable;
    }

    @NotNull
    public final String getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final Map<String, Object> getOpsExpand() {
        return this.opsExpand;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setIden(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iden = str;
    }

    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setNetworkAvailable(boolean z) {
        this.networkAvailable = z;
    }

    public final void setNetworkType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkType = str;
    }

    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomLogModel(iden='");
        sb.append(this.iden);
        sb.append("', message='");
        sb.append(this.message);
        sb.append("', level='");
        sb.append(this.level);
        sb.append("', time='");
        sb.append(this.time);
        sb.append("', appVersion='");
        sb.append(this.appVersion);
        sb.append("', networkAvailable=");
        sb.append(this.networkAvailable);
        sb.append(", networkType='");
        sb.append(this.networkType);
        sb.append("', tag='");
        sb.append(this.tag);
        sb.append("', params=");
        sb.append(this.params);
        sb.append(", opsExpand=");
        sb.append(this.opsExpand);
        sb.append(", doneAtTime=");
        return Oooo000.OooO0OO(sb, this.doneAtTime, ')');
    }

    public final void addOpsExpand(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.opsExpand.put(key, Boolean.valueOf(value));
    }

    public final void addParams(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.params.put(key, Boolean.valueOf(value));
    }

    public final void addOpsExpand(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.opsExpand.put(key, Long.valueOf(value));
    }

    public final void addParams(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.params.put(key, Long.valueOf(value));
    }

    public final void addOpsExpand(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.opsExpand.put(key, Double.valueOf(value));
    }

    public final void addParams(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.length() == 0) {
            return;
        }
        this.params.put(key, Double.valueOf(value));
    }
}
