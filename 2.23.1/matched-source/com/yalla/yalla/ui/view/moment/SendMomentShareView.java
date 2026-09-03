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
import com.code.android.util.o000O;
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
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.o0OOOO00;
import p425o0OoO0OO.o00O0O0;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p566o0oOo00O.o00Oo00;
import p600o0oo00Oo.o0000oo;
import p606o0oo0O0.OooOOOO;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentShareView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/ui/view/pop/roomSharePop/RoomShareModel;", "roomShareModel", "", "setShareForwardRoomView", "Lcom/yalla/yalla/model/share/ShareWebModel;", "webModel", "setShareForwardWebView", "Lcom/yalla/yalla/model/event/EventModel;", "eventModel", "setShareForwardEventView", "Lcom/yalla/yalla/model/moment/MomentForwardContent;", "it", "setEditEventView", "forwardContent", "setEditShareView", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "forward", "setEditForwardView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SendMomentShareView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f30700OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f30701OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Drawable f30702OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Drawable f30703OooO0o0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setEditEventView(MomentForwardContent it) {
        o0OOOO00 o0oooo01 = this.f30701OooO0Oo;
        ConstraintLayout layoutEvent = o0oooo01.f44638OooO0oo;
        Intrinsics.checkNotNullExpressionValue(layoutEvent, "layoutEvent");
        o000O.OooOOOO(layoutEvent);
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(null);
        oooO00o.OooO00o(o0O0O0Oo.OooO0Oo());
        oooO00o.OooO0o0(8);
        oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(o0000O0.OooO00o(144), o0000O0.OooO00o(81), it.getImage());
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0Oo(o0oooo01.f44632OooO0O0);
        int eventState = it.getEventState();
        int inProgress = EventState.INSTANCE.getInProgress();
        TextView eventTime = o0oooo01.f44635OooO0o;
        if (eventState == inProgress) {
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            o00O0O0.OooO0oO(eventTime, this.f30702OooO0o);
            eventTime.setTextColor(o0000.OooO00o(o0ooOOo.color_FFA21F));
            eventTime.setText(o0000.OooO0OO(o000OOo.Event_Live_Now));
        } else if (p606o0oo0O0.Oooo000.OooO00o(it.getStartTime()) > 0) {
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            o00O0O0.OooO0oO(eventTime, this.f30703OooO0o0);
            eventTime.setTextColor(o0000.OooO00o(o0ooOOo.color_FFFFFFF));
            eventTime.setText(OooOOOO.OooO0o(p606o0oo0O0.Oooo000.OooO00o(it.getStartTime())));
        }
        o0oooo01.f44633OooO0OO.setText(o0OoOo0.OooOOO(it.getName(), ""));
        o0oooo01.f44636OooO0o0.setText(o0OoOo0.OooOOO(it.getRoomName(), ""));
        o0oooo01.f44634OooO0Oo.setText(String.valueOf(it.getRoomIdx()));
        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        throw null;
    }

    private final void setEditForwardView(MomentDetailModel forward) {
        String nickName;
        if (forward == null) {
            return;
        }
        o0OOOO00 o0oooo01 = this.f30701OooO0Oo;
        LinearLayout layoutShare = o0oooo01.f44639OooOO0;
        Intrinsics.checkNotNullExpressionValue(layoutShare, "layoutShare");
        o000O.OooOOOO(layoutShare);
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
        FrameLayout layoutImage = o0oooo01.f44630OooO;
        Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
        o000O.OooO0O0(layoutImage);
        if (!TextUtils.isEmpty(image)) {
            Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
            o000O.OooOOOO(layoutImage);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(null);
            oooO00o.OooO00o(o0O0O0Oo.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(120), image);
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO0Oo(o0oooo01.f44637OooO0oO);
        }
        TextView tvShareTitle = o0oooo01.f44641OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
        o000O.OooO0O0(tvShareTitle);
        if (!TextUtils.isEmpty(nickName)) {
            Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
            o000O.OooOOOO(tvShareTitle);
            tvShareTitle.setText(nickName);
        }
        TextView tvShareContent = o0oooo01.f44640OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvShareContent, "tvShareContent");
        o000O.OooOOOO(tvShareContent);
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        o0000oo.OooO0OO(null, forward.getContent(), tvShareContent, new o00Oo00());
        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        throw null;
    }

    private final void setEditShareView(MomentForwardContent forwardContent) {
        o0OOOO00 o0oooo01 = this.f30701OooO0Oo;
        LinearLayout layoutShare = o0oooo01.f44639OooOO0;
        Intrinsics.checkNotNullExpressionValue(layoutShare, "layoutShare");
        o000O.OooOOOO(layoutShare);
        FrameLayout layoutImage = o0oooo01.f44630OooO;
        Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
        o000O.OooO0O0(layoutImage);
        if (!TextUtils.isEmpty(forwardContent.getImage())) {
            Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
            o000O.OooOOOO(layoutImage);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(null);
            oooO00o.OooO00o(o0O0O0Oo.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(120), forwardContent.getImage());
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO0Oo(o0oooo01.f44637OooO0oO);
        }
        TextView tvShareTitle = o0oooo01.f44641OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
        o000O.OooO0O0(tvShareTitle);
        if (!TextUtils.isEmpty(forwardContent.getName())) {
            tvShareTitle.setVisibility(0);
            tvShareTitle.setText(forwardContent.getName());
        }
        if (!TextUtils.isEmpty(forwardContent.getContent())) {
            TextView textView = o0oooo01.f44640OooOO0O;
            textView.setVisibility(0);
            textView.setText(forwardContent.getContent());
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        throw null;
    }

    private final void setShareForwardEventView(EventModel eventModel) {
        o0OOOO00 o0oooo01 = this.f30701OooO0Oo;
        ConstraintLayout layoutEvent = o0oooo01.f44638OooO0oo;
        Intrinsics.checkNotNullExpressionValue(layoutEvent, "layoutEvent");
        o000O.OooOOOO(layoutEvent);
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(null);
        oooO00o.OooO00o(o0O0O0Oo.OooO0Oo());
        oooO00o.OooO0o0(8);
        oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(o0000O0.OooO00o(144), o0000O0.OooO00o(81), eventModel.getEventImage());
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0Oo(o0oooo01.f44632OooO0O0);
        int eventState = eventModel.getEventState();
        int inProgress = EventState.INSTANCE.getInProgress();
        TextView eventTime = o0oooo01.f44635OooO0o;
        if (eventState == inProgress) {
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            o000O.OooOOOO(eventTime);
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            o00O0O0.OooO0oO(eventTime, this.f30702OooO0o);
            eventTime.setTextColor(o0000.OooO00o(o0ooOOo.color_FFA21F));
            eventTime.setText(o0000.OooO0OO(o000OOo.Event_Live_Now));
        } else if (p606o0oo0O0.Oooo000.OooO00o(eventModel.getEventStartTime()) > 0) {
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            o000O.OooOOOO(eventTime);
            Intrinsics.checkNotNullExpressionValue(eventTime, "eventTime");
            o00O0O0.OooO0oO(eventTime, this.f30703OooO0o0);
            eventTime.setTextColor(o0000.OooO00o(o0ooOOo.color_FFFFFFF));
            eventTime.setText(OooOOOO.OooO0o(p606o0oo0O0.Oooo000.OooO00o(eventModel.getEventStartTime())));
        }
        if (eventModel.getEventName().length() > 0) {
            TextView eventName = o0oooo01.f44633OooO0OO;
            Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
            o000O.OooOOOO(eventName);
            eventName.setText(eventModel.getEventName());
        }
        if (eventModel.getRoomName().length() > 0) {
            TextView eventRoomName = o0oooo01.f44636OooO0o0;
            Intrinsics.checkNotNullExpressionValue(eventRoomName, "eventRoomName");
            o000O.OooOOOO(eventRoomName);
            eventRoomName.setText(eventModel.getRoomName());
        }
        if (eventModel.getRoomIdx() > 0) {
            TextView eventRoomId = o0oooo01.f44634OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(eventRoomId, "eventRoomId");
            o000O.OooOOOO(eventRoomId);
            long roomIdx = eventModel.getRoomIdx();
            StringBuilder sb = new StringBuilder();
            sb.append(roomIdx);
            eventRoomId.setText(sb.toString());
        }
    }

    private final void setShareForwardRoomView(RoomShareModel roomShareModel) {
        o0OOOO00 o0oooo01 = this.f30701OooO0Oo;
        LinearLayout layoutShare = o0oooo01.f44639OooOO0;
        Intrinsics.checkNotNullExpressionValue(layoutShare, "layoutShare");
        o000O.OooOOOO(layoutShare);
        FrameLayout layoutImage = o0oooo01.f44630OooO;
        Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
        o000O.OooO0O0(layoutImage);
        if (!TextUtils.isEmpty(roomShareModel.getImageUrl())) {
            Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
            o000O.OooOOOO(layoutImage);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(null);
            oooO00o.OooO00o(o0O0O0Oo.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(120), roomShareModel.getImageUrl());
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO0Oo(o0oooo01.f44637OooO0oO);
        }
        TextView tvShareTitle = o0oooo01.f44641OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
        o000O.OooO0O0(tvShareTitle);
        if (!TextUtils.isEmpty(roomShareModel.getTitle())) {
            Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
            o000O.OooOOOO(tvShareTitle);
            tvShareTitle.setText(roomShareModel.getTitle());
        }
        o0oooo01.f44640OooOO0O.setText(roomShareModel.getContent());
    }

    private final void setShareForwardWebView(ShareWebModel webModel) {
        o0OOOO00 o0oooo01 = this.f30701OooO0Oo;
        LinearLayout layoutShare = o0oooo01.f44639OooOO0;
        Intrinsics.checkNotNullExpressionValue(layoutShare, "layoutShare");
        o000O.OooOOOO(layoutShare);
        FrameLayout layoutImage = o0oooo01.f44630OooO;
        Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
        o000O.OooO0O0(layoutImage);
        if (!TextUtils.isEmpty(webModel.getImagesUrl())) {
            Intrinsics.checkNotNullExpressionValue(layoutImage, "layoutImage");
            o000O.OooOOOO(layoutImage);
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(null);
            oooO00o.OooO00o(o0O0O0Oo.OooO0Oo());
            oooO00o.OooO0o0(8);
            oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(120), webModel.getImagesUrl());
            oooO00o.f43125OooO00o = 0;
            oooO00o.OooO0Oo(o0oooo01.f44637OooO0oO);
        }
        TextView tvShareTitle = o0oooo01.f44641OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
        o000O.OooO0O0(tvShareTitle);
        if (!TextUtils.isEmpty(webModel.getTitle())) {
            Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
            o000O.OooOOOO(tvShareTitle);
            tvShareTitle.setText(webModel.getTitle());
        }
        o0oooo01.f44640OooOO0O.setText(webModel.getContent());
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
        o0OOOO00 o0oooo00Inflate = o0OOOO00.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oooo00Inflate, "inflate(...)");
        this.f30701OooO0Oo = o0oooo00Inflate;
        this.f30703OooO0o0 = o0000.OooO0O0(o0OOO0o.ic_event_time);
        this.f30702OooO0o = o0000.OooO0O0(o0OOO0o.ic_event_time_progress);
    }
}
