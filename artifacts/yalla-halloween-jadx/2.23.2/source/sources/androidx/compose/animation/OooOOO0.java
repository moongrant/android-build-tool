package androidx.compose.animation;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0OoO00O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements androidx.media3.common.OooO0OO.OooO00o {
    public static ValueElementSequence OooO00o(InspectorInfo inspectorInfo, String str, String str2) {
        Intrinsics.checkNotNullParameter(inspectorInfo, str);
        inspectorInfo.setName(str2);
        return inspectorInfo.getProperties();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Map mapOooO0O0;
        String string = bundle.getString(androidx.media3.common.OooOOO0.OooO.f6489OooOO0o);
        string.getClass();
        UUID uuidFromString = UUID.fromString(string);
        Uri uri = (Uri) bundle.getParcelable(androidx.media3.common.OooOOO0.OooO.f6491OooOOO0);
        Bundle bundle2 = Bundle.EMPTY;
        Bundle bundle3 = bundle.getBundle(androidx.media3.common.OooOOO0.OooO.f6490OooOOO);
        if (bundle3 == null) {
            bundle3 = bundle2;
        }
        if (bundle3 == bundle2) {
            mapOooO0O0 = o0OoO00O.f19150OooOO0;
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
        boolean z = bundle.getBoolean(androidx.media3.common.OooOOO0.OooO.f6492OooOOOO, false);
        boolean z2 = bundle.getBoolean(androidx.media3.common.OooOOO0.OooO.f6493OooOOOo, false);
        boolean z3 = bundle.getBoolean(androidx.media3.common.OooOOO0.OooO.f6495OooOOo0, false);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(androidx.media3.common.OooOOO0.OooO.f6494OooOOo);
        if (integerArrayList != null) {
            arrayList = integerArrayList;
        }
        ImmutableList immutableListOooOO0O = ImmutableList.OooOO0O(arrayList);
        byte[] byteArray = bundle.getByteArray(androidx.media3.common.OooOOO0.OooO.f6496OooOOoo);
        androidx.media3.common.OooOOO0.OooO.OooO00o oooO00o = new androidx.media3.common.OooOOO0.OooO.OooO00o(uuidFromString);
        oooO00o.f6507OooO0O0 = uri;
        oooO00o.f6508OooO0OO = ImmutableMap.OooO0O0(mapOooO0O0);
        oooO00o.f6509OooO0Oo = z;
        oooO00o.f6510OooO0o = z3;
        oooO00o.f6511OooO0o0 = z2;
        oooO00o.f6512OooO0oO = ImmutableList.OooOO0O(immutableListOooOO0O);
        oooO00o.f6513OooO0oo = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
        return new androidx.media3.common.OooOOO0.OooO(oooO00o);
    }
}
