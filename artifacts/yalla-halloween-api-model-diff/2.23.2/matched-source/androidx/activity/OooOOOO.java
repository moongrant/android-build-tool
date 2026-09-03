package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import com.yalla.yalla.model.moment.MomentPowerSelectModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import com.yalla.yalla.ui.view.moment.SendMomentLocationPowerView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2184OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f2183OooO0Oo = i;
        this.f2184OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2183OooO0Oo;
        Object obj = this.f2184OooO0o0;
        switch (i) {
            case 0:
                OooOo.onBackPressedDispatcher$lambda$1((OooOo) obj);
                break;
            case 1:
                androidx.work.impl.background.systemalarm.OooO0OO.OooO0O0((androidx.work.impl.background.systemalarm.OooO0OO) obj);
                break;
            case 2:
                ViewObserver.m4105process$lambda0((ViewObserver) obj);
                break;
            case 3:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                Timer timer = AppStartTrace.f19938OooOoO;
                appStartTrace.getClass();
                TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
                oooO0O0NewBuilder.OooOOO0(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                oooO0O0NewBuilder.OooOO0O(appStartTrace.OooO00o().f20004OooO0Oo);
                Timer timerOooO00o = appStartTrace.OooO00o();
                Timer timer2 = appStartTrace.f19953OooOOOO;
                timerOooO00o.getClass();
                oooO0O0NewBuilder.OooOO0o(timer2.f20005OooO0o0 - timerOooO00o.f20005OooO0o0);
                ArrayList arrayList = new ArrayList(3);
                TraceMetric.OooO0O0 oooO0O0NewBuilder2 = TraceMetric.newBuilder();
                oooO0O0NewBuilder2.OooOOO0(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                oooO0O0NewBuilder2.OooOO0O(appStartTrace.OooO00o().f20004OooO0Oo);
                Timer timerOooO00o2 = appStartTrace.OooO00o();
                Timer timer3 = appStartTrace.f19952OooOOO0;
                timerOooO00o2.getClass();
                oooO0O0NewBuilder2.OooOO0o(timer3.f20005OooO0o0 - timerOooO00o2.f20005OooO0o0);
                arrayList.add(oooO0O0NewBuilder2.build());
                if (appStartTrace.f19951OooOOO != null) {
                    TraceMetric.OooO0O0 oooO0O0NewBuilder3 = TraceMetric.newBuilder();
                    oooO0O0NewBuilder3.OooOOO0(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                    oooO0O0NewBuilder3.OooOO0O(appStartTrace.f19952OooOOO0.f20004OooO0Oo);
                    Timer timer4 = appStartTrace.f19952OooOOO0;
                    Timer timer5 = appStartTrace.f19951OooOOO;
                    timer4.getClass();
                    oooO0O0NewBuilder3.OooOO0o(timer5.f20005OooO0o0 - timer4.f20005OooO0o0);
                    arrayList.add(oooO0O0NewBuilder3.build());
                    TraceMetric.OooO0O0 oooO0O0NewBuilder4 = TraceMetric.newBuilder();
                    oooO0O0NewBuilder4.OooOOO0(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                    oooO0O0NewBuilder4.OooOO0O(appStartTrace.f19951OooOOO.f20004OooO0Oo);
                    Timer timer6 = appStartTrace.f19951OooOOO;
                    Timer timer7 = appStartTrace.f19953OooOOOO;
                    timer6.getClass();
                    oooO0O0NewBuilder4.OooOO0o(timer7.f20005OooO0o0 - timer6.f20005OooO0o0);
                    arrayList.add(oooO0O0NewBuilder4.build());
                }
                oooO0O0NewBuilder.OooO0Oo(arrayList);
                oooO0O0NewBuilder.OooO0o0(appStartTrace.f19959OooOo0.OooO00o());
                appStartTrace.f19945OooO0o0.OooO0OO(oooO0O0NewBuilder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                break;
            default:
                final SendMomentLocationPowerView this$0 = (SendMomentLocationPowerView) obj;
                int i2 = SendMomentLocationPowerView.f30659OooOOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel = this$0.topicInfoModel;
                if (topicInfoModel == null || com.code.android.util.o0OoOo0.OooOO0(Long.valueOf(topicInfoModel.getId())) <= 0) {
                    int i3 = MomentPowerSelectActivity.f25693OooOo;
                    FragmentActivity activity = this$0.f30662OooO0o;
                    MomentSendModel momentSendModel = null;
                    if (activity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activity");
                        activity = null;
                    }
                    MomentSendModel momentSendModel2 = this$0.f30664OooO0oO;
                    if (momentSendModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                    } else {
                        momentSendModel = momentSendModel2;
                    }
                    int power = momentSendModel.getPower();
                    p604o0oo0O0.Oooo000 oooo000 = new p604o0oo0O0.Oooo000() { // from class: o0oOo0O.oo0ooO
                        @Override // p604o0oo0O0.Oooo000
                        public final void onActivityResult(int i4, Intent data) {
                            int i5 = SendMomentLocationPowerView.f30659OooOOOo;
                            SendMomentLocationPowerView this$1 = this$0;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            Intrinsics.checkNotNullParameter(data, "data");
                            if (i4 == -1) {
                                MomentPowerSelectModel momentPowerSelectModel = (MomentPowerSelectModel) data.getSerializableExtra("Data");
                                this$1.f30660OooO = momentPowerSelectModel;
                                if (momentPowerSelectModel != null) {
                                    MomentSendModel momentSendModel3 = this$1.f30664OooO0oO;
                                    if (momentSendModel3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("sendPostModel");
                                        momentSendModel3 = null;
                                    }
                                    momentSendModel3.setPower(momentPowerSelectModel.getPower());
                                    this$1.OooO0oO();
                                }
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Bundle bundle = new Bundle();
                    bundle.putInt("Id", power);
                    p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(activity);
                    oooOo.f57388OooO0O0 = MomentPowerSelectActivity.class;
                    oooOo.OooO00o(bundle);
                    oooOo.OooO0O0(oooo000);
                    break;
                } else {
                    String strOooO0OO = o0000.OooO0OO(o000000.Posts_including_topics_must_be_public);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        } else {
                            o000oo0OooO00o.run();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
