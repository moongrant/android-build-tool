package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentSendPollModel;
import com.yalla.yalla.ui.view.SendMomentPollView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p464o0Ooo0oO.o0000;
import p502o0o00o0.o0000OO0;
import p515o0o0O00.o00O00;
import p538o0o0Oo0.o00oOoo;
import p582o0oOoOoO.d2;
import p601o0oo00Oo.oO000;
import p601o0oo00Oo.oO00000;
import p649o0ooOOoo.w9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\n¢\u0006\u0004\b1\u00102R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R?\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/yalla/yalla/ui/view/SendMomentPollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/MomentSendPollModel;", "Oooo0oO", "Lcom/yalla/yalla/model/MomentSendPollModel;", "getSendMomentPoll", "()Lcom/yalla/yalla/model/MomentSendPollModel;", "setSendMomentPoll", "(Lcom/yalla/yalla/model/MomentSendPollModel;)V", "sendMomentPoll", "", "OoooO0O", "I", "getPollItemMax", "()I", "setPollItemMax", "(I)V", "pollItemMax", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isClose", "", "OoooO", "Lkotlin/jvm/functions/Function1;", "getCloseListener", "()Lkotlin/jvm/functions/Function1;", "setCloseListener", "(Lkotlin/jvm/functions/Function1;)V", "closeListener", "Lkotlin/Function0;", "OoooOO0", "Lkotlin/jvm/functions/Function0;", "getChangeListener", "()Lkotlin/jvm/functions/Function0;", "setChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "changeListener", "Lo0ooOOoo/w9;", "binding", "Lo0ooOOoo/w9;", "getBinding", "()Lo0ooOOoo/w9;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class SendMomentPollView extends ConstraintLayout {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25186o000oOoO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public o0000OO0 f25187Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final w9 f25188Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentSendPollModel sendMomentPoll;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public oO000 f25190Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> closeListener;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public o0000OO0 f25192OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public o0000OO0 f25193OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    public int pollItemMax;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> changeListener;

    public static final class OooO00o extends Lambda implements Function2<Integer, String, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            List<MomentSendPollModel.Option> option;
            MomentSendPollModel.Option option2;
            int iIntValue = num.intValue();
            String text = str;
            Intrinsics.checkNotNullParameter(text, "text");
            MomentSendPollModel sendMomentPoll = SendMomentPollView.this.getSendMomentPoll();
            if (sendMomentPoll != null && (option = sendMomentPoll.getOption()) != null && (option2 = option.get(iIntValue)) != null) {
                option2.setText(text);
            }
            Function0<Unit> changeListener = SendMomentPollView.this.getChangeListener();
            if (changeListener != null) {
                changeListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            List<MomentSendPollModel.Option> option;
            int iIntValue = num.intValue();
            MomentSendPollModel sendMomentPoll = SendMomentPollView.this.getSendMomentPoll();
            if (sendMomentPoll != null && (option = sendMomentPoll.getOption()) != null) {
                option.remove(iIntValue);
            }
            SendMomentPollView.this.OooO0O0();
            Function0<Unit> changeListener = SendMomentPollView.this.getChangeListener();
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
            int iIntValue = num.intValue();
            SendMomentPollView sendMomentPollView = SendMomentPollView.this;
            sendMomentPollView.f25188Oooo0o.f50867OooO0Oo.postDelayed(new oO00000(sendMomentPollView, iIntValue), 210L);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentPollView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0O0() {
        List<MomentSendPollModel.Option> option;
        MomentSendPollModel momentSendPollModel = this.sendMomentPoll;
        if (((momentSendPollModel == null || (option = momentSendPollModel.getOption()) == null) ? 0 : option.size()) >= this.pollItemMax) {
            LinearLayout linearLayout = this.f25188Oooo0o.f50866OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutAdd");
            oOO00O.OooO00o(linearLayout);
        } else {
            LinearLayout linearLayout2 = this.f25188Oooo0o.f50866OooO0OO;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.layoutAdd");
            oOO00O.OooO(linearLayout2);
        }
    }

    public final void OooO0OO() {
        if (isShown()) {
            return;
        }
        oOO00O.OooO(this);
        if (this.sendMomentPoll == null) {
            MomentSendPollModel momentSendPollModel = new MomentSendPollModel();
            momentSendPollModel.setExpireTime((this.f25193OoooO00.f41575OooO00o * 60) + (this.f25187Oooo.f41575OooO00o * 1440) + this.f25192OoooO0.f41575OooO00o);
            momentSendPollModel.getOption().add(new MomentSendPollModel.Option());
            momentSendPollModel.getOption().add(new MomentSendPollModel.Option());
            this.sendMomentPoll = momentSendPollModel;
        }
        oO000 oo000 = this.f25190Oooo0oo;
        MomentSendPollModel momentSendPollModel2 = this.sendMomentPoll;
        oo000.setNewData(momentSendPollModel2 != null ? momentSendPollModel2.getOption() : null);
        this.f25188Oooo0o.f50867OooO0Oo.postDelayed(new o00oOoo(this, 1), 210L);
        OooO0O0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f25187Oooo.f41575OooO00o + ' ' + this.f25187Oooo.f41576OooO0O0 + ' ' + this.f25193OoooO00.f41575OooO00o + ' ' + this.f25193OoooO00.f41576OooO0O0 + ' ' + this.f25192OoooO0.f41575OooO00o + ' ' + this.f25192OoooO0.f41576OooO0O0);
        this.f25188Oooo0o.f50869OooO0o0.setText(stringBuffer);
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
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final w9 getF25188Oooo0o() {
        return this.f25188Oooo0o;
    }

    @Nullable
    public final Function0<Unit> getChangeListener() {
        return this.changeListener;
    }

    @Nullable
    public final Function1<Boolean, Unit> getCloseListener() {
        return this.closeListener;
    }

    public final int getPollItemMax() {
        return this.pollItemMax;
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

    public final void setPollItemMax(int i) {
        this.pollItemMax = i;
    }

    public final void setSendMomentPoll(@Nullable MomentSendPollModel momentSendPollModel) {
        this.sendMomentPoll = momentSendPollModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentPollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SendMomentPollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = 1;
        w9 w9VarInflate = w9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(w9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25188Oooo0o = w9VarInflate;
        oO000 oo000 = new oO000(context);
        oo000.f48239OooO00o = new OooO00o();
        oo000.f48240OooO0O0 = new OooO0O0();
        oo000.f48242OooO0Oo = new OooO0OO();
        this.f25190Oooo0oo = oo000;
        this.f25187Oooo = new o0000OO0(1, o000O0O0.OooO0OO(R.string.moment_poll_days));
        this.f25193OoooO00 = new o0000OO0(0, o000O0O0.OooO0OO(R.string.moment_poll_hours));
        this.f25192OoooO0 = new o0000OO0(0, o000O0O0.OooO0OO(R.string.moment_poll_mins));
        this.pollItemMax = 4;
        w9VarInflate.f50866OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<MomentSendPollModel.Option> option;
                SendMomentPollView this$0 = this.f48065Oooo0o;
                int i3 = SendMomentPollView.f25186o000oOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentSendPollModel momentSendPollModel = this$0.sendMomentPoll;
                if (momentSendPollModel != null && (option = momentSendPollModel.getOption()) != null) {
                    option.add(new MomentSendPollModel.Option());
                }
                oO000 oo001 = this$0.f25190Oooo0oo;
                oo001.f48243OooO0o0 = true;
                MomentSendPollModel momentSendPollModel2 = this$0.sendMomentPoll;
                oo001.setNewData(momentSendPollModel2 != null ? momentSendPollModel2.getOption() : null);
                this$0.OooO0O0();
                o00O00.OooO0O0("adapter_editTextMap_size = " + this$0.f25190Oooo0oo.f48241OooO0OO.size());
                Function0<Unit> function0 = this$0.changeListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        w9VarInflate.f50867OooO0Oo.setLayoutManager(new FixLinearLayoutManager(context));
        w9VarInflate.f50867OooO0Oo.setAdapter(this.f25190Oooo0oo);
        w9VarInflate.f50865OooO0O0.setOnClickListener(new d2(this, i2));
        w9VarInflate.f50869OooO0o0.setOnClickListener(new o0000(context, this, i2));
    }
}
