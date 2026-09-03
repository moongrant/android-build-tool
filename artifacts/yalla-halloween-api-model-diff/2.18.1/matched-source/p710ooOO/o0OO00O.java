package p710ooOO;

import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.o00000;
import o000000.o00000O0;
import o000000.oo000o;
import o0O0O00.OooO0o;
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
import p648o0ooOOo.d;
import p650o0ooOoO.h;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends o00O00 implements OooOO0O, OooOOO<o0OO00O>, o00000O0, o000OO {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f53473Ooooo0o = new OooO0O0();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public static final Function1<o0OO00O, Unit> f53474OooooO0 = OooO00o.f53490Oooo0o;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public FocusStateImpl f53475Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o0OO00O f53476Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0OO00O> f53477Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooOOOO f53478OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00oO0o f53479OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o0OO00O f53480OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public d<oo0o0Oo.OooO0OO> f53481OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public o0O0O00.OooO0OO f53482OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final o00000O f53483OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public o0000O00 f53484OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public oo000o f53485OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f53486OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public h f53487OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final o000OOo<h> f53488Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public o00000OO f53489o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<o0OO00O, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f53490Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO00O o0oo00o2) {
            o0OO00O focusModifier = o0oo00o2;
            Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
            FocusPropertiesKt.OooO0O0(focusModifier);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 {
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0OO00O(FocusStateImpl initialFocus) {
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(initialFocus, "initialFocus");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f53477Oooo0oo = new o000OOo<>(new o0OO00O[16]);
        this.f53475Oooo = initialFocus;
        this.f53483OoooOOO = new o00000O();
        this.f53488Ooooo00 = new o000OOo<>(new h[16]);
    }

    public final void OooO0O0(@NotNull FocusStateImpl value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53475Oooo = value;
        o0000O0.OooO(this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        o000OOo<o0OO00O> o000ooo2;
        o000OOo<o0OO00O> o000ooo3;
        oo000o oo000oVar;
        LayoutNode layoutNode;
        o00000 o00000Var;
        o0ooOOo focusManager;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(scope, "<set-?>");
        this.f53478OoooO = scope;
        o0OO00O o0oo00o2 = (o0OO00O) scope.OooO00o(oo0o0Oo.f53497OooO00o);
        if (!Intrinsics.areEqual(o0oo00o2, this.f53476Oooo0oO)) {
            if (o0oo00o2 == null) {
                int i = OooO0OO.$EnumSwitchMapping$0[this.f53475Oooo.ordinal()];
                if ((i == 1 || i == 2) && (oo000oVar = this.f53485OoooOo0) != null && (layoutNode = oo000oVar.f26702OoooO00) != null && (o00000Var = layoutNode.f6143OoooO0O) != null && (focusManager = o00000Var.getFocusManager()) != null) {
                    focusManager.OooO0O0(true);
                }
            }
            o0OO00O o0oo00o3 = this.f53476Oooo0oO;
            if (o0oo00o3 != null && (o000ooo3 = o0oo00o3.f53477Oooo0oo) != null) {
                o000ooo3.OooOO0O(this);
            }
            if (o0oo00o2 != null && (o000ooo2 = o0oo00o2.f53477Oooo0oo) != null) {
                o000ooo2.OooO0O0(this);
            }
        }
        this.f53476Oooo0oO = o0oo00o2;
        o00oO0o o00oo0o2 = (o00oO0o) scope.OooO00o(o00Oo0.f53465OooO00o);
        if (!Intrinsics.areEqual(o00oo0o2, this.f53479OoooO0)) {
            o00oO0o o00oo0o3 = this.f53479OoooO0;
            if (o00oo0o3 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o00oo0o3.f53468Oooo.OooOO0O(this);
                o00oO0o o00oo0o4 = o00oo0o3.f53470Oooo0oO;
                if (o00oo0o4 != null) {
                    o00oo0o4.OooO0Oo(this);
                }
            }
            if (o00oo0o2 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o00oo0o2.f53468Oooo.OooO0O0(this);
                o00oO0o o00oo0o5 = o00oo0o2.f53470Oooo0oO;
                if (o00oo0o5 != null) {
                    o00oo0o5.OooO00o(this);
                }
            }
        }
        this.f53479OoooO0 = o00oo0o2;
        o0000O00 o0000o00 = (o0000O00) scope.OooO00o(FocusRequesterModifierKt.f6003OooO00o);
        if (!Intrinsics.areEqual(o0000o00, this.f53484OoooOOo)) {
            o0000O00 o0000o01 = this.f53484OoooOOo;
            if (o0000o01 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o0000o01.f53456Oooo0oO.OooOO0O(this);
                o0000O00 o0000o02 = o0000o01.f53455Oooo0o;
                if (o0000o02 != null) {
                    o0000o02.OooO0OO(this);
                }
            }
            if (o0000o00 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o0000o00.f53456Oooo0oO.OooO0O0(this);
                o0000O00 o0000o03 = o0000o00.f53455Oooo0o;
                if (o0000o03 != null) {
                    o0000o03.OooO00o(this);
                }
            }
        }
        this.f53484OoooOOo = o0000o00;
        this.f53481OoooO0O = (d) scope.OooO00o(oo0o0Oo.OooO00o.f53356OooO00o);
        this.f53482OoooOO0 = (o0O0O00.OooO0OO) scope.OooO00o(OooO0o.f35235OooO00o);
        this.f53487OoooOoo = (h) scope.OooO00o(KeyInputModifierKt.f6080OooO00o);
        this.f53489o000oOoO = (o00000OO) scope.OooO00o(FocusPropertiesKt.f5999OooO00o);
        FocusPropertiesKt.OooO0O0(this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.o000OO
    public final void Oooo00O(@NotNull Oooo000 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        boolean z = this.f53485OoooOo0 == null;
        this.f53485OoooOo0 = (oo000o) coordinates;
        if (z) {
            FocusPropertiesKt.OooO0O0(this);
        }
        if (this.f53486OoooOoO) {
            this.f53486OoooOoO = false;
            o0000O0.OooO0o(this);
        }
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<o0OO00O> getKey() {
        return oo0o0Oo.f53497OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o0OO00O getValue() {
        return this;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return this.f53476Oooo0oO != null;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
