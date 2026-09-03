package androidx.compose.compiler.plugins.kotlin;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import p245o00oo0o.o00O0O00;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements com.google.android.exoplayer2.OooO.OooO00o, o00O0O00 {
    public static String OooO00o(String str, Class cls) {
        return str + cls;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        o0O00 o0o00OooO0oo;
        o0O00 o0o00OooO00o;
        Bundle bundle2 = bundle.getBundle(o000oOoO.OooOO0O.f12751OooOOO);
        o000oOoO.OooO oooO = bundle2 == null ? null : (o000oOoO.OooO) o000oOoO.OooO.f12681OooOo00.OooO0O0(bundle2);
        Bundle bundle3 = bundle.getBundle(o000oOoO.OooOO0O.f12753OooOOOO);
        o000oOoO.OooO00o oooO00o = bundle3 != null ? (o000oOoO.OooO00o) o000oOoO.OooO00o.f12698OooO0o.OooO0O0(bundle3) : null;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o000oOoO.OooOO0O.f12754OooOOOo);
        if (parcelableArrayList == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            o0o00OooO0oo = o0O00.f19536OooO0oo;
        } else {
            ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f19157OooO0o0;
            ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle4 = (Bundle) parcelableArrayList.get(i);
                bundle4.getClass();
                oooO00o2.OooO0OO(new StreamKey(bundle4.getInt(StreamKey.f12881OooO0oO, 0), bundle4.getInt(StreamKey.f12882OooO0oo, 0), bundle4.getInt(StreamKey.f12880OooO, 0)));
            }
            o0o00OooO0oo = oooO00o2.OooO0oo();
        }
        o0O00 o0o01 = o0o00OooO0oo;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(o000oOoO.OooOO0O.f12755OooOOo);
        if (parcelableArrayList2 == null) {
            ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f19157OooO0o0;
            o0o00OooO00o = o0O00.f19536OooO0oo;
        } else {
            o0o00OooO00o = oOO00O.OooO00o(o000oOoO.OooOOOO.f12783OooOOo, parcelableArrayList2);
        }
        Uri uri = (Uri) bundle.getParcelable(o000oOoO.OooOO0O.f12750OooOO0o);
        uri.getClass();
        return new o000oOoO.OooOO0O(uri, bundle.getString(o000oOoO.OooOO0O.f12752OooOOO0), oooO, oooO00o, o0o01, bundle.getString(o000oOoO.OooOO0O.f12756OooOOo0), o0o00OooO00o, null);
    }

    @Override // p245o00oo0o.o00O0O00
    public void accept(Object obj) {
        ((com.google.android.exoplayer2.drm.OooO0O0.OooO00o) obj).OooO00o();
    }
}
