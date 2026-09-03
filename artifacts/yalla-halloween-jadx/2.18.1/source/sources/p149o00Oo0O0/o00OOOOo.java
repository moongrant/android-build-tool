package p149o00Oo0O0;

import OooO00o.OooO00o;
import androidx.appcompat.widget.o00000O0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00OOOOo<MapKey, Model> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Map<MapKey, Model> f32165OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<Model> f32166OooO0O0 = null;

    public o00OOOOo() {
        OooO0Oo();
    }

    public final void OooO00o(Model model) {
        OooO0Oo();
        int iOooO0OO = OooO0OO(model);
        if (iOooO0OO != -1) {
            this.f32166OooO0O0.remove(iOooO0OO);
        }
        this.f32165OooO00o.put(OooO0O0(model), model);
        this.f32166OooO0O0.add(model);
    }

    public abstract MapKey OooO0O0(Model model);

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0OO(Model model) {
        OooO0Oo();
        for (int i = 0; i < this.f32166OooO0O0.size(); i++) {
            Object obj = this.f32166OooO0O0.get(i);
            if (obj != null && OooO0O0(obj).equals(OooO0O0(model))) {
                return i;
            }
        }
        return -1;
    }

    public final void OooO0Oo() {
        if (this.f32165OooO00o == null) {
            this.f32165OooO00o = new HashMap();
        }
        if (this.f32166OooO0O0 == null) {
            this.f32166OooO0O0 = new ArrayList();
        }
    }

    public final void OooO0o0(Model model) {
        OooO0Oo();
        int iOooO0OO = OooO0OO(model);
        if (iOooO0OO != -1) {
            this.f32166OooO0O0.remove(iOooO0OO);
            this.f32165OooO00o.remove(OooO0O0(model));
        }
    }

    public final String toString() {
        OooO0Oo();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("\n map.size:");
        sbOooO0o0.append(this.f32165OooO00o.size());
        sbOooO0o0.append(",\n map:{");
        stringBuffer.append(sbOooO0o0.toString());
        for (Map.Entry entry : this.f32165OooO00o.entrySet()) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("\n\t ");
            sbOooO0o1.append(entry.getKey());
            sbOooO0o1.append(":'");
            sbOooO0o1.append(entry.getValue());
            sbOooO0o1.append("'");
            stringBuffer.append(sbOooO0o1.toString());
        }
        stringBuffer.append("\n };");
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sbOooO0o2 = OooO00o.OooO0o0("\n list.size:");
        sbOooO0o2.append(this.f32166OooO0O0.size());
        sbOooO0o2.append(",\n list:{");
        stringBuffer2.append(sbOooO0o2.toString());
        for (int i = 0; i < this.f32166OooO0O0.size(); i++) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("\n\t item_", i, ":'");
            sbOooO00o.append(this.f32166OooO0O0.get(i));
            sbOooO00o.append("'");
            stringBuffer2.append(sbOooO00o.toString());
        }
        stringBuffer2.append("\n };");
        return "" + ((Object) stringBuffer) + ((Object) stringBuffer2);
    }
}
