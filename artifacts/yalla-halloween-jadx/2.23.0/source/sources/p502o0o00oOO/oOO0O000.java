package p502o0o00oOO;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p365o0OOo0Oo.OooOo;
import p365o0OOo0Oo.Oooo000;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p585o0oOooOO.h;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nViewHolderReply.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHolderReply.kt\ncom/yalla/yalla/ui/adapter/roomChat/ViewHolderReply\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class oOO0O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final TextView f49653OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f49654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final View f49655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f49656OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Space f49657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f49658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f49659OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f49660OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ImageView f49661OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ImageView f49662OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final TextView f49663OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f49664OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f49665OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f49666OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final NetImageView f49667OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final SVGAView f49668OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final GiftNumberView f49669OooOOo0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Drawable background = oOO0O000.this.f49656OooO0OO.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(ColorStateList.valueOf(o0000.OooO00o(oO00O0o.color_4D000000)));
            return Unit.INSTANCE;
        }
    }

    public oOO0O000(@NotNull View view, @NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f49654OooO00o = activity;
        this.f49655OooO0O0 = view;
        View viewFindViewById = view.findViewById(oO00O0oO.layout_msg_reply_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.layout_msg_reply_layout)");
        this.f49656OooO0OO = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(oO00O0oO.tv_msg_reply_end_space);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_msg_reply_end_space)");
        this.f49657OooO0Oo = (Space) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(oO00O0oO.tv_msg_reply_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.tv_msg_reply_user)");
        this.f49659OooO0o0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(oO00O0oO.iv_msg_reply_emoji_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_msg_reply_emoji_tag)");
        this.f49658OooO0o = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(oO00O0oO.tv_msg_reply_emoji_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tv_msg_reply_emoji_tag)");
        this.f49660OooO0oO = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(oO00O0oO.iv_msg_reply_pic_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.iv_msg_reply_pic_tag)");
        this.f49661OooO0oo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(oO00O0oO.tv_msg_reply_pic_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tv_msg_reply_pic_tag)");
        this.f49653OooO = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(oO00O0oO.iv_msg_reply_gift_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.iv_msg_reply_gift_tag)");
        this.f49662OooOO0 = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(oO00O0oO.tv_msg_reply_gift_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(R.id.tv_msg_reply_gift_tag)");
        this.f49663OooOO0O = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(oO00O0oO.iv_msg_reply_gift_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(R.id.iv_msg_reply_gift_to)");
        this.f49664OooOO0o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(oO00O0oO.tv_msg_reply_gift_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(R.id.tv_msg_reply_gift_to)");
        this.f49666OooOOO0 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(oO00O0oO.tv_msg_reply_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(R.id.tv_msg_reply_text)");
        this.f49665OooOOO = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(oO00O0oO.iv_msg_reply_pic_gif);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "view.findViewById(R.id.iv_msg_reply_pic_gif)");
        this.f49667OooOOOO = (NetImageView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(oO00O0oO.iv_msg_reply_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "view.findViewById(R.id.iv_msg_reply_gift)");
        this.f49668OooOOOo = (SVGAView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(oO00O0oO.iv_msg_reply_giftNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "view.findViewById(R.id.iv_msg_reply_giftNumber)");
        this.f49669OooOOo0 = (GiftNumberView) viewFindViewById15;
        OooO00o();
    }

    public final void OooO00o() {
        o000OO00.OooO0O0(this.f49658OooO0o);
        o000OO00.OooO0O0(this.f49660OooO0oO);
        o000OO00.OooO0O0(this.f49661OooO0oo);
        o000OO00.OooO0O0(this.f49657OooO0Oo);
        o000OO00.OooO0O0(this.f49653OooO);
        o000OO00.OooO0O0(this.f49667OooOOOO);
        o000OO00.OooO0O0(this.f49662OooOO0);
        o000OO00.OooO0O0(this.f49663OooOO0O);
        o000OO00.OooO0O0(this.f49664OooOO0o);
        o000OO00.OooO0O0(this.f49666OooOOO0);
        o000OO00.OooO0O0(this.f49665OooOOO);
        o000OO00.OooO0O0(this.f49668OooOOOo);
        o000OO00.OooO0O0(this.f49669OooOOo0);
    }

    public final void OooO0O0(@NotNull ChatModel chatModel) {
        String message;
        String bubbleReplyColour;
        RoomUserInfoDTO.ChatBubbleInfo bubbleInfo;
        String message2;
        RoomMessageReplyInfo.User to;
        RoomMessageReplyInfo.GifEmoticon gifEmoticon;
        String gifUrl;
        Intrinsics.checkNotNullParameter(chatModel, "chatModel");
        ConstraintLayout constraintLayout = this.f49656OooO0OO;
        o000OO00.OooO0O0(constraintLayout);
        RoomMessageReplyInfo replyInfo = chatModel.getReplyInfo();
        if (replyInfo != null) {
            o000OO00.OooOOOO(constraintLayout);
            RoomMessageReplyInfo.User from = replyInfo.getFrom();
            String bubbleReplyColour2 = null;
            String userName = from != null ? from.getUserName() : null;
            RoomMessageReplyInfo.User from2 = replyInfo.getFrom();
            String str = new h(userName, from2 != null ? from2.getUserId() : 0L).f56769OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(str, "EditTextSpanItem(model.f…l.from?.userId ?: 0).text");
            TextView textView = this.f49659OooO0o0;
            o000OO00.OooO0O0(textView);
            if (str.length() > 0) {
                o000OO00.OooOOOO(textView);
                textView.setText(str);
            }
            int replyType = replyInfo.getReplyType();
            if (replyType != 1) {
                NetImageView netImageView = this.f49667OooOOOO;
                FragmentActivity fragmentActivity = this.f49654OooO00o;
                Space space = this.f49657OooO0Oo;
                if (replyType == 2) {
                    RoomMessageReplyInfo.Pic pic = replyInfo.getPic();
                    if (pic != null && (message2 = pic.getMessage()) != null) {
                        OooO00o();
                        if (message2.length() > 0) {
                            o000OO00.OooOOOO(this.f49661OooO0oo);
                            o000OO00.OooOOOO(this.f49653OooO);
                            o000OO00.OooOOOO(space);
                            o000OO00.OooOOOO(netImageView);
                            netImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(fragmentActivity);
                            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(message2);
                            oooO00o.f43909OooO00o = 0;
                            oooO00o.OooO00o(OooO.OooO0Oo());
                            oooO00o.f43914OooO0o0 = true;
                            oooO00o.OooO0o(0, 4, 0, 4);
                            oooO00o.OooO0Oo(netImageView);
                        }
                    }
                } else if (replyType == 3) {
                    RoomMessageReplyInfo.Gift gift = replyInfo.getGift();
                    if (gift != null && (to = gift.getTo()) != null) {
                        int number = gift.getNumber();
                        String giftUrl = gift.getGiftUrl();
                        String userName2 = to.getUserName();
                        OooO00o();
                        if (giftUrl.length() > 0) {
                            o000OO00.OooOOOO(this.f49662OooOO0);
                            o000OO00.OooOOOO(this.f49663OooOO0O);
                            o000OO00.OooOOOO(this.f49664OooOO0o);
                            TextView textView2 = this.f49666OooOOO0;
                            o000OO00.OooOOOO(textView2);
                            textView2.setText(userName2);
                            o000OO00.OooOOOO(space);
                            SVGAView sVGAView = this.f49668OooOOOo;
                            o000OO00.OooOOOO(sVGAView);
                            int i = oOo00OO0.icon_gift_default_gray;
                            sVGAView.f10172OooOooO = i;
                            sVGAView.setImageResource(i);
                            sVGAView.OooOO0O(OooO0o.OooO0Oo(giftUrl), fragmentActivity);
                            sVGAView.OooOO0o();
                            if (number > 0) {
                                GiftNumberView giftNumberView = this.f49669OooOOo0;
                                o000OO00.OooOOOO(giftNumberView);
                                giftNumberView.setNumber(number);
                            }
                        }
                    }
                } else if (replyType == 5 && (gifEmoticon = replyInfo.getGifEmoticon()) != null && (gifUrl = gifEmoticon.getGifUrl()) != null) {
                    OooO00o();
                    if (gifUrl.length() > 0) {
                        o000OO00.OooOOOO(this.f49658OooO0o);
                        TextView textView3 = this.f49660OooO0oO;
                        o000OO00.OooOOOO(textView3);
                        o000OO00.OooOOOO(space);
                        o000OO00.OooOOOO(netImageView);
                        textView3.setText(o0000.OooO0OO(oO00OOo0.Room_Reply_Emoji));
                        OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(fragmentActivity);
                        oooO00o2.f43911OooO0OO = OooO0o.OooO0Oo(gifUrl);
                        oooO00o2.f43909OooO00o = 0;
                        int i2 = oOo00OO0.icon_gift_default_gray;
                        oooO00o2.f43923OooOOOo = i2;
                        oooO00o2.f43913OooO0o = i2;
                        oooO00o2.f43914OooO0o0 = true;
                        oooO00o2.OooO0o0(4);
                        oooO00o2.OooO0Oo(netImageView);
                    }
                }
            } else {
                RoomMessageReplyInfo.Text text = replyInfo.getText();
                if (text != null && (message = text.getMessage()) != null) {
                    MutableLiveData<List<OooOo>> mutableLiveData = Oooo000.f43954OooO00o;
                    SpannableString spannableStringOooO0Oo = Oooo000.OooO0Oo(o0000O0.OooO00o(14), message);
                    OooO00o();
                    if (spannableStringOooO0Oo.length() > 0) {
                        TextView textView4 = this.f49665OooOOO;
                        o000OO00.OooOOOO(textView4);
                        textView4.setText(spannableStringOooO0Oo);
                    }
                }
            }
            RoomMessageReplyInfo.User from3 = replyInfo.getFrom();
            if (from3 != null && (bubbleInfo = from3.getBubbleInfo()) != null) {
                bubbleReplyColour2 = bubbleInfo.getBubbleReplyColour();
            }
            OooOOO0.OooO0O0("bubbleReplyColour11 " + bubbleReplyColour2);
            RoomUserInfoModel newFrom = chatModel.getNewFrom();
            Intrinsics.checkNotNull(newFrom);
            RoomUserInfoDTO.ChatBubbleInfo value = newFrom.getBubbleInfo().getValue();
            if (value == null || (bubbleReplyColour = value.getBubbleReplyColour()) == null) {
                new OooO00o();
                return;
            }
            try {
                Drawable background = constraintLayout.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setColor(ColorStateList.valueOf(Color.parseColor(bubbleReplyColour)));
            } catch (Exception unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
