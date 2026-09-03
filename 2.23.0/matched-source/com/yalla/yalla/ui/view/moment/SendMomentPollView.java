package com.yalla.yalla.ui.view.moment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000OO00;
import com.code.android.yldialog.timechoose.OooO00o;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.ui.adapter.o000O0O0;
import com.yalla.yalla.ui.fragment.o00oO0o;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import com.yalla.yalla.ui.view.moment.SendMomentPollView.OooO00o;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o000O0;
import p488o0o00O0o.o0OOO0o;
import p519o0o0O0oO.x;
import p556o0oOOooo.oO0O0O00;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.d3;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR?\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentPollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0ooOOOO/d3;", "OooO0Oo", "Lo0ooOOOO/d3;", "getBinding", "()Lo0ooOOOO/d3;", "binding", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "OooO0o0", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "getSendMomentPoll", "()Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "setSendMomentPoll", "(Lcom/yalla/yalla/model/moment/MomentSendPollModel;)V", "sendMomentPoll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isClose", "", "OooOO0", "Lkotlin/jvm/functions/Function1;", "getCloseListener", "()Lkotlin/jvm/functions/Function1;", "setCloseListener", "(Lkotlin/jvm/functions/Function1;)V", "closeListener", "Lkotlin/Function0;", "OooOO0O", "Lkotlin/jvm/functions/Function0;", "getChangeListener", "()Lkotlin/jvm/functions/Function0;", "setChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "changeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class SendMomentPollView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f31222OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final x f31223OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d3 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O0O0 f31225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentSendPollModel sendMomentPoll;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final x f31227OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final x f31228OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> closeListener;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> changeListener;

    public static final class OooO00o extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Integer num2, Integer num3) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = num3.intValue();
            SendMomentPollView sendMomentPollView = SendMomentPollView.this;
            sendMomentPollView.f31227OooO0oO.f53202OooO00o = iIntValue;
            x xVar = sendMomentPollView.f31228OooO0oo;
            xVar.f53202OooO00o = iIntValue2;
            x xVar2 = sendMomentPollView.f31223OooO;
            xVar2.f53202OooO00o = iIntValue3;
            StringBuffer stringBuffer = new StringBuffer();
            x xVar3 = sendMomentPollView.f31227OooO0oO;
            stringBuffer.append(xVar3.f53202OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar3.f53203OooO0O0);
            stringBuffer.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar.f53202OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar.f53203OooO0O0);
            stringBuffer.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar2.f53202OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar2.f53203OooO0O0);
            sendMomentPollView.getBinding().f57720OooO0o0.setText(stringBuffer);
            MomentSendPollModel sendMomentPoll = sendMomentPollView.getSendMomentPoll();
            if (sendMomentPoll != null) {
                sendMomentPoll.setExpireTime((xVar.f53202OooO00o * 60) + (xVar3.f53202OooO00o * 1440) + xVar2.f53202OooO00o);
            }
            Function0<Unit> changeListener = sendMomentPollView.getChangeListener();
            if (changeListener != null) {
                changeListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Integer, String, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            List<MomentSendPollModel.Option> option;
            MomentSendPollModel.Option option2;
            int iIntValue = num.intValue();
            String text = str;
            Intrinsics.checkNotNullParameter(text, "text");
            SendMomentPollView sendMomentPollView = SendMomentPollView.this;
            MomentSendPollModel sendMomentPoll = sendMomentPollView.getSendMomentPoll();
            if (sendMomentPoll != null && (option = sendMomentPoll.getOption()) != null && (option2 = option.get(iIntValue)) != null) {
                option2.setText(text);
            }
            Function0<Unit> changeListener = sendMomentPollView.getChangeListener();
            if (changeListener != null) {
                changeListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            List<MomentSendPollModel.Option> option;
            int iIntValue = num.intValue();
            SendMomentPollView sendMomentPollView = SendMomentPollView.this;
            MomentSendPollModel sendMomentPoll = sendMomentPollView.getSendMomentPoll();
            if (sendMomentPoll != null && (option = sendMomentPoll.getOption()) != null) {
                option.remove(iIntValue);
            }
            sendMomentPollView.OooO0O0();
            Function0<Unit> changeListener = sendMomentPollView.getChangeListener();
            if (changeListener != null) {
                changeListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            int i = SendMomentPollView.f31222OooOO0o;
            SendMomentPollView sendMomentPollView = SendMomentPollView.this;
            sendMomentPollView.binding.f57718OooO0Oo.postDelayed(new oO0O0O00(sendMomentPollView, iIntValue), 210L);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentPollView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0O0() {
        List<MomentSendPollModel.Option> option;
        MomentSendPollModel momentSendPollModel = this.sendMomentPoll;
        int size = (momentSendPollModel == null || (option = momentSendPollModel.getOption()) == null) ? 0 : option.size();
        int i = o0OOO0o.f48465OooO0Oo;
        d3 d3Var = this.binding;
        if (size >= i) {
            LinearLayout linearLayout = d3Var.f57717OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutAdd");
            o000OO00.OooO0O0(linearLayout);
        } else {
            LinearLayout linearLayout2 = d3Var.f57717OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.layoutAdd");
            o000OO00.OooOOOO(linearLayout2);
        }
    }

    public final void OooO0OO() {
        if (isShown()) {
            return;
        }
        o000OO00.OooOOOO(this);
        MomentSendPollModel momentSendPollModel = this.sendMomentPoll;
        x xVar = this.f31223OooO;
        x xVar2 = this.f31228OooO0oo;
        x xVar3 = this.f31227OooO0oO;
        if (momentSendPollModel == null) {
            MomentSendPollModel momentSendPollModel2 = new MomentSendPollModel();
            momentSendPollModel2.setExpireTime((xVar2.f53202OooO00o * 60) + (xVar3.f53202OooO00o * 1440) + xVar.f53202OooO00o);
            momentSendPollModel2.getOption().add(new MomentSendPollModel.Option());
            momentSendPollModel2.getOption().add(new MomentSendPollModel.Option());
            this.sendMomentPoll = momentSendPollModel2;
        }
        MomentSendPollModel momentSendPollModel3 = this.sendMomentPoll;
        this.f31225OooO0o.OooOoO0(momentSendPollModel3 != null ? momentSendPollModel3.getOption() : null);
        d3 d3Var = this.binding;
        final int i = 1;
        d3Var.f57718OooO0Oo.postDelayed(new Runnable() { // from class: o000O0O0.o0OoOo0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                Object obj = this;
                switch (i2) {
                    case 0:
                        o00Ooo this$0 = (o00Ooo) obj;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        CollectionsKt.emptyList();
                        throw null;
                    default:
                        SendMomentPollView this$1 = (SendMomentPollView) obj;
                        int i3 = SendMomentPollView.f31222OooOO0o;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        EditText view = (EditText) this$1.f31225OooO0o.f27533OooOooO.get(0);
                        if (view != null) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            Context context = view.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "view.context");
                            InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
                            view.setFocusable(true);
                            view.setFocusableInTouchMode(true);
                            view.requestFocus();
                            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                            return;
                        }
                        return;
                }
            }
        }, 210L);
        OooO0O0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(xVar3.f53202OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar3.f53203OooO0O0 + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar2.f53202OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar2.f53203OooO0O0 + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar.f53202OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + xVar.f53203OooO0O0);
        d3Var.f57720OooO0o0.setText(stringBuffer);
        Function0<Unit> function0 = this.changeListener;
        if (function0 != null) {
            function0.invoke();
        }
        Function1<? super Boolean, Unit> function1 = this.closeListener;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    @NotNull
    public final d3 getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getChangeListener() {
        return this.changeListener;
    }

    @Nullable
    public final Function1<Boolean, Unit> getCloseListener() {
        return this.closeListener;
    }

    @Nullable
    public final MomentSendPollModel getSendMomentPoll() {
        return this.sendMomentPoll;
    }

    public final void setChangeListener(@Nullable Function0<Unit> function0) {
        this.changeListener = function0;
    }

    public final void setCloseListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.closeListener = function1;
    }

    public final void setSendMomentPoll(@Nullable MomentSendPollModel momentSendPollModel) {
        this.sendMomentPoll = momentSendPollModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentPollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SendMomentPollView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentPollView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        d3 d3VarInflate = d3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d3VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = d3VarInflate;
        o000O0O0 o000o0o1 = new o000O0O0(context, oO00OO0O.item_send_moment_poll);
        o000o0o1.f27532OooOoo0 = new OooO0O0();
        o000o0o1.f27531OooOoo = new OooO0OO();
        o000o0o1.f27534OooOooo = new OooO0o();
        this.f31225OooO0o = o000o0o1;
        this.f31227OooO0oO = new x(1, o000O0.OooO0O0(oO00OOo0.moment_poll_days, this));
        this.f31228OooO0oo = new x(0, o000O0.OooO0O0(oO00OOo0.moment_poll_hours, this));
        this.f31223OooO = new x(0, o000O0.OooO0O0(oO00OOo0.moment_poll_mins, this));
        d3VarInflate.f57717OooO0OO.setOnClickListener(new o00oO0o(this, 1));
        d3VarInflate.f57718OooO0Oo.setLayoutManager(new FixLinearLayoutManager(context));
        d3VarInflate.f57718OooO0Oo.setAdapter(o000o0o1);
        d3VarInflate.f57716OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oOOooo.oO0O00oO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SendMomentPollView.f31222OooOO0o;
                SendMomentPollView this$0 = this.f56128OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                o0OO00O o0oo00o2 = new o0OO00O(context2);
                o0oo00o2.OooOo00(o000O0.OooO0O0(oO00OOo0.send_moment_poll_remove_title, this$0));
                o0oo00o2.OooOOOo(o000O0.OooO0O0(oO00OOo0.send_moment_poll_remove_Remove, this$0));
                o0oo00o2.OooOo0(new oO0O0O0o(this$0));
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOO0o();
            }
        });
        d3VarInflate.f57720OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0oOOooo.oO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SendMomentPollView.f31222OooOO0o;
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                SendMomentPollView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o oooO00o = new OooO00o((AppCompatActivity) context2, o000O0.OooO0O0(oO00OOo0.Cancel, this$0), o000O0.OooO0O0(oO00OOo0.Confirm, this$0));
                oooO00o.f10468OooO0oo = 5;
                oooO00o.f10466OooO = 7;
                x xVar = this$0.f31227OooO0oO;
                String dayUnit = xVar.f53203OooO0O0;
                x xVar2 = this$0.f31228OooO0oo;
                String hourUnit = xVar2.f53203OooO0O0;
                x xVar3 = this$0.f31223OooO;
                String minuteUnit = xVar3.f53203OooO0O0;
                Intrinsics.checkNotNullParameter(dayUnit, "dayUnit");
                Intrinsics.checkNotNullParameter(hourUnit, "hourUnit");
                Intrinsics.checkNotNullParameter(minuteUnit, "minuteUnit");
                oooO00o.OooOOO().f38487OooO0Oo.setSelectedUnit(dayUnit);
                oooO00o.OooOOO().f38489OooO0o0.setSelectedUnit(hourUnit);
                oooO00o.OooOOO().f38488OooO0o.setSelectedUnit(minuteUnit);
                int i3 = xVar.f53202OooO00o;
                int i4 = xVar2.f53202OooO00o;
                int i5 = xVar3.f53202OooO00o;
                oooO00o.OooOOO().f38487OooO0Oo.OooO0OO(new IntRange(0, 7), i3);
                oooO00o.OooOOO().f38489OooO0o0.OooO0OO(new IntRange(0, 23), i4);
                oooO00o.OooOOO().f38488OooO0o.OooO0OO(new IntRange(0, 59), i5);
                SendMomentPollView.OooO00o selected = this$0.new OooO00o();
                Intrinsics.checkNotNullParameter(selected, "selected");
                oooO00o.f10472OooOOO0 = selected;
                oooO00o.OooOO0o();
            }
        });
    }
}
