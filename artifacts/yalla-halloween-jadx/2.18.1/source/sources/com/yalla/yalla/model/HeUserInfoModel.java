package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.UserInfoModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/HeUserInfoModel;", "", "()V", "data", "", "Lcom/yalla/yalla/common/model/UserInfoModel;", "getData", "()Ljava/util/List;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HeUserInfoModel {
    public static final int $stable = 8;

    @Nullable
    private final List<UserInfoModel> data;

    @Nullable
    public final List<UserInfoModel> getData() {
        return this.data;
    }
}
