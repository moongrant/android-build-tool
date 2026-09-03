package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import o0O0O00.o0ooOOo;
import p023Oooo00O.o00O0;
import p056o0000Oo.o0000Ooo;
import p061o0000o0.Oooo000;
import p061o0000o0.o00O0O;
import p061o0000o0.o0OO00O;
import p061o0000o0.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6900OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f6901OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Oooo000 f6902OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Oooo000 f6903OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0OOO0o f6904OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean[] f6905OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0OO00O f6906OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f6907OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f6908OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f6909OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o0000Ooo f6910OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f6911OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f6912OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f6913OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f6914OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f6915OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f6916OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f6917OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f6918OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f6919OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f6920OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f6921OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int[] f6922OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f6923OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f6924OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f6925OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f6926OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f6927OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f6928OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f6929OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int[] f6930OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ConstraintAnchor f6931Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f6932Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f6933Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f6934Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f6935Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f6936Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f6937Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ConstraintAnchor f6938Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ConstraintAnchor f6939Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ConstraintAnchor f6940Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ConstraintAnchor f6941Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ConstraintAnchor[] f6942OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ConstraintAnchor f6943OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ConstraintAnchor f6944OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ConstraintAnchor f6945OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ArrayList<ConstraintAnchor> f6946OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public DimensionBehaviour[] f6947OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ConstraintWidget f6948OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f6949OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f6950OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f6951OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f6952Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f6953Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f6954OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f6955OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f6956OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f6957Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f6958Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public float f6959OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public Object f6960Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean[] f6961o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public String f6962o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public String f6963o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f6964o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f6965o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public ConstraintWidget f6966o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public ConstraintWidget[] f6967o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float[] f6968o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f6969o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public ConstraintWidget f6970o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f6971o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f6972o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public ConstraintWidget[] f6973oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f6974ooOO;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f6975OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f6976OooO0O0;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f6976OooO0O0 = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6976OooO0O0[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6976OooO0O0[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6976OooO0O0[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f6975OooO00o = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6975OooO00o[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.f6901OooO00o = false;
        this.f6904OooO0Oo = null;
        this.f6906OooO0o0 = null;
        this.f6905OooO0o = new boolean[]{true, true};
        this.f6907OooO0oO = true;
        this.f6908OooO0oo = true;
        this.f6900OooO = -1;
        this.f6909OooOO0 = -1;
        this.f6910OooOO0O = new o0000Ooo(this);
        this.f6913OooOOO0 = false;
        this.f6912OooOOO = false;
        this.f6914OooOOOO = false;
        this.f6915OooOOOo = false;
        this.f6917OooOOo0 = -1;
        this.f6916OooOOo = -1;
        this.f6918OooOOoo = 0;
        this.f6921OooOo00 = 0;
        this.f6920OooOo0 = 0;
        this.f6922OooOo0O = new int[2];
        this.f6923OooOo0o = 0;
        this.f6919OooOo = 0;
        this.f6925OooOoO0 = 1.0f;
        this.f6924OooOoO = 0;
        this.f6926OooOoOO = 0;
        this.f6928OooOoo0 = 1.0f;
        this.f6927OooOoo = -1;
        this.f6929OooOooO = 1.0f;
        this.f6930OooOooo = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f6933Oooo000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6934Oooo00O = false;
        this.f6932Oooo0 = false;
        this.f6936Oooo0O0 = 0;
        this.f6937Oooo0OO = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f6939Oooo0o0 = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f6938Oooo0o = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f6940Oooo0oO = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f6941Oooo0oo = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f6931Oooo = constraintAnchor5;
        this.f6944OoooO00 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f6943OoooO0 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f6945OoooO0O = constraintAnchor6;
        this.f6942OoooO = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f6946OoooOO0 = new ArrayList<>();
        this.f6961o000oOoO = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f6947OoooOOO = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f6948OoooOOo = null;
        this.f6949OoooOo0 = 0;
        this.f6950OoooOoO = 0;
        this.f6951OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6952Ooooo00 = -1;
        this.f6953Ooooo0o = 0;
        this.f6954OooooO0 = 0;
        this.f6955OooooOO = 0;
        this.f6957Oooooo = 0.5f;
        this.f6959OoooooO = 0.5f;
        this.f6969o0OoOo0 = 0;
        this.f6974ooOO = false;
        this.f6962o00O0O = null;
        this.f6963o00Oo0 = null;
        this.f6964o00Ooo = 0;
        this.f6965o00o0O = 0;
        this.f6968o00ooo = new float[]{-1.0f, -1.0f};
        this.f6973oo000o = new ConstraintWidget[]{null, null};
        this.f6967o00oO0o = new ConstraintWidget[]{null, null};
        this.f6966o00oO0O = null;
        this.f6970o0ooOO0 = null;
        this.f6971o0ooOOo = -1;
        this.f6972o0ooOoO = -1;
        OooO0Oo();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:102:0x015c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0180  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:237:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:239:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:245:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:247:0x041b  */
    /* JADX WARN: Code duplicated, block: B:255:0x043e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0455  */
    /* JADX WARN: Code duplicated, block: B:268:0x046f  */
    /* JADX WARN: Code duplicated, block: B:278:0x0489  */
    /* JADX WARN: Code duplicated, block: B:281:0x0491  */
    /* JADX WARN: Code duplicated, block: B:282:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:304:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:306:0x04c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:312:0x04da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:314:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:316:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:317:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:319:0x04ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:339:0x051c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:341:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:360:0x055b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:370:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    /* JADX WARN: Code duplicated, block: B:91:0x0138  */
    /* JADX WARN: Code duplicated, block: B:94:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x013f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    public final void OooO(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int iMin;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        SolverVariable solverVariableOooOO0o;
        SolverVariable solverVariableOooOO0o2;
        boolean z14;
        int i18;
        char c;
        int i19;
        char c2;
        ConstraintAnchor constraintAnchor3;
        int iOooO0o0;
        int i20;
        int i21;
        int i22;
        boolean z15;
        boolean z16;
        int i23;
        boolean z17;
        boolean z18;
        SolverVariable solverVariable3;
        int i24;
        boolean z19;
        boolean z20;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable5;
        ConstraintWidget constraintWidget3;
        int i25;
        int i26;
        int iOooO0o1;
        int iMin2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33 = i8;
        SolverVariable solverVariableOooOO0o3 = oooO0OO.OooOO0o(constraintAnchor);
        SolverVariable solverVariableOooOO0o4 = oooO0OO.OooOO0o(constraintAnchor2);
        SolverVariable solverVariableOooOO0o5 = oooO0OO.OooOO0o(constraintAnchor.f6895OooO0o);
        SolverVariable solverVariableOooOO0o6 = oooO0OO.OooOO0o(constraintAnchor2.f6895OooO0o);
        boolean zOooO = constraintAnchor.OooO();
        boolean zOooO2 = constraintAnchor2.OooO();
        boolean zOooO3 = this.f6945OoooO0O.OooO();
        int i34 = zOooO2 ? (zOooO ? 1 : 0) + 1 : zOooO ? 1 : 0;
        if (zOooO3) {
            i34++;
        }
        int i35 = z6 ? 3 : i5;
        int i36 = OooO00o.f6976OooO0O0[dimensionBehaviour.ordinal()];
        if (i36 != 1 && i36 != 2 && i36 != 3 && i36 == 4) {
            i9 = i35;
            z12 = i9 != 4;
            i10 = this.f6900OooO;
            if (i10 != -1 && z) {
                this.f6900OooO = -1;
                i2 = i10;
                z12 = false;
            }
            i11 = this.f6909OooOO0;
            if (i11 != -1 || z) {
                i11 = i2;
            } else {
                this.f6909OooOO0 = -1;
                z12 = false;
            }
            i12 = i11;
            if (this.f6969o0OoOo0 == 8) {
                iMin = 0;
                z12 = false;
            } else {
                iMin = i12;
            }
            if (!z11) {
                if (zOooO && !zOooO2 && !zOooO3) {
                    oooO0OO.OooO0o0(solverVariableOooOO0o3, i);
                } else if (!zOooO && !zOooO2) {
                    oooO0OO.OooO0Oo(solverVariableOooOO0o3, solverVariableOooOO0o5, constraintAnchor.OooO0o0(), 8);
                }
            }
            if (!z12) {
                if (i34 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                    int iMax = Math.max(i7, iMin);
                    if (i33 > 0) {
                        iMax = Math.min(i33, iMax);
                    }
                    oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMax, 8);
                    i17 = i7;
                    z13 = false;
                    i16 = i34;
                } else {
                    if (i7 == -2) {
                        i13 = iMin;
                    } else {
                        i13 = i7;
                    }
                    if (i33 == -2) {
                        i14 = iMin;
                    } else {
                        i14 = i33;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i13 > 0) {
                        oooO0OO.OooO0o(solverVariableOooOO0o4, solverVariableOooOO0o3, i13, 8);
                        iMin = Math.max(iMin, i13);
                    }
                    if (i14 > 0) {
                        if (z2 || i9 != 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i15 = 8;
                            oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, i14, 8);
                        } else {
                            i15 = 8;
                        }
                        iMin = Math.min(iMin, i14);
                    } else {
                        i15 = 8;
                    }
                    if (i9 == 1) {
                        if (z2) {
                            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, i15);
                        } else if (z8) {
                            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, 5);
                            oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, i15);
                        } else {
                            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, 5);
                            oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, i15);
                        }
                        i33 = i14;
                        i17 = i13;
                    } else if (i9 == 2) {
                        type = constraintAnchor.f6896OooO0o0;
                        type2 = ConstraintAnchor.Type.TOP;
                        if (type != type2 || type == ConstraintAnchor.Type.BOTTOM) {
                            solverVariableOooOO0o = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(type2));
                            solverVariableOooOO0o2 = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            solverVariableOooOO0o = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(ConstraintAnchor.Type.LEFT));
                            solverVariableOooOO0o2 = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(ConstraintAnchor.Type.RIGHT));
                        }
                        SolverVariable solverVariable6 = solverVariableOooOO0o2;
                        androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO0 = oooO0OO.OooOOO0();
                        int i37 = i14;
                        int i38 = i13;
                        solverVariableOooOO0o6 = solverVariableOooOO0o6;
                        i16 = i34 == true ? 1 : 0;
                        solverVariableOooOO0o5 = solverVariableOooOO0o5;
                        solverVariableOooOO0o4 = solverVariableOooOO0o4;
                        oooO0O0OooOOO0.OooO0OO(solverVariableOooOO0o4, solverVariableOooOO0o3, solverVariable6, solverVariableOooOO0o, f2);
                        oooO0OO.OooO0OO(oooO0O0OooOOO0);
                        if (z2) {
                            z12 = false;
                        }
                        i33 = i37;
                        i17 = i38;
                        z13 = z12;
                        z4 = z4;
                    } else {
                        int i39 = i13;
                        solverVariableOooOO0o5 = solverVariableOooOO0o5;
                        solverVariableOooOO0o4 = solverVariableOooOO0o4;
                        solverVariableOooOO0o6 = solverVariableOooOO0o6;
                        i16 = i34;
                        i33 = i14;
                        i17 = i39;
                        z13 = z12;
                        z4 = true;
                    }
                }
                if (z11 || z8) {
                    i18 = 0;
                    c = 2;
                    i19 = 8;
                    c2 = 1;
                    if (i16 >= c && z2 && z4) {
                        oooO0OO.OooO0o(solverVariableOooOO0o3, solverVariable, i18, i19);
                        boolean z21 = z || this.f6931Oooo.f6895OooO0o == null;
                        if (!z && (constraintAnchor3 = this.f6931Oooo.f6895OooO0o) != null) {
                            ConstraintWidget constraintWidget4 = constraintAnchor3.f6894OooO0Oo;
                            if (constraintWidget4.f6951OoooOoo != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.f6947OoooOOO;
                                DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i18];
                                DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[c2] == dimensionBehaviour3) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                            } else {
                                z21 = false;
                            }
                        }
                        if (z21) {
                            oooO0OO.OooO0o(solverVariable2, solverVariableOooOO0o4, i18, i19);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (zOooO || zOooO2 || zOooO3) {
                    if (!zOooO || zOooO2) {
                        if (zOooO || !zOooO2) {
                            iOooO0o0 = 0;
                            if (zOooO && zOooO2) {
                                ConstraintWidget constraintWidget5 = constraintAnchor.f6895OooO0o.f6894OooO0Oo;
                                ConstraintWidget constraintWidget6 = constraintAnchor2.f6895OooO0o.f6894OooO0Oo;
                                ConstraintWidget constraintWidget7 = this.f6948OoooOOo;
                                if (z13) {
                                    if (i9 == 0) {
                                        if (i33 != 0 || i17 != 0) {
                                            i31 = 5;
                                            i32 = 5;
                                            z15 = true;
                                            z17 = false;
                                            z16 = true;
                                        } else if (solverVariableOooOO0o5.f6828OoooO0 && solverVariableOooOO0o6.f6828OoooO0) {
                                            oooO0OO.OooO0Oo(solverVariableOooOO0o3, solverVariableOooOO0o5, constraintAnchor.OooO0o0(), 8);
                                            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), 8);
                                            return;
                                        } else {
                                            i31 = 8;
                                            i32 = 8;
                                            z15 = false;
                                            z17 = true;
                                            z16 = false;
                                        }
                                        if ((constraintWidget5 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.OooO00o)) {
                                            i21 = 6;
                                            i22 = 4;
                                        } else {
                                            i22 = i32;
                                            i21 = 6;
                                        }
                                        i23 = i31;
                                    } else if (i9 == 2) {
                                        if (!(constraintWidget5 instanceof androidx.constraintlayout.core.widgets.OooO00o) && !(constraintWidget6 instanceof androidx.constraintlayout.core.widgets.OooO00o)) {
                                            solverVariable2 = solverVariable2;
                                            i21 = 6;
                                            i22 = 5;
                                        }
                                        i23 = 5;
                                        z16 = true;
                                        z15 = true;
                                        z17 = false;
                                    } else if (i9 == 1) {
                                        solverVariable2 = solverVariable2;
                                        i21 = 6;
                                        i22 = 4;
                                        i23 = 8;
                                        z16 = true;
                                        z15 = true;
                                        z17 = false;
                                    } else if (i9 == 3) {
                                        if (this.f6927OooOoo == -1) {
                                            if (z9) {
                                                solverVariable2 = solverVariable2;
                                                i21 = z2 ? 5 : 4;
                                            } else {
                                                solverVariable2 = solverVariable2;
                                                i21 = 8;
                                            }
                                            i22 = 5;
                                            i23 = 8;
                                        } else if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i29 = 5;
                                                i30 = 4;
                                            } else {
                                                i29 = 8;
                                                i30 = 5;
                                            }
                                            i23 = i29;
                                            i22 = i30;
                                            i21 = 6;
                                            z16 = true;
                                            z15 = true;
                                            z17 = true;
                                            solverVariable2 = solverVariable2;
                                        } else {
                                            if (i33 > 0) {
                                                i21 = 6;
                                                i22 = 5;
                                            } else if (i33 != 0 || i17 != 0) {
                                                i21 = 6;
                                                i22 = 4;
                                            } else if (z9) {
                                                solverVariable2 = solverVariable2;
                                                i23 = (constraintWidget5 == constraintWidget7 || constraintWidget6 == constraintWidget7) ? 5 : 4;
                                                i21 = 6;
                                                i22 = 4;
                                            } else {
                                                i21 = 6;
                                                i22 = 8;
                                            }
                                            i23 = 5;
                                        }
                                        z16 = true;
                                        z15 = true;
                                        z17 = true;
                                    } else {
                                        solverVariable2 = solverVariable2;
                                        i21 = 6;
                                        i22 = 4;
                                        i23 = 5;
                                        z16 = false;
                                        z15 = false;
                                        z17 = false;
                                    }
                                    if (z16 || solverVariableOooOO0o5 != solverVariableOooOO0o6 || constraintWidget5 == constraintWidget7) {
                                        z18 = true;
                                    } else {
                                        z16 = false;
                                        z18 = false;
                                    }
                                    if (z15) {
                                        if (z13 && !z7 && !z9 && solverVariableOooOO0o5 == solverVariable && solverVariableOooOO0o6 == solverVariable2) {
                                            z19 = false;
                                            i23 = 8;
                                            i28 = 8;
                                            z18 = false;
                                        } else {
                                            i28 = i21;
                                            z19 = z2;
                                        }
                                        solverVariable3 = solverVariableOooOO0o5;
                                        i24 = 8;
                                        oooO0OO.OooO0O0(solverVariableOooOO0o3, solverVariable3, constraintAnchor.OooO0o0(), f, solverVariableOooOO0o6, solverVariableOooOO0o4, constraintAnchor2.OooO0o0(), i28);
                                    } else {
                                        solverVariable3 = solverVariableOooOO0o5;
                                        i24 = 8;
                                        z19 = z2;
                                    }
                                    z20 = z18;
                                    if (this.f6969o0OoOo0 != i24 && !constraintAnchor2.OooO0oo()) {
                                        return;
                                    }
                                    solverVariable4 = solverVariable3;
                                    if (z16) {
                                        if (z19 || solverVariable4 == solverVariableOooOO0o6 || z13) {
                                            constraintWidget = constraintWidget6;
                                            constraintWidget2 = constraintWidget5;
                                        } else {
                                            constraintWidget2 = constraintWidget5;
                                            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.OooO00o) {
                                                constraintWidget = constraintWidget6;
                                            } else {
                                                constraintWidget = constraintWidget6;
                                                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
                                                }
                                                solverVariable5 = solverVariableOooOO0o3;
                                                oooO0OO.OooO0o(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), i27);
                                                oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), i27);
                                                i23 = i27;
                                            }
                                            i27 = 6;
                                            solverVariable5 = solverVariableOooOO0o3;
                                            oooO0OO.OooO0o(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), i27);
                                            oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), i27);
                                            i23 = i27;
                                        }
                                        i27 = i23;
                                        solverVariable5 = solverVariableOooOO0o3;
                                        oooO0OO.OooO0o(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), i27);
                                        oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), i27);
                                        i23 = i27;
                                    } else {
                                        constraintWidget = constraintWidget6;
                                        constraintWidget2 = constraintWidget5;
                                        solverVariable5 = solverVariableOooOO0o3;
                                    }
                                    if (z19 || !z10 || (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o)) {
                                        constraintWidget3 = constraintWidget7;
                                    } else {
                                        constraintWidget3 = constraintWidget7;
                                        if (constraintWidget != constraintWidget3) {
                                            z20 = true;
                                            i25 = 6;
                                            i26 = 6;
                                        }
                                        if (z20) {
                                            if (z17 || (z9 && !z3)) {
                                                iMin2 = i25;
                                            } else {
                                                int i40 = (constraintWidget2 == constraintWidget3 || constraintWidget == constraintWidget3) ? 6 : i25;
                                                if ((constraintWidget2 instanceof OooOO0) || (constraintWidget instanceof OooOO0)) {
                                                    i40 = 5;
                                                }
                                                if ((constraintWidget2 instanceof androidx.constraintlayout.core.widgets.OooO00o) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o)) {
                                                    i40 = 5;
                                                }
                                                if (z9) {
                                                    i40 = 5;
                                                }
                                                iMin2 = Math.max(i40, i25);
                                            }
                                            if (z19) {
                                                iMin2 = Math.min(i26, iMin2);
                                                if (z6 && !z9 && (constraintWidget2 == constraintWidget3 || constraintWidget == constraintWidget3)) {
                                                    iMin2 = 4;
                                                }
                                            }
                                            oooO0OO.OooO0Oo(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), iMin2);
                                            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), iMin2);
                                        }
                                        if (z19) {
                                            if (solverVariable == solverVariable4) {
                                                iOooO0o1 = constraintAnchor.OooO0o0();
                                            } else {
                                                iOooO0o1 = 0;
                                            }
                                            if (solverVariable4 != solverVariable) {
                                                i20 = 5;
                                                oooO0OO.OooO0o(solverVariable5, solverVariable, iOooO0o1, 5);
                                            } else {
                                                i20 = 5;
                                            }
                                        } else {
                                            i20 = 5;
                                        }
                                        if (!z19 && z13) {
                                            solverVariableOooOO0o6 = solverVariableOooOO0o6;
                                            if (i3 == 0 && i17 == 0) {
                                                if (z13 && i9 == 3) {
                                                    iOooO0o0 = 0;
                                                    oooO0OO.OooO0o(solverVariableOooOO0o4, solverVariable5, 0, i24);
                                                } else {
                                                    iOooO0o0 = 0;
                                                    oooO0OO.OooO0o(solverVariableOooOO0o4, solverVariable5, 0, i20);
                                                }
                                            }
                                        }
                                        iOooO0o0 = 0;
                                    }
                                    i25 = i22;
                                    i26 = i23;
                                    if (z20) {
                                        if (z17) {
                                            iMin2 = i25;
                                        } else {
                                            iMin2 = i25;
                                        }
                                        if (z19) {
                                            iMin2 = Math.min(i26, iMin2);
                                            if (z6) {
                                                iMin2 = 4;
                                            }
                                        }
                                        oooO0OO.OooO0Oo(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), iMin2);
                                        oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), iMin2);
                                    }
                                    if (z19) {
                                        i20 = 5;
                                    } else {
                                        if (solverVariable == solverVariable4) {
                                            iOooO0o1 = constraintAnchor.OooO0o0();
                                        } else {
                                            iOooO0o1 = 0;
                                        }
                                        if (solverVariable4 != solverVariable) {
                                            i20 = 5;
                                            oooO0OO.OooO0o(solverVariable5, solverVariable, iOooO0o1, 5);
                                        } else {
                                            i20 = 5;
                                        }
                                    }
                                    if (!z19) {
                                    }
                                } else if (solverVariableOooOO0o5.f6828OoooO0 && solverVariableOooOO0o6.f6828OoooO0) {
                                    oooO0OO.OooO0O0(solverVariableOooOO0o3, solverVariableOooOO0o5, constraintAnchor.OooO0o0(), f, solverVariableOooOO0o6, solverVariableOooOO0o4, constraintAnchor2.OooO0o0(), 8);
                                    if (z2 && z4) {
                                        int iOooO0o2 = constraintAnchor2.f6895OooO0o != null ? constraintAnchor2.OooO0o0() : 0;
                                        if (solverVariableOooOO0o6 != solverVariable2) {
                                            oooO0OO.OooO0o(solverVariable2, solverVariableOooOO0o4, iOooO0o2, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                i21 = 6;
                                i22 = 4;
                                i23 = 5;
                                z16 = true;
                                z15 = true;
                                z17 = false;
                                if (z16) {
                                    z18 = true;
                                } else {
                                    z18 = true;
                                }
                                if (z15) {
                                    if (z13) {
                                        i28 = i21;
                                        z19 = z2;
                                    } else {
                                        i28 = i21;
                                        z19 = z2;
                                    }
                                    solverVariable3 = solverVariableOooOO0o5;
                                    i24 = 8;
                                    oooO0OO.OooO0O0(solverVariableOooOO0o3, solverVariable3, constraintAnchor.OooO0o0(), f, solverVariableOooOO0o6, solverVariableOooOO0o4, constraintAnchor2.OooO0o0(), i28);
                                } else {
                                    solverVariable3 = solverVariableOooOO0o5;
                                    i24 = 8;
                                    z19 = z2;
                                }
                                z20 = z18;
                                if (this.f6969o0OoOo0 != i24) {
                                }
                                solverVariable4 = solverVariable3;
                                if (z16) {
                                    if (z19) {
                                        constraintWidget = constraintWidget6;
                                        constraintWidget2 = constraintWidget5;
                                        i27 = i23;
                                    } else {
                                        constraintWidget = constraintWidget6;
                                        constraintWidget2 = constraintWidget5;
                                        i27 = i23;
                                    }
                                    solverVariable5 = solverVariableOooOO0o3;
                                    oooO0OO.OooO0o(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), i27);
                                    oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), i27);
                                    i23 = i27;
                                } else {
                                    constraintWidget = constraintWidget6;
                                    constraintWidget2 = constraintWidget5;
                                    solverVariable5 = solverVariableOooOO0o3;
                                }
                                if (z19) {
                                    constraintWidget3 = constraintWidget7;
                                    i25 = i22;
                                    i26 = i23;
                                } else {
                                    constraintWidget3 = constraintWidget7;
                                    i25 = i22;
                                    i26 = i23;
                                }
                                if (z20) {
                                    if (z17) {
                                        iMin2 = i25;
                                    } else {
                                        iMin2 = i25;
                                    }
                                    if (z19) {
                                        iMin2 = Math.min(i26, iMin2);
                                        if (z6) {
                                            iMin2 = 4;
                                        }
                                    }
                                    oooO0OO.OooO0Oo(solverVariable5, solverVariable4, constraintAnchor.OooO0o0(), iMin2);
                                    oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), iMin2);
                                }
                                if (z19) {
                                    i20 = 5;
                                } else {
                                    if (solverVariable == solverVariable4) {
                                        iOooO0o1 = constraintAnchor.OooO0o0();
                                    } else {
                                        iOooO0o1 = 0;
                                    }
                                    if (solverVariable4 != solverVariable) {
                                        i20 = 5;
                                        oooO0OO.OooO0o(solverVariable5, solverVariable, iOooO0o1, 5);
                                    } else {
                                        i20 = 5;
                                    }
                                }
                                if (!z19) {
                                }
                            } else {
                                i20 = 5;
                            }
                        } else {
                            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o6, -constraintAnchor2.OooO0o0(), 8);
                            if (z2) {
                                i20 = 5;
                                iOooO0o0 = 0;
                                oooO0OO.OooO0o(solverVariableOooOO0o3, solverVariable, 0, 5);
                            } else {
                                i20 = 5;
                                iOooO0o0 = 0;
                            }
                        }
                        z19 = z2;
                    } else {
                        z19 = z2;
                        i20 = (z2 && (constraintAnchor.f6895OooO0o.f6894OooO0Oo instanceof androidx.constraintlayout.core.widgets.OooO00o)) ? 8 : 5;
                    }
                    solverVariableOooOO0o6 = solverVariableOooOO0o6;
                    iOooO0o0 = 0;
                } else {
                    i20 = 5;
                    iOooO0o0 = 0;
                    z19 = z2;
                }
                if (z19 && z4) {
                    if (constraintAnchor2.f6895OooO0o != null) {
                        iOooO0o0 = constraintAnchor2.OooO0o0();
                    }
                    if (solverVariableOooOO0o6 != solverVariable2) {
                        oooO0OO.OooO0o(solverVariable2, solverVariableOooOO0o4, iOooO0o0, i20);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z5) {
                oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, 0, 3);
                if (i3 > 0) {
                    oooO0OO.OooO0o(solverVariableOooOO0o4, solverVariableOooOO0o3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, i4, 8);
                }
            } else {
                oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, 8);
            }
            i17 = i7;
            z13 = z12;
            i16 = i34;
            if (z11) {
                i18 = 0;
                c = 2;
                i19 = 8;
                c2 = 1;
            } else {
                i18 = 0;
                c = 2;
                i19 = 8;
                c2 = 1;
            }
            if (i16 >= c) {
            }
        }
        i9 = i35;
        i10 = this.f6900OooO;
        if (i10 != -1) {
            this.f6900OooO = -1;
            i2 = i10;
            z12 = false;
        }
        i11 = this.f6909OooOO0;
        if (i11 != -1) {
            i11 = i2;
        } else {
            i11 = i2;
        }
        i12 = i11;
        if (this.f6969o0OoOo0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            iMin = i12;
        }
        if (!z11) {
            if (zOooO) {
                if (!zOooO) {
                }
            } else if (!zOooO) {
            }
        }
        if (!z12) {
            if (i34 == 2) {
            }
            if (i7 == -2) {
                i13 = iMin;
            } else {
                i13 = i7;
            }
            if (i33 == -2) {
                i14 = iMin;
            } else {
                i14 = i33;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i13 > 0) {
                oooO0OO.OooO0o(solverVariableOooOO0o4, solverVariableOooOO0o3, i13, 8);
                iMin = Math.max(iMin, i13);
            }
            if (i14 > 0) {
                if (z2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z14) {
                    i15 = 8;
                    oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, i14, 8);
                } else {
                    i15 = 8;
                }
                iMin = Math.min(iMin, i14);
            } else {
                i15 = 8;
            }
            if (i9 == 1) {
                if (z2) {
                    oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, i15);
                } else if (z8) {
                    oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, 5);
                    oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, i15);
                } else {
                    oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, 5);
                    oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, i15);
                }
                i33 = i14;
                i17 = i13;
            } else if (i9 == 2) {
                type = constraintAnchor.f6896OooO0o0;
                type2 = ConstraintAnchor.Type.TOP;
                if (type != type2) {
                    solverVariableOooOO0o = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(type2));
                    solverVariableOooOO0o2 = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableOooOO0o = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(type2));
                    solverVariableOooOO0o2 = oooO0OO.OooOO0o(this.f6948OoooOOo.OooOOOO(ConstraintAnchor.Type.BOTTOM));
                }
                SolverVariable solverVariable7 = solverVariableOooOO0o2;
                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO1 = oooO0OO.OooOOO0();
                int i310 = i14;
                int i311 = i13;
                solverVariableOooOO0o6 = solverVariableOooOO0o6;
                i16 = i34 == true ? 1 : 0;
                solverVariableOooOO0o5 = solverVariableOooOO0o5;
                solverVariableOooOO0o4 = solverVariableOooOO0o4;
                oooO0O0OooOOO1.OooO0OO(solverVariableOooOO0o4, solverVariableOooOO0o3, solverVariable7, solverVariableOooOO0o, f2);
                oooO0OO.OooO0OO(oooO0O0OooOOO1);
                if (z2) {
                    z12 = false;
                }
                i33 = i310;
                i17 = i311;
                z13 = z12;
                z4 = z4;
            } else {
                int i312 = i13;
                solverVariableOooOO0o5 = solverVariableOooOO0o5;
                solverVariableOooOO0o4 = solverVariableOooOO0o4;
                solverVariableOooOO0o6 = solverVariableOooOO0o6;
                i16 = i34;
                i33 = i14;
                i17 = i312;
                z13 = z12;
                z4 = true;
            }
            if (z11) {
                i18 = 0;
                c = 2;
                i19 = 8;
                c2 = 1;
            } else {
                i18 = 0;
                c = 2;
                i19 = 8;
                c2 = 1;
            }
            if (i16 >= c) {
            }
        }
        if (z5) {
            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, 0, 3);
            if (i3 > 0) {
                oooO0OO.OooO0o(solverVariableOooOO0o4, solverVariableOooOO0o3, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                oooO0OO.OooO0oO(solverVariableOooOO0o4, solverVariableOooOO0o3, i4, 8);
            }
        } else {
            oooO0OO.OooO0Oo(solverVariableOooOO0o4, solverVariableOooOO0o3, iMin, 8);
        }
        i17 = i7;
        z13 = z12;
        i16 = i34;
        if (z11) {
            i18 = 0;
            c = 2;
            i19 = 8;
            c2 = 1;
        } else {
            i18 = 0;
            c = 2;
            i19 = 8;
            c2 = 1;
        }
        if (i16 >= c) {
        }
    }

    public final void OooO0Oo() {
        this.f6946OoooOO0.add(this.f6939Oooo0o0);
        this.f6946OoooOO0.add(this.f6938Oooo0o);
        this.f6946OoooOO0.add(this.f6940Oooo0oO);
        this.f6946OoooOO0.add(this.f6941Oooo0oo);
        this.f6946OoooOO0.add(this.f6944OoooO00);
        this.f6946OoooOO0.add(this.f6943OoooO0);
        this.f6946OoooOO0.add(this.f6945OoooO0O);
        this.f6946OoooOO0.add(this.f6931Oooo);
    }

    public final boolean OooO0o() {
        return (this instanceof OooOOO) || (this instanceof OooOO0);
    }

    public final void OooO0o0(OooO0o oooO0o, androidx.constraintlayout.core.OooO0OO oooO0OO, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            OooOO0O.OooO00o(oooO0o, oooO0OO, this);
            hashSet.remove(this);
            OooO0oO(oooO0OO, oooO0o.o00ooo(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f6939Oooo0o0.f6891OooO00o;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f6894OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f6940Oooo0oO.f6891OooO00o;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f6894OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f6938Oooo0o.f6891OooO00o;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f6894OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f6941Oooo0oo.f6891OooO00o;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f6894OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f6931Oooo.f6891OooO00o;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f6894OooO0Oo.OooO0o0(oooO0o, oooO0OO, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:242:0x038c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0396  */
    /* JADX WARN: Code duplicated, block: B:249:0x039b  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:259:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:261:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:296:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:298:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:302:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:315:0x051f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0533  */
    /* JADX WARN: Code duplicated, block: B:320:0x0535  */
    /* JADX WARN: Code duplicated, block: B:322:0x0538  */
    /* JADX WARN: Code duplicated, block: B:360:0x060f  */
    /* JADX WARN: Code duplicated, block: B:362:0x0615  */
    /* JADX WARN: Code duplicated, block: B:364:0x061c  */
    /* JADX WARN: Code duplicated, block: B:365:0x062c  */
    /* JADX WARN: Code duplicated, block: B:366:0x063c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0646  */
    public void OooO0oO(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z5;
        boolean z6;
        SolverVariable solverVariable;
        int i;
        int i2;
        int i3;
        boolean z7;
        int i4;
        boolean z8;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z9;
        int i5;
        int i6;
        char c;
        ConstraintWidget constraintWidget3;
        boolean z10;
        boolean z11;
        ConstraintWidget constraintWidget4;
        boolean z12;
        o0OO00O o0oo00o2;
        o00O0O o00o0o2;
        o0OOO0o o0ooo0o2;
        int i7;
        boolean zOooo000;
        boolean zOooo00O;
        o0OOO0o o0ooo0o3;
        o0OO00O o0oo00o3;
        boolean z13;
        SolverVariable solverVariableOooOO0o = oooO0OO.OooOO0o(this.f6939Oooo0o0);
        SolverVariable solverVariableOooOO0o2 = oooO0OO.OooOO0o(this.f6940Oooo0oO);
        SolverVariable solverVariableOooOO0o3 = oooO0OO.OooOO0o(this.f6938Oooo0o);
        SolverVariable solverVariableOooOO0o4 = oooO0OO.OooOO0o(this.f6941Oooo0oo);
        SolverVariable solverVariableOooOO0o5 = oooO0OO.OooOO0o(this.f6931Oooo);
        ConstraintWidget constraintWidget5 = this.f6948OoooOOo;
        if (constraintWidget5 != null) {
            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.f6947OoooOOO;
            DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
            DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.WRAP_CONTENT;
            boolean z14 = dimensionBehaviour3 == dimensionBehaviour4;
            z2 = dimensionBehaviourArr[1] == dimensionBehaviour4;
            int i8 = this.f6918OooOOoo;
            if (i8 == 1) {
                z4 = z14;
                z3 = false;
            } else if (i8 == 2) {
                z3 = z2;
                z4 = false;
            } else if (i8 != 3) {
                z3 = z2;
                z4 = z14;
            } else {
                z2 = false;
                z3 = z2;
                z4 = false;
            }
        } else {
            z2 = false;
            z3 = z2;
            z4 = false;
        }
        if (this.f6969o0OoOo0 == 8 && !this.f6974ooOO) {
            int size = this.f6946OoooOO0.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z13 = false;
                    break;
                } else {
                    if (this.f6946OoooOO0.get(i9).OooO0oo()) {
                        z13 = true;
                        break;
                    }
                    i9++;
                }
            }
            if (!z13) {
                boolean[] zArr = this.f6961o000oOoO;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
        }
        boolean z15 = this.f6913OooOOO0;
        if (z15 || this.f6912OooOOO) {
            if (z15) {
                oooO0OO.OooO0o0(solverVariableOooOO0o, this.f6953Ooooo0o);
                oooO0OO.OooO0o0(solverVariableOooOO0o2, this.f6953Ooooo0o + this.f6949OoooOo0);
                if (z4 && (constraintWidget2 = this.f6948OoooOOo) != null) {
                    if (this.f6908OooO0oo) {
                        OooO0o oooO0o = (OooO0o) constraintWidget2;
                        oooO0o.Ooooooo(this.f6939Oooo0o0);
                        oooO0o.OoooooO(this.f6940Oooo0oO);
                    } else {
                        oooO0OO.OooO0o(oooO0OO.OooOO0o(constraintWidget2.f6940Oooo0oO), solverVariableOooOO0o2, 0, 5);
                    }
                }
            }
            if (this.f6912OooOOO) {
                oooO0OO.OooO0o0(solverVariableOooOO0o3, this.f6954OooooO0);
                oooO0OO.OooO0o0(solverVariableOooOO0o4, this.f6954OooooO0 + this.f6950OoooOoO);
                if (this.f6931Oooo.OooO0oo()) {
                    oooO0OO.OooO0o0(solverVariableOooOO0o5, this.f6954OooooO0 + this.f6955OooooOO);
                }
                if (z3 && (constraintWidget = this.f6948OoooOOo) != null) {
                    if (this.f6908OooO0oo) {
                        OooO0o oooO0o2 = (OooO0o) constraintWidget;
                        oooO0o2.ooOO(this.f6938Oooo0o);
                        oooO0o2.o0OoOo0(this.f6941Oooo0oo);
                    } else {
                        oooO0OO.OooO0o(oooO0OO.OooOO0o(constraintWidget.f6941Oooo0oo), solverVariableOooOO0o4, 0, 5);
                    }
                }
            }
            if (this.f6913OooOOO0 && this.f6912OooOOO) {
                this.f6913OooOOO0 = false;
                this.f6912OooOOO = false;
                return;
            }
        }
        if (z && (o0ooo0o3 = this.f6904OooO0Oo) != null && (o0oo00o3 = this.f6906OooO0o0) != null) {
            o00O0O o00o0o3 = o0ooo0o3.f27879OooO0oo;
            if (o00o0o3.f27866OooOO0 && o0ooo0o3.f27871OooO.f27866OooOO0 && o0oo00o3.f27879OooO0oo.f27866OooOO0 && o0oo00o3.f27871OooO.f27866OooOO0) {
                oooO0OO.OooO0o0(solverVariableOooOO0o, o00o0o3.f27864OooO0oO);
                oooO0OO.OooO0o0(solverVariableOooOO0o2, this.f6904OooO0Oo.f27871OooO.f27864OooO0oO);
                oooO0OO.OooO0o0(solverVariableOooOO0o3, this.f6906OooO0o0.f27879OooO0oo.f27864OooO0oO);
                oooO0OO.OooO0o0(solverVariableOooOO0o4, this.f6906OooO0o0.f27871OooO.f27864OooO0oO);
                oooO0OO.OooO0o0(solverVariableOooOO0o5, this.f6906OooO0o0.f27882OooOO0O.f27864OooO0oO);
                if (this.f6948OoooOOo != null) {
                    if (z4 && this.f6905OooO0o[0] && !Oooo000()) {
                        oooO0OO.OooO0o(oooO0OO.OooOO0o(this.f6948OoooOOo.f6940Oooo0oO), solverVariableOooOO0o2, 0, 8);
                    }
                    if (z3 && this.f6905OooO0o[1] && !Oooo00O()) {
                        oooO0OO.OooO0o(oooO0OO.OooOO0o(this.f6948OoooOOo.f6941Oooo0oo), solverVariableOooOO0o4, 0, 8);
                    }
                }
                this.f6913OooOOO0 = false;
                this.f6912OooOOO = false;
                return;
            }
        }
        if (this.f6948OoooOOo != null) {
            if (OooOooo(0)) {
                ((OooO0o) this.f6948OoooOOo).Oooooo0(this, 0);
                zOooo000 = true;
            } else {
                zOooo000 = Oooo000();
            }
            if (OooOooo(1)) {
                ((OooO0o) this.f6948OoooOOo).Oooooo0(this, 1);
                zOooo00O = true;
            } else {
                zOooo00O = Oooo00O();
            }
            if (!zOooo000 && z4 && this.f6969o0OoOo0 != 8 && this.f6939Oooo0o0.f6895OooO0o == null && this.f6940Oooo0oO.f6895OooO0o == null) {
                oooO0OO.OooO0o(oooO0OO.OooOO0o(this.f6948OoooOOo.f6940Oooo0oO), solverVariableOooOO0o2, 0, 1);
            }
            if (!zOooo00O && z3 && this.f6969o0OoOo0 != 8 && this.f6938Oooo0o.f6895OooO0o == null && this.f6941Oooo0oo.f6895OooO0o == null && this.f6931Oooo == null) {
                oooO0OO.OooO0o(oooO0OO.OooOO0o(this.f6948OoooOOo.f6941Oooo0oo), solverVariableOooOO0o4, 0, 1);
            }
            z6 = zOooo000;
            z5 = zOooo00O;
        } else {
            z5 = false;
            z6 = false;
        }
        int i10 = this.f6949OoooOo0;
        int i11 = this.f6956OooooOo;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i12 = this.f6950OoooOoO;
        int i13 = this.f6958Oooooo0;
        if (i12 >= i13) {
            i13 = i12;
        }
        DimensionBehaviour[] dimensionBehaviourArr2 = this.f6947OoooOOO;
        DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr2[0];
        int i14 = i11;
        DimensionBehaviour dimensionBehaviour6 = DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z16 = dimensionBehaviour5 != dimensionBehaviour6;
        boolean z17 = dimensionBehaviourArr2[1] != dimensionBehaviour6;
        int i15 = this.f6952Ooooo00;
        this.f6927OooOoo = i15;
        float f = this.f6951OoooOoo;
        this.f6929OooOooO = f;
        int i16 = i13;
        int i17 = this.f6921OooOo00;
        SolverVariable solverVariable2 = solverVariableOooOO0o5;
        int i18 = this.f6920OooOo0;
        SolverVariable solverVariable3 = solverVariableOooOO0o4;
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            solverVariable = solverVariableOooOO0o3;
            if (this.f6969o0OoOo0 != 8) {
                if (dimensionBehaviourArr2[0] == dimensionBehaviour6 && i17 == 0) {
                    i17 = 3;
                }
                if (dimensionBehaviourArr2[1] == dimensionBehaviour6 && i18 == 0) {
                    i18 = 3;
                }
                if (dimensionBehaviourArr2[0] == dimensionBehaviour6 && dimensionBehaviourArr2[1] == dimensionBehaviour6 && i17 == 3 && i18 == 3) {
                    if (i15 == -1) {
                        if (z16 && !z17) {
                            this.f6927OooOoo = 0;
                        } else if (!z16 && z17) {
                            this.f6927OooOoo = 1;
                            if (i15 == -1) {
                                this.f6929OooOooO = 1.0f / f;
                            }
                        }
                    }
                    if (this.f6927OooOoo == 0 && (!this.f6938Oooo0o.OooO() || !this.f6941Oooo0oo.OooO())) {
                        this.f6927OooOoo = 1;
                    } else if (this.f6927OooOoo == 1 && (!this.f6939Oooo0o0.OooO() || !this.f6940Oooo0oO.OooO())) {
                        this.f6927OooOoo = 0;
                    }
                    if (this.f6927OooOoo == -1 && (!this.f6938Oooo0o.OooO() || !this.f6941Oooo0oo.OooO() || !this.f6939Oooo0o0.OooO() || !this.f6940Oooo0oO.OooO())) {
                        if (this.f6938Oooo0o.OooO() && this.f6941Oooo0oo.OooO()) {
                            this.f6927OooOoo = 0;
                        } else if (this.f6939Oooo0o0.OooO() && this.f6940Oooo0oO.OooO()) {
                            this.f6929OooOooO = 1.0f / this.f6929OooOooO;
                            this.f6927OooOoo = 1;
                        }
                    }
                    if (this.f6927OooOoo == -1) {
                        int i19 = this.f6923OooOo0o;
                        if (i19 > 0 && this.f6924OooOoO == 0) {
                            this.f6927OooOoo = 0;
                        } else if (i19 == 0 && this.f6924OooOoO > 0) {
                            this.f6929OooOooO = 1.0f / this.f6929OooOooO;
                            this.f6927OooOoo = 1;
                        }
                    }
                } else if (dimensionBehaviourArr2[0] == dimensionBehaviour6 && i17 == 3) {
                    this.f6927OooOoo = 0;
                    i14 = (int) (f * i12);
                    if (dimensionBehaviourArr2[1] != dimensionBehaviour6) {
                        i2 = i18;
                        i3 = i16;
                        z7 = false;
                        i = 4;
                    }
                } else if (dimensionBehaviourArr2[1] == dimensionBehaviour6 && i18 == 3) {
                    this.f6927OooOoo = 1;
                    if (i15 == -1) {
                        this.f6929OooOooO = 1.0f / f;
                    }
                    int i20 = (int) (this.f6929OooOooO * i10);
                    if (dimensionBehaviourArr2[0] != dimensionBehaviour6) {
                        i3 = i20;
                        i = i17;
                        z7 = false;
                        i2 = 4;
                    } else {
                        i16 = i20;
                    }
                }
                i = i17;
                i2 = i18;
                i3 = i16;
                z7 = true;
            }
            int[] iArr = this.f6922OooOo0O;
            iArr[0] = i;
            iArr[1] = i2;
            if (z7) {
                int i21 = this.f6927OooOoo;
                i4 = -1;
                boolean z18 = i21 != 0 || i21 == -1;
                if (z7 || !((i7 = this.f6927OooOoo) == 1 || i7 == i4)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                dimensionBehaviour = this.f6947OoooOOO[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof OooO0o)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    i14 = 0;
                }
                boolean z19 = !this.f6945OoooO0O.OooO();
                boolean[] zArr2 = this.f6961o000oOoO;
                boolean z20 = zArr2[0];
                boolean z21 = zArr2[1];
                if (this.f6917OooOOo0 == 2 && !this.f6913OooOOO0) {
                    if (z && (o0ooo0o2 = this.f6904OooO0Oo) != null) {
                        o00O0O o00o0o4 = o0ooo0o2.f27879OooO0oo;
                        if (o00o0o4.f27866OooOO0 && o0ooo0o2.f27871OooO.f27866OooOO0) {
                            if (z) {
                                oooO0OO.OooO0o0(solverVariableOooOO0o, o00o0o4.f27864OooO0oO);
                                oooO0OO.OooO0o0(solverVariableOooOO0o2, this.f6904OooO0Oo.f27871OooO.f27864OooO0oO);
                                if (this.f6948OoooOOo != null && z4 && this.f6905OooO0o[0] && !Oooo000()) {
                                    oooO0OO.OooO0o(oooO0OO.OooOO0o(this.f6948OoooOOo.f6940Oooo0oO), solverVariableOooOO0o2, 0, 8);
                                }
                            }
                        }
                    }
                    ConstraintWidget constraintWidget6 = this.f6948OoooOOo;
                    SolverVariable solverVariableOooOO0o6 = constraintWidget6 != null ? oooO0OO.OooOO0o(constraintWidget6.f6940Oooo0oO) : null;
                    ConstraintWidget constraintWidget7 = this.f6948OoooOOo;
                    SolverVariable solverVariableOooOO0o7 = constraintWidget7 != null ? oooO0OO.OooOO0o(constraintWidget7.f6939Oooo0o0) : null;
                    boolean z22 = this.f6905OooO0o[0];
                    DimensionBehaviour[] dimensionBehaviourArr3 = this.f6947OoooOOO;
                    OooO(oooO0OO, true, z4, z3, z22, solverVariableOooOO0o7, solverVariableOooOO0o6, dimensionBehaviourArr3[0], z9, this.f6939Oooo0o0, this.f6940Oooo0oO, this.f6953Ooooo0o, i14, this.f6956OooooOo, this.f6930OooOooo[0], this.f6957Oooooo, z18, dimensionBehaviourArr3[1] == dimensionBehaviour6, z6, z5, z20, i, i2, this.f6923OooOo0o, this.f6919OooOo, this.f6925OooOoO0, z19);
                }
                if (z) {
                    constraintWidget3 = this;
                    o0oo00o2 = constraintWidget3.f6906OooO0o0;
                    if (o0oo00o2 != null) {
                        o00o0o2 = o0oo00o2.f27879OooO0oo;
                        if (!o00o0o2.f27866OooOO0 && o0oo00o2.f27871OooO.f27866OooOO0) {
                            oooO0OO = oooO0OO;
                            solverVariable = solverVariable;
                            oooO0OO.OooO0o0(solverVariable, o00o0o2.f27864OooO0oO);
                            solverVariable3 = solverVariable3;
                            oooO0OO.OooO0o0(solverVariable3, constraintWidget3.f6906OooO0o0.f27871OooO.f27864OooO0oO);
                            solverVariable2 = solverVariable2;
                            oooO0OO.OooO0o0(solverVariable2, constraintWidget3.f6906OooO0o0.f27882OooOO0O.f27864OooO0oO);
                            ConstraintWidget constraintWidget8 = constraintWidget3.f6948OoooOOo;
                            if (constraintWidget8 == null || z5 || !z3) {
                                i5 = 8;
                                i6 = 0;
                                c = 1;
                            } else {
                                c = 1;
                                if (constraintWidget3.f6905OooO0o[1]) {
                                    i5 = 8;
                                    i6 = 0;
                                    oooO0OO.OooO0o(oooO0OO.OooOO0o(constraintWidget8.f6941Oooo0oo), solverVariable3, 0, 8);
                                } else {
                                    i5 = 8;
                                    i6 = 0;
                                }
                            }
                            z10 = false;
                        }
                        if (constraintWidget3.f6916OooOOo == 2) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if (!z11 && !constraintWidget3.f6912OooOOO) {
                            boolean z23 = constraintWidget3.f6947OoooOOO[c] == dimensionBehaviour2 && (constraintWidget3 instanceof OooO0o);
                            if (z23) {
                                i3 = 0;
                            }
                            ConstraintWidget constraintWidget9 = constraintWidget3.f6948OoooOOo;
                            SolverVariable solverVariableOooOO0o8 = constraintWidget9 != null ? oooO0OO.OooOO0o(constraintWidget9.f6941Oooo0oo) : null;
                            ConstraintWidget constraintWidget10 = constraintWidget3.f6948OoooOOo;
                            SolverVariable solverVariableOooOO0o9 = constraintWidget10 != null ? oooO0OO.OooOO0o(constraintWidget10.f6938Oooo0o) : null;
                            int i22 = constraintWidget3.f6955OooooOO;
                            if (i22 > 0 || constraintWidget3.f6969o0OoOo0 == i5) {
                                ConstraintAnchor constraintAnchor = constraintWidget3.f6931Oooo;
                                if (constraintAnchor.f6895OooO0o != null) {
                                    oooO0OO.OooO0Oo(solverVariable2, solverVariable, i22, i5);
                                    oooO0OO.OooO0Oo(solverVariable2, oooO0OO.OooOO0o(constraintWidget3.f6931Oooo.f6895OooO0o), constraintWidget3.f6931Oooo.OooO0o0(), i5);
                                    if (z3) {
                                        oooO0OO.OooO0o(solverVariableOooOO0o8, oooO0OO.OooOO0o(constraintWidget3.f6941Oooo0oo), i6, 5);
                                    }
                                    z12 = false;
                                } else {
                                    if (constraintWidget3.f6969o0OoOo0 == i5) {
                                        oooO0OO.OooO0Oo(solverVariable2, solverVariable, constraintAnchor.OooO0o0(), i5);
                                    } else {
                                        oooO0OO.OooO0Oo(solverVariable2, solverVariable, i22, i5);
                                    }
                                    z12 = z19;
                                }
                            } else {
                                z12 = z19;
                            }
                            boolean z24 = constraintWidget3.f6905OooO0o[c];
                            DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget3.f6947OoooOOO;
                            OooO(oooO0OO, false, z3, z4, z24, solverVariableOooOO0o9, solverVariableOooOO0o8, dimensionBehaviourArr4[c], z23, constraintWidget3.f6938Oooo0o, constraintWidget3.f6941Oooo0oo, constraintWidget3.f6954OooooO0, i3, constraintWidget3.f6958Oooooo0, constraintWidget3.f6930OooOooo[c], constraintWidget3.f6959OoooooO, z8, dimensionBehaviourArr4[0] == dimensionBehaviour6, z5, z6, z21, i2, i, constraintWidget3.f6924OooOoO, constraintWidget3.f6926OooOoOO, constraintWidget3.f6928OooOoo0, z12);
                        }
                        if (z7) {
                            constraintWidget4 = this;
                            if (constraintWidget4.f6927OooOoo == 1) {
                                oooO0OO.OooO0oo(solverVariable3, solverVariable, solverVariableOooOO0o2, solverVariableOooOO0o, constraintWidget4.f6929OooOooO);
                            } else {
                                oooO0OO.OooO0oo(solverVariableOooOO0o2, solverVariableOooOO0o, solverVariable3, solverVariable, constraintWidget4.f6929OooOooO);
                            }
                        } else {
                            constraintWidget4 = this;
                        }
                        if (constraintWidget4.f6945OoooO0O.OooO()) {
                            ConstraintWidget constraintWidget11 = constraintWidget4.f6945OoooO0O.f6895OooO0o.f6894OooO0Oo;
                            float radians = (float) Math.toRadians(constraintWidget4.f6933Oooo000 + 90.0f);
                            int iOooO0o0 = constraintWidget4.f6945OoooO0O.OooO0o0();
                            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                            SolverVariable solverVariableOooOO0o10 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type));
                            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                            SolverVariable solverVariableOooOO0o11 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type2));
                            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                            SolverVariable solverVariableOooOO0o12 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type3));
                            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                            SolverVariable solverVariableOooOO0o13 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type4));
                            SolverVariable solverVariableOooOO0o14 = oooO0OO.OooOO0o(constraintWidget11.OooOOOO(type));
                            SolverVariable solverVariableOooOO0o15 = oooO0OO.OooOO0o(constraintWidget11.OooOOOO(type2));
                            SolverVariable solverVariableOooOO0o16 = oooO0OO.OooOO0o(constraintWidget11.OooOOOO(type3));
                            SolverVariable solverVariableOooOO0o17 = oooO0OO.OooOO0o(constraintWidget11.OooOOOO(type4));
                            androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO0 = oooO0OO.OooOOO0();
                            double d = radians;
                            double d2 = iOooO0o0;
                            oooO0O0OooOOO0.OooO0o(solverVariableOooOO0o11, solverVariableOooOO0o13, solverVariableOooOO0o15, solverVariableOooOO0o17, (float) (Math.sin(d) * d2));
                            oooO0OO.OooO0OO(oooO0O0OooOOO0);
                            androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO1 = oooO0OO.OooOOO0();
                            oooO0O0OooOOO1.OooO0o(solverVariableOooOO0o10, solverVariableOooOO0o12, solverVariableOooOO0o14, solverVariableOooOO0o16, (float) (Math.cos(d) * d2));
                            oooO0OO.OooO0OO(oooO0O0OooOOO1);
                        }
                        this.f6913OooOOO0 = false;
                        this.f6912OooOOO = false;
                    }
                    i5 = 8;
                    i6 = 0;
                    c = 1;
                } else {
                    i5 = 8;
                    i6 = 0;
                    c = 1;
                    constraintWidget3 = this;
                }
                z10 = true;
                if (constraintWidget3.f6916OooOOo == 2) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (!z11) {
                }
                if (z7) {
                    constraintWidget4 = this;
                    if (constraintWidget4.f6927OooOoo == 1) {
                        oooO0OO.OooO0oo(solverVariable3, solverVariable, solverVariableOooOO0o2, solverVariableOooOO0o, constraintWidget4.f6929OooOooO);
                    } else {
                        oooO0OO.OooO0oo(solverVariableOooOO0o2, solverVariableOooOO0o, solverVariable3, solverVariable, constraintWidget4.f6929OooOooO);
                    }
                } else {
                    constraintWidget4 = this;
                }
                if (constraintWidget4.f6945OoooO0O.OooO()) {
                    ConstraintWidget constraintWidget12 = constraintWidget4.f6945OoooO0O.f6895OooO0o.f6894OooO0Oo;
                    float radians2 = (float) Math.toRadians(constraintWidget4.f6933Oooo000 + 90.0f);
                    int iOooO0o1 = constraintWidget4.f6945OoooO0O.OooO0o0();
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.LEFT;
                    SolverVariable solverVariableOooOO0o18 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type5));
                    ConstraintAnchor.Type type6 = ConstraintAnchor.Type.TOP;
                    SolverVariable solverVariableOooOO0o19 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type6));
                    ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                    SolverVariable solverVariableOooOO0o110 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type7));
                    ConstraintAnchor.Type type8 = ConstraintAnchor.Type.BOTTOM;
                    SolverVariable solverVariableOooOO0o111 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type8));
                    SolverVariable solverVariableOooOO0o112 = oooO0OO.OooOO0o(constraintWidget12.OooOOOO(type5));
                    SolverVariable solverVariableOooOO0o113 = oooO0OO.OooOO0o(constraintWidget12.OooOOOO(type6));
                    SolverVariable solverVariableOooOO0o114 = oooO0OO.OooOO0o(constraintWidget12.OooOOOO(type7));
                    SolverVariable solverVariableOooOO0o115 = oooO0OO.OooOO0o(constraintWidget12.OooOOOO(type8));
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO2 = oooO0OO.OooOOO0();
                    double d3 = radians2;
                    double d4 = iOooO0o1;
                    oooO0O0OooOOO2.OooO0o(solverVariableOooOO0o19, solverVariableOooOO0o111, solverVariableOooOO0o113, solverVariableOooOO0o115, (float) (Math.sin(d3) * d4));
                    oooO0OO.OooO0OO(oooO0O0OooOOO2);
                    androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO3 = oooO0OO.OooOOO0();
                    oooO0O0OooOOO3.OooO0o(solverVariableOooOO0o18, solverVariableOooOO0o110, solverVariableOooOO0o112, solverVariableOooOO0o114, (float) (Math.cos(d3) * d4));
                    oooO0OO.OooO0OO(oooO0O0OooOOO3);
                }
                this.f6913OooOOO0 = false;
                this.f6912OooOOO = false;
            }
            i4 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            dimensionBehaviour = this.f6947OoooOOO[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i14 = 0;
            }
            boolean z110 = !this.f6945OoooO0O.OooO();
            boolean[] zArr3 = this.f6961o000oOoO;
            boolean z25 = zArr3[0];
            boolean z26 = zArr3[1];
            if (this.f6917OooOOo0 == 2) {
            }
            if (z) {
                constraintWidget3 = this;
                o0oo00o2 = constraintWidget3.f6906OooO0o0;
                if (o0oo00o2 != null) {
                    o00o0o2 = o0oo00o2.f27879OooO0oo;
                    if (!o00o0o2.f27866OooOO0) {
                    }
                }
                i5 = 8;
                i6 = 0;
                c = 1;
            } else {
                i5 = 8;
                i6 = 0;
                c = 1;
                constraintWidget3 = this;
            }
            z10 = true;
            if (constraintWidget3.f6916OooOOo == 2) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (!z11) {
            }
            if (z7) {
                constraintWidget4 = this;
                if (constraintWidget4.f6927OooOoo == 1) {
                    oooO0OO.OooO0oo(solverVariable3, solverVariable, solverVariableOooOO0o2, solverVariableOooOO0o, constraintWidget4.f6929OooOooO);
                } else {
                    oooO0OO.OooO0oo(solverVariableOooOO0o2, solverVariableOooOO0o, solverVariable3, solverVariable, constraintWidget4.f6929OooOooO);
                }
            } else {
                constraintWidget4 = this;
            }
            if (constraintWidget4.f6945OoooO0O.OooO()) {
                ConstraintWidget constraintWidget13 = constraintWidget4.f6945OoooO0O.f6895OooO0o.f6894OooO0Oo;
                float radians3 = (float) Math.toRadians(constraintWidget4.f6933Oooo000 + 90.0f);
                int iOooO0o2 = constraintWidget4.f6945OoooO0O.OooO0o0();
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.LEFT;
                SolverVariable solverVariableOooOO0o116 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type9));
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                SolverVariable solverVariableOooOO0o117 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type10));
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.RIGHT;
                SolverVariable solverVariableOooOO0o118 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type11));
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BOTTOM;
                SolverVariable solverVariableOooOO0o119 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type12));
                SolverVariable solverVariableOooOO0o1110 = oooO0OO.OooOO0o(constraintWidget13.OooOOOO(type9));
                SolverVariable solverVariableOooOO0o1111 = oooO0OO.OooOO0o(constraintWidget13.OooOOOO(type10));
                SolverVariable solverVariableOooOO0o1112 = oooO0OO.OooOO0o(constraintWidget13.OooOOOO(type11));
                SolverVariable solverVariableOooOO0o1113 = oooO0OO.OooOO0o(constraintWidget13.OooOOOO(type12));
                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO4 = oooO0OO.OooOOO0();
                double d5 = radians3;
                double d6 = iOooO0o2;
                oooO0O0OooOOO4.OooO0o(solverVariableOooOO0o117, solverVariableOooOO0o119, solverVariableOooOO0o1111, solverVariableOooOO0o1113, (float) (Math.sin(d5) * d6));
                oooO0OO.OooO0OO(oooO0O0OooOOO4);
                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO5 = oooO0OO.OooOOO0();
                oooO0O0OooOOO5.OooO0o(solverVariableOooOO0o116, solverVariableOooOO0o118, solverVariableOooOO0o1110, solverVariableOooOO0o1112, (float) (Math.cos(d5) * d6));
                oooO0OO.OooO0OO(oooO0O0OooOOO5);
            }
            this.f6913OooOOO0 = false;
            this.f6912OooOOO = false;
        }
        solverVariable = solverVariableOooOO0o3;
        i = i17;
        i2 = i18;
        i3 = i16;
        z7 = false;
        int[] iArr2 = this.f6922OooOo0O;
        iArr2[0] = i;
        iArr2[1] = i2;
        if (z7) {
            int i23 = this.f6927OooOoo;
            i4 = -1;
            if (i23 != 0) {
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            dimensionBehaviour = this.f6947OoooOOO[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i14 = 0;
            }
            boolean z111 = !this.f6945OoooO0O.OooO();
            boolean[] zArr4 = this.f6961o000oOoO;
            boolean z27 = zArr4[0];
            boolean z28 = zArr4[1];
            if (this.f6917OooOOo0 == 2) {
            }
            if (z) {
                constraintWidget3 = this;
                o0oo00o2 = constraintWidget3.f6906OooO0o0;
                if (o0oo00o2 != null) {
                    o00o0o2 = o0oo00o2.f27879OooO0oo;
                    if (!o00o0o2.f27866OooOO0) {
                    }
                }
                i5 = 8;
                i6 = 0;
                c = 1;
            } else {
                i5 = 8;
                i6 = 0;
                c = 1;
                constraintWidget3 = this;
            }
            z10 = true;
            if (constraintWidget3.f6916OooOOo == 2) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (!z11) {
            }
            if (z7) {
                constraintWidget4 = this;
                if (constraintWidget4.f6927OooOoo == 1) {
                    oooO0OO.OooO0oo(solverVariable3, solverVariable, solverVariableOooOO0o2, solverVariableOooOO0o, constraintWidget4.f6929OooOooO);
                } else {
                    oooO0OO.OooO0oo(solverVariableOooOO0o2, solverVariableOooOO0o, solverVariable3, solverVariable, constraintWidget4.f6929OooOooO);
                }
            } else {
                constraintWidget4 = this;
            }
            if (constraintWidget4.f6945OoooO0O.OooO()) {
                ConstraintWidget constraintWidget14 = constraintWidget4.f6945OoooO0O.f6895OooO0o.f6894OooO0Oo;
                float radians4 = (float) Math.toRadians(constraintWidget4.f6933Oooo000 + 90.0f);
                int iOooO0o3 = constraintWidget4.f6945OoooO0O.OooO0o0();
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
                SolverVariable solverVariableOooOO0o1114 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type13));
                ConstraintAnchor.Type type14 = ConstraintAnchor.Type.TOP;
                SolverVariable solverVariableOooOO0o1115 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type14));
                ConstraintAnchor.Type type15 = ConstraintAnchor.Type.RIGHT;
                SolverVariable solverVariableOooOO0o1116 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type15));
                ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
                SolverVariable solverVariableOooOO0o1117 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type16));
                SolverVariable solverVariableOooOO0o1118 = oooO0OO.OooOO0o(constraintWidget14.OooOOOO(type13));
                SolverVariable solverVariableOooOO0o1119 = oooO0OO.OooOO0o(constraintWidget14.OooOOOO(type14));
                SolverVariable solverVariableOooOO0o11110 = oooO0OO.OooOO0o(constraintWidget14.OooOOOO(type15));
                SolverVariable solverVariableOooOO0o11111 = oooO0OO.OooOO0o(constraintWidget14.OooOOOO(type16));
                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO6 = oooO0OO.OooOOO0();
                double d7 = radians4;
                double d8 = iOooO0o3;
                oooO0O0OooOOO6.OooO0o(solverVariableOooOO0o1115, solverVariableOooOO0o1117, solverVariableOooOO0o1119, solverVariableOooOO0o11111, (float) (Math.sin(d7) * d8));
                oooO0OO.OooO0OO(oooO0O0OooOOO6);
                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO7 = oooO0OO.OooOOO0();
                oooO0O0OooOOO7.OooO0o(solverVariableOooOO0o1114, solverVariableOooOO0o1116, solverVariableOooOO0o1118, solverVariableOooOO0o11110, (float) (Math.cos(d7) * d8));
                oooO0OO.OooO0OO(oooO0O0OooOOO7);
            }
            this.f6913OooOOO0 = false;
            this.f6912OooOOO = false;
        }
        i4 = -1;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        dimensionBehaviour = this.f6947OoooOOO[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z9) {
            i14 = 0;
        }
        boolean z112 = !this.f6945OoooO0O.OooO();
        boolean[] zArr5 = this.f6961o000oOoO;
        boolean z29 = zArr5[0];
        boolean z210 = zArr5[1];
        if (this.f6917OooOOo0 == 2) {
        }
        if (z) {
            constraintWidget3 = this;
            o0oo00o2 = constraintWidget3.f6906OooO0o0;
            if (o0oo00o2 != null) {
                o00o0o2 = o0oo00o2.f27879OooO0oo;
                if (!o00o0o2.f27866OooOO0) {
                }
            }
            i5 = 8;
            i6 = 0;
            c = 1;
        } else {
            i5 = 8;
            i6 = 0;
            c = 1;
            constraintWidget3 = this;
        }
        z10 = true;
        if (constraintWidget3.f6916OooOOo == 2) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (!z11) {
        }
        if (z7) {
            constraintWidget4 = this;
            if (constraintWidget4.f6927OooOoo == 1) {
                oooO0OO.OooO0oo(solverVariable3, solverVariable, solverVariableOooOO0o2, solverVariableOooOO0o, constraintWidget4.f6929OooOooO);
            } else {
                oooO0OO.OooO0oo(solverVariableOooOO0o2, solverVariableOooOO0o, solverVariable3, solverVariable, constraintWidget4.f6929OooOooO);
            }
        } else {
            constraintWidget4 = this;
        }
        if (constraintWidget4.f6945OoooO0O.OooO()) {
            ConstraintWidget constraintWidget15 = constraintWidget4.f6945OoooO0O.f6895OooO0o.f6894OooO0Oo;
            float radians5 = (float) Math.toRadians(constraintWidget4.f6933Oooo000 + 90.0f);
            int iOooO0o4 = constraintWidget4.f6945OoooO0O.OooO0o0();
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.LEFT;
            SolverVariable solverVariableOooOO0o11112 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type17));
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            SolverVariable solverVariableOooOO0o11113 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type18));
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.RIGHT;
            SolverVariable solverVariableOooOO0o11114 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type19));
            ConstraintAnchor.Type type110 = ConstraintAnchor.Type.BOTTOM;
            SolverVariable solverVariableOooOO0o11115 = oooO0OO.OooOO0o(constraintWidget4.OooOOOO(type110));
            SolverVariable solverVariableOooOO0o11116 = oooO0OO.OooOO0o(constraintWidget15.OooOOOO(type17));
            SolverVariable solverVariableOooOO0o11117 = oooO0OO.OooOO0o(constraintWidget15.OooOOOO(type18));
            SolverVariable solverVariableOooOO0o11118 = oooO0OO.OooOO0o(constraintWidget15.OooOOOO(type19));
            SolverVariable solverVariableOooOO0o11119 = oooO0OO.OooOO0o(constraintWidget15.OooOOOO(type110));
            androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO8 = oooO0OO.OooOOO0();
            double d9 = radians5;
            double d10 = iOooO0o4;
            oooO0O0OooOOO8.OooO0o(solverVariableOooOO0o11113, solverVariableOooOO0o11115, solverVariableOooOO0o11117, solverVariableOooOO0o11119, (float) (Math.sin(d9) * d10));
            oooO0OO.OooO0OO(oooO0O0OooOOO8);
            androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO9 = oooO0OO.OooOOO0();
            oooO0O0OooOOO9.OooO0o(solverVariableOooOO0o11112, solverVariableOooOO0o11114, solverVariableOooOO0o11116, solverVariableOooOO0o11118, (float) (Math.cos(d9) * d10));
            oooO0OO.OooO0OO(oooO0O0OooOOO9);
        }
        this.f6913OooOOO0 = false;
        this.f6912OooOOO = false;
    }

    public boolean OooO0oo() {
        return this.f6969o0OoOo0 != 8;
    }

    public final void OooOO0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    OooOO0(type6, constraintWidget, type2, 0);
                    OooOO0(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    OooOOOO(type5).OooO00o(constraintWidget.OooOOOO(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    OooOO0(type7, constraintWidget, type2, 0);
                    OooOO0(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    OooOOOO(type5).OooO00o(constraintWidget.OooOOOO(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorOooOOOO = OooOOOO(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorOooOOOO2 = OooOOOO(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorOooOOOO3 = OooOOOO(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorOooOOOO4 = OooOOOO(type11);
            boolean z2 = true;
            if ((constraintAnchorOooOOOO == null || !constraintAnchorOooOOOO.OooO()) && (constraintAnchorOooOOOO2 == null || !constraintAnchorOooOOOO2.OooO())) {
                OooOO0(type8, constraintWidget, type8, 0);
                OooOO0(type9, constraintWidget, type9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((constraintAnchorOooOOOO3 == null || !constraintAnchorOooOOOO3.OooO()) && (constraintAnchorOooOOOO4 == null || !constraintAnchorOooOOOO4.OooO())) {
                OooOO0(type10, constraintWidget, type10, 0);
                OooOO0(type11, constraintWidget, type11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                OooOOOO(type5).OooO00o(constraintWidget.OooOOOO(type5), 0);
                return;
            }
            if (z) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                OooOOOO(type12).OooO00o(constraintWidget.OooOOOO(type12), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    OooOOOO(type13).OooO00o(constraintWidget.OooOOOO(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorOooOOOO5 = OooOOOO(type4);
            ConstraintAnchor constraintAnchorOooOOOO6 = constraintWidget.OooOOOO(type2);
            ConstraintAnchor constraintAnchorOooOOOO7 = OooOOOO(ConstraintAnchor.Type.RIGHT);
            constraintAnchorOooOOOO5.OooO00o(constraintAnchorOooOOOO6, 0);
            constraintAnchorOooOOOO7.OooO00o(constraintAnchorOooOOOO6, 0);
            OooOOOO(type14).OooO00o(constraintAnchorOooOOOO6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorOooOOOO8 = constraintWidget.OooOOOO(type2);
            OooOOOO(type3).OooO00o(constraintAnchorOooOOOO8, 0);
            OooOOOO(ConstraintAnchor.Type.BOTTOM).OooO00o(constraintAnchorOooOOOO8, 0);
            OooOOOO(type15).OooO00o(constraintAnchorOooOOOO8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            OooOOOO(type16).OooO00o(constraintWidget.OooOOOO(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            OooOOOO(type17).OooO00o(constraintWidget.OooOOOO(type17), 0);
            OooOOOO(type14).OooO00o(constraintWidget.OooOOOO(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            OooOOOO(type18).OooO00o(constraintWidget.OooOOOO(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            OooOOOO(type19).OooO00o(constraintWidget.OooOOOO(type19), 0);
            OooOOOO(type15).OooO00o(constraintWidget.OooOOOO(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorOooOOOO9 = OooOOOO(type);
        ConstraintAnchor constraintAnchorOooOOOO10 = constraintWidget.OooOOOO(type2);
        if (constraintAnchorOooOOOO9.OooOO0(constraintAnchorOooOOOO10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorOooOOOO11 = OooOOOO(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorOooOOOO12 = OooOOOO(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorOooOOOO11 != null) {
                    constraintAnchorOooOOOO11.OooOO0O();
                }
                if (constraintAnchorOooOOOO12 != null) {
                    constraintAnchorOooOOOO12.OooOO0O();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorOooOOOO13 = OooOOOO(type20);
                if (constraintAnchorOooOOOO13 != null) {
                    constraintAnchorOooOOOO13.OooOO0O();
                }
                ConstraintAnchor constraintAnchorOooOOOO14 = OooOOOO(type5);
                if (constraintAnchorOooOOOO14.f6895OooO0o != constraintAnchorOooOOOO10) {
                    constraintAnchorOooOOOO14.OooOO0O();
                }
                ConstraintAnchor constraintAnchorOooO0o = OooOOOO(type).OooO0o();
                ConstraintAnchor constraintAnchorOooOOOO15 = OooOOOO(type15);
                if (constraintAnchorOooOOOO15.OooO()) {
                    constraintAnchorOooO0o.OooOO0O();
                    constraintAnchorOooOOOO15.OooOO0O();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorOooOOOO16 = OooOOOO(type5);
                if (constraintAnchorOooOOOO16.f6895OooO0o != constraintAnchorOooOOOO10) {
                    constraintAnchorOooOOOO16.OooOO0O();
                }
                ConstraintAnchor constraintAnchorOooO0o2 = OooOOOO(type).OooO0o();
                ConstraintAnchor constraintAnchorOooOOOO17 = OooOOOO(type14);
                if (constraintAnchorOooOOOO17.OooO()) {
                    constraintAnchorOooO0o2.OooOO0O();
                    constraintAnchorOooOOOO17.OooOO0O();
                }
            }
            constraintAnchorOooOOOO9.OooO00o(constraintAnchorOooOOOO10, i);
        }
    }

    public final void OooOO0O(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.f6894OooO0Oo == this) {
            OooOO0(constraintAnchor.f6896OooO0o0, constraintAnchor2.f6894OooO0Oo, constraintAnchor2.f6896OooO0o0, i);
        }
    }

    public void OooOO0o(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f6917OooOOo0 = constraintWidget.f6917OooOOo0;
        this.f6916OooOOo = constraintWidget.f6916OooOOo;
        this.f6921OooOo00 = constraintWidget.f6921OooOo00;
        this.f6920OooOo0 = constraintWidget.f6920OooOo0;
        int[] iArr = this.f6922OooOo0O;
        int[] iArr2 = constraintWidget.f6922OooOo0O;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f6923OooOo0o = constraintWidget.f6923OooOo0o;
        this.f6919OooOo = constraintWidget.f6919OooOo;
        this.f6924OooOoO = constraintWidget.f6924OooOoO;
        this.f6926OooOoOO = constraintWidget.f6926OooOoOO;
        this.f6928OooOoo0 = constraintWidget.f6928OooOoo0;
        this.f6927OooOoo = constraintWidget.f6927OooOoo;
        this.f6929OooOooO = constraintWidget.f6929OooOooO;
        int[] iArr3 = constraintWidget.f6930OooOooo;
        this.f6930OooOooo = Arrays.copyOf(iArr3, iArr3.length);
        this.f6933Oooo000 = constraintWidget.f6933Oooo000;
        this.f6934Oooo00O = constraintWidget.f6934Oooo00O;
        this.f6935Oooo00o = constraintWidget.f6935Oooo00o;
        this.f6939Oooo0o0.OooOO0O();
        this.f6938Oooo0o.OooOO0O();
        this.f6940Oooo0oO.OooOO0O();
        this.f6941Oooo0oo.OooOO0O();
        this.f6931Oooo.OooOO0O();
        this.f6944OoooO00.OooOO0O();
        this.f6943OoooO0.OooOO0O();
        this.f6945OoooO0O.OooOO0O();
        this.f6947OoooOOO = (DimensionBehaviour[]) Arrays.copyOf(this.f6947OoooOOO, 2);
        this.f6948OoooOOo = this.f6948OoooOOo == null ? null : map.get(constraintWidget.f6948OoooOOo);
        this.f6949OoooOo0 = constraintWidget.f6949OoooOo0;
        this.f6950OoooOoO = constraintWidget.f6950OoooOoO;
        this.f6951OoooOoo = constraintWidget.f6951OoooOoo;
        this.f6952Ooooo00 = constraintWidget.f6952Ooooo00;
        this.f6953Ooooo0o = constraintWidget.f6953Ooooo0o;
        this.f6954OooooO0 = constraintWidget.f6954OooooO0;
        this.f6955OooooOO = constraintWidget.f6955OooooOO;
        this.f6956OooooOo = constraintWidget.f6956OooooOo;
        this.f6958Oooooo0 = constraintWidget.f6958Oooooo0;
        this.f6957Oooooo = constraintWidget.f6957Oooooo;
        this.f6959OoooooO = constraintWidget.f6959OoooooO;
        this.f6960Ooooooo = constraintWidget.f6960Ooooooo;
        this.f6969o0OoOo0 = constraintWidget.f6969o0OoOo0;
        this.f6974ooOO = constraintWidget.f6974ooOO;
        this.f6962o00O0O = constraintWidget.f6962o00O0O;
        this.f6963o00Oo0 = constraintWidget.f6963o00Oo0;
        this.f6964o00Ooo = constraintWidget.f6964o00Ooo;
        this.f6965o00o0O = constraintWidget.f6965o00o0O;
        float[] fArr = this.f6968o00ooo;
        float[] fArr2 = constraintWidget.f6968o00ooo;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f6973oo000o;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f6973oo000o;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f6967o00oO0o;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f6967o00oO0o;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f6966o00oO0O;
        this.f6966o00oO0O = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.f6970o0ooOO0;
        this.f6970o0ooOO0 = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public final void OooOOO() {
        if (this.f6904OooO0Oo == null) {
            this.f6904OooO0Oo = new o0OOO0o(this);
        }
        if (this.f6906OooO0o0 == null) {
            this.f6906OooO0o0 = new o0OO00O(this);
        }
    }

    public final void OooOOO0(androidx.constraintlayout.core.OooO0OO oooO0OO) {
        oooO0OO.OooOO0o(this.f6939Oooo0o0);
        oooO0OO.OooOO0o(this.f6938Oooo0o);
        oooO0OO.OooOO0o(this.f6940Oooo0oO);
        oooO0OO.OooOO0o(this.f6941Oooo0oo);
        if (this.f6955OooooOO > 0) {
            oooO0OO.OooOO0o(this.f6931Oooo);
        }
    }

    public ConstraintAnchor OooOOOO(ConstraintAnchor.Type type) {
        switch (OooO00o.f6975OooO00o[type.ordinal()]) {
            case 1:
                return this.f6939Oooo0o0;
            case 2:
                return this.f6938Oooo0o;
            case 3:
                return this.f6940Oooo0oO;
            case 4:
                return this.f6941Oooo0oo;
            case 5:
                return this.f6931Oooo;
            case 6:
                return this.f6945OoooO0O;
            case 7:
                return this.f6944OoooO00;
            case 8:
                return this.f6943OoooO0;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final int OooOOOo() {
        return OooOoOO() + this.f6950OoooOoO;
    }

    public final int OooOOo() {
        if (this.f6969o0OoOo0 == 8) {
            return 0;
        }
        return this.f6950OoooOoO;
    }

    public final DimensionBehaviour OooOOo0(int i) {
        if (i == 0) {
            return this.f6947OoooOOO[0];
        }
        if (i == 1) {
            return this.f6947OoooOOO[1];
        }
        return null;
    }

    public final ConstraintWidget OooOOoo(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f6941Oooo0oo).f6895OooO0o) != null && constraintAnchor2.f6895OooO0o == constraintAnchor) {
                return constraintAnchor2.f6894OooO0Oo;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f6940Oooo0oO;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f6895OooO0o;
        if (constraintAnchor4 == null || constraintAnchor4.f6895OooO0o != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f6894OooO0Oo;
    }

    public final void OooOo(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f6895OooO0o == null) {
            return;
        }
        o00O0.OooO0OO(sb, "    ", str, " : [ '");
        sb.append(constraintAnchor.f6895OooO0o);
        sb.append("'");
        if (constraintAnchor.f6898OooO0oo != Integer.MIN_VALUE || constraintAnchor.f6897OooO0oO != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f6897OooO0oO);
            if (constraintAnchor.f6898OooO0oo != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f6898OooO0oo);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final int OooOo0() {
        return OooOoO() + this.f6949OoooOo0;
    }

    public final ConstraintWidget OooOo00(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f6938Oooo0o).f6895OooO0o) != null && constraintAnchor2.f6895OooO0o == constraintAnchor) {
                return constraintAnchor2.f6894OooO0Oo;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f6939Oooo0o0;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f6895OooO0o;
        if (constraintAnchor4 == null || constraintAnchor4.f6895OooO0o != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f6894OooO0Oo;
    }

    public void OooOo0O(StringBuilder sb) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("  ");
        sbOooO0o0.append(this.f6911OooOO0o);
        sbOooO0o0.append(":{\n");
        sb.append(sbOooO0o0.toString());
        sb.append("    actualWidth:" + this.f6949OoooOo0);
        sb.append("\n");
        sb.append("    actualHeight:" + this.f6950OoooOoO);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f6953Ooooo0o);
        sb.append("\n");
        sb.append("    actualTop:" + this.f6954OooooO0);
        sb.append("\n");
        OooOo(sb, ViewHierarchyConstants.DIMENSION_LEFT_KEY, this.f6939Oooo0o0);
        OooOo(sb, ViewHierarchyConstants.DIMENSION_TOP_KEY, this.f6938Oooo0o);
        OooOo(sb, "right", this.f6940Oooo0oO);
        OooOo(sb, "bottom", this.f6941Oooo0oo);
        OooOo(sb, "baseline", this.f6931Oooo);
        OooOo(sb, "centerX", this.f6944OoooO00);
        OooOo(sb, "centerY", this.f6943OoooO0);
        int i = this.f6949OoooOo0;
        int i2 = this.f6956OooooOo;
        int i3 = this.f6930OooOooo[0];
        int i4 = this.f6923OooOo0o;
        int i5 = this.f6921OooOo00;
        float f = this.f6925OooOoO0;
        float f2 = this.f6968o00ooo[0];
        OooOo0o(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.f6950OoooOoO;
        int i7 = this.f6958Oooooo0;
        int i8 = this.f6930OooOooo[1];
        int i9 = this.f6924OooOoO;
        int i10 = this.f6920OooOo0;
        float f3 = this.f6928OooOoo0;
        float f4 = this.f6968o00ooo[1];
        OooOo0o(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.f6951OoooOoo;
        int i11 = this.f6952Ooooo00;
        if (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        Oooo0oo(sb, "    horizontalBias", this.f6957Oooooo, 0.5f);
        Oooo0oo(sb, "    verticalBias", this.f6959OoooooO, 0.5f);
        Oooo(sb, "    horizontalChainStyle", this.f6964o00Ooo, 0);
        Oooo(sb, "    verticalChainStyle", this.f6965o00o0O, 0);
        sb.append("  }");
    }

    public final void OooOo0o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        Oooo(sb, "      size", i, 0);
        Oooo(sb, "      min", i2, 0);
        Oooo(sb, "      max", i3, Integer.MAX_VALUE);
        Oooo(sb, "      matchMin", i4, 0);
        Oooo(sb, "      matchDef", i5, 0);
        Oooo0oo(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public final int OooOoO() {
        ConstraintWidget constraintWidget = this.f6948OoooOOo;
        return (constraintWidget == null || !(constraintWidget instanceof OooO0o)) ? this.f6953Ooooo0o : ((OooO0o) constraintWidget).f7044o000000O + this.f6953Ooooo0o;
    }

    public final int OooOoO0() {
        if (this.f6969o0OoOo0 == 8) {
            return 0;
        }
        return this.f6949OoooOo0;
    }

    public final int OooOoOO() {
        ConstraintWidget constraintWidget = this.f6948OoooOOo;
        return (constraintWidget == null || !(constraintWidget instanceof OooO0o)) ? this.f6954OooooO0 : ((OooO0o) constraintWidget).f7045o000000o + this.f6954OooooO0;
    }

    public final boolean OooOoo(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.f6939Oooo0o0.f6895OooO0o;
            if (constraintAnchor3 != null && constraintAnchor3.f6893OooO0OO && (constraintAnchor2 = this.f6940Oooo0oO.f6895OooO0o) != null && constraintAnchor2.f6893OooO0OO) {
                return (constraintAnchor2.OooO0Oo() - this.f6940Oooo0oO.OooO0o0()) - (this.f6939Oooo0o0.OooO0o0() + this.f6939Oooo0o0.f6895OooO0o.OooO0Oo()) >= i2;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.f6938Oooo0o.f6895OooO0o;
            if (constraintAnchor4 != null && constraintAnchor4.f6893OooO0OO && (constraintAnchor = this.f6941Oooo0oo.f6895OooO0o) != null && constraintAnchor.f6893OooO0OO) {
                return (constraintAnchor.OooO0Oo() - this.f6941Oooo0oo.OooO0o0()) - (this.f6938Oooo0o.OooO0o0() + this.f6938Oooo0o.f6895OooO0o.OooO0Oo()) >= i2;
            }
        }
        return false;
    }

    public final boolean OooOoo0(int i) {
        if (i == 0) {
            return (this.f6939Oooo0o0.f6895OooO0o != null ? 1 : 0) + (this.f6940Oooo0oO.f6895OooO0o != null ? 1 : 0) < 2;
        }
        return ((this.f6938Oooo0o.f6895OooO0o != null ? 1 : 0) + (this.f6941Oooo0oo.f6895OooO0o != null ? 1 : 0)) + (this.f6931Oooo.f6895OooO0o != null ? 1 : 0) < 2;
    }

    public final void OooOooO(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        OooOOOO(type).OooO0O0(constraintWidget.OooOOOO(type2), i, i2, true);
    }

    public final boolean OooOooo(int i) {
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f6942OoooO;
        if (constraintAnchorArr[i2].f6895OooO0o != null && constraintAnchorArr[i2].f6895OooO0o.f6895OooO0o != constraintAnchorArr[i2]) {
            int i3 = i2 + 1;
            if (constraintAnchorArr[i3].f6895OooO0o != null && constraintAnchorArr[i3].f6895OooO0o.f6895OooO0o == constraintAnchorArr[i3]) {
                return true;
            }
        }
        return false;
    }

    public final void Oooo(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public boolean Oooo0() {
        return this.f6913OooOOO0 || (this.f6939Oooo0o0.f6893OooO0OO && this.f6940Oooo0oO.f6893OooO0OO);
    }

    public final boolean Oooo000() {
        ConstraintAnchor constraintAnchor = this.f6939Oooo0o0;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f6895OooO0o;
        if (constraintAnchor2 != null && constraintAnchor2.f6895OooO0o == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f6940Oooo0oO;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f6895OooO0o;
        return constraintAnchor4 != null && constraintAnchor4.f6895OooO0o == constraintAnchor3;
    }

    public final boolean Oooo00O() {
        ConstraintAnchor constraintAnchor = this.f6938Oooo0o;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f6895OooO0o;
        if (constraintAnchor2 != null && constraintAnchor2.f6895OooO0o == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f6941Oooo0oo;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f6895OooO0o;
        return constraintAnchor4 != null && constraintAnchor4.f6895OooO0o == constraintAnchor3;
    }

    public final boolean Oooo00o() {
        return this.f6907OooO0oO && this.f6969o0OoOo0 != 8;
    }

    public boolean Oooo0O0() {
        return this.f6912OooOOO || (this.f6938Oooo0o.f6893OooO0OO && this.f6941Oooo0oo.f6893OooO0OO);
    }

    public void Oooo0OO() {
        this.f6939Oooo0o0.OooOO0O();
        this.f6938Oooo0o.OooOO0O();
        this.f6940Oooo0oO.OooOO0O();
        this.f6941Oooo0oo.OooOO0O();
        this.f6931Oooo.OooOO0O();
        this.f6944OoooO00.OooOO0O();
        this.f6943OoooO0.OooOO0O();
        this.f6945OoooO0O.OooOO0O();
        this.f6948OoooOOo = null;
        this.f6933Oooo000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6949OoooOo0 = 0;
        this.f6950OoooOoO = 0;
        this.f6951OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6952Ooooo00 = -1;
        this.f6953Ooooo0o = 0;
        this.f6954OooooO0 = 0;
        this.f6955OooooOO = 0;
        this.f6956OooooOo = 0;
        this.f6958Oooooo0 = 0;
        this.f6957Oooooo = 0.5f;
        this.f6959OoooooO = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f6947OoooOOO;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f6960Ooooooo = null;
        this.f6969o0OoOo0 = 0;
        this.f6963o00Oo0 = null;
        this.f6964o00Ooo = 0;
        this.f6965o00o0O = 0;
        float[] fArr = this.f6968o00ooo;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f6917OooOOo0 = -1;
        this.f6916OooOOo = -1;
        int[] iArr = this.f6930OooOooo;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f6921OooOo00 = 0;
        this.f6920OooOo0 = 0;
        this.f6925OooOoO0 = 1.0f;
        this.f6928OooOoo0 = 1.0f;
        this.f6919OooOo = Integer.MAX_VALUE;
        this.f6926OooOoOO = Integer.MAX_VALUE;
        this.f6923OooOo0o = 0;
        this.f6924OooOoO = 0;
        this.f6927OooOoo = -1;
        this.f6929OooOooO = 1.0f;
        boolean[] zArr = this.f6905OooO0o;
        zArr[0] = true;
        zArr[1] = true;
        this.f6932Oooo0 = false;
        boolean[] zArr2 = this.f6961o000oOoO;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f6907OooO0oO = true;
        int[] iArr2 = this.f6922OooOo0O;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f6900OooO = -1;
        this.f6909OooOO0 = -1;
    }

    public final void Oooo0o() {
        this.f6913OooOOO0 = false;
        this.f6912OooOOO = false;
        this.f6914OooOOOO = false;
        this.f6915OooOOOo = false;
        int size = this.f6946OoooOO0.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = this.f6946OoooOO0.get(i);
            constraintAnchor.f6893OooO0OO = false;
            constraintAnchor.f6892OooO0O0 = 0;
        }
    }

    public final void Oooo0o0() {
        ConstraintWidget constraintWidget = this.f6948OoooOOo;
        if (constraintWidget != null && (constraintWidget instanceof OooO0o)) {
            Objects.requireNonNull((OooO0o) constraintWidget);
        }
        int size = this.f6946OoooOO0.size();
        for (int i = 0; i < size; i++) {
            this.f6946OoooOO0.get(i).OooOO0O();
        }
    }

    public void Oooo0oO(o0000OOO.OooO00o oooO00o) {
        this.f6939Oooo0o0.OooOO0o();
        this.f6938Oooo0o.OooOO0o();
        this.f6940Oooo0oO.OooOO0o();
        this.f6941Oooo0oo.OooOO0o();
        this.f6931Oooo.OooOO0o();
        this.f6945OoooO0O.OooOO0o();
        this.f6944OoooO00.OooOO0o();
        this.f6943OoooO0.OooOO0o();
    }

    public final void Oooo0oo(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public final void OoooO(int i, int i2) {
        if (this.f6912OooOOO) {
            return;
        }
        this.f6938Oooo0o.OooOOO0(i);
        this.f6941Oooo0oo.OooOOO0(i2);
        this.f6954OooooO0 = i;
        this.f6950OoooOoO = i2 - i;
        if (this.f6934Oooo00O) {
            this.f6931Oooo.OooOOO0(i + this.f6955OooooOO);
        }
        this.f6912OooOOO = true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public final void OoooO0(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f6951OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i3);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
            } else {
                String strSubstring3 = str.substring(i3, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        fAbs = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    } else {
                        fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f6951OoooOoo = fAbs;
            this.f6952Ooooo00 = i2;
        }
    }

    public final void OoooO00(int i) {
        this.f6955OooooOO = i;
        this.f6934Oooo00O = i > 0;
    }

    public final void OoooO0O(int i, int i2) {
        if (this.f6913OooOOO0) {
            return;
        }
        this.f6939Oooo0o0.OooOOO0(i);
        this.f6940Oooo0oO.OooOOO0(i2);
        this.f6953Ooooo0o = i;
        this.f6949OoooOo0 = i2 - i;
        this.f6913OooOOO0 = true;
    }

    public final void OoooOO0(int i) {
        this.f6950OoooOoO = i;
        int i2 = this.f6958Oooooo0;
        if (i < i2) {
            this.f6950OoooOoO = i2;
        }
    }

    public final void OoooOOO(int i, int i2, int i3, float f) {
        this.f6921OooOo00 = i;
        this.f6923OooOo0o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f6919OooOo = i3;
        this.f6925OooOoO0 = f;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f >= 1.0f || i != 0) {
            return;
        }
        this.f6921OooOo00 = 2;
    }

    public final void OoooOOo(int i) {
        if (i < 0) {
            this.f6958Oooooo0 = 0;
        } else {
            this.f6958Oooooo0 = i;
        }
    }

    public final void OoooOo0(int i) {
        if (i < 0) {
            this.f6956OooooOo = 0;
        } else {
            this.f6956OooooOo = i;
        }
    }

    public final void OoooOoO(DimensionBehaviour dimensionBehaviour) {
        this.f6947OoooOOO[1] = dimensionBehaviour;
    }

    public final void OoooOoo(int i, int i2, int i3, float f) {
        this.f6920OooOo0 = i;
        this.f6924OooOoO = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f6926OooOoOO = i3;
        this.f6928OooOoo0 = f;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f >= 1.0f || i != 0) {
            return;
        }
        this.f6920OooOo0 = 2;
    }

    public final void Ooooo00(int i) {
        this.f6949OoooOo0 = i;
        int i2 = this.f6956OooooOo;
        if (i < i2) {
            this.f6949OoooOo0 = i2;
        }
    }

    public void Ooooo0o(boolean z, boolean z2) {
        int i;
        int i2;
        o0OOO0o o0ooo0o2 = this.f6904OooO0Oo;
        boolean z3 = z & o0ooo0o2.f27878OooO0oO;
        o0OO00O o0oo00o2 = this.f6906OooO0o0;
        boolean z4 = z2 & o0oo00o2.f27878OooO0oO;
        int i3 = o0ooo0o2.f27879OooO0oo.f27864OooO0oO;
        int i4 = o0oo00o2.f27879OooO0oo.f27864OooO0oO;
        int i5 = o0ooo0o2.f27871OooO.f27864OooO0oO;
        int i6 = o0oo00o2.f27871OooO.f27864OooO0oO;
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
            this.f6953Ooooo0o = i3;
        }
        if (z4) {
            this.f6954OooooO0 = i4;
        }
        if (this.f6969o0OoOo0 == 8) {
            this.f6949OoooOo0 = 0;
            this.f6950OoooOoO = 0;
            return;
        }
        if (z3) {
            if (this.f6947OoooOOO[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f6949OoooOo0)) {
                i8 = i2;
            }
            this.f6949OoooOo0 = i8;
            int i10 = this.f6956OooooOo;
            if (i8 < i10) {
                this.f6949OoooOo0 = i10;
            }
        }
        if (z4) {
            if (this.f6947OoooOOO[1] == DimensionBehaviour.FIXED && i9 < (i = this.f6950OoooOoO)) {
                i9 = i;
            }
            this.f6950OoooOoO = i9;
            int i11 = this.f6958Oooooo0;
            if (i9 < i11) {
                this.f6950OoooOoO = i11;
            }
        }
    }

    public void OooooO0(androidx.constraintlayout.core.OooO0OO oooO0OO, boolean z) {
        int i;
        int i2;
        o0OO00O o0oo00o2;
        o0OOO0o o0ooo0o2;
        int iOooOOOO = oooO0OO.OooOOOO(this.f6939Oooo0o0);
        int iOooOOOO2 = oooO0OO.OooOOOO(this.f6938Oooo0o);
        int iOooOOOO3 = oooO0OO.OooOOOO(this.f6940Oooo0oO);
        int iOooOOOO4 = oooO0OO.OooOOOO(this.f6941Oooo0oo);
        if (z && (o0ooo0o2 = this.f6904OooO0Oo) != null) {
            o00O0O o00o0o2 = o0ooo0o2.f27879OooO0oo;
            if (o00o0o2.f27866OooOO0) {
                o00O0O o00o0o3 = o0ooo0o2.f27871OooO;
                if (o00o0o3.f27866OooOO0) {
                    iOooOOOO = o00o0o2.f27864OooO0oO;
                    iOooOOOO3 = o00o0o3.f27864OooO0oO;
                }
            }
        }
        if (z && (o0oo00o2 = this.f6906OooO0o0) != null) {
            o00O0O o00o0o4 = o0oo00o2.f27879OooO0oo;
            if (o00o0o4.f27866OooOO0) {
                o00O0O o00o0o5 = o0oo00o2.f27871OooO;
                if (o00o0o5.f27866OooOO0) {
                    iOooOOOO2 = o00o0o4.f27864OooO0oO;
                    iOooOOOO4 = o00o0o5.f27864OooO0oO;
                }
            }
        }
        int i3 = iOooOOOO4 - iOooOOOO2;
        if (iOooOOOO3 - iOooOOOO < 0 || i3 < 0 || iOooOOOO == Integer.MIN_VALUE || iOooOOOO == Integer.MAX_VALUE || iOooOOOO2 == Integer.MIN_VALUE || iOooOOOO2 == Integer.MAX_VALUE || iOooOOOO3 == Integer.MIN_VALUE || iOooOOOO3 == Integer.MAX_VALUE || iOooOOOO4 == Integer.MIN_VALUE || iOooOOOO4 == Integer.MAX_VALUE) {
            iOooOOOO4 = 0;
            iOooOOOO = 0;
            iOooOOOO2 = 0;
            iOooOOOO3 = 0;
        }
        int i4 = iOooOOOO3 - iOooOOOO;
        int i5 = iOooOOOO4 - iOooOOOO2;
        this.f6953Ooooo0o = iOooOOOO;
        this.f6954OooooO0 = iOooOOOO2;
        if (this.f6969o0OoOo0 == 8) {
            this.f6949OoooOo0 = 0;
            this.f6950OoooOoO = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f6947OoooOOO;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.f6949OoooOo0)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.f6950OoooOoO)) {
            i5 = i;
        }
        this.f6949OoooOo0 = i4;
        this.f6950OoooOoO = i5;
        int i6 = this.f6958Oooooo0;
        if (i5 < i6) {
            this.f6950OoooOoO = i6;
        }
        int i7 = this.f6956OooooOo;
        if (i4 < i7) {
            this.f6949OoooOo0 = i7;
        }
        int i8 = this.f6919OooOo;
        if (i8 > 0 && dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f6949OoooOo0 = Math.min(this.f6949OoooOo0, i8);
        }
        int i9 = this.f6926OooOoOO;
        if (i9 > 0 && this.f6947OoooOOO[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f6950OoooOoO = Math.min(this.f6950OoooOoO, i9);
        }
        int i10 = this.f6949OoooOo0;
        if (i4 != i10) {
            this.f6900OooO = i10;
        }
        int i11 = this.f6950OoooOoO;
        if (i5 != i11) {
            this.f6909OooOO0 = i11;
        }
    }

    public final void o000oOoO(DimensionBehaviour dimensionBehaviour) {
        this.f6947OoooOOO[0] = dimensionBehaviour;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6963o00Oo0 != null ? p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("type: "), this.f6963o00Oo0, ZegoConstants.ZegoVideoDataAuxPublishingStream) : "");
        sb.append(this.f6962o00O0O != null ? p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("id: "), this.f6962o00O0O, ZegoConstants.ZegoVideoDataAuxPublishingStream) : "");
        sb.append("(");
        sb.append(this.f6953Ooooo0o);
        sb.append(", ");
        sb.append(this.f6954OooooO0);
        sb.append(") - (");
        sb.append(this.f6949OoooOo0);
        sb.append(" x ");
        return o0ooOOo.OooO00o(sb, this.f6950OoooOoO, ")");
    }

    public ConstraintWidget(int i, int i2) {
        this.f6901OooO00o = false;
        this.f6904OooO0Oo = null;
        this.f6906OooO0o0 = null;
        this.f6905OooO0o = new boolean[]{true, true};
        this.f6907OooO0oO = true;
        this.f6908OooO0oo = true;
        this.f6900OooO = -1;
        this.f6909OooOO0 = -1;
        this.f6910OooOO0O = new o0000Ooo(this);
        this.f6913OooOOO0 = false;
        this.f6912OooOOO = false;
        this.f6914OooOOOO = false;
        this.f6915OooOOOo = false;
        this.f6917OooOOo0 = -1;
        this.f6916OooOOo = -1;
        this.f6918OooOOoo = 0;
        this.f6921OooOo00 = 0;
        this.f6920OooOo0 = 0;
        this.f6922OooOo0O = new int[2];
        this.f6923OooOo0o = 0;
        this.f6919OooOo = 0;
        this.f6925OooOoO0 = 1.0f;
        this.f6924OooOoO = 0;
        this.f6926OooOoOO = 0;
        this.f6928OooOoo0 = 1.0f;
        this.f6927OooOoo = -1;
        this.f6929OooOooO = 1.0f;
        this.f6930OooOooo = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f6933Oooo000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6934Oooo00O = false;
        this.f6932Oooo0 = false;
        this.f6936Oooo0O0 = 0;
        this.f6937Oooo0OO = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f6939Oooo0o0 = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f6938Oooo0o = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f6940Oooo0oO = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f6941Oooo0oo = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f6931Oooo = constraintAnchor5;
        this.f6944OoooO00 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f6943OoooO0 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f6945OoooO0O = constraintAnchor6;
        this.f6942OoooO = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.f6946OoooOO0 = new ArrayList<>();
        this.f6961o000oOoO = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f6947OoooOOO = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f6948OoooOOo = null;
        this.f6951OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6952Ooooo00 = -1;
        this.f6955OooooOO = 0;
        this.f6957Oooooo = 0.5f;
        this.f6959OoooooO = 0.5f;
        this.f6969o0OoOo0 = 0;
        this.f6974ooOO = false;
        this.f6962o00O0O = null;
        this.f6963o00Oo0 = null;
        this.f6964o00Ooo = 0;
        this.f6965o00o0O = 0;
        this.f6968o00ooo = new float[]{-1.0f, -1.0f};
        this.f6973oo000o = new ConstraintWidget[]{null, null};
        this.f6967o00oO0o = new ConstraintWidget[]{null, null};
        this.f6966o00oO0O = null;
        this.f6970o0ooOO0 = null;
        this.f6971o0ooOOo = -1;
        this.f6972o0ooOoO = -1;
        this.f6953Ooooo0o = 0;
        this.f6954OooooO0 = 0;
        this.f6949OoooOo0 = i;
        this.f6950OoooOoO = i2;
        OooO0Oo();
    }
}
