package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yallatech/support/platform/base/bean/BottomSheetBean;", "", "", "Lcom/yallatech/support/platform/base/bean/Action;", "customActions", "Ljava/util/List;", "getCustomActions", "()Ljava/util/List;", "cancelAction", "Lcom/yallatech/support/platform/base/bean/Action;", "getCancelAction", "()Lcom/yallatech/support/platform/base/bean/Action;", "<init>", "(Ljava/util/List;Lcom/yallatech/support/platform/base/bean/Action;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BottomSheetBean {

    @NotNull
    private final Action cancelAction;

    @NotNull
    private final List<Action> customActions;

    public BottomSheetBean(@NotNull List<Action> customActions, @NotNull Action cancelAction) {
        Intrinsics.checkNotNullParameter(customActions, "customActions");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        this.customActions = customActions;
        this.cancelAction = cancelAction;
    }

    @NotNull
    public final Action getCancelAction() {
        return this.cancelAction;
    }

    @NotNull
    public final List<Action> getCustomActions() {
        return this.customActions;
    }
}
