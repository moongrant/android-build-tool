package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/common/model/UserSupportRank;", "", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "data", "Lcom/yalla/yalla/common/model/SupportInfo;", "(ILjava/lang/String;Lcom/yalla/yalla/common/model/SupportInfo;)V", "getCode", "()I", "setCode", "(I)V", "getData", "()Lcom/yalla/yalla/common/model/SupportInfo;", "setData", "(Lcom/yalla/yalla/common/model/SupportInfo;)V", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class UserSupportRank {
    public static final int $stable = 8;
    private int code;

    @Nullable
    private SupportInfo data;

    @NotNull
    private final String message;

    public UserSupportRank() {
        this(0, null, null, 7, null);
    }

    public UserSupportRank(int i, @NotNull String message, @Nullable SupportInfo supportInfo) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
        this.data = supportInfo;
    }

    public static /* synthetic */ UserSupportRank copy$default(UserSupportRank userSupportRank, int i, String str, SupportInfo supportInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSupportRank.code;
        }
        if ((i2 & 2) != 0) {
            str = userSupportRank.message;
        }
        if ((i2 & 4) != 0) {
            supportInfo = userSupportRank.data;
        }
        return userSupportRank.copy(i, str, supportInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SupportInfo getData() {
        return this.data;
    }

    @NotNull
    public final UserSupportRank copy(int code2, @NotNull String message, @Nullable SupportInfo data) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new UserSupportRank(code2, message, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSupportRank)) {
            return false;
        }
        UserSupportRank userSupportRank = (UserSupportRank) other;
        return this.code == userSupportRank.code && Intrinsics.areEqual(this.message, userSupportRank.message) && Intrinsics.areEqual(this.data, userSupportRank.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final SupportInfo getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.message, this.code * 31, 31);
        SupportInfo supportInfo = this.data;
        return iOooO00o + (supportInfo == null ? 0 : supportInfo.hashCode());
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable SupportInfo supportInfo) {
        this.data = supportInfo;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UserSupportRank(code=");
        sbOooO0o0.append(this.code);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append(", data=");
        sbOooO0o0.append(this.data);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public /* synthetic */ UserSupportRank(int i, String str, SupportInfo supportInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : supportInfo);
    }
}
