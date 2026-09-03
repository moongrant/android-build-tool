package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.base.activity.BaseActivity;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.EventState;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendContentTopicModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;
import p139o00OOOo0.o0O0O00;
import p150o00Oo0Oo.OooOo;
import p168o00Ooo0.o00Oo0;
import p173o00OooO0.o0o0Oo;
import p496o0o00OOo.o000oOoO;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oo0o0O0;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.x9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/SendMomentShareView;", "Landroid/widget/LinearLayout;", "Lcom/app/base/view/pop/roomSharePop/RoomShareModel;", "roomShareModel", "", "setShareForwardRoomView", "Lcom/yalla/yalla/common/model/ShareWebModel;", "webModel", "setShareForwardWebView", "Lcom/yalla/yalla/model/EventModel;", "eventModel", "setShareForwardEventView", "Lcom/yalla/yalla/model/MomentForwardContent;", "it", "setEditEventView", "forwardContent", "setEditShareView", "Lcom/yalla/yalla/model/MomentDetailModel;", "forward", "setEditForwardView", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SendMomentShareView extends LinearLayout {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f25199OoooOO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public BaseActivity f25200Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final x9 f25201Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Drawable f25202Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Drawable f25203Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public MomentSendModel f25204OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Function0<Unit> f25205OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public EditTextSpan f25206OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public MomentSendShareModel f25207OoooO0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setEditEventView(MomentForwardContent it) {
        ConstraintLayout constraintLayout = this.f25201Oooo0o.f50931OooO0oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutEvent");
        o00O0O.OooO(constraintLayout);
        BaseActivity baseActivity = this.f25200Oooo;
        Function0<Unit> function0 = null;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            baseActivity = null;
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
        oooO00o.OooO0oO(4);
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(it.getImage(), OooOo00.OooO00o(142), OooOo00.OooO00o(80));
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f25201Oooo0o.f50925OooO0O0);
        if (it.getEventState() == EventState.INSTANCE.getInProgress()) {
            TextView textView = this.f25201Oooo0o.f50928OooO0o;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            oo0o0O0.OooO0oo(textView, this.f25203Oooo0oo);
            this.f25201Oooo0o.f50928OooO0o.setTextColor(OooOOO.OooO00o(R.color.color_FFA21F));
            this.f25201Oooo0o.f50928OooO0o.setText(OooOOO.OooO0OO(R.string.Event_Live_Now));
        } else {
            long startTime = it.getStartTime();
            if (o000oOoO.OooO00o(startTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                startTime *= (long) 1000;
            }
            if (startTime > 0) {
                TextView textView2 = this.f25201Oooo0o.f50928OooO0o;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.eventTime");
                oo0o0O0.OooO0oo(textView2, this.f25202Oooo0oO);
                this.f25201Oooo0o.f50928OooO0o.setTextColor(OooOOO.OooO00o(R.color.color_FFFFFFF));
                TextView textView3 = this.f25201Oooo0o.f50928OooO0o;
                o00O0 o00o1 = o00O0.f48624OooO00o;
                long startTime2 = it.getStartTime();
                if (o000oOoO.OooO00o(startTime2, p279o0O00OoO.OooO.OooO00o()) == 3) {
                    startTime2 *= (long) 1000;
                }
                textView3.setText(o00o1.OooO0oO(startTime2));
            }
        }
        this.f25201Oooo0o.f50926OooO0OO.setText(p522o0o0O0o.o00O0.OooO0oO(it.getName()));
        this.f25201Oooo0o.f50929OooO0o0.setText(p522o0o0O0o.o00O0.OooO0oO(it.getRoomName()));
        this.f25201Oooo0o.f50927OooO0Oo.setText(String.valueOf(it.getRoomIdx()));
        Function0<Unit> function1 = this.f25205OoooO0;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        } else {
            function0 = function1;
        }
        function0.invoke();
    }

    private final void setEditForwardView(MomentDetailModel forward) {
        String nickName;
        if (forward == null) {
            return;
        }
        LinearLayout linearLayout = this.f25201Oooo0o.f50923OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o00O0O.OooO(linearLayout);
        NetImageView netImageView = this.f25201Oooo0o.f50930OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShare");
        o00O0O.OooO00o(netImageView);
        String image = "";
        Function0<Unit> function0 = null;
        if (forward.getType() == MomentType.Image.getValue()) {
            nickName = forward.getNickName();
            if (!forward.getImageInfoList().isEmpty()) {
                image = forward.getImageInfoList().get(0).getUrl();
                Intrinsics.checkNotNullExpressionValue(image, "forward.getImageInfoList()[0].url");
            }
            MomentSendContentModel content = forward.getContent();
            p522o0o0O0o.o00O0.OooO0oO(content != null ? content.getContent() : null);
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
        if (!TextUtils.isEmpty(image)) {
            NetImageView netImageView2 = this.f25201Oooo0o.f50930OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivShare");
            o00O0O.OooO(netImageView2);
            BaseActivity baseActivity = this.f25200Oooo;
            if (baseActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                baseActivity = null;
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(4);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(image, OooOo00.OooO00o(120), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f25201Oooo0o.f50930OooO0oO);
        }
        TextView textView = this.f25201Oooo0o.f50933OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o00O0O.OooO00o(textView);
        if (!TextUtils.isEmpty(nickName)) {
            TextView textView2 = this.f25201Oooo0o.f50933OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvShareTitle");
            o00O0O.OooO(textView2);
            this.f25201Oooo0o.f50933OooOO0O.setText(nickName);
        }
        TextView textView3 = this.f25201Oooo0o.f50932OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvShareContent");
        o00O0O.OooO(textView3);
        BaseActivity baseActivity2 = this.f25200Oooo;
        if (baseActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            baseActivity2 = null;
        }
        o0o0Oo.OooO0O0(baseActivity2, forward.getContent(), this.f25201Oooo0o.f50932OooOO0, o0O0O00.f31846OooO0Oo);
        Function0<Unit> function1 = this.f25205OoooO0;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        } else {
            function0 = function1;
        }
        function0.invoke();
    }

    private final void setEditShareView(MomentForwardContent forwardContent) {
        LinearLayout linearLayout = this.f25201Oooo0o.f50923OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o00O0O.OooO(linearLayout);
        NetImageView netImageView = this.f25201Oooo0o.f50930OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShare");
        o00O0O.OooO00o(netImageView);
        Function0<Unit> function0 = null;
        if (!TextUtils.isEmpty(forwardContent.getImage())) {
            NetImageView netImageView2 = this.f25201Oooo0o.f50930OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivShare");
            o00O0O.OooO(netImageView2);
            BaseActivity baseActivity = this.f25200Oooo;
            if (baseActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                baseActivity = null;
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(4);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(forwardContent.getImage(), OooOo00.OooO00o(120), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f25201Oooo0o.f50930OooO0oO);
        }
        TextView textView = this.f25201Oooo0o.f50933OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o00O0O.OooO00o(textView);
        if (!TextUtils.isEmpty(forwardContent.getName())) {
            this.f25201Oooo0o.f50933OooOO0O.setVisibility(0);
            this.f25201Oooo0o.f50933OooOO0O.setText(forwardContent.getName());
        }
        if (!TextUtils.isEmpty(forwardContent.getContent())) {
            this.f25201Oooo0o.f50932OooOO0.setVisibility(0);
            this.f25201Oooo0o.f50932OooOO0.setText(forwardContent.getContent());
        }
        Function0<Unit> function1 = this.f25205OoooO0;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
        } else {
            function0 = function1;
        }
        function0.invoke();
    }

    private final void setShareForwardEventView(EventModel eventModel) {
        ConstraintLayout constraintLayout = this.f25201Oooo0o.f50931OooO0oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutEvent");
        o00O0O.OooO(constraintLayout);
        BaseActivity baseActivity = this.f25200Oooo;
        if (baseActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            baseActivity = null;
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
        oooO00o.OooO0oO(4);
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(eventModel.getEventImage(), OooOo00.OooO00o(142), OooOo00.OooO00o(80));
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f25201Oooo0o.f50925OooO0O0);
        if (eventModel.getEventState() == EventState.INSTANCE.getInProgress()) {
            TextView textView = this.f25201Oooo0o.f50928OooO0o;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            o00O0O.OooO(textView);
            TextView textView2 = this.f25201Oooo0o.f50928OooO0o;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.eventTime");
            oo0o0O0.OooO0oo(textView2, this.f25203Oooo0oo);
            this.f25201Oooo0o.f50928OooO0o.setTextColor(OooOOO.OooO00o(R.color.color_FFA21F));
            this.f25201Oooo0o.f50928OooO0o.setText(OooOOO.OooO0OO(R.string.Event_Live_Now));
        } else {
            long eventStartTime = eventModel.getEventStartTime();
            if (o000oOoO.OooO00o(eventStartTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                eventStartTime *= (long) 1000;
            }
            if (eventStartTime > 0) {
                TextView textView3 = this.f25201Oooo0o.f50928OooO0o;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.eventTime");
                o00O0O.OooO(textView3);
                TextView textView4 = this.f25201Oooo0o.f50928OooO0o;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.eventTime");
                oo0o0O0.OooO0oo(textView4, this.f25202Oooo0oO);
                this.f25201Oooo0o.f50928OooO0o.setTextColor(OooOOO.OooO00o(R.color.color_FFFFFFF));
                TextView textView5 = this.f25201Oooo0o.f50928OooO0o;
                o00O0 o00o1 = o00O0.f48624OooO00o;
                long eventStartTime2 = eventModel.getEventStartTime();
                if (o000oOoO.OooO00o(eventStartTime2, p279o0O00OoO.OooO.OooO00o()) == 3) {
                    eventStartTime2 *= (long) 1000;
                }
                textView5.setText(o00o1.OooO0oO(eventStartTime2));
            }
        }
        if (eventModel.getEventName().length() > 0) {
            TextView textView6 = this.f25201Oooo0o.f50926OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView6, "binding.eventName");
            o00O0O.OooO(textView6);
            this.f25201Oooo0o.f50926OooO0OO.setText(eventModel.getEventName());
        }
        if (eventModel.getRoomName().length() > 0) {
            TextView textView7 = this.f25201Oooo0o.f50929OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.eventRoomName");
            o00O0O.OooO(textView7);
            this.f25201Oooo0o.f50929OooO0o0.setText(eventModel.getRoomName());
        }
        if (eventModel.getRoomIdx() > 0) {
            TextView textView8 = this.f25201Oooo0o.f50927OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView8, "binding.eventRoomId");
            o00O0O.OooO(textView8);
            this.f25201Oooo0o.f50927OooO0Oo.setText("" + eventModel.getRoomIdx());
        }
    }

    private final void setShareForwardRoomView(RoomShareModel roomShareModel) {
        LinearLayout linearLayout = this.f25201Oooo0o.f50923OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o00O0O.OooO(linearLayout);
        NetImageView netImageView = this.f25201Oooo0o.f50930OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShare");
        o00O0O.OooO00o(netImageView);
        if (!TextUtils.isEmpty(roomShareModel.getImageUrl())) {
            NetImageView netImageView2 = this.f25201Oooo0o.f50930OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivShare");
            o00O0O.OooO(netImageView2);
            BaseActivity baseActivity = this.f25200Oooo;
            if (baseActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                baseActivity = null;
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(4);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(roomShareModel.getImageUrl(), OooOo00.OooO00o(120), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f25201Oooo0o.f50930OooO0oO);
        }
        TextView textView = this.f25201Oooo0o.f50933OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o00O0O.OooO00o(textView);
        if (!TextUtils.isEmpty(roomShareModel.getTitle())) {
            TextView textView2 = this.f25201Oooo0o.f50933OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvShareTitle");
            o00O0O.OooO(textView2);
            this.f25201Oooo0o.f50933OooOO0O.setText(roomShareModel.getTitle());
        }
        this.f25201Oooo0o.f50932OooOO0.setText(roomShareModel.getContent());
    }

    private final void setShareForwardWebView(ShareWebModel webModel) {
        LinearLayout linearLayout = this.f25201Oooo0o.f50923OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o00O0O.OooO(linearLayout);
        NetImageView netImageView = this.f25201Oooo0o.f50930OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShare");
        o00O0O.OooO00o(netImageView);
        if (!TextUtils.isEmpty(webModel.getImagesUrl())) {
            NetImageView netImageView2 = this.f25201Oooo0o.f50930OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivShare");
            o00O0O.OooO(netImageView2);
            BaseActivity baseActivity = this.f25200Oooo;
            if (baseActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                baseActivity = null;
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(4);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(webModel.getImagesUrl(), OooOo00.OooO00o(120), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f25201Oooo0o.f50930OooO0oO);
        }
        TextView textView = this.f25201Oooo0o.f50933OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o00O0O.OooO00o(textView);
        if (!TextUtils.isEmpty(webModel.getTitle())) {
            TextView textView2 = this.f25201Oooo0o.f50933OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvShareTitle");
            o00O0O.OooO(textView2);
            this.f25201Oooo0o.f50933OooOO0O.setText(webModel.getTitle());
        }
        this.f25201Oooo0o.f50932OooOO0.setText(webModel.getContent());
    }

    public final void OooO00o(@NotNull MomentSendShareModel sharePostModel, @NotNull MomentSendModel sendPostModel) {
        Intrinsics.checkNotNullParameter(sharePostModel, "sharePostModel");
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        this.f25207OoooO0O = sharePostModel;
        this.f25204OoooO = sendPostModel;
        boolean zIsInEdit = sendPostModel.isInEdit();
        Function0<Unit> function0 = null;
        MomentSendModel momentSendModel = null;
        MomentSendModel momentSendModel2 = null;
        MomentSendModel momentSendModel3 = null;
        Function0<Unit> function1 = null;
        Function0<Unit> function2 = null;
        Function0<Unit> function3 = null;
        if (zIsInEdit) {
            MomentSendModel momentSendModel4 = this.f25204OoooO;
            if (momentSendModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                momentSendModel4 = null;
            }
            int type = momentSendModel4.getType();
            if (type == MomentType.Share.getValue()) {
                MomentSendModel momentSendModel5 = this.f25204OoooO;
                if (momentSendModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                } else {
                    momentSendModel = momentSendModel5;
                }
                MomentForwardContent forwardContent = momentSendModel.getForwardContent();
                if (forwardContent != null) {
                    setEditShareView(forwardContent);
                    return;
                }
                return;
            }
            if (type == MomentType.Forward.getValue()) {
                MomentSendModel momentSendModel6 = this.f25204OoooO;
                if (momentSendModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                } else {
                    momentSendModel2 = momentSendModel6;
                }
                setEditForwardView(momentSendModel2.getForward());
                return;
            }
            if (type == MomentType.Event.getValue()) {
                MomentSendModel momentSendModel7 = this.f25204OoooO;
                if (momentSendModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                } else {
                    momentSendModel3 = momentSendModel7;
                }
                MomentForwardContent forwardContent2 = momentSendModel3.getForwardContent();
                if (forwardContent2 != null) {
                    setEditEventView(forwardContent2);
                    return;
                }
                return;
            }
            return;
        }
        this.f25201Oooo0o.f50932OooOO0.setSingleLine(false);
        this.f25201Oooo0o.f50932OooOO0.setMaxLines(2);
        MomentSendShareModel momentSendShareModel = this.f25207OoooO0O;
        if (momentSendShareModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePostModel");
            momentSendShareModel = null;
        }
        int type2 = momentSendShareModel.getType();
        if (type2 != MomentType.Share.getValue()) {
            if (type2 == MomentType.Forward.getValue()) {
                MomentSendShareModel momentSendShareModel2 = this.f25207OoooO0O;
                if (momentSendShareModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharePostModel");
                    momentSendShareModel2 = null;
                }
                MomentDetailModel forwardMomentDetailModel = momentSendShareModel2.getForwardMomentDetailModel();
                if (forwardMomentDetailModel != null) {
                    Function0<Unit> function4 = this.f25205OoooO0;
                    if (function4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
                    } else {
                        function0 = function4;
                    }
                    function0.invoke();
                    if (forwardMomentDetailModel.getForward() == null) {
                        OooO0O0(forwardMomentDetailModel, true);
                        return;
                    }
                    MomentDetailModel forward = forwardMomentDetailModel.getForward();
                    if (forward != null) {
                        OooO0O0(forward, false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        MomentSendShareModel momentSendShareModel3 = this.f25207OoooO0O;
        if (momentSendShareModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePostModel");
            momentSendShareModel3 = null;
        }
        RoomShareModel roomShareModel = momentSendShareModel3.getRoomShareModel();
        if (roomShareModel != null) {
            Function0<Unit> function5 = this.f25205OoooO0;
            if (function5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
            } else {
                function1 = function5;
            }
            function1.invoke();
            setShareForwardRoomView(roomShareModel);
            return;
        }
        MomentSendShareModel momentSendShareModel4 = this.f25207OoooO0O;
        if (momentSendShareModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePostModel");
            momentSendShareModel4 = null;
        }
        ShareWebModel webModel = momentSendShareModel4.getWebModel();
        if (webModel != null) {
            Function0<Unit> function6 = this.f25205OoooO0;
            if (function6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
            } else {
                function2 = function6;
            }
            function2.invoke();
            setShareForwardWebView(webModel);
            return;
        }
        MomentSendShareModel momentSendShareModel5 = this.f25207OoooO0O;
        if (momentSendShareModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePostModel");
            momentSendShareModel5 = null;
        }
        EventModel eventModel = momentSendShareModel5.getEventModel();
        if (eventModel != null) {
            Function0<Unit> function7 = this.f25205OoooO0;
            if (function7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageHideListener");
            } else {
                function3 = function7;
            }
            function3.invoke();
            setShareForwardEventView(eventModel);
        }
    }

    public final void OooO0O0(MomentDetailModel momentDetailModel, boolean z) {
        boolean zFind;
        MomentSendContentTopicModel momentSendContentTopicModel;
        MomentSendContentAtModel momentSendContentAtModel;
        ImageView9GridModel imageView9GridModel;
        LinearLayout linearLayout = this.f25201Oooo0o.f50923OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutShare");
        o00O0O.OooO(linearLayout);
        MomentSendModel momentSendModel = this.f25204OoooO;
        if (momentSendModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
            momentSendModel = null;
        }
        momentSendModel.setNotifyUserid(String.valueOf(momentDetailModel.getUserId()));
        MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
        String str = "";
        String image = forwardContent != null ? forwardContent.getImage() : "";
        MomentPoll momentPoll = momentDetailModel.getMomentPoll();
        int i = 1;
        int i2 = 0;
        if (momentPoll != null && momentPoll.getExpireTime() > 0) {
            if (image.length() == 0) {
                image = momentPoll.getShareDefaultImg();
            }
        }
        ArrayList<ImageView9GridModel> arrayListOooO00o = o00Oo0.OooO00o(momentDetailModel.getPFName(), momentDetailModel.getPNumber(), momentDetailModel.getSize());
        if (arrayListOooO00o.size() > 0 && (imageView9GridModel = arrayListOooO00o.get(0)) != null) {
            if (image.length() == 0) {
                String url = imageView9GridModel.getUrl();
                if (url != null) {
                    Intrinsics.checkNotNullExpressionValue(url, "it.url ?: \"\"");
                    str = url;
                }
                image = str;
            }
        }
        NetImageView netImageView = this.f25201Oooo0o.f50930OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivShare");
        o00O0O.OooO00o(netImageView);
        if (!TextUtils.isEmpty(image)) {
            NetImageView netImageView2 = this.f25201Oooo0o.f50930OooO0oO;
            Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivShare");
            o00O0O.OooO(netImageView2);
            BaseActivity baseActivity = this.f25200Oooo;
            if (baseActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                baseActivity = null;
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(baseActivity);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oO(4);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(image, OooOo00.OooO00o(120), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f25201Oooo0o.f50930OooO0oO);
        }
        TextView textView = this.f25201Oooo0o.f50933OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvShareTitle");
        o00O0O.OooO00o(textView);
        if (!TextUtils.isEmpty(momentDetailModel.getNickName())) {
            StringBuilder sbOooO00o = o00O0O0O.OooO00o('@');
            sbOooO00o.append(momentDetailModel.getNickName());
            String string = sbOooO00o.toString();
            TextView textView2 = this.f25201Oooo0o.f50933OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvShareTitle");
            o00O0O.OooO(textView2);
            this.f25201Oooo0o.f50933OooOO0O.setText(string);
        }
        BaseActivity baseActivity2 = this.f25200Oooo;
        if (baseActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            baseActivity2 = null;
        }
        o0o0Oo.OooO0O0(baseActivity2, momentDetailModel.getContent(), this.f25201Oooo0o.f50932OooOO0, o0O0OOOo.o000oOoO.f35667OooO0Oo);
        if (z) {
            return;
        }
        EditTextSpan editTextSpan = this.f25206OoooO00;
        if (editTextSpan == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editContent");
            editTextSpan = null;
        }
        editTextSpan.getText().append((CharSequence) "//");
        MomentSendShareModel momentSendShareModel = this.f25207OoooO0O;
        if (momentSendShareModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharePostModel");
            momentSendShareModel = null;
        }
        MomentDetailModel forwardMomentDetailModel = momentSendShareModel.getForwardMomentDetailModel();
        if (forwardMomentDetailModel != null) {
            OooOo oooOo = new OooOo(forwardMomentDetailModel.getNickName(), forwardMomentDetailModel.getUserId());
            EditTextSpan editTextSpan2 = this.f25206OoooO00;
            if (editTextSpan2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                editTextSpan2 = null;
            }
            editTextSpan2.OooO00o("@", oooOo);
            EditTextSpan editTextSpan3 = this.f25206OoooO00;
            if (editTextSpan3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                editTextSpan3 = null;
            }
            editTextSpan3.getText().append((CharSequence) ": ");
            BaseActivity baseActivity3 = this.f25200Oooo;
            if (baseActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
                baseActivity3 = null;
            }
            MomentSendContentModel content = forwardMomentDetailModel.getContent();
            EditTextSpan editTextSpan4 = this.f25206OoooO00;
            if (editTextSpan4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                editTextSpan4 = null;
            }
            if (editTextSpan4 != null && content != null) {
                if ((content.getAt() == null || content.getAt().isEmpty()) && (content.getTopic() == null || content.getTopic().isEmpty())) {
                    p185o00o00O0.OooO0O0.OooO0Oo(content.getContent(), baseActivity3, editTextSpan4, true);
                } else {
                    String content2 = content.getContent();
                    ArrayList<String> arrayList = new ArrayList();
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        Pattern patternCompile = Pattern.compile("[/@|#{]{2}\\d[/}]{1}");
                        Matcher matcher = patternCompile.matcher(content2);
                        while (matcher.find()) {
                            arrayList2.add(matcher.group());
                        }
                        String[] strArrSplit = patternCompile.split(content2);
                        int size = arrayList2.size() > strArrSplit.length ? arrayList2.size() : strArrSplit.length;
                        for (int i3 = 0; i3 < size; i3++) {
                            if (i3 < strArrSplit.length) {
                                arrayList.add(strArrSplit[i3]);
                            }
                            if (i3 < arrayList2.size()) {
                                arrayList.add((String) arrayList2.get(i3));
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    HashMap map = new HashMap();
                    o00O00.OooO0O0("allSplitList = " + arrayList + "\n sendPostModelContent = " + content);
                    for (String str2 : arrayList) {
                        StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("allSplitList\n item ", str2, "\n textView.getText = ");
                        sbOooO0OO.append((Object) editTextSpan4.getText());
                        o00O00.OooOO0O(sbOooO0OO.toString());
                        try {
                            zFind = Pattern.compile("[/@|#{]{2}\\d[/}]{1}").matcher(str2).find();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            zFind = false;
                        }
                        if (!zFind || TextUtils.isEmpty(str2)) {
                            Spanned spannedOooO0OO = p185o00o00O0.OooO0O0.OooO0OO(str2, baseActivity3);
                            editTextSpan4.getEditableText().append((CharSequence) spannedOooO0OO);
                            o00O00.OooO("不是 MaskItem，注意：App自定义Emoji \n item = '" + str2 + "'\n itemNew = '" + ((Object) spannedOooO0OO) + "'\n textView.getText = '" + ((Object) editTextSpan4.getText()) + "'");
                        } else {
                            String strSubstring = str2.substring(i2, i);
                            if (map.containsKey(strSubstring)) {
                                map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + i));
                            } else {
                                map.put(strSubstring, Integer.valueOf(i2));
                            }
                            if (strSubstring.equals("@") && content.getAt() != null && !content.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < content.getAt().size() && (momentSendContentAtModel = content.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o00O00.OooO0O0("匹配 @User sendPostModelContentAt " + momentSendContentAtModel);
                                editTextSpan4.OooO00o("@", new OooOo(momentSendContentAtModel.getName(), Long.valueOf(momentSendContentAtModel.getUid()).longValue()));
                            }
                            if (strSubstring.equals("#") && content.getTopic() != null && !content.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < content.getTopic().size() && (momentSendContentTopicModel = content.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                o00O00.OooO0O0("匹配 话题 sendPostModelContentTopic " + momentSendContentTopicModel);
                                Long l = 0L;
                                editTextSpan4.OooO00o("#", new OooOo(momentSendContentTopicModel.getTx(), l.longValue()));
                            }
                        }
                        i = 1;
                        i2 = 0;
                    }
                    o00O00.OooO0oO("hasAtNum \n text = " + ((Object) editTextSpan4.getText()));
                }
            }
            EditTextSpan editTextSpan5 = this.f25206OoooO00;
            if (editTextSpan5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editContent");
                editTextSpan5 = null;
            }
            editTextSpan5.setSelection(0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentShareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        x9 x9VarInflate = x9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(x9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25201Oooo0o = x9VarInflate;
        this.f25202Oooo0oO = OooOOO.OooO0O0(R.drawable.ic_event_time);
        this.f25203Oooo0oo = OooOOO.OooO0O0(R.drawable.ic_event_time_progress);
    }
}
