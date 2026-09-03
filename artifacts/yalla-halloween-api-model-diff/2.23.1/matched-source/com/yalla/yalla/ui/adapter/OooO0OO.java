package com.yalla.yalla.ui.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.constant.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.ConversationWithUser;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.UserTagView;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p645o0ooOOO0.o0O0O0Oo;
import p646o0ooOOOO.n0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO extends n0<ConversationWithUser> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f26950OooOOo0;

    public static final class OooO00o extends androidx.recyclerview.widget.Oooo000.OooO<ConversationWithUser> {
        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO00o(ConversationWithUser conversationWithUser, ConversationWithUser conversationWithUser2) {
            ConversationWithUser oldItem = conversationWithUser;
            ConversationWithUser newItem = conversationWithUser2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && oldItem.getConversation().getSendState() == newItem.getConversation().getSendState() && Intrinsics.areEqual(oldItem.getConversation().getMid(), newItem.getConversation().getMid()) && oldItem.getConversation().getUnReadCount() == newItem.getConversation().getUnReadCount() && oldItem.getConversation().getTime() == newItem.getConversation().getTime() && oldItem.getConversation().getTopTime() == newItem.getConversation().getTopTime() && Intrinsics.areEqual(oldItem.getConversation().getMessage(), newItem.getConversation().getMessage()) && oldItem.getConversation().getIsVoiceAndUnread() == newItem.getConversation().getIsVoiceAndUnread();
        }

        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO0O0(ConversationWithUser conversationWithUser, ConversationWithUser conversationWithUser2) {
            ConversationWithUser oldItem = conversationWithUser;
            ConversationWithUser newItem = conversationWithUser2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getConversation().getUid() == newItem.getConversation().getUid() && oldItem.getConversation().getTargetId() == newItem.getConversation().getTargetId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(@NotNull LifecycleOwner lifecycle) {
        super(Integer.valueOf(p565o0oOo000.o0OO00O.item_rec_message), new OooO00o());
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f26950OooOOo0 = lifecycle;
    }

    @Override // p646o0ooOOOO.n0
    public final void OooO0o(PagingViewHolder holder, ConversationWithUser conversationWithUser) {
        ConversationWithUser item = conversationWithUser;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Conversation conversation = item.getConversation();
        UserInfo userInfo = item.getUserInfo();
        if (userInfo != null) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(holder.itemView.getContext());
            oooO00o.OooO00o(o0O0O0Oo.OooO0OO());
            oooO00o.f43127OooO0OO = userInfo.getUserHeader();
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_item_icon));
            SVGAView sVGAView = (SVGAView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_head_frame_svga);
            String userHeaderFrame = userInfo.getUserHeaderFrame();
            if (userHeaderFrame == null) {
                userHeaderFrame = "";
            }
            LifecycleOwner lifecycleOwner = this.f26950OooOOo0;
            sVGAView.OooOO0O(userHeaderFrame, lifecycleOwner);
            sVGAView.OooOO0o();
            UserTagView userTagView = (UserTagView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_userTagView);
            p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), userTagView.getNameText(), userInfo.getUserName(), new OooO(userTagView));
            userTagView.OooO0oo(userInfo.getPremiumLevel(), userInfo.isPremium());
            userTagView.OooO0Oo(userInfo.getVipLevel(), true, lifecycleOwner);
            UserTagView.OooOO0o(userTagView, lifecycleOwner, Integer.valueOf(userInfo.getWealthLevel()), userInfo.getWealthBadgeWithBg(), 8);
            userTagView.OooO0O0(18, 5);
            holder.setGone(p565o0oOo000.o0Oo0oo.item_rec_message_top, conversation.getTopTime() <= 0);
            holder.setGone(p565o0oOo000.o0Oo0oo.item_rec_message_iv_officials, !userInfo.isOfficialRole());
            ImageView imageView = (ImageView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_status);
            if (conversation.getType() == 3 || conversation.getSendState() == StatusEnum$MsgSendStatus.SUCCESS.OooO00o()) {
                com.code.android.util.o000O.OooO0O0(imageView);
            } else if (conversation.getSendState() == StatusEnum$MsgSendStatus.ING.OooO00o()) {
                com.code.android.util.o000O.OooOOOO(imageView);
                imageView.setImageResource(p565o0oOo000.oo0o0Oo.icon_message_sending);
            } else {
                com.code.android.util.o000O.OooOOOO(imageView);
                imageView.setImageResource(p565o0oOo000.oo0o0Oo.icon_message_fail);
            }
            TextView textView = (TextView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_content);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_333333_45));
            int type = conversation.getType();
            if (type != 100) {
                switch (type) {
                    case 0:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOo(textView, conversation));
                        break;
                    case 1:
                        MutableLiveData<List<p371o0OOo0o.OooOOO0>> mutableLiveData = p371o0OOo0o.OooOOO.f43159OooO00o;
                        textView.setText(p371o0OOo0o.OooOOO.OooO0Oo(com.code.android.util.o0000O0.OooO00o(16), conversation.getMessage()));
                        break;
                    case 2:
                        textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.voice_notice));
                        if (conversation.getIsAcceptMsg() && conversation.getIsVoiceAndUnread()) {
                            textView.setTextColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_FE6C6C));
                        }
                        break;
                    case 3:
                    case 4:
                        textView.setText("[" + com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Stickers) + "]");
                        break;
                    case 5:
                        textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.notification_default_gift));
                        break;
                    case 6:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOO0(textView, conversation));
                        break;
                    case 7:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOO0O(textView, conversation));
                        break;
                    case 8:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOOO0(textView, conversation));
                        break;
                    case 9:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOOO(textView, conversation));
                        break;
                    case 10:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOOOO(textView, conversation));
                        break;
                    case 11:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooOo00(textView, conversation));
                        break;
                    case 12:
                        p414o0Oo0o0O.o000O00.OooO0OO(conversation.getTargetId(), textView, userInfo.getUserName(), new OooO0o(textView, conversation));
                        break;
                    default:
                        textView.setText((CharSequence) null);
                        break;
                }
            } else {
                textView.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Unknown_Chat_Message));
            }
            TextView textView2 = (TextView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_tv_new);
            if (conversation.getUnReadCount() > 0) {
                textView2.setText(conversation.getUnReadCount() > 99 ? "99+" : String.valueOf(conversation.getUnReadCount()));
                com.code.android.util.o000O.OooOOOO(textView2);
            } else {
                textView2.setText((CharSequence) null);
                com.code.android.util.o000O.OooO0O0(textView2);
            }
            ((TextView) holder.getView(p565o0oOo000.o0Oo0oo.item_rec_message_time)).setText(p606o0oo0O0.OooOOOO.OooO0Oo(conversation.getTime() > 0 ? conversation.getTime() : new Date().getTime(), System.currentTimeMillis()));
        }
    }
}
