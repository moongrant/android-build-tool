package p642o0ooOOo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.LayoutInfoFlags;
import androidx.constraintlayout.core.OooO0OO;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooOO0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.ZegoConstants;
import io.agora.rtc.video.VideoCapture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO00O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p039OoooOoo.o00OO;
import p340o0OOO0o.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o implements MeasurePolicy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO00000 f59544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OOOO00 f59545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f59546OooO0OO = 257;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f59547OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oO00000 f59548OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<Measurable> f59549OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(oO00000 oo00000, List<? extends Measurable> list) {
            super(1);
            this.f59548OooO0Oo = oo00000;
            this.f59549OooO0o0 = list;
        }

        /* JADX WARN: Code duplicated, block: B:111:0x0374  */
        /* JADX WARN: Code duplicated, block: B:114:0x0387  */
        /* JADX WARN: Code duplicated, block: B:134:0x01b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x022a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:137:0x026d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:138:0x01b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x0196 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0196 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x03a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x03b3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:151:0x03bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x03cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x03d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:0x0381 A[DONT_GENERATE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x0152  */
        /* JADX WARN: Code duplicated, block: B:62:0x019e  */
        /* JADX WARN: Code duplicated, block: B:68:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:69:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:73:0x022f  */
        /* JADX WARN: Code duplicated, block: B:75:0x0238  */
        /* JADX WARN: Code duplicated, block: B:77:0x0243  */
        /* JADX WARN: Code duplicated, block: B:78:0x0246  */
        /* JADX WARN: Code duplicated, block: B:80:0x0249  */
        /* JADX WARN: Code duplicated, block: B:81:0x024b  */
        /* JADX WARN: Code duplicated, block: B:83:0x0251  */
        /* JADX WARN: Code duplicated, block: B:84:0x0253  */
        /* JADX WARN: Code duplicated, block: B:97:0x030c  */
        /* JADX WARN: Code duplicated, block: B:99:0x0314  */
        /* JADX WARN: Instruction removed from duplicated block: B:59:0x0152, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:97:0x030c, please report this as an issue */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            StringBuilder sbOooO00o;
            Object obj;
            OooOO0 oooOO1;
            OooO0O0 oooO0O0;
            OooO0O0 oooO0O1;
            ConstraintWidget constraintWidget;
            HashMap<String, OooO0o> map;
            OooO0o oooO0o;
            int i;
            ConstraintAnchor constraintAnchorOooOOO;
            ConstraintWidget constraintWidget2;
            Measurable measurable;
            Object layoutId;
            String string;
            Object parentData;
            o0OOO0 o0ooo1;
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            oO00000 oo00000 = this.f59548OooO0Oo;
            oo00000.getClass();
            Intrinsics.checkNotNullParameter(layout, "<this>");
            List<Measurable> measurables = this.f59549OooO0o0;
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            LinkedHashMap linkedHashMap = oo00000.f59581OooO0Oo;
            boolean zIsEmpty = linkedHashMap.isEmpty();
            androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = oo00000.f59578OooO00o;
            if (zIsEmpty) {
                for (ConstraintWidget constraintWidget3 : oooO0o2.f60905o0OOO0o) {
                    Object obj2 = constraintWidget3.f4394Ooooooo;
                    if (obj2 instanceof Measurable) {
                        OooO0O0 oooO0O2 = constraintWidget3.f4344OooOO0O;
                        ConstraintWidget constraintWidget4 = oooO0O2.f43001OooO00o;
                        if (constraintWidget4 != null) {
                            oooO0O2.f43002OooO0O0 = constraintWidget4.OooOo0o();
                            oooO0O2.f43003OooO0OO = constraintWidget4.OooOo();
                            oooO0O2.f43004OooO0Oo = constraintWidget4.OooOo0o() + constraintWidget4.f4383OoooOo0;
                            oooO0O2.f43006OooO0o0 = constraintWidget4.OooOo() + constraintWidget4.f4384OoooOoO;
                            oooO0O2.OooO0OO(constraintWidget4.f4344OooOO0O);
                        }
                        linkedHashMap.put(obj2, new OooO0O0(oooO0O2));
                    }
                }
            }
            int size = measurables.size() - 1;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Measurable measurable2 = measurables.get(i2);
                    OooO0O0 oooO0O3 = (OooO0O0) linkedHashMap.get(measurable2);
                    if (oooO0O3 != null) {
                        boolean z = Float.isNaN(oooO0O3.f43008OooO0oo) && Float.isNaN(oooO0O3.f43000OooO) && Float.isNaN(oooO0O3.f43009OooOO0) && Float.isNaN(oooO0O3.f43010OooOO0O) && Float.isNaN(oooO0O3.f43011OooOO0o) && Float.isNaN(oooO0O3.f43013OooOOO0) && Float.isNaN(oooO0O3.f43012OooOOO) && Float.isNaN(oooO0O3.f43014OooOOOO) && Float.isNaN(oooO0O3.f43015OooOOOo);
                        LinkedHashMap linkedHashMap2 = oo00000.f59579OooO0O0;
                        if (z) {
                            OooO0O0 oooO0O4 = (OooO0O0) linkedHashMap.get(measurable2);
                            Intrinsics.checkNotNull(oooO0O4);
                            int i4 = oooO0O4.f43002OooO0O0;
                            OooO0O0 oooO0O5 = (OooO0O0) linkedHashMap.get(measurable2);
                            Intrinsics.checkNotNull(oooO0O5);
                            int i5 = oooO0O5.f43003OooO0OO;
                            Placeable placeable = (Placeable) linkedHashMap2.get(measurable2);
                            if (placeable != null) {
                                Placeable.PlacementScope.m2838place70tqf50$default(layout, placeable, IntOffsetKt.IntOffset(i4, i5), 0.0f, 2, null);
                            }
                        } else {
                            oO00000o oo00000o = new oO00000o(oooO0O3);
                            OooO0O0 oooO0O6 = (OooO0O0) linkedHashMap.get(measurable2);
                            Intrinsics.checkNotNull(oooO0O6);
                            int i6 = oooO0O6.f43002OooO0O0;
                            OooO0O0 oooO0O7 = (OooO0O0) linkedHashMap.get(measurable2);
                            Intrinsics.checkNotNull(oooO0O7);
                            int i7 = oooO0O7.f43003OooO0OO;
                            float f = Float.isNaN(oooO0O3.f43013OooOOO0) ? 0.0f : oooO0O3.f43013OooOOO0;
                            Placeable placeable2 = (Placeable) linkedHashMap2.get(measurable2);
                            if (placeable2 != null) {
                                layout.placeWithLayer(placeable2, i6, i7, f, oo00000o);
                            }
                        }
                        if (i3 > size) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                if (LayoutInfoFlags.BOUNDS == null) {
                    sbOooO00o = o00OO.OooO00o("{   root: {interpolated: { left:  0,  top:  0,");
                    sbOooO00o.append("  right:   " + oooO0o2.OooOo0O() + " ,");
                    sbOooO00o.append("  bottom:  " + oooO0o2.OooOOOo() + " ,");
                    sbOooO00o.append(" } }");
                    for (ConstraintWidget constraintWidget5 : oooO0o2.f60905o0OOO0o) {
                        obj = constraintWidget5.f4394Ooooooo;
                        if (!(obj instanceof Measurable)) {
                            oooO0O0 = null;
                            if (constraintWidget5.f4345OooOO0o == null) {
                                measurable = (Measurable) obj;
                                layoutId = LayoutIdKt.getLayoutId(measurable);
                                if (layoutId == null) {
                                    Intrinsics.checkNotNullParameter(measurable, "<this>");
                                    parentData = measurable.getParentData();
                                    if (parentData instanceof o0OOO0) {
                                        o0ooo1 = (o0OOO0) parentData;
                                    } else {
                                        o0ooo1 = null;
                                    }
                                    if (o0ooo1 == null) {
                                        layoutId = null;
                                    } else {
                                        layoutId = o0ooo1.OooO00o();
                                    }
                                }
                                if (layoutId == null) {
                                    string = null;
                                } else {
                                    string = layoutId.toString();
                                }
                                constraintWidget5.f4345OooOO0o = string;
                            }
                            oooO0O1 = (OooO0O0) linkedHashMap.get(obj);
                            if (oooO0O1 != null && (constraintWidget2 = oooO0O1.f43001OooO00o) != null) {
                                oooO0O0 = constraintWidget2.f4344OooOO0O;
                            }
                            if (oooO0O0 == null) {
                                sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) constraintWidget5.f4345OooOO0o) + ": {");
                                sbOooO00o.append(" interpolated : ");
                                sbOooO00o.append("{\n");
                                OooO0O0.OooO0O0(sbOooO00o, ViewHierarchyConstants.DIMENSION_LEFT_KEY, oooO0O0.f43002OooO0O0);
                                OooO0O0.OooO0O0(sbOooO00o, ViewHierarchyConstants.DIMENSION_TOP_KEY, oooO0O0.f43003OooO0OO);
                                OooO0O0.OooO0O0(sbOooO00o, "right", oooO0O0.f43004OooO0Oo);
                                OooO0O0.OooO0O0(sbOooO00o, "bottom", oooO0O0.f43006OooO0o0);
                                OooO0O0.OooO00o(sbOooO00o, "pivotX", oooO0O0.f43005OooO0o);
                                OooO0O0.OooO00o(sbOooO00o, "pivotY", oooO0O0.f43007OooO0oO);
                                OooO0O0.OooO00o(sbOooO00o, "rotationX", oooO0O0.f43008OooO0oo);
                                OooO0O0.OooO00o(sbOooO00o, "rotationY", oooO0O0.f43000OooO);
                                OooO0O0.OooO00o(sbOooO00o, "rotationZ", oooO0O0.f43009OooOO0);
                                OooO0O0.OooO00o(sbOooO00o, "translationX", oooO0O0.f43010OooOO0O);
                                OooO0O0.OooO00o(sbOooO00o, "translationY", oooO0O0.f43011OooOO0o);
                                OooO0O0.OooO00o(sbOooO00o, "translationZ", oooO0O0.f43013OooOOO0);
                                OooO0O0.OooO00o(sbOooO00o, "scaleX", oooO0O0.f43012OooOOO);
                                OooO0O0.OooO00o(sbOooO00o, "scaleY", oooO0O0.f43014OooOOOO);
                                OooO0O0.OooO00o(sbOooO00o, "alpha", oooO0O0.f43015OooOOOo);
                                OooO0O0.OooO0O0(sbOooO00o, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, oooO0O0.f43016OooOOo);
                                OooO0O0.OooO00o(sbOooO00o, "interpolatedPos", oooO0O0.f43017OooOOo0);
                                constraintWidget = oooO0O0.f43001OooO00o;
                                if (constraintWidget != null) {
                                    for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                                        constraintAnchorOooOOO = constraintWidget.OooOOO(type);
                                        if (constraintAnchorOooOOO == null && constraintAnchorOooOOO.f4329OooO0o != null) {
                                            sbOooO00o.append("Anchor");
                                            sbOooO00o.append(type.name());
                                            sbOooO00o.append(": ['");
                                            String str = constraintAnchorOooOOO.f4329OooO0o.f4328OooO0Oo.f4345OooOO0o;
                                            if (str == null) {
                                                str = "#PARENT";
                                            }
                                            sbOooO00o.append(str);
                                            sbOooO00o.append("', '");
                                            sbOooO00o.append(constraintAnchorOooOOO.f4329OooO0o.f4330OooO0o0.name());
                                            sbOooO00o.append("', '");
                                            sbOooO00o.append(constraintAnchorOooOOO.f4331OooO0oO);
                                            sbOooO00o.append("'],\n");
                                        }
                                    }
                                }
                                OooO0O0.OooO00o(sbOooO00o, "phone_orientation", Float.NaN);
                                OooO0O0.OooO00o(sbOooO00o, "phone_orientation", Float.NaN);
                                map = oooO0O0.f43018OooOOoo;
                                if (map.size() != 0) {
                                    sbOooO00o.append("custom : {\n");
                                    for (String str2 : map.keySet()) {
                                        oooO0o = map.get(str2);
                                        sbOooO00o.append(str2);
                                        sbOooO00o.append(": ");
                                        switch (oooO0o.f43603OooO0O0) {
                                            case 900:
                                                sbOooO00o.append(oooO0o.f43604OooO0OO);
                                                sbOooO00o.append(",\n");
                                                break;
                                            case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                                            case 905:
                                                sbOooO00o.append(oooO0o.f43605OooO0Oo);
                                                sbOooO00o.append(",\n");
                                                break;
                                            case 902:
                                                sbOooO00o.append("'");
                                                sbOooO00o.append(OooO0o.OooO00o(oooO0o.f43604OooO0OO));
                                                sbOooO00o.append("',\n");
                                                break;
                                            case 903:
                                                sbOooO00o.append("'");
                                                sbOooO00o.append(oooO0o.f43607OooO0o0);
                                                sbOooO00o.append("',\n");
                                                break;
                                            case 904:
                                                sbOooO00o.append("'");
                                                sbOooO00o.append(oooO0o.f43606OooO0o);
                                                sbOooO00o.append("',\n");
                                                break;
                                        }
                                    }
                                    sbOooO00o.append("}\n");
                                }
                                sbOooO00o.append("}\n");
                                sbOooO00o.append("}, ");
                            }
                        } else if (constraintWidget5 instanceof OooOO0) {
                            sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) constraintWidget5.f4345OooOO0o) + ": {");
                            oooOO1 = (OooOO0) constraintWidget5;
                            if (oooOO1.f4497o0O0O00 == 0) {
                                sbOooO00o.append(" type: 'hGuideline', ");
                            } else {
                                sbOooO00o.append(" type: 'vGuideline', ");
                            }
                            sbOooO00o.append(" interpolated: ");
                            sbOooO00o.append(" { left: " + oooOO1.OooOo0o() + ", top: " + oooOO1.OooOo() + ", right: " + (oooOO1.OooOo0O() + oooOO1.OooOo0o()) + ", bottom: " + (oooOO1.OooOOOo() + oooOO1.OooOo()) + " }");
                            sbOooO00o.append("}, ");
                        }
                    }
                    sbOooO00o.append(" }");
                    Intrinsics.checkNotNullExpressionValue(sbOooO00o.toString(), "json.toString()");
                }
            } else if (LayoutInfoFlags.BOUNDS == null) {
                sbOooO00o = o00OO.OooO00o("{   root: {interpolated: { left:  0,  top:  0,");
                sbOooO00o.append("  right:   " + oooO0o2.OooOo0O() + " ,");
                sbOooO00o.append("  bottom:  " + oooO0o2.OooOOOo() + " ,");
                sbOooO00o.append(" } }");
                while (r2.hasNext()) {
                    obj = constraintWidget5.f4394Ooooooo;
                    if (!(obj instanceof Measurable)) {
                        oooO0O0 = null;
                        if (constraintWidget5.f4345OooOO0o == null) {
                            measurable = (Measurable) obj;
                            layoutId = LayoutIdKt.getLayoutId(measurable);
                            if (layoutId == null) {
                                Intrinsics.checkNotNullParameter(measurable, "<this>");
                                parentData = measurable.getParentData();
                                if (parentData instanceof o0OOO0) {
                                    o0ooo1 = (o0OOO0) parentData;
                                } else {
                                    o0ooo1 = null;
                                }
                                if (o0ooo1 == null) {
                                    layoutId = null;
                                } else {
                                    layoutId = o0ooo1.OooO00o();
                                }
                            }
                            if (layoutId == null) {
                                string = null;
                            } else {
                                string = layoutId.toString();
                            }
                            constraintWidget5.f4345OooOO0o = string;
                        }
                        oooO0O1 = (OooO0O0) linkedHashMap.get(obj);
                        if (oooO0O1 != null) {
                            oooO0O0 = constraintWidget2.f4344OooOO0O;
                        }
                        if (oooO0O0 == null) {
                            sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) constraintWidget5.f4345OooOO0o) + ": {");
                            sbOooO00o.append(" interpolated : ");
                            sbOooO00o.append("{\n");
                            OooO0O0.OooO0O0(sbOooO00o, ViewHierarchyConstants.DIMENSION_LEFT_KEY, oooO0O0.f43002OooO0O0);
                            OooO0O0.OooO0O0(sbOooO00o, ViewHierarchyConstants.DIMENSION_TOP_KEY, oooO0O0.f43003OooO0OO);
                            OooO0O0.OooO0O0(sbOooO00o, "right", oooO0O0.f43004OooO0Oo);
                            OooO0O0.OooO0O0(sbOooO00o, "bottom", oooO0O0.f43006OooO0o0);
                            OooO0O0.OooO00o(sbOooO00o, "pivotX", oooO0O0.f43005OooO0o);
                            OooO0O0.OooO00o(sbOooO00o, "pivotY", oooO0O0.f43007OooO0oO);
                            OooO0O0.OooO00o(sbOooO00o, "rotationX", oooO0O0.f43008OooO0oo);
                            OooO0O0.OooO00o(sbOooO00o, "rotationY", oooO0O0.f43000OooO);
                            OooO0O0.OooO00o(sbOooO00o, "rotationZ", oooO0O0.f43009OooOO0);
                            OooO0O0.OooO00o(sbOooO00o, "translationX", oooO0O0.f43010OooOO0O);
                            OooO0O0.OooO00o(sbOooO00o, "translationY", oooO0O0.f43011OooOO0o);
                            OooO0O0.OooO00o(sbOooO00o, "translationZ", oooO0O0.f43013OooOOO0);
                            OooO0O0.OooO00o(sbOooO00o, "scaleX", oooO0O0.f43012OooOOO);
                            OooO0O0.OooO00o(sbOooO00o, "scaleY", oooO0O0.f43014OooOOOO);
                            OooO0O0.OooO00o(sbOooO00o, "alpha", oooO0O0.f43015OooOOOo);
                            OooO0O0.OooO0O0(sbOooO00o, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, oooO0O0.f43016OooOOo);
                            OooO0O0.OooO00o(sbOooO00o, "interpolatedPos", oooO0O0.f43017OooOOo0);
                            constraintWidget = oooO0O0.f43001OooO00o;
                            if (constraintWidget != null) {
                                while (i < r5) {
                                    constraintAnchorOooOOO = constraintWidget.OooOOO(type);
                                    if (constraintAnchorOooOOO == null) {
                                    }
                                }
                            }
                            OooO0O0.OooO00o(sbOooO00o, "phone_orientation", Float.NaN);
                            OooO0O0.OooO00o(sbOooO00o, "phone_orientation", Float.NaN);
                            map = oooO0O0.f43018OooOOoo;
                            if (map.size() != 0) {
                                sbOooO00o.append("custom : {\n");
                                while (r4.hasNext()) {
                                    oooO0o = map.get(str2);
                                    sbOooO00o.append(str2);
                                    sbOooO00o.append(": ");
                                    switch (oooO0o.f43603OooO0O0) {
                                        case 900:
                                            sbOooO00o.append(oooO0o.f43604OooO0OO);
                                            sbOooO00o.append(",\n");
                                            break;
                                        case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                                        case 905:
                                            sbOooO00o.append(oooO0o.f43605OooO0Oo);
                                            sbOooO00o.append(",\n");
                                            break;
                                        case 902:
                                            sbOooO00o.append("'");
                                            sbOooO00o.append(OooO0o.OooO00o(oooO0o.f43604OooO0OO));
                                            sbOooO00o.append("',\n");
                                            break;
                                        case 903:
                                            sbOooO00o.append("'");
                                            sbOooO00o.append(oooO0o.f43607OooO0o0);
                                            sbOooO00o.append("',\n");
                                            break;
                                        case 904:
                                            sbOooO00o.append("'");
                                            sbOooO00o.append(oooO0o.f43606OooO0o);
                                            sbOooO00o.append("',\n");
                                            break;
                                    }
                                }
                                sbOooO00o.append("}\n");
                            }
                            sbOooO00o.append("}\n");
                            sbOooO00o.append("}, ");
                        }
                    } else if (constraintWidget5 instanceof OooOO0) {
                        sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) constraintWidget5.f4345OooOO0o) + ": {");
                        oooOO1 = (OooOO0) constraintWidget5;
                        if (oooOO1.f4497o0O0O00 == 0) {
                            sbOooO00o.append(" type: 'hGuideline', ");
                        } else {
                            sbOooO00o.append(" type: 'vGuideline', ");
                        }
                        sbOooO00o.append(" interpolated: ");
                        sbOooO00o.append(" { left: " + oooOO1.OooOo0o() + ", top: " + oooOO1.OooOo() + ", right: " + (oooOO1.OooOo0O() + oooOO1.OooOo0o()) + ", bottom: " + (oooOO1.OooOOOo() + oooOO1.OooOo()) + " }");
                        sbOooO00o.append("}, ");
                    }
                }
                sbOooO00o.append(" }");
                Intrinsics.checkNotNullExpressionValue(sbOooO00o.toString(), "json.toString()");
            }
            return Unit.INSTANCE;
        }
    }

    public o0OO0o(oO00000 oo00000, o0OOOO00 o0oooo01, MutableState mutableState) {
        this.f59544OooO00o = oo00000;
        this.f59545OooO0O0 = o0oooo01;
        this.f59547OooO0Oo = mutableState;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> measurables, long j) {
        Dimension dimension;
        Dimension dimension2;
        ConstraintWidget constraintWidgetOooO00o;
        Intrinsics.checkNotNullParameter(measureScope, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        oO00000 oo00000 = this.f59544OooO00o;
        oo00000.getClass();
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        o0OOOO00 constraintSet = this.f59545OooO0O0;
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measureScope, "<set-?>");
        oo00000.f59583OooO0o0 = measureScope;
        Intrinsics.checkNotNullParameter(measureScope, "<set-?>");
        oo00000.f59582OooO0o = measureScope;
        oO0000O oo0000oOooO0OO = oo00000.OooO0OO();
        if (Constraints.m3731getHasFixedWidthimpl(j)) {
            int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(j);
            dimension = new Dimension(Dimension.f4269OooO0oO);
            dimension.f4278OooO0o0 = null;
            dimension.f4276OooO0Oo = iM3733getMaxWidthimpl;
        } else {
            dimension = new Dimension(Dimension.f4270OooO0oo);
            int iM3735getMinWidthimpl = Constraints.m3735getMinWidthimpl(j);
            if (iM3735getMinWidthimpl >= 0) {
                dimension.f4273OooO00o = iM3735getMinWidthimpl;
            }
        }
        oo0000oOooO0OO.f4323OooO0Oo.f4313Oooo00o = dimension;
        oO0000O oo0000oOooO0OO2 = oo00000.OooO0OO();
        if (Constraints.m3730getHasFixedHeightimpl(j)) {
            int iM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(j);
            dimension2 = new Dimension(Dimension.f4269OooO0oO);
            dimension2.f4278OooO0o0 = null;
            dimension2.f4276OooO0Oo = iM3732getMaxHeightimpl;
        } else {
            dimension2 = new Dimension(Dimension.f4270OooO0oo);
            int iM3734getMinHeightimpl = Constraints.m3734getMinHeightimpl(j);
            if (iM3734getMinHeightimpl >= 0) {
                dimension2.f4273OooO00o = iM3734getMinHeightimpl;
            }
        }
        oo0000oOooO0OO2.f4323OooO0Oo.f4310Oooo0 = dimension2;
        oo00000.OooO0OO().f59590OooO0oO = j;
        oO0000O oo0000oOooO0OO3 = oo00000.OooO0OO();
        oo0000oOooO0OO3.getClass();
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        oo0000oOooO0OO3.f59591OooO0oo = layoutDirection;
        LinkedHashMap linkedHashMap = oo00000.f59579OooO0O0;
        linkedHashMap.clear();
        oo00000.f59580OooO0OO.clear();
        oo00000.f59581OooO0Oo.clear();
        boolean zOooO0O0 = constraintSet.OooO0O0(measurables);
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = oo00000.f59578OooO00o;
        if (zOooO0O0) {
            oO0000O oo0000oOooO0OO4 = oo00000.OooO0OO();
            HashMap<Object, o0OO00O.OooO00o> mReferences = oo0000oOooO0OO4.f4320OooO00o;
            Intrinsics.checkNotNullExpressionValue(mReferences, "mReferences");
            Iterator<Map.Entry<Object, o0OO00O.OooO00o>> it = mReferences.entrySet().iterator();
            while (it.hasNext()) {
                o0OO00O.OooO00o value = it.next().getValue();
                if (value != null && (constraintWidgetOooO00o = value.OooO00o()) != null) {
                    constraintWidgetOooO00o.Oooo00o();
                }
            }
            mReferences.clear();
            Intrinsics.checkNotNullExpressionValue(mReferences, "mReferences");
            mReferences.put(State.f4319OooO0o0, oo0000oOooO0OO4.f4323OooO0Oo);
            oo0000oOooO0OO4.f59588OooO.clear();
            oo0000oOooO0OO4.f59592OooOO0 = true;
            oo0000oOooO0OO4.f4321OooO0O0.clear();
            oo0000oOooO0OO4.f4322OooO0OO.clear();
            constraintSet.OooO00o(oo00000.OooO0OO(), measurables);
            o0OO.OooO00o(oo00000.OooO0OO(), measurables);
            oO0000O oo0000oOooO0OO5 = oo00000.OooO0OO();
            oo0000oOooO0OO5.getClass();
            oooO0o.f60905o0OOO0o.clear();
            androidx.constraintlayout.core.state.OooO00o oooO00o = oo0000oOooO0OO5.f4323OooO0Oo;
            oooO00o.f4313Oooo00o.OooO0O0(oooO0o, 0);
            oooO00o.f4310Oooo0.OooO0O0(oooO0o, 1);
            HashMap<Object, androidx.constraintlayout.core.state.OooO0O0> map = oo0000oOooO0OO5.f4321OooO0O0;
            Iterator<Object> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).getClass();
            }
            HashMap<Object, o0OO00O.OooO00o> map2 = oo0000oOooO0OO5.f4320OooO00o;
            Iterator<Object> it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                o0OO00O.OooO00o oooO00o2 = map2.get(it3.next());
                if (oooO00o2 != oooO00o) {
                    oooO00o2.OooO0Oo();
                }
            }
            Iterator<Object> it4 = map2.keySet().iterator();
            while (it4.hasNext()) {
                o0OO00O.OooO00o oooO00o3 = map2.get(it4.next());
                if (oooO00o3 != oooO00o) {
                    ConstraintWidget constraintWidgetOooO00o2 = oooO00o3.OooO00o();
                    constraintWidgetOooO00o2.f4396o00O0O = oooO00o3.getKey().toString();
                    constraintWidgetOooO00o2.f4382OoooOOo = null;
                    oooO00o3.OooO0Oo();
                    oooO0o.OooO00o(constraintWidgetOooO00o2);
                } else {
                    oooO00o3.OooO0OO(oooO0o);
                }
            }
            Iterator<Object> it5 = map.keySet().iterator();
            while (it5.hasNext()) {
                map.get(it5.next()).getClass();
            }
            Iterator<Object> it6 = map2.keySet().iterator();
            while (it6.hasNext()) {
                o0OO00O.OooO00o oooO00o4 = map2.get(it6.next());
                if (oooO00o4 != oooO00o) {
                    oooO00o4.OooO0Oo();
                }
            }
            for (Object obj : map2.keySet()) {
                o0OO00O.OooO00o oooO00o5 = map2.get(obj);
                oooO00o5.OooO0O0();
                ConstraintWidget constraintWidgetOooO00o3 = oooO00o5.OooO00o();
                if (constraintWidgetOooO00o3 != null && obj != null) {
                    constraintWidgetOooO00o3.f4345OooOO0o = obj.toString();
                }
            }
        } else {
            o0OO.OooO00o(oo00000.OooO0OO(), measurables);
        }
        oooO0o.o000oOoO(Constraints.m3733getMaxWidthimpl(j));
        oooO0o.OoooO00(Constraints.m3732getMaxHeightimpl(j));
        oooO0o.f4494o0Oo0oo.OooO0OO(oooO0o);
        oooO0o.f4483o00000Oo = this.f59546OooO0OO;
        OooO0OO.f4233OooOOOo = oooO0o.OooooOO(ConstantsKt.MINIMUM_BLOCK_SIZE);
        oooO0o.Ooooo0o(oooO0o.f4483o00000Oo, 0, 0, 0, 0, 0, 0);
        for (ConstraintWidget constraintWidget : oooO0o.f60905o0OOO0o) {
            Object obj2 = constraintWidget.f4394Ooooooo;
            if (obj2 instanceof Measurable) {
                Placeable placeable = (Placeable) linkedHashMap.get(obj2);
                Integer numValueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                Integer numValueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                int iOooOo0O = constraintWidget.OooOo0O();
                if (numValueOf != null && iOooOo0O == numValueOf.intValue()) {
                    int iOooOOOo = constraintWidget.OooOOOo();
                    if (numValueOf2 != null && iOooOOOo == numValueOf2.intValue()) {
                    }
                }
                linkedHashMap.put(obj2, ((Measurable) obj2).mo2794measureBRTryo0(Constraints.INSTANCE.m3741fixedJhjzzOo(constraintWidget.OooOo0O(), constraintWidget.OooOOOo())));
            }
        }
        long jIntSize = IntSizeKt.IntSize(oooO0o.OooOo0O(), oooO0o.OooOOOo());
        this.f59547OooO0Oo.getValue();
        return MeasureScope.CC.OooOOo0(measureScope, IntSize.m3925getWidthimpl(jIntSize), IntSize.m3924getHeightimpl(jIntSize), null, new OooO00o(oo00000, measurables), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i) {
        return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }
}
