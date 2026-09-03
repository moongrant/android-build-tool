package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.util.StringUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RequestXmlFactory {
    public static byte[] OooO00o(List<PartETag> list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.OooO0O0("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator<PartETag>() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public final int compare(PartETag partETag, PartETag partETag2) {
                    int i = partETag.f9420OooO00o;
                    int i2 = partETag2.f9420OooO00o;
                    if (i < i2) {
                        return -1;
                    }
                    return i > i2 ? 1 : 0;
                }
            });
            for (PartETag partETag : list) {
                xmlWriter.OooO0O0("Part");
                xmlWriter.OooO0O0("PartNumber");
                xmlWriter.OooO0OO(Integer.toString(partETag.f9420OooO00o));
                xmlWriter.OooO00o();
                xmlWriter.OooO0O0("ETag");
                xmlWriter.OooO0OO(partETag.f9421OooO0O0);
                xmlWriter.OooO00o();
                xmlWriter.OooO00o();
            }
        }
        xmlWriter.OooO00o();
        return xmlWriter.toString().getBytes(StringUtils.f9590OooO00o);
    }
}
