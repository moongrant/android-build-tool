package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestXmlFactory {
    public static byte[] OooO00o(List<PartETag> list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0Oo("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator<PartETag>() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public final int compare(PartETag partETag, PartETag partETag2) {
                    int i = partETag.f10873OooO00o;
                    int i2 = partETag2.f10873OooO00o;
                    if (i < i2) {
                        return -1;
                    }
                    return i > i2 ? 1 : 0;
                }
            });
            for (PartETag partETag : list) {
                xmlWriter.OooO0Oo("Part");
                xmlWriter.OooO0Oo("PartNumber");
                xmlWriter.OooO00o(Integer.toString(partETag.f10873OooO00o), xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0Oo("ETag");
                xmlWriter.OooO00o(partETag.f10874OooO0O0, xmlWriter.f10683OooO0O0);
                xmlWriter.OooO0O0();
                xmlWriter.OooO0O0();
            }
        }
        xmlWriter.OooO0O0();
        return xmlWriter.OooO0OO();
    }
}
