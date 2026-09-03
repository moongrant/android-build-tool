package p023Oooo00O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo<T> implements o00000OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O f1055OooO00o;

    public o0000Ooo(@NotNull o0000O floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f1055OooO00o = floatDecaySpec;
    }

    @Override // p023Oooo00O.o00000OO
    @NotNull
    public final <V extends o0O0O00> o00OOOO0<V> OooO00o(@NotNull o00OO0O0<T, V> typeConverter) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new o0O00o0(this.f1055OooO00o);
    }
}
