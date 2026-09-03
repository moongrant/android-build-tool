package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apmwrapper.model.ApmLogModel;
import com.yalla.yalla.common.statistical.event.WebEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0.OooO00o;
import org.jetbrains.annotations.NotNull;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo000o implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) throws IOException {
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-17170451111440L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        String requestId = o00ooo01.OooO0O0(o000O0O0.OooO00o(-17196220915216L));
        o00OO000 o00oo001 = o00ooo01.f51425OooO0O0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(o00ooo01);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (!(requestId == null || StringsKt.isBlank(requestId))) {
            OooO00o oooO00o2 = OooO00o.f26553OooO0O0;
            String path = o00oo001.f51387OooO0o0;
            int i = o00oooo0OooO0O0.f51443OoooO00;
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(path, "path");
            ApmLogModel apmLogModel = new ApmLogModel();
            apmLogModel.setRequestId(requestId);
            apmLogModel.setSpendTimeUs(jCurrentTimeMillis2 * ((long) 1000));
            apmLogModel.setPath(path);
            apmLogModel.setStatus(i);
            try {
                String json = OooO00o.f26552OooO00o.OooO0oo(apmLogModel);
                p267o00ooo0o.o00OO00O o00oo00o = p267o00ooo0o.o00OO00O.f34919OooO00o;
                Intrinsics.checkNotNullExpressionValue(json, "json");
                o00oo00o.OooO00o("apm", json);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (!o00oooo0OooO0O0.OooO0Oo()) {
            FLog.INSTANCE.webLog(WebEventType.Http_Request);
        }
        return o00oooo0OooO0O0;
    }
}
