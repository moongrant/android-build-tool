package p203o00o0o0o;

import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.o00Oo0;
import com.google.android.exoplayer2.o0ooOOo;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O000Oo implements OooO.OooO00o {
    public static Object OooO00o(MomentDetailActivity momentDetailActivity) {
        return momentDetailActivity.OooOooo().getMPostDetailModel().getValue();
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        o00O000o.OooO00o(bundle.getInt(o0ooOOo.f12867OooO0Oo, -1) == 1);
        float f = bundle.getFloat(o00Oo0.f12821OooO0oO, -1.0f);
        return f == -1.0f ? new o00Oo0() : new o00Oo0(f);
    }
}
