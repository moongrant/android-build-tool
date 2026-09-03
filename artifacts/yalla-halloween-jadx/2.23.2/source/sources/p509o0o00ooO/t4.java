package p509o0o00ooO;

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
import com.code.android.util.o000O;
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
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p369o0OOo0o.OooOOO;
import p369o0OOo0o.OooOOO0;
import p557o0oOOooO.oOo00ooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nViewHolderReply.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHolderReply.kt\ncom/yalla/yalla/ui/adapter/roomChat/ViewHolderReply\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
public final class t4 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final TextView f50820OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f50821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final View f50822OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f50823OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Space f50824OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f50825OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f50826OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final TextView f50827OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ImageView f50828OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ImageView f50829OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final TextView f50830OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ImageView f50831OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f50832OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f50833OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final NetImageView f50834OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final SVGAView f50835OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final GiftNumberView f50836OooOOo0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Drawable background = t4.this.f50823OooO0OO.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) background).setColor(ColorStateList.valueOf(o0000.OooO00o(o0OOO0o.color_4D000000)));
            return Unit.INSTANCE;
        }
    }

    public t4(@NotNull View view, @NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50821OooO00o = activity;
        this.f50822OooO0O0 = view;
        View viewFindViewById = view.findViewById(o0OO00O.layout_msg_reply_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50823OooO0OO = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(o0OO00O.tv_msg_reply_end_space);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f50824OooO0Oo = (Space) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(o0OO00O.tv_msg_reply_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f50826OooO0o0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(o0OO00O.iv_msg_reply_emoji_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f50825OooO0o = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(o0OO00O.tv_msg_reply_emoji_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f50827OooO0oO = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(o0OO00O.iv_msg_reply_pic_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f50828OooO0oo = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(o0OO00O.tv_msg_reply_pic_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f50820OooO = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(o0OO00O.iv_msg_reply_gift_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.f50829OooOO0 = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(o0OO00O.tv_msg_reply_gift_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.f50830OooOO0O = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(o0OO00O.iv_msg_reply_gift_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.f50831OooOO0o = (ImageView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(o0OO00O.tv_msg_reply_gift_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f50833OooOOO0 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(o0OO00O.tv_msg_reply_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.f50832OooOOO = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(o0OO00O.iv_msg_reply_pic_gif);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        this.f50834OooOOOO = (NetImageView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(o0OO00O.iv_msg_reply_gift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        this.f50835OooOOOo = (SVGAView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(o0OO00O.iv_msg_reply_giftNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.f50836OooOOo0 = (GiftNumberView) viewFindViewById15;
        OooO00o();
    }

    public final void OooO00o() {
        o000O.OooO0O0(this.f50825OooO0o);
        o000O.OooO0O0(this.f50827OooO0oO);
        o000O.OooO0O0(this.f50828OooO0oo);
        o000O.OooO0O0(this.f50824OooO0Oo);
        o000O.OooO0O0(this.f50820OooO);
        o000O.OooO0O0(this.f50834OooOOOO);
        o000O.OooO0O0(this.f50829OooOO0);
        o000O.OooO0O0(this.f50830OooOO0O);
        o000O.OooO0O0(this.f50831OooOO0o);
        o000O.OooO0O0(this.f50833OooOOO0);
        o000O.OooO0O0(this.f50832OooOOO);
        o000O.OooO0O0(this.f50835OooOOOo);
        o000O.OooO0O0(this.f50836OooOOo0);
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
        ConstraintLayout constraintLayout = this.f50823OooO0OO;
        o000O.OooO0O0(constraintLayout);
        RoomMessageReplyInfo replyInfo = chatModel.getReplyInfo();
        if (replyInfo != null) {
            o000O.OooOOOO(constraintLayout);
            RoomMessageReplyInfo.User from = replyInfo.getFrom();
            String bubbleReplyColour2 = null;
            String userName = from != null ? from.getUserName() : null;
            RoomMessageReplyInfo.User from2 = replyInfo.getFrom();
            String str = new oOo00ooO(userName, from2 != null ? from2.getUserId() : 0L).f56180OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
            TextView textView = this.f50826OooO0o0;
            o000O.OooO0O0(textView);
            if (str.length() > 0) {
                o000O.OooOOOO(textView);
                textView.setText(str);
            }
            int replyType = replyInfo.getReplyType();
            if (replyType != 1) {
                NetImageView netImageView = this.f50834OooOOOO;
                FragmentActivity fragmentActivity = this.f50821OooO00o;
                Space space = this.f50824OooO0Oo;
                if (replyType == 2) {
                    RoomMessageReplyInfo.Pic pic = replyInfo.getPic();
                    if (pic != null && (message2 = pic.getMessage()) != null) {
                        OooO00o();
                        if (message2.length() > 0) {
                            o000O.OooOOOO(this.f50828OooO0oo);
                            o000O.OooOOOO(this.f50820OooO);
                            o000O.OooOOOO(space);
                            o000O.OooOOOO(netImageView);
                            netImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(fragmentActivity);
                            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(message2);
                            oooO00o.f43124OooO00o = 0;
                            oooO00o.OooO00o(d1.OooO0Oo());
                            oooO00o.f43129OooO0o0 = true;
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
                            o000O.OooOOOO(this.f50829OooOO0);
                            o000O.OooOOOO(this.f50830OooOO0O);
                            o000O.OooOOOO(this.f50831OooOO0o);
                            TextView textView2 = this.f50833OooOOO0;
                            o000O.OooOOOO(textView2);
                            textView2.setText(userName2);
                            o000O.OooOOOO(space);
                            SVGAView sVGAView = this.f50835OooOOOo;
                            o000O.OooOOOO(sVGAView);
                            int i = o0Oo0oo.icon_gift_default_gray;
                            sVGAView.f13232OooOooO = i;
                            sVGAView.setImageResource(i);
                            sVGAView.OooOO0O(OooO0OO.OooO0Oo(giftUrl), fragmentActivity);
                            sVGAView.OooOO0o();
                            if (number > 0) {
                                GiftNumberView giftNumberView = this.f50836OooOOo0;
                                o000O.OooOOOO(giftNumberView);
                                giftNumberView.setNumber(number);
                            }
                        }
                    }
                } else if (replyType == 5 && (gifEmoticon = replyInfo.getGifEmoticon()) != null && (gifUrl = gifEmoticon.getGifUrl()) != null) {
                    OooO00o();
                    if (gifUrl.length() > 0) {
                        o000O.OooOOOO(this.f50825OooO0o);
                        TextView textView3 = this.f50827OooO0oO;
                        o000O.OooOOOO(textView3);
                        o000O.OooOOOO(space);
                        o000O.OooOOOO(netImageView);
                        textView3.setText(o0000.OooO0OO(o000000.Room_Reply_Emoji));
                        Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(fragmentActivity);
                        oooO00o2.f43126OooO0OO = OooO0OO.OooO0Oo(gifUrl);
                        oooO00o2.f43124OooO00o = 0;
                        int i2 = o0Oo0oo.icon_gift_default_gray;
                        oooO00o2.f43138OooOOOo = i2;
                        oooO00o2.f43128OooO0o = i2;
                        oooO00o2.f43129OooO0o0 = true;
                        oooO00o2.OooO0o0(4);
                        oooO00o2.OooO0Oo(netImageView);
                    }
                }
            } else {
                RoomMessageReplyInfo.Text text = replyInfo.getText();
                if (text != null && (message = text.getMessage()) != null) {
                    MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43158OooO00o;
                    SpannableString spannableStringOooO0Oo = OooOOO.OooO0Oo(o0000O0.OooO00o(14), message);
                    OooO00o();
                    if (spannableStringOooO0Oo.length() > 0) {
                        TextView textView4 = this.f50832OooOOO;
                        o000O.OooOOOO(textView4);
                        textView4.setText(spannableStringOooO0Oo);
                    }
                }
            }
            RoomMessageReplyInfo.User from3 = replyInfo.getFrom();
            if (from3 != null && (bubbleInfo = from3.getBubbleInfo()) != null) {
                bubbleReplyColour2 = bubbleInfo.getBubbleReplyColour();
            }
            o0000O00.OooO0O0("bubbleReplyColour11 " + bubbleReplyColour2);
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
