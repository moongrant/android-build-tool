package com.yalla.yalla.ui.vm.main;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.yalla.yalla.model.TopRankData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p394o0Oo0.OooOO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/TopVM;", "Lo0Oo0/OooOO0;", "", "rankType", "", "", "getDialogResource", "(Ljava/lang/String;)[Ljava/lang/Integer;", "getWidowBgColor", "getBgResource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/model/TopRankData;", "updateTopRank", "Landroidx/lifecycle/MutableLiveData;", "getUpdateTopRank", "()Landroidx/lifecycle/MutableLiveData;", "setUpdateTopRank", "(Landroidx/lifecycle/MutableLiveData;)V", "", "titles", "Ljava/util/List;", "getTitles", "()Ljava/util/List;", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TopVM extends OooOO0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String RANK_TYPE_KEY = "RankType";

    @NotNull
    private static final String TYPE_GIFT_RECEIVE = "perGet";

    @NotNull
    private static final String TYPE_GIFT_SENT = "perSend";

    @NotNull
    private static final String TYPE_ROOM_GIFT = "barSend";

    @NotNull
    private static final String TYPE_YALLA_BILLION = "totalRank";

    @NotNull
    private MutableLiveData<TopRankData> updateTopRank = new MutableLiveData<>();

    @NotNull
    private final List<String> titles = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.Hourly), o0000.OooO0OO(o000000.Daily), o0000.OooO0OO(o000000.Weekly), o0000.OooO0OO(o000000.Monthly));

    /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.main.TopVM$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public final int getBgResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        int i = o0Oo0oo.main_top_room_gift_shape;
        if (Intrinsics.areEqual(rankType, TYPE_ROOM_GIFT)) {
            return i;
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_SENT)) {
            return o0Oo0oo.main_top_gift_sent_shape;
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_RECEIVE)) {
            return o0Oo0oo.main_top_room_gift_receive;
        }
        return Intrinsics.areEqual(rankType, TYPE_YALLA_BILLION) ? o0Oo0oo.main_top_yalla_billionare_shape : i;
    }

    @NotNull
    public final Integer[] getDialogResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        int i = o000000.Room_gifts_sent;
        int i2 = o000000.Room_gifts_sent_Explanation;
        Integer[] numArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        if (Intrinsics.areEqual(rankType, TYPE_ROOM_GIFT)) {
            numArr[0] = Integer.valueOf(i);
            numArr[1] = Integer.valueOf(i2);
        } else if (Intrinsics.areEqual(rankType, TYPE_GIFT_SENT)) {
            numArr[0] = Integer.valueOf(o000000.Gifts_sent);
            numArr[1] = Integer.valueOf(o000000.Gifts_sent_Explanation);
        } else if (Intrinsics.areEqual(rankType, TYPE_GIFT_RECEIVE)) {
            numArr[0] = Integer.valueOf(o000000.Gifts_received);
            numArr[1] = Integer.valueOf(o000000.Gifts_received_Explanation);
        } else if (Intrinsics.areEqual(rankType, TYPE_YALLA_BILLION)) {
            numArr[0] = Integer.valueOf(o000000.Gold_Recharge);
            numArr[1] = Integer.valueOf(o000000.Gold_Recharge_Explanation);
        }
        return numArr;
    }

    @NotNull
    public final List<String> getTitles() {
        return this.titles;
    }

    @NotNull
    public final MutableLiveData<TopRankData> getUpdateTopRank() {
        return this.updateTopRank;
    }

    public final int getWidowBgColor(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        int iArgb = Color.argb(0, 0, 0, 0);
        if (Intrinsics.areEqual(rankType, TYPE_ROOM_GIFT)) {
            return Color.argb(255, 51, 197, 255);
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_SENT)) {
            return Color.argb(255, 255, 212, 38);
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_RECEIVE)) {
            return Color.argb(255, 222, 142, 255);
        }
        return Intrinsics.areEqual(rankType, TYPE_YALLA_BILLION) ? Color.argb(255, 255, 142, 122) : iArgb;
    }

    public final void setUpdateTopRank(@NotNull MutableLiveData<TopRankData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.updateTopRank = mutableLiveData;
    }
}
