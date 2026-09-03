package com.yalla.yalla.model.share;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"getShareChannels", "", "Lcom/yalla/yalla/model/share/ShareChannel;", "type", "Lcom/yalla/yalla/model/share/ShareContentType;", "hasFriends", "", "Common_YallaRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShareContentModelKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareContentType.values().length];
            try {
                iArr[ShareContentType.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareContentType.Theme.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareContentType.Topic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareContentType.Moment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareContentType.Web.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareContentType.Room.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShareContentType.Events.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShareContentType.WebH5Content.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public static final List<ShareChannel> getShareChannels(@NotNull ShareContentType type, boolean z) {
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
            case 8:
                arrayList.add(ShareChannel.Facebook);
                arrayList.add(ShareChannel.Twitter);
                arrayList.add(ShareChannel.Instagram);
                arrayList.add(ShareChannel.WhatsApp);
                return arrayList;
            default:
                return arrayList;
        }
    }

    public static /* synthetic */ List getShareChannels$default(ShareContentType shareContentType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getShareChannels(shareContentType, z);
    }
}
