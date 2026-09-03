package com.yalla.yalla.common.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"getShareChannels", "", "Lcom/yalla/yalla/common/model/ShareChannel;", "type", "Lcom/yalla/yalla/common/model/ShareType;", "hasFriends", "", "app_YallaRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ShareModelKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.User.ordinal()] = 1;
            iArr[ShareType.Theme.ordinal()] = 2;
            iArr[ShareType.Topic.ordinal()] = 3;
            iArr[ShareType.Moment.ordinal()] = 4;
            iArr[ShareType.Web.ordinal()] = 5;
            iArr[ShareType.Room.ordinal()] = 6;
            iArr[ShareType.Events.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public static final List<ShareChannel> getShareChannels(@NotNull ShareType type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                arrayList.add(ShareChannel.Friends);
                return arrayList;
            case 2:
                arrayList.add(ShareChannel.Friends);
                return arrayList;
            case 3:
                arrayList.add(ShareChannel.Friends);
                return arrayList;
            case 4:
                arrayList.add(ShareChannel.Friends);
                arrayList.add(ShareChannel.Moments);
                return arrayList;
            case 5:
                if (z) {
                    arrayList.add(ShareChannel.Friends);
                }
                arrayList.add(ShareChannel.Moments);
                arrayList.add(ShareChannel.Facebook);
                arrayList.add(ShareChannel.Twitter);
                arrayList.add(ShareChannel.Instagram);
                arrayList.add(ShareChannel.WhatsApp);
                return arrayList;
            case 6:
                arrayList.add(ShareChannel.Friends);
                arrayList.add(ShareChannel.Moments);
                arrayList.add(ShareChannel.Facebook);
                arrayList.add(ShareChannel.Twitter);
                arrayList.add(ShareChannel.Instagram);
                arrayList.add(ShareChannel.WhatsApp);
                return arrayList;
            case 7:
                arrayList.add(ShareChannel.Friends);
                arrayList.add(ShareChannel.Moments);
                arrayList.add(ShareChannel.Facebook);
                arrayList.add(ShareChannel.Twitter);
                arrayList.add(ShareChannel.Instagram);
                arrayList.add(ShareChannel.WhatsApp);
                return arrayList;
            default:
                return arrayList;
        }
    }

    public static /* synthetic */ List getShareChannels$default(ShareType shareType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getShareChannels(shareType, z);
    }
}
