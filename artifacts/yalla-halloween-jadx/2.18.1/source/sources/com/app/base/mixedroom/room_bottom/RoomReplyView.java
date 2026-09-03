package com.app.base.mixedroom.room_bottom;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.GiftNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import oo0O.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0Oo.OooOo;
import p453o0Ooo.OooOO0;
import p522o0o0O0o.o00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ej;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/app/base/mixedroom/room_bottom/RoomReplyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "userName", "", "setUser", "Landroid/text/SpannableString;", "content", "setText", "picUrl", "setPic", "Lcom/app/base/model/ChatModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "setChatModel", "getChatModel", "Landroidx/fragment/app/FragmentActivity;", "Oooo0oo", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "activity", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomReplyView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public ej f11851Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public ChatModel f11852Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public FragmentActivity activity;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            RoomReplyView roomReplyView = RoomReplyView.this;
            roomReplyView.f11852Oooo0oO = null;
            roomReplyView.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomReplyView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setPic(String picUrl) {
        if (picUrl.length() > 0) {
            ConstraintLayout constraintLayout = this.f11851Oooo0o.f49297OooO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReply");
            o00O.OooO00o(constraintLayout, OooOo00.OooO00o(66.0f));
            ImageView imageView = this.f11851Oooo0o.f49301OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivPicTag");
            o00O0O.OooO(imageView);
            TextView textView = this.f11851Oooo0o.f49309OooOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvPicTag");
            o00O0O.OooO(textView);
            ConstraintLayout constraintLayout2 = this.f11851Oooo0o.f49306OooOO0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layoutReplyEnd");
            o00O0O.OooO(constraintLayout2);
            NetImageView netImageView = this.f11851Oooo0o.f49304OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
            o00O0O.OooO(netImageView);
            this.f11851Oooo0o.f49304OooO0oO.setScaleType(ImageView.ScaleType.CENTER_CROP);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.activity);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(picUrl);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.f48432OooO0o0 = true;
            oooO00o.OooO0oO(4);
            oooO00o.OooO0o(this.f11851Oooo0o.f49304OooO0oO);
        }
    }

    private final void setText(SpannableString content) {
        if (content.length() > 0) {
            ConstraintLayout constraintLayout = this.f11851Oooo0o.f49297OooO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReply");
            o00O.OooO00o(constraintLayout, OooOo00.OooO00o(66.0f));
            TextView textView = this.f11851Oooo0o.f49311OooOOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvText");
            o00O0O.OooO(textView);
            this.f11851Oooo0o.f49311OooOOOO.setText(content);
        }
    }

    private final void setUser(String userName) {
        if (userName.length() > 0) {
            TextView textView = this.f11851Oooo0o.f49313OooOOo0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUser");
            o00O0O.OooO(textView);
            this.f11851Oooo0o.f49313OooOOo0.setText(userName);
        }
    }

    public final void OooO0O0() {
        OooO0OO();
        TextView textView = this.f11851Oooo0o.f49313OooOOo0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUser");
        o00O0O.OooO00o(textView);
        ImageView imageView = this.f11851Oooo0o.f49299OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmojiTag");
        o00O0O.OooO00o(imageView);
        TextView textView2 = this.f11851Oooo0o.f49308OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvEmojiTag");
        o00O0O.OooO00o(textView2);
        ImageView imageView2 = this.f11851Oooo0o.f49301OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivPicTag");
        o00O0O.OooO00o(imageView2);
        TextView textView3 = this.f11851Oooo0o.f49309OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvPicTag");
        o00O0O.OooO00o(textView3);
        ConstraintLayout constraintLayout = this.f11851Oooo0o.f49306OooOO0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReplyEnd");
        o00O0O.OooO00o(constraintLayout);
        NetImageView netImageView = this.f11851Oooo0o.f49304OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
        o00O0O.OooO00o(netImageView);
        ImageView imageView3 = this.f11851Oooo0o.f49300OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
        o00O0O.OooO00o(imageView3);
        TextView textView4 = this.f11851Oooo0o.f49310OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvGiftTag");
        o00O0O.OooO00o(textView4);
        ImageView imageView4 = this.f11851Oooo0o.f49305OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivToTag");
        o00O0O.OooO00o(imageView4);
        TextView textView5 = this.f11851Oooo0o.f49312OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvToTag");
        o00O0O.OooO00o(textView5);
        TextView textView6 = this.f11851Oooo0o.f49311OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvText");
        o00O0O.OooO00o(textView6);
        SVGAView sVGAView = this.f11851Oooo0o.f49302OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivReplyGift");
        o00O0O.OooO00o(sVGAView);
        GiftNumberView giftNumberView = this.f11851Oooo0o.f49307OooOO0O;
        Intrinsics.checkNotNullExpressionValue(giftNumberView, "binding.numberView");
        o00O0O.OooO00o(giftNumberView);
    }

    public final void OooO0OO() {
        ConstraintLayout constraintLayout = this.f11851Oooo0o.f49297OooO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReply");
        o00O0O.OooO00o(constraintLayout);
    }

    public final void OooO0Oo() {
        OooO0O0();
        ChatModel chatModel = this.f11852Oooo0oO;
        if (chatModel != null) {
            ConstraintLayout constraintLayout = this.f11851Oooo0o.f49297OooO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReply");
            o00O0O.OooO(constraintLayout);
            String str = new OooOo(chatModel.from.getUserName(), chatModel.from.getUserId()).f32172Oooo0o;
            Intrinsics.checkNotNullExpressionValue(str, "EditTextSpanItem(model.f…, model.from.userId).text");
            setUser(str);
            int i = chatModel.type;
            if (i == 0) {
                OooOO0 oooOO1 = OooOO0.f40347OooO00o;
                String str2 = chatModel.message;
                Intrinsics.checkNotNullExpressionValue(str2, "model.message");
                setText(OooOO0.OooO0Oo(str2, OooOo00.OooO00o(14.0f)));
                return;
            }
            if (i != 1) {
                if (i == 7) {
                    String str3 = chatModel.message;
                    Intrinsics.checkNotNullExpressionValue(str3, "model.message");
                    setPic(str3);
                    return;
                }
                if (i != 16) {
                    if (i == 11 || i == 12) {
                        OooOO0 oooOO2 = OooOO0.f40347OooO00o;
                        String str4 = chatModel.message;
                        Intrinsics.checkNotNullExpressionValue(str4, "model.message");
                        setText(OooOO0.OooO0Oo(str4, OooOo00.OooO00o(14.0f)));
                        return;
                    }
                    return;
                }
                String str5 = chatModel.gif.gifUrl;
                Intrinsics.checkNotNullExpressionValue(str5, "model.gif.gifUrl");
                if (str5.length() > 0) {
                    ConstraintLayout constraintLayout2 = this.f11851Oooo0o.f49297OooO;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layoutReply");
                    o00O.OooO00o(constraintLayout2, OooOo00.OooO00o(66.0f));
                    ImageView imageView = this.f11851Oooo0o.f49299OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmojiTag");
                    o00O0O.OooO(imageView);
                    TextView textView = this.f11851Oooo0o.f49308OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.tvEmojiTag");
                    o00O0O.OooO(textView);
                    ConstraintLayout constraintLayout3 = this.f11851Oooo0o.f49306OooOO0;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.layoutReplyEnd");
                    o00O0O.OooO(constraintLayout3);
                    NetImageView netImageView = this.f11851Oooo0o.f49304OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
                    o00O0O.OooO(netImageView);
                    if (i != 16) {
                        this.f11851Oooo0o.f49308OooOO0o.setText(OooOOO.OooO0OO(R.string.Room_Reply_Emoji));
                        return;
                    }
                    oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.activity);
                    oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(str5);
                    oooO00o.f48427OooO00o = 0;
                    oooO00o.f48441OooOOOo = R.drawable.icon_gift_default_gray;
                    oooO00o.f48431OooO0o = R.drawable.icon_gift_default_gray;
                    oooO00o.f48432OooO0o0 = true;
                    oooO00o.OooO0oO(4);
                    oooO00o.OooO0o(this.f11851Oooo0o.f49304OooO0oO);
                    this.f11851Oooo0o.f49308OooOO0o.setText(OooOOO.OooO0OO(R.string.Room_Reply_Emoji));
                    return;
                }
                return;
            }
            String giftImageUrl = chatModel.giftUrl;
            if (giftImageUrl == null || StringsKt.isBlank(giftImageUrl)) {
                GiftPropModel giftPropModelOooO0O0 = OooO0OO.f53327OooO00o.OooO0O0(chatModel.giftid);
                giftImageUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
            }
            RoomUserInfoModel to = chatModel.to;
            if (to != null) {
                Intrinsics.checkNotNullExpressionValue(to, "to");
                int i2 = chatModel.number;
                Intrinsics.checkNotNullExpressionValue(giftImageUrl, "giftImageUrl");
                String userName = to.getUserName();
                if (giftImageUrl.length() > 0) {
                    ConstraintLayout constraintLayout4 = this.f11851Oooo0o.f49297OooO;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "binding.layoutReply");
                    o00O.OooO00o(constraintLayout4, OooOo00.OooO00o(66.0f));
                    ImageView imageView2 = this.f11851Oooo0o.f49300OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivGiftTag");
                    o00O0O.OooO(imageView2);
                    TextView textView2 = this.f11851Oooo0o.f49310OooOOO0;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvGiftTag");
                    o00O0O.OooO(textView2);
                    ImageView imageView3 = this.f11851Oooo0o.f49305OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivToTag");
                    o00O0O.OooO(imageView3);
                    TextView textView3 = this.f11851Oooo0o.f49312OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvToTag");
                    o00O0O.OooO(textView3);
                    ConstraintLayout constraintLayout5 = this.f11851Oooo0o.f49306OooOO0;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout5, "binding.layoutReplyEnd");
                    o00O0O.OooO(constraintLayout5);
                    SVGAView sVGAView = this.f11851Oooo0o.f49302OooO0o;
                    Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivReplyGift");
                    o00O0O.OooO(sVGAView);
                    SVGAView sVGAView2 = this.f11851Oooo0o.f49302OooO0o;
                    sVGAView2.f21010OooooO0 = R.drawable.icon_gift_default_gray;
                    sVGAView2.OooO0oo(CloudImageUtilKt.imgFormat(giftImageUrl), this.activity);
                    sVGAView2.OooO();
                    this.f11851Oooo0o.f49312OooOOOo.setText(userName);
                    if (i2 > 0) {
                        GiftNumberView giftNumberView = this.f11851Oooo0o.f49307OooOO0O;
                        Intrinsics.checkNotNullExpressionValue(giftNumberView, "binding.numberView");
                        o00O0O.OooO(giftNumberView);
                        this.f11851Oooo0o.f49307OooOO0O.setNumber(i2);
                    }
                }
            }
        }
    }

    @Nullable
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @Nullable
    /* JADX INFO: renamed from: getChatModel, reason: from getter */
    public final ChatModel getF11852Oooo0oO() {
        return this.f11852Oooo0oO;
    }

    public final void setActivity(@Nullable FragmentActivity fragmentActivity) {
        this.activity = fragmentActivity;
    }

    public final void setChatModel(@Nullable ChatModel model) {
        this.f11852Oooo0oO = model;
        OooO0Oo();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomReplyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomReplyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ej ejVarInflate = ej.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ejVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f11851Oooo0o = ejVarInflate;
        ImageView imageView = ejVarInflate.f49303OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivReplyClose");
        o00O0O.OooO0Oo(imageView, new OooO00o());
        OooO0O0();
    }
}
