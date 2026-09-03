package p563o0oOo0;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.OooOo;
import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.ConversationWithUser;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.oOO00O;
import p453o0Ooo.OooOO0;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 extends o0000O0O<ConversationWithUser> {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final LifecycleOwner f44956OooOOo0;

    public static final class OooO00o extends OooOo.OooO<ConversationWithUser> {
        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(ConversationWithUser conversationWithUser, ConversationWithUser conversationWithUser2) {
            ConversationWithUser oldItem = conversationWithUser;
            ConversationWithUser newItem = conversationWithUser2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            UserInfo userInfo = oldItem.getUserInfo();
            return (userInfo != null && userInfo.areItemShowContentsTheSame(newItem.getUserInfo())) && oldItem.getConversation().getSendState() == newItem.getConversation().getSendState() && Intrinsics.areEqual(oldItem.getConversation().getMid(), newItem.getConversation().getMid()) && oldItem.getConversation().getUnReadCount() == newItem.getConversation().getUnReadCount() && oldItem.getConversation().getTime() == newItem.getConversation().getTime() && oldItem.getConversation().getTopTime() == newItem.getConversation().getTopTime() && Intrinsics.areEqual(oldItem.getConversation().getMessage(), newItem.getConversation().getMessage()) && oldItem.getConversation().getIsVoiceAndUnread() == newItem.getConversation().getIsVoiceAndUnread();
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(ConversationWithUser conversationWithUser, ConversationWithUser conversationWithUser2) {
            ConversationWithUser oldItem = conversationWithUser;
            ConversationWithUser newItem = conversationWithUser2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getConversation().getUid() == newItem.getConversation().getUid() && oldItem.getConversation().getTargetId() == newItem.getConversation().getTargetId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(@NotNull LifecycleOwner lifecycle) {
        super(Integer.valueOf(R.layout.item_rec_message), new OooO00o());
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f44956OooOOo0 = lifecycle;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, ConversationWithUser conversationWithUser) {
        String userHeaderFrame;
        String userName;
        String userName2;
        String userName3;
        String userName4;
        String userName5;
        String userName6;
        String userName7;
        String userName8;
        String userName9;
        ConversationWithUser item = conversationWithUser;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Conversation conversation = item.getConversation();
        UserInfo userInfo = item.getUserInfo();
        if (userInfo == null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f44956OooOOo0), Dispatchers.getIO(), null, new o0OoOo0(conversation, null), 2, null);
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(holder.itemView.getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48429OooO0OO = userInfo != null ? userInfo.getUserHeader() : null;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o((ImageView) holder.OooO00o(R.id.item_rec_message_item_icon));
        SVGAView sVGAView = (SVGAView) holder.OooO00o(R.id.item_rec_message_head_frame_svga);
        if (userInfo == null || (userHeaderFrame = userInfo.getUserHeaderFrame()) == null) {
            userHeaderFrame = "";
        }
        sVGAView.OooO0oo(userHeaderFrame, this.f44956OooOOo0);
        sVGAView.OooO();
        UserPremiumView userPremiumView = (UserPremiumView) holder.OooO00o(R.id.item_rec_message_iv_vip_flag);
        UserInfo userInfo2 = item.getUserInfo();
        boolean zIsPremium = userInfo2 != null ? userInfo2.isPremium() : false;
        UserInfo userInfo3 = item.getUserInfo();
        userPremiumView.OooO0Oo(zIsPremium, userInfo3 != null ? userInfo3.getPremiumLevel() : 0);
        holder.OooO0OO(R.id.item_rec_message_top, conversation.getTopTime() <= 0);
        TextView textView = (TextView) holder.OooO00o(R.id.item_rec_message_title);
        o00O0O o00o0o2 = o00O0O.f42677OooO00o;
        o00o0o2.OooO0OO(conversation.getTargetId(), textView, (userInfo == null || (userName9 = userInfo.getUserName()) == null) ? "" : userName9, new o00O0O(textView));
        holder.OooO0OO(R.id.item_rec_message_iv_officials, (userInfo == null || userInfo.isOfficialRole()) ? false : true);
        ImageView imageView = (ImageView) holder.OooO00o(R.id.item_rec_message_status);
        if (conversation.getType() == 3 || conversation.getSendState() == StatusEnum$MsgSendStatus.SUCCESS.OooO00o()) {
            oOO00O.OooO00o(imageView);
        } else if (conversation.getSendState() == StatusEnum$MsgSendStatus.ING.OooO00o()) {
            oOO00O.OooO(imageView);
            imageView.setImageResource(R.mipmap.icon_message_sending);
        } else {
            oOO00O.OooO(imageView);
            imageView.setImageResource(R.mipmap.icon_message_fail);
        }
        TextView textView2 = (TextView) holder.OooO00o(R.id.item_rec_message_content);
        textView2.setTextColor(o000O0O0.OooO00o(R.color.color_333333_45));
        int type = conversation.getType();
        if (type != 100) {
            switch (type) {
                case 0:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName = userInfo.getUserName()) == null) ? "" : userName, new o0Oo0oo(textView2, conversation));
                    break;
                case 1:
                    OooOO0 oooOO1 = OooOO0.f40347OooO00o;
                    textView2.setText(OooOO0.OooO0Oo(conversation.getMessage(), o000OO00.OooO00o(16)));
                    break;
                case 2:
                    textView2.setText(o000O0O0.OooO0OO(R.string.voice_notice));
                    if (conversation.getIsAcceptMsg() && conversation.getIsVoiceAndUnread()) {
                        textView2.setTextColor(o000O0O0.OooO00o(R.color.color_FE6C6C));
                    }
                    break;
                case 3:
                case 4:
                    StringBuilder sbOooO00o = o00O0O0O.OooO00o('[');
                    sbOooO00o.append(o000O0O0.OooO0OO(R.string.Stickers));
                    sbOooO00o.append(']');
                    textView2.setText(sbOooO00o.toString());
                    break;
                case 5:
                    textView2.setText(o000O0O0.OooO0OO(R.string.notification_default_gift));
                    break;
                case 6:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName2 = userInfo.getUserName()) == null) ? "" : userName2, new o00Oo0(textView2, conversation));
                    break;
                case 7:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName3 = userInfo.getUserName()) == null) ? "" : userName3, new o00Ooo(textView2, conversation));
                    break;
                case 8:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName4 = userInfo.getUserName()) == null) ? "" : userName4, new oo000o(textView2, conversation));
                    break;
                case 9:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName5 = userInfo.getUserName()) == null) ? "" : userName5, new o00oO0o(textView2, conversation));
                    break;
                case 10:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName6 = userInfo.getUserName()) == null) ? "" : userName6, new o0ooOOo(textView2, conversation));
                    break;
                case 11:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName7 = userInfo.getUserName()) == null) ? "" : userName7, new o0OOO0o(textView2, conversation));
                    break;
                case 12:
                    o00o0o2.OooO0OO(conversation.getTargetId(), textView2, (userInfo == null || (userName8 = userInfo.getUserName()) == null) ? "" : userName8, new o000oOoO(textView2, conversation));
                    break;
                default:
                    textView2.setText((CharSequence) null);
                    break;
            }
        } else {
            textView2.setText(o000O0O0.OooO0OO(R.string.Unknown_Chat_Message));
        }
        TextView textView3 = (TextView) holder.OooO00o(R.id.item_rec_message_tv_new);
        if (conversation.getUnReadCount() > 0) {
            textView3.setText(conversation.getUnReadCount() > 99 ? "99+" : String.valueOf(conversation.getUnReadCount()));
            oOO00O.OooO(textView3);
        } else {
            textView3.setText((CharSequence) null);
            oOO00O.OooO00o(textView3);
        }
        ((TextView) holder.OooO00o(R.id.item_rec_message_time)).setText(conversation.getTime() > 0 ? o00O0.f48624OooO00o.OooO0Oo(conversation.getTime(), System.currentTimeMillis()).toString() : o00O0.f48624OooO00o.OooO0Oo(new Date().getTime(), System.currentTimeMillis()));
    }
}
