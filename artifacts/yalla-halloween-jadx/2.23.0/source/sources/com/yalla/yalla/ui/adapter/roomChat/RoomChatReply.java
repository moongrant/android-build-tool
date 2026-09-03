package com.yalla.yalla.ui.adapter.roomChat;

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
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p641o0ooOOOO.r7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020#¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/yalla/yalla/ui/adapter/roomChat/RoomChatReply;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "userName", "", "setUser", "Landroid/text/SpannableString;", "content", "setText", "picUrl", "setPic", "", "Landroid/view/View;", "getViewList", "Landroidx/fragment/app/FragmentActivity;", "OooO0o0", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "activity", "Lkotlin/Function0;", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getItemClickListener", "()Lkotlin/jvm/functions/Function0;", "setItemClickListener", "(Lkotlin/jvm/functions/Function0;)V", "itemClickListener", "", "OooO0oO", "getItemLongClickListener", "setItemLongClickListener", "itemLongClickListener", "", "OooO", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "position", "Lcom/yalla/yalla/model/chat/ChatModel;", "OooOO0", "Lcom/yalla/yalla/model/chat/ChatModel;", "getModel", "()Lcom/yalla/yalla/model/chat/ChatModel;", "setModel", "(Lcom/yalla/yalla/model/chat/ChatModel;)V", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomChatReply.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatReply.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatReply\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1855#2,2:234\n1#3:236\n*S KotlinDebug\n*F\n+ 1 RoomChatReply.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatReply\n*L\n79#1:234,2\n*E\n"})
public final class RoomChatReply extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer position;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final r7 f27721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> itemClickListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public FragmentActivity activity;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Boolean> itemLongClickListener;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f27725OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ChatModel model;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomChatReply(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setPic(String picUrl) {
        OooO0O0();
        if (picUrl.length() > 0) {
            r7 r7Var = this.f27721OooO0Oo;
            ImageView imageView = r7Var.f58744OooO0o0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivPicTag");
            o000OO00.OooOOOO(imageView);
            TextView textView = r7Var.f58751OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvPicTag");
            o000OO00.OooOOOO(textView);
            Space space = r7Var.f58740OooO0O0;
            Intrinsics.checkNotNullExpressionValue(space, "binding.endSpace");
            o000OO00.OooOOOO(space);
            NetImageView netImageView = r7Var.f58745OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
            o000OO00.OooOOOO(netImageView);
            netImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.activity);
            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(picUrl);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(OooO.OooO0Oo());
            oooO00o.f43914OooO0o0 = true;
            oooO00o.OooO0o(0, 4, 0, 4);
            oooO00o.OooO0Oo(netImageView);
        }
    }

    private final void setText(SpannableString content) {
        OooO0O0();
        if (content.length() > 0) {
            r7 r7Var = this.f27721OooO0Oo;
            TextView textView = r7Var.f58750OooOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvText");
            o000OO00.OooOOOO(textView);
            r7Var.f58750OooOOO.setText(content);
        }
    }

    private final void setUser(String userName) {
        r7 r7Var = this.f27721OooO0Oo;
        TextView textView = r7Var.f58753OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUser");
        o000OO00.OooO0O0(textView);
        if (userName.length() > 0) {
            TextView textView2 = r7Var.f58753OooOOOo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvUser");
            o000OO00.OooOOOO(textView2);
            r7Var.f58753OooOOOo.setText(userName);
        }
    }

    public final void OooO0O0() {
        r7 r7Var = this.f27721OooO0Oo;
        ImageView imageView = r7Var.f58741OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmojiTag");
        o000OO00.OooO0O0(imageView);
        TextView textView = r7Var.f58748OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvEmojiTag");
        o000OO00.OooO0O0(textView);
        ImageView imageView2 = r7Var.f58744OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivPicTag");
        o000OO00.OooO0O0(imageView2);
        Space space = r7Var.f58740OooO0O0;
        Intrinsics.checkNotNullExpressionValue(space, "binding.endSpace");
        o000OO00.OooO0O0(space);
        TextView textView2 = r7Var.f58751OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvPicTag");
        o000OO00.OooO0O0(textView2);
        NetImageView netImageView = r7Var.f58745OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
        o000OO00.OooO0O0(netImageView);
        ImageView imageView3 = r7Var.f58742OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
        o000OO00.OooO0O0(imageView3);
        TextView textView3 = r7Var.f58749OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGiftTag");
        o000OO00.OooO0O0(textView3);
        ImageView imageView4 = r7Var.f58746OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivToTag");
        o000OO00.OooO0O0(imageView4);
        TextView textView4 = r7Var.f58752OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvToTag");
        o000OO00.OooO0O0(textView4);
        TextView textView5 = r7Var.f58750OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvText");
        o000OO00.OooO0O0(textView5);
        SVGAView sVGAView = r7Var.f58743OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivReplyGift");
        o000OO00.OooO0O0(sVGAView);
        GiftNumberView giftNumberView = r7Var.f58747OooOO0;
        Intrinsics.checkNotNullExpressionValue(giftNumberView, "binding.numberView");
        o000OO00.OooO0O0(giftNumberView);
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
        return this.f27725OooO0oo;
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
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomChatReply(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomChatReply(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        r7 r7VarInflate = r7.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r7VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f27721OooO0Oo = r7VarInflate;
        ArrayList arrayList = new ArrayList();
        this.f27725OooO0oo = arrayList;
        ConstraintLayout constraintLayout = r7VarInflate.f58738OooO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutReply");
        arrayList.add(constraintLayout);
        Space space = r7VarInflate.f58740OooO0O0;
        Intrinsics.checkNotNullExpressionValue(space, "binding.endSpace");
        arrayList.add(space);
        TextView textView = r7VarInflate.f58753OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUser");
        arrayList.add(textView);
        ImageView imageView = r7VarInflate.f58741OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmojiTag");
        arrayList.add(imageView);
        TextView textView2 = r7VarInflate.f58748OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvEmojiTag");
        arrayList.add(textView2);
        ImageView imageView2 = r7VarInflate.f58744OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivPicTag");
        arrayList.add(imageView2);
        TextView textView3 = r7VarInflate.f58751OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvPicTag");
        arrayList.add(textView3);
        ImageView imageView3 = r7VarInflate.f58742OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
        arrayList.add(imageView3);
        TextView textView4 = r7VarInflate.f58749OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvGiftTag");
        arrayList.add(textView4);
        ImageView imageView4 = r7VarInflate.f58746OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivToTag");
        arrayList.add(imageView4);
        TextView textView5 = r7VarInflate.f58752OooOOOO;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvToTag");
        arrayList.add(textView5);
        TextView textView6 = r7VarInflate.f58750OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvText");
        arrayList.add(textView6);
        NetImageView netImageView = r7VarInflate.f58745OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivReplyPicGif");
        arrayList.add(netImageView);
        SVGAView sVGAView = r7VarInflate.f58743OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivReplyGift");
        arrayList.add(sVGAView);
        GiftNumberView giftNumberView = r7VarInflate.f58747OooOO0;
        Intrinsics.checkNotNullExpressionValue(giftNumberView, "binding.numberView");
        arrayList.add(giftNumberView);
        OooO0O0();
    }
}
