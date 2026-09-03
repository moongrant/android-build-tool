package com.yalla.yalla.common.manager.error;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/common/manager/error/CommonError;", "", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "toString", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class CommonError {
    public static final int Account_Has_Deleted = 99909;
    public static final int Account_Suspension = 999004;
    public static final int Coin_Frozen = 999002;
    public static final int Coin_NotEnough = 999005;
    public static final int Coin_NotEnough_QuickRecharge = 9990050;
    public static final int Create_Room_Tips = 999008;
    public static final int Crystal_Frozen = 999003;
    public static final int Crystal_NotEnough = 999006;
    public static final int Device_Suspension = 999007;
    public static final int Friend_Has_This_Theme = 99911;
    public static final int He_Is_Not_Your_Friend = 99910;
    public static final int Other_Device_Login = 999001;
    private final int code;

    @NotNull
    private String message;
    public static final int $stable = 8;

    public CommonError(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CommonError(code=");
        sbOooO0o0.append(this.code);
        sbOooO0o0.append(", message='");
        return OooO.OooO00o(sbOooO0o0, this.message, "')");
    }

    public /* synthetic */ CommonError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
