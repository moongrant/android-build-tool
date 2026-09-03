package p048Ooooooo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.o0000O;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oo0o0O0;
import androidx.camera.core.impl.oo0oOO0;
import java.util.HashMap;
import p039OoooOoo.o00O000o;
import p044OooooOo.o0OO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO0o00 implements o0000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f2047OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0000O f2048OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f2049OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final oo0o0O0 f2050OooO0OO;

    static {
        HashMap map = new HashMap();
        f2047OooO0Oo = map;
        map.put(1, o00O000o.f1643OooO0o);
        map.put(8, o00O000o.f1642OooO0Oo);
        map.put(6, o00O000o.f1641OooO0OO);
        map.put(5, o00O000o.f1640OooO0O0);
        map.put(4, o00O000o.f1639OooO00o);
        map.put(0, o00O000o.f1644OooO0o0);
    }

    public o0OO0o00(@NonNull oo0oOO0 oo0ooo0, @NonNull o0Oo0oo o0oo0oo2, @NonNull oo0o0O0 oo0o0o0) {
        this.f2048OooO00o = oo0ooo0;
        this.f2049OooO0O0 = o0oo0oo2;
        this.f2050OooO0OO = oo0o0o0;
    }

    @Override // androidx.camera.core.impl.o0000O
    public final boolean OooO00o(int i) {
        boolean z;
        if (!this.f2048OooO00o.OooO00o(i)) {
            return false;
        }
        o00O000o o00o000o2 = (o00O000o) f2047OooO0Oo.get(Integer.valueOf(i));
        if (o00o000o2 != null) {
            for (o0OO0 o0oo1 : this.f2050OooO0OO.OooO0OO(o0OO0.class)) {
                if (o0oo1 != null && o0oo1.OooO0O0(this.f2049OooO0O0, o00o000o2) && !o0oo1.OooO0OO()) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = true;
        }
        return z;
    }

    @Override // androidx.camera.core.impl.o0000O
    @Nullable
    public final EncoderProfilesProxy OooO0O0(int i) {
        if (OooO00o(i)) {
            return this.f2048OooO00o.OooO0O0(i);
        }
        return null;
    }
}
