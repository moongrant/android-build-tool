package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Embedded;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/common/db/table/ConversationWithUser;", "", "conversation", "Lcom/yalla/yalla/common/db/table/Conversation;", "userInfo", "Lcom/yalla/yalla/common/db/table/UserInfo;", "(Lcom/yalla/yalla/common/db/table/Conversation;Lcom/yalla/yalla/common/db/table/UserInfo;)V", "getConversation", "()Lcom/yalla/yalla/common/db/table/Conversation;", "setConversation", "(Lcom/yalla/yalla/common/db/table/Conversation;)V", "getUserInfo", "()Lcom/yalla/yalla/common/db/table/UserInfo;", "setUserInfo", "(Lcom/yalla/yalla/common/db/table/UserInfo;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ConversationWithUser {
    public static final int $stable = 8;

    @Embedded
    @NotNull
    private Conversation conversation;

    @Embedded
    @Nullable
    private UserInfo userInfo;

    public ConversationWithUser(@NotNull Conversation conversation, @Nullable UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.conversation = conversation;
        this.userInfo = userInfo;
    }

    public static /* synthetic */ ConversationWithUser copy$default(ConversationWithUser conversationWithUser, Conversation conversation, UserInfo userInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            conversation = conversationWithUser.conversation;
        }
        if ((i & 2) != 0) {
            userInfo = conversationWithUser.userInfo;
        }
        return conversationWithUser.copy(conversation, userInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Conversation getConversation() {
        return this.conversation;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    public final ConversationWithUser copy(@NotNull Conversation conversation, @Nullable UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        return new ConversationWithUser(conversation, userInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationWithUser)) {
            return false;
        }
        ConversationWithUser conversationWithUser = (ConversationWithUser) other;
        return Intrinsics.areEqual(this.conversation, conversationWithUser.conversation) && Intrinsics.areEqual(this.userInfo, conversationWithUser.userInfo);
    }

    @NotNull
    public final Conversation getConversation() {
        return this.conversation;
    }

    @Nullable
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = this.conversation.hashCode() * 31;
        UserInfo userInfo = this.userInfo;
        return iHashCode + (userInfo == null ? 0 : userInfo.hashCode());
    }

    public final void setConversation(@NotNull Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<set-?>");
        this.conversation = conversation;
    }

    public final void setUserInfo(@Nullable UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ConversationWithUser(conversation=");
        sbOooO0o0.append(this.conversation);
        sbOooO0o0.append(", userInfo=");
        sbOooO0o0.append(this.userInfo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
