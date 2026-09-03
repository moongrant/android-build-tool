package com.yalla.yalla.common.constant;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/constant/MainPage;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "RecentlyPage", "JoinedPage", "FollowingPage", "PopularPage", "RecommendPage", "ExplorePage", "MomentFollowingPage", "MomentFeaturedPage", "MomentTopicsPage", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public enum MainPage {
    RecentlyPage(1),
    JoinedPage(2),
    FollowingPage(3),
    PopularPage(4),
    RecommendPage(5),
    ExplorePage(6),
    MomentFollowingPage(7),
    MomentFeaturedPage(8),
    MomentTopicsPage(9);

    private int value;

    MainPage(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
