package o0000OO;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.LayoutInfoFlags;
import androidx.constraintlayout.core.state.Dimension;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.video.VideoCapture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import p056o0000Oo.o00000OO;
import p056o0000Oo.o0000Ooo;
import p100o000oOoO.o0O00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements o0O0O00.o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000OOo f27397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f27398OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ int f27399OooO0OO = 257;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00O<Boolean> f27400OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000OOo f27401Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ List<o0O0O00.o0O0O00> f27402OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o000OOo o000ooo2, List<? extends o0O0O00.o0O0O00> list) {
            super(1);
            this.f27401Oooo = o000ooo2;
            this.f27402OoooO00 = list;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x0376  */
        /* JADX WARN: Code duplicated, block: B:108:0x038b  */
        /* JADX WARN: Code duplicated, block: B:128:0x01ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x0245 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:131:0x0277 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x01ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x01b0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x01b0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x03ad A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:144:0x03b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x03c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x03d5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x03de A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x0385 A[DONT_GENERATE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x0152  */
        /* JADX WARN: Code duplicated, block: B:62:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:69:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:73:0x024a  */
        /* JADX WARN: Code duplicated, block: B:75:0x0253  */
        /* JADX WARN: Code duplicated, block: B:77:0x0259  */
        /* JADX WARN: Code duplicated, block: B:78:0x025b  */
        /* JADX WARN: Code duplicated, block: B:91:0x030f  */
        /* JADX WARN: Code duplicated, block: B:93:0x0317  */
        /* JADX WARN: Instruction removed from duplicated block: B:59:0x0152, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:91:0x030f, please report this as an issue */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            StringBuilder sb;
            Object obj;
            androidx.constraintlayout.core.widgets.OooOO0 oooOO1;
            o0000Ooo o0000ooo;
            o0000Ooo o0000ooo2;
            p055o0000OOo.OooO0o oooO0o;
            int i;
            ConstraintAnchor constraintAnchorOooOOOO;
            ConstraintWidget constraintWidget;
            o0O0O00.o0O0O00 o0o0o00;
            Object objOooO00o;
            String string;
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000OOo o000ooo2 = this.f27401Oooo;
            List<o0O0O00.o0O0O00> measurables = this.f27402OoooO00;
            Objects.requireNonNull(o000ooo2);
            Intrinsics.checkNotNullParameter(layout, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            if (o000ooo2.f27419OooO0Oo.isEmpty()) {
                for (ConstraintWidget constraintWidget2 : o000ooo2.f27416OooO00o.f27676o0OOO0o) {
                    Object obj2 = constraintWidget2.f6975Ooooooo;
                    if (obj2 instanceof o0O0O00.o0O0O00) {
                        o0000Ooo o0000ooo3 = constraintWidget2.f6925OooOO0O;
                        ConstraintWidget constraintWidget3 = o0000ooo3.f27548OooO00o;
                        if (constraintWidget3 != null) {
                            o0000ooo3.f27549OooO0O0 = constraintWidget3.OooOoO();
                            o0000ooo3.f27550OooO0OO = o0000ooo3.f27548OooO00o.OooOoOO();
                            o0000ooo3.f27551OooO0Oo = o0000ooo3.f27548OooO00o.OooOo0();
                            o0000ooo3.f27553OooO0o0 = o0000ooo3.f27548OooO00o.OooOOOo();
                            o0000ooo3.OooO0OO(o0000ooo3.f27548OooO00o.f6925OooOO0O);
                        }
                        o000ooo2.f27419OooO0Oo.put((o0O0O00.o0O0O00) obj2, new o0000Ooo(o0000ooo3));
                    }
                }
            }
            int size = measurables.size() - 1;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    o0O0O00.o0O0O00 o0o0o01 = measurables.get(i2);
                    o0000Ooo o0000ooo4 = o000ooo2.f27419OooO0Oo.get(o0o0o01);
                    if (o0000ooo4 != null) {
                        if (Float.isNaN(o0000ooo4.f27555OooO0oo) && Float.isNaN(o0000ooo4.f27547OooO) && Float.isNaN(o0000ooo4.f27556OooOO0) && Float.isNaN(o0000ooo4.f27557OooOO0O) && Float.isNaN(o0000ooo4.f27558OooOO0o) && Float.isNaN(o0000ooo4.f27560OooOOO0) && Float.isNaN(o0000ooo4.f27559OooOOO) && Float.isNaN(o0000ooo4.f27561OooOOOO) && Float.isNaN(o0000ooo4.f27562OooOOOo)) {
                            o0000Ooo o0000ooo5 = o000ooo2.f27419OooO0Oo.get(o0o0o01);
                            Intrinsics.checkNotNull(o0000ooo5);
                            int i4 = o0000ooo5.f27549OooO0O0;
                            o0000Ooo o0000ooo6 = o000ooo2.f27419OooO0Oo.get(o0o0o01);
                            Intrinsics.checkNotNull(o0000ooo6);
                            int i5 = o0000ooo6.f27550OooO0OO;
                            o000O000 o000o001 = o000ooo2.f27417OooO0O0.get(o0o0o01);
                            if (o000o001 != null) {
                                long jOooO00o = o0000O0O.Oooo000.OooO00o(i4, i5);
                                o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35289OooO00o;
                                layout.OooO0o0(o000o001, jOooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                            }
                        } else {
                            o000000 o000000Var = new o000000(o0000ooo4);
                            o0000Ooo o0000ooo7 = o000ooo2.f27419OooO0Oo.get(o0o0o01);
                            Intrinsics.checkNotNull(o0000ooo7);
                            int i6 = o0000ooo7.f27549OooO0O0;
                            o0000Ooo o0000ooo8 = o000ooo2.f27419OooO0Oo.get(o0o0o01);
                            Intrinsics.checkNotNull(o0000ooo8);
                            int i7 = o0000ooo8.f27550OooO0OO;
                            float f = Float.isNaN(o0000ooo4.f27560OooOOO0) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : o0000ooo4.f27560OooOOO0;
                            o000O000 o000o002 = o000ooo2.f27417OooO0O0.get(o0o0o01);
                            if (o000o002 != null) {
                                layout.OooOO0(o000o002, i6, i7, f, o000000Var);
                            }
                        }
                        if (i3 > size) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                if (LayoutInfoFlags.BOUNDS == null) {
                    sb = new StringBuilder();
                    sb.append("{ ");
                    sb.append("  root: {");
                    sb.append("interpolated: { left:  0,");
                    sb.append("  top:  0,");
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("  right:   ");
                    sbOooO0O0.append(o000ooo2.f27416OooO00o.OooOoO0());
                    sbOooO0O0.append(" ,");
                    sb.append(sbOooO0O0.toString());
                    sb.append("  bottom:  " + o000ooo2.f27416OooO00o.OooOOo() + " ,");
                    sb.append(" } }");
                    for (ConstraintWidget constraintWidget4 : o000ooo2.f27416OooO00o.f27676o0OOO0o) {
                        obj = constraintWidget4.f6975Ooooooo;
                        if (!(obj instanceof o0O0O00.o0O0O00)) {
                            o0000ooo = null;
                            if (constraintWidget4.f6926OooOO0o == null) {
                                o0o0o00 = (o0O0O00.o0O0O00) obj;
                                objOooO00o = o0O0O00.o00O0O.OooO00o(o0o0o00);
                                if (objOooO00o == null) {
                                    objOooO00o = o000oOoO.OooO00o(o0o0o00);
                                }
                                if (objOooO00o == null) {
                                    string = null;
                                } else {
                                    string = objOooO00o.toString();
                                }
                                constraintWidget4.f6926OooOO0o = string;
                            }
                            o0000ooo2 = o000ooo2.f27419OooO0Oo.get(obj);
                            if (o0000ooo2 != null && (constraintWidget = o0000ooo2.f27548OooO00o) != null) {
                                o0000ooo = constraintWidget.f6925OooOO0O;
                            }
                            if (o0000ooo == null) {
                                StringBuilder sbOooO0O1 = OooO00o.OooO0OO.OooO0O0(' ');
                                sbOooO0O1.append((Object) constraintWidget4.f6926OooOO0o);
                                sbOooO0O1.append(": {");
                                sb.append(sbOooO0O1.toString());
                                sb.append(" interpolated : ");
                                sb.append("{\n");
                                o0000Ooo.OooO0O0(sb, ViewHierarchyConstants.DIMENSION_LEFT_KEY, o0000ooo.f27549OooO0O0);
                                o0000Ooo.OooO0O0(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, o0000ooo.f27550OooO0OO);
                                o0000Ooo.OooO0O0(sb, "right", o0000ooo.f27551OooO0Oo);
                                o0000Ooo.OooO0O0(sb, "bottom", o0000ooo.f27553OooO0o0);
                                o0000Ooo.OooO00o(sb, "pivotX", o0000ooo.f27552OooO0o);
                                o0000Ooo.OooO00o(sb, "pivotY", o0000ooo.f27554OooO0oO);
                                o0000Ooo.OooO00o(sb, "rotationX", o0000ooo.f27555OooO0oo);
                                o0000Ooo.OooO00o(sb, "rotationY", o0000ooo.f27547OooO);
                                o0000Ooo.OooO00o(sb, "rotationZ", o0000ooo.f27556OooOO0);
                                o0000Ooo.OooO00o(sb, "translationX", o0000ooo.f27557OooOO0O);
                                o0000Ooo.OooO00o(sb, "translationY", o0000ooo.f27558OooOO0o);
                                o0000Ooo.OooO00o(sb, "translationZ", o0000ooo.f27560OooOOO0);
                                o0000Ooo.OooO00o(sb, "scaleX", o0000ooo.f27559OooOOO);
                                o0000Ooo.OooO00o(sb, "scaleY", o0000ooo.f27561OooOOOO);
                                o0000Ooo.OooO00o(sb, "alpha", o0000ooo.f27562OooOOOo);
                                o0000Ooo.OooO0O0(sb, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, o0000ooo.f27564OooOOo0);
                                o0000Ooo.OooO00o(sb, "interpolatedPos", Float.NaN);
                                if (o0000ooo.f27548OooO00o != null) {
                                    for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                                        constraintAnchorOooOOOO = o0000ooo.f27548OooO00o.OooOOOO(type);
                                        if (constraintAnchorOooOOOO == null && constraintAnchorOooOOOO.f6910OooO0o != null) {
                                            sb.append("Anchor");
                                            sb.append(type.name());
                                            sb.append(": ['");
                                            String str = constraintAnchorOooOOOO.f6910OooO0o.f6909OooO0Oo.f6926OooOO0o;
                                            if (str == null) {
                                                str = "#PARENT";
                                            }
                                            sb.append(str);
                                            sb.append("', '");
                                            sb.append(constraintAnchorOooOOOO.f6910OooO0o.f6911OooO0o0.name());
                                            sb.append("', '");
                                            sb.append(constraintAnchorOooOOOO.f6912OooO0oO);
                                            sb.append("'],\n");
                                        }
                                    }
                                }
                                o0000Ooo.OooO00o(sb, "phone_orientation", Float.NaN);
                                o0000Ooo.OooO00o(sb, "phone_orientation", Float.NaN);
                                if (o0000ooo.f27563OooOOo.size() != 0) {
                                    sb.append("custom : {\n");
                                    for (String str2 : o0000ooo.f27563OooOOo.keySet()) {
                                        oooO0o = o0000ooo.f27563OooOOo.get(str2);
                                        sb.append(str2);
                                        sb.append(": ");
                                        switch (oooO0o.f27542OooO0O0) {
                                            case 900:
                                                sb.append(oooO0o.f27543OooO0OO);
                                                sb.append(",\n");
                                                break;
                                            case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                                            case 905:
                                                sb.append(oooO0o.f27544OooO0Oo);
                                                sb.append(",\n");
                                                break;
                                            case 902:
                                                sb.append("'");
                                                sb.append(p055o0000OOo.OooO0o.OooO00o(oooO0o.f27543OooO0OO));
                                                sb.append("',\n");
                                                break;
                                            case 903:
                                                sb.append("'");
                                                sb.append(oooO0o.f27546OooO0o0);
                                                sb.append("',\n");
                                                break;
                                            case 904:
                                                sb.append("'");
                                                sb.append(oooO0o.f27545OooO0o);
                                                sb.append("',\n");
                                                break;
                                        }
                                    }
                                    sb.append("}\n");
                                }
                                sb.append("}\n");
                                sb.append("}, ");
                            }
                        } else if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooOO0) {
                            StringBuilder sbOooO0O2 = OooO00o.OooO0OO.OooO0O0(' ');
                            sbOooO0O2.append((Object) constraintWidget4.f6926OooOO0o);
                            sbOooO0O2.append(": {");
                            sb.append(sbOooO0O2.toString());
                            oooOO1 = (androidx.constraintlayout.core.widgets.OooOO0) constraintWidget4;
                            if (oooOO1.f7078o0O0O00 == 0) {
                                sb.append(" type: 'hGuideline', ");
                            } else {
                                sb.append(" type: 'vGuideline', ");
                            }
                            sb.append(" interpolated: ");
                            sb.append(" { left: " + oooOO1.OooOoO() + ", top: " + oooOO1.OooOoOO() + ", right: " + (oooOO1.OooOoO0() + oooOO1.OooOoO()) + ", bottom: " + (oooOO1.OooOOo() + oooOO1.OooOoOO()) + " }");
                            sb.append("}, ");
                        }
                    }
                    sb.append(" }");
                    Intrinsics.checkNotNullExpressionValue(sb.toString(), "json.toString()");
                }
            } else if (LayoutInfoFlags.BOUNDS == null) {
                sb = new StringBuilder();
                sb.append("{ ");
                sb.append("  root: {");
                sb.append("interpolated: { left:  0,");
                sb.append("  top:  0,");
                StringBuilder sbOooO0O3 = OooO00o.OooO00o.OooO0O0("  right:   ");
                sbOooO0O3.append(o000ooo2.f27416OooO00o.OooOoO0());
                sbOooO0O3.append(" ,");
                sb.append(sbOooO0O3.toString());
                sb.append("  bottom:  " + o000ooo2.f27416OooO00o.OooOOo() + " ,");
                sb.append(" } }");
                while (r0.hasNext()) {
                    obj = constraintWidget4.f6975Ooooooo;
                    if (!(obj instanceof o0O0O00.o0O0O00)) {
                        o0000ooo = null;
                        if (constraintWidget4.f6926OooOO0o == null) {
                            o0o0o00 = (o0O0O00.o0O0O00) obj;
                            objOooO00o = o0O0O00.o00O0O.OooO00o(o0o0o00);
                            if (objOooO00o == null) {
                                objOooO00o = o000oOoO.OooO00o(o0o0o00);
                            }
                            if (objOooO00o == null) {
                                string = null;
                            } else {
                                string = objOooO00o.toString();
                            }
                            constraintWidget4.f6926OooOO0o = string;
                        }
                        o0000ooo2 = o000ooo2.f27419OooO0Oo.get(obj);
                        if (o0000ooo2 != null) {
                            o0000ooo = constraintWidget.f6925OooOO0O;
                        }
                        if (o0000ooo == null) {
                            StringBuilder sbOooO0O4 = OooO00o.OooO0OO.OooO0O0(' ');
                            sbOooO0O4.append((Object) constraintWidget4.f6926OooOO0o);
                            sbOooO0O4.append(": {");
                            sb.append(sbOooO0O4.toString());
                            sb.append(" interpolated : ");
                            sb.append("{\n");
                            o0000Ooo.OooO0O0(sb, ViewHierarchyConstants.DIMENSION_LEFT_KEY, o0000ooo.f27549OooO0O0);
                            o0000Ooo.OooO0O0(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, o0000ooo.f27550OooO0OO);
                            o0000Ooo.OooO0O0(sb, "right", o0000ooo.f27551OooO0Oo);
                            o0000Ooo.OooO0O0(sb, "bottom", o0000ooo.f27553OooO0o0);
                            o0000Ooo.OooO00o(sb, "pivotX", o0000ooo.f27552OooO0o);
                            o0000Ooo.OooO00o(sb, "pivotY", o0000ooo.f27554OooO0oO);
                            o0000Ooo.OooO00o(sb, "rotationX", o0000ooo.f27555OooO0oo);
                            o0000Ooo.OooO00o(sb, "rotationY", o0000ooo.f27547OooO);
                            o0000Ooo.OooO00o(sb, "rotationZ", o0000ooo.f27556OooOO0);
                            o0000Ooo.OooO00o(sb, "translationX", o0000ooo.f27557OooOO0O);
                            o0000Ooo.OooO00o(sb, "translationY", o0000ooo.f27558OooOO0o);
                            o0000Ooo.OooO00o(sb, "translationZ", o0000ooo.f27560OooOOO0);
                            o0000Ooo.OooO00o(sb, "scaleX", o0000ooo.f27559OooOOO);
                            o0000Ooo.OooO00o(sb, "scaleY", o0000ooo.f27561OooOOOO);
                            o0000Ooo.OooO00o(sb, "alpha", o0000ooo.f27562OooOOOo);
                            o0000Ooo.OooO0O0(sb, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, o0000ooo.f27564OooOOo0);
                            o0000Ooo.OooO00o(sb, "interpolatedPos", Float.NaN);
                            if (o0000ooo.f27548OooO00o != null) {
                                while (i < r3) {
                                    constraintAnchorOooOOOO = o0000ooo.f27548OooO00o.OooOOOO(type);
                                    if (constraintAnchorOooOOOO == null) {
                                    }
                                }
                            }
                            o0000Ooo.OooO00o(sb, "phone_orientation", Float.NaN);
                            o0000Ooo.OooO00o(sb, "phone_orientation", Float.NaN);
                            if (o0000ooo.f27563OooOOo.size() != 0) {
                                sb.append("custom : {\n");
                                while (r1.hasNext()) {
                                    oooO0o = o0000ooo.f27563OooOOo.get(str2);
                                    sb.append(str2);
                                    sb.append(": ");
                                    switch (oooO0o.f27542OooO0O0) {
                                        case 900:
                                            sb.append(oooO0o.f27543OooO0OO);
                                            sb.append(",\n");
                                            break;
                                        case VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown /* 901 */:
                                        case 905:
                                            sb.append(oooO0o.f27544OooO0Oo);
                                            sb.append(",\n");
                                            break;
                                        case 902:
                                            sb.append("'");
                                            sb.append(p055o0000OOo.OooO0o.OooO00o(oooO0o.f27543OooO0OO));
                                            sb.append("',\n");
                                            break;
                                        case 903:
                                            sb.append("'");
                                            sb.append(oooO0o.f27546OooO0o0);
                                            sb.append("',\n");
                                            break;
                                        case 904:
                                            sb.append("'");
                                            sb.append(oooO0o.f27545OooO0o);
                                            sb.append("',\n");
                                            break;
                                    }
                                }
                                sb.append("}\n");
                            }
                            sb.append("}\n");
                            sb.append("}, ");
                        }
                    } else if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooOO0) {
                        StringBuilder sbOooO0O5 = OooO00o.OooO0OO.OooO0O0(' ');
                        sbOooO0O5.append((Object) constraintWidget4.f6926OooOO0o);
                        sbOooO0O5.append(": {");
                        sb.append(sbOooO0O5.toString());
                        oooOO1 = (androidx.constraintlayout.core.widgets.OooOO0) constraintWidget4;
                        if (oooOO1.f7078o0O0O00 == 0) {
                            sb.append(" type: 'hGuideline', ");
                        } else {
                            sb.append(" type: 'vGuideline', ");
                        }
                        sb.append(" interpolated: ");
                        sb.append(" { left: " + oooOO1.OooOoO() + ", top: " + oooOO1.OooOoOO() + ", right: " + (oooOO1.OooOoO0() + oooOO1.OooOoO()) + ", bottom: " + (oooOO1.OooOOo() + oooOO1.OooOoOO()) + " }");
                        sb.append("}, ");
                    }
                }
                sb.append(" }");
                Intrinsics.checkNotNullExpressionValue(sb.toString(), "json.toString()");
            }
            return Unit.INSTANCE;
        }
    }

    public OooOo00(o000OOo o000ooo2, o00Oo0 o00oo1, o0O00O o0o00o2) {
        this.f27397OooO00o = o000ooo2;
        this.f27398OooO0O0 = o00oo1;
        this.f27400OooO0Oo = o0o00o2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o0O0O00.o000000
    @NotNull
    public final o0O0O00.o000000O OooO00o(@NotNull o0O0O00.o00000O0 measureScope, @NotNull List<? extends o0O0O00.o0O0O00> measurables, long j) {
        Dimension dimension;
        Dimension dimension2;
        ConstraintWidget constraintWidgetOooO0O0;
        Intrinsics.checkNotNullParameter(measureScope, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        o000OOo o000ooo2 = this.f27397OooO00o;
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        o00Oo0 constraintSet = this.f27398OooO0O0;
        int i = this.f27399OooO0OO;
        Objects.requireNonNull(o000ooo2);
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measureScope, "<set-?>");
        o000ooo2.f27421OooO0o0 = measureScope;
        Intrinsics.checkNotNullParameter(measureScope, "<set-?>");
        o000ooo2.f27420OooO0o = measureScope;
        o00000 o00000VarOooO0OO = o000ooo2.OooO0OO();
        if (o0000O0O.OooO0O0.OooO0o(j)) {
            int iOooO0oo = o0000O0O.OooO0O0.OooO0oo(j);
            dimension = new Dimension(Dimension.f6851OooO0o);
            dimension.f6858OooO0Oo = null;
            dimension.f6857OooO0OO = iOooO0oo;
        } else {
            dimension = new Dimension(Dimension.f6852OooO0oO);
            int iOooOO0 = o0000O0O.OooO0O0.OooOO0(j);
            if (iOooOO0 >= 0) {
                dimension.f6855OooO00o = iOooOO0;
            }
        }
        o00000VarOooO0OO.f6904OooO0Oo.f6894Oooo00o = dimension;
        o00000 o00000VarOooO0OO2 = o000ooo2.OooO0OO();
        if (o0000O0O.OooO0O0.OooO0o0(j)) {
            int iOooO0oO = o0000O0O.OooO0O0.OooO0oO(j);
            dimension2 = new Dimension(Dimension.f6851OooO0o);
            dimension2.f6858OooO0Oo = null;
            dimension2.f6857OooO0OO = iOooO0oO;
        } else {
            dimension2 = new Dimension(Dimension.f6852OooO0oO);
            int iOooO = o0000O0O.OooO0O0.OooO(j);
            if (iOooO >= 0) {
                dimension2.f6855OooO00o = iOooO;
            }
        }
        o00000VarOooO0OO2.f6904OooO0Oo.f6891Oooo0 = dimension2;
        o000ooo2.OooO0OO().f27408OooO0oO = j;
        o00000 o00000VarOooO0OO3 = o000ooo2.OooO0OO();
        Objects.requireNonNull(o00000VarOooO0OO3);
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        o00000VarOooO0OO3.f27409OooO0oo = layoutDirection;
        o000ooo2.f27417OooO0O0.clear();
        o000ooo2.f27418OooO0OO.clear();
        o000ooo2.f27419OooO0Oo.clear();
        if (constraintSet.OooO0o0(measurables)) {
            o00000 o00000VarOooO0OO4 = o000ooo2.OooO0OO();
            HashMap<Object, o00000OO> mReferences = o00000VarOooO0OO4.f6901OooO00o;
            Intrinsics.checkNotNullExpressionValue(mReferences, "mReferences");
            Iterator<Map.Entry<Object, o00000OO>> it = mReferences.entrySet().iterator();
            while (it.hasNext()) {
                o00000OO value = it.next().getValue();
                if (value != null && (constraintWidgetOooO0O0 = value.OooO0O0()) != null) {
                    constraintWidgetOooO0O0.Oooo0OO();
                }
            }
            o00000VarOooO0OO4.f6901OooO00o.clear();
            HashMap<Object, o00000OO> mReferences2 = o00000VarOooO0OO4.f6901OooO00o;
            Intrinsics.checkNotNullExpressionValue(mReferences2, "mReferences");
            mReferences2.put(State.f6900OooO0o0, o00000VarOooO0OO4.f6904OooO0Oo);
            o00000VarOooO0OO4.f27406OooO.clear();
            o00000VarOooO0OO4.f27410OooOO0 = true;
            o00000VarOooO0OO4.f6902OooO0O0.clear();
            o00000VarOooO0OO4.f6903OooO0OO.clear();
            constraintSet.OooO0OO(o000ooo2.OooO0OO(), measurables);
            Oooo000.OooO00o(o000ooo2.OooO0OO(), measurables);
            o00000 o00000VarOooO0OO5 = o000ooo2.OooO0OO();
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = o000ooo2.f27416OooO00o;
            Objects.requireNonNull(o00000VarOooO0OO5);
            oooO0o.OooooOo();
            o00000VarOooO0OO5.f6904OooO0Oo.f6894Oooo00o.OooO0O0(oooO0o, 0);
            o00000VarOooO0OO5.f6904OooO0Oo.f6891Oooo0.OooO0O0(oooO0o, 1);
            Iterator<Object> it2 = o00000VarOooO0OO5.f6902OooO0O0.keySet().iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(o00000VarOooO0OO5.f6902OooO0O0.get(it2.next()));
            }
            Iterator<Object> it3 = o00000VarOooO0OO5.f6901OooO00o.keySet().iterator();
            while (it3.hasNext()) {
                o00000OO o00000oo2 = o00000VarOooO0OO5.f6901OooO00o.get(it3.next());
                if (o00000oo2 != o00000VarOooO0OO5.f6904OooO0Oo) {
                    o00000oo2.OooO0OO();
                }
            }
            Iterator<Object> it4 = o00000VarOooO0OO5.f6901OooO00o.keySet().iterator();
            while (it4.hasNext()) {
                o00000OO o00000oo3 = o00000VarOooO0OO5.f6901OooO00o.get(it4.next());
                if (o00000oo3 != o00000VarOooO0OO5.f6904OooO0Oo) {
                    ConstraintWidget constraintWidgetOooO0O1 = o00000oo3.OooO0O0();
                    constraintWidgetOooO0O1.f6977o00O0O = o00000oo3.getKey().toString();
                    constraintWidgetOooO0O1.f6963OoooOOo = null;
                    o00000oo3.OooO0OO();
                    oooO0o.OooO0O0(constraintWidgetOooO0O1);
                } else {
                    o00000oo3.OooO00o(oooO0o);
                }
            }
            Iterator<Object> it5 = o00000VarOooO0OO5.f6902OooO0O0.keySet().iterator();
            while (it5.hasNext()) {
                Objects.requireNonNull(o00000VarOooO0OO5.f6902OooO0O0.get(it5.next()));
            }
            Iterator<Object> it6 = o00000VarOooO0OO5.f6901OooO00o.keySet().iterator();
            while (it6.hasNext()) {
                o00000OO o00000oo4 = o00000VarOooO0OO5.f6901OooO00o.get(it6.next());
                if (o00000oo4 != o00000VarOooO0OO5.f6904OooO0Oo) {
                    o00000oo4.OooO0OO();
                }
            }
            for (Object obj : o00000VarOooO0OO5.f6901OooO00o.keySet()) {
                o00000OO o00000oo5 = o00000VarOooO0OO5.f6901OooO00o.get(obj);
                o00000oo5.apply();
                ConstraintWidget constraintWidgetOooO0O2 = o00000oo5.OooO0O0();
                if (constraintWidgetOooO0O2 != null && obj != null) {
                    constraintWidgetOooO0O2.f6926OooOO0o = obj.toString();
                }
            }
        } else {
            Oooo000.OooO00o(o000ooo2.OooO0OO(), measurables);
        }
        o000ooo2.f27416OooO00o.Ooooo00(o0000O0O.OooO0O0.OooO0oo(j));
        o000ooo2.f27416OooO00o.OoooOO0(o0000O0O.OooO0O0.OooO0oO(j));
        Objects.requireNonNull(o000ooo2.f27416OooO00o);
        Objects.requireNonNull(o000ooo2.f27416OooO00o);
        o000ooo2.f27416OooO00o.o00oO0O();
        o000ooo2.f27416OooO00o.o00oO0o(i);
        androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = o000ooo2.f27416OooO00o;
        oooO0o2.o00Ooo(oooO0o2.f7064o00000Oo, 0, 0, 0, 0, 0, 0);
        for (ConstraintWidget constraintWidget : o000ooo2.f27416OooO00o.f27676o0OOO0o) {
            Object obj2 = constraintWidget.f6975Ooooooo;
            if (obj2 instanceof o0O0O00.o0O0O00) {
                o000O000 o000o001 = o000ooo2.f27417OooO0O0.get(obj2);
                Integer numValueOf = o000o001 == null ? null : Integer.valueOf(o000o001.f35285Oooo);
                Integer numValueOf2 = o000o001 == null ? null : Integer.valueOf(o000o001.f35287OoooO00);
                int iOooOoO0 = constraintWidget.OooOoO0();
                if (numValueOf != null && iOooOoO0 == numValueOf.intValue()) {
                    int iOooOOo = constraintWidget.OooOOo();
                    if (numValueOf2 != null && iOooOOo == numValueOf2.intValue()) {
                    }
                }
                o000ooo2.f27417OooO0O0.put((o0O0O00.o0O0O00) obj2, ((o0O0O00.o0O0O00) obj2).Oooo000(o0000O0O.OooO0O0.f27318OooO0O0.OooO0OO(constraintWidget.OooOoO0(), constraintWidget.OooOOo())));
            }
        }
        long jOooO00o = o0000O0O.o0OoOo0.OooO00o(o000ooo2.f27416OooO00o.OooOoO0(), o000ooo2.f27416OooO00o.OooOOo());
        this.f27400OooO0Oo.getValue();
        return measureScope.OooOooo((int) (jOooO00o >> 32), o0000O0O.o000oOoO.OooO0O0(jOooO00o), MapsKt.emptyMap(), new OooO00o(this.f27397OooO00o, measurables));
    }

    @Override // o0O0O00.o000000
    public final int OooO0O0(@NotNull o0O0O00.OooOo receiver, @NotNull List<? extends o0O0O00.OooOo00> measurables, int i) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return o0O0O00.o000OOo.OooO0Oo(this, receiver, measurables, i);
    }

    @Override // o0O0O00.o000000
    public final int OooO0OO(@NotNull o0O0O00.OooOo receiver, @NotNull List<? extends o0O0O00.OooOo00> measurables, int i) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return o0O0O00.o000OOo.OooO0O0(this, receiver, measurables, i);
    }

    @Override // o0O0O00.o000000
    public final int OooO0Oo(@NotNull o0O0O00.OooOo receiver, @NotNull List<? extends o0O0O00.OooOo00> measurables, int i) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return o0O0O00.o000OOo.OooO00o(this, receiver, measurables, i);
    }

    @Override // o0O0O00.o000000
    public final int OooO0o0(@NotNull o0O0O00.OooOo receiver, @NotNull List<? extends o0O0O00.OooOo00> measurables, int i) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return o0O0O00.o000OOo.OooO0OO(this, receiver, measurables, i);
    }
}
