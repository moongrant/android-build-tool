package com.yalla.yalla.model.gift;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropTypeTag;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "Hot", "System", "AllSite", "Blind", "CustomMade", "Merge", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum GiftPropTypeTag {
    Hot(0),
    System(1),
    AllSite(2),
    Blind(4),
    CustomMade(5),
    Merge(6);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    GiftPropTypeTag(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<GiftPropTypeTag> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
