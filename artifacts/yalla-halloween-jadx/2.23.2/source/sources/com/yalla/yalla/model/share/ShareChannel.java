package com.yalla.yalla.model.share;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/share/ShareChannel;", "", "(Ljava/lang/String;I)V", "Friends", "Moments", "Facebook", "Twitter", "Instagram", "WhatsApp", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ShareChannel {
    Friends,
    Moments,
    Facebook,
    Twitter,
    Instagram,
    WhatsApp;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<ShareChannel> getEntries() {
        return $ENTRIES;
    }
}
