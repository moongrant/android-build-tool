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
import com.code.android.yldialog.timechoose.OooO00o;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.ui.adapter.o000O;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import com.yalla.yalla.ui.view.moment.SendMomentPollView.OooO00o;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
import p371o0OOo0oO.o0OOO0o;
import p405o0Oo0OOO.o0OOO0;
import p423o0OoO0OO.o00O0OOO;
import p494o0o00OOo.o000oOoO;
import p562o0oOo000.o000000;
import p562o0oOo000.oo0o0Oo;
import p564o0oOo0O.o0OO0o00;
import p598o0oo00Oo.o0000O00;
import p650o0ooo.a0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR?\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/SendMomentPollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0Oo0OOO/o0OOO0;", "OooO0Oo", "Lo0Oo0OOO/o0OOO0;", "getBinding", "()Lo0Oo0OOO/o0OOO0;", "binding", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "OooO0o0", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "getSendMomentPoll", "()Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "setSendMomentPoll", "(Lcom/yalla/yalla/model/moment/MomentSendPollModel;)V", "sendMomentPoll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isClose", "", "OooOO0", "Lkotlin/jvm/functions/Function1;", "getCloseListener", "()Lkotlin/jvm/functions/Function1;", "setCloseListener", "(Lkotlin/jvm/functions/Function1;)V", "closeListener", "Lkotlin/Function0;", "OooOO0O", "Lkotlin/jvm/functions/Function0;", "getChangeListener", "()Lkotlin/jvm/functions/Function0;", "setChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "changeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class SendMomentPollView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final /* synthetic */ int f30681OooOO0o = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final a0 f30682OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0OOO0 binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O f30684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentSendPollModel sendMomentPoll;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final a0 f30686OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final a0 f30687OooO0oo;

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
            sendMomentPollView.f30686OooO0oO.f58140OooO00o = iIntValue;
            a0 a0Var = sendMomentPollView.f30687OooO0oo;
            a0Var.f58140OooO00o = iIntValue2;
            a0 a0Var2 = sendMomentPollView.f30682OooO;
            a0Var2.f58140OooO00o = iIntValue3;
            StringBuffer stringBuffer = new StringBuffer();
            a0 a0Var3 = sendMomentPollView.f30686OooO0oO;
            stringBuffer.append(a0Var3.f58140OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var3.f58141OooO0O0);
            stringBuffer.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var.f58140OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var.f58141OooO0O0);
            stringBuffer.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var2.f58140OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var2.f58141OooO0O0);
            sendMomentPollView.getBinding().f44615OooO0o0.setText(stringBuffer);
            MomentSendPollModel sendMomentPoll = sendMomentPollView.getSendMomentPoll();
            if (sendMomentPoll != null) {
                sendMomentPoll.setExpireTime((a0Var.f58140OooO00o * 60) + (a0Var3.f58140OooO00o * 1440) + a0Var2.f58140OooO00o);
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
            int i = SendMomentPollView.f30681OooOO0o;
            SendMomentPollView sendMomentPollView = SendMomentPollView.this;
            sendMomentPollView.binding.f44613OooO0Oo.postDelayed(new o0OO0o00(sendMomentPollView, iIntValue), 210L);
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
        int i = o000oOoO.f49577OooO0Oo;
        o0OOO0 o0ooo1 = this.binding;
        if (size >= i) {
            LinearLayout layoutAdd = o0ooo1.f44612OooO0OO;
            Intrinsics.checkNotNullExpressionValue(layoutAdd, "layoutAdd");
            com.code.android.util.o000O.OooO0O0(layoutAdd);
        } else {
            LinearLayout layoutAdd2 = o0ooo1.f44612OooO0OO;
            Intrinsics.checkNotNullExpressionValue(layoutAdd2, "layoutAdd");
            com.code.android.util.o000O.OooOOOO(layoutAdd2);
        }
    }

    public final void OooO0OO() {
        if (isShown()) {
            return;
        }
        com.code.android.util.o000O.OooOOOO(this);
        MomentSendPollModel momentSendPollModel = this.sendMomentPoll;
        a0 a0Var = this.f30682OooO;
        a0 a0Var2 = this.f30687OooO0oo;
        a0 a0Var3 = this.f30686OooO0oO;
        if (momentSendPollModel == null) {
            MomentSendPollModel momentSendPollModel2 = new MomentSendPollModel();
            momentSendPollModel2.setExpireTime((a0Var2.f58140OooO00o * 60) + (a0Var3.f58140OooO00o * 1440) + a0Var.f58140OooO00o);
            momentSendPollModel2.getOption().add(new MomentSendPollModel.Option());
            momentSendPollModel2.getOption().add(new MomentSendPollModel.Option());
            this.sendMomentPoll = momentSendPollModel2;
        }
        MomentSendPollModel momentSendPollModel3 = this.sendMomentPoll;
        this.f30684OooO0o.OooOoO0(momentSendPollModel3 != null ? momentSendPollModel3.getOption() : null);
        o0OOO0 o0ooo1 = this.binding;
        o0ooo1.f44613OooO0Oo.postDelayed(new Runnable() { // from class: o0oOo0O.o0OO0o
            @Override // java.lang.Runnable
            public final void run() {
                int i = SendMomentPollView.f30681OooOO0o;
                SendMomentPollView this$0 = this.f56367OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText view = (EditText) this$0.f30684OooO0o.f27033OooOooO.get(0);
                if (view != null) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                    view.requestFocus();
                    inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
                }
            }
        }, 210L);
        OooO0O0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a0Var3.f58140OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var3.f58141OooO0O0 + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var2.f58140OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var2.f58141OooO0O0 + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var.f58140OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + a0Var.f58141OooO0O0);
        o0ooo1.f44615OooO0o0.setText(stringBuffer);
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
    public final o0OOO0 getBinding() {
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
        o0OOO0 o0ooo0Inflate = o0OOO0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0ooo0Inflate, "inflate(...)");
        this.binding = o0ooo0Inflate;
        o000O o000o = new o000O(context, oo0o0Oo.item_send_moment_poll);
        o000o.f27032OooOoo0 = new OooO0O0();
        o000o.f27031OooOoo = new OooO0OO();
        o000o.f27034OooOooo = new OooO0o();
        this.f30684OooO0o = o000o;
        this.f30686OooO0oO = new a0(1, o00O0OOO.OooO0O0(o000000.moment_poll_days, this));
        this.f30687OooO0oo = new a0(0, o00O0OOO.OooO0O0(o000000.moment_poll_hours, this));
        this.f30682OooO = new a0(0, o00O0OOO.OooO0O0(o000000.moment_poll_mins, this));
        o0ooo0Inflate.f44612OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0oOo0O.o0OO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<MomentSendPollModel.Option> option;
                int i2 = SendMomentPollView.f30681OooOO0o;
                SendMomentPollView this$0 = this.f56356OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentSendPollModel momentSendPollModel = this$0.sendMomentPoll;
                if (momentSendPollModel != null && (option = momentSendPollModel.getOption()) != null) {
                    option.add(new MomentSendPollModel.Option());
                }
                o000O o000o2 = this$0.f30684OooO0o;
                o000o2.f27035Oooo000 = true;
                MomentSendPollModel momentSendPollModel2 = this$0.sendMomentPoll;
                o000o2.OooOoO0(momentSendPollModel2 != null ? momentSendPollModel2.getOption() : null);
                this$0.OooO0O0();
                o0000O00.OooO0O0("adapter_editTextMap_size = " + o000o2.f27033OooOooO.size());
                Function0<Unit> function0 = this$0.changeListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        o0ooo0Inflate.f44613OooO0Oo.setLayoutManager(new FixLinearLayoutManager(context));
        o0ooo0Inflate.f44613OooO0Oo.setAdapter(o000o);
        o0ooo0Inflate.f44611OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oOo0O.o0OO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SendMomentPollView.f30681OooOO0o;
                SendMomentPollView this$0 = this.f56366OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                p205o00o0o0o.o000O o000o2 = new p205o00o0o0o.o000O(context2);
                o000o2.OooOo00(o00O0OOO.OooO0O0(o000000.send_moment_poll_remove_title, this$0));
                o000o2.OooOOOo(o00O0OOO.OooO0O0(o000000.send_moment_poll_remove_Remove, this$0));
                o000o2.OooOo0(new o0OO0oO0(this$0));
                o000o2.OooOo(true);
                o000o2.OooOO0o();
            }
        });
        o0ooo0Inflate.f44615OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0oOo0O.o0OOooO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SendMomentPollView.f30681OooOO0o;
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                SendMomentPollView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO00o oooO00o = new OooO00o((AppCompatActivity) context2, o00O0OOO.OooO0O0(o000000.Cancel, this$0), o00O0OOO.OooO0O0(o000000.Confirm, this$0));
                oooO00o.f13529OooO0oo = 5;
                oooO00o.f13527OooO = 7;
                a0 a0Var = this$0.f30686OooO0oO;
                String dayUnit = a0Var.f58141OooO0O0;
                a0 a0Var2 = this$0.f30687OooO0oo;
                String hourUnit = a0Var2.f58141OooO0O0;
                a0 a0Var3 = this$0.f30682OooO;
                String minuteUnit = a0Var3.f58141OooO0O0;
                Intrinsics.checkNotNullParameter(dayUnit, "dayUnit");
                Intrinsics.checkNotNullParameter(hourUnit, "hourUnit");
                Intrinsics.checkNotNullParameter(minuteUnit, "minuteUnit");
                oooO00o.OooOOO().f39406OooO0Oo.setSelectedUnit(dayUnit);
                oooO00o.OooOOO().f39408OooO0o0.setSelectedUnit(hourUnit);
                oooO00o.OooOOO().f39407OooO0o.setSelectedUnit(minuteUnit);
                int i3 = a0Var.f58140OooO00o;
                int i4 = a0Var2.f58140OooO00o;
                int i5 = a0Var3.f58140OooO00o;
                oooO00o.OooOOO().f39406OooO0Oo.OooO0OO(new IntRange(0, 7), i3);
                oooO00o.OooOOO().f39408OooO0o0.OooO0OO(new IntRange(0, 23), i4);
                oooO00o.OooOOO().f39407OooO0o.OooO0OO(new IntRange(0, 59), i5);
                SendMomentPollView.OooO00o selected = this$0.new OooO00o();
                Intrinsics.checkNotNullParameter(selected, "selected");
                oooO00o.f13533OooOOO0 = selected;
                oooO00o.OooOO0o();
            }
        });
    }
}
