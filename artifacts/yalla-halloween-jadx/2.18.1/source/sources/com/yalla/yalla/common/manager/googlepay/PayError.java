package com.yalla.yalla.common.manager.googlepay;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p058o0000OoO.OooO;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/PayError;", "", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "toString", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PayError {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ERROR_AUTHORIZATION_FAILED = -108;
    public static final int ERROR_CONNECT_FAILED = -102;
    public static final int ERROR_INIT_SDK = -107;
    public static final int ERROR_INVALID_CARD = -110;
    public static final int ERROR_INVALID_CUSTOMER_ID = -112;
    public static final int ERROR_INVALID_TRANSACTION_MODE = -112;
    public static final int ERROR_ITEM_ALREADY_OWNED = -105;
    public static final int ERROR_NO_SDK = -101;
    public static final int ERROR_PARAMS_IS_NULL = -113;
    public static final int ERROR_PAYMENT_FAILED = -109;
    public static final int ERROR_PURCHASES_TOKEN_IS_NULL = -104;
    public static final int ERROR_SESSION_FAILED_TO_START = -111;
    public static final int ERROR_UNKNOWN = -103;
    public static final int ERROR_USER_CANCELLED = -106;
    public static final int SUCCESS = 0;
    private final int code;

    @NotNull
    private final String message;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u0014J\u0006\u0010\"\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/PayError$Companion;", "", "()V", "ERROR_AUTHORIZATION_FAILED", "", "ERROR_CONNECT_FAILED", "ERROR_INIT_SDK", "ERROR_INVALID_CARD", "ERROR_INVALID_CUSTOMER_ID", "ERROR_INVALID_TRANSACTION_MODE", "ERROR_ITEM_ALREADY_OWNED", "ERROR_NO_SDK", "ERROR_PARAMS_IS_NULL", "ERROR_PAYMENT_FAILED", "ERROR_PURCHASES_TOKEN_IS_NULL", "ERROR_SESSION_FAILED_TO_START", "ERROR_UNKNOWN", "ERROR_USER_CANCELLED", "SUCCESS", "errorAuthorizationFailedMessage", "", "errorConnectFailedMessage", "errorInitSdkMessage", "errorInvalidCardMessage", "errorInvalidCustomerIdMessage", "errorInvalidTransactionModeMessage", "errorItemAlreadyOwnedMessage", "errorNoSdkMessage", "errorParamsIsNullMessage", "errorPaymentFailedMessage", "errorPurchasesTokenIsNullMessage", "errorSessionFailedToStartMessage", "errorUnknownMessage", "errorUserCancelledMessage", "successMessage", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String errorAuthorizationFailedMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Authorization_Failed);
        }

        @NotNull
        public final String errorConnectFailedMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Connect_Failed);
        }

        @NotNull
        public final String errorInitSdkMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_SDK_Init_Error);
        }

        @NotNull
        public final String errorInvalidCardMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Invalid_Card);
        }

        @NotNull
        public final String errorInvalidCustomerIdMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Invalid_Customer_ID);
        }

        @NotNull
        public final String errorInvalidTransactionModeMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Invalid_Transaction_Mode);
        }

        @NotNull
        public final String errorItemAlreadyOwnedMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Commodity_Already_Owned);
        }

        @NotNull
        public final String errorNoSdkMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_SDK_Does_Not_Exist);
        }

        @NotNull
        public final String errorParamsIsNullMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Params_Is_Null);
        }

        @NotNull
        public final String errorPaymentFailedMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Failed);
        }

        @NotNull
        public final String errorPurchasesTokenIsNullMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Purchases_Token_Is_Null);
        }

        @NotNull
        public final String errorSessionFailedToStartMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Session_Failed_To_Start);
        }

        @NotNull
        public final String errorUnknownMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Unknown_Error);
        }

        @NotNull
        public final String errorUserCancelledMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_User_Cancelled_Payment);
        }

        @NotNull
        public final String successMessage() {
            return o000O0O0.OooO0OO(R.string.Pay_Successful);
        }
    }

    public PayError(int i, @NotNull String message) {
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

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PayError(code=");
        sbOooO0o0.append(this.code);
        sbOooO0o0.append(", message='");
        return OooO.OooO00o(sbOooO0o0, this.message, "')");
    }
}
