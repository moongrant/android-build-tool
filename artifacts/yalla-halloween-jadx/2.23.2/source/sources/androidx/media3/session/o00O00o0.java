package androidx.media3.session;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O00o0 implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o {
    @Override // o0O0Oo.OooO0O0.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) {
        return p288o0O0Oo.OooO0O0.OooO00o(jsonReader);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public final androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(oo00o.f9495OooO0o);
        if (parcelableArrayList == null) {
            Log.OooO0o("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return oo00o.f9496OooO0o0;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add((SessionCommand) SessionCommand.f9267OooOO0.OooO0OO((Bundle) parcelableArrayList.get(i)));
        }
        return new oo00o(hashSet);
    }
}
