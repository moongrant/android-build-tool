package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.event.EventState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o000O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p595o0oo00Oo.o0000Ooo;
import p601o0oo0O0.o0000oo;
import p601o0oo0O0.o000OO;
import p641o0ooOOOO.e3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentShareView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/ui/view/pop/roomSharePop/RoomShareModel;", "roomShareModel", "", "setShareForwardRoomView", "Lcom/yalla/yalla/model/share/ShareWebModel;", "webModel", "setShareForwardWebView", "Lcom/yalla/yalla/model/event/EventModel;", "eventModel", "setShareForwardEventView", "Lcom/yalla/yalla/model/moment/MomentForwardContent;", "it", "setEditEventView", "forwardContent", "setEditShareView", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "forward", "setEditForwardView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SendMomentShareView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f31235OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final e3 f31236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Drawable f31237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Drawable f31238OooO0o0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setEditEventView(MomentForwardContent it) {
        e3 e3Var = this.f31236OooO0Oo;
        ConstraintLayout constraintLayout = e3Var.f57806OooO0oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutEvent");
        o000OO00.OooOOOO(constraintLayout);
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(null);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
        oooO00o.OooO0o0(8);
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(o0000O0.OooO00o(144), o0000O0.OooO00o(81), it.getImage());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(e3Var.f57800OooO0O0);
        int eventState = it.getEventState();
        int inProgress = EventState.INSTANCE.getInProgress();
        TextView textView = e3Var.f57803OooO0o;
        if (eventState == inProgress) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o000O0o.OooO0oO(textView, this.f31237OooO0o);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_FFA21F));
            textView.setText(o0000.OooO0OO(oO00OOo0.Event_Live_Now));
        } else if (o000OO.OooO00o(it.getStartTime()) > 0) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o000O0o.OooO0oO(textView, this.f31238OooO0o0);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_FFFFFFF));
            textView.setText(o0000oo.OooO0o(o000OO.OooO00o(it.getStartTime())));
        }
        e3Var.f57801OooO0OO.setText(o0OoOo0.OooOOO(it.getName(), ""));
        e3Var.f57804OooO0o0.setText(o0OoOo0.OooOOO(it.getRoomName(), ""));
        e3Var.f57802OooO0Oo.setText(String.valueOf(it.getRoomIdx()));
        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        throw null;
    }

    private final void setEditForwardView(MomentDetailModel forward) {
        String nickName;
        if (forward == null) {
            return;
        }
        e3 e3Var = this.f31236OooO0Oo;
        LinearLayout linearLayout = e3Var.f57807OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o000OO00.OooOOOO(linearLayout);
        String image = "";
        if (forward.getType() == MomentType.Image.getValue()) {
            nickName = forward.getNickName();
            image = forward.getImageInfoList().isEmpty() ^ true ? forward.getImageInfoList().get(0).getUrl() : "";
            MomentSendContentModel content = forward.getContent();
            o0OoOo0.OooOOO(content != null ? content.getContent() : null, "");
        } else {
            MomentForwardContent forwardContent = forward.getForwardContent();
            if (forwardContent != null) {
                image = forwardContent.getImage();
                String name = forwardContent.getName();
                forwardContent.getContent();
                nickName = name;
            } else {
                nickName = "";
            }
        }
        FrameLayout frameLayout = e3Var.f57798OooO;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
        o000OO00.OooO0O0(frameLayout);
        if (!TextUtils.isEmpty(image)) {
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
            o000OO00.OooOOOO(frameLayout);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(null);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0O0(o0000O0.OooO00o(120), image);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(e3Var.f57805OooO0oO);
        }
        TextView textView = e3Var.f57809OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o000OO00.OooO0O0(textView);
        if (!TextUtils.isEmpty(nickName)) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
            o000OO00.OooOOOO(textView);
            textView.setText(nickName);
        }
        TextView textView2 = e3Var.f57808OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvShareContent");
        o000OO00.OooOOOO(textView2);
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        o0000Ooo.OooO0OO(null, forward.getContent(), textView2, new kotlin.reflect.jvm.internal.impl.builtins.OooO00o());
        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        throw null;
    }

    private final void setEditShareView(MomentForwardContent forwardContent) {
        e3 e3Var = this.f31236OooO0Oo;
        LinearLayout linearLayout = e3Var.f57807OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o000OO00.OooOOOO(linearLayout);
        FrameLayout frameLayout = e3Var.f57798OooO;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
        o000OO00.OooO0O0(frameLayout);
        if (!TextUtils.isEmpty(forwardContent.getImage())) {
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
            o000OO00.OooOOOO(frameLayout);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(null);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0O0(o0000O0.OooO00o(120), forwardContent.getImage());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(e3Var.f57805OooO0oO);
        }
        TextView textView = e3Var.f57809OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o000OO00.OooO0O0(textView);
        if (!TextUtils.isEmpty(forwardContent.getName())) {
            textView.setVisibility(0);
            textView.setText(forwardContent.getName());
        }
        if (!TextUtils.isEmpty(forwardContent.getContent())) {
            TextView textView2 = e3Var.f57808OooOO0O;
            textView2.setVisibility(0);
            textView2.setText(forwardContent.getContent());
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        throw null;
    }

    private final void setShareForwardEventView(EventModel eventModel) {
        e3 e3Var = this.f31236OooO0Oo;
        ConstraintLayout constraintLayout = e3Var.f57806OooO0oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutEvent");
        o000OO00.OooOOOO(constraintLayout);
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(null);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
        oooO00o.OooO0o0(8);
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(o0000O0.OooO00o(144), o0000O0.OooO00o(81), eventModel.getEventImage());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(e3Var.f57800OooO0O0);
        int eventState = eventModel.getEventState();
        int inProgress = EventState.INSTANCE.getInProgress();
        TextView textView = e3Var.f57803OooO0o;
        if (eventState == inProgress) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o000OO00.OooOOOO(textView);
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o000O0o.OooO0oO(textView, this.f31237OooO0o);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_FFA21F));
            textView.setText(o0000.OooO0OO(oO00OOo0.Event_Live_Now));
        } else if (o000OO.OooO00o(eventModel.getEventStartTime()) > 0) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o000OO00.OooOOOO(textView);
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o000O0o.OooO0oO(textView, this.f31238OooO0o0);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_FFFFFFF));
            textView.setText(o0000oo.OooO0o(o000OO.OooO00o(eventModel.getEventStartTime())));
        }
        if (eventModel.getEventName().length() > 0) {
            TextView textView2 = e3Var.f57801OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.eventName");
            o000OO00.OooOOOO(textView2);
            textView2.setText(eventModel.getEventName());
        }
        if (eventModel.getRoomName().length() > 0) {
            TextView textView3 = e3Var.f57804OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.eventRoomName");
            o000OO00.OooOOOO(textView3);
            textView3.setText(eventModel.getRoomName());
        }
        if (eventModel.getRoomIdx() > 0) {
            TextView textView4 = e3Var.f57802OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.eventRoomId");
            o000OO00.OooOOOO(textView4);
            long roomIdx = eventModel.getRoomIdx();
            StringBuilder sb = new StringBuilder();
            sb.append(roomIdx);
            textView4.setText(sb.toString());
        }
    }

    private final void setShareForwardRoomView(RoomShareModel roomShareModel) {
        e3 e3Var = this.f31236OooO0Oo;
        LinearLayout linearLayout = e3Var.f57807OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o000OO00.OooOOOO(linearLayout);
        FrameLayout frameLayout = e3Var.f57798OooO;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
        o000OO00.OooO0O0(frameLayout);
        if (!TextUtils.isEmpty(roomShareModel.getImageUrl())) {
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
            o000OO00.OooOOOO(frameLayout);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(null);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0O0(o0000O0.OooO00o(120), roomShareModel.getImageUrl());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(e3Var.f57805OooO0oO);
        }
        TextView textView = e3Var.f57809OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o000OO00.OooO0O0(textView);
        if (!TextUtils.isEmpty(roomShareModel.getTitle())) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
            o000OO00.OooOOOO(textView);
            textView.setText(roomShareModel.getTitle());
        }
        e3Var.f57808OooOO0O.setText(roomShareModel.getContent());
    }

    private final void setShareForwardWebView(ShareWebModel webModel) {
        e3 e3Var = this.f31236OooO0Oo;
        LinearLayout linearLayout = e3Var.f57807OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o000OO00.OooOOOO(linearLayout);
        FrameLayout frameLayout = e3Var.f57798OooO;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
        o000OO00.OooO0O0(frameLayout);
        if (!TextUtils.isEmpty(webModel.getImagesUrl())) {
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.layoutImage");
            o000OO00.OooOOOO(frameLayout);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(null);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0O0(o0000O0.OooO00o(120), webModel.getImagesUrl());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(e3Var.f57805OooO0oO);
        }
        TextView textView = e3Var.f57809OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o000OO00.OooO0O0(textView);
        if (!TextUtils.isEmpty(webModel.getTitle())) {
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
            o000OO00.OooOOOO(textView);
            textView.setText(webModel.getTitle());
        }
        e3Var.f57808OooOO0O.setText(webModel.getContent());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SendMomentShareView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        e3 e3VarInflate = e3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(e3VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31236OooO0Oo = e3VarInflate;
        this.f31238OooO0o0 = o0000.OooO0O0(oOo00OO0.ic_event_time);
        this.f31237OooO0o = o0000.OooO0O0(oOo00OO0.ic_event_time_progress);
    }
}
