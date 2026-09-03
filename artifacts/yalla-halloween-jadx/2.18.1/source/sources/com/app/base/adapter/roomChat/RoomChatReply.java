package com.app.base.adapter.roomChat;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.app.base.model.ChatModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.umeng.analytics.pro.d;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.GiftNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.bf;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020#¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/app/base/adapter/roomChat/RoomChatReply;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "userName", "", "setUser", "Landroid/text/SpannableString;", "content", "setText", "picUrl", "setPic", "", "Landroid/view/View;", "getViewList", "Landroidx/fragment/app/FragmentActivity;", "Oooo0oO", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "activity", "Lkotlin/Function0;", "Oooo0oo", "Lkotlin/jvm/functions/Function0;", "getItemClickListener", "()Lkotlin/jvm/functions/Function0;", "setItemClickListener", "(Lkotlin/jvm/functions/Function0;)V", "itemClickListener", "", "Oooo", "getItemLongClickListener", "setItemLongClickListener", "itemLongClickListener", "", "OoooO0", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "position", "Lcom/app/base/model/ChatModel;", "OoooO0O", "Lcom/app/base/model/ChatModel;", "getModel", "()Lcom/app/base/model/ChatModel;", "setModel", "(Lcom/app/base/model/ChatModel;)V", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomChatReply extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Boolean> itemLongClickListener;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final bf f11379Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public FragmentActivity activity;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> itemClickListener;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer position;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final List<View> f11383OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ChatModel model;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomChatReply(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setPic(String picUrl) {
        OooO0O0();
        if (picUrl.length() > 0) {
            ImageView imageView = this.f11379Oooo0o.f49047OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivPicTag");
            oOO00O.OooO(imageView);
            TextView textView = this.f11379Oooo0o.f49054OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvPicTag");
            oOO00O.OooO(textView);
            Space space = this.f11379Oooo0o.f49043OooO0O0;
            Intrinsics.checkNotNullExpressionValue(space, "binding.endSpace");
            oOO00O.OooO(space);
            NetImageView netImageView = this.f11379Oooo0o.f49048OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
            oOO00O.OooO(netImageView);
            this.f11379Oooo0o.f49048OooO0oO.setScaleType(ImageView.ScaleType.CENTER_CROP);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.activity);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(picUrl);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(OooO00o.OooO0o());
            oooO00o.f48432OooO0o0 = true;
            oooO00o.OooO0oo(0, 4, 0, 4);
            oooO00o.OooO0o(this.f11379Oooo0o.f49048OooO0oO);
        }
    }

    private final void setText(SpannableString content) {
        OooO0O0();
        if (content.length() > 0) {
            TextView textView = this.f11379Oooo0o.f49053OooOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvText");
            oOO00O.OooO(textView);
            this.f11379Oooo0o.f49053OooOOO.setText(content);
        }
    }

    private final void setUser(String userName) {
        TextView textView = this.f11379Oooo0o.f49056OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUser");
        oOO00O.OooO00o(textView);
        if (userName.length() > 0) {
            TextView textView2 = this.f11379Oooo0o.f49056OooOOOo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvUser");
            oOO00O.OooO(textView2);
            this.f11379Oooo0o.f49056OooOOOo.setText(userName);
        }
    }

    public final void OooO0O0() {
        ImageView imageView = this.f11379Oooo0o.f49044OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmojiTag");
        oOO00O.OooO00o(imageView);
        TextView textView = this.f11379Oooo0o.f49051OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvEmojiTag");
        oOO00O.OooO00o(textView);
        ImageView imageView2 = this.f11379Oooo0o.f49047OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivPicTag");
        oOO00O.OooO00o(imageView2);
        Space space = this.f11379Oooo0o.f49043OooO0O0;
        Intrinsics.checkNotNullExpressionValue(space, "binding.endSpace");
        oOO00O.OooO00o(space);
        TextView textView2 = this.f11379Oooo0o.f49054OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvPicTag");
        oOO00O.OooO00o(textView2);
        NetImageView netImageView = this.f11379Oooo0o.f49048OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
        oOO00O.OooO00o(netImageView);
        ImageView imageView3 = this.f11379Oooo0o.f49045OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
        oOO00O.OooO00o(imageView3);
        TextView textView3 = this.f11379Oooo0o.f49052OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGiftTag");
        oOO00O.OooO00o(textView3);
        ImageView imageView4 = this.f11379Oooo0o.f49049OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivToTag");
        oOO00O.OooO00o(imageView4);
        TextView textView4 = this.f11379Oooo0o.f49055OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvToTag");
        oOO00O.OooO00o(textView4);
        TextView textView5 = this.f11379Oooo0o.f49053OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvText");
        oOO00O.OooO00o(textView5);
        SVGAView sVGAView = this.f11379Oooo0o.f49046OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivReplyGift");
        oOO00O.OooO00o(sVGAView);
        GiftNumberView giftNumberView = this.f11379Oooo0o.f49050OooOO0;
        Intrinsics.checkNotNullExpressionValue(giftNumberView, "binding.numberView");
        oOO00O.OooO00o(giftNumberView);
    }

    @Nullable
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Function0<Unit> getItemClickListener() {
        return this.itemClickListener;
    }

    @Nullable
    public final Function0<Boolean> getItemLongClickListener() {
        return this.itemLongClickListener;
    }

    @Nullable
    public final ChatModel getModel() {
        return this.model;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @NotNull
    public final List<View> getViewList() {
        return this.f11383OoooO00;
    }

    public final void setActivity(@Nullable FragmentActivity fragmentActivity) {
        this.activity = fragmentActivity;
    }

    public final void setItemClickListener(@Nullable Function0<Unit> function0) {
        this.itemClickListener = function0;
    }

    public final void setItemLongClickListener(@Nullable Function0<Boolean> function0) {
        this.itemLongClickListener = function0;
    }

    public final void setModel(@Nullable ChatModel chatModel) {
        this.model = chatModel;
    }

    public final void setPosition(@Nullable Integer num) {
        this.position = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomChatReply(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomChatReply(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        bf bfVarInflate = bf.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(bfVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f11379Oooo0o = bfVarInflate;
        ArrayList arrayList = new ArrayList();
        this.f11383OoooO00 = arrayList;
        ConstraintLayout constraintLayout = bfVarInflate.f49041OooO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReply");
        arrayList.add(constraintLayout);
        Space space = bfVarInflate.f49043OooO0O0;
        Intrinsics.checkNotNullExpressionValue(space, "binding.endSpace");
        arrayList.add(space);
        TextView textView = bfVarInflate.f49056OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUser");
        arrayList.add(textView);
        ImageView imageView = bfVarInflate.f49044OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmojiTag");
        arrayList.add(imageView);
        TextView textView2 = bfVarInflate.f49051OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvEmojiTag");
        arrayList.add(textView2);
        ImageView imageView2 = bfVarInflate.f49047OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivPicTag");
        arrayList.add(imageView2);
        TextView textView3 = bfVarInflate.f49054OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvPicTag");
        arrayList.add(textView3);
        ImageView imageView3 = bfVarInflate.f49045OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
        arrayList.add(imageView3);
        TextView textView4 = bfVarInflate.f49052OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvGiftTag");
        arrayList.add(textView4);
        ImageView imageView4 = bfVarInflate.f49049OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivToTag");
        arrayList.add(imageView4);
        TextView textView5 = bfVarInflate.f49055OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvToTag");
        arrayList.add(textView5);
        TextView textView6 = bfVarInflate.f49053OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvText");
        arrayList.add(textView6);
        NetImageView netImageView = bfVarInflate.f49048OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
        arrayList.add(netImageView);
        SVGAView sVGAView = bfVarInflate.f49046OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivReplyGift");
        arrayList.add(sVGAView);
        GiftNumberView giftNumberView = bfVarInflate.f49050OooOO0;
        Intrinsics.checkNotNullExpressionValue(giftNumberView, "binding.numberView");
        arrayList.add(giftNumberView);
        OooO0O0();
    }
}
