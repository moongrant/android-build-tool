package p601o0oo00Oo;

import com.yalla.yalla.model.MomentSendPollModel;
import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00000o extends Lambda implements Function3<Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SendMomentPollView f48246Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(SendMomentPollView sendMomentPollView) {
        super(3);
        this.f48246Oooo0o = sendMomentPollView;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Integer num3) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        SendMomentPollView sendMomentPollView = this.f48246Oooo0o;
        sendMomentPollView.f25187Oooo.f41575OooO00o = iIntValue;
        sendMomentPollView.f25193OoooO00.f41575OooO00o = iIntValue2;
        sendMomentPollView.f25192OoooO0.f41575OooO00o = iIntValue3;
        StringBuffer stringBuffer = new StringBuffer();
        SendMomentPollView sendMomentPollView2 = this.f48246Oooo0o;
        stringBuffer.append(sendMomentPollView2.f25187Oooo.f41575OooO00o + ' ' + sendMomentPollView2.f25187Oooo.f41576OooO0O0);
        stringBuffer.append(' ' + sendMomentPollView2.f25193OoooO00.f41575OooO00o + ' ' + sendMomentPollView2.f25193OoooO00.f41576OooO0O0);
        stringBuffer.append(' ' + sendMomentPollView2.f25192OoooO0.f41575OooO00o + ' ' + sendMomentPollView2.f25192OoooO0.f41576OooO0O0);
        this.f48246Oooo0o.getF25188Oooo0o().f50869OooO0o0.setText(stringBuffer);
        MomentSendPollModel sendMomentPoll = this.f48246Oooo0o.getSendMomentPoll();
        if (sendMomentPoll != null) {
            SendMomentPollView sendMomentPollView3 = this.f48246Oooo0o;
            sendMomentPoll.setExpireTime((sendMomentPollView3.f25193OoooO00.f41575OooO00o * 60) + (sendMomentPollView3.f25187Oooo.f41575OooO00o * 1440) + sendMomentPollView3.f25192OoooO0.f41575OooO00o);
        }
        Function0<Unit> changeListener = this.f48246Oooo0o.getChangeListener();
        if (changeListener != null) {
            changeListener.invoke();
        }
        return Unit.INSTANCE;
    }
}
