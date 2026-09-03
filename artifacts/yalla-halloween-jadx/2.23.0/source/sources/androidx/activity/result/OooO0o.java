package androidx.activity.result;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooO0O0<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f2225OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ p011OooOo0.OooOO0 f2226OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO f2227OooO0OO;

    public OooO0o(OooO oooO, String str, p011OooOo0.OooOO0 oooOO1) {
        this.f2227OooO0OO = oooO;
        this.f2225OooO00o = str;
        this.f2226OooO0O0 = oooOO1;
    }

    @Override // androidx.activity.result.OooO0O0
    @NonNull
    public final p011OooOo0.OooOO0<Object, ?> OooO00o() {
        return this.f2226OooO0O0;
    }

    @Override // androidx.activity.result.OooO0O0
    public final void OooO0O0(Object obj) {
        OooO oooO = this.f2227OooO0OO;
        HashMap map = oooO.f2212OooO0OO;
        String str = this.f2225OooO00o;
        Integer num = (Integer) map.get(str);
        p011OooOo0.OooOO0 oooOO1 = this.f2226OooO0O0;
        if (num != null) {
            oooO.f2215OooO0o0.add(str);
            try {
                oooO.OooO0O0(num.intValue(), oooOO1, obj);
                return;
            } catch (Exception e) {
                oooO.f2215OooO0o0.remove(str);
                throw e;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + oooOO1 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    @Override // androidx.activity.result.OooO0O0
    public final void OooO0OO() {
        this.f2227OooO0OO.OooO0o(this.f2225OooO00o);
    }
}
