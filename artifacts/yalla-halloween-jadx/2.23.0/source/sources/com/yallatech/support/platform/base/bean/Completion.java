package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/yallatech/support/platform/base/bean/Completion;", "", "Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "component1", "()Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "completion", "copy", "(Lcom/yallatech/support/platform/base/bean/BridgeFunction;)Lcom/yallatech/support/platform/base/bean/Completion;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yallatech/support/platform/base/bean/BridgeFunction;", "getCompletion", "<init>", "(Lcom/yallatech/support/platform/base/bean/BridgeFunction;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Completion {

    @NotNull
    private final BridgeFunction completion;

    public Completion(@NotNull BridgeFunction completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        this.completion = completion;
    }

    public static /* synthetic */ Completion copy$default(Completion completion, BridgeFunction bridgeFunction, int i, Object obj) {
        if ((i & 1) != 0) {
            bridgeFunction = completion.completion;
        }
        return completion.copy(bridgeFunction);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BridgeFunction getCompletion() {
        return this.completion;
    }

    @NotNull
    public final Completion copy(@NotNull BridgeFunction completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new Completion(completion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Completion) && Intrinsics.areEqual(this.completion, ((Completion) other).completion);
    }

    @NotNull
    public final BridgeFunction getCompletion() {
        return this.completion;
    }

    public int hashCode() {
        return this.completion.hashCode();
    }

    @NotNull
    public String toString() {
        return "Completion(completion=" + this.completion + ')';
    }
}
