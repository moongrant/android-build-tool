package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p417o0OoO0.o0000O0O;
import p590o0oo0.OooOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\u0006\u0010#\u001a\u00020\u0003R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004R&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0004R*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "Ljava/io/Serializable;", "contentStr", "", "(Ljava/lang/String;)V", "at", "", "Lcom/yalla/yalla/model/moment/MomentSendContentAtModel;", "getAt", "()Ljava/util/List;", "setAt", "(Ljava/util/List;)V", "circleId", "", "getCircleId", "()J", "setCircleId", "(J)V", "circleName", "getCircleName", "()Ljava/lang/String;", "setCircleName", AppMeasurementSdk.ConditionalUserProperty.VALUE, "content", "getContent", "setContent", "topic", "Lcom/yalla/yalla/model/moment/MomentSendContentTopicModel;", "getTopic$annotations", "()V", "getTopic", "setTopic", "hasCircle", "", "setCircle", "toJSONString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentSendContentModel implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private List<MomentSendContentAtModel> at;
    private long circleId;

    @Nullable
    private String circleName;

    @NotNull
    private String content;

    @NotNull
    private List<MomentSendContentTopicModel> topic;

    public MomentSendContentModel(@NotNull String contentStr) {
        Intrinsics.checkNotNullParameter(contentStr, "contentStr");
        this.at = new ArrayList();
        this.topic = new ArrayList();
        this.circleName = "";
        this.content = "";
        setContent(contentStr);
    }

    @Deprecated(message = "Old话题")
    public static /* synthetic */ void getTopic$annotations() {
    }

    @NotNull
    public final List<MomentSendContentAtModel> getAt() {
        return this.at;
    }

    public final long getCircleId() {
        return this.circleId;
    }

    @Nullable
    public final String getCircleName() {
        return this.circleName;
    }

    @NotNull
    public final String getContent() {
        return OooOOO.OooO00o(this.content);
    }

    @NotNull
    public final List<MomentSendContentTopicModel> getTopic() {
        return this.topic;
    }

    public final boolean hasCircle() {
        return this.circleId > 0 && o0000O0O.OooO0o(this.circleName);
    }

    public final void setAt(@NotNull List<MomentSendContentAtModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.at = list;
    }

    @NotNull
    public final MomentSendContentModel setCircle(long circleId, @Nullable String circleName) {
        this.circleId = circleId;
        if (circleName == null) {
            circleName = "";
        }
        this.circleName = circleName;
        return this;
    }

    public final void setCircleId(long j) {
        this.circleId = j;
    }

    public final void setCircleName(@Nullable String str) {
        this.circleName = str;
    }

    public final void setContent(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder(value);
        while (sb.indexOf("\n\n\n\n") != -1) {
            int iIndexOf = sb.indexOf("\n\n\n\n");
            sb.replace(iIndexOf, iIndexOf + 1, "");
        }
        this.content = OooOOO.OooO00o(sb.toString());
    }

    public final void setTopic(@NotNull List<MomentSendContentTopicModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.topic = list;
    }

    @NotNull
    public final String toJSONString() {
        return OooOO0.OooO00o(this);
    }
}
