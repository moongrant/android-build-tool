package com.yalla.yalla.ui.fragment;

import android.view.View;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00oO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28940OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28941OooO0o0;

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f28940OooO0Oo = i;
        this.f28941OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<MomentSendPollModel.Option> option;
        int i = this.f28940OooO0Oo;
        Object obj = this.f28941OooO0o0;
        switch (i) {
            case 0:
                MainExploreFragment.showOrInitErrorView$lambda$6((MainExploreFragment) obj, view);
                break;
            default:
                SendMomentPollView this$0 = (SendMomentPollView) obj;
                int i2 = SendMomentPollView.f31222OooOO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentSendPollModel momentSendPollModel = this$0.sendMomentPoll;
                if (momentSendPollModel != null && (option = momentSendPollModel.getOption()) != null) {
                    option.add(new MomentSendPollModel.Option());
                }
                com.yalla.yalla.ui.adapter.o000O0O0 o000o0o1 = this$0.f31225OooO0o;
                o000o0o1.f27535Oooo000 = true;
                MomentSendPollModel momentSendPollModel2 = this$0.sendMomentPoll;
                o000o0o1.OooOoO0(momentSendPollModel2 != null ? momentSendPollModel2.getOption() : null);
                this$0.OooO0O0();
                p592o0oo00O.OooOOO0.OooO0O0("adapter_editTextMap_size = " + o000o0o1.f27533OooOooO.size());
                Function0<Unit> function0 = this$0.changeListener;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
