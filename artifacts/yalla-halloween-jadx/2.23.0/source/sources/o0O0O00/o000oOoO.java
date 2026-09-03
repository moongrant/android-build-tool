package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.facebook.internal.AnalyticsEvents;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static int f41880OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f41882OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f41883OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f41881OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<OooO00o> f41884OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f41885OooO0o0 = -1;

    public class OooO00o {
        public OooO00o(ConstraintWidget constraintWidget, androidx.constraintlayout.core.OooO0OO oooO0OO) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.f4373Oooo0o0;
            oooO0OO.getClass();
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintAnchor);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4372Oooo0o);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4374Oooo0oO);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4375Oooo0oo);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4365Oooo);
        }
    }

    public o000oOoO(int i) {
        this.f41882OooO0O0 = -1;
        int i2 = f41880OooO0o;
        f41880OooO0o = i2 + 1;
        this.f41882OooO0O0 = i2;
        this.f41883OooO0OO = i;
    }

    public final void OooO00o(ArrayList<o000oOoO> arrayList) {
        int size = this.f41881OooO00o.size();
        if (this.f41885OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o000oOoO o000oooo2 = arrayList.get(i);
                if (this.f41885OooO0o0 == o000oooo2.f41882OooO0O0) {
                    OooO0OO(this.f41883OooO0OO, o000oooo2);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int OooO0O0(androidx.constraintlayout.core.OooO0OO oooO0OO, int i) {
        int iOooOOO;
        int iOooOOO2;
        ArrayList<ConstraintWidget> arrayList = this.f41881OooO00o;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = (androidx.constraintlayout.core.widgets.OooO0o) arrayList.get(0).f4382OoooOOo;
        oooO0OO.OooOOoo();
        oooO0o.OooO0o(oooO0OO, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).OooO0o(oooO0OO, false);
        }
        if (i == 0 && oooO0o.f4476o00000 > 0) {
            androidx.constraintlayout.core.widgets.OooO0O0.OooO00o(oooO0o, oooO0OO, arrayList, 0);
        }
        if (i == 1 && oooO0o.f4481o00000O0 > 0) {
            androidx.constraintlayout.core.widgets.OooO0O0.OooO00o(oooO0o, oooO0OO, arrayList, 1);
        }
        try {
            oooO0OO.OooOOOo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f41884OooO0Oo = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f41884OooO0Oo.add(new OooO00o(arrayList.get(i3), oooO0OO));
        }
        if (i == 0) {
            iOooOOO = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4373Oooo0o0);
            iOooOOO2 = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4374Oooo0oO);
            oooO0OO.OooOOoo();
        } else {
            iOooOOO = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4372Oooo0o);
            iOooOOO2 = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4375Oooo0oo);
            oooO0OO.OooOOoo();
        }
        return iOooOOO2 - iOooOOO;
    }

    public final void OooO0OO(int i, o000oOoO o000oooo2) {
        Iterator<ConstraintWidget> it = this.f41881OooO00o.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i2 = o000oooo2.f41882OooO0O0;
            if (!zHasNext) {
                this.f41885OooO0o0 = i2;
                return;
            }
            ConstraintWidget next = it.next();
            ArrayList<ConstraintWidget> arrayList = o000oooo2.f41881OooO00o;
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
            if (i == 0) {
                next.f4405o0ooOOo = i2;
            } else {
                next.f4406o0ooOoO = i2;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f41883OooO0OO;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        sb.append(str);
        sb.append(" [");
        String strOooO0O0 = p022Oooo00O.OooOO0.OooO0O0(sb, this.f41882OooO0O0, "] <");
        for (ConstraintWidget constraintWidget : this.f41881OooO00o) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(strOooO0O0, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0O0.append(constraintWidget.f4396o00O0O);
            strOooO0O0 = sbOooO0O0.toString();
        }
        return androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0O0, " >");
    }
}
