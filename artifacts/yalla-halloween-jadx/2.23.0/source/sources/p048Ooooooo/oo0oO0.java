package p048Ooooooo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.o0000O;
import androidx.camera.core.impl.o00O0OO0;
import androidx.camera.core.impl.o00O0OOO;
import androidx.camera.core.impl.o0Oo0oo;
import java.util.HashMap;
import p039OoooOoo.o00O000o;
import p044OooooOo.o0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo0oO0 implements o0000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f2058OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0000O f2059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0Oo0oo f2060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o00O0OO0 f2061OooO0OO;

    static {
        HashMap map = new HashMap();
        f2058OooO0Oo = map;
        map.put(1, o00O000o.f1676OooO0o);
        map.put(8, o00O000o.f1675OooO0Oo);
        map.put(6, o00O000o.f1674OooO0OO);
        map.put(5, o00O000o.f1673OooO0O0);
        map.put(4, o00O000o.f1672OooO00o);
        map.put(0, o00O000o.f1677OooO0o0);
    }

    public oo0oO0(@NonNull o00O0OOO o00o0ooo2, @NonNull o0Oo0oo o0oo0oo2, @NonNull o00O0OO0 o00o0oo1) {
        this.f2059OooO00o = o00o0ooo2;
        this.f2060OooO0O0 = o0oo0oo2;
        this.f2061OooO0OO = o00o0oo1;
    }

    @Override // androidx.camera.core.impl.o0000O
    public final boolean OooO00o(int i) {
        boolean z;
        if (!this.f2059OooO00o.OooO00o(i)) {
            return false;
        }
        o00O000o o00o000o2 = (o00O000o) f2058OooO0Oo.get(Integer.valueOf(i));
        if (o00o000o2 != null) {
            for (o0O o0o : this.f2061OooO0OO.OooO0OO(o0O.class)) {
                if (o0o != null && o0o.OooO0O0(this.f2060OooO0O0, o00o000o2) && !o0o.OooO0OO()) {
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
            return this.f2059OooO00o.OooO0O0(i);
        }
        return null;
    }
}
