package p640o0ooOOO0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.constant.FeedbackType;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import p382o0OOoo0o.o00Ooo;
import p464o0Oooo.o000000O;
import p470o0OoooOo.o0O0oo0o;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO00o000 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static LinkedHashMap OooO00o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("p", FeedbackType.Suggestions);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Integer numValueOf = (Integer) o000000O.OooOOO0().getValue();
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = Integer.valueOf(OooO.OooO0OO());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(numValueOf);
        linkedHashMap.put("region", sb.toString());
        linkedHashMap.put("v", String.valueOf(o00Ooo.OooO0OO()));
        linkedHashMap.put("userid", String.valueOf(o000000O.OooOOo0().getValue()));
        linkedHashMap.put("token", String.valueOf(o000000O.OooOOOO().getValue()));
        linkedHashMap.put("language", String.valueOf(OooO.OooO0OO()));
        linkedHashMap.put("sources", FeedbackType.Suggestions);
        linkedHashMap.put("pagesize", "15");
        linkedHashMap.put("boxid", o0O0oo0o.f47183OooO00o);
        return linkedHashMap;
    }
}
