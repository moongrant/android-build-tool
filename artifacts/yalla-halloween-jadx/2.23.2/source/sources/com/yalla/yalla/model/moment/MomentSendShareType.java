package com.yalla.yalla.model.moment;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendShareType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "CreateText", "ShareImage", "ForwardPost", "ShareRoom", "ShareTopic", "ShareEvent", "ShareWeb", "EditPostLocal", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum MomentSendShareType {
    CreateText(0),
    ShareImage(1),
    ForwardPost(2),
    ShareRoom(3),
    ShareTopic(3),
    ShareEvent(3),
    ShareWeb(3),
    EditPostLocal(100);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    MomentSendShareType(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<MomentSendShareType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
