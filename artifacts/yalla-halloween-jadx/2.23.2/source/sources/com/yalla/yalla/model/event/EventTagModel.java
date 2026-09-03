package com.yalla.yalla.model.event;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/event/EventTagModel;", "", "()V", "eventDefaultPic", "", "getEventDefaultPic", "()Ljava/lang/String;", "setEventDefaultPic", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "id", "", "getId", "()I", "setId", "(I)V", "tagName", "getTagName", "setTagName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventTagModel {
    public static final int $stable = 8;
    private int id;

    @NotNull
    private String tagName = "";

    @NotNull
    private String icon = "";

    @NotNull
    private String eventDefaultPic = "";

    @NotNull
    public final String getEventDefaultPic() {
        return this.eventDefaultPic;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getTagName() {
        return this.tagName;
    }

    public final void setEventDefaultPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventDefaultPic = str;
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setTagName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tagName = str;
    }
}
