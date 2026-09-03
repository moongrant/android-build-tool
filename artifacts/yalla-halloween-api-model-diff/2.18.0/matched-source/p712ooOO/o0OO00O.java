package p712ooOO;

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
import o0O0O00.Oooo0;
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
import p650o0ooOOo.c;
import p652o0ooOoO.g;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends o00O00 implements OooOO0O, OooOOO<o0OO00O>, o00000O0, o000OO {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f53489OooooOo = new OooO0O0();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final Function1<o0OO00O, Unit> f53490Oooooo0 = OooO00o.f53506Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public o0OO00O f53491OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0OO00O> f53492OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o0OO00O f53493OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public FocusStateImpl f53494OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public o00oO0o f53495OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooOOOO f53496OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public o0O0O00.OooO0OO f53497OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public o00000OO f53498OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final o00000O f53499OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public o0000O00 f53500OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public oo000o f53501Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f53502Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public g f53503OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final o000OOo<g> f53504OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public c<oo0o0Oo.OooO0OO> f53505o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<o0OO00O, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO00o f53506Oooo = new OooO00o();

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
        Function1<o00O000o, Unit> function1 = o00oOoo.f6585OooO00o;
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6585OooO00o;
        Intrinsics.checkNotNullParameter(initialFocus, "initialFocus");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f53492OoooO0 = new o000OOo<>(new o0OO00O[16]);
        this.f53494OoooO0O = initialFocus;
        this.f53499OoooOoO = new o00000O();
        this.f53504OooooOO = new o000OOo<>(new g[16]);
    }

    public final void OooO0O0(@NotNull FocusStateImpl value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f53494OoooO0O = value;
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
        this.f53496OoooOOO = scope;
        o0OO00O o0oo00o2 = (o0OO00O) scope.OooO00o(oo0o0Oo.f53513OooO00o);
        if (!Intrinsics.areEqual(o0oo00o2, this.f53493OoooO00)) {
            if (o0oo00o2 == null) {
                int i = OooO0OO.$EnumSwitchMapping$0[this.f53494OoooO0O.ordinal()];
                if ((i == 1 || i == 2) && (oo000oVar = this.f53501Ooooo00) != null && (layoutNode = oo000oVar.f26719OoooO) != null && (o00000Var = layoutNode.f6177o000oOoO) != null && (focusManager = o00000Var.getFocusManager()) != null) {
                    focusManager.OooO0O0(true);
                }
            }
            o0OO00O o0oo00o3 = this.f53493OoooO00;
            if (o0oo00o3 != null && (o000ooo3 = o0oo00o3.f53492OoooO0) != null) {
                o000ooo3.OooOO0O(this);
            }
            if (o0oo00o2 != null && (o000ooo2 = o0oo00o2.f53492OoooO0) != null) {
                o000ooo2.OooO0O0(this);
            }
        }
        this.f53493OoooO00 = o0oo00o2;
        o00oO0o o00oo0o2 = (o00oO0o) scope.OooO00o(o00Oo0.f53481OooO00o);
        if (!Intrinsics.areEqual(o00oo0o2, this.f53495OoooOO0)) {
            o00oO0o o00oo0o3 = this.f53495OoooOO0;
            if (o00oo0o3 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o00oo0o3.f53487OoooO0O.OooOO0O(this);
                o00oO0o o00oo0o4 = o00oo0o3.f53486OoooO00;
                if (o00oo0o4 != null) {
                    o00oo0o4.OooO0Oo(this);
                }
            }
            if (o00oo0o2 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o00oo0o2.f53487OoooO0O.OooO0O0(this);
                o00oO0o o00oo0o5 = o00oo0o2.f53486OoooO00;
                if (o00oo0o5 != null) {
                    o00oo0o5.OooO00o(this);
                }
            }
        }
        this.f53495OoooOO0 = o00oo0o2;
        o0000O00 o0000o00 = (o0000O00) scope.OooO00o(FocusRequesterModifierKt.f6018OooO00o);
        if (!Intrinsics.areEqual(o0000o00, this.f53500OoooOoo)) {
            o0000O00 o0000o01 = this.f53500OoooOoo;
            if (o0000o01 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o0000o01.f53472OoooO00.OooOO0O(this);
                o0000O00 o0000o02 = o0000o01.f53471Oooo;
                if (o0000o02 != null) {
                    o0000o02.OooO0OO(this);
                }
            }
            if (o0000o00 != null) {
                Intrinsics.checkNotNullParameter(this, "focusModifier");
                o0000o00.f53472OoooO00.OooO0O0(this);
                o0000O00 o0000o03 = o0000o00.f53471Oooo;
                if (o0000o03 != null) {
                    o0000o03.OooO00o(this);
                }
            }
        }
        this.f53500OoooOoo = o0000o00;
        this.f53505o000oOoO = (c) scope.OooO00o(oo0o0Oo.OooO00o.f53372OooO00o);
        this.f53497OoooOOo = (o0O0O00.OooO0OO) scope.OooO00o(OooO0o.f35256OooO00o);
        this.f53503OooooO0 = (g) scope.OooO00o(KeyInputModifierKt.f6095OooO00o);
        this.f53498OoooOo0 = (o00000OO) scope.OooO00o(FocusPropertiesKt.f6014OooO00o);
        FocusPropertiesKt.OooO0O0(this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.o000OO
    public final void Oooo00O(@NotNull Oooo0 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        boolean z = this.f53501Ooooo00 == null;
        this.f53501Ooooo00 = (oo000o) coordinates;
        if (z) {
            FocusPropertiesKt.OooO0O0(this);
        }
        if (this.f53502Ooooo0o) {
            this.f53502Ooooo0o = false;
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
        return oo0o0Oo.f53513OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o0OO00O getValue() {
        return this;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return this.f53493OoooO00 != null;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
