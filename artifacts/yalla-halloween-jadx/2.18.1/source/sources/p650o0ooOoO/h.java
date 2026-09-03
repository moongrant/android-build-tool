package p650o0ooOoO;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o000000.oo000o;
import o0O0O00.Oooo000;
import o0O0O00.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOOOO;
import p076o000OOo.OooOo00;
import p710ooOO.o0OO00O;
import p710ooOO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class h implements OooOO0O, OooOOO<h>, o000OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public h f51139Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final Function1<f, Boolean> f51140Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final Function1<f, Boolean> f51141Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o0OO00O f51142Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public LayoutNode f51143OoooO00;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Nullable Function1<? super f, Boolean> function1, @Nullable Function1<? super f, Boolean> function2) {
        this.f51140Oooo0o = function1;
        this.f51141Oooo0oO = function2;
    }

    public final boolean OooO00o(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Function1<f, Boolean> function1 = this.f51140Oooo0o;
        Boolean boolInvoke = function1 != null ? function1.invoke(new f(keyEvent)) : null;
        if (Intrinsics.areEqual(boolInvoke, Boolean.TRUE)) {
            return boolInvoke.booleanValue();
        }
        h hVar = this.f51139Oooo;
        if (hVar != null) {
            return hVar.OooO00o(keyEvent);
        }
        return false;
    }

    public final boolean OooO0O0(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        h hVar = this.f51139Oooo;
        Boolean boolValueOf = hVar != null ? Boolean.valueOf(hVar.OooO0O0(keyEvent)) : null;
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            return boolValueOf.booleanValue();
        }
        Function1<f, Boolean> function1 = this.f51141Oooo0oO;
        if (function1 != null) {
            return function1.invoke(new f(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        o000OOo<h> o000ooo2;
        o000OOo<h> o000ooo3;
        Intrinsics.checkNotNullParameter(scope, "scope");
        o0OO00O o0oo00o2 = this.f51142Oooo0oo;
        if (o0oo00o2 != null && (o000ooo3 = o0oo00o2.f53488Ooooo00) != null) {
            o000ooo3.OooOO0O(this);
        }
        o0OO00O o0oo00o3 = (o0OO00O) scope.OooO00o(oo0o0Oo.f53497OooO00o);
        this.f51142Oooo0oo = o0oo00o3;
        if (o0oo00o3 != null && (o000ooo2 = o0oo00o3.f53488Ooooo00) != null) {
            o000ooo2.OooO0O0(this);
        }
        this.f51139Oooo = (h) scope.OooO00o(KeyInputModifierKt.f6080OooO00o);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.o000OO
    public final void Oooo00O(@NotNull Oooo000 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f51143OoooO00 = ((oo000o) coordinates).f26702OoooO00;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<h> getKey() {
        return KeyInputModifierKt.f6080OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final h getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
