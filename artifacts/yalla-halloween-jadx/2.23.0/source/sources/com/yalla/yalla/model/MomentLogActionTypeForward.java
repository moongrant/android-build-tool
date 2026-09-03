package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/MomentLogActionTypeForward;", "Lcom/yalla/yalla/model/MomentLogActionTypeBase;", "object_userid", "", "discoveryid", "(Ljava/lang/String;Ljava/lang/String;)V", "getDiscoveryid", "()Ljava/lang/String;", "setDiscoveryid", "(Ljava/lang/String;)V", "getObject_userid", "setObject_userid", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentLogActionTypeForward extends MomentLogActionTypeBase {
    public static final int $stable = 8;

    @NotNull
    private String discoveryid;

    @NotNull
    private String object_userid;

    /* JADX WARN: Multi-variable type inference failed */
    public MomentLogActionTypeForward() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getDiscoveryid() {
        return this.discoveryid;
    }

    @NotNull
    public final String getObject_userid() {
        return this.object_userid;
    }

    public final void setDiscoveryid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.discoveryid = str;
    }

    public final void setObject_userid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.object_userid = str;
    }

    public MomentLogActionTypeForward(@NotNull String object_userid, @NotNull String discoveryid) {
        Intrinsics.checkNotNullParameter(object_userid, "object_userid");
        Intrinsics.checkNotNullParameter(discoveryid, "discoveryid");
        this.object_userid = object_userid;
        this.discoveryid = discoveryid;
    }

    public /* synthetic */ MomentLogActionTypeForward(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
