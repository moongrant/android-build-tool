package o0O0OOO0;

import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p433o0OoOOo.o00OO00O;
import p464o0Oooo.o000000O;
import p585o0oOooOO.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f42055OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f42056OooO0o0;

    public /* synthetic */ OooOo(int i, Object obj, Object obj2) {
        this.f42054OooO0Oo = i;
        this.f42056OooO0o0 = obj;
        this.f42055OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        MutableStateFlow<Long> userId;
        MutableStateFlow<String> userName;
        MutableStateFlow<Long> userId2;
        int i = this.f42054OooO0Oo;
        Object obj = this.f42055OooO0o;
        Object obj2 = this.f42056OooO0o0;
        switch (i) {
            case 0:
                o000oOoO.OooO0O0 oooO0O0 = (o000oOoO.OooO0O0) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } catch (Exception e) {
                    o000oOoO.this.OooOO0O(e);
                    throw e;
                }
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) obj2;
                Timer timer = AppStartTrace.f20410OooOoO;
                appStartTrace.getClass();
                appStartTrace.f20417OooO0o0.OooO0OO(((TraceMetric.OooO0O0) obj).build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                return;
            case 2:
                ChatModel model = (ChatModel) obj;
                o00OO00O o00oo00o = ((MixedRoomActivity) obj2).f23452OoooO0.f48472OooO;
                if (o00oo00o != null) {
                    Intrinsics.checkNotNullParameter(model, "model");
                    o00oo00o.OooO0O0();
                    RoomUserInfoModel newFrom = model.getNewFrom();
                    String value = null;
                    Long value2 = (newFrom == null || (userId2 = newFrom.getUserId()) == null) ? null : userId2.getValue();
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    boolean zAreEqual = Intrinsics.areEqual(value2, o000000O.OooOOo0().getValue());
                    p490o0o00OOO.OooOOOO oooOOOO = o00oo00o.f45994OooO0OO;
                    if (zAreEqual) {
                        oooOOOO.OooO00o().setText("");
                    } else {
                        RoomUserInfoModel newFrom2 = model.getNewFrom();
                        if (newFrom2 != null && (userName = newFrom2.getUserName()) != null) {
                            value = userName.getValue();
                        }
                        RoomUserInfoModel newFrom3 = model.getNewFrom();
                        o00oo00o.OooO00o(new h(value, (newFrom3 == null || (userId = newFrom3.getUserId()) == null) ? 0L : userId.getValue().longValue()), false);
                    }
                    oooOOOO.OooO0OO().f46032OooO00o.setValue(model);
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                Scope scopeOooO0o = ((Context) obj).OooO0o();
                try {
                    runnable.run();
                    if (scopeOooO0o != null) {
                        scopeOooO0o.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (scopeOooO0o != null) {
                        try {
                            scopeOooO0o.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        break;
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ OooOo(Context context, Runnable runnable) {
        this.f42054OooO0Oo = 3;
        this.f42055OooO0o = context;
        this.f42056OooO0o0 = runnable;
    }
}
