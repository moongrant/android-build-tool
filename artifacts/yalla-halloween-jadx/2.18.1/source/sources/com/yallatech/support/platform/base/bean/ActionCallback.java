package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yallatech/support/platform/base/bean/ActionCallback;", "", "", "functionID", "Ljava/lang/String;", "getFunctionID", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ActionCallback {

    @NotNull
    private final String functionID;

    public ActionCallback(@NotNull String functionID) {
        Intrinsics.checkNotNullParameter(functionID, "functionID");
        this.functionID = functionID;
    }

    @NotNull
    public final String getFunctionID() {
        return this.functionID;
    }
}
