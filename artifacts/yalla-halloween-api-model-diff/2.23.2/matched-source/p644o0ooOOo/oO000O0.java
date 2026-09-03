package p644o0ooOOo;

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
public class oO000O0 implements o0O0O00.OooO0O0.InterfaceC0442OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final int[] f58079OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f58080OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f58081OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f58082OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f58083OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public MeasureScope f58084OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Density f58085OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f58086OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final int[] f58087OooO0oo;

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

    public static final class OooO0O0 extends Lambda implements Function0<oO0Ooooo> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0Ooooo invoke() {
            Density density = oO000O0.this.f58085OooO0o0;
            if (density != null) {
                return new oO0Ooooo(density);
            }
            Intrinsics.throwUninitializedPropertyAccessException("density");
            throw null;
        }
    }

    public oO000O0() {
        OooO0o oooO0o = new OooO0o(0);
        oooO0o.f4498o0O0O00 = this;
        oooO0o.f4499o0OO00O.f41093OooO0o = this;
        Unit unit = Unit.INSTANCE;
        this.f58080OooO00o = oooO0o;
        this.f58081OooO0O0 = new LinkedHashMap();
        this.f58082OooO0OO = new LinkedHashMap();
        this.f58083OooO0Oo = new LinkedHashMap();
        this.f58086OooO0oO = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new OooO0O0());
        this.f58087OooO0oo = new int[2];
        this.f58079OooO = new int[2];
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

    @Override // o0O0O00.OooO0O0.InterfaceC0442OooO0O0
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
    @Override // o0O0O00.OooO0O0.InterfaceC0442OooO0O0
    public final void OooO0O0(@NotNull ConstraintWidget constraintWidget, @NotNull o0O0O00.OooO0O0.OooO00o measure) {
        Measurable measurable;
        Placeable placeableMo2804measureBRTryo0;
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
        Object obj2 = constraintWidget.f4400Ooooooo;
        if (obj2 instanceof Measurable) {
            LinkedHashMap linkedHashMap = this.f58082OooO0OO;
            Integer[] numArr = (Integer[]) linkedHashMap.get(obj2);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f41101OooO00o;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour, "measure.horizontalBehavior");
            boolean z6 = 1;
            z6 = 1;
            OooO0Oo(dimensionBehaviour, measure.f41103OooO0OO, constraintWidget.f4361OooOo00, measure.f41109OooOO0, ((numArr != null && (num2 = numArr[1]) != null) ? num2.intValue() : 0) == constraintWidget.OooOOOo(), constraintWidget.Oooo000(), Constraints.m3743getMaxWidthimpl(OooO0OO().f58092OooO0oO), this.f58087OooO0oo);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.f41102OooO0O0;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.verticalBehavior");
            OooO0Oo(dimensionBehaviour2, measure.f41104OooO0Oo, constraintWidget.f4360OooOo0, measure.f41109OooOO0, ((numArr != null && (num = numArr[0]) != null) ? num.intValue() : 0) == constraintWidget.OooOo0O(), constraintWidget.Oooo00O(), Constraints.m3742getMaxHeightimpl(OooO0OO().f58092OooO0oO), this.f58079OooO);
            int[] iArr = this.f58087OooO0oo;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int[] iArr2 = this.f58079OooO;
            long jConstraints = ConstraintsKt.Constraints(i2, i3, iArr2[0], iArr2[1]);
            int i4 = measure.f41109OooOO0;
            LinkedHashMap linkedHashMap2 = this.f58081OooO0O0;
            if (i4 == 1 || i4 == 2) {
                measurable = (Measurable) obj2;
                placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(jConstraints);
                linkedHashMap2.put(obj2, placeableMo2804measureBRTryo0);
                constraintWidget.f4347OooO0oO = false;
                Integer numValueOf5 = Integer.valueOf(placeableMo2804measureBRTryo0.getWidth());
                numValueOf = Integer.valueOf(constraintWidget.f4363OooOo0o);
                if (numValueOf.intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    numValueOf = null;
                }
                numValueOf2 = Integer.valueOf(constraintWidget.f4359OooOo);
                if (numValueOf2.intValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) RangesKt___RangesKt.coerceIn(numValueOf5, numValueOf, numValueOf2)).intValue();
                Integer numValueOf6 = Integer.valueOf(placeableMo2804measureBRTryo0.getHeight());
                numValueOf3 = Integer.valueOf(constraintWidget.f4364OooOoO);
                if (numValueOf3.intValue() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    numValueOf3 = null;
                }
                numValueOf4 = Integer.valueOf(constraintWidget.f4366OooOoOO);
                if (numValueOf4.intValue() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    numValueOf4 = null;
                }
                iIntValue2 = ((Number) RangesKt___RangesKt.coerceIn(numValueOf6, numValueOf3, numValueOf4)).intValue();
                if (iIntValue != placeableMo2804measureBRTryo0.getWidth()) {
                    jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m3744getMinHeightimpl(jConstraints), Constraints.m3742getMaxHeightimpl(jConstraints));
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (iIntValue2 != placeableMo2804measureBRTryo0.getHeight()) {
                    jConstraints = ConstraintsKt.Constraints(Constraints.m3745getMinWidthimpl(jConstraints), Constraints.m3743getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                    z5 = true;
                }
                if (z5) {
                    linkedHashMap2.put(obj2, measurable.mo2804measureBRTryo0(jConstraints));
                    constraintWidget.f4347OooO0oO = false;
                }
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.f41101OooO00o;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || constraintWidget.f4361OooOo00 != 0 || measure.f41102OooO0O0 != dimensionBehaviour4 || constraintWidget.f4360OooOo0 != 0) {
                    measurable = (Measurable) obj2;
                    placeableMo2804measureBRTryo0 = measurable.mo2804measureBRTryo0(jConstraints);
                    linkedHashMap2.put(obj2, placeableMo2804measureBRTryo0);
                    constraintWidget.f4347OooO0oO = false;
                    Integer numValueOf7 = Integer.valueOf(placeableMo2804measureBRTryo0.getWidth());
                    numValueOf = Integer.valueOf(constraintWidget.f4363OooOo0o);
                    if (numValueOf.intValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        numValueOf = null;
                    }
                    numValueOf2 = Integer.valueOf(constraintWidget.f4359OooOo);
                    if (numValueOf2.intValue() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        numValueOf2 = null;
                    }
                    iIntValue = ((Number) RangesKt___RangesKt.coerceIn(numValueOf7, numValueOf, numValueOf2)).intValue();
                    Integer numValueOf8 = Integer.valueOf(placeableMo2804measureBRTryo0.getHeight());
                    numValueOf3 = Integer.valueOf(constraintWidget.f4364OooOoO);
                    if (numValueOf3.intValue() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        numValueOf3 = null;
                    }
                    numValueOf4 = Integer.valueOf(constraintWidget.f4366OooOoOO);
                    if (numValueOf4.intValue() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        numValueOf4 = null;
                    }
                    iIntValue2 = ((Number) RangesKt___RangesKt.coerceIn(numValueOf8, numValueOf3, numValueOf4)).intValue();
                    if (iIntValue != placeableMo2804measureBRTryo0.getWidth()) {
                        jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m3744getMinHeightimpl(jConstraints), Constraints.m3742getMaxHeightimpl(jConstraints));
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (iIntValue2 != placeableMo2804measureBRTryo0.getHeight()) {
                        jConstraints = ConstraintsKt.Constraints(Constraints.m3745getMinWidthimpl(jConstraints), Constraints.m3743getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                        z5 = true;
                    }
                    if (z5) {
                        linkedHashMap2.put(obj2, measurable.mo2804measureBRTryo0(jConstraints));
                        constraintWidget.f4347OooO0oO = false;
                    }
                }
            }
            Placeable placeable = (Placeable) linkedHashMap2.get(obj2);
            Integer numValueOf9 = placeable == null ? null : Integer.valueOf(placeable.getWidth());
            measure.f41106OooO0o0 = numValueOf9 == null ? constraintWidget.OooOo0O() : numValueOf9.intValue();
            Integer numValueOf10 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
            measure.f41105OooO0o = numValueOf10 == null ? constraintWidget.OooOOOo() : numValueOf10.intValue();
            if (placeable != null) {
                oO0Ooooo oo0oooooOooO0OO = OooO0OO();
                oo0oooooOooO0OO.getClass();
                Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
                boolean z7 = oo0oooooOooO0OO.f58094OooOO0;
                LinkedHashSet linkedHashSet = oo0oooooOooO0OO.f58095OooOO0O;
                if (z7) {
                    linkedHashSet.clear();
                    Iterator it = oo0oooooOooO0OO.f58090OooO.iterator();
                    while (it.hasNext()) {
                        o0OO00O.OooO00o oooO00o = oo0oooooOooO0OO.f4326OooO00o.get(it.next());
                        ConstraintWidget constraintWidgetOooO00o = oooO00o == null ? null : oooO00o.OooO00o();
                        if (constraintWidgetOooO00o != null) {
                            linkedHashSet.add(constraintWidgetOooO00o);
                        }
                    }
                    oo0oooooOooO0OO.f58094OooOO0 = false;
                }
                if (linkedHashSet.contains(constraintWidget)) {
                    i = placeable.get(AlignmentLineKt.getFirstBaseline());
                } else {
                    i = Integer.MIN_VALUE;
                }
            } else {
                i = Integer.MIN_VALUE;
            }
            measure.f41108OooO0oo = i != Integer.MIN_VALUE;
            measure.f41107OooO0oO = i;
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
            numArr3[c] = Integer.valueOf(measure.f41106OooO0o0);
            numArr3[1] = Integer.valueOf(measure.f41105OooO0o);
            numArr3[2] = Integer.valueOf(measure.f41107OooO0oO);
            if (measure.f41106OooO0o0 == measure.f41103OooO0OO && measure.f41105OooO0o == measure.f41104OooO0Oo) {
                z6 = c;
            }
            measure.f41100OooO = z6;
        }
    }

    @NotNull
    public final oO0Ooooo OooO0OO() {
        return (oO0Ooooo) this.f58086OooO0oO.getValue();
    }
}
