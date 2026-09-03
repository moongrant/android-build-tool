package p027Oooo0o;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o0O0O00.OooO0OO;
import o0O0O00.OooO0o;
import o0O0O00.o000Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements OooOOO<OooO0OO>, OooO0OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o000O00O f1990Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f1991OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o00O0O f1992OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f1993OoooO0O;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 implements OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o00O0O.OooO00o> f1995OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ int f1996OooO0OO;

        public OooO0O0(Ref.ObjectRef<o00O0O.OooO00o> objectRef, int i) {
            this.f1995OooO0O0 = objectRef;
            this.f1996OooO0OO = i;
        }

        @Override // o0O0O00.OooO0OO.OooO00o
        public final boolean OooO00o() {
            return o00Oo0.this.OooO0O0(this.f1995OooO0O0.element, this.f1996OooO0OO);
        }
    }

    public o00Oo0(@NotNull o000O00O state, @NotNull o00O0O beyondBoundsInfo, boolean z, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f1990Oooo = state;
        this.f1992OoooO00 = beyondBoundsInfo;
        this.f1991OoooO0 = z;
        this.f1993OoooO0O = layoutDirection;
    }

    public static final boolean OooO0OO(o00O0O.OooO00o oooO00o, o00Oo0 o00oo1) {
        return oooO00o.f1989OooO0O0 < o00oo1.f1990Oooo.OooO0oO().OooO00o() - 1;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    @Override // o0O0O00.OooO0OO
    @Nullable
    public final <T> T OooO00o(int i, @NotNull Function1<? super OooO0OO.OooO00o, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.f1992OoooO00.OooO00o(this.f1990Oooo.OooO0o0(), ((oo000o) CollectionsKt.last((List) this.f1990Oooo.OooO0oO().OooO0O0())).getIndex());
        T tInvoke = null;
        while (tInvoke == null && OooO0O0((o00O0O.OooO00o) objectRef.element, i)) {
            o00O0O.OooO00o oooO00o = (o00O0O.OooO00o) objectRef.element;
            int i2 = oooO00o.f1988OooO00o;
            int i3 = oooO00o.f1989OooO0O0;
            if (i == 1) {
                i2--;
            } else {
                if (i == 2) {
                    i3++;
                } else {
                    if (!(i == 5)) {
                        if (!(i == 6)) {
                            if (i == 3) {
                                int i4 = OooO00o.$EnumSwitchMapping$0[this.f1993OoooO0O.ordinal()];
                                if (i4 != 1) {
                                    if (i4 == 2) {
                                        if (this.f1991OoooO0) {
                                            i2--;
                                        } else {
                                            i3++;
                                        }
                                    }
                                } else if (this.f1991OoooO0) {
                                    i3++;
                                } else {
                                    i2--;
                                }
                            } else {
                                if (!(i == 4)) {
                                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                                }
                                int i5 = OooO00o.$EnumSwitchMapping$0[this.f1993OoooO0O.ordinal()];
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        if (this.f1991OoooO0) {
                                            i3++;
                                        } else {
                                            i2--;
                                        }
                                    }
                                } else if (this.f1991OoooO0) {
                                    i2--;
                                } else {
                                    i3++;
                                }
                            }
                        } else if (this.f1991OoooO0) {
                            i2--;
                        } else {
                            i3++;
                        }
                    } else if (this.f1991OoooO0) {
                        i3++;
                    } else {
                        i2--;
                    }
                }
            }
            T t = (T) this.f1992OoooO00.OooO00o(i2, i3);
            this.f1992OoooO00.OooO0o0((o00O0O.OooO00o) objectRef.element);
            objectRef.element = t;
            o000Oo0 o000oo0OooO0oo = this.f1990Oooo.OooO0oo();
            if (o000oo0OooO0oo != null) {
                o000oo0OooO0oo.OooO0o0();
            }
            tInvoke = block.invoke(new OooO0O0(objectRef, i));
        }
        this.f1992OoooO00.OooO0o0((o00O0O.OooO00o) objectRef.element);
        o000Oo0 o000oo0OooO0oo2 = this.f1990Oooo.OooO0oo();
        if (o000oo0OooO0oo2 != null) {
            o000oo0OooO0oo2.OooO0o0();
        }
        return tInvoke;
    }

    public final boolean OooO0O0(o00O0O.OooO00o oooO00o, int i) {
        if (!(i == 1)) {
            if (i == 2) {
                return OooO0OO(oooO00o, this);
            }
            if (!(i == 5)) {
                if (!(i == 6)) {
                    if (i == 3) {
                        int i2 = OooO00o.$EnumSwitchMapping$0[this.f1993OoooO0O.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!this.f1991OoooO0) {
                                return OooO0OO(oooO00o, this);
                            }
                            if (oooO00o.f1988OooO00o <= 0) {
                                return false;
                            }
                        } else {
                            if (this.f1991OoooO0) {
                                return OooO0OO(oooO00o, this);
                            }
                            if (oooO00o.f1988OooO00o <= 0) {
                                return false;
                            }
                        }
                    } else {
                        if (!(i == 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int i3 = OooO00o.$EnumSwitchMapping$0[this.f1993OoooO0O.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (this.f1991OoooO0) {
                                return OooO0OO(oooO00o, this);
                            }
                            if (oooO00o.f1988OooO00o <= 0) {
                                return false;
                            }
                        } else {
                            if (!this.f1991OoooO0) {
                                return OooO0OO(oooO00o, this);
                            }
                            if (oooO00o.f1988OooO00o <= 0) {
                                return false;
                            }
                        }
                    }
                } else {
                    if (!this.f1991OoooO0) {
                        return OooO0OO(oooO00o, this);
                    }
                    if (oooO00o.f1988OooO00o <= 0) {
                        return false;
                    }
                }
            } else {
                if (this.f1991OoooO0) {
                    return OooO0OO(oooO00o, this);
                }
                if (oooO00o.f1988OooO00o <= 0) {
                    return false;
                }
            }
        } else if (oooO00o.f1988OooO00o <= 0) {
            return false;
        }
        return true;
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

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<OooO0OO> getKey() {
        return OooO0o.f35256OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final OooO0OO getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
