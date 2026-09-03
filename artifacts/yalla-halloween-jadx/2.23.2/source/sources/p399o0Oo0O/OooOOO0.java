package p399o0Oo0O;

import androidx.appcompat.widget.o0000O0;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOOO0<MapKey, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap f43646OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList f43647OooO0O0 = null;

    public OooOOO0() {
        OooO0O0();
    }

    public final int OooO00o(MomentSendCommentModel momentSendCommentModel) {
        OooO0O0();
        for (int i = 0; i < this.f43647OooO0O0.size(); i++) {
            Object obj = this.f43647OooO0O0.get(i);
            if (obj != null && Long.valueOf(((MomentSendCommentModel) obj).getLocalId()).equals(Long.valueOf(momentSendCommentModel.getLocalId()))) {
                return i;
            }
        }
        return -1;
    }

    public final void OooO0O0() {
        if (this.f43646OooO00o == null) {
            this.f43646OooO00o = new HashMap();
        }
        if (this.f43647OooO0O0 == null) {
            this.f43647OooO0O0 = new ArrayList();
        }
    }

    public final String toString() {
        OooO0O0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n map.size:" + this.f43646OooO00o.size() + ",\n map:{");
        for (Map.Entry entry : this.f43646OooO00o.entrySet()) {
            stringBuffer.append("\n\t " + entry.getKey() + ":'" + entry.getValue() + "'");
        }
        stringBuffer.append("\n };");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("\n list.size:" + this.f43647OooO0O0.size() + ",\n list:{");
        for (int i = 0; i < this.f43647OooO0O0.size(); i++) {
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("\n\t item_", i, ":'");
            sbOooO0O0.append(this.f43647OooO0O0.get(i));
            sbOooO0O0.append("'");
            stringBuffer2.append(sbOooO0O0.toString());
        }
        stringBuffer2.append("\n };");
        return "" + ((Object) stringBuffer) + ((Object) stringBuffer2);
    }
}
