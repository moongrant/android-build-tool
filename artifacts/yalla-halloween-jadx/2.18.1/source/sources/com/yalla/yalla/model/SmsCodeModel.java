package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/SmsCodeModel;", "", "()V", ak.aT, "", "getInterval", "()Ljava/lang/String;", "msgrandom", "getMsgrandom", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SmsCodeModel {
    public static final int $stable = 0;

    @NotNull
    private final String interval = "-1";

    @NotNull
    private final String msgrandom = "-1";

    @NotNull
    public final String getInterval() {
        return this.interval;
    }

    @NotNull
    public final String getMsgrandom() {
        return this.msgrandom;
    }
}
