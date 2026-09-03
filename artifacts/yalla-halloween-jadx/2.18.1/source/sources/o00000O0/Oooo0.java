package o00000O0;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements Oooo000 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f26940Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooOOOO f26941Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26939Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static AtomicInteger f26938Oooo = new AtomicInteger(0);

    public static final class OooO00o {
    }

    public Oooo0(int i, boolean z, @NotNull Function1 properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f26940Oooo0o = i;
        OooOOOO oooOOOO = new OooOOOO();
        oooOOOO.f26935Oooo0oO = z;
        oooOOOO.f26936Oooo0oo = false;
        properties.invoke(oooOOOO);
        this.f26941Oooo0oO = oooOOOO;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return this.f26940Oooo0o == oooo0.f26940Oooo0o && Intrinsics.areEqual(this.f26941Oooo0oO, oooo0.f26941Oooo0oO);
    }

    @Override // o00000O0.Oooo000
    public final int getId() {
        return this.f26940Oooo0o;
    }

    public final int hashCode() {
        return (this.f26941Oooo0oO.hashCode() * 31) + this.f26940Oooo0o;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // o00000O0.Oooo000
    @NotNull
    public final OooOOOO o0ooOO0() {
        return this.f26941Oooo0oO;
    }
}
