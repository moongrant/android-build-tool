package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.AccessToken;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/model/InstagramTokenModel;", "", "()V", "access_token", "", "getAccess_token", "()Ljava/lang/String;", AccessToken.USER_ID_KEY, "getUser_id", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InstagramTokenModel {
    public static final int $stable = 0;

    @NotNull
    private final String access_token = "";

    @NotNull
    private final String user_id = "";

    @NotNull
    public final String getAccess_token() {
        return this.access_token;
    }

    @NotNull
    public final String getUser_id() {
        return this.user_id;
    }
}
