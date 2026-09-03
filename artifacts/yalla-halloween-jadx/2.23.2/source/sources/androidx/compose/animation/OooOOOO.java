package androidx.compose.animation;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.media3.common.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements androidx.media3.common.OooO0OO.OooO00o {
    public static CompositionScopedCoroutineScopeCanceller OooO00o(CoroutineScope coroutineScope, Composer composer) {
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(coroutineScope);
        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
        return compositionScopedCoroutineScopeCanceller;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        o0O00 o0o00OooO0oo;
        o0O00 o0o00OooO00o;
        Bundle bundle2 = bundle.getBundle(androidx.media3.common.OooOOO0.OooOO0O.f6567OooOOO);
        androidx.media3.common.OooOOO0.OooO oooO = bundle2 == null ? null : (androidx.media3.common.OooOOO0.OooO) androidx.media3.common.OooOOO0.OooO.f6497OooOo00.OooO0OO(bundle2);
        Bundle bundle3 = bundle.getBundle(androidx.media3.common.OooOOO0.OooOO0O.f6569OooOOOO);
        androidx.media3.common.OooOOO0.OooO00o oooO00o = bundle3 != null ? (androidx.media3.common.OooOOO0.OooO00o) androidx.media3.common.OooOOO0.OooO00o.f6514OooO0o.OooO0OO(bundle3) : null;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.common.OooOOO0.OooOO0O.f6570OooOOOo);
        if (parcelableArrayList == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            o0o00OooO0oo = o0O00.f19060OooO0oo;
        } else {
            ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f18681OooO0o0;
            ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle4 = (Bundle) parcelableArrayList.get(i);
                bundle4.getClass();
                oooO00o2.OooO0OO(new StreamKey(bundle4.getInt(StreamKey.f6725OooO0oO, 0), bundle4.getInt(StreamKey.f6726OooO0oo, 0), bundle4.getInt(StreamKey.f6724OooO, 0)));
            }
            o0o00OooO0oo = oooO00o2.OooO0oo();
        }
        o0O00 o0o01 = o0o00OooO0oo;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(androidx.media3.common.OooOOO0.OooOO0O.f6571OooOOo);
        if (parcelableArrayList2 == null) {
            ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18681OooO0o0;
            o0o00OooO00o = o0O00.f19060OooO0oo;
        } else {
            o0o00OooO00o = o00oO0o.OooO00o(androidx.media3.common.OooOOO0.OooOOOO.f6599OooOOo, parcelableArrayList2);
        }
        Uri uri = (Uri) bundle.getParcelable(androidx.media3.common.OooOOO0.OooOO0O.f6566OooOO0o);
        uri.getClass();
        return new androidx.media3.common.OooOOO0.OooOO0O(uri, bundle.getString(androidx.media3.common.OooOOO0.OooOO0O.f6568OooOOO0), oooO, oooO00o, o0o01, bundle.getString(androidx.media3.common.OooOOO0.OooOO0O.f6572OooOOo0), o0o00OooO00o, null);
    }
}
