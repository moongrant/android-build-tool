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
import com.code.android.util.o000O;
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
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.e;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020#¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006:"}, d2 = {"Lcom/yalla/yalla/ui/adapter/roomChat/RoomChatReply;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "userName", "", "setUser", "Landroid/text/SpannableString;", "content", "setText", "picUrl", "setPic", "", "Landroid/view/View;", "getViewList", "Landroidx/fragment/app/FragmentActivity;", "OooO0o0", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "activity", "Lkotlin/Function0;", "OooO0o", "Lkotlin/jvm/functions/Function0;", "getItemClickListener", "()Lkotlin/jvm/functions/Function0;", "setItemClickListener", "(Lkotlin/jvm/functions/Function0;)V", "itemClickListener", "", "OooO0oO", "getItemLongClickListener", "setItemLongClickListener", "itemLongClickListener", "", "OooO", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "position", "Lcom/yalla/yalla/model/chat/ChatModel;", "OooOO0", "Lcom/yalla/yalla/model/chat/ChatModel;", "getModel", "()Lcom/yalla/yalla/model/chat/ChatModel;", "setModel", "(Lcom/yalla/yalla/model/chat/ChatModel;)V", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomChatReply.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatReply.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatReply\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1855#2,2:234\n1#3:236\n*S KotlinDebug\n*F\n+ 1 RoomChatReply.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatReply\n*L\n79#1:234,2\n*E\n"})
public final class RoomChatReply extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer position;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final e f27259OooO0Oo;

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
    public final ArrayList f27263OooO0oo;

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
            e eVar = this.f27259OooO0Oo;
            ImageView ivPicTag = eVar.f43796OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ivPicTag, "ivPicTag");
            o000O.OooOOOO(ivPicTag);
            TextView tvPicTag = eVar.f43803OooOOO0;
            Intrinsics.checkNotNullExpressionValue(tvPicTag, "tvPicTag");
            o000O.OooOOOO(tvPicTag);
            Space endSpace = eVar.f43792OooO0O0;
            Intrinsics.checkNotNullExpressionValue(endSpace, "endSpace");
            o000O.OooOOOO(endSpace);
            NetImageView ivReplyPicGif = eVar.f43797OooO0oO;
            Intrinsics.checkNotNullExpressionValue(ivReplyPicGif, "ivReplyPicGif");
            o000O.OooOOOO(ivReplyPicGif);
            ivReplyPicGif.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.activity);
            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(picUrl);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.f43129OooO0o0 = true;
            oooO00o.OooO0o(0, 4, 0, 4);
            oooO00o.OooO0Oo(ivReplyPicGif);
        }
    }

    private final void setText(SpannableString content) {
        OooO0O0();
        if (content.length() > 0) {
            e eVar = this.f27259OooO0Oo;
            TextView tvText = eVar.f43802OooOOO;
            Intrinsics.checkNotNullExpressionValue(tvText, "tvText");
            o000O.OooOOOO(tvText);
            eVar.f43802OooOOO.setText(content);
        }
    }

    private final void setUser(String userName) {
        e eVar = this.f27259OooO0Oo;
        TextView tvUser = eVar.f43805OooOOOo;
        Intrinsics.checkNotNullExpressionValue(tvUser, "tvUser");
        o000O.OooO0O0(tvUser);
        if (userName.length() > 0) {
            TextView tvUser2 = eVar.f43805OooOOOo;
            Intrinsics.checkNotNullExpressionValue(tvUser2, "tvUser");
            o000O.OooOOOO(tvUser2);
            eVar.f43805OooOOOo.setText(userName);
        }
    }

    public final void OooO0O0() {
        e eVar = this.f27259OooO0Oo;
        ImageView ivEmojiTag = eVar.f43793OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivEmojiTag, "ivEmojiTag");
        o000O.OooO0O0(ivEmojiTag);
        TextView tvEmojiTag = eVar.f43800OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvEmojiTag, "tvEmojiTag");
        o000O.OooO0O0(tvEmojiTag);
        ImageView ivPicTag = eVar.f43796OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivPicTag, "ivPicTag");
        o000O.OooO0O0(ivPicTag);
        Space endSpace = eVar.f43792OooO0O0;
        Intrinsics.checkNotNullExpressionValue(endSpace, "endSpace");
        o000O.OooO0O0(endSpace);
        TextView tvPicTag = eVar.f43803OooOOO0;
        Intrinsics.checkNotNullExpressionValue(tvPicTag, "tvPicTag");
        o000O.OooO0O0(tvPicTag);
        NetImageView ivReplyPicGif = eVar.f43797OooO0oO;
        Intrinsics.checkNotNullExpressionValue(ivReplyPicGif, "ivReplyPicGif");
        o000O.OooO0O0(ivReplyPicGif);
        ImageView ivGiftTag = eVar.f43794OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
        o000O.OooO0O0(ivGiftTag);
        TextView tvGiftTag = eVar.f43801OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
        o000O.OooO0O0(tvGiftTag);
        ImageView ivToTag = eVar.f43798OooO0oo;
        Intrinsics.checkNotNullExpressionValue(ivToTag, "ivToTag");
        o000O.OooO0O0(ivToTag);
        TextView tvToTag = eVar.f43804OooOOOO;
        Intrinsics.checkNotNullExpressionValue(tvToTag, "tvToTag");
        o000O.OooO0O0(tvToTag);
        TextView tvText = eVar.f43802OooOOO;
        Intrinsics.checkNotNullExpressionValue(tvText, "tvText");
        o000O.OooO0O0(tvText);
        SVGAView ivReplyGift = eVar.f43795OooO0o;
        Intrinsics.checkNotNullExpressionValue(ivReplyGift, "ivReplyGift");
        o000O.OooO0O0(ivReplyGift);
        GiftNumberView numberView = eVar.f43799OooOO0;
        Intrinsics.checkNotNullExpressionValue(numberView, "numberView");
        o000O.OooO0O0(numberView);
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
        return this.f27263OooO0oo;
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
        e eVarInflate = e.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(eVarInflate, "inflate(...)");
        this.f27259OooO0Oo = eVarInflate;
        ArrayList arrayList = new ArrayList();
        this.f27263OooO0oo = arrayList;
        ConstraintLayout layoutReply = eVarInflate.f43790OooO;
        Intrinsics.checkNotNullExpressionValue(layoutReply, "layoutReply");
        arrayList.add(layoutReply);
        Space endSpace = eVarInflate.f43792OooO0O0;
        Intrinsics.checkNotNullExpressionValue(endSpace, "endSpace");
        arrayList.add(endSpace);
        TextView tvUser = eVarInflate.f43805OooOOOo;
        Intrinsics.checkNotNullExpressionValue(tvUser, "tvUser");
        arrayList.add(tvUser);
        ImageView ivEmojiTag = eVarInflate.f43793OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivEmojiTag, "ivEmojiTag");
        arrayList.add(ivEmojiTag);
        TextView tvEmojiTag = eVarInflate.f43800OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvEmojiTag, "tvEmojiTag");
        arrayList.add(tvEmojiTag);
        ImageView ivPicTag = eVarInflate.f43796OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivPicTag, "ivPicTag");
        arrayList.add(ivPicTag);
        TextView tvPicTag = eVarInflate.f43803OooOOO0;
        Intrinsics.checkNotNullExpressionValue(tvPicTag, "tvPicTag");
        arrayList.add(tvPicTag);
        ImageView ivGiftTag = eVarInflate.f43794OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivGiftTag, "ivGiftTag");
        arrayList.add(ivGiftTag);
        TextView tvGiftTag = eVarInflate.f43801OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvGiftTag, "tvGiftTag");
        arrayList.add(tvGiftTag);
        ImageView ivToTag = eVarInflate.f43798OooO0oo;
        Intrinsics.checkNotNullExpressionValue(ivToTag, "ivToTag");
        arrayList.add(ivToTag);
        TextView tvToTag = eVarInflate.f43804OooOOOO;
        Intrinsics.checkNotNullExpressionValue(tvToTag, "tvToTag");
        arrayList.add(tvToTag);
        TextView tvText = eVarInflate.f43802OooOOO;
        Intrinsics.checkNotNullExpressionValue(tvText, "tvText");
        arrayList.add(tvText);
        NetImageView ivReplyPicGif = eVarInflate.f43797OooO0oO;
        Intrinsics.checkNotNullExpressionValue(ivReplyPicGif, "ivReplyPicGif");
        arrayList.add(ivReplyPicGif);
        SVGAView ivReplyGift = eVarInflate.f43795OooO0o;
        Intrinsics.checkNotNullExpressionValue(ivReplyGift, "ivReplyGift");
        arrayList.add(ivReplyGift);
        GiftNumberView numberView = eVarInflate.f43799OooOO0;
        Intrinsics.checkNotNullExpressionValue(numberView, "numberView");
        arrayList.add(numberView);
        OooO0O0();
    }
}
