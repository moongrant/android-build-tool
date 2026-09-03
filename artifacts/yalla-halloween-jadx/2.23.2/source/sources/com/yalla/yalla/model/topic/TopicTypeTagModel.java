package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicTypeTagModel;", "Lcom/yalla/yalla/model/bean/AbsJavaBean;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "tagName", "", "getTagName", "()Ljava/lang/String;", "setTagName", "(Ljava/lang/String;)V", "tagNtagrankame", "getTagNtagrankame", "setTagNtagrankame", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TopicTypeTagModel extends AbsJavaBean {
    public static final int $stable = 8;

    @SerializedName("id")
    private long id;

    @SerializedName("tagName")
    @NotNull
    private String tagName = "";

    @SerializedName("tagrank")
    @NotNull
    private String tagNtagrankame = "";

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getTagName() {
        return this.tagName;
    }

    @NotNull
    public final String getTagNtagrankame() {
        return this.tagNtagrankame;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setTagName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagName = str;
    }

    public final void setTagNtagrankame(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagNtagrankame = str;
    }
}
