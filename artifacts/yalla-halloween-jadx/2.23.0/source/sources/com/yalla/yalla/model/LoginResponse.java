package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.http.Response;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/LoginResponse;", "Model", "Lcom/yalla/yalla/model/http/Response;", "()V", "isFirst", "", "()Z", "setFirst", "(Z)V", "token", "Lcom/yalla/yalla/model/LoginToken;", "getToken", "()Lcom/yalla/yalla/model/LoginToken;", "setToken", "(Lcom/yalla/yalla/model/LoginToken;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoginResponse<Model> extends Response<Model> {
    public static final int $stable = 8;
    private boolean isFirst;

    @Nullable
    private LoginToken token;

    public LoginResponse() {
        super(false, null, false, null, 15, null);
    }

    @Nullable
    public final LoginToken getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: isFirst, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    public final void setFirst(boolean z) {
        this.isFirst = z;
    }

    public final void setToken(@Nullable LoginToken loginToken) {
        this.token = loginToken;
    }
}
