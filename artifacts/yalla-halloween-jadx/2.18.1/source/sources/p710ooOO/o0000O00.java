package p710ooOO;

import androidx.compose.ui.focus.FocusRequesterModifierKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 implements OooOO0O, OooOOO<o0000O00> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public o0000O00 f53455Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0OO00O> f53456Oooo0oO;

    public o0000O00(@NotNull o0000Ooo focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f53456Oooo0oO = new o000OOo<>(new o0OO00O[16]);
        focusRequester.f53459OooO00o.OooO0O0(this);
    }

    public final void OooO00o(@NotNull o0OO00O focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.f53456Oooo0oO.OooO0O0(focusModifier);
        o0000O00 o0000o00 = this.f53455Oooo0o;
        if (o0000o00 != null) {
            o0000o00.OooO00o(focusModifier);
        }
    }

    public final void OooO0O0(@NotNull o000OOo<o0OO00O> newModifiers) {
        Intrinsics.checkNotNullParameter(newModifiers, "newModifiers");
        o000OOo<o0OO00O> o000ooo2 = this.f53456Oooo0oO;
        o000ooo2.OooO0OO(o000ooo2.f3664Oooo0oo, newModifiers);
        o0000O00 o0000o00 = this.f53455Oooo0o;
        if (o0000o00 != null) {
            o0000o00.OooO0O0(newModifiers);
        }
    }

    public final void OooO0OO(@NotNull o0OO00O focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.f53456Oooo0oO.OooOO0O(focusModifier);
        o0000O00 o0000o00 = this.f53455Oooo0o;
        if (o0000o00 != null) {
            o0000o00.OooO0OO(focusModifier);
        }
    }

    public final void OooO0Oo(@NotNull o000OOo<o0OO00O> removedModifiers) {
        Intrinsics.checkNotNullParameter(removedModifiers, "removedModifiers");
        this.f53456Oooo0oO.OooOO0o(removedModifiers);
        o0000O00 o0000o00 = this.f53455Oooo0o;
        if (o0000o00 != null) {
            o0000o00.OooO0Oo(removedModifiers);
        }
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        o0000O00 o0000o00 = (o0000O00) scope.OooO00o(FocusRequesterModifierKt.f6003OooO00o);
        if (Intrinsics.areEqual(o0000o00, this.f53455Oooo0o)) {
            return;
        }
        o0000O00 o0000o01 = this.f53455Oooo0o;
        if (o0000o01 != null) {
            o000OOo<o0OO00O> removedModifiers = this.f53456Oooo0oO;
            Intrinsics.checkNotNullParameter(removedModifiers, "removedModifiers");
            o0000o01.f53456Oooo0oO.OooOO0o(removedModifiers);
            o0000O00 o0000o02 = o0000o01.f53455Oooo0o;
            if (o0000o02 != null) {
                o0000o02.OooO0Oo(removedModifiers);
            }
        }
        if (o0000o00 != null) {
            o000OOo<o0OO00O> newModifiers = this.f53456Oooo0oO;
            Intrinsics.checkNotNullParameter(newModifiers, "newModifiers");
            o000OOo<o0OO00O> o000ooo2 = o0000o00.f53456Oooo0oO;
            o000ooo2.OooO0OO(o000ooo2.f3664Oooo0oo, newModifiers);
            o0000O00 o0000o03 = o0000o00.f53455Oooo0o;
            if (o0000o03 != null) {
                o0000o03.OooO0O0(newModifiers);
            }
        }
        this.f53455Oooo0o = o0000o00;
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

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<o0000O00> getKey() {
        return FocusRequesterModifierKt.f6003OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o0000O00 getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
