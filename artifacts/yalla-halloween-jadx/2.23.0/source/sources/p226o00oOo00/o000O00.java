package p226o00oOo00;

import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.OooOo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00 implements OooO.OooO00o {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final OooO OooO0O0(Bundle bundle) {
        o0O00 o0o00OooO00o;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o000O00O.f39870OooO);
        if (parcelableArrayList == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            o0o00OooO00o = o0O00.f19536OooO0oo;
        } else {
            o0o00OooO00o = oOO00O.OooO00o(OooOo.f11195o00oO0o, parcelableArrayList);
        }
        return new o000O00O(bundle.getString(o000O00O.f39871OooOO0, ""), (OooOo[]) o0o00OooO00o.toArray(new OooOo[0]));
    }
}
