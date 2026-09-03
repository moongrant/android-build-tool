package com.yalla.yalla.ui.view;

import OooO00o.OooO00o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.view.EmojiFaceView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.code.android.util.ToastUtil;
import com.facebook.OooOO0O;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p470o0Oooo0.o00O0000;
import p520o0o0O0O0.o00O0O;
import p620o0oo0o0O.oo00o;
import p649o0ooOOoo.ee;
import p700oO0Oo.oo000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR.\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentsMessagesEditView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/PostCommentSonModel;", "data", "", "setReplyPostDetailComment", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/MomentSendCommentModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "sendPostCommentModel", "setSendPostCommentModel", "", "clickable", "setClickableOnSend", "Lcom/app/base/view/pullrefresh/XRefreshLayout;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Oooo0oo", "Lcom/app/base/view/pullrefresh/XRefreshLayout;", "getXRefreshLayout", "()Lcom/app/base/view/pullrefresh/XRefreshLayout;", "setXRefreshLayout", "(Lcom/app/base/view/pullrefresh/XRefreshLayout;)V", "xRefreshLayout", "Oooo", "Lcom/yalla/yalla/model/MomentSendCommentModel;", "getMSendPostCommentModel", "()Lcom/yalla/yalla/model/MomentSendCommentModel;", "setMSendPostCommentModel", "(Lcom/yalla/yalla/model/MomentSendCommentModel;)V", "mSendPostCommentModel", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"ClickableViewAccessibility"})
public final class MomentsMessagesEditView extends LinearLayout {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f24998OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentSendCommentModel mSendPostCommentModel;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ee f25000Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super MomentSendCommentModel, Unit> f25001Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public XRefreshLayout xRefreshLayout;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00O0000 f25003OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f25004OoooO00;

