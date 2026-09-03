package com.yalla.yalla.data.constant;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/yalla/yalla/data/constant/EnterRoomParentPage;", "", "", "num", "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "AII_New", "AII_Popular", "Related_Following", "Related_joined", "Related_Rencently", "Related_mine", "Explore_Top", "Explore_Country", "Explore_Tag", "Explore_Hot_Rooms", "Search_RecommendRoom", "Search_Room", "lnroom_Broadcast", "Moments_Following_SharedRoom", "Moments_Feature_SharedRoom", "Moments_Other_SharedRoom", "Moments_Room_SharedRoom", "Moments_Topics_SharedRoom", "Moments_details_SharedRoom", "Message_Friends_InRoom", "Message_Chat_SharedRoom", "Message_Chat_lnRoom", "Protile_lnRoom", "Activity_Room", "Me_profile_room", "Room_DailyTasks_go", "Room_welcome_gohavefun", "OtherApp_Room", "AII_Banner_Room", "Create_Auto_Room", "Moment_Banner_Room", "EventList", "EventDetail", "RoomMemberConveneCard", "VideoFeed", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum EnterRoomParentPage {
    AII_New("1"),
    AII_Popular(FeedbackType.Suggestions),
    Related_Following(FeedbackType.Recharge),
    Related_joined("4"),
    Related_Rencently(FeedbackType.Others),
    Related_mine("6"),
    Explore_Top("7"),
    Explore_Country("8"),
    Explore_Tag("9"),
    Explore_Hot_Rooms("10"),
    Search_RecommendRoom("11"),
    Search_Room("12"),
    lnroom_Broadcast("13"),
    Moments_Following_SharedRoom("14"),
    Moments_Feature_SharedRoom("15"),
    Moments_Other_SharedRoom("16"),
    Moments_Room_SharedRoom("17"),
    Moments_Topics_SharedRoom("18"),
    Moments_details_SharedRoom("19"),
    Message_Friends_InRoom("20"),
    Message_Chat_SharedRoom("21"),
    Message_Chat_lnRoom("22"),
    Protile_lnRoom("23"),
    Activity_Room("24"),
    Me_profile_room("25"),
    Room_DailyTasks_go("26"),
    Room_welcome_gohavefun("27"),
    OtherApp_Room("28"),
    AII_Banner_Room("29"),
    Create_Auto_Room("30"),
    Moment_Banner_Room("31"),
    EventList("32"),
    EventDetail("33"),
    RoomMemberConveneCard("34"),
    VideoFeed("35");


    @NotNull
    private final String num;

    EnterRoomParentPage(String str) {
        this.num = str;
    }

    @NotNull
    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getNum() {
        return this.num;
    }
}
