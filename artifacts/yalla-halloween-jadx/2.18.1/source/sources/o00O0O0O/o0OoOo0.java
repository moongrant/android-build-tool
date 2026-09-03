package o00O0O0O;

import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends p021OooOooo.oo000o<MemoryCache$Key, o000oOoO.OooO00o> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f30545OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o000oOoO o000oooo2, int i) {
        super(i);
        this.f30545OooO = o000oooo2;
    }

    @Override // p021OooOooo.oo000o
    public final void OooO0O0(Object obj, Object obj2, Object obj3) {
        MemoryCache$Key key = (MemoryCache$Key) obj;
        o000oOoO.OooO00o oldValue = (o000oOoO.OooO00o) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        if (this.f30545OooO.f30521OooO0O0.OooO0O0(oldValue.f30524OooO00o)) {
            return;
        }
        this.f30545OooO.f30520OooO00o.OooO0OO(key, oldValue.f30524OooO00o, oldValue.f30525OooO0O0, oldValue.f30526OooO0OO);
    }

    @Override // p021OooOooo.oo000o
    public final int OooO0Oo(MemoryCache$Key memoryCache$Key, o000oOoO.OooO00o oooO00o) {
        MemoryCache$Key key = memoryCache$Key;
        o000oOoO.OooO00o value = oooO00o;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return value.f30526OooO0OO;
    }
}
