package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import androidx.compose.foundation.layout.oo000o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "", "", "component1", "()Ljava/lang/String;", "functionID", "copy", "(Ljava/lang/String;)Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFunctionID", "<init>", "(Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BridgeFunction {

    @NotNull
    private final String functionID;

    public BridgeFunction(@NotNull String functionID) {
        Intrinsics.checkNotNullParameter(functionID, "functionID");
        this.functionID = functionID;
    }

    public static /* synthetic */ BridgeFunction copy$default(BridgeFunction bridgeFunction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bridgeFunction.functionID;
        }
        return bridgeFunction.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFunctionID() {
        return this.functionID;
    }

    @NotNull
    public final BridgeFunction copy(@NotNull String functionID) {
        Intrinsics.checkNotNullParameter(functionID, "functionID");
        return new BridgeFunction(functionID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BridgeFunction) && Intrinsics.areEqual(this.functionID, ((BridgeFunction) other).functionID);
    }

    @NotNull
    public final String getFunctionID() {
        return this.functionID;
    }

    public int hashCode() {
        return this.functionID.hashCode();
    }

    @NotNull
    public String toString() {
        return oo000o.OooO00o(new StringBuilder("BridgeFunction(functionID="), this.functionID, ')');
    }
}
