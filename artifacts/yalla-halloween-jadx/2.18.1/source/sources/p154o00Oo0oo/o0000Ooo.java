package p154o00Oo0oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.interfaceType.FeedbackType;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.oo000o;
import p487o0o000oO.o0OOO0o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo {
    @NotNull
    public static final Map OooO00o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ak.ax, FeedbackType.Suggestions);
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Integer value = oooOOO.OooOOO().getValue();
        if (value != null && value.intValue() == -1) {
            value = Integer.valueOf(oo000o.OooO0O0());
        }
        linkedHashMap.put("region", value + "");
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        linkedHashMap.put(ak.aE, String.valueOf(o0OOO0o.OooO00o()));
        linkedHashMap.put("userid", String.valueOf(oooOOO.OooOo().getValue()));
        linkedHashMap.put(FirebaseMessagingService.EXTRA_TOKEN, String.valueOf(oooOOO.OooOo00().getValue()));
        linkedHashMap.put(ak.N, String.valueOf(oo000o.OooO0O0()));
        linkedHashMap.put("sources", FeedbackType.Suggestions);
        linkedHashMap.put("pagesize", "15");
        return linkedHashMap;
    }
}
