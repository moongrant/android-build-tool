package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/user/BindMoreAccountModel;", "Ljava/io/Serializable;", "()V", "isShowDialog", "", "()Z", "setShowDialog", "(Z)V", "limit", "", "getLimit", "()I", "setLimit", "(I)V", "rewards", "", "Lcom/yalla/yalla/model/user/BindMoreAccountModel$Reward;", "getRewards", "()Ljava/util/List;", "setRewards", "(Ljava/util/List;)V", "havRewards", "Companion", "Reward", "RewardType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BindMoreAccountModel implements Serializable {

    @SerializedName("isTip")
    private boolean isShowDialog;

    @SerializedName("limit")
    private int limit;

    @SerializedName("rewards")
    @Nullable
    private List<Reward> rewards;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/model/user/BindMoreAccountModel$Companion;", "", "()V", "test", "Lcom/yalla/yalla/model/user/BindMoreAccountModel;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BindMoreAccountModel test() {
            BindMoreAccountModel bindMoreAccountModel = new BindMoreAccountModel();
            bindMoreAccountModel.setShowDialog(true);
            bindMoreAccountModel.setRewards(new ArrayList());
            List<Reward> rewards = bindMoreAccountModel.getRewards();
            if (rewards != null) {
                Reward reward = new Reward();
                reward.setType(RewardType.INSTANCE.getHeaderFrame());
                reward.setImage("");
                rewards.add(reward);
            }
            List<Reward> rewards2 = bindMoreAccountModel.getRewards();
            if (rewards2 != null) {
                Reward reward2 = new Reward();
                reward2.setType(RewardType.INSTANCE.getCoin());
                reward2.setCount(15L);
                rewards2.add(reward2);
            }
            return bindMoreAccountModel;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/user/BindMoreAccountModel$Reward;", "Ljava/io/Serializable;", "()V", "count", "", "getCount", "()J", "setCount", "(J)V", "image", "", "getImage", "()Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "type", "", "getType", "()I", "setType", "(I)V", "isCoin", "", "isHeaderFrame", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Reward implements Serializable {
        public static final int $stable = 8;

        @SerializedName("count")
        private long count;

        @SerializedName("type")
        private int type = RewardType.INSTANCE.getDefaultNull();

        @SerializedName("image")
        @NotNull
        private String image = "";

        public final long getCount() {
            return this.count;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final int getType() {
            return this.type;
        }

        public final boolean isCoin() {
            return this.type == RewardType.INSTANCE.getCoin();
        }

        public final boolean isHeaderFrame() {
            return this.type == RewardType.INSTANCE.getHeaderFrame();
        }

        public final void setCount(long j) {
            this.count = j;
        }

        public final void setImage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.image = str;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/user/BindMoreAccountModel$RewardType;", "", "()V", "Coin", "", "getCoin", "()I", "DefaultNull", "getDefaultNull", "HeaderFrame", "getHeaderFrame", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RewardType {
        public static final int $stable = 0;
        private static final int DefaultNull = 0;

        @NotNull
        public static final RewardType INSTANCE = new RewardType();
        private static final int HeaderFrame = 1;
        private static final int Coin = 2;

        private RewardType() {
        }

        public final int getCoin() {
            return Coin;
        }

        public final int getDefaultNull() {
            return DefaultNull;
        }

        public final int getHeaderFrame() {
            return HeaderFrame;
        }
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final boolean havRewards() {
        List<Reward> list = this.rewards;
        return list != null && (list.isEmpty() ^ true);
    }

    /* JADX INFO: renamed from: isShowDialog, reason: from getter */
    public final boolean getIsShowDialog() {
        return this.isShowDialog;
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final void setRewards(@Nullable List<Reward> list) {
        this.rewards = list;
    }

    public final void setShowDialog(boolean z) {
        this.isShowDialog = z;
    }
}
