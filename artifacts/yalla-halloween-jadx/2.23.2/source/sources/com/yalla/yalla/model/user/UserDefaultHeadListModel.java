package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/user/UserDefaultHeadListModel;", "", "()V", "mItems", "", "Lcom/yalla/yalla/model/user/UserDefaultHeadListModel$UserDefaultHeadItemModel;", "getMItems", "()Ljava/util/List;", "setMItems", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "UserDefaultHeadItemModel", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserDefaultHeadListModel {
    public static final int $stable = 8;

    @SerializedName("items")
    @Nullable
    private List<UserDefaultHeadItemModel> mItems;

    @SerializedName("name")
    @NotNull
    private String name = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/user/UserDefaultHeadListModel$UserDefaultHeadItemModel;", "", "()V", "id", "", "getId", "()J", "setId", "(J)V", "isCurrent", "", "()Z", "setCurrent", "(Z)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserDefaultHeadItemModel {
        public static final int $stable = 8;

        @SerializedName("id")
        private long id;

        @SerializedName("isCurrent")
        private boolean isCurrent;

        @SerializedName("url")
        @NotNull
        private String url = "";

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: isCurrent, reason: from getter */
        public final boolean getIsCurrent() {
            return this.isCurrent;
        }

        public final void setCurrent(boolean z) {
            this.isCurrent = z;
        }

        public final void setId(long j) {
            this.id = j;
        }

        public final void setUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.url = str;
        }
    }

    @Nullable
    public final List<UserDefaultHeadItemModel> getMItems() {
        return this.mItems;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setMItems(@Nullable List<UserDefaultHeadItemModel> list) {
        this.mItems = list;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }
}
