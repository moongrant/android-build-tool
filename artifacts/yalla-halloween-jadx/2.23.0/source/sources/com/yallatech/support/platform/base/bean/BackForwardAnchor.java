package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yallatech/support/platform/base/bean/BackForwardAnchor;", "", "", "backAnchor", "Ljava/lang/String;", "getBackAnchor", "()Ljava/lang/String;", "forwardAnchor", "getForwardAnchor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BackForwardAnchor {

    @NotNull
    private final String backAnchor;

    @NotNull
    private final String forwardAnchor;

    public BackForwardAnchor(@NotNull String backAnchor, @NotNull String forwardAnchor) {
        Intrinsics.checkNotNullParameter(backAnchor, "backAnchor");
        Intrinsics.checkNotNullParameter(forwardAnchor, "forwardAnchor");
        this.backAnchor = backAnchor;
        this.forwardAnchor = forwardAnchor;
    }

    @NotNull
    public final String getBackAnchor() {
        return this.backAnchor;
    }

    @NotNull
    public final String getForwardAnchor() {
        return this.forwardAnchor;
    }
}
