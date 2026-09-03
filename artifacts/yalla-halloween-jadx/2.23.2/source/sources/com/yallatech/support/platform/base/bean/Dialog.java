package com.yallatech.support.platform.base.bean;

import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yallatech/support/platform/base/bean/Dialog;", "", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "", "Lcom/yallatech/support/platform/base/bean/Action;", "actions", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "", "touchOutsideCancelable", "Z", "getTouchOutsideCancelable", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class Dialog {

    @NotNull
    private final List<Action> actions;

    @NotNull
    private final String message;

    @Nullable
    private final String title;
    private final boolean touchOutsideCancelable;

    public Dialog() {
        this(null, null, null, false, 15, null);
    }

    @NotNull
    public final List<Action> getActions() {
        return this.actions;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean getTouchOutsideCancelable() {
        return this.touchOutsideCancelable;
    }

    public Dialog(@Nullable String str, @NotNull String message, @NotNull List<Action> actions, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.title = str;
        this.message = message;
        this.actions = actions;
        this.touchOutsideCancelable = z;
    }

    public /* synthetic */ Dialog(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? true : z);
    }
}
