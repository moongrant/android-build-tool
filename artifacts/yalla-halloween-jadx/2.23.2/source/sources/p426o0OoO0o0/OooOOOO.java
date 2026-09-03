package p426o0OoO0o0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.constant.FeedbackType;
import java.util.LinkedHashMap;
import o0o0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static LinkedHashMap OooO00o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("p", FeedbackType.Suggestions);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Integer numValueOf = (Integer) o0O00oO0.OooOOO0().getValue();
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = Integer.valueOf(OooOo00.OooO0OO());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(numValueOf);
        linkedHashMap.put("region", sb.toString());
        linkedHashMap.put("v", String.valueOf(oo0o0Oo.OooO0OO()));
        linkedHashMap.put("userid", String.valueOf(o0O00oO0.OooOOo0().getValue()));
        linkedHashMap.put("token", String.valueOf(o0O00oO0.OooOOOO().getValue()));
        linkedHashMap.put("language", String.valueOf(OooOo00.OooO0OO()));
        linkedHashMap.put("sources", FeedbackType.Suggestions);
        linkedHashMap.put("pagesize", "15");
        linkedHashMap.put("boxid", OooO00o.f48382OooO00o);
        return linkedHashMap;
    }
}
