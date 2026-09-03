package p023Oooo00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO<T, V extends o0O0O00> implements o00OO0O0<T, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<T, V> f1175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function1<V, T> f1176OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO0OO(@NotNull Function1<? super T, ? extends V> convertToVector, @NotNull Function1<? super V, ? extends T> convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.f1175OooO00o = convertToVector;
        this.f1176OooO0O0 = convertFromVector;
    }

    @Override // p023Oooo00O.o00OO0O0
    @NotNull
    public final Function1<T, V> OooO00o() {
        return this.f1175OooO00o;
    }

    @Override // p023Oooo00O.o00OO0O0
    @NotNull
    public final Function1<V, T> OooO0O0() {
        return this.f1176OooO0O0;
    }
}
