package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140o00OOooo.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "Ljava/io/Serializable;", "()V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "option", "", "Lcom/yalla/yalla/model/moment/MomentSendPollModel$Option;", "getOption", "()Ljava/util/List;", "setOption", "(Ljava/util/List;)V", "toJSONString", "", "Option", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentSendPollModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("expireTime")
    private long expireTime;

    @SerializedName("option")
    @NotNull
    private List<Option> option = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendPollModel$Option;", "Ljava/io/Serializable;", "()V", ViewHierarchyConstants.TEXT_KEY, "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Option implements Serializable {
        public static final int $stable = 8;

        @SerializedName(ViewHierarchyConstants.TEXT_KEY)
        @NotNull
        private String text = "";

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final List<Option> getOption() {
        return this.option;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setOption(@NotNull List<Option> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.option = list;
    }

    @NotNull
    public final String toJSONString() {
        return OooOO0.OooO00o(this);
    }
}
