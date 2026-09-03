package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/common/model/SupportInfo;", "Ljava/io/Serializable;", "updateAt", "", "data", "", "Lcom/yalla/yalla/common/model/SupportInfo$UserData;", "(Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getUpdateAt", "()Ljava/lang/String;", "setUpdateAt", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "UserData", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SupportInfo implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private List<UserData> data;

    @NotNull
    private String updateAt;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/common/model/SupportInfo$UserData;", "Lcom/yalla/yalla/common/model/UserInfoModel;", "Ljava/io/Serializable;", "number", "", "num", "(Ljava/lang/String;Ljava/lang/String;)V", "getNum", "()Ljava/lang/String;", "setNum", "(Ljava/lang/String;)V", "getNumber", "setNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class UserData extends UserInfoModel {
        public static final int $stable = 8;

        @NotNull
        private String num;

        @NotNull
        private String number;

        /* JADX WARN: Multi-variable type inference failed */
        public UserData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public /* synthetic */ UserData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public static /* synthetic */ UserData copy$default(UserData userData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userData.number;
            }
            if ((i & 2) != 0) {
                str2 = userData.num;
            }
            return userData.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNum() {
            return this.num;
        }

        @NotNull
        public final UserData copy(@NotNull String number, @NotNull String num) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(num, "num");
            return new UserData(number, num);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserData)) {
                return false;
            }
            UserData userData = (UserData) other;
            return Intrinsics.areEqual(this.number, userData.number) && Intrinsics.areEqual(this.num, userData.num);
        }

        @NotNull
        public final String getNum() {
            return this.num;
        }

        @NotNull
        public final String getNumber() {
            return this.number;
        }

        public int hashCode() {
            return this.num.hashCode() + (this.number.hashCode() * 31);
        }

        public final void setNum(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.num = str;
        }

        public final void setNumber(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.number = str;
        }

        @Override // com.yalla.yalla.common.model.UserInfoModel, com.yalla.yalla.common.db.table.UserInfo
        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UserData(number=");
            sbOooO0o0.append(this.number);
            sbOooO0o0.append(", num=");
            return o00oO0o.OooO0O0(sbOooO0o0, this.num, ')');
        }

        public UserData(@NotNull String number, @NotNull String num) {
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(num, "num");
            this.number = number;
            this.num = num;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public SupportInfo(@NotNull String updateAt, @Nullable List<UserData> list) {
        Intrinsics.checkNotNullParameter(updateAt, "updateAt");
        this.updateAt = updateAt;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportInfo copy$default(SupportInfo supportInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportInfo.updateAt;
        }
        if ((i & 2) != 0) {
            list = supportInfo.data;
        }
        return supportInfo.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUpdateAt() {
        return this.updateAt;
    }

    @Nullable
    public final List<UserData> component2() {
        return this.data;
    }

    @NotNull
    public final SupportInfo copy(@NotNull String updateAt, @Nullable List<UserData> data) {
        Intrinsics.checkNotNullParameter(updateAt, "updateAt");
        return new SupportInfo(updateAt, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportInfo)) {
            return false;
        }
        SupportInfo supportInfo = (SupportInfo) other;
        return Intrinsics.areEqual(this.updateAt, supportInfo.updateAt) && Intrinsics.areEqual(this.data, supportInfo.data);
    }

    @Nullable
    public final List<UserData> getData() {
        return this.data;
    }

    @NotNull
    public final String getUpdateAt() {
        return this.updateAt;
    }

    public int hashCode() {
        int iHashCode = this.updateAt.hashCode() * 31;
        List<UserData> list = this.data;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setData(@Nullable List<UserData> list) {
        this.data = list;
    }

    public final void setUpdateAt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.updateAt = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SupportInfo(updateAt=");
        sbOooO0o0.append(this.updateAt);
        sbOooO0o0.append(", data=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.data, ')');
    }

    public /* synthetic */ SupportInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
