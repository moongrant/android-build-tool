package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOOO00;
import p590o0oOooo0.oOOOOo0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/model/DeveloperPayloadModel;", "", "orderId", "", "userId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getUserId", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeveloperPayloadModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String orderId;

    @NotNull
    private final String userId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/DeveloperPayloadModel$Companion;", "", "()V", "fromJSON", "Lcom/yalla/yalla/model/DeveloperPayloadModel;", "jsonString", "", "toJSONString", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeveloperPayloadModel fromJSON(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            DeveloperPayloadModel developerPayloadModel = new DeveloperPayloadModel(jsonString, "");
            try {
                if (!StringsKt__StringsKt.contains$default(jsonString, "{", false, 2, (Object) null)) {
                    return developerPayloadModel;
                }
                Object objOooO00o = oOOO00.OooO00o(jsonString, DeveloperPayloadModel.class);
                Intrinsics.checkNotNullExpressionValue(objOooO00o, "fromJson(...)");
                return (DeveloperPayloadModel) objOooO00o;
            } catch (Exception e) {
                e.printStackTrace();
                return developerPayloadModel;
            }
        }

        @NotNull
        public final String toJSONString(@NotNull DeveloperPayloadModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return oOOOOo0O.OooO00o(model);
        }
    }

    public DeveloperPayloadModel(@NotNull String orderId, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.orderId = orderId;
        this.userId = userId;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }
}
