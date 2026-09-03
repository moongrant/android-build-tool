package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.user.MyUserInfoModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/LoginListModel;", "", "()V", "data", "", "Lcom/yalla/yalla/model/user/MyUserInfoModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isFirst", "", "()Z", "setFirst", "(Z)V", "token", "Lcom/yalla/yalla/model/LoginToken;", "getToken", "()Lcom/yalla/yalla/model/LoginToken;", "setToken", "(Lcom/yalla/yalla/model/LoginToken;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoginListModel {
    public static final int $stable = 8;

    @Nullable
    private List<MyUserInfoModel> data;
    private boolean isFirst;

    @Nullable
    private LoginToken token;

    @Nullable
    public final List<MyUserInfoModel> getData() {
        return this.data;
    }

    @Nullable
    public final LoginToken getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: isFirst, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    public final void setData(@Nullable List<MyUserInfoModel> list) {
        this.data = list;
    }

    public final void setFirst(boolean z) {
        this.isFirst = z;
    }

    public final void setToken(@Nullable LoginToken loginToken) {
        this.token = loginToken;
    }
}
