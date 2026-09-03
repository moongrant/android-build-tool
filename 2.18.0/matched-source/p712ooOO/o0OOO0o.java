package p712ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OO00O f53507OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f53508OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LayoutDirection f53509OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0OO00O, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f53510Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO00O o0oo00o2) {
            super(1);
            this.f53510Oooo = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(o0OO00O o0oo00o2) {
            o0OO00O destination = o0oo00o2;
            Intrinsics.checkNotNullParameter(destination, "destination");
            if (Intrinsics.areEqual(destination, this.f53510Oooo)) {
                return Boolean.FALSE;
            }
            if (destination.f53493OoooO00 == null) {
                throw new IllegalStateException("Move focus landed at the root.".toString());
            }
            o0000O0.OooO0o(destination);
            return Boolean.TRUE;
        }
    }

    public o0OOO0o() {
        o0OO00O focusModifier = new o0OO00O(FocusStateImpl.Inactive);
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.f53507OooO00o = focusModifier;
        this.f53508OooO0O0 = oo0o0Oo.OooO00o(o00OOOO0.OooO00o.f4215Oooo, focusModifier);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f2  */
    @Override // p712ooOO.o0ooOOo
    public final boolean OooO00o(int i) {
        o0000Ooo o0000ooo;
        boolean zBooleanValue;
        boolean zOooO00o;
        o0OO00O customFocusSearch = o0000O0O.OooO0O0(this.f53507OooO00o);
        if (customFocusSearch == null) {
            return false;
        }
        LayoutDirection layoutDirection = this.f53509OooO0OO;
        if (layoutDirection == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
            layoutDirection = null;
        }
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i2 = 3;
        if (i == 1) {
            o0000ooo = customFocusSearch.f53499OoooOoO.f53457OooO0O0;
        } else {
            if (i == 2) {
                o0000ooo = customFocusSearch.f53499OoooOoO.f53458OooO0OO;
            } else {
                if (i == 5) {
                    o0000ooo = customFocusSearch.f53499OoooOoO.f53459OooO0Oo;
                } else {
                    if (i == 6) {
                        o0000ooo = customFocusSearch.f53499OoooOoO.f53461OooO0o0;
                    } else {
                        if (i == 3) {
                            int i3 = o000000O.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                            if (i3 == 1) {
                                o0000ooo = customFocusSearch.f53499OoooOoO.f53463OooO0oo;
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                o0000ooo = customFocusSearch.f53499OoooOoO.f53455OooO;
                            }
                            o0000Ooo.OooO00o oooO00o = o0000Ooo.f53473OooO0O0;
                            if (Intrinsics.areEqual(o0000ooo, o0000Ooo.f53474OooO0OO)) {
                                o0000ooo = null;
                            }
                            if (o0000ooo == null) {
                                o0000ooo = customFocusSearch.f53499OoooOoO.f53460OooO0o;
                            }
                        } else {
                            if (i == 4) {
                                int i4 = o000000O.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                                if (i4 == 1) {
                                    o0000ooo = customFocusSearch.f53499OoooOoO.f53455OooO;
                                } else {
                                    if (i4 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    o0000ooo = customFocusSearch.f53499OoooOoO.f53463OooO0oo;
                                }
                                o0000Ooo.OooO00o oooO00o2 = o0000Ooo.f53473OooO0O0;
                                if (Intrinsics.areEqual(o0000ooo, o0000Ooo.f53474OooO0OO)) {
                                    o0000ooo = null;
                                }
                                if (o0000ooo == null) {
                                    o0000ooo = customFocusSearch.f53499OoooOoO.f53462OooO0oO;
                                }
                            } else {
                                if (i == 7) {
                                    o0000Ooo.OooO00o oooO00o3 = o0000Ooo.f53473OooO0O0;
                                    o0000ooo = o0000Ooo.f53474OooO0OO;
                                } else {
                                    if (!(i == 8)) {
                                        throw new IllegalStateException("invalid FocusDirection".toString());
                                    }
                                    o0000Ooo.OooO00o oooO00o4 = o0000Ooo.f53473OooO0O0;
                                    o0000ooo = o0000Ooo.f53474OooO0OO;
                                }
                            }
                        }
                    }
                }
            }
        }
        o0000Ooo.OooO00o oooO00o5 = o0000Ooo.f53473OooO0O0;
        if (!Intrinsics.areEqual(o0000ooo, o0000Ooo.f53474OooO0OO)) {
            o0000ooo.OooO00o();
            return true;
        }
        o0OO00O oneDimensionalFocusSearch = this.f53507OooO00o;
        LayoutDirection layoutDirection2 = this.f53509OooO0OO;
        if (layoutDirection2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
            layoutDirection2 = null;
        }
        OooO0O0 onFound = new OooO0O0(customFocusSearch);
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        if ((i == 1) || i == 2) {
            Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
            Intrinsics.checkNotNullParameter(onFound, "onFound");
            if (i == 1) {
                zBooleanValue = o000OO.OooO0O0(oneDimensionalFocusSearch, onFound);
            } else {
                if (!(i == 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                zBooleanValue = o000OO.OooO00o(oneDimensionalFocusSearch, onFound);
            }
        } else {
            if ((((i == 3) || i == 4) || i == 5) || i == 6) {
                zBooleanValue = o0000O.OooO0oo(oneDimensionalFocusSearch, i, onFound);
            } else {
                if (i == 7) {
                    int i5 = o0000O0O.OooO00o.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 4;
                    }
                    o0OO00O o0oo00oOooO0O0 = o0000O0O.OooO0O0(oneDimensionalFocusSearch);
                    if (o0oo00oOooO0O0 != null) {
                        zBooleanValue = o0000O.OooO0oo(o0oo00oOooO0O0, i2, onFound);
                    } else {
                        zBooleanValue = false;
                    }
                } else {
                    if (!(i == 8)) {
                        throw new IllegalStateException("Invalid FocusDirection".toString());
                    }
                    o0OO00O o0oo00oOooO0O1 = o0000O0O.OooO0O0(oneDimensionalFocusSearch);
                    o0OO00O o0oo00oOooO0OO = o0oo00oOooO0O1 != null ? o0000O0O.OooO0OO(o0oo00oOooO0O1) : null;
                    if (Intrinsics.areEqual(o0oo00oOooO0OO, oneDimensionalFocusSearch) || o0oo00oOooO0OO == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = ((Boolean) onFound.invoke(o0oo00oOooO0OO)).booleanValue();
                    }
                }
            }
        }
        if (!zBooleanValue) {
            if (!this.f53507OooO00o.f53494OoooO0O.OooO00o() || this.f53507OooO00o.f53494OoooO0O.OooO0O0()) {
                zOooO00o = false;
            } else {
                if ((i == 1) || i == 2) {
                    OooO0O0(false);
                    if (this.f53507OooO00o.f53494OoooO0O.OooO0O0()) {
                        zOooO00o = OooO00o(i);
                    } else {
                        zOooO00o = false;
                    }
                } else {
                    zOooO00o = false;
                }
            }
            if (!zOooO00o) {
                return false;
            }
        }
        return true;
    }

    @Override // p712ooOO.o0ooOOo
    public final void OooO0O0(boolean z) {
        FocusStateImpl focusStateImpl;
        o0OO00O o0oo00o2 = this.f53507OooO00o;
        FocusStateImpl focusStateImpl2 = o0oo00o2.f53494OoooO0O;
        if (o0000O0.OooO0OO(o0oo00o2, z)) {
            o0OO00O o0oo00o3 = this.f53507OooO00o;
            switch (OooO00o.$EnumSwitchMapping$0[focusStateImpl2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            o0oo00o3.OooO0O0(focusStateImpl);
        }
    }
}
