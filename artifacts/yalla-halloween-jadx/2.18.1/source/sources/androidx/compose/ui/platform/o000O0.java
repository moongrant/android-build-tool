package androidx.compose.ui.platform;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 implements o000o0OO.o0OoOo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ p045OooooOo.o00O0OO f6431OooO00o;

    public o000O0(p045OooooOo.o00O0OO o00o0oo2) {
        this.f6431OooO00o = o00o0oo2;
    }

    @Override // o000o0OO.o0OoOo0.OooO0O0
    @NotNull
    public final Bundle saveState() {
        Map<String, List<Object>> mapOooO00o = this.f6431OooO00o.OooO00o();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, List<Object>> entry : mapOooO00o.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }
}
