package p397o0Oo0O0;

import androidx.appcompat.widget.o0000O0;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0000O00<MapKey, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public HashMap f44416OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList f44417OooO0O0 = null;

    public o0000O00() {
        OooO0O0();
    }

    public final int OooO00o(MomentSendCommentModel momentSendCommentModel) {
        OooO0O0();
        for (int i = 0; i < this.f44417OooO0O0.size(); i++) {
            Object obj = this.f44417OooO0O0.get(i);
            if (obj != null && Long.valueOf(((MomentSendCommentModel) obj).getLocalId()).equals(Long.valueOf(momentSendCommentModel.getLocalId()))) {
                return i;
            }
        }
        return -1;
    }

    public final void OooO0O0() {
        if (this.f44416OooO00o == null) {
            this.f44416OooO00o = new HashMap();
        }
        if (this.f44417OooO0O0 == null) {
            this.f44417OooO0O0 = new ArrayList();
        }
    }

    public final String toString() {
        OooO0O0();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n map.size:" + this.f44416OooO00o.size() + ",\n map:{");
        for (Map.Entry entry : this.f44416OooO00o.entrySet()) {
            stringBuffer.append("\n\t " + entry.getKey() + ":'" + entry.getValue() + "'");
        }
        stringBuffer.append("\n };");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("\n list.size:" + this.f44417OooO0O0.size() + ",\n list:{");
        for (int i = 0; i < this.f44417OooO0O0.size(); i++) {
            StringBuilder sbOooO00o = o0000O0.OooO00o("\n\t item_", i, ":'");
            sbOooO00o.append(this.f44417OooO0O0.get(i));
            sbOooO00o.append("'");
            stringBuffer2.append(sbOooO00o.toString());
        }
        stringBuffer2.append("\n };");
        return "" + ((Object) stringBuffer) + ((Object) stringBuffer2);
    }
}
