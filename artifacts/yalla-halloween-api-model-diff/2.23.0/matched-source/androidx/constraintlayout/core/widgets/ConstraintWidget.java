package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o0O0O00.OooOo;
import o0O0O00.Oooo0;
import p028Oooo0oO.o0O00o0;
import p644o0ooOoO.oO0000o0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4334OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f4335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0O0O00.OooO0OO f4336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0O0O00.OooO0OO f4337OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOo f4338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean[] f4339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Oooo0 f4340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f4341OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f4342OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f4343OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OO00O.OooO0O0 f4344OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f4345OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f4346OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f4347OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f4348OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f4349OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f4350OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f4351OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4352OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4353OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f4354OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f4355OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int[] f4356OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4357OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f4358OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f4359OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f4360OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f4361OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f4362OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f4363OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int[] f4364OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ConstraintAnchor f4365Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f4366Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f4367Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f4368Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f4369Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f4370Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f4371Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final ConstraintAnchor f4372Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final ConstraintAnchor f4373Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ConstraintAnchor f4374Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final ConstraintAnchor f4375Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final ConstraintAnchor[] f4376OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final ConstraintAnchor f4377OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final ConstraintAnchor f4378OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final ConstraintAnchor f4379OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final ArrayList<ConstraintAnchor> f4380OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public DimensionBehaviour[] f4381OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ConstraintWidget f4382OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f4383OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f4384OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f4385OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f4386Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f4387Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f4388OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f4389OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f4390OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f4391Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f4392Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public float f4393OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public Object f4394Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final boolean[] f4395o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public String f4396o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public String f4397o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f4398o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f4399o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public ConstraintWidget f4400o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final ConstraintWidget[] f4401o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final float[] f4402o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f4403o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public ConstraintWidget f4404o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f4405o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f4406o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final ConstraintWidget[] f4407oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f4408ooOO;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4409OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f4410OooO0O0;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f4410OooO0O0 = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4410OooO0O0[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4410OooO0O0[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4410OooO0O0[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f4409OooO00o = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4409OooO00o[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.f4335OooO00o = false;
        this.f4338OooO0Oo = null;
        this.f4340OooO0o0 = null;
        this.f4339OooO0o = new boolean[]{true, true};
        this.f4341OooO0oO = true;
        this.f4342OooO0oo = true;
        this.f4334OooO = -1;
        this.f4343OooOO0 = -1;
        this.f4344OooOO0O = new o0OO00O.OooO0O0(this);
        this.f4347OooOOO0 = false;
        this.f4346OooOOO = false;
        this.f4348OooOOOO = false;
        this.f4349OooOOOo = false;
        this.f4351OooOOo0 = -1;
        this.f4350OooOOo = -1;
        this.f4352OooOOoo = 0;
        this.f4355OooOo00 = 0;
        this.f4354OooOo0 = 0;
        this.f4356OooOo0O = new int[2];
        this.f4357OooOo0o = 0;
        this.f4353OooOo = 0;
        this.f4359OooOoO0 = 1.0f;
        this.f4358OooOoO = 0;
        this.f4360OooOoOO = 0;
        this.f4362OooOoo0 = 1.0f;
        this.f4361OooOoo = -1;
        this.f4363OooOooO = 1.0f;
        this.f4364OooOooo = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4367Oooo000 = 0.0f;
        this.f4368Oooo00O = false;
        this.f4366Oooo0 = false;
        this.f4370Oooo0O0 = 0;
        this.f4371Oooo0OO = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f4373Oooo0o0 = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f4372Oooo0o = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f4374Oooo0oO = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f4375Oooo0oo = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f4365Oooo = constraintAnchor5;
        this.f4378OoooO00 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f4377OoooO0 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f4379OoooO0O = constraintAnchor6;
        this.f4376OoooO = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f4380OoooOO0 = new ArrayList<>();
        this.f4395o000oOoO = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f4381OoooOOO = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f4382OoooOOo = null;
        this.f4383OoooOo0 = 0;
        this.f4384OoooOoO = 0;
        this.f4385OoooOoo = 0.0f;
        this.f4386Ooooo00 = -1;
        this.f4387Ooooo0o = 0;
        this.f4388OooooO0 = 0;
        this.f4389OooooOO = 0;
        this.f4391Oooooo = 0.5f;
        this.f4393OoooooO = 0.5f;
        this.f4403o0OoOo0 = 0;
        this.f4408ooOO = false;
        this.f4396o00O0O = null;
        this.f4397o00Oo0 = null;
        this.f4398o00Ooo = 0;
        this.f4399o00o0O = 0;
        this.f4402o00ooo = new float[]{-1.0f, -1.0f};
        this.f4407oo000o = new ConstraintWidget[]{null, null};
        this.f4401o00oO0o = new ConstraintWidget[]{null, null};
        this.f4400o00oO0O = null;
        this.f4404o0ooOO0 = null;
        this.f4405o0ooOOo = -1;
        this.f4406o0ooOoO = -1;
        OooO0Oo();
    }

    public static void OooOo0(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f4329OooO0o == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f4329OooO0o);
        sb.append("'");
        if (constraintAnchor.f4332OooO0oo != Integer.MIN_VALUE || constraintAnchor.f4331OooO0oO != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f4331OooO0oO);
            if (constraintAnchor.f4332OooO0oo != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f4332OooO0oo);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public static void OooOo00(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        Oooo0o0(sb, i, 0, "      size");
        Oooo0o0(sb, i2, 0, "      min");
        Oooo0o0(sb, i3, Integer.MAX_VALUE, "      max");
        Oooo0o0(sb, i4, 0, "      matchMin");
        Oooo0o0(sb, i5, 0, "      matchDef");
        Oooo0o(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void Oooo0o(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void Oooo0o0(StringBuilder sb, int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public final void OooO(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    OooO(type6, constraintWidget, type2, 0);
                    OooO(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    OooOOO(type5).OooO00o(constraintWidget.OooOOO(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    OooO(type7, constraintWidget, type2, 0);
                    OooO(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    OooOOO(type5).OooO00o(constraintWidget.OooOOO(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorOooOOO = OooOOO(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorOooOOO2 = OooOOO(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorOooOOO3 = OooOOO(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorOooOOO4 = OooOOO(type11);
            boolean z2 = true;
            if ((constraintAnchorOooOOO == null || !constraintAnchorOooOOO.OooO0oo()) && (constraintAnchorOooOOO2 == null || !constraintAnchorOooOOO2.OooO0oo())) {
                OooO(type8, constraintWidget, type8, 0);
                OooO(type9, constraintWidget, type9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((constraintAnchorOooOOO3 == null || !constraintAnchorOooOOO3.OooO0oo()) && (constraintAnchorOooOOO4 == null || !constraintAnchorOooOOO4.OooO0oo())) {
                OooO(type10, constraintWidget, type10, 0);
                OooO(type11, constraintWidget, type11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                OooOOO(type5).OooO00o(constraintWidget.OooOOO(type5), 0);
                return;
            }
            if (z) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                OooOOO(type12).OooO00o(constraintWidget.OooOOO(type12), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    OooOOO(type13).OooO00o(constraintWidget.OooOOO(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorOooOOO5 = OooOOO(type4);
            ConstraintAnchor constraintAnchorOooOOO6 = constraintWidget.OooOOO(type2);
            ConstraintAnchor constraintAnchorOooOOO7 = OooOOO(ConstraintAnchor.Type.RIGHT);
            constraintAnchorOooOOO5.OooO00o(constraintAnchorOooOOO6, 0);
            constraintAnchorOooOOO7.OooO00o(constraintAnchorOooOOO6, 0);
            OooOOO(type14).OooO00o(constraintAnchorOooOOO6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorOooOOO8 = constraintWidget.OooOOO(type2);
            OooOOO(type3).OooO00o(constraintAnchorOooOOO8, 0);
            OooOOO(ConstraintAnchor.Type.BOTTOM).OooO00o(constraintAnchorOooOOO8, 0);
            OooOOO(type15).OooO00o(constraintAnchorOooOOO8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            OooOOO(type16).OooO00o(constraintWidget.OooOOO(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            OooOOO(type17).OooO00o(constraintWidget.OooOOO(type17), 0);
            OooOOO(type14).OooO00o(constraintWidget.OooOOO(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            OooOOO(type18).OooO00o(constraintWidget.OooOOO(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            OooOOO(type19).OooO00o(constraintWidget.OooOOO(type19), 0);
            OooOOO(type15).OooO00o(constraintWidget.OooOOO(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorOooOOO9 = OooOOO(type);
        ConstraintAnchor constraintAnchorOooOOO10 = constraintWidget.OooOOO(type2);
        if (constraintAnchorOooOOO9.OooO(constraintAnchorOooOOO10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorOooOOO11 = OooOOO(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorOooOOO12 = OooOOO(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorOooOOO11 != null) {
                    constraintAnchorOooOOO11.OooOO0();
                }
                if (constraintAnchorOooOOO12 != null) {
                    constraintAnchorOooOOO12.OooOO0();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorOooOOO13 = OooOOO(type20);
                if (constraintAnchorOooOOO13 != null) {
                    constraintAnchorOooOOO13.OooOO0();
                }
                ConstraintAnchor constraintAnchorOooOOO14 = OooOOO(type5);
                if (constraintAnchorOooOOO14.f4329OooO0o != constraintAnchorOooOOO10) {
                    constraintAnchorOooOOO14.OooOO0();
                }
                ConstraintAnchor constraintAnchorOooO0o = OooOOO(type).OooO0o();
                ConstraintAnchor constraintAnchorOooOOO15 = OooOOO(type15);
                if (constraintAnchorOooOOO15.OooO0oo()) {
                    constraintAnchorOooO0o.OooOO0();
                    constraintAnchorOooOOO15.OooOO0();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorOooOOO16 = OooOOO(type5);
                if (constraintAnchorOooOOO16.f4329OooO0o != constraintAnchorOooOOO10) {
                    constraintAnchorOooOOO16.OooOO0();
                }
                ConstraintAnchor constraintAnchorOooO0o2 = OooOOO(type).OooO0o();
                ConstraintAnchor constraintAnchorOooOOO17 = OooOOO(type14);
                if (constraintAnchorOooOOO17.OooO0oo()) {
                    constraintAnchorOooO0o2.OooOO0();
                    constraintAnchorOooOOO17.OooOO0();
                }
            }
            constraintAnchorOooOOO9.OooO00o(constraintAnchorOooOOO10, i);
        }
    }

    public final void OooO0Oo() {
        ConstraintAnchor constraintAnchor = this.f4373Oooo0o0;
        ArrayList<ConstraintAnchor> arrayList = this.f4380OoooOO0;
        arrayList.add(constraintAnchor);
        arrayList.add(this.f4372Oooo0o);
        arrayList.add(this.f4374Oooo0oO);
        arrayList.add(this.f4375Oooo0oo);
        arrayList.add(this.f4378OoooO00);
        arrayList.add(this.f4377OoooO0);
        arrayList.add(this.f4379OoooO0O);
        arrayList.add(this.f4365Oooo);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void OooO0o(androidx.constraintlayout.core.OooO0OO r65, boolean r66) {
        /*
            Method dump skipped, instruction units count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.OooO0o(androidx.constraintlayout.core.OooO0OO, boolean):void");
    }

    public final void OooO0o0(OooO0o oooO0o, androidx.constraintlayout.core.OooO0OO oooO0OO, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            OooOO0O.OooO00o(oooO0o, oooO0OO, this);
            hashSet.remove(this);
            OooO0o(oooO0OO, oooO0o.OooooOO(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f4373Oooo0o0.f4325OooO00o;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f4328OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f4374Oooo0oO.f4325OooO00o;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f4328OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f4372Oooo0o.f4325OooO00o;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f4328OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f4375Oooo0oo.f4325OooO00o;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f4328OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f4365Oooo.f4325OooO00o;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f4328OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
            }
        }
    }

    public boolean OooO0oO() {
        return this.f4403o0OoOo0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0152  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0176  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0370  */
    /* JADX WARN: Code duplicated, block: B:233:0x0376  */
    /* JADX WARN: Code duplicated, block: B:239:0x0389  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:244:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:250:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:252:0x03e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:254:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:264:0x040f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0429  */
    /* JADX WARN: Code duplicated, block: B:277:0x0431  */
    /* JADX WARN: Code duplicated, block: B:278:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x0442  */
    /* JADX WARN: Code duplicated, block: B:288:0x0446  */
    /* JADX WARN: Code duplicated, block: B:291:0x044c  */
    /* JADX WARN: Code duplicated, block: B:293:0x0450  */
    /* JADX WARN: Code duplicated, block: B:295:0x0454  */
    /* JADX WARN: Code duplicated, block: B:296:0x0456  */
    /* JADX WARN: Code duplicated, block: B:299:0x045e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0464 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x046c  */
    /* JADX WARN: Code duplicated, block: B:306:0x046e  */
    /* JADX WARN: Code duplicated, block: B:309:0x0480  */
    /* JADX WARN: Code duplicated, block: B:311:0x0485  */
    /* JADX WARN: Code duplicated, block: B:312:0x048a  */
    /* JADX WARN: Code duplicated, block: B:314:0x048d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:338:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:357:0x050d  */
    /* JADX WARN: Code duplicated, block: B:367:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:88:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142  */
    public final void OooO0oo(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int iMin;
        int i13;
        int i14;
        int i15;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        SolverVariable solverVariableOooOO0O;
        SolverVariable solverVariableOooOO0O2;
        boolean z13;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i16;
        int i17;
        int i18;
        boolean z18;
        boolean z19;
        boolean z20;
        SolverVariable solverVariable4;
        boolean z21;
        SolverVariable solverVariable5;
        ConstraintWidget constraintWidget;
        int iMax;
        boolean z22;
        int i19;
        int i20;
        int iOooO0o0;
        int i21;
        int iMin2;
        int i22;
        HashSet<ConstraintAnchor> hashSet;
        boolean z23;
        int i23;
        boolean z24;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z25;
        boolean z26;
        char c;
        int i33 = i7;
        int i34 = i8;
        SolverVariable solverVariableOooOO0O3 = oooO0OO.OooOO0O(constraintAnchor);
        SolverVariable solverVariableOooOO0O4 = oooO0OO.OooOO0O(constraintAnchor2);
        SolverVariable solverVariableOooOO0O5 = oooO0OO.OooOO0O(constraintAnchor.f4329OooO0o);
        SolverVariable solverVariableOooOO0O6 = oooO0OO.OooOO0O(constraintAnchor2.f4329OooO0o);
        boolean zOooO0oo = constraintAnchor.OooO0oo();
        boolean zOooO0oo2 = constraintAnchor2.OooO0oo();
        boolean zOooO0oo3 = this.f4379OoooO0O.OooO0oo();
        int i35 = zOooO0oo2 ? (zOooO0oo ? 1 : 0) + 1 : zOooO0oo ? 1 : 0;
        if (zOooO0oo3) {
            i35++;
        }
        int i36 = i35;
        int i37 = z6 ? 3 : i5;
        int i38 = OooO00o.f4410OooO0O0[dimensionBehaviour.ordinal()];
        if (i38 != 1 && i38 != 2 && i38 != 3 && i38 == 4) {
            i9 = i37;
            z12 = i9 != 4;
            i10 = this.f4334OooO;
            if (i10 != -1 && z) {
                this.f4334OooO = -1;
                i2 = i10;
                z12 = false;
            }
            i11 = this.f4343OooOO0;
            if (i11 != -1 || z) {
                i11 = i2;
            } else {
                this.f4343OooOO0 = -1;
                z12 = false;
            }
            i12 = i11;
            if (this.f4403o0OoOo0 == 8) {
                iMin = 0;
                z12 = false;
            } else {
                iMin = i12;
            }
            if (!z11) {
                if (zOooO0oo && !zOooO0oo2 && !zOooO0oo3) {
                    oooO0OO.OooO0Oo(solverVariableOooOO0O3, i);
                } else if (zOooO0oo && !zOooO0oo2) {
                    i13 = 8;
                    oooO0OO.OooO0o0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), 8);
                }
                i13 = 8;
            } else {
                i13 = 8;
            }
            if (!z12) {
                if (i36 != 2 || z6 || (i9 != 1 && i9 != 0)) {
                    if (i33 == -2) {
                        i33 = iMin;
                    }
                    if (i34 == -2) {
                        i34 = iMin;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i33 > 0) {
                        oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, i33, 8);
                        iMin = Math.max(iMin, i33);
                    }
                    if (i34 > 0) {
                        if (z2 || i9 != 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            i14 = 8;
                            oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, i34, 8);
                        } else {
                            i14 = 8;
                        }
                        iMin = Math.min(iMin, i34);
                    } else {
                        i14 = 8;
                    }
                    if (i9 == 1) {
                        if (z2) {
                            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                        } else if (z8) {
                            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, 5);
                            oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                        } else {
                            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, 5);
                            oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                        }
                    } else if (i9 == 2) {
                        type = ConstraintAnchor.Type.TOP;
                        type2 = constraintAnchor.f4330OooO0o0;
                        if (type2 != type || type2 == ConstraintAnchor.Type.BOTTOM) {
                            solverVariableOooOO0O = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(type));
                            solverVariableOooOO0O2 = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            solverVariableOooOO0O = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.LEFT));
                            solverVariableOooOO0O2 = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.RIGHT));
                        }
                        androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o = oooO0OO.OooOO0o();
                        oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O4, -1.0f);
                        oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O3, 1.0f);
                        oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O2, f2);
                        oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O, -f2);
                        oooO0OO.OooO0OO(oooO0O0OooOO0o);
                        if (z2) {
                            z12 = false;
                        }
                        i15 = i33;
                    } else {
                        i36 = i36 == true ? 1 : 0;
                        i15 = i33;
                        z4 = true;
                    }
                    if (z11 || z8) {
                        boolean z27 = z4;
                        if (i36 >= 2 && z2 && z27) {
                            oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariable, 0, 8);
                            ConstraintAnchor constraintAnchor4 = this.f4365Oooo;
                            boolean z28 = z || constraintAnchor4.f4329OooO0o == null;
                            if (!z && (constraintAnchor3 = constraintAnchor4.f4329OooO0o) != null) {
                                ConstraintWidget constraintWidget2 = constraintAnchor3.f4328OooO0Oo;
                                if (constraintWidget2.f4385OoooOoo != 0.0f) {
                                    DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.f4381OoooOOO;
                                    DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                                    DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                } else {
                                    z28 = false;
                                }
                            }
                            if (z28) {
                                oooO0OO.OooO0o(solverVariable2, solverVariableOooOO0O4, 0, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (zOooO0oo || zOooO0oo2 || zOooO0oo3) {
                        if (zOooO0oo && !zOooO0oo2) {
                            z21 = z2;
                            constraintAnchor2 = constraintAnchor2;
                            solverVariableOooOO0O4 = solverVariableOooOO0O4;
                            z4 = z4;
                            i20 = (z2 && (constraintAnchor.f4329OooO0o.f4328OooO0Oo instanceof androidx.constraintlayout.core.widgets.OooO00o)) ? 8 : 5;
                            solverVariable5 = solverVariableOooOO0O6;
                        } else if (zOooO0oo || !zOooO0oo2) {
                            solverVariable3 = solverVariableOooOO0O6;
                            if (zOooO0oo && zOooO0oo2) {
                                ConstraintWidget constraintWidget3 = constraintAnchor.f4329OooO0o.f4328OooO0Oo;
                                constraintAnchor2 = constraintAnchor2;
                                ConstraintWidget constraintWidget4 = constraintAnchor2.f4329OooO0o.f4328OooO0Oo;
                                ConstraintWidget constraintWidget5 = this.f4382OoooOOo;
                                int i39 = 6;
                                if (z12) {
                                    if (i9 == 0) {
                                        if (i34 != 0 || i15 != 0) {
                                            i31 = 5;
                                            i32 = 5;
                                            z25 = true;
                                            z26 = false;
                                            z16 = true;
                                        } else if (solverVariableOooOO0O5.f4256OooO && solverVariable3.f4256OooO) {
                                            oooO0OO.OooO0o0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), 8);
                                            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariable3, -constraintAnchor2.OooO0o0(), 8);
                                            return;
                                        } else {
                                            i31 = 8;
                                            i32 = 8;
                                            z25 = false;
                                            z26 = true;
                                            z16 = false;
                                        }
                                        i18 = ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooO00o)) ? 4 : i31;
                                        i17 = i32;
                                        z18 = z26;
                                        i9 = i9;
                                        z17 = z25;
                                        solverVariable2 = solverVariable2;
                                        i16 = 6;
                                    } else {
                                        if (i9 == 2) {
                                            i29 = ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooO00o)) ? 4 : 5;
                                            i30 = 5;
                                        } else if (i9 == 1) {
                                            i29 = 4;
                                            i30 = 8;
                                        } else if (i9 == 3) {
                                            i9 = i9;
                                            if (this.f4361OooOoo == -1) {
                                                if (z9) {
                                                    i28 = z2 ? 5 : 4;
                                                } else {
                                                    i28 = 8;
                                                }
                                                i16 = i28;
                                                i17 = 8;
                                                i18 = 5;
                                            } else if (z6) {
                                                if (i6 == 2 || i6 == 1) {
                                                    i26 = 4;
                                                    i27 = 5;
                                                } else {
                                                    i26 = 5;
                                                    i27 = 8;
                                                }
                                                i18 = i26;
                                                i17 = i27;
                                                i16 = 6;
                                                z17 = true;
                                                z16 = true;
                                                z18 = true;
                                                solverVariable2 = solverVariable2;
                                            } else {
                                                if (i34 > 0) {
                                                    i25 = 5;
                                                } else if (i34 != 0 || i15 != 0) {
                                                    i25 = 4;
                                                } else if (z9) {
                                                    i17 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                    i16 = 6;
                                                    i18 = 4;
                                                } else {
                                                    i25 = 8;
                                                }
                                                i18 = i25;
                                                i16 = 6;
                                                i17 = 5;
                                            }
                                            z17 = true;
                                            z16 = true;
                                            z18 = true;
                                        } else {
                                            z14 = false;
                                            z15 = false;
                                        }
                                        i9 = i9;
                                        i16 = 6;
                                        z17 = true;
                                        z16 = true;
                                        z18 = false;
                                        solverVariable2 = solverVariable2;
                                        int i40 = i30;
                                        i18 = i29;
                                        i17 = i40;
                                    }
                                    if (z16 || solverVariableOooOO0O5 != solverVariable3 || constraintWidget3 == constraintWidget5) {
                                        z19 = z16;
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                        z19 = false;
                                    }
                                    if (z17) {
                                        if (z12 && !z7 && !z9 && solverVariableOooOO0O5 == solverVariable && solverVariable3 == solverVariable2) {
                                            z21 = false;
                                            i23 = 8;
                                            i24 = 8;
                                            z24 = false;
                                        } else {
                                            i23 = i17;
                                            z24 = z20;
                                            i24 = i16;
                                            z21 = z2;
                                        }
                                        solverVariable4 = solverVariableOooOO0O4;
                                        oooO0OO.OooO0O0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), f, solverVariable3, solverVariableOooOO0O4, constraintAnchor2.OooO0o0(), i24);
                                        i17 = i23;
                                        z20 = z24;
                                    } else {
                                        solverVariable4 = solverVariableOooOO0O4;
                                        z21 = z2;
                                    }
                                    if (this.f4403o0OoOo0 == 8) {
                                        hashSet = constraintAnchor2.f4325OooO00o;
                                        if (hashSet == null && hashSet.size() > 0) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        if (!z23) {
                                            return;
                                        }
                                    }
                                    if (z19) {
                                        solverVariable5 = solverVariable3;
                                        if (z21 && solverVariableOooOO0O5 != solverVariable5 && !z12 && ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooO00o))) {
                                            i17 = 6;
                                        }
                                        oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), i17);
                                        solverVariableOooOO0O4 = solverVariable4;
                                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariable5, -constraintAnchor2.OooO0o0(), i17);
                                    } else {
                                        solverVariable5 = solverVariable3;
                                        solverVariableOooOO0O4 = solverVariable4;
                                    }
                                    if (z21 || !z10 || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooO00o)) {
                                        constraintWidget = constraintWidget5;
                                    } else {
                                        constraintWidget = constraintWidget5;
                                        if (constraintWidget4 != constraintWidget) {
                                            i17 = 6;
                                            iMax = 6;
                                            z22 = true;
                                        }
                                        if (z22) {
                                            if (z18 && (!z9 || z3)) {
                                                if (constraintWidget3 != constraintWidget && constraintWidget4 != constraintWidget) {
                                                    i39 = iMax;
                                                }
                                                if ((constraintWidget3 instanceof OooOO0) || (constraintWidget4 instanceof OooOO0)) {
                                                    i39 = 5;
                                                }
                                                if ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.OooO00o)) {
                                                    i39 = 5;
                                                }
                                                if (z9) {
                                                    i22 = 5;
                                                } else {
                                                    i22 = i39;
                                                }
                                                iMax = Math.max(i22, iMax);
                                            }
                                            if (z21) {
                                                iMin2 = Math.min(i17, iMax);
                                                if (z6 || z9 || !(constraintWidget3 == constraintWidget || constraintWidget4 == constraintWidget)) {
                                                    i21 = iMin2;
                                                } else {
                                                    i21 = 4;
                                                }
                                            } else {
                                                i21 = iMax;
                                            }
                                            oooO0OO.OooO0o0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), i21);
                                            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariable5, -constraintAnchor2.OooO0o0(), i21);
                                        }
                                        if (z21) {
                                            if (solverVariable == solverVariableOooOO0O5) {
                                                iOooO0o0 = constraintAnchor.OooO0o0();
                                            } else {
                                                iOooO0o0 = 0;
                                            }
                                            if (solverVariableOooOO0O5 != solverVariable) {
                                                oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariable, iOooO0o0, 5);
                                            }
                                        }
                                        if (z21 || !z12 || i3 != 0 || i15 != 0) {
                                            i19 = 5;
                                        } else if (z12 && i9 == 3) {
                                            oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, 0, 8);
                                            i20 = 5;
                                        } else {
                                            i19 = 5;
                                            oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, 0, 5);
                                        }
                                        i20 = i19;
                                    }
                                    iMax = i18;
                                    z22 = z20;
                                    if (z22) {
                                        if (z18) {
                                            if (constraintWidget3 != constraintWidget) {
                                                i39 = iMax;
                                            }
                                            if (constraintWidget3 instanceof OooOO0) {
                                                i39 = 5;
                                            } else {
                                                i39 = 5;
                                            }
                                            if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) {
                                                i39 = 5;
                                            } else {
                                                i39 = 5;
                                            }
                                            if (z9) {
                                                i22 = 5;
                                            } else {
                                                i22 = i39;
                                            }
                                            iMax = Math.max(i22, iMax);
                                        }
                                        if (z21) {
                                            iMin2 = Math.min(i17, iMax);
                                            if (z6) {
                                                i21 = iMin2;
                                            } else {
                                                i21 = iMin2;
                                            }
                                        } else {
                                            i21 = iMax;
                                        }
                                        oooO0OO.OooO0o0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), i21);
                                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariable5, -constraintAnchor2.OooO0o0(), i21);
                                    }
                                    if (z21) {
                                        if (solverVariable == solverVariableOooOO0O5) {
                                            iOooO0o0 = constraintAnchor.OooO0o0();
                                        } else {
                                            iOooO0o0 = 0;
                                        }
                                        if (solverVariableOooOO0O5 != solverVariable) {
                                            oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariable, iOooO0o0, 5);
                                        }
                                    }
                                    if (z21) {
                                        i19 = 5;
                                        i20 = i19;
                                    } else {
                                        i19 = 5;
                                        i20 = i19;
                                    }
                                } else {
                                    if (solverVariableOooOO0O5.f4256OooO && solverVariable3.f4256OooO) {
                                        oooO0OO.OooO0O0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), f, solverVariable3, solverVariableOooOO0O4, constraintAnchor2.OooO0o0(), 8);
                                        if (z2 && z4) {
                                            int iOooO0o1 = constraintAnchor2.f4329OooO0o != null ? constraintAnchor2.OooO0o0() : 0;
                                            if (solverVariable3 != solverVariable2) {
                                                oooO0OO.OooO0o(solverVariable2, solverVariableOooOO0O4, iOooO0o1, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    z14 = true;
                                    z15 = true;
                                }
                                z16 = z14;
                                z17 = z15;
                                i16 = 6;
                                i17 = 5;
                                i18 = 4;
                                z18 = false;
                                if (z16) {
                                    z19 = z16;
                                    z20 = true;
                                } else {
                                    z19 = z16;
                                    z20 = true;
                                }
                                if (z17) {
                                    if (z12) {
                                        i23 = i17;
                                        z24 = z20;
                                        i24 = i16;
                                        z21 = z2;
                                    } else {
                                        i23 = i17;
                                        z24 = z20;
                                        i24 = i16;
                                        z21 = z2;
                                    }
                                    solverVariable4 = solverVariableOooOO0O4;
                                    oooO0OO.OooO0O0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), f, solverVariable3, solverVariableOooOO0O4, constraintAnchor2.OooO0o0(), i24);
                                    i17 = i23;
                                    z20 = z24;
                                } else {
                                    solverVariable4 = solverVariableOooOO0O4;
                                    z21 = z2;
                                }
                                if (this.f4403o0OoOo0 == 8) {
                                    hashSet = constraintAnchor2.f4325OooO00o;
                                    if (hashSet == null) {
                                        z23 = false;
                                    } else {
                                        z23 = true;
                                    }
                                    if (!z23) {
                                        return;
                                    }
                                }
                                if (z19) {
                                    solverVariable5 = solverVariable3;
                                    if (z21) {
                                        i17 = 6;
                                    }
                                    oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), i17);
                                    solverVariableOooOO0O4 = solverVariable4;
                                    oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariable5, -constraintAnchor2.OooO0o0(), i17);
                                } else {
                                    solverVariable5 = solverVariable3;
                                    solverVariableOooOO0O4 = solverVariable4;
                                }
                                if (z21) {
                                    constraintWidget = constraintWidget5;
                                    iMax = i18;
                                    z22 = z20;
                                } else {
                                    constraintWidget = constraintWidget5;
                                    iMax = i18;
                                    z22 = z20;
                                }
                                if (z22) {
                                    if (z18) {
                                        if (constraintWidget3 != constraintWidget) {
                                            i39 = iMax;
                                        }
                                        if (constraintWidget3 instanceof OooOO0) {
                                            i39 = 5;
                                        } else {
                                            i39 = 5;
                                        }
                                        if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooO00o) {
                                            i39 = 5;
                                        } else {
                                            i39 = 5;
                                        }
                                        if (z9) {
                                            i22 = 5;
                                        } else {
                                            i22 = i39;
                                        }
                                        iMax = Math.max(i22, iMax);
                                    }
                                    if (z21) {
                                        iMin2 = Math.min(i17, iMax);
                                        if (z6) {
                                            i21 = iMin2;
                                        } else {
                                            i21 = iMin2;
                                        }
                                    } else {
                                        i21 = iMax;
                                    }
                                    oooO0OO.OooO0o0(solverVariableOooOO0O3, solverVariableOooOO0O5, constraintAnchor.OooO0o0(), i21);
                                    oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariable5, -constraintAnchor2.OooO0o0(), i21);
                                }
                                if (z21) {
                                    if (solverVariable == solverVariableOooOO0O5) {
                                        iOooO0o0 = constraintAnchor.OooO0o0();
                                    } else {
                                        iOooO0o0 = 0;
                                    }
                                    if (solverVariableOooOO0O5 != solverVariable) {
                                        oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariable, iOooO0o0, 5);
                                    }
                                }
                                if (z21) {
                                    i19 = 5;
                                    i20 = i19;
                                } else {
                                    i19 = 5;
                                    i20 = i19;
                                }
                            }
                        } else {
                            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariable3, -constraintAnchor2.OooO0o0(), 8);
                            if (z2) {
                                solverVariable3 = solverVariableOooOO0O6;
                                oooO0OO.OooO0o(solverVariableOooOO0O3, solverVariable, 0, 5);
                                i19 = 5;
                                solverVariable5 = solverVariable3;
                            }
                            z21 = z2;
                            i20 = i19;
                        }
                        if (z21 || !z4) {
                            return;
                        }
                        int iOooO0o2 = constraintAnchor2.f4329OooO0o != null ? constraintAnchor2.OooO0o0() : 0;
                        if (solverVariable5 != solverVariable2) {
                            oooO0OO.OooO0o(solverVariable2, solverVariableOooOO0O4, iOooO0o2, i20);
                            return;
                        }
                        return;
                    }
                    solverVariable3 = solverVariableOooOO0O6;
                    solverVariable3 = solverVariableOooOO0O6;
                    solverVariable5 = solverVariable3;
                    i19 = 5;
                    z21 = z2;
                    i20 = i19;
                    if (z21) {
                        return;
                    } else {
                        return;
                    }
                }
                int iMax2 = Math.max(i33, iMin);
                if (i34 > 0) {
                    iMax2 = Math.min(i34, iMax2);
                }
                oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMax2, 8);
                z12 = false;
            } else if (z5) {
                c = 3;
                oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, 0, 3);
                if (i3 > 0) {
                    oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, i3, i13);
                }
                if (i4 < Integer.MAX_VALUE) {
                    oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, i4, i13);
                }
            } else {
                c = 3;
                oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i13);
            }
            i15 = i33;
            if (z11) {
            }
            boolean z29 = z4;
            if (i36 >= 2) {
            }
        }
        i9 = i37;
        i10 = this.f4334OooO;
        if (i10 != -1) {
            this.f4334OooO = -1;
            i2 = i10;
            z12 = false;
        }
        i11 = this.f4343OooOO0;
        if (i11 != -1) {
            i11 = i2;
        } else {
            i11 = i2;
        }
        i12 = i11;
        if (this.f4403o0OoOo0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            iMin = i12;
        }
        if (!z11) {
            i13 = 8;
        } else if (zOooO0oo) {
            if (zOooO0oo) {
                i13 = 8;
            } else {
                i13 = 8;
            }
        } else if (zOooO0oo) {
            i13 = 8;
        } else {
            i13 = 8;
        }
        if (!z12) {
            if (i36 != 2) {
                if (i33 == -2) {
                    i33 = iMin;
                }
                if (i34 == -2) {
                    i34 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i33 > 0) {
                    oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, i33, 8);
                    iMin = Math.max(iMin, i33);
                }
                if (i34 > 0) {
                    if (z2) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        i14 = 8;
                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, i34, 8);
                    } else {
                        i14 = 8;
                    }
                    iMin = Math.min(iMin, i34);
                } else {
                    i14 = 8;
                }
                if (i9 == 1) {
                    if (z2) {
                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                    } else if (z8) {
                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, 5);
                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                    } else {
                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, 5);
                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                    }
                } else if (i9 == 2) {
                    type = ConstraintAnchor.Type.TOP;
                    type2 = constraintAnchor.f4330OooO0o0;
                    if (type2 != type) {
                        solverVariableOooOO0O = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(type));
                        solverVariableOooOO0O2 = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableOooOO0O = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(type));
                        solverVariableOooOO0O2 = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.BOTTOM));
                    }
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o2 = oooO0OO.OooOO0o();
                    oooO0O0OooOO0o2.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O4, -1.0f);
                    oooO0O0OooOO0o2.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O3, 1.0f);
                    oooO0O0OooOO0o2.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O2, f2);
                    oooO0O0OooOO0o2.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O, -f2);
                    oooO0OO.OooO0OO(oooO0O0OooOO0o2);
                    if (z2) {
                        z12 = false;
                    }
                    i15 = i33;
                } else {
                    i36 = i36 == true ? 1 : 0;
                    i15 = i33;
                    z4 = true;
                }
            } else {
                if (i33 == -2) {
                    i33 = iMin;
                }
                if (i34 == -2) {
                    i34 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i33 > 0) {
                    oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, i33, 8);
                    iMin = Math.max(iMin, i33);
                }
                if (i34 > 0) {
                    if (z2) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        i14 = 8;
                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, i34, 8);
                    } else {
                        i14 = 8;
                    }
                    iMin = Math.min(iMin, i34);
                } else {
                    i14 = 8;
                }
                if (i9 == 1) {
                    if (z2) {
                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                    } else if (z8) {
                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, 5);
                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                    } else {
                        oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, 5);
                        oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i14);
                    }
                } else if (i9 == 2) {
                    type = ConstraintAnchor.Type.TOP;
                    type2 = constraintAnchor.f4330OooO0o0;
                    if (type2 != type) {
                        solverVariableOooOO0O = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(type));
                        solverVariableOooOO0O2 = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableOooOO0O = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(type));
                        solverVariableOooOO0O2 = oooO0OO.OooOO0O(this.f4382OoooOOo.OooOOO(ConstraintAnchor.Type.BOTTOM));
                    }
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o3 = oooO0OO.OooOO0o();
                    oooO0O0OooOO0o3.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O4, -1.0f);
                    oooO0O0OooOO0o3.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O3, 1.0f);
                    oooO0O0OooOO0o3.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O2, f2);
                    oooO0O0OooOO0o3.f4231OooO0Oo.OooO0oo(solverVariableOooOO0O, -f2);
                    oooO0OO.OooO0OO(oooO0O0OooOO0o3);
                    if (z2) {
                        z12 = false;
                    }
                    i15 = i33;
                } else {
                    i36 = i36 == true ? 1 : 0;
                    i15 = i33;
                    z4 = true;
                }
            }
            if (z11) {
            }
            boolean z210 = z4;
            if (i36 >= 2) {
            }
        }
        if (z5) {
            c = 3;
            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, 0, 3);
            if (i3 > 0) {
                oooO0OO.OooO0o(solverVariableOooOO0O4, solverVariableOooOO0O3, i3, i13);
            }
            if (i4 < Integer.MAX_VALUE) {
                oooO0OO.OooO0oO(solverVariableOooOO0O4, solverVariableOooOO0O3, i4, i13);
            }
        } else {
            c = 3;
            oooO0OO.OooO0o0(solverVariableOooOO0O4, solverVariableOooOO0O3, iMin, i13);
        }
        i15 = i33;
        if (z11) {
        }
        boolean z211 = z4;
        if (i36 >= 2) {
        }
    }

    public final void OooOO0(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.f4328OooO0Oo == this) {
            OooO(constraintAnchor.f4330OooO0o0, constraintAnchor2.f4328OooO0Oo, constraintAnchor2.f4330OooO0o0, i);
        }
    }

    public void OooOO0O(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f4351OooOOo0 = constraintWidget.f4351OooOOo0;
        this.f4350OooOOo = constraintWidget.f4350OooOOo;
        this.f4355OooOo00 = constraintWidget.f4355OooOo00;
        this.f4354OooOo0 = constraintWidget.f4354OooOo0;
        int[] iArr = constraintWidget.f4356OooOo0O;
        int i = iArr[0];
        int[] iArr2 = this.f4356OooOo0O;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.f4357OooOo0o = constraintWidget.f4357OooOo0o;
        this.f4353OooOo = constraintWidget.f4353OooOo;
        this.f4358OooOoO = constraintWidget.f4358OooOoO;
        this.f4360OooOoOO = constraintWidget.f4360OooOoOO;
        this.f4362OooOoo0 = constraintWidget.f4362OooOoo0;
        this.f4361OooOoo = constraintWidget.f4361OooOoo;
        this.f4363OooOooO = constraintWidget.f4363OooOooO;
        int[] iArr3 = constraintWidget.f4364OooOooo;
        this.f4364OooOooo = Arrays.copyOf(iArr3, iArr3.length);
        this.f4367Oooo000 = constraintWidget.f4367Oooo000;
        this.f4368Oooo00O = constraintWidget.f4368Oooo00O;
        this.f4369Oooo00o = constraintWidget.f4369Oooo00o;
        this.f4373Oooo0o0.OooOO0();
        this.f4372Oooo0o.OooOO0();
        this.f4374Oooo0oO.OooOO0();
        this.f4375Oooo0oo.OooOO0();
        this.f4365Oooo.OooOO0();
        this.f4378OoooO00.OooOO0();
        this.f4377OoooO0.OooOO0();
        this.f4379OoooO0O.OooOO0();
        this.f4381OoooOOO = (DimensionBehaviour[]) Arrays.copyOf(this.f4381OoooOOO, 2);
        this.f4382OoooOOo = this.f4382OoooOOo == null ? null : map.get(constraintWidget.f4382OoooOOo);
        this.f4383OoooOo0 = constraintWidget.f4383OoooOo0;
        this.f4384OoooOoO = constraintWidget.f4384OoooOoO;
        this.f4385OoooOoo = constraintWidget.f4385OoooOoo;
        this.f4386Ooooo00 = constraintWidget.f4386Ooooo00;
        this.f4387Ooooo0o = constraintWidget.f4387Ooooo0o;
        this.f4388OooooO0 = constraintWidget.f4388OooooO0;
        this.f4389OooooOO = constraintWidget.f4389OooooOO;
        this.f4390OooooOo = constraintWidget.f4390OooooOo;
        this.f4392Oooooo0 = constraintWidget.f4392Oooooo0;
        this.f4391Oooooo = constraintWidget.f4391Oooooo;
        this.f4393OoooooO = constraintWidget.f4393OoooooO;
        this.f4394Ooooooo = constraintWidget.f4394Ooooooo;
        this.f4403o0OoOo0 = constraintWidget.f4403o0OoOo0;
        this.f4408ooOO = constraintWidget.f4408ooOO;
        this.f4396o00O0O = constraintWidget.f4396o00O0O;
        this.f4397o00Oo0 = constraintWidget.f4397o00Oo0;
        this.f4398o00Ooo = constraintWidget.f4398o00Ooo;
        this.f4399o00o0O = constraintWidget.f4399o00o0O;
        float[] fArr = constraintWidget.f4402o00ooo;
        float f = fArr[0];
        float[] fArr2 = this.f4402o00ooo;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.f4407oo000o;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.f4407oo000o;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.f4401o00oO0o;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.f4401o00oO0o;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.f4400o00oO0O;
        this.f4400o00oO0O = constraintWidget4 == null ? null : map.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.f4404o0ooOO0;
        this.f4404o0ooOO0 = constraintWidget5 != null ? map.get(constraintWidget5) : null;
    }

    public final void OooOO0o(androidx.constraintlayout.core.OooO0OO oooO0OO) {
        oooO0OO.OooOO0O(this.f4373Oooo0o0);
        oooO0OO.OooOO0O(this.f4372Oooo0o);
        oooO0OO.OooOO0O(this.f4374Oooo0oO);
        oooO0OO.OooOO0O(this.f4375Oooo0oo);
        if (this.f4389OooooOO > 0) {
            oooO0OO.OooOO0O(this.f4365Oooo);
        }
    }

    public ConstraintAnchor OooOOO(ConstraintAnchor.Type type) {
        switch (OooO00o.f4409OooO00o[type.ordinal()]) {
            case 1:
                return this.f4373Oooo0o0;
            case 2:
                return this.f4372Oooo0o;
            case 3:
                return this.f4374Oooo0oO;
            case 4:
                return this.f4375Oooo0oo;
            case 5:
                return this.f4365Oooo;
            case 6:
                return this.f4379OoooO0O;
            case 7:
                return this.f4378OoooO00;
            case 8:
                return this.f4377OoooO0;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final void OooOOO0() {
        if (this.f4338OooO0Oo == null) {
            this.f4338OooO0Oo = new OooOo(this);
        }
        if (this.f4340OooO0o0 == null) {
            this.f4340OooO0o0 = new Oooo0(this);
        }
    }

    public final DimensionBehaviour OooOOOO(int i) {
        if (i == 0) {
            return this.f4381OoooOOO[0];
        }
        if (i == 1) {
            return this.f4381OoooOOO[1];
        }
        return null;
    }

    public final int OooOOOo() {
        if (this.f4403o0OoOo0 == 8) {
            return 0;
        }
        return this.f4384OoooOoO;
    }

    public final ConstraintWidget OooOOo(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f4372Oooo0o).f4329OooO0o) != null && constraintAnchor2.f4329OooO0o == constraintAnchor) {
                return constraintAnchor2.f4328OooO0Oo;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f4373Oooo0o0;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4329OooO0o;
        if (constraintAnchor4 == null || constraintAnchor4.f4329OooO0o != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f4328OooO0Oo;
    }

    public final ConstraintWidget OooOOo0(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f4375Oooo0oo).f4329OooO0o) != null && constraintAnchor2.f4329OooO0o == constraintAnchor) {
                return constraintAnchor2.f4328OooO0Oo;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f4374Oooo0oO;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4329OooO0o;
        if (constraintAnchor4 == null || constraintAnchor4.f4329OooO0o != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f4328OooO0Oo;
    }

    public void OooOOoo(StringBuilder sb) {
        sb.append("  " + this.f4345OooOO0o + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f4383OoooOo0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f4384OoooOoO);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f4387Ooooo0o);
        sb.append("\n");
        sb.append("    actualTop:" + this.f4388OooooO0);
        sb.append("\n");
        OooOo0(sb, ViewHierarchyConstants.DIMENSION_LEFT_KEY, this.f4373Oooo0o0);
        OooOo0(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, this.f4372Oooo0o);
        OooOo0(sb, "right", this.f4374Oooo0oO);
        OooOo0(sb, "bottom", this.f4375Oooo0oo);
        OooOo0(sb, "baseline", this.f4365Oooo);
        OooOo0(sb, "centerX", this.f4378OoooO00);
        OooOo0(sb, "centerY", this.f4377OoooO0);
        int i = this.f4383OoooOo0;
        int i2 = this.f4390OooooOo;
        int i3 = this.f4364OooOooo[0];
        int i4 = this.f4357OooOo0o;
        int i5 = this.f4355OooOo00;
        float f = this.f4359OooOoO0;
        float[] fArr = this.f4402o00ooo;
        float f2 = fArr[0];
        OooOo00(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.f4384OoooOoO;
        int i7 = this.f4392Oooooo0;
        int i8 = this.f4364OooOooo[1];
        int i9 = this.f4358OooOoO;
        int i10 = this.f4354OooOo0;
        float f3 = this.f4362OooOoo0;
        float f4 = fArr[1];
        OooOo00(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.f4385OoooOoo;
        int i11 = this.f4386Ooooo00;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        Oooo0o(sb, "    horizontalBias", this.f4391Oooooo, 0.5f);
        Oooo0o(sb, "    verticalBias", this.f4393OoooooO, 0.5f);
        Oooo0o0(sb, this.f4398o00Ooo, 0, "    horizontalChainStyle");
        Oooo0o0(sb, this.f4399o00o0O, 0, "    verticalChainStyle");
        sb.append("  }");
    }

    public final int OooOo() {
        ConstraintWidget constraintWidget = this.f4382OoooOOo;
        return (constraintWidget == null || !(constraintWidget instanceof OooO0o)) ? this.f4388OooooO0 : ((OooO0o) constraintWidget).f4479o000000o + this.f4388OooooO0;
    }

    public final int OooOo0O() {
        if (this.f4403o0OoOo0 == 8) {
            return 0;
        }
        return this.f4383OoooOo0;
    }

    public final int OooOo0o() {
        ConstraintWidget constraintWidget = this.f4382OoooOOo;
        return (constraintWidget == null || !(constraintWidget instanceof OooO0o)) ? this.f4387Ooooo0o : ((OooO0o) constraintWidget).f4478o000000O + this.f4387Ooooo0o;
    }

    public final boolean OooOoO(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i == 0) {
            ConstraintAnchor constraintAnchor5 = this.f4373Oooo0o0;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4329OooO0o;
            if (constraintAnchor6 != null && constraintAnchor6.f4327OooO0OO && (constraintAnchor4 = (constraintAnchor3 = this.f4374Oooo0oO).f4329OooO0o) != null && constraintAnchor4.f4327OooO0OO) {
                return (constraintAnchor4.OooO0Oo() - constraintAnchor3.OooO0o0()) - (constraintAnchor5.OooO0o0() + constraintAnchor5.f4329OooO0o.OooO0Oo()) >= i2;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.f4372Oooo0o;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f4329OooO0o;
            if (constraintAnchor8 != null && constraintAnchor8.f4327OooO0OO && (constraintAnchor2 = (constraintAnchor = this.f4375Oooo0oo).f4329OooO0o) != null && constraintAnchor2.f4327OooO0OO) {
                return (constraintAnchor2.OooO0Oo() - constraintAnchor.OooO0o0()) - (constraintAnchor7.OooO0o0() + constraintAnchor7.f4329OooO0o.OooO0Oo()) >= i2;
            }
        }
        return false;
    }

    public final boolean OooOoO0(int i) {
        if (i == 0) {
            return (this.f4373Oooo0o0.f4329OooO0o != null ? 1 : 0) + (this.f4374Oooo0oO.f4329OooO0o != null ? 1 : 0) < 2;
        }
        return ((this.f4372Oooo0o.f4329OooO0o != null ? 1 : 0) + (this.f4375Oooo0oo.f4329OooO0o != null ? 1 : 0)) + (this.f4365Oooo.f4329OooO0o != null ? 1 : 0) < 2;
    }

    public final void OooOoOO(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        OooOOO(type).OooO0O0(constraintWidget.OooOOO(type2), i, i2, true);
    }

    public final boolean OooOoo() {
        ConstraintAnchor constraintAnchor = this.f4373Oooo0o0;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4329OooO0o;
        if (constraintAnchor2 != null && constraintAnchor2.f4329OooO0o == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f4374Oooo0oO;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4329OooO0o;
        return constraintAnchor4 != null && constraintAnchor4.f4329OooO0o == constraintAnchor3;
    }

    public final boolean OooOoo0(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f4376OoooO;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4329OooO0o;
        return (constraintAnchor4 == null || constraintAnchor4.f4329OooO0o == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f4329OooO0o) == null || constraintAnchor2.f4329OooO0o != constraintAnchor) ? false : true;
    }

    public final boolean OooOooO() {
        ConstraintAnchor constraintAnchor = this.f4372Oooo0o;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4329OooO0o;
        if (constraintAnchor2 != null && constraintAnchor2.f4329OooO0o == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f4375Oooo0oo;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4329OooO0o;
        return constraintAnchor4 != null && constraintAnchor4.f4329OooO0o == constraintAnchor3;
    }

    public final boolean OooOooo() {
        return this.f4341OooO0oO && this.f4403o0OoOo0 != 8;
    }

    public final void Oooo(int i, int i2) {
        if (this.f4346OooOOO) {
            return;
        }
        this.f4372Oooo0o.OooOO0o(i);
        this.f4375Oooo0oo.OooOO0o(i2);
        this.f4388OooooO0 = i;
        this.f4384OoooOoO = i2 - i;
        if (this.f4368Oooo00O) {
            this.f4365Oooo.OooOO0o(i + this.f4389OooooOO);
        }
        this.f4346OooOOO = true;
    }

    public final void Oooo0() {
        ConstraintWidget constraintWidget = this.f4382OoooOOo;
        if (constraintWidget != null && (constraintWidget instanceof OooO0o)) {
            ((OooO0o) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.f4380OoooOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooOO0();
        }
    }

    public boolean Oooo000() {
        return this.f4347OooOOO0 || (this.f4373Oooo0o0.f4327OooO0OO && this.f4374Oooo0oO.f4327OooO0OO);
    }

    public boolean Oooo00O() {
        return this.f4346OooOOO || (this.f4372Oooo0o.f4327OooO0OO && this.f4375Oooo0oo.f4327OooO0OO);
    }

    public void Oooo00o() {
        this.f4373Oooo0o0.OooOO0();
        this.f4372Oooo0o.OooOO0();
        this.f4374Oooo0oO.OooOO0();
        this.f4375Oooo0oo.OooOO0();
        this.f4365Oooo.OooOO0();
        this.f4378OoooO00.OooOO0();
        this.f4377OoooO0.OooOO0();
        this.f4379OoooO0O.OooOO0();
        this.f4382OoooOOo = null;
        this.f4367Oooo000 = 0.0f;
        this.f4383OoooOo0 = 0;
        this.f4384OoooOoO = 0;
        this.f4385OoooOoo = 0.0f;
        this.f4386Ooooo00 = -1;
        this.f4387Ooooo0o = 0;
        this.f4388OooooO0 = 0;
        this.f4389OooooOO = 0;
        this.f4390OooooOo = 0;
        this.f4392Oooooo0 = 0;
        this.f4391Oooooo = 0.5f;
        this.f4393OoooooO = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f4381OoooOOO;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f4394Ooooooo = null;
        this.f4403o0OoOo0 = 0;
        this.f4397o00Oo0 = null;
        this.f4398o00Ooo = 0;
        this.f4399o00o0O = 0;
        float[] fArr = this.f4402o00ooo;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4351OooOOo0 = -1;
        this.f4350OooOOo = -1;
        int[] iArr = this.f4364OooOooo;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4355OooOo00 = 0;
        this.f4354OooOo0 = 0;
        this.f4359OooOoO0 = 1.0f;
        this.f4362OooOoo0 = 1.0f;
        this.f4353OooOo = Integer.MAX_VALUE;
        this.f4360OooOoOO = Integer.MAX_VALUE;
        this.f4357OooOo0o = 0;
        this.f4358OooOoO = 0;
        this.f4361OooOoo = -1;
        this.f4363OooOooO = 1.0f;
        boolean[] zArr = this.f4339OooO0o;
        zArr[0] = true;
        zArr[1] = true;
        this.f4366Oooo0 = false;
        boolean[] zArr2 = this.f4395o000oOoO;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4341OooO0oO = true;
        int[] iArr2 = this.f4356OooOo0O;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4334OooO = -1;
        this.f4343OooOO0 = -1;
    }

    public final void Oooo0O0() {
        this.f4347OooOOO0 = false;
        this.f4346OooOOO = false;
        this.f4348OooOOOO = false;
        this.f4349OooOOOo = false;
        ArrayList<ConstraintAnchor> arrayList = this.f4380OoooOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i);
            constraintAnchor.f4327OooO0OO = false;
            constraintAnchor.f4326OooO0O0 = 0;
        }
    }

    public void Oooo0OO(oO0000o0 oo0000o0) {
        this.f4373Oooo0o0.OooOO0O();
        this.f4372Oooo0o.OooOO0O();
        this.f4374Oooo0oO.OooOO0O();
        this.f4375Oooo0oo.OooOO0O();
        this.f4365Oooo.OooOO0O();
        this.f4379OoooO0O.OooOO0O();
        this.f4378OoooO00.OooOO0O();
        this.f4377OoooO0.OooOO0O();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public final void Oooo0oO(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f4385OoooOoo = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f4385OoooOoo = fAbs;
            this.f4386Ooooo00 = i3;
        }
    }

    public final void Oooo0oo(int i, int i2) {
        if (this.f4347OooOOO0) {
            return;
        }
        this.f4373Oooo0o0.OooOO0o(i);
        this.f4374Oooo0oO.OooOO0o(i2);
        this.f4387Ooooo0o = i;
        this.f4383OoooOo0 = i2 - i;
        this.f4347OooOOO0 = true;
    }

    public final void OoooO(DimensionBehaviour dimensionBehaviour) {
        this.f4381OoooOOO[1] = dimensionBehaviour;
    }

    public final void OoooO0(DimensionBehaviour dimensionBehaviour) {
        this.f4381OoooOOO[0] = dimensionBehaviour;
    }

    public final void OoooO00(int i) {
        this.f4384OoooOoO = i;
        int i2 = this.f4392Oooooo0;
        if (i < i2) {
            this.f4384OoooOoO = i2;
        }
    }

    public final void OoooO0O(int i, float f, int i2, int i3) {
        this.f4355OooOo00 = i;
        this.f4357OooOo0o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f4353OooOo = i3;
        this.f4359OooOoO0 = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f4355OooOo00 = 2;
    }

    public final void OoooOO0(int i, float f, int i2, int i3) {
        this.f4354OooOo0 = i;
        this.f4358OooOoO = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f4360OooOoOO = i3;
        this.f4362OooOoo0 = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f4354OooOo0 = 2;
    }

    public void OoooOOO(boolean z, boolean z2) {
        int i;
        int i2;
        OooOo oooOo = this.f4338OooO0Oo;
        boolean z3 = z & oooOo.f41893OooO0oO;
        Oooo0 oooo0 = this.f4340OooO0o0;
        boolean z4 = z2 & oooo0.f41893OooO0oO;
        int i3 = oooOo.f41894OooO0oo.f41866OooO0oO;
        int i4 = oooo0.f41894OooO0oo.f41866OooO0oO;
        int i5 = oooOo.f41886OooO.f41866OooO0oO;
        int i6 = oooo0.f41886OooO.f41866OooO0oO;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f4387Ooooo0o = i3;
        }
        if (z4) {
            this.f4388OooooO0 = i4;
        }
        if (this.f4403o0OoOo0 == 8) {
            this.f4383OoooOo0 = 0;
            this.f4384OoooOoO = 0;
            return;
        }
        if (z3) {
            if (this.f4381OoooOOO[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f4383OoooOo0)) {
                i8 = i2;
            }
            this.f4383OoooOo0 = i8;
            int i10 = this.f4390OooooOo;
            if (i8 < i10) {
                this.f4383OoooOo0 = i10;
            }
        }
        if (z4) {
            if (this.f4381OoooOOO[1] == DimensionBehaviour.FIXED && i9 < (i = this.f4384OoooOoO)) {
                i9 = i;
            }
            this.f4384OoooOoO = i9;
            int i11 = this.f4392Oooooo0;
            if (i9 < i11) {
                this.f4384OoooOoO = i11;
            }
        }
    }

    public void OoooOOo(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        int i;
        int i2;
        Oooo0 oooo0;
        OooOo oooOo;
        oooO0OO.getClass();
        int iOooOOO = androidx.constraintlayout.core.OooO0OO.OooOOO(this.f4373Oooo0o0);
        int iOooOOO2 = androidx.constraintlayout.core.OooO0OO.OooOOO(this.f4372Oooo0o);
        int iOooOOO3 = androidx.constraintlayout.core.OooO0OO.OooOOO(this.f4374Oooo0oO);
        int iOooOOO4 = androidx.constraintlayout.core.OooO0OO.OooOOO(this.f4375Oooo0oo);
        if (z && (oooOo = this.f4338OooO0Oo) != null) {
            o0O0O00.OooOO0 oooOO1 = oooOo.f41894OooO0oo;
            if (oooOO1.f41868OooOO0) {
                o0O0O00.OooOO0 oooOO2 = oooOo.f41886OooO;
                if (oooOO2.f41868OooOO0) {
                    iOooOOO = oooOO1.f41866OooO0oO;
                    iOooOOO3 = oooOO2.f41866OooO0oO;
                }
            }
        }
        if (z && (oooo0 = this.f4340OooO0o0) != null) {
            o0O0O00.OooOO0 oooOO3 = oooo0.f41894OooO0oo;
            if (oooOO3.f41868OooOO0) {
                o0O0O00.OooOO0 oooOO4 = oooo0.f41886OooO;
                if (oooOO4.f41868OooOO0) {
                    iOooOOO2 = oooOO3.f41866OooO0oO;
                    iOooOOO4 = oooOO4.f41866OooO0oO;
                }
            }
        }
        int i3 = iOooOOO4 - iOooOOO2;
        if (iOooOOO3 - iOooOOO < 0 || i3 < 0 || iOooOOO == Integer.MIN_VALUE || iOooOOO == Integer.MAX_VALUE || iOooOOO2 == Integer.MIN_VALUE || iOooOOO2 == Integer.MAX_VALUE || iOooOOO3 == Integer.MIN_VALUE || iOooOOO3 == Integer.MAX_VALUE || iOooOOO4 == Integer.MIN_VALUE || iOooOOO4 == Integer.MAX_VALUE) {
            iOooOOO = 0;
            iOooOOO2 = 0;
            iOooOOO3 = 0;
            iOooOOO4 = 0;
        }
        int i4 = iOooOOO3 - iOooOOO;
        int i5 = iOooOOO4 - iOooOOO2;
        this.f4387Ooooo0o = iOooOOO;
        this.f4388OooooO0 = iOooOOO2;
        if (this.f4403o0OoOo0 == 8) {
            this.f4383OoooOo0 = 0;
            this.f4384OoooOoO = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f4381OoooOOO;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.f4383OoooOo0)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.f4384OoooOoO)) {
            i5 = i;
        }
        this.f4383OoooOo0 = i4;
        this.f4384OoooOoO = i5;
        int i6 = this.f4392Oooooo0;
        if (i5 < i6) {
            this.f4384OoooOoO = i6;
        }
        int i7 = this.f4390OooooOo;
        if (i4 < i7) {
            this.f4383OoooOo0 = i7;
        }
        int i8 = this.f4353OooOo;
        if (i8 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f4383OoooOo0 = Math.min(this.f4383OoooOo0, i8);
        }
        int i9 = this.f4360OooOoOO;
        if (i9 > 0 && this.f4381OoooOOO[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f4384OoooOoO = Math.min(this.f4384OoooOoO, i9);
        }
        int i10 = this.f4383OoooOo0;
        if (i4 != i10) {
            this.f4334OooO = i10;
        }
        int i11 = this.f4384OoooOoO;
        if (i5 != i11) {
            this.f4343OooOO0 = i11;
        }
    }

    public final void o000oOoO(int i) {
        this.f4383OoooOo0 = i;
        int i2 = this.f4390OooooOo;
        if (i < i2) {
            this.f4383OoooOo0 = i2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4397o00Oo0 != null ? o0O00o0.OooO0O0(new StringBuilder("type: "), this.f4397o00Oo0, ZegoConstants.ZegoVideoDataAuxPublishingStream) : "");
        sb.append(this.f4396o00O0O != null ? o0O00o0.OooO0O0(new StringBuilder("id: "), this.f4396o00O0O, ZegoConstants.ZegoVideoDataAuxPublishingStream) : "");
        sb.append("(");
        sb.append(this.f4387Ooooo0o);
        sb.append(", ");
        sb.append(this.f4388OooooO0);
        sb.append(") - (");
        sb.append(this.f4383OoooOo0);
        sb.append(" x ");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f4384OoooOoO, ")");
    }

    public ConstraintWidget(int i, int i2) {
        this.f4335OooO00o = false;
        this.f4338OooO0Oo = null;
        this.f4340OooO0o0 = null;
        this.f4339OooO0o = new boolean[]{true, true};
        this.f4341OooO0oO = true;
        this.f4342OooO0oo = true;
        this.f4334OooO = -1;
        this.f4343OooOO0 = -1;
        this.f4344OooOO0O = new o0OO00O.OooO0O0(this);
        this.f4347OooOOO0 = false;
        this.f4346OooOOO = false;
        this.f4348OooOOOO = false;
        this.f4349OooOOOo = false;
        this.f4351OooOOo0 = -1;
        this.f4350OooOOo = -1;
        this.f4352OooOOoo = 0;
        this.f4355OooOo00 = 0;
        this.f4354OooOo0 = 0;
        this.f4356OooOo0O = new int[2];
        this.f4357OooOo0o = 0;
        this.f4353OooOo = 0;
        this.f4359OooOoO0 = 1.0f;
        this.f4358OooOoO = 0;
        this.f4360OooOoOO = 0;
        this.f4362OooOoo0 = 1.0f;
        this.f4361OooOoo = -1;
        this.f4363OooOooO = 1.0f;
        this.f4364OooOooo = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4367Oooo000 = 0.0f;
        this.f4368Oooo00O = false;
        this.f4366Oooo0 = false;
        this.f4370Oooo0O0 = 0;
        this.f4371Oooo0OO = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f4373Oooo0o0 = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f4372Oooo0o = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f4374Oooo0oO = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f4375Oooo0oo = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f4365Oooo = constraintAnchor5;
        this.f4378OoooO00 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f4377OoooO0 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f4379OoooO0O = constraintAnchor6;
        this.f4376OoooO = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f4380OoooOO0 = new ArrayList<>();
        this.f4395o000oOoO = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f4381OoooOOO = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f4382OoooOOo = null;
        this.f4385OoooOoo = 0.0f;
        this.f4386Ooooo00 = -1;
        this.f4389OooooOO = 0;
        this.f4391Oooooo = 0.5f;
        this.f4393OoooooO = 0.5f;
        this.f4403o0OoOo0 = 0;
        this.f4408ooOO = false;
        this.f4396o00O0O = null;
        this.f4397o00Oo0 = null;
        this.f4398o00Ooo = 0;
        this.f4399o00o0O = 0;
        this.f4402o00ooo = new float[]{-1.0f, -1.0f};
        this.f4407oo000o = new ConstraintWidget[]{null, null};
        this.f4401o00oO0o = new ConstraintWidget[]{null, null};
        this.f4400o00oO0O = null;
        this.f4404o0ooOO0 = null;
        this.f4405o0ooOOo = -1;
        this.f4406o0ooOoO = -1;
        this.f4387Ooooo0o = 0;
        this.f4388OooooO0 = 0;
        this.f4383OoooOo0 = i;
        this.f4384OoooOoO = i2;
        OooO0Oo();
    }
}
