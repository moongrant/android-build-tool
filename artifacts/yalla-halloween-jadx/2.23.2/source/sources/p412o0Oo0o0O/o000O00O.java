package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.data.db.table.HideContent;
import p028Oooo0oO.o00O0000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O00O {
    public static void OooO00o(long j, long j2) {
        StringBuilder sbOooO00o = o00O0000.OooO00o("HideContentRepo hideComment momentId = ", j, ", commentId = ");
        sbOooO00o.append(j2);
        o0000O00.OooO0O0(sbOooO00o.toString());
        HideContent hideContent = new HideContent();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        hideContent.setUserId(((Number) OooO00o.OooO00o()).longValue());
        hideContent.setType(1);
        hideContent.setContentId(j + "-" + j2);
        o00Oo0.OooO00o().OooOo0o().OooO00o(hideContent);
    }

    public static void OooO0O0(long j) {
        o0000O00.OooO0O0("hideEvent " + j);
        HideContent hideContent = new HideContent();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        hideContent.setUserId(((Number) OooO00o.OooO00o()).longValue());
        hideContent.setType(3);
        hideContent.setContentId(String.valueOf(j));
        o00Oo0.OooO00o().OooOo0o().OooO00o(hideContent);
    }
}
