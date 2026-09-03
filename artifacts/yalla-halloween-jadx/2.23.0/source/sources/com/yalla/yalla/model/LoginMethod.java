package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/LoginMethod;", "", "isShowLogin", "", "isShowSign", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LoginMethod {
    public static final int $stable = 0;
    private final boolean isShowLogin;
    private final boolean isShowSign;

    public LoginMethod(boolean z, boolean z2) {
        this.isShowLogin = z;
        this.isShowSign = z2;
    }

    public static /* synthetic */ LoginMethod copy$default(LoginMethod loginMethod, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginMethod.isShowLogin;
        }
        if ((i & 2) != 0) {
            z2 = loginMethod.isShowSign;
        }
        return loginMethod.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsShowLogin() {
        return this.isShowLogin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsShowSign() {
        return this.isShowSign;
    }

    @NotNull
    public final LoginMethod copy(boolean isShowLogin, boolean isShowSign) {
        return new LoginMethod(isShowLogin, isShowSign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginMethod)) {
            return false;
        }
        LoginMethod loginMethod = (LoginMethod) other;
        return this.isShowLogin == loginMethod.isShowLogin && this.isShowSign == loginMethod.isShowSign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.isShowLogin;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isShowSign;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isShowLogin() {
        return this.isShowLogin;
    }

    public final boolean isShowSign() {
        return this.isShowSign;
    }

    @NotNull
    public String toString() {
        return "LoginMethod(isShowLogin=" + this.isShowLogin + ", isShowSign=" + this.isShowSign + ")";
    }
}
