package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/model/ApiError1005;", "", "()V", "data", "Lcom/yalla/yalla/common/model/ApiError1005$ApiError1005Data;", "getData", "()Lcom/yalla/yalla/common/model/ApiError1005$ApiError1005Data;", "setData", "(Lcom/yalla/yalla/common/model/ApiError1005$ApiError1005Data;)V", "ApiError1005Data", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApiError1005 {
    public static final int $stable = 8;

    @Nullable
    private ApiError1005Data data;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019¨\u0006!"}, d2 = {"Lcom/yalla/yalla/common/model/ApiError1005$ApiError1005Data;", "", "()V", "blockingMsg", "", "getBlockingMsg", "()Ljava/lang/String;", "setBlockingMsg", "(Ljava/lang/String;)V", "deBlockingTime", "getDeBlockingTime", "setDeBlockingTime", "endTime", "getEndTime", "setEndTime", "isInLoginShow", "", "()Z", "setInLoginShow", "(Z)V", "prettyId", "", "getPrettyId", "()J", "setPrettyId", "(J)V", "reason", "getReason", "setReason", "userId", "getUserId", "setUserId", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApiError1005Data {
        public static final int $stable = 8;

        @Nullable
        private String blockingMsg;

        @SerializedName("DeblockingTime")
        @Nullable
        private String deBlockingTime;
        private boolean isInLoginShow;

        @SerializedName("PrettyId")
        private long prettyId;

        @SerializedName("UserId")
        private long userId;

        @SerializedName("EndTime")
        @NotNull
        private String endTime = "";

        @SerializedName("Reason")
        @NotNull
        private String reason = "";

        @Nullable
        public final String getBlockingMsg() {
            return this.blockingMsg;
        }

        @Nullable
        public final String getDeBlockingTime() {
            return this.deBlockingTime;
        }

        @NotNull
        public final String getEndTime() {
            return this.endTime;
        }

        public final long getPrettyId() {
            return this.prettyId;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public final long getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: isInLoginShow, reason: from getter */
        public final boolean getIsInLoginShow() {
            return this.isInLoginShow;
        }

        public final void setBlockingMsg(@Nullable String str) {
            this.blockingMsg = str;
        }

        public final void setDeBlockingTime(@Nullable String str) {
            this.deBlockingTime = str;
        }

        public final void setEndTime(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.endTime = str;
        }

        public final void setInLoginShow(boolean z) {
            this.isInLoginShow = z;
        }

        public final void setPrettyId(long j) {
            this.prettyId = j;
        }

        public final void setReason(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.reason = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("deBlockingTime:");
            sbOooO0o0.append(this.deBlockingTime);
            sbOooO0o0.append(",blockingMsg:");
            sbOooO0o0.append(this.blockingMsg);
            sbOooO0o0.append(",endTime:");
            sbOooO0o0.append(this.endTime);
            sbOooO0o0.append(",reason:");
            sbOooO0o0.append(this.reason);
            sbOooO0o0.append(",prettyId:");
            sbOooO0o0.append(this.prettyId);
            return sbOooO0o0.toString();
        }
    }

    @Nullable
    public final ApiError1005Data getData() {
        return this.data;
    }

    public final void setData(@Nullable ApiError1005Data apiError1005Data) {
        this.data = apiError1005Data;
    }
}
