package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p023Oooo00O.o00O0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbsRecordLog {
    private String a;
    private String b;
    private String c;
    private String d;

    public b(String str, String str2, String str3) {
        super("wa");
        this.a = str;
        this.b = str2;
        this.d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        com.efs.sdk.base.core.a.a.a();
        this.c = simpleDateFormat.format(new Date(com.efs.sdk.base.core.a.a.b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String strGenerateString = generateString();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            com.efs.sdk.base.core.util.d.a("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sbOooO00o = Oooo0.OooO00o("lt=event`", "ev_ct=");
        o00O0.OooO0OO(sbOooO00o, this.a, "`", "ev_ac=");
        o00O0.OooO0OO(sbOooO00o, this.b, "`", "tm=");
        o00O0.OooO0OO(sbOooO00o, this.c, "`", "dn=");
        sbOooO00o.append(this.d);
        sbOooO00o.append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sbOooO00o.append(entry.getKey());
            sbOooO00o.append("=");
            sbOooO00o.append(entry.getValue());
            sbOooO00o.append("`");
        }
        return sbOooO00o.subSequence(0, sbOooO00o.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(com.efs.sdk.base.core.config.a aVar) {
        this.dataMap.putAll(aVar.a());
        this.dataMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
    }
}