    public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, Integer num) {
            if (bool.booleanValue()) {
                XRefreshLayout xRefreshLayout = MomentsMessagesEditView.this.getXRefreshLayout();
                if (xRefreshLayout != null) {
                    xRefreshLayout.OooO();
                }
            } else {
                MomentsMessagesEditView.this.f25000Oooo0o.f49251OooO0o.setImageResource(R.drawable.icon_emoji);
                MomentsMessagesEditView.this.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Boolean, Integer, View, Unit> {
        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Boolean bool, Integer num, View view) {
            if (bool.booleanValue()) {
                MomentsMessagesEditView.this.f25000Oooo0o.f49251OooO0o.setImageResource(R.drawable.icon_emoji);
            } else {
                MomentsMessagesEditView.this.f25000Oooo0o.f49251OooO0o.setImageResource(R.drawable.icon_keyboard);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements TextWatcher {
        public OooO0OO() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NotNull Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@NotNull CharSequence string, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(string, "string");
            if (TextUtils.isEmpty(string)) {
                MomentsMessagesEditView.this.f25000Oooo0o.f49253OooO0oO.setClickable(false);
                MomentsMessagesEditView.this.f25000Oooo0o.f49253OooO0oO.setImageResource(R.drawable.btn_send);
            } else {
                MomentsMessagesEditView.this.f25000Oooo0o.f49253OooO0oO.setClickable(true);
                MomentsMessagesEditView.this.f25000Oooo0o.f49253OooO0oO.setImageResource(R.drawable.btn_send2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesEditView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setReplyPostDetailComment(PostCommentSonModel data) {
        if (data != null) {
            MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
            if (momentSendCommentModel != null) {
                momentSendCommentModel.cleanComment();
            }
            MomentSendCommentModel momentSendCommentModel2 = this.mSendPostCommentModel;
            if (momentSendCommentModel2 != null) {
                String str = data.getId() + "";
                String str2 = data.getUserid() + "";
                String nickname = data.getNickname();
                Intrinsics.checkNotNullExpressionValue(nickname, "data.nickname");
                momentSendCommentModel2.setComment(str, str2, nickname);
            }
            o00O0O o00o0o2 = o00O0O.f42677OooO00o;
            String parentUserId = data.getParentUserId();
            Intrinsics.checkNotNullExpressionValue(parentUserId, "data.parentUserId");
            long jOooO0o = com.yalla.support.common.util.OooO.OooO0o(parentUserId);
            String parentUserName = data.getParentUserName();
            Intrinsics.checkNotNullExpressionValue(parentUserName, "data.parentUserName");
            this.f25000Oooo0o.f49248OooO0O0.setHint(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Reply_xxx), o00o0o2.OooO0O0(jOooO0o, parentUserName)));
        }
    }

    public final void OooO00o() {
        boolean z = true;
        setClickableOnSend(true);
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            momentSendCommentModel.setContent(null);
        }
        this.f25000Oooo0o.f49248OooO0O0.setText("");
        this.f25000Oooo0o.f49248OooO0O0.OooO0O0();
        OooO0O0(false, true);
        setReplyPostDetailComment(null);
        String strOooO0OO = o000O0O0.OooO0OO(R.string.send_successfully);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o0o0oooOooO0O0.run();
        } else {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
        }
    }

    public final void OooO0O0(boolean z, boolean z2) {
        if (!z) {
            o00O0000 o00o0001 = this.f25003OoooO0;
            if (o00o0001 != null) {
                o00o0001.OooO0OO();
                return;
            }
            return;
        }
        if (z2) {
            this.f25000Oooo0o.f49248OooO0O0.setText("");
        }
        EditTextSpan view = this.f25000Oooo0o.f49248OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "binding.editContent");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = p470o0Oooo0.o00O000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(context2.getApplicationContext(), new Handler()));
    }

    @Nullable
    public final MomentSendCommentModel getMSendPostCommentModel() {
        return this.mSendPostCommentModel;
    }

    @Nullable
    public final XRefreshLayout getXRefreshLayout() {
        return this.xRefreshLayout;
    }

    public final void setClickableOnSend(boolean clickable) {
        this.f25000Oooo0o.f49253OooO0oO.setClickable(clickable);
    }

    public final void setListener(@Nullable Function1<? super MomentSendCommentModel, Unit> listener) {
        this.f25001Oooo0oO = listener;
    }

    public final void setMSendPostCommentModel(@Nullable MomentSendCommentModel momentSendCommentModel) {
        this.mSendPostCommentModel = momentSendCommentModel;
    }

    public final void setSendPostCommentModel(@Nullable MomentSendCommentModel sendPostCommentModel) {
        setMSendPostCommentModel(sendPostCommentModel);
        MomentSendCommentModel momentSendCommentModel = this.mSendPostCommentModel;
        if (momentSendCommentModel != null) {
            OooO0O0(true, true);
            o00O0O o00o0o2 = o00O0O.f42677OooO00o;
            String parentUserId = momentSendCommentModel.getParentUserId();
            long j = 0;
            if (parentUserId != null) {
                Intrinsics.checkNotNullParameter(parentUserId, "<this>");
                try {
                    j = Long.parseLong(parentUserId);
                } catch (NumberFormatException unused) {
                }
            }
            String parentUserName = momentSendCommentModel.getParentUserName();
            if (parentUserName == null) {
                parentUserName = "";
            }
            String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Reply_xxx), o00o0o2.OooO0O0(j, parentUserName));
            EditTextSpan editTextSpan = this.f25000Oooo0o.f49248OooO0O0;
            editTextSpan.setHint(strOooO00o);
            editTextSpan.setText("");
            this.f25000Oooo0o.f49254OooO0oo.setVisibility(8);
        }
    }

    public final void setXRefreshLayout(@Nullable XRefreshLayout xRefreshLayout) {
        this.xRefreshLayout = xRefreshLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesEditView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ee eeVarInflate = ee.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(eeVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25000Oooo0o = eeVarInflate;
        this.f25004OoooO00 = 7;
        EmojiFaceView emojiFaceView = eeVarInflate.f49250OooO0Oo;
        EditTextSpan editTextSpan = eeVarInflate.f49248OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editTextSpan, "binding.editContent");
        emojiFaceView.OooO00o(editTextSpan, true);
        eeVarInflate.f49255OooOO0.setOnTouchListener(new View.OnTouchListener() { // from class: o0oo00Oo.oo0ooO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MomentsMessagesEditView this$0 = this.f48272Oooo0o;
                int i2 = MomentsMessagesEditView.f24998OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(false, true);
                return true;
            }
        });
        PanelLayout panelLayout = eeVarInflate.f49249OooO0OO;
        Intrinsics.checkNotNullExpressionValue(panelLayout, "binding.faceLayout");
        EditTextSpan editTextSpan2 = eeVarInflate.f49248OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editTextSpan2, "binding.editContent");
        o00O0000 o00o0001 = new o00O0000(panelLayout, editTextSpan2);
        ImageView imageView = eeVarInflate.f49251OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivEmoji");
        o00o0001.OooO0O0(imageView);
        this.f25003OoooO0 = o00o0001;
        o00o0001.f40623OooO0O0 = new OooO00o();
        o00O0000 o00o0002 = this.f25003OoooO0;
        if (o00o0002 != null) {
            o00o0002.f40622OooO00o = new OooO0O0();
        }
        EditTextSpan editTextSpan3 = eeVarInflate.f49248OooO0O0;
        editTextSpan3.f11729Oooo = OooOO0O.f12690OooO0o;
        editTextSpan3.addTextChangedListener(new OooO0OO());
        eeVarInflate.f49252OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.oo0oO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MomentsMessagesEditView this$0 = this.f48268Oooo0o;
                Context context2 = context;
                int i2 = MomentsMessagesEditView.f24998OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(context2, "$context");
                if (this$0.f25000Oooo0o.f49248OooO0O0.getSpanManager().OooO0Oo("@") < this$0.f25004OoooO00) {
                    this$0.OooO0O0(false, true);
                    oo00o.OooO00o oooO00o = oo00o.f48621OooO0OO;
                    oo00o oo00oVar = new oo00o((FragmentActivity) context2);
                    oo00oVar.f48623OooO0O0 = AtFriendsActivity.class;
                    oo00oVar.OooO00o(new o0OO00OO(this$0));
                    return;
                }
                String strOooO0OO = o000O0O0.OooO0OO(R.string.Mention_a_maximum_of_XXX_people);
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
                sbOooO0o0.append(this$0.f25004OoooO00);
                String strOooO00o = OooOo.OooO00o(strOooO0OO, sbOooO0o0.toString());
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (StringsKt.isBlank(strOooO00o)) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        });
        eeVarInflate.f49253OooO0oO.setOnClickListener(new oo000o(this, 3));
    }
}
