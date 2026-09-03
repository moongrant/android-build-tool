package p026Oooo0o;

import android.view.Display;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p247o00oo0oO.o00OOO0;
import p313o0O0oOo.o000000;
import p313o0O0oOo.o000000O;
import p313o0O0oOo.o000OOo;
import p313o0O0oOo.o0O0O00;
import p637o0ooOO0.o00O000;
import p671oo0oOOo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements o00O000.OooO0OO, DoubleFunction, o00OOO0.OooO0O0.OooO00o, SuccessContinuation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1078OooO0Oo;

    public /* synthetic */ OooO0OO(Object obj) {
        this.f1078OooO0Oo = obj;
    }

    public void OooO00o(Display display) {
        o00OOO0 o00ooo1 = (o00OOO0) this.f1078OooO0Oo;
        o00ooo1.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            o00ooo1.f40824OooOO0O = refreshRate;
            o00ooo1.f40825OooOO0o = (refreshRate * 80) / 100;
        } else {
            Log.OooO0o("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            o00ooo1.f40824OooOO0O = -9223372036854775807L;
            o00ooo1.f40825OooOO0o = -9223372036854775807L;
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public Object OooO0o0(o00O000.OooO00o oooO00o) {
        OooOOO0 oooOOO0 = (OooOOO0) this.f1078OooO0Oo;
        oooOOO0.getClass();
        oooOOO0.f1090OooO0Oo.execute(new OooOO0O(0, oooOOO0, oooO00o));
        return "clearCaptureRequestOptions";
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return Rgb._init_$lambda$7((TransferParameters) this.f1078OooO0Oo, d);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        final OooOo oooOo = (OooOo) this.f1078OooO0Oo;
        final Task<o000000O> taskOooO0O0 = oooOo.f60916OooO0OO.OooO0O0();
        final Task<o000000O> taskOooO0O1 = oooOo.f60917OooO0Oo.OooO0O0();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0O0, taskOooO0O1}).continueWithTask(oooOo.f60915OooO0O0, new Continuation() { // from class: oo0oOOo.OooOOOO
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                OooOo oooOo2 = oooOo;
                oooOo2.getClass();
                Task task2 = taskOooO0O0;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                o000000O o000000o2 = (o000000O) task2.getResult();
                Task task3 = taskOooO0O1;
                if (task3.isSuccessful()) {
                    o000000O o000000o3 = (o000000O) task3.getResult();
                    if (!(o000000o3 == null || !o000000o2.f42549OooO0OO.equals(o000000o3.f42549OooO0OO))) {
                        return Tasks.forResult(Boolean.FALSE);
                    }
                }
                o000000 o000000Var = oooOo2.f60917OooO0Oo;
                o000000Var.getClass();
                o0O0O00 o0o0o00 = new o0O0O00(o000000Var, o000000o2);
                Executor executor = o000000Var.f42542OooO00o;
                return Tasks.call(executor, o0o0o00).onSuccessTask(executor, new o000OOo(o000000Var, o000000o2)).continueWith(oooOo2.f60915OooO0O0, new OooOo00(oooOo2));
            }
        });
    }
}
