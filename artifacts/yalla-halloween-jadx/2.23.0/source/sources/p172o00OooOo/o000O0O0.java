package p172o00OooOo;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.o000oOoO;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0OoO00O;
import io.opentelemetry.compat.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0O0 implements FeatureManager.Callback, OooO.OooO00o, Predicate {
    @Override // io.opentelemetry.compat.Predicate
    public final boolean OooO00o(String str) {
        return true;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final OooO OooO0O0(Bundle bundle) {
        Map mapOooO0O0;
        String string = bundle.getString(o000oOoO.OooO.f12673OooOO0o);
        string.getClass();
        UUID uuidFromString = UUID.fromString(string);
        Uri uri = (Uri) bundle.getParcelable(o000oOoO.OooO.f12675OooOOO0);
        Bundle bundle2 = Bundle.EMPTY;
        Bundle bundle3 = bundle.getBundle(o000oOoO.OooO.f12674OooOOO);
        if (bundle3 == null) {
            bundle3 = bundle2;
        }
        if (bundle3 == bundle2) {
            mapOooO0O0 = o0OoO00O.f19626OooOO0;
        } else {
            HashMap map = new HashMap();
            if (bundle3 != bundle2) {
                for (String str : bundle3.keySet()) {
                    String string2 = bundle3.getString(str);
                    if (string2 != null) {
                        map.put(str, string2);
                    }
                }
            }
            mapOooO0O0 = ImmutableMap.OooO0O0(map);
        }
        boolean z = bundle.getBoolean(o000oOoO.OooO.f12676OooOOOO, false);
        boolean z2 = bundle.getBoolean(o000oOoO.OooO.f12677OooOOOo, false);
        boolean z3 = bundle.getBoolean(o000oOoO.OooO.f12679OooOOo0, false);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(o000oOoO.OooO.f12678OooOOo);
        if (integerArrayList != null) {
            arrayList = integerArrayList;
        }
        ImmutableList immutableListOooOO0O = ImmutableList.OooOO0O(arrayList);
        byte[] byteArray = bundle.getByteArray(o000oOoO.OooO.f12680OooOOoo);
        o000oOoO.OooO.OooO00o oooO00o = new o000oOoO.OooO.OooO00o(uuidFromString);
        oooO00o.f12691OooO0O0 = uri;
        oooO00o.f12692OooO0OO = ImmutableMap.OooO0O0(mapOooO0O0);
        oooO00o.f12693OooO0Oo = z;
        oooO00o.f12694OooO0o = z3;
        oooO00o.f12695OooO0o0 = z2;
        oooO00o.f12696OooO0oO = ImmutableList.OooOO0O(immutableListOooOO0O);
        oooO00o.f12697OooO0oo = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
        return new o000oOoO.OooO(oooO00o);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        InstrumentManager.m4148start$lambda1(z);
    }
}
