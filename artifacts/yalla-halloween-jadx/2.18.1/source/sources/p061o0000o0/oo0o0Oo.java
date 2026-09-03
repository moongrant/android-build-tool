package p061o0000o0;

import androidx.constraintlayout.core.OooO0OO;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0O0;
import androidx.constraintlayout.core.widgets.OooO0o;
import com.facebook.internal.AnalyticsEvents;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o0O0O00.o0ooOOo;
import p016OooOoO0.OooOo00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static int f27889OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27891OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27892OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f27890OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<OooO00o> f27893OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27894OooO0o0 = -1;

    public class OooO00o {
        public OooO00o(ConstraintWidget constraintWidget, OooO0OO oooO0OO) {
            new WeakReference(constraintWidget);
            oooO0OO.OooOOOO(constraintWidget.f6939Oooo0o0);
            oooO0OO.OooOOOO(constraintWidget.f6938Oooo0o);
            oooO0OO.OooOOOO(constraintWidget.f6940Oooo0oO);
            oooO0OO.OooOOOO(constraintWidget.f6941Oooo0oo);
            oooO0OO.OooOOOO(constraintWidget.f6931Oooo);
        }
    }

    public oo0o0Oo(int i) {
        int i2 = f27889OooO0o;
        f27889OooO0o = i2 + 1;
        this.f27891OooO0O0 = i2;
        this.f27892OooO0OO = i;
    }

    public final boolean OooO00o(ConstraintWidget constraintWidget) {
        if (this.f27890OooO00o.contains(constraintWidget)) {
            return false;
        }
        this.f27890OooO00o.add(constraintWidget);
        return true;
    }

    public final void OooO0O0(ArrayList<oo0o0Oo> arrayList) {
        int size = this.f27890OooO00o.size();
        if (this.f27894OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                oo0o0Oo oo0o0oo = arrayList.get(i);
                if (this.f27894OooO0o0 == oo0o0oo.f27891OooO0O0) {
                    OooO0Oo(this.f27892OooO0OO, oo0o0oo);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int OooO0OO(OooO0OO oooO0OO, int i) {
        int iOooOOOO;
        int iOooOOOO2;
        if (this.f27890OooO00o.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.f27890OooO00o;
        OooO0o oooO0o = (OooO0o) arrayList.get(0).f6948OoooOOo;
        oooO0OO.OooOo0();
        oooO0o.OooO0oO(oooO0OO, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).OooO0oO(oooO0OO, false);
        }
        if (i == 0 && oooO0o.f7042o00000 > 0) {
            OooO0O0.OooO00o(oooO0o, oooO0OO, arrayList, 0);
        }
        if (i == 1 && oooO0o.f7047o00000O0 > 0) {
            OooO0O0.OooO00o(oooO0o, oooO0OO, arrayList, 1);
        }
        try {
            oooO0OO.OooOOo0();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f27893OooO0Oo = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f27893OooO0Oo.add(new OooO00o(arrayList.get(i3), oooO0OO));
        }
        if (i == 0) {
            iOooOOOO = oooO0OO.OooOOOO(oooO0o.f6939Oooo0o0);
            iOooOOOO2 = oooO0OO.OooOOOO(oooO0o.f6940Oooo0oO);
            oooO0OO.OooOo0();
        } else {
            iOooOOOO = oooO0OO.OooOOOO(oooO0o.f6938Oooo0o);
            iOooOOOO2 = oooO0OO.OooOOOO(oooO0o.f6941Oooo0oo);
            oooO0OO.OooOo0();
        }
        return iOooOOOO2 - iOooOOOO;
    }

    public final void OooO0Oo(int i, oo0o0Oo oo0o0oo) {
        for (ConstraintWidget constraintWidget : this.f27890OooO00o) {
            oo0o0oo.OooO00o(constraintWidget);
            if (i == 0) {
                constraintWidget.f6971o0ooOOo = oo0o0oo.f27891OooO0O0;
            } else {
                constraintWidget.f6972o0ooOoO = oo0o0oo.f27891OooO0O0;
            }
        }
        this.f27894OooO0o0 = oo0o0oo.f27891OooO0O0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f27892OooO0OO;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        sb.append(str);
        sb.append(" [");
        String strOooO00o = o0ooOOo.OooO00o(sb, this.f27891OooO0O0, "] <");
        for (ConstraintWidget constraintWidget : this.f27890OooO00o) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sbOooO00o.append(constraintWidget.f6962o00O0O);
            strOooO00o = sbOooO00o.toString();
        }
        return OooOo00.OooO0Oo(strOooO00o, " >");
    }
}
