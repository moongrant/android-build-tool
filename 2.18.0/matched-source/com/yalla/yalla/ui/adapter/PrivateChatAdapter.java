package com.yalla.yalla.ui.adapter;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.Oooo000;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.support.common.util.Oooo0;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p169o00Ooo0.o0O0O00;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o000O0O0;
import p351o0OOOOOo.OooOO0O;
import p408o0Oo0OO0.OooOo;
import p408o0Oo0OO0.OooOo00;
import p455o0Ooo.OooOO0;
import p466o0Ooo0oO.o0000O0O;
import p466o0Ooo0oO.o000OO;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0OO00O;
import p524o0o0O0o.oo0o0O0;
import p565o0oOo0.o000;
import p565o0oOo0.o0000OO0;
import p565o0oOo0.o000O000;
import p565o0oOo0.o000O0o;
import p586o0oOoo.o000O;
import p597o0oOoooo.t5;
import p618o0oo0Ooo.oO0O000o;
import p623o0oo0o0o.oo00o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class PrivateChatAdapter extends o0000O0O<ChatMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f23656OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f23657OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public UserInfo f23658OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final int[] f23659OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public Function2<? super ChatMessage, ? super Integer, Unit> f23660OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public OooOo f23661OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatMessage, Unit> f23662OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public ChatMessage f23663OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final int[] f23664OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final int[] f23665OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f23666OooOoOO;

    public static final class OooO extends OooOOO0 {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000OO f23668OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f23669OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(ChatMessage chatMessage, o000OO o000oo2) {
            super(0L, 1, null);
            this.f23669OoooO00 = chatMessage;
            this.f23668OoooO0 = o000oo2;
        }

        @Override // com.yalla.support.common.util.OooOOO0
        public final void onNoDoubleClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Function2<? super ChatMessage, ? super Integer, Unit> function2 = PrivateChatAdapter.this.f23660OooOo0;
            if (function2 != null) {
                function2.invoke(this.f23669OoooO00, Integer.valueOf(this.f23668OoooO0.getLayoutPosition()));
            }
        }
    }

    public static final class OooO00o extends Oooo000.OooO<ChatMessage> {
        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO00o(ChatMessage chatMessage, ChatMessage chatMessage2) {
            ChatMessage oldItem = chatMessage;
            ChatMessage newItem = chatMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem.getSendState() == newItem.getSendState()) {
                ChatMessage.VoiceInfo voiceInfo = oldItem.getVoiceInfo();
                Boolean boolValueOf = voiceInfo != null ? Boolean.valueOf(voiceInfo.getIsVoiceRead()) : null;
                ChatMessage.VoiceInfo voiceInfo2 = newItem.getVoiceInfo();
                if (Intrinsics.areEqual(boolValueOf, voiceInfo2 != null ? Boolean.valueOf(voiceInfo2.getIsVoiceRead()) : null)) {
                    ChatMessage.VoiceInfo voiceInfo3 = oldItem.getVoiceInfo();
                    String filename = voiceInfo3 != null ? voiceInfo3.getFilename() : null;
                    ChatMessage.VoiceInfo voiceInfo4 = newItem.getVoiceInfo();
                    if (Intrinsics.areEqual(filename, voiceInfo4 != null ? voiceInfo4.getFilename() : null)) {
                        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = oldItem.getGiveRoomThemeInfo();
                        Integer numValueOf = giveRoomThemeInfo != null ? Integer.valueOf(giveRoomThemeInfo.getThemeState()) : null;
                        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo2 = newItem.getGiveRoomThemeInfo();
                        if (Intrinsics.areEqual(numValueOf, giveRoomThemeInfo2 != null ? Integer.valueOf(giveRoomThemeInfo2.getThemeState()) : null)) {
                            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = oldItem.getShareEventRoomInfo();
                            Boolean boolValueOf2 = shareEventRoomInfo != null ? Boolean.valueOf(shareEventRoomInfo.getIsDeleted()) : null;
                            ChatMessage.ShareEventRoomInfo shareEventRoomInfo2 = newItem.getShareEventRoomInfo();
                            if (Intrinsics.areEqual(boolValueOf2, shareEventRoomInfo2 != null ? Boolean.valueOf(shareEventRoomInfo2.getIsDeleted()) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO0O0(ChatMessage chatMessage, ChatMessage chatMessage2) {
            ChatMessage oldItem = chatMessage;
            ChatMessage newItem = chatMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getMid(), newItem.getMid()) && oldItem.getUid() == newItem.getUid();
        }
    }

    public static final class OooO0O0 extends OooOO0O {
        @Override // p351o0OOOOOo.OooOO0O
        public final int OooO0O0(int i) {
            if (i == ViewType.ChatCommonViewType.getValue()) {
                return R.layout.message_item_chat_private_text_common;
            }
            if (i != ViewType.SendText.getValue()) {
                if (i == ViewType.ReceiveText.getValue()) {
                    return R.layout.message_item_chat_private_text_receive;
                }
                if (i == ViewType.SendVoice.getValue()) {
                    return R.layout.message_item_chat_private_voice_send;
                }
                if (i == ViewType.ReceiveVoice.getValue()) {
                    return R.layout.message_item_chat_private_voice_receive;
                }
                if (i == ViewType.SendEmotion.getValue()) {
                    return R.layout.message_item_chat_private_emotion_send;
                }
                if (i == ViewType.ReceiveEmotion.getValue()) {
                    return R.layout.message_item_chat_private_emotion_receive;
                }
                if (i == ViewType.SendGif.getValue()) {
                    return R.layout.message_item_chat_private_gif_send;
                }
                if (i == ViewType.ReceiveGif.getValue()) {
                    return R.layout.message_item_chat_private_gif_receive;
                }
                if (i == ViewType.SendGift.getValue()) {
                    return R.layout.message_item_chat_private_gift_send;
                }
                if (i == ViewType.ReceiveGift.getValue()) {
                    return R.layout.message_item_chat_private_gift_receive;
                }
                if (i == ViewType.SendShareRoom.getValue()) {
                    return R.layout.message_item_chat_private_share_room_send;
                }
                if (i == ViewType.ReceiveShareRoom.getValue()) {
                    return R.layout.message_item_chat_private_share_room_receive;
                }
                if (i == ViewType.SendShareMoment.getValue()) {
                    return R.layout.message_item_chat_private_share_post_send;
                }
                if (i == ViewType.ReceiveShareMoment.getValue()) {
                    return R.layout.message_item_chat_private_share_post_receive;
                }
                if (i == ViewType.SendShareTopic.getValue()) {
                    return R.layout.message_item_chat_private_share_topic_send;
                }
                if (i == ViewType.ReceiveShareTopic.getValue()) {
                    return R.layout.message_item_chat_private_share_topic_receive;
                }
                if (i == ViewType.SendShareUser.getValue()) {
                    return R.layout.message_item_chat_private_share_user_send;
                }
                if (i == ViewType.ReceiveShareUser.getValue()) {
                    return R.layout.message_item_chat_private_share_user_receive;
                }
                if (i == ViewType.SendShareActivity.getValue()) {
                    return R.layout.message_item_chat_private_share_activity_send;
                }
                if (i == ViewType.ReceiveShareActivity.getValue()) {
                    return R.layout.message_item_chat_private_share_activity_receive;
                }
                if (i == ViewType.SendGiveRoomTheme.getValue()) {
                    return R.layout.message_item_chat_private_theme_send;
                }
                if (i == ViewType.ReceiveGetRoomTheme.getValue()) {
                    return R.layout.message_item_chat_private_theme_receive;
                }
                if (i == ViewType.UnknownMessage.getValue()) {
                    return R.layout.message_item_chat_private_text_receive;
                }
                if (i == ViewType.SendEventRoom.getValue()) {
                    return R.layout.message_item_chat_private_share_event_send;
                }
                if (i == ViewType.ReceiveEventRoom.getValue()) {
                    return R.layout.message_item_chat_private_share_event_receive;
                }
                if (i == ViewType.ToYallaChat4ChatMessage.getValue()) {
                    return R.layout.message_item_chat_private_to_yalla_chat;
                }
            }
            return R.layout.message_item_chat_private_text_send;
        }
    }

    public static final class OooO0OO implements OooOo00.OooO0O0 {
        public OooO0OO() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull OooOo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            PrivateChatAdapter.this.f23661OooOo00 = videoItem;
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    public static final class OooO0o extends ClickableSpan {
        public OooO0o() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            UserInfo userInfo = PrivateChatAdapter.this.f23658OooOOoo;
            if (userInfo != null) {
                o000O.OooO00o(t5.f47585OooO00o, t5.OooO0o(2, userInfo.getUserId(), (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(o000O0O0.OooO00o(R.color.colorPrimary));
            ds.setUnderlineText(false);
            ds.clearShadowLayer();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/adapter/PrivateChatAdapter$ViewType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "ChatCommonViewType", "SendText", "SendVoice", "SendEmotion", "SendGif", "SendGift", "SendShareRoom", "SendShareMoment", "SendShareTopic", "SendShareUser", "SendShareActivity", "ReceiveText", "ReceiveVoice", "ReceiveEmotion", "ReceiveGif", "ReceiveGift", "ReceiveShareRoom", "ReceiveShareMoment", "ReceiveShareTopic", "ReceiveShareUser", "ReceiveShareActivity", "SendGiveRoomTheme", "ReceiveGetRoomTheme", "UnknownMessage", "SendEventRoom", "ReceiveEventRoom", "ToYallaChat4ChatMessage", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum ViewType {
        ChatCommonViewType(0),
        SendText(1),
        SendVoice(2),
        SendEmotion(3),
        SendGif(4),
        SendGift(5),
        SendShareRoom(6),
        SendShareMoment(7),
        SendShareTopic(8),
        SendShareUser(9),
        SendShareActivity(10),
        ReceiveText(11),
        ReceiveVoice(12),
        ReceiveEmotion(13),
        ReceiveGif(14),
        ReceiveGift(15),
        ReceiveShareRoom(16),
        ReceiveShareMoment(17),
        ReceiveShareTopic(18),
        ReceiveShareUser(19),
        ReceiveShareActivity(20),
        SendGiveRoomTheme(21),
        ReceiveGetRoomTheme(22),
        UnknownMessage(23),
        SendEventRoom(24),
        ReceiveEventRoom(25),
        ToYallaChat4ChatMessage(26);

        private final int value;

        ViewType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateChatAdapter(@NotNull FragmentActivity context) {
        super(null, new OooO00o());
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23657OooOOo0 = context;
        this.f23656OooOOo = "";
        this.f23659OooOo = new int[]{R.drawable.ic_gift_num0, R.drawable.ic_gift_num1, R.drawable.ic_gift_num2, R.drawable.ic_gift_num3, R.drawable.ic_gift_num4, R.drawable.ic_gift_num5, R.drawable.ic_gift_num6, R.drawable.ic_gift_num7, R.drawable.ic_gift_num8, R.drawable.ic_gift_num9};
        this.f23665OooOoO0 = new int[]{R.drawable.icon_anim_dice_1, R.drawable.icon_anim_dice_2, R.drawable.icon_anim_dice_3, R.drawable.icon_anim_dice_4, R.drawable.icon_anim_dice_5, R.drawable.icon_anim_dice_6};
        this.f23664OooOoO = new int[]{R.drawable.icon_anim_jsb_s, R.drawable.icon_anim_jsb_j, R.drawable.icon_anim_jsb_b};
        this.f40470OooO0o = new OooO0O0();
        new OooOo00(context).OooO0oO("svga/anim_loading_status.svga", new OooO0OO());
        OooO0OO(R.id.chatItemRoot, R.id.niv_chat_message_header, R.id.fl_share_room_send, R.id.fl_share_room_receive, R.id.fl_share_post_send, R.id.fl_share_post_receive, R.id.fl_share_topic_send, R.id.fl_share_topic_receive, R.id.fl_share_user_send, R.id.fl_share_user_receive, R.id.clShareActivitySend, R.id.clShareActivityReceive, R.id.svga_message_status, R.id.clRoomTheme, R.id.clShareEventSend, R.id.clShareEventReceive);
        OooO0Oo(R.id.tv_chat_private_text, R.id.ll_private_chat_item_bg_voice);
    }

    public final void OooO(o000OO o000oo2, ChatMessage chatMessage) {
        String imageUrl;
        o00O00.OooO0O0("setGiftInfo -> \nitem = " + chatMessage);
        ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
        if (giftInfo == null) {
            return;
        }
        GiftPropModel giftPropModelOooO0O0 = oo0O.OooO0OO.f53343OooO00o.OooO0O0(giftInfo.getGiftId());
        ChatMessage.GiftInfo giftInfo2 = chatMessage.getGiftInfo();
        Intrinsics.checkNotNull(giftInfo2);
        if (!StringsKt.isBlank(giftInfo2.getGiftUrl())) {
            ChatMessage.GiftInfo giftInfo3 = chatMessage.getGiftInfo();
            Intrinsics.checkNotNull(giftInfo3);
            imageUrl = giftInfo3.getGiftUrl();
        } else {
            imageUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(o000oo2.itemView.getContext());
        oooO00o.f48447OooO0OO = CloudImageUtilKt.imgFormat(imageUrl);
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.OooO0o((ImageView) o000oo2.OooO00o(R.id.niv_chat_gift));
        int giftNumber = giftInfo.getGiftNumber() / 100;
        ImageView imageView = (ImageView) o000oo2.OooO00o(R.id.iv_chat_gift_hundred);
        if (giftNumber == 0) {
            o00O0O.OooO00o(imageView);
        } else {
            o00O0O.OooO(imageView);
            imageView.setImageResource(this.f23659OooOo[giftNumber]);
        }
        int giftNumber2 = (giftInfo.getGiftNumber() / 10) % 10;
        ImageView imageView2 = (ImageView) o000oo2.OooO00o(R.id.iv_chat_gift_ten);
        if (giftNumber2 == 0 && giftNumber == 0) {
            o00O0O.OooO00o(imageView2);
        } else {
            o00O0O.OooO(imageView2);
            imageView2.setImageResource(this.f23659OooOo[giftNumber2]);
        }
        ((ImageView) o000oo2.OooO00o(R.id.iv_chat_gift_one)).setImageResource(this.f23659OooOo[giftInfo.getGiftNumber() % 10]);
    }

    @Override // p466o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, ChatMessage chatMessage) {
        String momentText;
        String momentText2;
        String value;
        ChatMessage item = chatMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        o00O00.OooO0O0("onConvert\n holder = " + holder.getLayoutPosition() + ", itemViewType = " + holder.getItemViewType() + ",\n item = " + item);
        TextView textView = (TextView) holder.OooO00o(R.id.tv_chat_private_time);
        boolean z = true;
        int i = 0;
        if (holder.getLayoutPosition() == getItemCount() - 1 || (holder.getLayoutPosition() < getItemCount() - 1 && item.getTime() - getData(holder.getLayoutPosition() + 1).getTime() > 300000)) {
            textView.setText(oo00o.f48643OooO00o.OooO0Oo(item.getTime(), System.currentTimeMillis()));
            o00O0O.OooO(textView);
        } else {
            o00O0O.OooO00o(textView);
        }
        int itemViewType = holder.getItemViewType();
        ViewType viewType = ViewType.ChatCommonViewType;
        if (itemViewType != viewType.getValue()) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
            if (item.getIsAcceptMsg()) {
                UserInfo userInfo = this.f23658OooOOoo;
                value = userInfo != null ? userInfo.getUserHeader() : null;
            } else {
                value = OooOOO.f41235OooO00o.OooO0oo().getValue();
            }
            oooO00o.f48447OooO0OO = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgFormat(value), com.yalla.support.common.util.OooOo00.OooO00o(50), true);
            oooO00o.f48445OooO00o = 0;
            oooO00o.f48461OooOOo0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_head_default);
            oooO00o.OooO0o((ImageView) holder.OooO00o(R.id.niv_chat_message_header));
        }
        int itemViewType2 = holder.getItemViewType();
        if (itemViewType2 == viewType.getValue()) {
            o00O00.OooO0O0("setCommonInfo -> \nitem = " + item);
            holder.OooO0o0(R.id.tvAcceptSuccess, item.getMessage());
            return;
        }
        if (itemViewType2 == ViewType.SendText.getValue()) {
            OooOOO(holder, item);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveText.getValue()) {
            OooOOO(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendVoice.getValue()) {
            OooOOOO(holder, item);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveVoice.getValue()) {
            OooOOOO(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendEmotion.getValue() || itemViewType2 == ViewType.ReceiveEmotion.getValue()) {
            o00O00.OooO0O0("setEmotionInfo -> \nitem = " + item);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) holder.OooO00o(R.id.lav_chat_emotion);
            ChatMessage.EmoticonInfo emoticonInfo = item.getEmoticonInfo();
            Integer numValueOf = emoticonInfo != null ? Integer.valueOf(emoticonInfo.getEmoticonType()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                ChatMessage.EmoticonInfo emoticonInfo2 = item.getEmoticonInfo();
                int emoticonValue = emoticonInfo2 != null ? emoticonInfo2.getEmoticonValue() : 0;
                ChatMessage.EmoticonInfo emoticonInfo3 = item.getEmoticonInfo();
                if (emoticonInfo3 != null && emoticonInfo3.getEmoticonIsRead()) {
                    i = 1;
                }
                if (i != 0) {
                    if (emoticonValue <= 0 || emoticonValue > this.f23665OooOoO0.length) {
                        return;
                    }
                    lottieAnimationView.clearAnimation();
                    lottieAnimationView.setImageResource(this.f23665OooOoO0[emoticonValue - 1]);
                    return;
                }
                lottieAnimationView.setAnimation("lottie/lottie_anim_dice.json");
                lottieAnimationView.setImageAssetsFolder("lottie/anim_file_dice/");
                lottieAnimationView.setRepeatCount(4);
                lottieAnimationView.OooO0OO(new o000(emoticonValue, this, lottieAnimationView, item));
                lottieAnimationView.OooOO0();
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                ChatMessage.EmoticonInfo emoticonInfo4 = item.getEmoticonInfo();
                int emoticonValue2 = emoticonInfo4 != null ? emoticonInfo4.getEmoticonValue() : 0;
                ChatMessage.EmoticonInfo emoticonInfo5 = item.getEmoticonInfo();
                if (emoticonInfo5 != null && emoticonInfo5.getEmoticonIsRead()) {
                    i = 1;
                }
                if (i != 0) {
                    if (emoticonValue2 <= 0 || emoticonValue2 > this.f23664OooOoO.length) {
                        return;
                    }
                    lottieAnimationView.clearAnimation();
                    lottieAnimationView.setImageResource(this.f23664OooOoO[emoticonValue2 - 1]);
                    return;
                }
                lottieAnimationView.setAnimation("lottie/lottie_anim_jsb.json");
                lottieAnimationView.setImageAssetsFolder("lottie/anim_file_jsb/");
                lottieAnimationView.setRepeatCount(4);
                lottieAnimationView.f9973OoooOOO.f10001OoooO0.removeAllListeners();
                lottieAnimationView.OooO0OO(new o000O000(emoticonValue2, this, lottieAnimationView, item));
                lottieAnimationView.OooOO0();
                return;
            }
            return;
        }
        if (itemViewType2 == ViewType.SendGif.getValue()) {
            OooO0oo(holder, item);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveGif.getValue()) {
            OooO0oo(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendGift.getValue()) {
            OooO(holder, item);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveGift.getValue()) {
            OooO(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendShareRoom.getValue()) {
            o00O00.OooO0O0("sendShareRoomInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0oO());
            oooO00o2.OooO0oO(6);
            ChatMessage.ShareRoomInfo shareRoomInfo = item.getShareRoomInfo();
            oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgFormat(shareRoomInfo != null ? shareRoomInfo.getRoomHeader() : null), com.yalla.support.common.util.OooOo00.OooO00o(60), true);
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_room_head_photo_send));
            TextView textView2 = (TextView) holder.OooO00o(R.id.tv_share_room_name_send);
            ChatMessage.ShareRoomInfo shareRoomInfo2 = item.getShareRoomInfo();
            textView2.setText(shareRoomInfo2 != null ? shareRoomInfo2.getRoomName() : null);
            textView2.setMaxLines(1);
            String[] strArr = new String[2];
            strArr[0] = "ID:";
            ChatMessage.ShareRoomInfo shareRoomInfo3 = item.getShareRoomInfo();
            strArr[1] = String.valueOf(shareRoomInfo3 != null ? Long.valueOf(shareRoomInfo3.getRoomIdx()) : null);
            holder.OooO0o0(R.id.tv_share_room_id_send, o0O0O00.OooO0oo(strArr));
            holder.OooO0o0(R.id.tv_share_room_sign_send, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.click_to_enter_room));
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareRoom.getValue()) {
            o00O00.OooO0O0("receiveShareRoomInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o3.OooO00o(o00OOO.OooO00o.OooO0oO());
            oooO00o3.OooO0oO(6);
            ChatMessage.ShareRoomInfo shareRoomInfo4 = item.getShareRoomInfo();
            oooO00o3.f48447OooO0OO = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgFormat(shareRoomInfo4 != null ? shareRoomInfo4.getRoomHeader() : null), com.yalla.support.common.util.OooOo00.OooO00o(60), true);
            oooO00o3.f48445OooO00o = 0;
            oooO00o3.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_room_head_photo_receive));
            TextView textView3 = (TextView) holder.OooO00o(R.id.tv_share_room_name_receive);
            ChatMessage.ShareRoomInfo shareRoomInfo5 = item.getShareRoomInfo();
            textView3.setText(shareRoomInfo5 != null ? shareRoomInfo5.getRoomName() : null);
            textView3.setMaxLines(1);
            String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.single_ID_XXX);
            String[] strArr2 = new String[1];
            ChatMessage.ShareRoomInfo shareRoomInfo6 = item.getShareRoomInfo();
            strArr2[0] = String.valueOf(shareRoomInfo6 != null ? Long.valueOf(shareRoomInfo6.getRoomIdx()) : null);
            holder.OooO0o0(R.id.tv_share_room_id_receive, com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr2));
            holder.OooO0o0(R.id.tv_share_room_sign_receive, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.click_to_enter_room));
            return;
        }
        String str = "";
        if (itemViewType2 == ViewType.SendShareMoment.getValue()) {
            o00O00.OooO0O0("sendShareMomentInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o4.OooO00o(o00OOO.OooO00o.OooO0oO());
            oooO00o4.OooO0oo(4, 4, 0, 0);
            ChatMessage.ShareMomentInfo shareMomentInfo = item.getShareMomentInfo();
            oooO00o4.f48447OooO0OO = CloudImageUtilKt.imgFormat(shareMomentInfo != null ? shareMomentInfo.getMomentImage() : null);
            oooO00o4.f48445OooO00o = 0;
            oooO00o4.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_post_head_photo_send));
            TextView textView4 = (TextView) holder.OooO00o(R.id.tv_share_post_name_send);
            ChatMessage.ShareMomentInfo shareMomentInfo2 = item.getShareMomentInfo();
            String momentText3 = shareMomentInfo2 != null ? shareMomentInfo2.getMomentText() : null;
            if (momentText3 == null || StringsKt.isBlank(momentText3)) {
                textView4.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.share_post_photo));
                ChatMessage.ShareMomentInfo shareMomentInfo3 = item.getShareMomentInfo();
                String momentImage = shareMomentInfo3 != null ? shareMomentInfo3.getMomentImage() : null;
                if (momentImage != null && momentImage.length() != 0) {
                    z = false;
                }
                if (z) {
                    textView4.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.share_post_content));
                }
            } else {
                ChatMessage.ShareMomentInfo shareMomentInfo4 = item.getShareMomentInfo();
                if (shareMomentInfo4 != null && (momentText2 = shareMomentInfo4.getMomentText()) != null) {
                    str = momentText2;
                }
                o00OOOO0.OooO0O0(holder.itemView.getContext(), new MomentSendContentModel(str), textView4, null);
            }
            textView4.setMaxLines(2);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareMoment.getValue()) {
            o00O00.OooO0O0("receiveShareMomentInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o5 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o5.OooO00o(o00OOO.OooO00o.OooO0oO());
            oooO00o5.OooO0oo(4, 4, 0, 0);
            ChatMessage.ShareMomentInfo shareMomentInfo5 = item.getShareMomentInfo();
            oooO00o5.f48447OooO0OO = CloudImageUtilKt.imgFormat(shareMomentInfo5 != null ? shareMomentInfo5.getMomentImage() : null);
            oooO00o5.f48445OooO00o = 0;
            oooO00o5.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_post_head_photo_receive));
            TextView textView5 = (TextView) holder.OooO00o(R.id.tv_share_post_name_receive);
            ChatMessage.ShareMomentInfo shareMomentInfo6 = item.getShareMomentInfo();
            String momentText4 = shareMomentInfo6 != null ? shareMomentInfo6.getMomentText() : null;
            if (momentText4 == null || StringsKt.isBlank(momentText4)) {
                textView5.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.share_post_photo));
                ChatMessage.ShareMomentInfo shareMomentInfo7 = item.getShareMomentInfo();
                String momentImage2 = shareMomentInfo7 != null ? shareMomentInfo7.getMomentImage() : null;
                if (momentImage2 != null && momentImage2.length() != 0) {
                    z = false;
                }
                if (z) {
                    textView5.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.share_post_content));
                }
            } else {
                ChatMessage.ShareMomentInfo shareMomentInfo8 = item.getShareMomentInfo();
                if (shareMomentInfo8 != null && (momentText = shareMomentInfo8.getMomentText()) != null) {
                    str = momentText;
                }
                o00OOOO0.OooO0O0(holder.itemView.getContext(), new MomentSendContentModel(str), textView5, null);
            }
            textView5.setMaxLines(2);
            return;
        }
        if (itemViewType2 == ViewType.SendShareTopic.getValue()) {
            o00O00.OooO0O0("sendShareTopicInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o6 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o6.OooO00o(o00OOO.OooO00o.OooO0oO());
            oooO00o6.OooO0oo(4, 4, 0, 0);
            ChatMessage.ShareTopicInfo shareTopicInfo = item.getShareTopicInfo();
            oooO00o6.f48447OooO0OO = CloudImageUtilKt.imgFormat(shareTopicInfo != null ? shareTopicInfo.getTopicImage() : null);
            oooO00o6.f48445OooO00o = 0;
            oooO00o6.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_topic_head_photo_send));
            TextView textView6 = (TextView) holder.OooO00o(R.id.tv_share_topic_name_send);
            ChatMessage.ShareTopicInfo shareTopicInfo2 = item.getShareTopicInfo();
            textView6.setText(shareTopicInfo2 != null ? shareTopicInfo2.getTopicName() : null);
            textView6.setMaxLines(1);
            TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) holder.OooO00o(R.id.tv_share_send_topic_number);
            topicFollowPostNumberView.setVisibility(0);
            ChatMessage.ShareTopicInfo shareTopicInfo3 = item.getShareTopicInfo();
            int topicUserCount = shareTopicInfo3 != null ? shareTopicInfo3.getTopicUserCount() : 0;
            ChatMessage.ShareTopicInfo shareTopicInfo4 = item.getShareTopicInfo();
            topicFollowPostNumberView.OooO00o(topicUserCount, shareTopicInfo4 != null ? shareTopicInfo4.getTopicMomentCount() : 0, -1);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareTopic.getValue()) {
            o00O00.OooO0O0("receiveShareTopicInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o7 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o7.OooO00o(o00OOO.OooO00o.OooO0oO());
            oooO00o7.OooO0oo(4, 4, 0, 0);
            ChatMessage.ShareTopicInfo shareTopicInfo5 = item.getShareTopicInfo();
            oooO00o7.f48447OooO0OO = CloudImageUtilKt.imgFormat(shareTopicInfo5 != null ? shareTopicInfo5.getTopicImage() : null);
            oooO00o7.f48445OooO00o = 0;
            oooO00o7.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_topic_head_photo_receive));
            TextView textView7 = (TextView) holder.OooO00o(R.id.tv_share_topic_name_receive);
            ChatMessage.ShareTopicInfo shareTopicInfo6 = item.getShareTopicInfo();
            textView7.setText(shareTopicInfo6 != null ? shareTopicInfo6.getTopicName() : null);
            textView7.setMaxLines(1);
            TopicFollowPostNumberView topicFollowPostNumberView2 = (TopicFollowPostNumberView) holder.OooO00o(R.id.tv_share_receive_topic_number);
            topicFollowPostNumberView2.setVisibility(0);
            ChatMessage.ShareTopicInfo shareTopicInfo7 = item.getShareTopicInfo();
            int topicUserCount2 = shareTopicInfo7 != null ? shareTopicInfo7.getTopicUserCount() : 0;
            ChatMessage.ShareTopicInfo shareTopicInfo8 = item.getShareTopicInfo();
            topicFollowPostNumberView2.OooO00o(topicUserCount2, shareTopicInfo8 != null ? shareTopicInfo8.getTopicMomentCount() : 0, -1);
            return;
        }
        if (itemViewType2 == ViewType.SendShareUser.getValue()) {
            o00O00.OooO0O0("sendShareUserInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o8 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o8.OooO00o(o00OOO.OooO00o.OooO0o0());
            ChatMessage.ShareUserInfo shareUserInfo = item.getShareUserInfo();
            oooO00o8.f48447OooO0OO = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgFormat(shareUserInfo != null ? shareUserInfo.getUserHead() : null), com.yalla.support.common.util.OooOo00.OooO00o(60), true);
            oooO00o8.f48445OooO00o = 0;
            oooO00o8.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_user_head_photo_send));
            TextView textView8 = (TextView) holder.OooO00o(R.id.tv_share_user_name_send);
            ChatMessage.ShareUserInfo shareUserInfo2 = item.getShareUserInfo();
            textView8.setText(shareUserInfo2 != null ? shareUserInfo2.getUserName() : null);
            textView8.setMaxLines(1);
            TextView textView9 = (TextView) holder.OooO00o(R.id.tv_share_user_id_send);
            String strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.single_ID_XXX);
            String[] strArr3 = new String[1];
            ChatMessage.ShareUserInfo shareUserInfo3 = item.getShareUserInfo();
            strArr3[0] = String.valueOf(shareUserInfo3 != null ? Long.valueOf(shareUserInfo3.getUserIdx()) : null);
            textView9.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO2, strArr3));
            textView9.setMaxLines(1);
            holder.OooO0o0(R.id.tv_share_user_sign_send, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Tap_to_view_the_user));
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareUser.getValue()) {
            o00O00.OooO0O0("receiveShareUserInfo -> \nitem = " + item);
            oO0O000o.OooO00o oooO00o9 = new oO0O000o.OooO00o(holder.itemView.getContext());
            oooO00o9.OooO00o(o00OOO.OooO00o.OooO0o0());
            ChatMessage.ShareUserInfo shareUserInfo4 = item.getShareUserInfo();
            oooO00o9.f48447OooO0OO = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgFormat(shareUserInfo4 != null ? shareUserInfo4.getUserHead() : null), com.yalla.support.common.util.OooOo00.OooO00o(60), true);
            oooO00o9.f48445OooO00o = 0;
            oooO00o9.OooO0o((ImageView) holder.OooO00o(R.id.nv_share_user_head_photo_receive));
            TextView textView10 = (TextView) holder.OooO00o(R.id.tv_share_user_name_receive);
            ChatMessage.ShareUserInfo shareUserInfo5 = item.getShareUserInfo();
            textView10.setText(shareUserInfo5 != null ? shareUserInfo5.getUserName() : null);
            textView10.setMaxLines(1);
            TextView textView11 = (TextView) holder.OooO00o(R.id.tv_share_user_id_receive);
            String strOooO0OO3 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.single_ID_XXX);
            String[] strArr4 = new String[1];
            ChatMessage.ShareUserInfo shareUserInfo6 = item.getShareUserInfo();
            strArr4[0] = String.valueOf(shareUserInfo6 != null ? Long.valueOf(shareUserInfo6.getUserIdx()) : null);
            textView11.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO3, strArr4));
            textView11.setMaxLines(1);
            holder.OooO0o0(R.id.tv_share_user_sign_receive, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Tap_to_view_the_user));
            return;
        }
        if (itemViewType2 == ViewType.SendShareActivity.getValue()) {
            OooOO0o(holder, item);
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareActivity.getValue()) {
            OooOO0o(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendGiveRoomTheme.getValue()) {
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveGetRoomTheme.getValue()) {
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.UnknownMessage.getValue()) {
            o00O00.OooO0O0("setUnknownMessageInfo -> \nitem = " + item);
            TextView textView12 = (TextView) holder.OooO00o(R.id.tv_chat_private_text);
            textView12.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Unknown_Chat_Message) + ' ' + com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Update_Yalla));
            oo0o0O0.OooO0O0(textView12, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Update_Yalla), new o000O0o(this));
            return;
        }
        if (itemViewType2 == ViewType.SendEventRoom.getValue()) {
            OooOOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveEventRoom.getValue()) {
            OooOOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ToYallaChat4ChatMessage.getValue()) {
            o00O00.OooO0O0("setChatMessageYallaChat -> \nitem = " + item);
            String strOooO0OO4 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.chatMessageToYallaChatTag);
            TextView textView13 = (TextView) holder.OooO00o(R.id.tvChatMessage_toYallaChat);
            o00O0O.OooO(textView13);
            textView13.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.chatMessageToYallaChatContent));
            textView13.setOnClickListener(new o0000OO0(this, 0));
            oo0o0O0.OooO0o0(textView13, new String[]{strOooO0OO4}, o000O0O0.OooO00o(R.color.color_00d8c9));
            o00O0O.OooO00o(holder.OooO00o(R.id.tv_chat_private_time));
            o00O0O.OooO00o(holder.OooO00o(R.id.niv_chat_message_header));
        }
    }

    public final void OooO0oo(o000OO o000oo2, ChatMessage chatMessage) {
        String gifUrl;
        o00O00.OooO0O0("setGifInfo -> \nitem = " + chatMessage);
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(o000oo2.itemView.getContext());
        ChatMessage.GifInfo gifInfo = chatMessage.getGifInfo();
        if (gifInfo == null || (gifUrl = gifInfo.getGifUrl()) == null) {
            gifUrl = "";
        }
        oooO00o.f48447OooO0OO = CloudImageUtilKt.imgFormat(gifUrl);
        oooO00o.f48445OooO00o = 0;
        oooO00o.f48459OooOOOo = R.drawable.icon_picture_default;
        oooO00o.f48448OooO0Oo = true;
        oooO00o.OooO0o((ImageView) o000oo2.OooO00o(R.id.niv_chat_gif));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x011a  */
    public final void OooOO0(o000OO o000oo2, ChatMessage chatMessage) {
        o00O00.OooO0O0("setGiveRoomThemeInfo -> \nitem = " + chatMessage);
        ImageView imageView = (ImageView) o000oo2.OooO00o(R.id.ivTheme);
        TextView textView = (TextView) o000oo2.OooO00o(R.id.tvThemeTips);
        TextView textView2 = (TextView) o000oo2.OooO00o(R.id.tvExpirationTime);
        boolean z = false;
        ((NetImageView) o000oo2.OooO00o(R.id.nivGift)).OooO(0, 0, 0, com.yalla.support.common.util.OooOo00.OooO00o(6.0f));
        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_theme_content);
        String[] strArr = new String[1];
        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = chatMessage.getGiveRoomThemeInfo();
        strArr[0] = String.valueOf(giveRoomThemeInfo != null ? Integer.valueOf(giveRoomThemeInfo.getThemeDayLimit()) : null);
        textView.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr));
        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo2 = chatMessage.getGiveRoomThemeInfo();
        Integer numValueOf = giveRoomThemeInfo2 != null ? Integer.valueOf(giveRoomThemeInfo2.getThemeState()) : null;
        int value = ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            imageView.setImageResource(R.drawable.message_private_chat_item_room_theme);
            textView.setTextColor(o000O0O0.OooO00o(R.color.color_751));
            String strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_theme_receive_expiration_time);
            String[] strArr2 = new String[1];
            oo00o oo00oVar = oo00o.f48643OooO00o;
            ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo3 = chatMessage.getGiveRoomThemeInfo();
            strArr2[0] = oo00oVar.OooO0OO(giveRoomThemeInfo3 != null ? giveRoomThemeInfo3.getThemeExpireTime() : 0L, "dd/MM/yyyy");
            textView2.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO2, strArr2));
            int iOooO00o = o000O0O0.OooO00o(R.color.color_FE6C6C);
            String[] strArr3 = new String[1];
            ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo4 = chatMessage.getGiveRoomThemeInfo();
            strArr3[0] = String.valueOf(giveRoomThemeInfo4 != null ? Integer.valueOf(giveRoomThemeInfo4.getThemeDayLimit()) : null);
            Oooo0.OooO0O0(textView, iOooO00o, strArr3);
            return;
        }
        int value2 = ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue();
        if (numValueOf != null && numValueOf.intValue() == value2) {
            imageView.setImageResource(R.drawable.message_private_chat_item_room_theme_received);
            textView.setTextColor(o000O0O0.OooO00o(R.color.color_73751));
            textView2.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_theme_has_accepted));
            return;
        }
        int value3 = ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasExpired.getValue();
        if (numValueOf != null && numValueOf.intValue() == value3) {
            z = true;
        } else {
            int value4 = ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReturn.getValue();
            if (numValueOf != null && numValueOf.intValue() == value4) {
                z = true;
            }
        }
        if (z) {
            imageView.setImageResource(R.drawable.message_private_chat_item_room_theme_received);
            textView.setTextColor(o000O0O0.OooO00o(R.color.color_FE9));
            textView2.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_theme_has_be_overdue));
        }
    }

    public final void OooOO0O(o000OO o000oo2, ChatMessage chatMessage) {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("ChatMessage sendState=");
        sbOooO0O0.append(chatMessage.getSendState());
        o00O00.OooO0O0(sbOooO0O0.toString());
        SVGAView sVGAView = (SVGAView) o000oo2.OooO00o(R.id.svga_message_status);
        sVGAView.setImageDrawable(null);
        sVGAView.OooO0Oo();
        o00O0O.OooO00o(sVGAView);
        int sendState = chatMessage.getSendState();
        if (sendState == StatusEnum$MsgSendStatus.ING.OooO00o()) {
            o00O0O.OooO(sVGAView);
            sVGAView.setVideoItem(this.f23661OooOo00);
            sVGAView.OooO0OO();
            sVGAView.setOnClickListener(null);
            return;
        }
        if (sendState == StatusEnum$MsgSendStatus.SUCCESS.OooO00o()) {
            sVGAView.setImageDrawable(null);
            sVGAView.OooO0Oo();
            o00O0O.OooO00o(sVGAView);
            return;
        }
        boolean z = true;
        if (sendState != StatusEnum$MsgSendStatus.FAIL.OooO00o() && sendState != StatusEnum$MsgSendStatus.QINIUFAIL.OooO00o()) {
            z = false;
        }
        if (z) {
            sVGAView.OooO0Oo();
            sVGAView.setImageDrawable(com.yalla.support.common.util.OooOOO.OooO0O0(R.mipmap.icon_message_fail));
            o00O0O.OooO(sVGAView);
        }
    }

    public final void OooOO0o(o000OO o000oo2, ChatMessage chatMessage) {
        o00O00.OooO0O0("setShareActivityInfo -> \nitem = " + chatMessage);
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(o000oo2.itemView.getContext());
        oooO00o.f48459OooOOOo = R.drawable.message_ic_chat_share_post_default;
        ChatMessage.ShareActivityInfo shareActivityInfo = chatMessage.getShareActivityInfo();
        oooO00o.f48447OooO0OO = CloudImageUtilKt.imgFormat(shareActivityInfo != null ? shareActivityInfo.getActivityImage() : null);
        oooO00o.f48445OooO00o = 0;
        oooO00o.f48472OooOoo0 = 2;
        oooO00o.OooO0oo(6, 6, 0, 0);
        oooO00o.OooO0o((ImageView) o000oo2.OooO00o(R.id.ivShareActivity));
        ChatMessage.ShareActivityInfo shareActivityInfo2 = chatMessage.getShareActivityInfo();
        o000oo2.OooO0o0(R.id.tvShareActivityText1, shareActivityInfo2 != null ? shareActivityInfo2.getActivityText1() : null);
        ChatMessage.ShareActivityInfo shareActivityInfo3 = chatMessage.getShareActivityInfo();
        o000oo2.OooO0o0(R.id.tvShareActivityText2, shareActivityInfo3 != null ? shareActivityInfo3.getActivityText2() : null);
    }

    public final void OooOOO(o000OO o000oo2, ChatMessage chatMessage) {
        o00O00.OooO0O0("setTextInfo -> \nitem = " + chatMessage);
        OooOO0 oooOO1 = OooOO0.f40366OooO00o;
        o000oo2.OooO0o0(R.id.tv_chat_private_text, OooOO0.OooO0Oo(chatMessage.getMessage(), com.yalla.support.common.util.OooOo00.OooO00o(18.0f)));
        if ((!StringsKt.isBlank(this.f23656OooOOo) && !Intrinsics.areEqual(this.f23656OooOOo, chatMessage.getMid())) || !chatMessage.getIsWarn()) {
            if (o000oo2.getItemViewType() == ViewType.ReceiveText.getValue()) {
                o000oo2.OooO0OO(R.id.tv_chat_private_text_privacy, true);
                return;
            }
            return;
        }
        this.f23656OooOOo = chatMessage.getMid();
        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.private_chat_privacy);
        String strOooO0OO2 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.report);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p016OooOoO0.OooOo00.OooO00o(strOooO0OO, strOooO0OO2));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) p016OooOoO0.OooOo00.OooO00o(strOooO0OO, strOooO0OO2), strOooO0OO2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new OooO0o(), iIndexOf$default, strOooO0OO2.length() + iIndexOf$default, 33);
        TextView textView = (TextView) o000oo2.OooO00o(R.id.tv_chat_private_text_privacy);
        textView.setMovementMethod(o0OO00O.f42136OooO0O0.OooO00o());
        textView.setText(spannableStringBuilder);
        o00O0O.OooO(textView);
    }

    public final void OooOOO0(o000OO o000oo2, ChatMessage chatMessage) {
        o00O00.OooO0O0("setShareEventRoomInfo -> \nitem = " + chatMessage);
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo = chatMessage.getShareEventRoomInfo();
        if (shareEventRoomInfo != null && shareEventRoomInfo.getIsDeleted()) {
            if (chatMessage.getIsAcceptMsg()) {
                o000oo2.OooO0OO(R.id.clShareEventReceive, true);
            } else {
                o000oo2.OooO0OO(R.id.clShareEventSend, true);
            }
            o000oo2.OooO0o(R.id.tvDeleted);
            o000oo2.OooO0o0(R.id.tvDeleted, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.message_event_room_deleted));
            return;
        }
        if (chatMessage.getIsAcceptMsg()) {
            o000oo2.OooO0o(R.id.clShareEventReceive);
        } else {
            o000oo2.OooO0o(R.id.clShareEventSend);
        }
        o000oo2.OooO0OO(R.id.tvDeleted, true);
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(o000oo2.itemView.getContext());
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo2 = chatMessage.getShareEventRoomInfo();
        oooO00o.f48447OooO0OO = CloudImageUtilKt.imgFormat(shareEventRoomInfo2 != null ? shareEventRoomInfo2.getEventImageUrl() : null);
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO0oo(6, 6, 0, 0);
        oooO00o.f48459OooOOOo = R.drawable.icon_picture_default;
        oooO00o.OooO0o((ImageView) o000oo2.OooO00o(R.id.ivEvent));
        oo00o oo00oVar = oo00o.f48643OooO00o;
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo3 = chatMessage.getShareEventRoomInfo();
        o000oo2.OooO0o0(R.id.tvEventTime, oo00oVar.OooO0oO(shareEventRoomInfo3 != null ? shareEventRoomInfo3.getEventStartTime() : 0L));
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo4 = chatMessage.getShareEventRoomInfo();
        o000oo2.OooO0o0(R.id.tvEventName, shareEventRoomInfo4 != null ? shareEventRoomInfo4.getEventName() : null);
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo5 = chatMessage.getShareEventRoomInfo();
        o000oo2.OooO0o0(R.id.tvRoomName, shareEventRoomInfo5 != null ? shareEventRoomInfo5.getRoomName() : null);
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo6 = chatMessage.getShareEventRoomInfo();
        o000oo2.OooO0o0(R.id.tvRoomId, String.valueOf(shareEventRoomInfo6 != null ? Long.valueOf(shareEventRoomInfo6.getRoomId()) : null));
        TextView textView = (TextView) o000oo2.OooO00o(R.id.tvEventTime);
        ImageView imageView = (ImageView) o000oo2.OooO00o(R.id.ivEventTime);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo7 = chatMessage.getShareEventRoomInfo();
        Intrinsics.checkNotNull(shareEventRoomInfo7);
        long eventStartTime = shareEventRoomInfo7.getEventStartTime();
        if (String.valueOf(eventStartTime).length() == 10) {
            eventStartTime *= (long) 1000;
        }
        if (jCurrentTimeMillis > eventStartTime) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo8 = chatMessage.getShareEventRoomInfo();
            Intrinsics.checkNotNull(shareEventRoomInfo8);
            long eventEndTime = shareEventRoomInfo8.getEventEndTime();
            if (String.valueOf(eventEndTime).length() == 10) {
                eventEndTime *= (long) 1000;
            }
            if (jCurrentTimeMillis2 < eventEndTime) {
                textView.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Event_Live_Now));
                textView.setTextColor(o000O0O0.OooO00o(R.color.color_FFA21F));
                imageView.setImageResource(R.drawable.ic_explore_event_live);
                imageView.setImageTintList(null);
                return;
            }
        }
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo9 = chatMessage.getShareEventRoomInfo();
        Intrinsics.checkNotNull(shareEventRoomInfo9);
        textView.setText(oo00oVar.OooO0oO(shareEventRoomInfo9.getEventStartTime()));
        textView.setTextColor(o000O0O0.OooO00o(R.color.color_white));
        imageView.setImageResource(R.drawable.ic_explore_event_time);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    public final void OooOOOO(o000OO o000oo2, ChatMessage chatMessage) {
        ChatMessage.VoiceInfo voiceInfo;
        ChatMessage.VoiceInfo voiceInfo2;
        o00O00.OooO0O0("setVoiceInfo -> \nitem = " + chatMessage);
        TextView textView = (TextView) o000oo2.OooO00o(R.id.tv_chat_voice_duration);
        ChatMessage.VoiceInfo voiceInfo3 = chatMessage.getVoiceInfo();
        long voiceDuration = voiceInfo3 != null ? voiceInfo3.getVoiceDuration() : 0L;
        StringBuilder sb = new StringBuilder();
        sb.append(voiceDuration);
        sb.append(Typography.quote);
        textView.setText(sb.toString());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (chatMessage.getIsAcceptMsg()) {
            layoutParams.setMarginEnd(com.yalla.support.common.util.OooOo00.OooO00o(voiceDuration != 1 ? voiceDuration * 5.0f : 10.0f));
            ChatMessage.VoiceInfo voiceInfo4 = chatMessage.getVoiceInfo();
            o000oo2.OooO0OO(R.id.iv_chat_voice_read, voiceInfo4 != null && voiceInfo4.getIsVoiceRead());
        } else {
            layoutParams.setMarginStart(com.yalla.support.common.util.OooOo00.OooO00o(voiceDuration != 1 ? voiceDuration * 5.0f : 10.0f));
        }
        textView.setLayoutParams(layoutParams);
        SVGAView sVGAView = (SVGAView) o000oo2.OooO00o(R.id.svga_chat_voice);
        ChatMessage chatMessage2 = this.f23663OooOo0o;
        ChatMessage.VoiceInfo.PlayState playState = null;
        if (chatMessage2 == null) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("playingVoice mid = ");
            sbOooO0O0.append(chatMessage.getMid());
            sbOooO0O0.append("   stop");
            o00O00.OooO0O0(sbOooO0O0.toString());
            sVGAView.OooOO0(false);
            sVGAView.setImageResource(R.drawable.icon_chitchat_send_play3);
        } else {
            if (Intrinsics.areEqual(chatMessage2 != null ? chatMessage2.getMid() : null, chatMessage.getMid())) {
                ChatMessage chatMessage3 = this.f23663OooOo0o;
                if (((chatMessage3 == null || (voiceInfo2 = chatMessage3.getVoiceInfo()) == null) ? null : voiceInfo2.getPlayState()) != ChatMessage.VoiceInfo.PlayState.Stop) {
                    sVGAView.OooOO0(false);
                    ChatMessage chatMessage4 = this.f23663OooOo0o;
                    if (chatMessage4 != null && (voiceInfo = chatMessage4.getVoiceInfo()) != null) {
                        playState = voiceInfo.getPlayState();
                    }
                    if (playState == ChatMessage.VoiceInfo.PlayState.Download) {
                        sVGAView.OooO0oo("svga/anim_voice_loading.svga", this.f23657OooOOo0);
                        o00O00.OooO0O0("playingVoice mid = " + chatMessage.getMid() + "   loading");
                    } else {
                        sVGAView.OooO0oo("svga/anim_voice_play.svga", this.f23657OooOOo0);
                        o00O00.OooO0O0("playingVoice mid = " + chatMessage.getMid() + "   play");
                    }
                    sVGAView.OooO();
                } else {
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("playingVoice mid = ");
                    sbOooO0O1.append(chatMessage.getMid());
                    sbOooO0O1.append("   stop");
                    o00O00.OooO0O0(sbOooO0O1.toString());
                    sVGAView.OooOO0(false);
                    sVGAView.setImageResource(R.drawable.icon_chitchat_send_play3);
                }
            } else {
                StringBuilder sbOooO0O2 = OooO00o.OooO00o.OooO0O0("playingVoice mid = ");
                sbOooO0O2.append(chatMessage.getMid());
                sbOooO0O2.append("   stop");
                o00O00.OooO0O0(sbOooO0O2.toString());
                sVGAView.OooOO0(false);
                sVGAView.setImageResource(R.drawable.icon_chitchat_send_play3);
            }
        }
        ((LinearLayout) o000oo2.OooO00o(R.id.ll_private_chat_item_bg_voice)).setOnClickListener(new OooO(chatMessage, o000oo2));
    }

    public final void OooOOOo() {
        ChatMessage chatMessage = this.f23663OooOo0o;
        if (chatMessage != null && chatMessage.getVoiceInfo() != null) {
            ChatMessage chatMessage2 = this.f23663OooOo0o;
            ChatMessage.VoiceInfo voiceInfo = chatMessage2 != null ? chatMessage2.getVoiceInfo() : null;
            if (voiceInfo != null) {
                voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Stop);
            }
            int itemCount = getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ChatMessage chatMessage3 = this.f23663OooOo0o;
                String mid = chatMessage3 != null ? chatMessage3.getMid() : null;
                ChatMessage item = getItem(i);
                if (Intrinsics.areEqual(mid, item != null ? item.getMid() : null)) {
                    notifyItemChanged(i);
                    break;
                }
            }
        }
        this.f23663OooOo0o = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ChatMessage item = getItem(i);
        Integer numValueOf = item != null ? Integer.valueOf(item.getContentType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return ViewType.ChatCommonViewType.getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveText : ViewType.SendText).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveVoice : ViewType.SendVoice).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveEmotion : ViewType.SendEmotion).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveGif : ViewType.SendGif).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveGift : ViewType.SendGift).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveShareRoom : ViewType.SendShareRoom).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 7) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveShareMoment : ViewType.SendShareMoment).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 8) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveShareTopic : ViewType.SendShareTopic).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 9) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveShareUser : ViewType.SendShareUser).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 10) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveShareActivity : ViewType.SendShareActivity).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 11) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveGetRoomTheme : ViewType.SendGiveRoomTheme).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 12) {
            return (item.getIsAcceptMsg() ? ViewType.ReceiveEventRoom : ViewType.SendEventRoom).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 101) {
            return ViewType.ToYallaChat4ChatMessage.getValue();
        }
        return (numValueOf != null && numValueOf.intValue() == 100) ? ViewType.UnknownMessage.getValue() : ViewType.SendText.getValue();
    }
}
