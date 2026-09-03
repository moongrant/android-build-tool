package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.facebook.internal.AnalyticsEvents;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static int f41133OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f41135OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f41136OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f41134OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<OooO00o> f41137OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f41138OooO0o0 = -1;

    public class OooO00o {
        public OooO00o(ConstraintWidget constraintWidget, androidx.constraintlayout.core.OooO0OO oooO0OO) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.f4379Oooo0o0;
            oooO0OO.getClass();
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintAnchor);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4378Oooo0o);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4380Oooo0oO);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4381Oooo0oo);
            androidx.constraintlayout.core.OooO0OO.OooOOO(constraintWidget.f4371Oooo);
        }
    }

    public o000oOoO(int i) {
        this.f41135OooO0O0 = -1;
        int i2 = f41133OooO0o;
        f41133OooO0o = i2 + 1;
        this.f41135OooO0O0 = i2;
        this.f41136OooO0OO = i;
    }

    public final void OooO00o(ArrayList<o000oOoO> arrayList) {
        int size = this.f41134OooO00o.size();
        if (this.f41138OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o000oOoO o000oooo2 = arrayList.get(i);
                if (this.f41138OooO0o0 == o000oooo2.f41135OooO0O0) {
                    OooO0OO(this.f41136OooO0OO, o000oooo2);
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
        ArrayList<ConstraintWidget> arrayList = this.f41134OooO00o;
        if (arrayList.size() == 0) {
            return 0;
        }
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = (androidx.constraintlayout.core.widgets.OooO0o) arrayList.get(0).f4388OoooOOo;
        oooO0OO.OooOOoo();
        oooO0o.OooO0o(oooO0OO, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).OooO0o(oooO0OO, false);
        }
        if (i == 0 && oooO0o.f4482o00000 > 0) {
            androidx.constraintlayout.core.widgets.OooO0O0.OooO00o(oooO0o, oooO0OO, arrayList, 0);
        }
        if (i == 1 && oooO0o.f4487o00000O0 > 0) {
            androidx.constraintlayout.core.widgets.OooO0O0.OooO00o(oooO0o, oooO0OO, arrayList, 1);
        }
        try {
            oooO0OO.OooOOOo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f41137OooO0Oo = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f41137OooO0Oo.add(new OooO00o(arrayList.get(i3), oooO0OO));
        }
        if (i == 0) {
            iOooOOO = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4379Oooo0o0);
            iOooOOO2 = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4380Oooo0oO);
            oooO0OO.OooOOoo();
        } else {
            iOooOOO = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4378Oooo0o);
            iOooOOO2 = androidx.constraintlayout.core.OooO0OO.OooOOO(oooO0o.f4381Oooo0oo);
            oooO0OO.OooOOoo();
        }
        return iOooOOO2 - iOooOOO;
    }

    public final void OooO0OO(int i, o000oOoO o000oooo2) {
        Iterator<ConstraintWidget> it = this.f41134OooO00o.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i2 = o000oooo2.f41135OooO0O0;
            if (!zHasNext) {
                this.f41138OooO0o0 = i2;
                return;
            }
            ConstraintWidget next = it.next();
            ArrayList<ConstraintWidget> arrayList = o000oooo2.f41134OooO00o;
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
            if (i == 0) {
                next.f4411o0ooOOo = i2;
            } else {
                next.f4412o0ooOoO = i2;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f41136OooO0OO;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        sb.append(str);
        sb.append(" [");
        String strOooO00o = p022Oooo00O.OooOO0.OooO00o(sb, this.f41135OooO0O0, "] <");
        for (ConstraintWidget constraintWidget : this.f41134OooO00o) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO0O0.append(constraintWidget.f4402o00O0O);
            strOooO00o = sbOooO0O0.toString();
        }
        return androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " >");
    }
}
