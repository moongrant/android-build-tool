package p710ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.Unit;
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
public final class o00oO0o implements OooOOO<o00oO0o>, OooOO0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0OO00O> f53468Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function1<o0000oo, Unit> f53469Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o00oO0o f53470Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000OOo<o00oO0o> f53471Oooo0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00oO0o(@NotNull Function1<? super o0000oo, Unit> onFocusEvent) {
        Intrinsics.checkNotNullParameter(onFocusEvent, "onFocusEvent");
        this.f53469Oooo0o = onFocusEvent;
        this.f53471Oooo0oo = new o000OOo<>(new o00oO0o[16]);
        this.f53468Oooo = new o000OOo<>(new o0OO00O[16]);
    }

    public final void OooO00o(@NotNull o0OO00O focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.f53468Oooo.OooO0O0(focusModifier);
        o00oO0o o00oo0o2 = this.f53470Oooo0oO;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO00o(focusModifier);
        }
    }

    public final void OooO0O0(o000OOo<o0OO00O> o000ooo2) {
        o000OOo<o0OO00O> o000ooo3 = this.f53468Oooo;
        o000ooo3.OooO0OO(o000ooo3.f3664Oooo0oo, o000ooo2);
        o00oO0o o00oo0o2 = this.f53470Oooo0oO;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0O0(o000ooo2);
        }
    }

    public final void OooO0OO() {
        FocusStateImpl focusStateImpl;
        Boolean bool;
        o000OOo<o0OO00O> o000ooo2 = this.f53468Oooo;
        int i = o000ooo2.f3664Oooo0oo;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                o0OO00O o0oo00o2 = null;
                Boolean bool2 = null;
                if (i > 0) {
                    o0OO00O[] o0oo00oArr = o000ooo2.f3662Oooo0o;
                    o0OO00O o0oo00o3 = null;
                    do {
                        o0OO00O o0oo00o4 = o0oo00oArr[i2];
                        switch (OooO00o.$EnumSwitchMapping$0[o0oo00o4.f53475Oooo.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                bool2 = Boolean.FALSE;
                                o0oo00o3 = o0oo00o4;
                                break;
                            case 5:
                                if (bool2 == null) {
                                    bool2 = Boolean.TRUE;
                                }
                                break;
                            case 6:
                                bool2 = Boolean.FALSE;
                                break;
                        }
                        i2++;
                    } while (i2 < i);
                    bool = bool2;
                    o0oo00o2 = o0oo00o3;
                } else {
                    bool = null;
                }
                if (o0oo00o2 == null || (focusStateImpl = o0oo00o2.f53475Oooo) == null) {
                    focusStateImpl = Intrinsics.areEqual(bool, Boolean.TRUE) ? FocusStateImpl.Deactivated : FocusStateImpl.Inactive;
                }
            } else {
                focusStateImpl = o000ooo2.f3662Oooo0o[0].f53475Oooo;
            }
        } else {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        this.f53469Oooo0o.invoke(focusStateImpl);
        o00oO0o o00oo0o2 = this.f53470Oooo0oO;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0OO();
        }
    }

    public final void OooO0Oo(@NotNull o0OO00O focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.f53468Oooo.OooOO0O(focusModifier);
        o00oO0o o00oo0o2 = this.f53470Oooo0oO;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0Oo(focusModifier);
        }
    }

    public final void OooO0o0(o000OOo<o0OO00O> o000ooo2) {
        this.f53468Oooo.OooOO0o(o000ooo2);
        o00oO0o o00oo0o2 = this.f53470Oooo0oO;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0o0(o000ooo2);
        }
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        OooOo00<o00oO0o> oooOo00 = o00Oo0.f53465OooO00o;
        o00oO0o o00oo0o2 = (o00oO0o) scope.OooO00o(oooOo00);
        if (!Intrinsics.areEqual(o00oo0o2, this.f53470Oooo0oO)) {
            o00oO0o o00oo0o3 = this.f53470Oooo0oO;
            if (o00oo0o3 != null) {
                o00oo0o3.f53471Oooo0oo.OooOO0O(this);
                o000OOo<o0OO00O> o000ooo2 = this.f53468Oooo;
                o00oo0o3.f53468Oooo.OooOO0o(o000ooo2);
                o00oO0o o00oo0o4 = o00oo0o3.f53470Oooo0oO;
                if (o00oo0o4 != null) {
                    o00oo0o4.OooO0o0(o000ooo2);
                }
            }
            this.f53470Oooo0oO = o00oo0o2;
            if (o00oo0o2 != null) {
                o00oo0o2.f53471Oooo0oo.OooO0O0(this);
                o000OOo<o0OO00O> o000ooo3 = this.f53468Oooo;
                o000OOo<o0OO00O> o000ooo4 = o00oo0o2.f53468Oooo;
                o000ooo4.OooO0OO(o000ooo4.f3664Oooo0oo, o000ooo3);
                o00oO0o o00oo0o5 = o00oo0o2.f53470Oooo0oO;
                if (o00oo0o5 != null) {
                    o00oo0o5.OooO0O0(o000ooo3);
                }
            }
        }
        this.f53470Oooo0oO = (o00oO0o) scope.OooO00o(oooOo00);
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
    public final OooOo00<o00oO0o> getKey() {
        return o00Oo0.f53465OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o00oO0o getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
