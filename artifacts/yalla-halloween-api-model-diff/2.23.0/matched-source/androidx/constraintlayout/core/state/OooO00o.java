package androidx.constraintlayout.core.state;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import p340o0OOO0o.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o implements o0OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f4280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final State f4281OooO0O0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f4311Oooo000;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public Object f4314Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ConstraintWidget f4315Oooo0OO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f4282OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4283OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4285OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f4284OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f4286OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4287OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4279OooO = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f4288OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4289OooOO0O = 0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4290OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f4292OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f4291OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f4293OooOOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f4294OooOOOo = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Object f4296OooOOo0 = null;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Object f4295OooOOo = null;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Object f4297OooOOoo = null;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Object f4300OooOo00 = null;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Object f4299OooOo0 = null;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Object f4301OooOo0O = null;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f4302OooOo0o = null;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f4298OooOo = null;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f4304OooOoO0 = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f4303OooOoO = null;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f4305OooOoOO = null;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f4307OooOoo0 = null;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f4306OooOoo = null;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Object f4308OooOooO = null;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Object f4309OooOooo = null;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public State.Constraint f4312Oooo00O = null;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Dimension f4313Oooo00o = Dimension.OooO00o();

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public Dimension f4310Oooo0 = Dimension.OooO00o();

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final HashMap<String, Integer> f4317Oooo0o0 = new HashMap<>();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final HashMap<String, Float> f4316Oooo0o = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0112OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4318OooO00o;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f4318OooO00o = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4318OooO00o[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4318OooO00o[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4318OooO00o[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4318OooO00o[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4318OooO00o[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4318OooO00o[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4318OooO00o[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4318OooO00o[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4318OooO00o[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4318OooO00o[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4318OooO00o[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4318OooO00o[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4318OooO00o[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4318OooO00o[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4318OooO00o[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4318OooO00o[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4318OooO00o[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public OooO00o(State state) {
        this.f4281OooO0O0 = state;
    }

    @Override // o0OO00O.OooO00o
    public ConstraintWidget OooO00o() {
        if (this.f4315Oooo0OO == null) {
            ConstraintWidget constraintWidget = new ConstraintWidget(this.f4313Oooo00o.f4276OooO0Oo, this.f4310Oooo0.f4276OooO0Oo);
            this.f4315Oooo0OO = constraintWidget;
            constraintWidget.f4394Ooooooo = this.f4314Oooo0O0;
        }
        return this.f4315Oooo0OO;
    }

    @Override // o0OO00O.OooO00o
    public void OooO0O0() {
        ConstraintWidget constraintWidget = this.f4315Oooo0OO;
        if (constraintWidget == null) {
            return;
        }
        this.f4313Oooo00o.OooO0O0(constraintWidget, 0);
        this.f4310Oooo0.OooO0O0(this.f4315Oooo0OO, 1);
        this.f4296OooOOo0 = OooO0o(this.f4296OooOOo0);
        this.f4295OooOOo = OooO0o(this.f4295OooOOo);
        this.f4297OooOOoo = OooO0o(this.f4297OooOOoo);
        this.f4300OooOo00 = OooO0o(this.f4300OooOo00);
        this.f4299OooOo0 = OooO0o(this.f4299OooOo0);
        this.f4301OooOo0O = OooO0o(this.f4301OooOo0O);
        this.f4302OooOo0o = OooO0o(this.f4302OooOo0o);
        this.f4298OooOo = OooO0o(this.f4298OooOo);
        this.f4304OooOoO0 = OooO0o(this.f4304OooOoO0);
        this.f4303OooOoO = OooO0o(this.f4303OooOoO);
        this.f4305OooOoOO = OooO0o(this.f4305OooOoOO);
        this.f4307OooOoo0 = OooO0o(this.f4307OooOoo0);
        this.f4306OooOoo = OooO0o(this.f4306OooOoo);
        this.f4308OooOooO = OooO0o(this.f4308OooOooO);
        this.f4309OooOooo = OooO0o(this.f4309OooOooo);
        OooO0o0(this.f4315Oooo0OO, this.f4296OooOOo0, State.Constraint.LEFT_TO_LEFT);
        OooO0o0(this.f4315Oooo0OO, this.f4295OooOOo, State.Constraint.LEFT_TO_RIGHT);
        OooO0o0(this.f4315Oooo0OO, this.f4297OooOOoo, State.Constraint.RIGHT_TO_LEFT);
        OooO0o0(this.f4315Oooo0OO, this.f4300OooOo00, State.Constraint.RIGHT_TO_RIGHT);
        OooO0o0(this.f4315Oooo0OO, this.f4299OooOo0, State.Constraint.START_TO_START);
        OooO0o0(this.f4315Oooo0OO, this.f4301OooOo0O, State.Constraint.START_TO_END);
        OooO0o0(this.f4315Oooo0OO, this.f4302OooOo0o, State.Constraint.END_TO_START);
        OooO0o0(this.f4315Oooo0OO, this.f4298OooOo, State.Constraint.END_TO_END);
        OooO0o0(this.f4315Oooo0OO, this.f4304OooOoO0, State.Constraint.TOP_TO_TOP);
        OooO0o0(this.f4315Oooo0OO, this.f4303OooOoO, State.Constraint.TOP_TO_BOTTOM);
        OooO0o0(this.f4315Oooo0OO, this.f4305OooOoOO, State.Constraint.BOTTOM_TO_TOP);
        OooO0o0(this.f4315Oooo0OO, this.f4307OooOoo0, State.Constraint.BOTTOM_TO_BOTTOM);
        OooO0o0(this.f4315Oooo0OO, this.f4306OooOoo, State.Constraint.BASELINE_TO_BASELINE);
        OooO0o0(this.f4315Oooo0OO, this.f4308OooOooO, State.Constraint.BASELINE_TO_TOP);
        OooO0o0(this.f4315Oooo0OO, this.f4309OooOooo, State.Constraint.BASELINE_TO_BOTTOM);
        OooO0o0(this.f4315Oooo0OO, null, State.Constraint.CIRCULAR_CONSTRAINT);
        ConstraintWidget constraintWidget2 = this.f4315Oooo0OO;
        constraintWidget2.f4391Oooooo = 0.5f;
        constraintWidget2.f4393OoooooO = 0.5f;
        o0OO00O.OooO0O0 oooO0O0 = constraintWidget2.f4344OooOO0O;
        oooO0O0.f43005OooO0o = Float.NaN;
        oooO0O0.f43007OooO0oO = Float.NaN;
        oooO0O0.f43008OooO0oo = Float.NaN;
        oooO0O0.f43000OooO = Float.NaN;
        oooO0O0.f43009OooOO0 = Float.NaN;
        oooO0O0.f43010OooOO0O = Float.NaN;
        oooO0O0.f43011OooOO0o = Float.NaN;
        oooO0O0.f43013OooOOO0 = Float.NaN;
        oooO0O0.f43012OooOOO = Float.NaN;
        oooO0O0.f43014OooOOOO = Float.NaN;
        oooO0O0.f43015OooOOOo = Float.NaN;
        oooO0O0.f43016OooOOo = 0;
        constraintWidget2.f4403o0OoOo0 = 0;
        HashMap<String, Integer> map = this.f4317Oooo0o0;
        if (map != null) {
            for (String str : map.keySet()) {
                Integer num = map.get(str);
                o0OO00O.OooO0O0 oooO0O1 = this.f4315Oooo0OO.f4344OooOO0O;
                int iIntValue = num.intValue();
                HashMap<String, OooO0o> map2 = oooO0O1.f43018OooOOoo;
                if (map2.containsKey(str)) {
                    map2.get(str).f43604OooO0OO = iIntValue;
                } else {
                    map2.put(str, new OooO0o(str, iIntValue));
                }
            }
        }
        HashMap<String, Float> map3 = this.f4316Oooo0o;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                float fFloatValue = map3.get(str2).floatValue();
                HashMap<String, OooO0o> map4 = this.f4315Oooo0OO.f4344OooOO0O.f43018OooOOoo;
                if (map4.containsKey(str2)) {
                    map4.get(str2).f43605OooO0Oo = fFloatValue;
                } else {
                    map4.put(str2, new OooO0o(str2, fFloatValue));
                }
            }
        }
    }

    @Override // o0OO00O.OooO00o
    public final void OooO0OO(androidx.constraintlayout.core.widgets.OooO0o oooO0o) {
        this.f4315Oooo0OO = oooO0o;
        oooO0o.f4394Ooooooo = this.f4314Oooo0O0;
    }

    @Override // o0OO00O.OooO00o
    public final void OooO0Oo() {
    }

    public final Object OooO0o(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof OooO00o) ? this.f4281OooO0O0.f4320OooO00o.get(obj) : obj;
    }

    public final void OooO0o0(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidgetOooO00o = obj instanceof o0OO00O.OooO00o ? ((o0OO00O.OooO00o) obj).OooO00o() : null;
        if (constraintWidgetOooO00o == null) {
        }
        int[] iArr = C0112OooO00o.f4318OooO00o;
        int i = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.OooOOO(type).OooO0O0(constraintWidgetOooO00o.OooOOO(type), this.f4282OooO0OO, this.f4279OooO, false);
                break;
            case 2:
                constraintWidget.OooOOO(ConstraintAnchor.Type.LEFT).OooO0O0(constraintWidgetOooO00o.OooOOO(ConstraintAnchor.Type.RIGHT), this.f4282OooO0OO, this.f4279OooO, false);
                break;
            case 3:
                constraintWidget.OooOOO(ConstraintAnchor.Type.RIGHT).OooO0O0(constraintWidgetOooO00o.OooOOO(ConstraintAnchor.Type.LEFT), this.f4283OooO0Oo, this.f4288OooOO0, false);
                break;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.OooOOO(type2).OooO0O0(constraintWidgetOooO00o.OooOOO(type2), this.f4283OooO0Oo, this.f4288OooOO0, false);
                break;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.OooOOO(type3).OooO0O0(constraintWidgetOooO00o.OooOOO(type3), this.f4285OooO0o0, this.f4289OooOO0O, false);
                break;
            case 6:
                constraintWidget.OooOOO(ConstraintAnchor.Type.LEFT).OooO0O0(constraintWidgetOooO00o.OooOOO(ConstraintAnchor.Type.RIGHT), this.f4285OooO0o0, this.f4289OooOO0O, false);
                break;
            case 7:
                constraintWidget.OooOOO(ConstraintAnchor.Type.RIGHT).OooO0O0(constraintWidgetOooO00o.OooOOO(ConstraintAnchor.Type.LEFT), this.f4284OooO0o, this.f4290OooOO0o, false);
                break;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.OooOOO(type4).OooO0O0(constraintWidgetOooO00o.OooOOO(type4), this.f4284OooO0o, this.f4290OooOO0o, false);
                break;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.OooOOO(type5).OooO0O0(constraintWidgetOooO00o.OooOOO(type5), this.f4286OooO0oO, this.f4292OooOOO0, false);
                break;
            case 10:
                constraintWidget.OooOOO(ConstraintAnchor.Type.TOP).OooO0O0(constraintWidgetOooO00o.OooOOO(ConstraintAnchor.Type.BOTTOM), this.f4286OooO0oO, this.f4292OooOOO0, false);
                break;
            case 11:
                constraintWidget.OooOOO(ConstraintAnchor.Type.BOTTOM).OooO0O0(constraintWidgetOooO00o.OooOOO(ConstraintAnchor.Type.TOP), this.f4287OooO0oo, this.f4291OooOOO, false);
                break;
            case 12:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.OooOOO(type6).OooO0O0(constraintWidgetOooO00o.OooOOO(type6), this.f4287OooO0oo, this.f4291OooOOO, false);
                break;
            case 13:
                constraintWidget.OooOoOO(ConstraintAnchor.Type.BASELINE, constraintWidgetOooO00o, ConstraintAnchor.Type.BOTTOM, this.f4293OooOOOO, this.f4294OooOOOo);
                break;
            case 14:
                constraintWidget.OooOoOO(ConstraintAnchor.Type.BASELINE, constraintWidgetOooO00o, ConstraintAnchor.Type.TOP, this.f4293OooOOOO, this.f4294OooOOOo);
                break;
            case 15:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.OooOoOO(type7, constraintWidgetOooO00o, type7, this.f4293OooOOOO, this.f4294OooOOOo);
                break;
            case 16:
                int i2 = (int) this.f4311Oooo000;
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.CENTER;
                constraintWidget.OooOoOO(type8, constraintWidgetOooO00o, type8, i2, 0);
                constraintWidget.f4367Oooo000 = 0.0f;
                break;
        }
    }

    public final void OooO0oO(Dp dp) {
        int iOooO0O0 = this.f4281OooO0O0.OooO0O0(dp);
        State.Constraint constraint = this.f4312Oooo00O;
        if (constraint == null) {
            this.f4282OooO0OO = iOooO0O0;
            this.f4283OooO0Oo = iOooO0O0;
            this.f4285OooO0o0 = iOooO0O0;
            this.f4284OooO0o = iOooO0O0;
            this.f4286OooO0oO = iOooO0O0;
            this.f4287OooO0oo = iOooO0O0;
        }
        switch (C0112OooO00o.f4318OooO00o[constraint.ordinal()]) {
            case 1:
            case 2:
                this.f4282OooO0OO = iOooO0O0;
                break;
            case 3:
            case 4:
                this.f4283OooO0Oo = iOooO0O0;
                break;
            case 5:
            case 6:
                this.f4285OooO0o0 = iOooO0O0;
                break;
            case 7:
            case 8:
                this.f4284OooO0o = iOooO0O0;
                break;
            case 9:
            case 10:
                this.f4286OooO0oO = iOooO0O0;
                break;
            case 11:
            case 12:
                this.f4287OooO0oo = iOooO0O0;
                break;
            case 13:
            case 14:
            case 15:
                this.f4293OooOOOO = iOooO0O0;
                break;
            case 16:
                this.f4311Oooo000 = iOooO0O0;
                break;
        }
    }

    public final void OooO0oo(Dp dp) {
        int iOooO0O0 = this.f4281OooO0O0.OooO0O0(dp);
        State.Constraint constraint = this.f4312Oooo00O;
        if (constraint == null) {
            this.f4279OooO = iOooO0O0;
            this.f4288OooOO0 = iOooO0O0;
            this.f4289OooOO0O = iOooO0O0;
            this.f4290OooOO0o = iOooO0O0;
            this.f4292OooOOO0 = iOooO0O0;
            this.f4291OooOOO = iOooO0O0;
        }
        switch (C0112OooO00o.f4318OooO00o[constraint.ordinal()]) {
            case 1:
            case 2:
                this.f4279OooO = iOooO0O0;
                break;
            case 3:
            case 4:
                this.f4288OooOO0 = iOooO0O0;
                break;
            case 5:
            case 6:
                this.f4289OooOO0O = iOooO0O0;
                break;
            case 7:
            case 8:
                this.f4290OooOO0o = iOooO0O0;
                break;
            case 9:
            case 10:
                this.f4292OooOOO0 = iOooO0O0;
                break;
            case 11:
            case 12:
                this.f4291OooOOO = iOooO0O0;
                break;
            case 13:
            case 14:
            case 15:
                this.f4294OooOOOo = iOooO0O0;
                break;
        }
    }

    @Override // o0OO00O.OooO00o
    public final Object getKey() {
        return this.f4280OooO00o;
    }
}
