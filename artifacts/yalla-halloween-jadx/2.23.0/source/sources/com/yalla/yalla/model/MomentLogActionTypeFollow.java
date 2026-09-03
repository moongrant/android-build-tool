package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/MomentLogActionTypeFollow;", "Lcom/yalla/yalla/model/MomentLogActionTypeBase;", "object_userid", "", "(Ljava/lang/String;)V", "getObject_userid", "()Ljava/lang/String;", "setObject_userid", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentLogActionTypeFollow extends MomentLogActionTypeBase {
    public static final int $stable = 8;

    @NotNull
    private String object_userid;

    /* JADX WARN: Multi-variable type inference failed */
    public MomentLogActionTypeFollow() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getObject_userid() {
        return this.object_userid;
    }

    public final void setObject_userid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.object_userid = str;
    }

    public MomentLogActionTypeFollow(@NotNull String object_userid) {
        Intrinsics.checkNotNullParameter(object_userid, "object_userid");
        this.object_userid = object_userid;
    }

    public /* synthetic */ MomentLogActionTypeFollow(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
