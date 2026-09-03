package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f27834OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f27835OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f27836OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f27837OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f27838OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f27839OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f27840OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f27841OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f27842OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f27843OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f27844OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f27845OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f27846OooOO0;
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0(ConstraintWidget constraintWidget, OooO00o oooO00o);
    }

    public OooOo(OooO0o oooO0o) {
        this.f27836OooO0OO = oooO0o;
    }

    public final boolean OooO00o(OooO0O0 oooO0O0, ConstraintWidget constraintWidget, int i) {
        OooO00o oooO00o = this.f27835OooO0O0;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
        oooO00o.f27838OooO00o = dimensionBehaviourArr[0];
        oooO00o.f27839OooO0O0 = dimensionBehaviourArr[1];
        oooO00o.f27840OooO0OO = constraintWidget.OooOoO0();
        this.f27835OooO0O0.f27841OooO0Oo = constraintWidget.OooOOo();
        OooO00o oooO00o2 = this.f27835OooO0O0;
        oooO00o2.f27837OooO = false;
        oooO00o2.f27846OooOO0 = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = oooO00o2.f27838OooO00o;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = oooO00o2.f27839OooO0O0 == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        boolean z4 = z2 && constraintWidget.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (z3 && constraintWidget.f6922OooOo0O[0] == 4) {
            oooO00o2.f27838OooO00o = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.f6922OooOo0O[1] == 4) {
            oooO00o2.f27839OooO0O0 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        oooO0O0.OooO0O0(constraintWidget, oooO00o2);
        constraintWidget.Ooooo00(this.f27835OooO0O0.f27843OooO0o0);
        constraintWidget.OoooOO0(this.f27835OooO0O0.f27842OooO0o);
        OooO00o oooO00o3 = this.f27835OooO0O0;
        constraintWidget.f6934Oooo00O = oooO00o3.f27845OooO0oo;
        constraintWidget.OoooO00(oooO00o3.f27844OooO0oO);
        OooO00o oooO00o4 = this.f27835OooO0O0;
        oooO00o4.f27846OooOO0 = 0;
        return oooO00o4.f27837OooO;
    }

    public final void OooO0O0(OooO0o oooO0o, int i, int i2, int i3) {
        int i4 = oooO0o.f6956OooooOo;
        int i5 = oooO0o.f6958Oooooo0;
        oooO0o.OoooOo0(0);
        oooO0o.OoooOOo(0);
        oooO0o.Ooooo00(i2);
        oooO0o.OoooOO0(i3);
        oooO0o.OoooOo0(i4);
        oooO0o.OoooOOo(i5);
        OooO0o oooO0o2 = this.f27836OooO0OO;
        oooO0o2.f7061oo0o0Oo = i;
        oooO0o2.OooooOO();
    }

    public final void OooO0OO(OooO0o oooO0o) {
        this.f27834OooO00o.clear();
        int size = oooO0o.f27656o0OOO0o.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = oooO0o.f27656o0OOO0o.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f6947OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                this.f27834OooO00o.add(constraintWidget);
            }
        }
        oooO0o.o00Oo0();
    }
}
