package com.common.support.apmwrapper.model;

import com.facebook.AccessToken;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u00060"}, d2 = {"Lcom/common/support/apmwrapper/model/NormalLogModel;", "", "()V", "app_version", "", "getApp_version", "()Ljava/lang/String;", "setApp_version", "(Ljava/lang/String;)V", "level", "getLevel", "setLevel", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "network_available", "", "getNetwork_available", "()Z", "setNetwork_available", "(Z)V", "network_type", "getNetwork_type", "setNetwork_type", NativeProtocol.WEB_DIALOG_PARAMS, "", "platform", "getPlatform", "setPlatform", ViewHierarchyConstants.TAG_KEY, "getTag", "setTag", "time", "getTime", "setTime", AccessToken.USER_ID_KEY, "", "getUser_id", "()J", "setUser_id", "(J)V", "user_idx", "getUser_idx", "setUser_idx", "put", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "ApmWrapper_release"}, k = 1, mv = {1, 4, 0})
public final class NormalLogModel {

    @Nullable
    private String app_version;

    @Nullable
    private String level;

    @Nullable
    private String message;
    private boolean network_available;

    @Nullable
    private String network_type;
    private Map<String, String> params = new LinkedHashMap();

    @Nullable
    private String platform;

    @Nullable
    private String tag;

    @Nullable
    private String time;
    private long user_id;
    private long user_idx;

    @Nullable
    public final String getApp_version() {
        return this.app_version;
    }

    @Nullable
    public final String getLevel() {
        return this.level;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final boolean getNetwork_available() {
        return this.network_available;
    }

    @Nullable
    public final String getNetwork_type() {
        return this.network_type;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final long getUser_idx() {
        return this.user_idx;
    }

    public final void put(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.params.put(key, value);
    }

    public final void setApp_version(@Nullable String str) {
        this.app_version = str;
    }

    public final void setLevel(@Nullable String str) {
        this.level = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setNetwork_available(boolean z) {
        this.network_available = z;
    }

    public final void setNetwork_type(@Nullable String str) {
        this.network_type = str;
    }

    public final void setPlatform(@Nullable String str) {
        this.platform = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }

    public final void setUser_id(long j) {
        this.user_id = j;
    }

    public final void setUser_idx(long j) {
        this.user_idx = j;
    }
}
