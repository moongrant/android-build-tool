package o0000OO;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import p056o0000Oo.o00000OO;
import p056o0000Oo.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@PublishedApi
public class o000OOo implements o0000o0.OooOo.OooO0O0, o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final int[] f27395OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final androidx.constraintlayout.core.widgets.OooO0o f27396OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<o0O0O00.o0O0O00, o000O000> f27397OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<o0O0O00.o0O0O00, Integer[]> f27398OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<o0O0O00.o0O0O00, o0000Ooo> f27399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0O0O00.o00000O0 f27400OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0000O0O.OooO f27401OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f27402OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final int[] f27403OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public ArrayList<Object> f27404OooOO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000 invoke() {
            o0000O0O.OooO oooO = o000OOo.this.f27401OooO0o0;
            if (oooO != null) {
                return new o00000(oooO);
            }
            Intrinsics.throwUninitializedPropertyAccessException("density");
            throw null;
        }
    }

    public o000OOo() {
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = new androidx.constraintlayout.core.widgets.OooO0o(0, 0);
        oooO0o.oo000o(this);
        Unit unit = Unit.INSTANCE;
        this.f27396OooO00o = oooO0o;
        this.f27397OooO0O0 = new LinkedHashMap();
        this.f27398OooO0OO = new LinkedHashMap();
        this.f27399OooO0Oo = new LinkedHashMap();
        this.f27402OooO0oO = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OooO0O0());
        this.f27403OooO0oo = new int[2];
        this.f27395OooO = new int[2];
        this.f27404OooOO0 = new ArrayList<>();
    }

    @Override // o0000o0.OooOo.OooO0O0
    public final void OooO00o() {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o0000o0.OooOo.OooO0O0
    public final void OooO0O0(@NotNull ConstraintWidget constraintWidget, @NotNull o0000o0.OooOo.OooO00o measure) {
        o0O0O00.o0O0O00 o0o0o00;
        o000O000 o000o000Oooo000;
        Integer numValueOf;
        boolean z;
        Integer numValueOf2;
        boolean z2;
        int iIntValue;
        Integer numValueOf3;
        boolean z3;
        Integer numValueOf4;
        boolean z4;
        int iIntValue2;
        boolean z5;
        int iOooOo0o;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        Intrinsics.checkNotNullParameter(measure, "measure");
        Object obj = constraintWidget.f6960Ooooooo;
        if (obj instanceof o0O0O00.o0O0O00) {
            Integer[] numArr = this.f27398OooO0OO.get(obj);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f27838OooO00o;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour, "measure.horizontalBehavior");
            OooO0Oo(dimensionBehaviour, measure.f27840OooO0OO, constraintWidget.f6921OooOo00, measure.f27846OooOO0, ((numArr != null && (num2 = numArr[1]) != null) ? num2.intValue() : 0) == constraintWidget.OooOOo(), constraintWidget.Oooo0(), o0000O0O.OooO0O0.OooO0oo(OooO0OO().f27388OooO0oO), this.f27403OooO0oo);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f27839OooO0O0;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.verticalBehavior");
            OooO0Oo(dimensionBehaviour2, measure.f27841OooO0Oo, constraintWidget.f6920OooOo0, measure.f27846OooOO0, ((numArr != null && (num = numArr[0]) != null) ? num.intValue() : 0) == constraintWidget.OooOoO0(), constraintWidget.Oooo0O0(), o0000O0O.OooO0O0.OooO0oO(OooO0OO().f27388OooO0oO), this.f27395OooO);
            int[] iArr = this.f27403OooO0oo;
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = this.f27395OooO;
            long jOooO00o = o0000O0O.OooO0OO.OooO00o(i, i2, iArr2[0], iArr2[1]);
            int i3 = measure.f27846OooOO0;
            if (i3 == 1 || i3 == 2) {
                o0o0o00 = (o0O0O00.o0O0O00) obj;
                o000o000Oooo000 = o0o0o00.Oooo000(jOooO00o);
                this.f27397OooO0O0.put((o0O0O00.o0O0O00) obj, o000o000Oooo000);
                constraintWidget.f6907OooO0oO = false;
                Integer numValueOf5 = Integer.valueOf(o000o000Oooo000.f35265Oooo0o);
                numValueOf = Integer.valueOf(constraintWidget.f6923OooOo0o);
                if (numValueOf.intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    numValueOf = null;
                }
                numValueOf2 = Integer.valueOf(constraintWidget.f6919OooOo);
                if (numValueOf2.intValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) RangesKt.coerceIn(numValueOf5, numValueOf, numValueOf2)).intValue();
                Integer numValueOf6 = Integer.valueOf(o000o000Oooo000.f35266Oooo0oO);
                numValueOf3 = Integer.valueOf(constraintWidget.f6924OooOoO);
                if (numValueOf3.intValue() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    numValueOf3 = null;
                }
                numValueOf4 = Integer.valueOf(constraintWidget.f6926OooOoOO);
                if (numValueOf4.intValue() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    numValueOf4 = null;
                }
                iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf6, numValueOf3, numValueOf4)).intValue();
                if (iIntValue != o000o000Oooo000.f35265Oooo0o) {
                    jOooO00o = o0000O0O.OooO0OO.OooO00o(iIntValue, iIntValue, o0000O0O.OooO0O0.OooO(jOooO00o), o0000O0O.OooO0O0.OooO0oO(jOooO00o));
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (iIntValue2 != o000o000Oooo000.f35266Oooo0oO) {
                    jOooO00o = o0000O0O.OooO0OO.OooO00o(o0000O0O.OooO0O0.OooOO0(jOooO00o), o0000O0O.OooO0O0.OooO0oo(jOooO00o), iIntValue2, iIntValue2);
                    z5 = true;
                }
                if (z5) {
                    this.f27397OooO0O0.put((o0O0O00.o0O0O00) obj, o0o0o00.Oooo000(jOooO00o));
                    constraintWidget.f6907OooO0oO = false;
                }
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.f27838OooO00o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || constraintWidget.f6921OooOo00 != 0 || measure.f27839OooO0O0 != dimensionBehaviour4 || constraintWidget.f6920OooOo0 != 0) {
                    o0o0o00 = (o0O0O00.o0O0O00) obj;
                    o000o000Oooo000 = o0o0o00.Oooo000(jOooO00o);
                    this.f27397OooO0O0.put((o0O0O00.o0O0O00) obj, o000o000Oooo000);
                    constraintWidget.f6907OooO0oO = false;
                    Integer numValueOf7 = Integer.valueOf(o000o000Oooo000.f35265Oooo0o);
                    numValueOf = Integer.valueOf(constraintWidget.f6923OooOo0o);
                    if (numValueOf.intValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        numValueOf = null;
                    }
                    numValueOf2 = Integer.valueOf(constraintWidget.f6919OooOo);
                    if (numValueOf2.intValue() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        numValueOf2 = null;
                    }
                    iIntValue = ((Number) RangesKt.coerceIn(numValueOf7, numValueOf, numValueOf2)).intValue();
                    Integer numValueOf8 = Integer.valueOf(o000o000Oooo000.f35266Oooo0oO);
                    numValueOf3 = Integer.valueOf(constraintWidget.f6924OooOoO);
                    if (numValueOf3.intValue() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        numValueOf3 = null;
                    }
                    numValueOf4 = Integer.valueOf(constraintWidget.f6926OooOoOO);
                    if (numValueOf4.intValue() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        numValueOf4 = null;
                    }
                    iIntValue2 = ((Number) RangesKt.coerceIn(numValueOf8, numValueOf3, numValueOf4)).intValue();
                    if (iIntValue != o000o000Oooo000.f35265Oooo0o) {
                        jOooO00o = o0000O0O.OooO0OO.OooO00o(iIntValue, iIntValue, o0000O0O.OooO0O0.OooO(jOooO00o), o0000O0O.OooO0O0.OooO0oO(jOooO00o));
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iIntValue2 != o000o000Oooo000.f35266Oooo0oO) {
                        jOooO00o = o0000O0O.OooO0OO.OooO00o(o0000O0O.OooO0O0.OooOO0(jOooO00o), o0000O0O.OooO0O0.OooO0oo(jOooO00o), iIntValue2, iIntValue2);
                        z5 = true;
                    }
                    if (z5) {
                        this.f27397OooO0O0.put((o0O0O00.o0O0O00) obj, o0o0o00.Oooo000(jOooO00o));
                        constraintWidget.f6907OooO0oO = false;
                    }
                }
            }
            o000O000 o000o001 = this.f27397OooO0O0.get(obj);
            Integer numValueOf9 = o000o001 == null ? null : Integer.valueOf(o000o001.f35265Oooo0o);
            measure.f27843OooO0o0 = numValueOf9 == null ? constraintWidget.OooOoO0() : numValueOf9.intValue();
            Integer numValueOf10 = o000o001 == null ? null : Integer.valueOf(o000o001.f35266Oooo0oO);
            measure.f27842OooO0o = numValueOf10 == null ? constraintWidget.OooOOo() : numValueOf10.intValue();
            if (o000o001 != null) {
                o00000 o00000VarOooO0OO = OooO0OO();
                Objects.requireNonNull(o00000VarOooO0OO);
                Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
                if (o00000VarOooO0OO.f27390OooOO0) {
                    o00000VarOooO0OO.f27391OooOO0O.clear();
                    Iterator<Object> it = o00000VarOooO0OO.f27386OooO.iterator();
                    while (it.hasNext()) {
                        o00000OO o00000oo2 = o00000VarOooO0OO.f6886OooO00o.get(it.next());
                        ConstraintWidget constraintWidgetOooO0O0 = o00000oo2 == null ? null : o00000oo2.OooO0O0();
                        if (constraintWidgetOooO0O0 != null) {
                            o00000VarOooO0OO.f27391OooOO0O.add(constraintWidgetOooO0O0);
                        }
                    }
                    o00000VarOooO0OO.f27390OooOO0 = false;
                }
                if (o00000VarOooO0OO.f27391OooOO0O.contains(constraintWidget)) {
                    iOooOo0o = o000o001.OooOo0o(o0O0O00.OooO0O0.f35231OooO00o);
                } else {
                    iOooOo0o = Integer.MIN_VALUE;
                }
            } else {
                iOooOo0o = Integer.MIN_VALUE;
            }
            measure.f27845OooO0oo = iOooOo0o != Integer.MIN_VALUE;
            measure.f27844OooO0oO = iOooOo0o;
            Map<o0O0O00.o0O0O00, Integer[]> map = this.f27398OooO0OO;
            Integer[] numArr2 = map.get(obj);
            if (numArr2 == null) {
                numArr2 = new Integer[]{0, 0, Integer.MIN_VALUE};
                map.put((o0O0O00.o0O0O00) obj, numArr2);
            }
            Integer[] numArr3 = numArr2;
            numArr3[0] = Integer.valueOf(measure.f27843OooO0o0);
            numArr3[1] = Integer.valueOf(measure.f27842OooO0o);
            numArr3[2] = Integer.valueOf(measure.f27844OooO0oO);
            measure.f27837OooO = (measure.f27843OooO0o0 == measure.f27840OooO0OO && measure.f27842OooO0o == measure.f27841OooO0Oo) ? false : true;
        }
    }

    @NotNull
    public final o00000 OooO0OO() {
        return (o00000) this.f27402OooO0oO.getValue();
    }

    public final boolean OooO0Oo(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int i5 = OooO00o.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
            return false;
        }
        if (i5 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    iArr[0] = i4;
                    iArr[1] = i4;
                    return false;
                }
                throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
            }
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            if (z3) {
                return false;
            }
        }
        return true;
    }
}
