package com.yalla.yalla.ui.vm.main;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopRankData;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/TopVM;", "Lo00OO/OooO00o;", "", "rankType", "", "", "getDialogResource", "(Ljava/lang/String;)[Ljava/lang/Integer;", "getWidowBgColor", "getBgResource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/model/TopRankData;", "updateTopRank", "Landroidx/lifecycle/MutableLiveData;", "getUpdateTopRank", "()Landroidx/lifecycle/MutableLiveData;", "setUpdateTopRank", "(Landroidx/lifecycle/MutableLiveData;)V", "", "titles", "Ljava/util/List;", "getTitles", "()Ljava/util/List;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopVM extends OooO00o {
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
    private final List<String> titles = CollectionsKt.mutableListOf(o000O0O0.OooO0OO(R.string.Hourly), o000O0O0.OooO0OO(R.string.Daily), o000O0O0.OooO0OO(R.string.Weekly), o000O0O0.OooO0OO(R.string.Monthly));

    /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.main.TopVM$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    public final int getBgResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        if (Intrinsics.areEqual(rankType, TYPE_ROOM_GIFT)) {
            return R.drawable.main_top_room_gift_shape;
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_SENT)) {
            return R.drawable.main_top_gift_sent_shape;
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_RECEIVE)) {
            return R.drawable.main_top_room_gift_receive;
        }
        return Intrinsics.areEqual(rankType, TYPE_YALLA_BILLION) ? R.drawable.main_top_yalla_billionare_shape : R.drawable.main_top_room_gift_shape;
    }

    @NotNull
    public final Integer[] getDialogResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        Integer numValueOf = Integer.valueOf(R.string.Room_gifts_sent);
        Integer numValueOf2 = Integer.valueOf(R.string.Room_gifts_sent_Explanation);
        Integer[] numArr = {numValueOf, numValueOf2};
        if (Intrinsics.areEqual(rankType, TYPE_ROOM_GIFT)) {
            numArr[0] = numValueOf;
            numArr[1] = numValueOf2;
        } else if (Intrinsics.areEqual(rankType, TYPE_GIFT_SENT)) {
            numArr[0] = Integer.valueOf(R.string.Gifts_sent);
            numArr[1] = Integer.valueOf(R.string.Gifts_sent_Explanation);
        } else if (Intrinsics.areEqual(rankType, TYPE_GIFT_RECEIVE)) {
            numArr[0] = Integer.valueOf(R.string.Gifts_received);
            numArr[1] = Integer.valueOf(R.string.Gifts_received_Explanation);
        } else if (Intrinsics.areEqual(rankType, TYPE_YALLA_BILLION)) {
            numArr[0] = Integer.valueOf(R.string.Gold_Recharge);
            numArr[1] = Integer.valueOf(R.string.Gold_Recharge_Explanation);
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
            return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 51, 197, KotlinVersion.MAX_COMPONENT_VALUE);
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_SENT)) {
            return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 212, 38);
        }
        if (Intrinsics.areEqual(rankType, TYPE_GIFT_RECEIVE)) {
            return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, 222, 142, KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return Intrinsics.areEqual(rankType, TYPE_YALLA_BILLION) ? Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 142, 122) : iArgb;
    }

    public final void setUpdateTopRank(@NotNull MutableLiveData<TopRankData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.updateTopRank = mutableLiveData;
    }
}
