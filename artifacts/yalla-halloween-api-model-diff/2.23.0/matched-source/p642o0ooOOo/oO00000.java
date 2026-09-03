package p642o0ooOOo;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@PublishedApi
public class oO00000 implements o0O0O00.OooO0O0.InterfaceC0449OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final int[] f59577OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f59578OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59579OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59580OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59581OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public MeasureScope f59582OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Density f59583OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f59584OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final int[] f59585OooO0oo;

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

    public static final class OooO0O0 extends Lambda implements Function0<oO0000O> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0000O invoke() {
            Density density = oO00000.this.f59583OooO0o0;
            if (density != null) {
                return new oO0000O(density);
            }
            Intrinsics.throwUninitializedPropertyAccessException("density");
            throw null;
        }
    }

    public oO00000() {
        OooO0o oooO0o = new OooO0o(0);
        oooO0o.f4492o0O0O00 = this;
        oooO0o.f4493o0OO00O.f41840OooO0o = this;
        Unit unit = Unit.INSTANCE;
        this.f59578OooO00o = oooO0o;
        this.f59579OooO0O0 = new LinkedHashMap();
        this.f59580OooO0OO = new LinkedHashMap();
        this.f59581OooO0Oo = new LinkedHashMap();
        this.f59584OooO0oO = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OooO0O0());
        this.f59585OooO0oo = new int[2];
        this.f59577OooO = new int[2];
        new ArrayList();
    }

    public static void OooO0Oo(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int i5 = OooO00o.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (i5 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (i5 == 3) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (i5 == 4) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
    }

    @Override // o0O0O00.OooO0O0.InterfaceC0449OooO0O0
    public final void OooO00o() {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0O0O00.OooO0O0.InterfaceC0449OooO0O0
    public final void OooO0O0(@NotNull ConstraintWidget constraintWidget, @NotNull o0O0O00.OooO0O0.OooO00o measure) {
        Measurable measurable;
        Placeable placeableMo2794measureBRTryo0;
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
        int i;
        char c;
        Object obj;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        Intrinsics.checkNotNullParameter(measure, "measure");
        Object obj2 = constraintWidget.f4394Ooooooo;
        if (obj2 instanceof Measurable) {
            LinkedHashMap linkedHashMap = this.f59580OooO0OO;
            Integer[] numArr = (Integer[]) linkedHashMap.get(obj2);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f41848OooO00o;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour, "measure.horizontalBehavior");
            boolean z6 = 1;
            z6 = 1;
            OooO0Oo(dimensionBehaviour, measure.f41850OooO0OO, constraintWidget.f4355OooOo00, measure.f41856OooOO0, ((numArr != null && (num2 = numArr[1]) != null) ? num2.intValue() : 0) == constraintWidget.OooOOOo(), constraintWidget.Oooo000(), Constraints.m3733getMaxWidthimpl(OooO0OO().f59590OooO0oO), this.f59585OooO0oo);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f41849OooO0O0;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.verticalBehavior");
            OooO0Oo(dimensionBehaviour2, measure.f41851OooO0Oo, constraintWidget.f4354OooOo0, measure.f41856OooOO0, ((numArr != null && (num = numArr[0]) != null) ? num.intValue() : 0) == constraintWidget.OooOo0O(), constraintWidget.Oooo00O(), Constraints.m3732getMaxHeightimpl(OooO0OO().f59590OooO0oO), this.f59577OooO);
            int[] iArr = this.f59585OooO0oo;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int[] iArr2 = this.f59577OooO;
            long jConstraints = ConstraintsKt.Constraints(i2, i3, iArr2[0], iArr2[1]);
            int i4 = measure.f41856OooOO0;
            LinkedHashMap linkedHashMap2 = this.f59579OooO0O0;
            if (i4 == 1 || i4 == 2) {
                measurable = (Measurable) obj2;
                placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(jConstraints);
                linkedHashMap2.put(obj2, placeableMo2794measureBRTryo0);
                constraintWidget.f4341OooO0oO = false;
                Integer numValueOf5 = Integer.valueOf(placeableMo2794measureBRTryo0.getWidth());
                numValueOf = Integer.valueOf(constraintWidget.f4357OooOo0o);
                if (numValueOf.intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    numValueOf = null;
                }
                numValueOf2 = Integer.valueOf(constraintWidget.f4353OooOo);
                if (numValueOf2.intValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) RangesKt___RangesKt.coerceIn(numValueOf5, numValueOf, numValueOf2)).intValue();
                Integer numValueOf6 = Integer.valueOf(placeableMo2794measureBRTryo0.getHeight());
                numValueOf3 = Integer.valueOf(constraintWidget.f4358OooOoO);
                if (numValueOf3.intValue() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    numValueOf3 = null;
                }
                numValueOf4 = Integer.valueOf(constraintWidget.f4360OooOoOO);
                if (numValueOf4.intValue() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    numValueOf4 = null;
                }
                iIntValue2 = ((Number) RangesKt___RangesKt.coerceIn(numValueOf6, numValueOf3, numValueOf4)).intValue();
                if (iIntValue != placeableMo2794measureBRTryo0.getWidth()) {
                    jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m3734getMinHeightimpl(jConstraints), Constraints.m3732getMaxHeightimpl(jConstraints));
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (iIntValue2 != placeableMo2794measureBRTryo0.getHeight()) {
                    jConstraints = ConstraintsKt.Constraints(Constraints.m3735getMinWidthimpl(jConstraints), Constraints.m3733getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                    z5 = true;
                }
                if (z5) {
                    linkedHashMap2.put(obj2, measurable.mo2794measureBRTryo0(jConstraints));
                    constraintWidget.f4341OooO0oO = false;
                }
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.f41848OooO00o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || constraintWidget.f4355OooOo00 != 0 || measure.f41849OooO0O0 != dimensionBehaviour4 || constraintWidget.f4354OooOo0 != 0) {
                    measurable = (Measurable) obj2;
                    placeableMo2794measureBRTryo0 = measurable.mo2794measureBRTryo0(jConstraints);
                    linkedHashMap2.put(obj2, placeableMo2794measureBRTryo0);
                    constraintWidget.f4341OooO0oO = false;
                    Integer numValueOf7 = Integer.valueOf(placeableMo2794measureBRTryo0.getWidth());
                    numValueOf = Integer.valueOf(constraintWidget.f4357OooOo0o);
                    if (numValueOf.intValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        numValueOf = null;
                    }
                    numValueOf2 = Integer.valueOf(constraintWidget.f4353OooOo);
                    if (numValueOf2.intValue() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        numValueOf2 = null;
                    }
                    iIntValue = ((Number) RangesKt___RangesKt.coerceIn(numValueOf7, numValueOf, numValueOf2)).intValue();
                    Integer numValueOf8 = Integer.valueOf(placeableMo2794measureBRTryo0.getHeight());
                    numValueOf3 = Integer.valueOf(constraintWidget.f4358OooOoO);
                    if (numValueOf3.intValue() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        numValueOf3 = null;
                    }
                    numValueOf4 = Integer.valueOf(constraintWidget.f4360OooOoOO);
                    if (numValueOf4.intValue() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        numValueOf4 = null;
                    }
                    iIntValue2 = ((Number) RangesKt___RangesKt.coerceIn(numValueOf8, numValueOf3, numValueOf4)).intValue();
                    if (iIntValue != placeableMo2794measureBRTryo0.getWidth()) {
                        jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m3734getMinHeightimpl(jConstraints), Constraints.m3732getMaxHeightimpl(jConstraints));
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iIntValue2 != placeableMo2794measureBRTryo0.getHeight()) {
                        jConstraints = ConstraintsKt.Constraints(Constraints.m3735getMinWidthimpl(jConstraints), Constraints.m3733getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                        z5 = true;
                    }
                    if (z5) {
                        linkedHashMap2.put(obj2, measurable.mo2794measureBRTryo0(jConstraints));
                        constraintWidget.f4341OooO0oO = false;
                    }
                }
            }
            Placeable placeable = (Placeable) linkedHashMap2.get(obj2);
            Integer numValueOf9 = placeable == null ? null : Integer.valueOf(placeable.getWidth());
            measure.f41853OooO0o0 = numValueOf9 == null ? constraintWidget.OooOo0O() : numValueOf9.intValue();
            Integer numValueOf10 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
            measure.f41852OooO0o = numValueOf10 == null ? constraintWidget.OooOOOo() : numValueOf10.intValue();
            if (placeable != null) {
                oO0000O oo0000oOooO0OO = OooO0OO();
                oo0000oOooO0OO.getClass();
                Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
                boolean z7 = oo0000oOooO0OO.f59592OooOO0;
                LinkedHashSet linkedHashSet = oo0000oOooO0OO.f59593OooOO0O;
                if (z7) {
                    linkedHashSet.clear();
                    Iterator it = oo0000oOooO0OO.f59588OooO.iterator();
                    while (it.hasNext()) {
                        o0OO00O.OooO00o oooO00o = oo0000oOooO0OO.f4320OooO00o.get(it.next());
                        ConstraintWidget constraintWidgetOooO00o = oooO00o == null ? null : oooO00o.OooO00o();
                        if (constraintWidgetOooO00o != null) {
                            linkedHashSet.add(constraintWidgetOooO00o);
                        }
                    }
                    oo0000oOooO0OO.f59592OooOO0 = false;
                }
                if (linkedHashSet.contains(constraintWidget)) {
                    i = placeable.get(AlignmentLineKt.getFirstBaseline());
                } else {
                    i = Integer.MIN_VALUE;
                }
            } else {
                i = Integer.MIN_VALUE;
            }
            measure.f41855OooO0oo = i != Integer.MIN_VALUE;
            measure.f41854OooO0oO = i;
            Object obj3 = linkedHashMap.get(obj2);
            if (obj3 == null) {
                c = 0;
                Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
                linkedHashMap.put(obj2, numArr2);
                obj = numArr2;
            } else {
                c = 0;
                obj = obj3;
            }
            Integer[] numArr3 = (Integer[]) obj;
            numArr3[c] = Integer.valueOf(measure.f41853OooO0o0);
            numArr3[1] = Integer.valueOf(measure.f41852OooO0o);
            numArr3[2] = Integer.valueOf(measure.f41854OooO0oO);
            if (measure.f41853OooO0o0 == measure.f41850OooO0OO && measure.f41852OooO0o == measure.f41851OooO0Oo) {
                z6 = c;
            }
            measure.f41847OooO = z6;
        }
    }

    @NotNull
    public final oO0000O OooO0OO() {
        return (oO0000O) this.f59584OooO0oO.getValue();
    }
}
