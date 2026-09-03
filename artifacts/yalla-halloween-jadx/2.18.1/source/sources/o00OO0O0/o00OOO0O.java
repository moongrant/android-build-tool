package o00OO0O0;

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
import com.app.base.model.ChatModel;
import com.app.base.model.RoomMessageReplyInfo;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.GiftNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final TextView f31556OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f31557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final View f31558OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f31559OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Space f31560OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f31561OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f31562OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f31563OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ImageView f31564OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ImageView f31565OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final TextView f31566OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f31567OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f31568OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f31569OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final NetImageView f31570OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final SVGAView f31571OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final GiftNumberView f31572OooOOo0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Drawable background = o00OOO0O.this.f31559OooO0OO.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(ColorStateList.valueOf(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_4D000000)));
            return Unit.INSTANCE;
        }
    }

    public o00OOO0O(@NotNull FragmentActivity activity, @NotNull View view) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31557OooO00o = activity;
        this.f31558OooO0O0 = view;
        View viewFindViewById = view.findViewById(R.id.layout_msg_reply_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.layout_msg_reply_layout)");
        this.f31559OooO0OO = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_msg_reply_end_space);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tv_msg_reply_end_space)");
        this.f31560OooO0Oo = (Space) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_msg_reply_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.tv_msg_reply_user)");
        this.f31562OooO0o0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_msg_reply_emoji_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.iv_msg_reply_emoji_tag)");
        this.f31561OooO0o = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_msg_reply_emoji_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "view.findViewById(R.id.tv_msg_reply_emoji_tag)");
        this.f31563OooO0oO = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.iv_msg_reply_pic_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "view.findViewById(R.id.iv_msg_reply_pic_tag)");
        this.f31564OooO0oo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_msg_reply_pic_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "view.findViewById(R.id.tv_msg_reply_pic_tag)");
        this.f31556OooO = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.iv_msg_reply_gift_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "view.findViewById(R.id.iv_msg_reply_gift_tag)");
        this.f31565OooOO0 = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_msg_reply_gift_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "view.findViewById(R.id.tv_msg_reply_gift_tag)");
        this.f31566OooOO0O = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.iv_msg_reply_gift_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "view.findViewById(R.id.iv_msg_reply_gift_to)");
        this.f31567OooOO0o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.tv_msg_reply_gift_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "view.findViewById(R.id.tv_msg_reply_gift_to)");
        this.f31569OooOOO0 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.tv_msg_reply_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "view.findViewById(R.id.tv_msg_reply_text)");
        this.f31568OooOOO = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.iv_msg_reply_pic_gif);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "view.findViewById(R.id.iv_msg_reply_pic_gif)");
        this.f31570OooOOOO = (NetImageView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.iv_msg_reply_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "view.findViewById(R.id.iv_msg_reply_gift)");
        this.f31571OooOOOo = (SVGAView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.iv_msg_reply_giftNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "view.findViewById(R.id.iv_msg_reply_giftNumber)");
        this.f31572OooOOo0 = (GiftNumberView) viewFindViewById15;
        OooO00o();
    }

    public final void OooO00o() {
        p254o00ooO0O.oOO00O.OooO00o(this.f31561OooO0o);
        p254o00ooO0O.oOO00O.OooO00o(this.f31563OooO0oO);
        p254o00ooO0O.oOO00O.OooO00o(this.f31564OooO0oo);
        p254o00ooO0O.oOO00O.OooO00o(this.f31560OooO0Oo);
        p254o00ooO0O.oOO00O.OooO00o(this.f31556OooO);
        p254o00ooO0O.oOO00O.OooO00o(this.f31570OooOOOO);
        p254o00ooO0O.oOO00O.OooO00o(this.f31565OooOO0);
        p254o00ooO0O.oOO00O.OooO00o(this.f31566OooOO0O);
        p254o00ooO0O.oOO00O.OooO00o(this.f31567OooOO0o);
        p254o00ooO0O.oOO00O.OooO00o(this.f31569OooOOO0);
        p254o00ooO0O.oOO00O.OooO00o(this.f31568OooOOO);
        p254o00ooO0O.oOO00O.OooO00o(this.f31571OooOOOo);
        p254o00ooO0O.oOO00O.OooO00o(this.f31572OooOOo0);
    }

    public final void OooO0O0(@NotNull ChatModel chatModel) {
        String message;
        RoomUserInfoModel.ChatBubbleInfo bubbleInfo;
        String bubbleReplyColour;
        RoomUserInfoModel.ChatBubbleInfo bubbleInfo2;
        String message2;
        RoomMessageReplyInfo.User to;
        RoomMessageReplyInfo.GifEmoticon gifEmoticon;
        String gifUrl;
        Intrinsics.checkNotNullParameter(chatModel, "chatModel");
        p254o00ooO0O.oOO00O.OooO00o(this.f31559OooO0OO);
        RoomMessageReplyInfo roomMessageReplyInfo = chatModel.replyInfo;
        if (roomMessageReplyInfo != null) {
            p254o00ooO0O.oOO00O.OooO(this.f31559OooO0OO);
            RoomMessageReplyInfo.User from = roomMessageReplyInfo.getFrom();
            String bubbleReplyColour2 = null;
            String userName = from != null ? from.getUserName() : null;
            RoomMessageReplyInfo.User from2 = roomMessageReplyInfo.getFrom();
            String str = new p150o00Oo0Oo.OooOo(userName, from2 != null ? from2.getUserId() : 0L).f32172Oooo0o;
            Intrinsics.checkNotNullExpressionValue(str, "EditTextSpanItem(model.f…l.from?.userId ?: 0).text");
            p254o00ooO0O.oOO00O.OooO00o(this.f31562OooO0o0);
            if (str.length() > 0) {
                p254o00ooO0O.oOO00O.OooO(this.f31562OooO0o0);
                this.f31562OooO0o0.setText(str);
            }
            int replyType = roomMessageReplyInfo.getReplyType();
            if (replyType == 1) {
                RoomMessageReplyInfo.Text text = roomMessageReplyInfo.getText();
                if (text != null && (message = text.getMessage()) != null) {
                    p453o0Ooo.OooOO0 oooOO1 = p453o0Ooo.OooOO0.f40347OooO00o;
                    SpannableString spannableStringOooO0Oo = p453o0Ooo.OooOO0.OooO0Oo(message, com.yalla.support.common.util.OooOo00.OooO00o(14.0f));
                    OooO00o();
                    if (spannableStringOooO0Oo.length() > 0) {
                        p254o00ooO0O.oOO00O.OooO(this.f31568OooOOO);
                        this.f31568OooOOO.setText(spannableStringOooO0Oo);
                    }
                }
            } else if (replyType == 2) {
                RoomMessageReplyInfo.Pic pic = roomMessageReplyInfo.getPic();
                if (pic != null && (message2 = pic.getMessage()) != null) {
                    OooO00o();
                    if (message2.length() > 0) {
                        p254o00ooO0O.oOO00O.OooO(this.f31564OooO0oo);
                        p254o00ooO0O.oOO00O.OooO(this.f31556OooO);
                        p254o00ooO0O.oOO00O.OooO(this.f31560OooO0Oo);
                        p254o00ooO0O.oOO00O.OooO(this.f31570OooOOOO);
                        this.f31570OooOOOO.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f31557OooO00o);
                        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(message2);
                        oooO00o.f48427OooO00o = 0;
                        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
                        oooO00o.f48432OooO0o0 = true;
                        oooO00o.OooO0oo(0, 4, 0, 4);
                        oooO00o.OooO0o(this.f31570OooOOOO);
                    }
                }
            } else if (replyType == 3) {
                RoomMessageReplyInfo.Gift gift = roomMessageReplyInfo.getGift();
                if (gift != null && (to = gift.getTo()) != null) {
                    int number = gift.getNumber();
                    String giftUrl = gift.getGiftUrl();
                    String userName2 = to.getUserName();
                    OooO00o();
                    if (giftUrl.length() > 0) {
                        p254o00ooO0O.oOO00O.OooO(this.f31565OooOO0);
                        p254o00ooO0O.oOO00O.OooO(this.f31566OooOO0O);
                        p254o00ooO0O.oOO00O.OooO(this.f31567OooOO0o);
                        p254o00ooO0O.oOO00O.OooO(this.f31569OooOOO0);
                        this.f31569OooOOO0.setText(userName2);
                        p254o00ooO0O.oOO00O.OooO(this.f31560OooO0Oo);
                        p254o00ooO0O.oOO00O.OooO(this.f31571OooOOOo);
                        SVGAView sVGAView = this.f31571OooOOOo;
                        sVGAView.f21010OooooO0 = R.drawable.icon_gift_default_gray;
                        sVGAView.OooO0oo(CloudImageUtilKt.imgFormat(giftUrl), this.f31557OooO00o);
                        sVGAView.OooO();
                        if (number > 0) {
                            p254o00ooO0O.oOO00O.OooO(this.f31572OooOOo0);
                            this.f31572OooOOo0.setNumber(number);
                        }
                    }
                }
            } else if (replyType == 5 && (gifEmoticon = roomMessageReplyInfo.getGifEmoticon()) != null && (gifUrl = gifEmoticon.getGifUrl()) != null) {
                OooO00o();
                if (gifUrl.length() > 0) {
                    p254o00ooO0O.oOO00O.OooO(this.f31561OooO0o);
                    p254o00ooO0O.oOO00O.OooO(this.f31563OooO0oO);
                    p254o00ooO0O.oOO00O.OooO(this.f31560OooO0Oo);
                    p254o00ooO0O.oOO00O.OooO(this.f31570OooOOOO);
                    this.f31563OooO0oO.setText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Room_Reply_Emoji));
                    oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f31557OooO00o);
                    oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(gifUrl);
                    oooO00o2.f48427OooO00o = 0;
                    oooO00o2.f48441OooOOOo = R.drawable.icon_gift_default_gray;
                    oooO00o2.f48431OooO0o = R.drawable.icon_gift_default_gray;
                    oooO00o2.f48432OooO0o0 = true;
                    oooO00o2.OooO0oO(4);
                    oooO00o2.OooO0o(this.f31570OooOOOO);
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("bubbleReplyColour11 ");
            RoomMessageReplyInfo.User from3 = roomMessageReplyInfo.getFrom();
            if (from3 != null && (bubbleInfo2 = from3.getBubbleInfo()) != null) {
                bubbleReplyColour2 = bubbleInfo2.getBubbleReplyColour();
            }
            sbOooO0o0.append(bubbleReplyColour2);
            p515o0o0O00.o00O00.OooO0O0(sbOooO0o0.toString());
            RoomUserInfoModel roomUserInfoModel = chatModel.from;
            if (roomUserInfoModel == null || (bubbleInfo = roomUserInfoModel.getBubbleInfo()) == null || (bubbleReplyColour = bubbleInfo.getBubbleReplyColour()) == null) {
                new OooO00o();
                return;
            }
            try {
                Drawable background = this.f31559OooO0OO.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setColor(ColorStateList.valueOf(Color.parseColor(bubbleReplyColour)));
            } catch (Exception unused) {
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
