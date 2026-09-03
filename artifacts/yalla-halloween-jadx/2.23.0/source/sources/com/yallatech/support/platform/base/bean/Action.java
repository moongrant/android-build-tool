package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yallatech/support/platform/base/bean/Action;", "", "", "actionID", "Ljava/lang/String;", "getActionID", "()Ljava/lang/String;", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "Lcom/yallatech/support/platform/base/bean/ActionCallback;", "completion", "Lcom/yallatech/support/platform/base/bean/ActionCallback;", "getCompletion", "()Lcom/yallatech/support/platform/base/bean/ActionCallback;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yallatech/support/platform/base/bean/ActionCallback;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Action {

    @NotNull
    private final String actionID;

    @NotNull
    private final ActionCallback completion;

    @NotNull
    private final String title;

    public Action(@NotNull String actionID, @NotNull String title, @NotNull ActionCallback completion) {
        Intrinsics.checkNotNullParameter(actionID, "actionID");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(completion, "completion");
        this.actionID = actionID;
        this.title = title;
        this.completion = completion;
    }

    @NotNull
    public final String getActionID() {
        return this.actionID;
    }

    @NotNull
    public final ActionCallback getCompletion() {
        return this.completion;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
