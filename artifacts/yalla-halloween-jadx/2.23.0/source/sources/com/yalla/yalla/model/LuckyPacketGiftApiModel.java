package com.yalla.yalla.model;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/LuckyPacketGiftApiModel;", "", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "data", "", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LuckyPacketGiftApiModel {
    public static final int $stable = 8;

    @NotNull
    private final String code;

    @Nullable
    private final List<GiftPropModel> data;

    @NotNull
    private final String message;

    public LuckyPacketGiftApiModel(@NotNull String code, @NotNull String message, @Nullable List<GiftPropModel> list) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
        this.message = message;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LuckyPacketGiftApiModel copy$default(LuckyPacketGiftApiModel luckyPacketGiftApiModel, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luckyPacketGiftApiModel.code;
        }
        if ((i & 2) != 0) {
            str2 = luckyPacketGiftApiModel.message;
        }
        if ((i & 4) != 0) {
            list = luckyPacketGiftApiModel.data;
        }
        return luckyPacketGiftApiModel.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final List<GiftPropModel> component3() {
        return this.data;
    }

    @NotNull
    public final LuckyPacketGiftApiModel copy(@NotNull String code, @NotNull String message, @Nullable List<GiftPropModel> data) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new LuckyPacketGiftApiModel(code, message, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuckyPacketGiftApiModel)) {
            return false;
        }
        LuckyPacketGiftApiModel luckyPacketGiftApiModel = (LuckyPacketGiftApiModel) other;
        return Intrinsics.areEqual(this.code, luckyPacketGiftApiModel.code) && Intrinsics.areEqual(this.message, luckyPacketGiftApiModel.message) && Intrinsics.areEqual(this.data, luckyPacketGiftApiModel.data);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final List<GiftPropModel> getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.message, this.code.hashCode() * 31, 31);
        List<GiftPropModel> list = this.data;
        return iOooO00o + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.message;
        List<GiftPropModel> list = this.data;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("LuckyPacketGiftApiModel(code=", str, ", message=", str2, ", data=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public /* synthetic */ LuckyPacketGiftApiModel(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
