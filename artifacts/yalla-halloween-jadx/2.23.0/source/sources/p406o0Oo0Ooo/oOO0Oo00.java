package p406o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.yalla.yalla.data.db.table.HideContent;
import p028Oooo0oO.o00O0000;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0Oo00 {
    public static void OooO00o(long j, long j2) {
        StringBuilder sbOooO00o = o00O0000.OooO00o("HideContentRepo hideComment momentId = ", j, ", commentId = ");
        sbOooO00o.append(j2);
        OooOOO0.OooO0O0(sbOooO00o.toString());
        HideContent hideContent = new HideContent();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        hideContent.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
        hideContent.setType(1);
        hideContent.setContentId(j + "-" + j2);
        o000OOo.OooO00o().OooOo0O().OooO00o(hideContent);
    }

    public static void OooO0O0(long j) {
        OooOOO0.OooO0O0("hideEvent " + j);
        HideContent hideContent = new HideContent();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        hideContent.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
        hideContent.setType(3);
        hideContent.setContentId(String.valueOf(j));
        o000OOo.OooO00o().OooOo0O().OooO00o(hideContent);
    }
}
