package com.yalla.yalla.data.constant;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 com.yalla.yalla.data.constant.MainPage[], still in use, count: 1, list:
  (r12v4 com.yalla.yalla.data.constant.MainPage[]) from 0x0086: INVOKE (r12v4 com.yalla.yalla.data.constant.MainPage[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:135)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/data/constant/MainPage;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "setValue", "(I)V", "RoomMine", "RecentlyPage", "JoinedPage", "FollowingPage", "PopularPage", "RecommendPage", "ExplorePage", "MomentFollowingPage", "MomentFeaturedPage", "MomentTopicsPage", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MainPage {
    RoomMine(0),
    RecentlyPage(1),
    JoinedPage(2),
    FollowingPage(3),
    PopularPage(4),
    RecommendPage(5),
    ExplorePage(6),
    MomentFollowingPage(7),
    MomentFeaturedPage(8),
    MomentTopicsPage(9);

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private int value;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(mainPageArr);
    }

    public MainPage(int i) {
        super(str, i);
        this.value = i;
    }

    public static MainPage valueOf(String str) {
        return (MainPage) Enum.valueOf(MainPage.class, str);
    }

    public static MainPage[] values() {
        return (MainPage[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
