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
import androidx.lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.code.android.uikit.svga.SVGAView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.constant.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p526o0o0OOO0.oo0oOO0;
import p579o0oOoo.oOOoOOO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPrivateChatAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatAdapter.kt\ncom/yalla/yalla/ui/adapter/PrivateChatAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,939:1\n1#2:940\n262#3,2:941\n262#3,2:943\n*S KotlinDebug\n*F\n+ 1 PrivateChatAdapter.kt\ncom/yalla/yalla/ui/adapter/PrivateChatAdapter\n*L\n646#1:941,2\n676#1:943,2\n*E\n"})
public final class PrivateChatAdapter extends p400o0Oo0OO.OooOO0O<ChatMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public String f27433OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f27434OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public UserInfo f27435OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f27436OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public Function2<? super ChatMessage, ? super Integer, Unit> f27437OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public o0OO0O0.oo000o f27438OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public Function1<? super ChatMessage, Unit> f27439OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public ChatMessage f27440OooOo0o;

    public static final class OooO00o extends ClickableSpan {
        public OooO00o() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@NotNull View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            UserInfo userInfo = PrivateChatAdapter.this.f27435OooOOoo;
            if (userInfo != null) {
                oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(2, userInfo.getUserId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@NotNull TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(com.code.android.util.o0000.OooO00o(oO00O0o.colorPrimary));
            ds.setUnderlineText(false);
            ds.clearShadowLayer();
        }
    }

    public static final class OooO0O0 extends p466o0Oooo0o.oo00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ PagingViewHolder f27442OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f27444OooO0oo;

        public OooO0O0(ChatMessage chatMessage, PagingViewHolder pagingViewHolder) {
            this.f27444OooO0oo = chatMessage;
            this.f27442OooO = pagingViewHolder;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Function2<? super ChatMessage, ? super Integer, Unit> function2 = PrivateChatAdapter.this.f27437OooOo0;
            if (function2 != null) {
                function2.invoke(this.f27444OooO0oo, Integer.valueOf(this.f27442OooO.getLayoutPosition()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b \b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/adapter/PrivateChatAdapter$ViewType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "ChatCommonViewType", "SendText", "SendVoice", "SendEmotion", "SendGif", "SendGift", "SendShareRoom", "SendShareMoment", "SendShareTopic", "SendShareUser", "SendShareActivity", "ReceiveText", "ReceiveVoice", "ReceiveEmotion", "ReceiveGif", "ReceiveGift", "ReceiveShareRoom", "ReceiveShareMoment", "ReceiveShareTopic", "ReceiveShareUser", "ReceiveShareActivity", "SendGiveRoomTheme", "ReceiveGetRoomTheme", "UnknownMessage", "SendEventRoom", "ReceiveEventRoom", "ToYallaChat4ChatMessage", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
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
    public PrivateChatAdapter(@NotNull PrivateChatActivity context) {
        super(null, new o000000O());
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27434OooOOo0 = context;
        this.f27433OooOOo = "";
        this.f44441OooO0o = new o00000();
        new com.opensource.svgaplayer.OooO0OO(context).OooO00o("svga/anim_loading_status.svga", new o00000O0(this));
        OooO0Oo(oO00O0oO.chatItemRoot, oO00O0oO.niv_chat_message_header, oO00O0oO.fl_share_room_send, oO00O0oO.fl_share_room_receive, oO00O0oO.fl_share_post_send, oO00O0oO.fl_share_post_receive, oO00O0oO.fl_share_topic_send, oO00O0oO.fl_share_topic_receive, oO00O0oO.fl_share_user_send, oO00O0oO.fl_share_user_receive, oO00O0oO.clShareActivitySend, oO00O0oO.clShareActivityReceive, oO00O0oO.svga_message_status, oO00O0oO.clRoomTheme, oO00O0oO.clShareEventSend, oO00O0oO.clShareEventReceive);
        int[] viewIds = {oO00O0oO.tv_chat_private_text, oO00O0oO.ll_private_chat_item_bg_voice};
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i = 0; i < 2; i++) {
            this.f44451OooOOOo.add(Integer.valueOf(viewIds[i]));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    public static void OooO(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        p592o0oo00O.OooOOO0.OooO0O0("setGiveRoomThemeInfo -> \nitem = " + chatMessage);
        ImageView imageView = (ImageView) pagingViewHolder.getView(oO00O0oO.ivTheme);
        TextView textView = (TextView) pagingViewHolder.getView(oO00O0oO.tvThemeTips);
        TextView textView2 = (TextView) pagingViewHolder.getView(oO00O0oO.tvExpirationTime);
        boolean z = false;
        ((NetImageView) pagingViewHolder.getView(oO00O0oO.nivGift)).OooO0o(0, 0, 0, com.code.android.util.o0000O0.OooO00o(6));
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.message_theme_content);
        String[] strArr = new String[1];
        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = chatMessage.getGiveRoomThemeInfo();
        strArr[0] = String.valueOf(giveRoomThemeInfo != null ? Integer.valueOf(giveRoomThemeInfo.getThemeDayLimit()) : null);
        textView.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
        ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo2 = chatMessage.getGiveRoomThemeInfo();
        Integer numValueOf = giveRoomThemeInfo2 != null ? Integer.valueOf(giveRoomThemeInfo2.getThemeState()) : null;
        int value = ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            imageView.setImageResource(oOo00OO0.message_private_chat_item_room_theme);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_751));
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.message_theme_receive_expiration_time);
            String[] strArr2 = new String[1];
            ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo3 = chatMessage.getGiveRoomThemeInfo();
            strArr2[0] = p601o0oo0O0.o0000oo.OooO0OO(giveRoomThemeInfo3 != null ? giveRoomThemeInfo3.getThemeExpireTime() : 0L, "dd/MM/yyyy");
            textView2.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO2, strArr2));
            int iOooO00o = com.code.android.util.o0000.OooO00o(oO00O0o.color_FE6C6C);
            String[] strArr3 = new String[1];
            ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo4 = chatMessage.getGiveRoomThemeInfo();
            strArr3[0] = String.valueOf(giveRoomThemeInfo4 != null ? Integer.valueOf(giveRoomThemeInfo4.getThemeDayLimit()) : null);
            com.code.android.util.o000.OooO0O0(textView, iOooO00o, strArr3);
            return;
        }
        int value2 = ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue();
        if (numValueOf != null && numValueOf.intValue() == value2) {
            imageView.setImageResource(oOo00OO0.message_private_chat_item_room_theme_received);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_73751));
            textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_theme_has_accepted));
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
            imageView.setImageResource(oOo00OO0.message_private_chat_item_room_theme_received);
            textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FE9));
            textView2.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_theme_has_be_overdue));
        }
    }

    public static void OooO0oO(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        String gifUrl;
        p592o0oo00O.OooOOO0.OooO0O0("setGifInfo -> \nitem = " + chatMessage);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(pagingViewHolder.itemView.getContext());
        ChatMessage.GifInfo gifInfo = chatMessage.getGifInfo();
        if (gifInfo == null || (gifUrl = gifInfo.getGifUrl()) == null) {
            gifUrl = "";
        }
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(gifUrl);
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43923OooOOOo = oOo00OO0.icon_picture_default;
        oooO00o.f43912OooO0Oo = true;
        oooO00o.OooO0Oo((ImageView) pagingViewHolder.getView(oO00O0oO.niv_chat_gif));
    }

    public static void OooO0oo(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        p592o0oo00O.OooOOO0.OooO0O0("setGiftInfo -> \nitem = " + chatMessage);
        ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
        if (giftInfo != null) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p385o0OOooOO.oOO00O.f44351OooO00o;
            GiftPropModel giftPropModelOooO0O0 = p385o0OOooOO.oOO00O.OooO0O0(giftInfo.getGiftId());
            String giftUrl = giftInfo.getGiftUrl();
            if (StringsKt.isBlank(giftUrl)) {
                giftUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
            }
            TextView textView = (TextView) pagingViewHolder.getView(oO00O0oO.tv_gift_box);
            ImageView imageView = (ImageView) pagingViewHolder.getView(oO00O0oO.iv_chat_gift_x);
            ImageView imageView2 = (ImageView) pagingViewHolder.getView(oO00O0oO.iv_chat_gift_hundred);
            ImageView imageView3 = (ImageView) pagingViewHolder.getView(oO00O0oO.iv_chat_gift_ten);
            ImageView imageView4 = (ImageView) pagingViewHolder.getView(oO00O0oO.iv_chat_gift_one);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(pagingViewHolder.itemView.getContext());
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(giftUrl);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0O0());
            oooO00o.OooO0Oo((ImageView) pagingViewHolder.getView(oO00O0oO.niv_chat_gift));
            com.code.android.util.o000OO00.OooO0O0(textView);
            textView.setText("");
            if (com.code.android.util.o0OoOo0.OooO00o(giftInfo.getIsGiftBlindBox())) {
                com.code.android.util.o000OO00.OooOOOO(textView);
                textView.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.I_sent_you_XXX_x), com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(giftInfo.getGiftNumber()), "")));
                return;
            }
            com.code.android.util.o000OO00.OooOOOO(imageView);
            com.code.android.util.o000OO00.OooOOOO(imageView4);
            int[] iArr = p407o0Oo0o00.OooO0o.f45169OooO0OO;
            imageView4.setImageResource(iArr[giftInfo.getGiftNumber() % 10]);
            int giftNumber = giftInfo.getGiftNumber() / 100;
            int giftNumber2 = (giftInfo.getGiftNumber() / 10) % 10;
            if (giftNumber2 > 0 || giftNumber > 0) {
                com.code.android.util.o000OO00.OooOOOO(imageView3);
                imageView3.setImageResource(iArr[giftNumber2]);
            } else {
                com.code.android.util.o000OO00.OooO0O0(imageView3);
            }
            if (giftNumber <= 0) {
                com.code.android.util.o000OO00.OooO0O0(imageView2);
            } else {
                com.code.android.util.o000OO00.OooOOOO(imageView2);
                imageView2.setImageResource(iArr[giftNumber]);
            }
        }
    }

    public static void OooOO0O(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        p592o0oo00O.OooOOO0.OooO0O0("setShareActivityInfo -> \nitem = " + chatMessage);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(pagingViewHolder.itemView.getContext());
        oooO00o.f43923OooOOOo = oOo00OO0.message_ic_chat_share_post_default;
        ChatMessage.ShareActivityInfo shareActivityInfo = chatMessage.getShareActivityInfo();
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(shareActivityInfo != null ? shareActivityInfo.getActivityImage() : null);
        oooO00o.f43909OooO00o = 0;
        oooO00o.f43936OooOoo0 = 2;
        oooO00o.OooO0o(6, 6, 0, 0);
        oooO00o.OooO0Oo((ImageView) pagingViewHolder.getView(oO00O0oO.ivShareActivity));
        int i = oO00O0oO.tvShareActivityText1;
        ChatMessage.ShareActivityInfo shareActivityInfo2 = chatMessage.getShareActivityInfo();
        pagingViewHolder.setText(i, shareActivityInfo2 != null ? shareActivityInfo2.getActivityText1() : null);
        int i2 = oO00O0oO.tvShareActivityText2;
        ChatMessage.ShareActivityInfo shareActivityInfo3 = chatMessage.getShareActivityInfo();
        pagingViewHolder.setText(i2, shareActivityInfo3 != null ? shareActivityInfo3.getActivityText2() : null);
    }

    public static void OooOO0o(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        p592o0oo00O.OooOOO0.OooO0O0("setShareEventRoomInfo -> \nitem = " + chatMessage);
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo = chatMessage.getShareEventRoomInfo();
        if (shareEventRoomInfo != null && shareEventRoomInfo.getIsDeleted()) {
            if (chatMessage.getIsAcceptMsg()) {
                pagingViewHolder.setGone(oO00O0oO.clShareEventReceive, true);
            } else {
                pagingViewHolder.setGone(oO00O0oO.clShareEventSend, true);
            }
            int i = oO00O0oO.tvDeleted;
            pagingViewHolder.setVisible(i, true);
            pagingViewHolder.setText(i, com.code.android.util.o0000.OooO0OO(oO00OOo0.message_event_room_deleted));
            return;
        }
        if (chatMessage.getIsAcceptMsg()) {
            pagingViewHolder.setVisible(oO00O0oO.clShareEventReceive, true);
        } else {
            pagingViewHolder.setVisible(oO00O0oO.clShareEventSend, true);
        }
        pagingViewHolder.setGone(oO00O0oO.tvDeleted, true);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(pagingViewHolder.itemView.getContext());
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo2 = chatMessage.getShareEventRoomInfo();
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(shareEventRoomInfo2 != null ? shareEventRoomInfo2.getEventImageUrl() : null);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0o(6, 6, 0, 0);
        oooO00o.f43923OooOOOo = oOo00OO0.icon_picture_default;
        oooO00o.OooO0Oo((ImageView) pagingViewHolder.getView(oO00O0oO.ivEvent));
        int i2 = oO00O0oO.tvEventTime;
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo3 = chatMessage.getShareEventRoomInfo();
        pagingViewHolder.setText(i2, p601o0oo0O0.o0000oo.OooO0o(shareEventRoomInfo3 != null ? shareEventRoomInfo3.getEventStartTime() : 0L));
        int i3 = oO00O0oO.tvEventName;
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo4 = chatMessage.getShareEventRoomInfo();
        pagingViewHolder.setText(i3, shareEventRoomInfo4 != null ? shareEventRoomInfo4.getEventName() : null);
        int i4 = oO00O0oO.tvRoomName;
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo5 = chatMessage.getShareEventRoomInfo();
        pagingViewHolder.setText(i4, shareEventRoomInfo5 != null ? shareEventRoomInfo5.getRoomName() : null);
        int i5 = oO00O0oO.tvRoomId;
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo6 = chatMessage.getShareEventRoomInfo();
        pagingViewHolder.setText(i5, String.valueOf(shareEventRoomInfo6 != null ? Long.valueOf(shareEventRoomInfo6.getRoomId()) : null));
        TextView textView = (TextView) pagingViewHolder.getView(i2);
        ImageView imageView = (ImageView) pagingViewHolder.getView(oO00O0oO.ivEventTime);
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
                textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Event_Live_Now));
                textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FFA21F));
                imageView.setImageResource(oOo00OO0.ic_explore_event_live);
                imageView.setImageTintList(null);
                return;
            }
        }
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo9 = chatMessage.getShareEventRoomInfo();
        Intrinsics.checkNotNull(shareEventRoomInfo9);
        textView.setText(p601o0oo0O0.o0000oo.OooO0o(shareEventRoomInfo9.getEventStartTime()));
        textView.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_white));
        imageView.setImageResource(oOo00OO0.ic_explore_event_time);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v148 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v181 */
    /* JADX WARN: Type inference failed for: r1v186 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder holder, ChatMessage chatMessage) {
        String momentText;
        String strOooO0OO;
        String momentText2;
        String strOooO0OO2;
        String userHeader;
        ChatMessage item = chatMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("onConvert\n holder = ", holder.getLayoutPosition(), ", itemViewType = ", holder.getItemViewType(), ",\n item = ");
        sbOooO00o.append(item);
        p592o0oo00O.OooOOO0.OooO0O0(sbOooO00o.toString());
        TextView textView = (TextView) holder.getView(oO00O0oO.tv_chat_private_time);
        boolean z = true;
        int i = 0;
        if ((holder.getLayoutPosition() == getItemCount() - 1 || (holder.getLayoutPosition() < getItemCount() - 1 && item.getTime() - getData(holder.getLayoutPosition() + 1).getTime() > 300000)) == true) {
            textView.setText(p601o0oo0O0.o0000oo.OooO0Oo(item.getTime(), System.currentTimeMillis()));
            com.code.android.util.o000OO00.OooOOOO(textView);
        } else {
            com.code.android.util.o000OO00.OooO0O0(textView);
        }
        int itemViewType = holder.getItemViewType();
        ViewType viewType = ViewType.ChatCommonViewType;
        if (itemViewType != viewType.getValue()) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
            if (item.getIsAcceptMsg()) {
                UserInfo userInfo = this.f27435OooOOoo;
                userHeader = userInfo != null ? userInfo.getUserHeader() : null;
            } else {
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                userHeader = (String) p464o0Oooo.o000000O.OooO().getValue();
            }
            oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(userHeader);
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43925OooOOo0 = com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_head_default);
            oooO00o.OooO0Oo((ImageView) holder.getView(oO00O0oO.niv_chat_message_header));
        }
        int itemViewType2 = holder.getItemViewType();
        if (itemViewType2 == viewType.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("setCommonInfo -> \nitem = " + item);
            holder.setText(oO00O0oO.tvAcceptSuccess, item.getMessage());
            return;
        }
        if (itemViewType2 == ViewType.SendText.getValue()) {
            OooOOO0(holder, item);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveText.getValue()) {
            OooOOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendVoice.getValue()) {
            OooOOO(holder, item);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveVoice.getValue()) {
            OooOOO(holder, item);
            return;
        }
        if ((itemViewType2 == ViewType.SendEmotion.getValue() || itemViewType2 == ViewType.ReceiveEmotion.getValue()) == true) {
            p592o0oo00O.OooOOO0.OooO0O0("setEmotionInfo -> \nitem = " + item);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) holder.getView(oO00O0oO.lav_chat_emotion);
            ChatMessage.EmoticonInfo emoticonInfo = item.getEmoticonInfo();
            Integer numValueOf = emoticonInfo != null ? Integer.valueOf(emoticonInfo.getEmoticonType()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                ChatMessage.EmoticonInfo emoticonInfo2 = item.getEmoticonInfo();
                int emoticonValue = emoticonInfo2 != null ? emoticonInfo2.getEmoticonValue() : 0;
                ChatMessage.EmoticonInfo emoticonInfo3 = item.getEmoticonInfo();
                if (emoticonInfo3 != null && emoticonInfo3.getEmoticonIsRead()) {
                    i = 1;
                }
                if (i == 0) {
                    lottieAnimationView.setAnimation("lottie/lottie_anim_dice.json");
                    lottieAnimationView.setImageAssetsFolder("lottie/anim_file_dice/");
                    lottieAnimationView.setRepeatCount(4);
                    lottieAnimationView.f8646OooO0oo.f8672OooO0o.addListener(new o00000O(emoticonValue, lottieAnimationView, this, item));
                    lottieAnimationView.OooO0oO();
                    return;
                }
                if (emoticonValue > 0) {
                    int[] iArr = p407o0Oo0o00.OooO0o.f45167OooO00o;
                    if (emoticonValue <= 6) {
                        lottieAnimationView.clearAnimation();
                        lottieAnimationView.setImageResource(iArr[emoticonValue - 1]);
                        return;
                    }
                    return;
                }
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
                    if (emoticonValue2 > 0) {
                        int[] iArr2 = p407o0Oo0o00.OooO0o.f45168OooO0O0;
                        if (emoticonValue2 <= 3) {
                            lottieAnimationView.clearAnimation();
                            lottieAnimationView.setImageResource(iArr2[emoticonValue2 - 1]);
                            return;
                        }
                        return;
                    }
                    return;
                }
                lottieAnimationView.setAnimation("lottie/lottie_anim_jsb.json");
                lottieAnimationView.setImageAssetsFolder("lottie/anim_file_jsb/");
                lottieAnimationView.setRepeatCount(4);
                LottieDrawable lottieDrawable = lottieAnimationView.f8646OooO0oo;
                lottieDrawable.f8672OooO0o.removeAllListeners();
                lottieDrawable.f8672OooO0o.addListener(new o00000OO(emoticonValue2, lottieAnimationView, this, item));
                lottieAnimationView.OooO0oO();
                return;
            }
            return;
        }
        if (itemViewType2 == ViewType.SendGif.getValue()) {
            OooO0oO(holder, item);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveGif.getValue()) {
            OooO0oO(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendGift.getValue()) {
            OooO0oo(holder, item);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveGift.getValue()) {
            OooO0oo(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendShareRoom.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("sendShareRoomInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0o0());
            oooO00o2.OooO0o0(6);
            ChatMessage.ShareRoomInfo shareRoomInfo = item.getShareRoomInfo();
            oooO00o2.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(p139o00OOooO.OooO0o.OooO0Oo(shareRoomInfo != null ? shareRoomInfo.getRoomHeader() : null));
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_room_head_photo_send));
            TextView textView2 = (TextView) holder.getView(oO00O0oO.tv_share_room_name_send);
            ChatMessage.ShareRoomInfo shareRoomInfo2 = item.getShareRoomInfo();
            textView2.setText(shareRoomInfo2 != null ? shareRoomInfo2.getRoomName() : null);
            textView2.setMaxLines(1);
            int i2 = oO00O0oO.tv_share_room_id_send;
            String[] strArr = new String[2];
            strArr[0] = "ID:";
            ChatMessage.ShareRoomInfo shareRoomInfo3 = item.getShareRoomInfo();
            strArr[1] = String.valueOf(shareRoomInfo3 != null ? Long.valueOf(shareRoomInfo3.getRoomIdx()) : null);
            holder.setText(i2, p590o0oo0.OooOOOO.OooO0oO(strArr));
            holder.setText(oO00O0oO.tv_share_room_sign_send, com.code.android.util.o0000.OooO0OO(oO00OOo0.click_to_enter_room));
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareRoom.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("receiveShareRoomInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o3.OooO00o(p543o0oO0O00.OooO.OooO0o0());
            oooO00o3.OooO0o0(6);
            ChatMessage.ShareRoomInfo shareRoomInfo4 = item.getShareRoomInfo();
            oooO00o3.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(p139o00OOooO.OooO0o.OooO0Oo(shareRoomInfo4 != null ? shareRoomInfo4.getRoomHeader() : null));
            oooO00o3.f43909OooO00o = 0;
            oooO00o3.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_room_head_photo_receive));
            TextView textView3 = (TextView) holder.getView(oO00O0oO.tv_share_room_name_receive);
            ChatMessage.ShareRoomInfo shareRoomInfo5 = item.getShareRoomInfo();
            textView3.setText(shareRoomInfo5 != null ? shareRoomInfo5.getRoomName() : null);
            textView3.setMaxLines(1);
            int i3 = oO00O0oO.tv_share_room_id_receive;
            String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.single_ID_XXX);
            String[] strArr2 = new String[1];
            ChatMessage.ShareRoomInfo shareRoomInfo6 = item.getShareRoomInfo();
            strArr2[0] = String.valueOf(shareRoomInfo6 != null ? Long.valueOf(shareRoomInfo6.getRoomIdx()) : null);
            holder.setText(i3, com.code.android.util.o0000O.OooO00o(strOooO0OO3, strArr2));
            holder.setText(oO00O0oO.tv_share_room_sign_receive, com.code.android.util.o0000.OooO0OO(oO00OOo0.click_to_enter_room));
            return;
        }
        String str = "";
        if (itemViewType2 == ViewType.SendShareMoment.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("sendShareMomentInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o4.OooO00o(p543o0oO0O00.OooO.OooO0o0());
            oooO00o4.OooO0o(4, 4, 0, 0);
            ChatMessage.ShareMomentInfo shareMomentInfo = item.getShareMomentInfo();
            oooO00o4.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(shareMomentInfo != null ? shareMomentInfo.getMomentImage() : null);
            oooO00o4.f43909OooO00o = 0;
            oooO00o4.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_post_head_photo_send));
            View view = holder.getView(oO00O0oO.ivVideo);
            ChatMessage.ShareMomentInfo shareMomentInfo2 = item.getShareMomentInfo();
            view.setVisibility((shareMomentInfo2 != null && shareMomentInfo2.getMomentType() == MomentType.Video.getValue()) == true ? 0 : 8);
            TextView textView4 = (TextView) holder.getView(oO00O0oO.tv_share_post_name_send);
            ChatMessage.ShareMomentInfo shareMomentInfo3 = item.getShareMomentInfo();
            String momentText3 = shareMomentInfo3 != null ? shareMomentInfo3.getMomentText() : null;
            if ((momentText3 == null || StringsKt.isBlank(momentText3)) == true) {
                ChatMessage.ShareMomentInfo shareMomentInfo4 = item.getShareMomentInfo();
                String momentImage = shareMomentInfo4 != null ? shareMomentInfo4.getMomentImage() : null;
                if (momentImage != null && momentImage.length() != 0) {
                    z = false;
                }
                if (z) {
                    textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.share_post_content));
                }
                ChatMessage.ShareMomentInfo shareMomentInfo5 = item.getShareMomentInfo();
                Integer numValueOf2 = shareMomentInfo5 != null ? Integer.valueOf(shareMomentInfo5.getMomentType()) : null;
                int value = MomentType.Image.getValue();
                if (numValueOf2 != null && numValueOf2.intValue() == value) {
                    strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0._photo_);
                } else {
                    int value2 = MomentType.Video.getValue();
                    if (numValueOf2 != null && numValueOf2.intValue() == value2) {
                        strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0._Video_);
                    } else {
                        strOooO0OO2 = (numValueOf2 != null && numValueOf2.intValue() == MomentType.Poll.getValue()) ? com.code.android.util.o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(oO00OOo0.Other), "]");
                    }
                }
                textView4.setText(strOooO0OO2);
            } else {
                ChatMessage.ShareMomentInfo shareMomentInfo6 = item.getShareMomentInfo();
                if (shareMomentInfo6 != null && (momentText2 = shareMomentInfo6.getMomentText()) != null) {
                    str = momentText2;
                }
                p595o0oo00Oo.o0000Ooo.OooO0OO(holder.itemView.getContext(), new MomentSendContentModel(str), textView4, null);
            }
            textView4.setMaxLines(2);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareMoment.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("receiveShareMomentInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0o0());
            oooO00o5.OooO0o(4, 4, 0, 0);
            ChatMessage.ShareMomentInfo shareMomentInfo7 = item.getShareMomentInfo();
            oooO00o5.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(shareMomentInfo7 != null ? shareMomentInfo7.getMomentImage() : null);
            oooO00o5.f43909OooO00o = 0;
            oooO00o5.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_post_head_photo_receive));
            TextView textView5 = (TextView) holder.getView(oO00O0oO.tv_share_post_name_receive);
            View view2 = holder.getView(oO00O0oO.ivVideo);
            ChatMessage.ShareMomentInfo shareMomentInfo8 = item.getShareMomentInfo();
            view2.setVisibility((shareMomentInfo8 != null && shareMomentInfo8.getMomentType() == MomentType.Video.getValue()) == true ? 0 : 8);
            ChatMessage.ShareMomentInfo shareMomentInfo9 = item.getShareMomentInfo();
            String momentText4 = shareMomentInfo9 != null ? shareMomentInfo9.getMomentText() : null;
            if ((momentText4 == null || StringsKt.isBlank(momentText4)) == true) {
                ChatMessage.ShareMomentInfo shareMomentInfo10 = item.getShareMomentInfo();
                String momentImage2 = shareMomentInfo10 != null ? shareMomentInfo10.getMomentImage() : null;
                if (momentImage2 != null && momentImage2.length() != 0) {
                    z = false;
                }
                if (z) {
                    textView5.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.share_post_content));
                }
                ChatMessage.ShareMomentInfo shareMomentInfo11 = item.getShareMomentInfo();
                Integer numValueOf3 = shareMomentInfo11 != null ? Integer.valueOf(shareMomentInfo11.getMomentType()) : null;
                int value3 = MomentType.Image.getValue();
                if (numValueOf3 != null && numValueOf3.intValue() == value3) {
                    strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0._photo_);
                } else {
                    int value4 = MomentType.Video.getValue();
                    if (numValueOf3 != null && numValueOf3.intValue() == value4) {
                        strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0._Video_);
                    } else {
                        strOooO0OO = (numValueOf3 != null && numValueOf3.intValue() == MomentType.Poll.getValue()) ? com.code.android.util.o0000.OooO0OO(oO00OOo0._Poll_) : p004OooO0oO.o000oOoO.OooO00o("[", com.code.android.util.o0000.OooO0OO(oO00OOo0.Other), "]");
                    }
                }
                textView5.setText(strOooO0OO);
            } else {
                ChatMessage.ShareMomentInfo shareMomentInfo12 = item.getShareMomentInfo();
                if (shareMomentInfo12 != null && (momentText = shareMomentInfo12.getMomentText()) != null) {
                    str = momentText;
                }
                p595o0oo00Oo.o0000Ooo.OooO0OO(holder.itemView.getContext(), new MomentSendContentModel(str), textView5, null);
            }
            textView5.setMaxLines(2);
            return;
        }
        if (itemViewType2 == ViewType.SendShareTopic.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("sendShareTopicInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o6 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o6.OooO00o(p543o0oO0O00.OooO.OooO0o0());
            oooO00o6.OooO0o(4, 4, 0, 0);
            ChatMessage.ShareTopicInfo shareTopicInfo = item.getShareTopicInfo();
            oooO00o6.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(shareTopicInfo != null ? shareTopicInfo.getTopicImage() : null);
            oooO00o6.f43909OooO00o = 0;
            oooO00o6.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_topic_head_photo_send));
            TextView textView6 = (TextView) holder.getView(oO00O0oO.tv_share_topic_name_send);
            ChatMessage.ShareTopicInfo shareTopicInfo2 = item.getShareTopicInfo();
            textView6.setText(shareTopicInfo2 != null ? shareTopicInfo2.getTopicName() : null);
            textView6.setMaxLines(1);
            TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) holder.getView(oO00O0oO.tv_share_send_topic_number);
            topicFollowPostNumberView.setVisibility(0);
            ChatMessage.ShareTopicInfo shareTopicInfo3 = item.getShareTopicInfo();
            int topicUserCount = shareTopicInfo3 != null ? shareTopicInfo3.getTopicUserCount() : 0;
            ChatMessage.ShareTopicInfo shareTopicInfo4 = item.getShareTopicInfo();
            topicFollowPostNumberView.OooO00o(topicUserCount, shareTopicInfo4 != null ? shareTopicInfo4.getTopicMomentCount() : 0, -1);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareTopic.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("receiveShareTopicInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o7 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o7.OooO00o(p543o0oO0O00.OooO.OooO0o0());
            oooO00o7.OooO0o(4, 4, 0, 0);
            ChatMessage.ShareTopicInfo shareTopicInfo5 = item.getShareTopicInfo();
            oooO00o7.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(shareTopicInfo5 != null ? shareTopicInfo5.getTopicImage() : null);
            oooO00o7.f43909OooO00o = 0;
            oooO00o7.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_topic_head_photo_receive));
            TextView textView7 = (TextView) holder.getView(oO00O0oO.tv_share_topic_name_receive);
            ChatMessage.ShareTopicInfo shareTopicInfo6 = item.getShareTopicInfo();
            textView7.setText(shareTopicInfo6 != null ? shareTopicInfo6.getTopicName() : null);
            textView7.setMaxLines(1);
            TopicFollowPostNumberView topicFollowPostNumberView2 = (TopicFollowPostNumberView) holder.getView(oO00O0oO.tv_share_receive_topic_number);
            topicFollowPostNumberView2.setVisibility(0);
            ChatMessage.ShareTopicInfo shareTopicInfo7 = item.getShareTopicInfo();
            int topicUserCount2 = shareTopicInfo7 != null ? shareTopicInfo7.getTopicUserCount() : 0;
            ChatMessage.ShareTopicInfo shareTopicInfo8 = item.getShareTopicInfo();
            topicFollowPostNumberView2.OooO00o(topicUserCount2, shareTopicInfo8 != null ? shareTopicInfo8.getTopicMomentCount() : 0, -1);
            return;
        }
        if (itemViewType2 == ViewType.SendShareUser.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("sendShareUserInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o8 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o8.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            ChatMessage.ShareUserInfo shareUserInfo = item.getShareUserInfo();
            oooO00o8.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(p139o00OOooO.OooO0o.OooO0Oo(shareUserInfo != null ? shareUserInfo.getUserHead() : null));
            oooO00o8.f43909OooO00o = 0;
            oooO00o8.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_user_head_photo_send));
            TextView textView8 = (TextView) holder.getView(oO00O0oO.tv_share_user_name_send);
            ChatMessage.ShareUserInfo shareUserInfo2 = item.getShareUserInfo();
            textView8.setText(shareUserInfo2 != null ? shareUserInfo2.getUserName() : null);
            textView8.setMaxLines(1);
            TextView textView9 = (TextView) holder.getView(oO00O0oO.tv_share_user_id_send);
            String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(oO00OOo0.single_ID_XXX);
            String[] strArr3 = new String[1];
            ChatMessage.ShareUserInfo shareUserInfo3 = item.getShareUserInfo();
            strArr3[0] = String.valueOf(shareUserInfo3 != null ? Long.valueOf(shareUserInfo3.getUserIdx()) : null);
            textView9.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO4, strArr3));
            textView9.setMaxLines(1);
            holder.setText(oO00O0oO.tv_share_user_sign_send, com.code.android.util.o0000.OooO0OO(oO00OOo0.Tap_to_view_the_user));
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareUser.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("receiveShareUserInfo -> \nitem = " + item);
            o0OOo0O.OooOO0.OooO00o oooO00o9 = new o0OOo0O.OooOO0.OooO00o(holder.itemView.getContext());
            oooO00o9.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            ChatMessage.ShareUserInfo shareUserInfo4 = item.getShareUserInfo();
            oooO00o9.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(p139o00OOooO.OooO0o.OooO0Oo(shareUserInfo4 != null ? shareUserInfo4.getUserHead() : null));
            oooO00o9.f43909OooO00o = 0;
            oooO00o9.OooO0Oo((ImageView) holder.getView(oO00O0oO.nv_share_user_head_photo_receive));
            TextView textView10 = (TextView) holder.getView(oO00O0oO.tv_share_user_name_receive);
            ChatMessage.ShareUserInfo shareUserInfo5 = item.getShareUserInfo();
            textView10.setText(shareUserInfo5 != null ? shareUserInfo5.getUserName() : null);
            textView10.setMaxLines(1);
            TextView textView11 = (TextView) holder.getView(oO00O0oO.tv_share_user_id_receive);
            String strOooO0OO5 = com.code.android.util.o0000.OooO0OO(oO00OOo0.single_ID_XXX);
            String[] strArr4 = new String[1];
            ChatMessage.ShareUserInfo shareUserInfo6 = item.getShareUserInfo();
            strArr4[0] = String.valueOf(shareUserInfo6 != null ? Long.valueOf(shareUserInfo6.getUserIdx()) : null);
            textView11.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO5, strArr4));
            textView11.setMaxLines(1);
            holder.setText(oO00O0oO.tv_share_user_sign_receive, com.code.android.util.o0000.OooO0OO(oO00OOo0.Tap_to_view_the_user));
            return;
        }
        if (itemViewType2 == ViewType.SendShareActivity.getValue()) {
            OooOO0O(holder, item);
            OooOO0(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveShareActivity.getValue()) {
            OooOO0O(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.SendGiveRoomTheme.getValue()) {
            OooO(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveGetRoomTheme.getValue()) {
            OooO(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.UnknownMessage.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("setUnknownMessageInfo -> \nitem = " + item);
            TextView textView12 = (TextView) holder.getView(oO00O0oO.tv_chat_private_text);
            String strOooO0OO6 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Unknown_Chat_Message);
            int i4 = oO00OOo0.Update_Yalla;
            textView12.setText(strOooO0OO6 + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0000.OooO0OO(i4));
            p417o0OoO0.o000O0o.OooO00o(textView12, com.code.android.util.o0000.OooO0OO(i4), new o0000Ooo(this));
            return;
        }
        if (itemViewType2 == ViewType.SendEventRoom.getValue()) {
            OooOO0o(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ReceiveEventRoom.getValue()) {
            OooOO0o(holder, item);
            return;
        }
        if (itemViewType2 == ViewType.ToYallaChat4ChatMessage.getValue()) {
            p592o0oo00O.OooOOO0.OooO0O0("setChatMessageYallaChat -> \nitem = " + item);
            String strOooO0OO7 = com.code.android.util.o0000.OooO0OO(oO00OOo0.chatMessageToYallaChatTag);
            TextView textView13 = (TextView) holder.getView(oO00O0oO.tvChatMessage_toYallaChat);
            com.code.android.util.o000OO00.OooOOOO(textView13);
            textView13.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.chatMessageToYallaChatContent));
            textView13.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.adapter.o000000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    PrivateChatAdapter this$0 = this.f27465OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Function0<Unit> function0 = this$0.f27436OooOo;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
            p417o0OoO0.o000O0o.OooO0Oo(textView13, com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9), strOooO0OO7);
            com.code.android.util.o000OO00.OooO0O0(holder.getView(oO00O0oO.niv_chat_message_header));
        }
    }

    public final void OooOO0(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        p592o0oo00O.OooOOO0.OooO0O0("ChatMessage sendState=" + chatMessage.getSendState());
        SVGAView sVGAView = (SVGAView) pagingViewHolder.getView(oO00O0oO.svga_message_status);
        sVGAView.setImageDrawable(null);
        sVGAView.OooO0o();
        com.code.android.util.o000OO00.OooO0O0(sVGAView);
        int sendState = chatMessage.getSendState();
        if (sendState == StatusEnum$MsgSendStatus.ING.OooO00o()) {
            com.code.android.util.o000OO00.OooOOOO(sVGAView);
            sVGAView.setVideoItem(this.f27438OooOo00);
            sVGAView.OooO0Oo();
            sVGAView.setOnClickListener(null);
            return;
        }
        if (sendState == StatusEnum$MsgSendStatus.SUCCESS.OooO00o()) {
            sVGAView.setImageDrawable(null);
            sVGAView.OooO0o();
            com.code.android.util.o000OO00.OooO0O0(sVGAView);
        } else {
            if (sendState == StatusEnum$MsgSendStatus.FAIL.OooO00o() || sendState == StatusEnum$MsgSendStatus.QINIUFAIL.OooO00o()) {
                sVGAView.OooO0o();
                sVGAView.setImageDrawable(com.code.android.util.o0000.OooO0O0(oO00OOO.icon_message_fail));
                com.code.android.util.o000OO00.OooOOOO(sVGAView);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x010c, please report this as an issue */
    public final void OooOOO(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        ChatMessage.VoiceInfo voiceInfo;
        ChatMessage.VoiceInfo voiceInfo2;
        boolean z;
        p592o0oo00O.OooOOO0.OooO0O0("setVoiceInfo -> \nitem = " + chatMessage);
        TextView textView = (TextView) pagingViewHolder.getView(oO00O0oO.tv_chat_voice_duration);
        ChatMessage.VoiceInfo voiceInfo3 = chatMessage.getVoiceInfo();
        long voiceDuration = voiceInfo3 != null ? voiceInfo3.getVoiceDuration() : 0L;
        textView.setText(voiceDuration + "\"");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (chatMessage.getIsAcceptMsg()) {
            layoutParams.setMarginEnd(com.code.android.util.o0000O0.OooO00o(voiceDuration != 1 ? voiceDuration * 5.0f : 10.0f));
            int i = oO00O0oO.iv_chat_voice_read;
            ChatMessage.VoiceInfo voiceInfo4 = chatMessage.getVoiceInfo();
            if (voiceInfo4 != null) {
                z = voiceInfo4.getIsVoiceRead();
            }
            pagingViewHolder.setGone(i, z);
        } else {
            layoutParams.setMarginStart(com.code.android.util.o0000O0.OooO00o(voiceDuration != 1 ? voiceDuration * 5.0f : 10.0f));
        }
        textView.setLayoutParams(layoutParams);
        SVGAView sVGAView = (SVGAView) pagingViewHolder.getView(oO00O0oO.svga_chat_voice);
        ChatMessage chatMessage2 = this.f27440OooOo0o;
        if (chatMessage2 == null || !Intrinsics.areEqual(chatMessage2.getMid(), chatMessage.getMid())) {
            p592o0oo00O.OooOOO0.OooO0O0("playingVoice mid = " + chatMessage.getMid() + "   stop");
            int i2 = SVGAView.f10159OooOooo;
            sVGAView.OooOOO0(false);
            sVGAView.setImageResource(oOo00OO0.icon_chitchat_send_play3);
        } else {
            ChatMessage chatMessage3 = this.f27440OooOo0o;
            ChatMessage.VoiceInfo.PlayState playState = null;
            if (((chatMessage3 == null || (voiceInfo2 = chatMessage3.getVoiceInfo()) == null) ? null : voiceInfo2.getPlayState()) != ChatMessage.VoiceInfo.PlayState.Stop) {
                int i3 = SVGAView.f10159OooOooo;
                sVGAView.OooOOO0(false);
                ChatMessage chatMessage4 = this.f27440OooOo0o;
                if (chatMessage4 != null && (voiceInfo = chatMessage4.getVoiceInfo()) != null) {
                    playState = voiceInfo.getPlayState();
                }
                ChatMessage.VoiceInfo.PlayState playState2 = ChatMessage.VoiceInfo.PlayState.Download;
                FragmentActivity fragmentActivity = this.f27434OooOOo0;
                if (playState == playState2) {
                    sVGAView.OooOO0O("svga/anim_voice_loading.svga", fragmentActivity);
                    p592o0oo00O.OooOOO0.OooO0O0("playingVoice mid = " + chatMessage.getMid() + "   loading");
                } else {
                    sVGAView.OooOO0O("svga/anim_voice_play.svga", fragmentActivity);
                    p592o0oo00O.OooOOO0.OooO0O0("playingVoice mid = " + chatMessage.getMid() + "   play");
                }
                sVGAView.OooOO0o();
            } else {
                p592o0oo00O.OooOOO0.OooO0O0("playingVoice mid = " + chatMessage.getMid() + "   stop");
                int i4 = SVGAView.f10159OooOooo;
                sVGAView.OooOOO0(false);
                sVGAView.setImageResource(oOo00OO0.icon_chitchat_send_play3);
            }
        }
        ((LinearLayout) pagingViewHolder.getView(oO00O0oO.ll_private_chat_item_bg_voice)).setOnClickListener(new OooO0O0(chatMessage, pagingViewHolder));
    }

    public final void OooOOO0(PagingViewHolder pagingViewHolder, ChatMessage chatMessage) {
        p592o0oo00O.OooOOO0.OooO0O0("setTextInfo -> \nitem = " + chatMessage);
        MutableLiveData<List<p365o0OOo0Oo.OooOo>> mutableLiveData = p365o0OOo0Oo.Oooo000.f43954OooO00o;
        pagingViewHolder.setText(oO00O0oO.tv_chat_private_text, p365o0OOo0Oo.Oooo000.OooO0Oo(com.code.android.util.o0000O0.OooO00o((float) 18), chatMessage.getMessage()));
        if ((!StringsKt.isBlank(this.f27433OooOOo) && !Intrinsics.areEqual(this.f27433OooOOo, chatMessage.getMid())) || !chatMessage.getIsWarn()) {
            if (pagingViewHolder.getItemViewType() == ViewType.ReceiveText.getValue()) {
                pagingViewHolder.setGone(oO00O0oO.tv_chat_private_text_privacy, true);
                return;
            }
            return;
        }
        this.f27433OooOOo = chatMessage.getMid();
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.private_chat_privacy);
        String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Report);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, strOooO0OO2));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0OO, strOooO0OO2), strOooO0OO2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new OooO00o(), iIndexOf$default, strOooO0OO2.length() + iIndexOf$default, 33);
        TextView textView = (TextView) pagingViewHolder.getView(oO00O0oO.tv_chat_private_text_privacy);
        if (oOOoOOO0.f56695OooO0O0 == null) {
            oOOoOOO0.f56695OooO0O0 = new oOOoOOO0();
        }
        textView.setMovementMethod(oOOoOOO0.f56695OooO0O0);
        textView.setText(spannableStringBuilder);
        com.code.android.util.o000OO00.OooOOOO(textView);
    }

    public final void OooOOOO() {
        ChatMessage chatMessage = this.f27440OooOo0o;
        if (chatMessage != null && chatMessage.getVoiceInfo() != null) {
            ChatMessage chatMessage2 = this.f27440OooOo0o;
            ChatMessage.VoiceInfo voiceInfo = chatMessage2 != null ? chatMessage2.getVoiceInfo() : null;
            if (voiceInfo != null) {
                voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Stop);
            }
            int itemCount = getItemCount();
            for (int i = 0; i < itemCount; i++) {
                ChatMessage chatMessage3 = this.f27440OooOo0o;
                String mid = chatMessage3 != null ? chatMessage3.getMid() : null;
                ChatMessage chatMessageOooO0O0 = OooO0O0(i);
                if (Intrinsics.areEqual(mid, chatMessageOooO0O0 != null ? chatMessageOooO0O0.getMid() : null)) {
                    notifyItemChanged(i);
                    break;
                }
            }
        }
        this.f27440OooOo0o = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ChatMessage chatMessageOooO0O0 = OooO0O0(i);
        Integer numValueOf = chatMessageOooO0O0 != null ? Integer.valueOf(chatMessageOooO0O0.getContentType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return ViewType.ChatCommonViewType.getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveText : ViewType.SendText).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveVoice : ViewType.SendVoice).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveEmotion : ViewType.SendEmotion).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveGif : ViewType.SendGif).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveGift : ViewType.SendGift).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 6) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveShareRoom : ViewType.SendShareRoom).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 7) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveShareMoment : ViewType.SendShareMoment).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 8) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveShareTopic : ViewType.SendShareTopic).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 9) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveShareUser : ViewType.SendShareUser).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 10) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveShareActivity : ViewType.SendShareActivity).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 11) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveGetRoomTheme : ViewType.SendGiveRoomTheme).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 12) {
            return (chatMessageOooO0O0.getIsAcceptMsg() ? ViewType.ReceiveEventRoom : ViewType.SendEventRoom).getValue();
        }
        if (numValueOf != null && numValueOf.intValue() == 101) {
            return ViewType.ToYallaChat4ChatMessage.getValue();
        }
        return (numValueOf != null && numValueOf.intValue() == 100) ? ViewType.UnknownMessage.getValue() : ViewType.SendText.getValue();
    }
}
