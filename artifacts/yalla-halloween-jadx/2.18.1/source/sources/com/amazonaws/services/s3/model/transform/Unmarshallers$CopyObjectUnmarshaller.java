package com.amazonaws.services.s3.model.transform;

import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class Unmarshallers$CopyObjectUnmarshaller implements Unmarshaller<XmlResponsesSaxParser.CopyObjectResultHandler, InputStream> {
    @Override // com.amazonaws.transform.Unmarshaller
    public final XmlResponsesSaxParser.CopyObjectResultHandler OooO00o(InputStream inputStream) throws Exception {
        XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
        XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = new XmlResponsesSaxParser.CopyObjectResultHandler();
        xmlResponsesSaxParser.OooO0o0(copyObjectResultHandler, inputStream);
        return copyObjectResultHandler;
    }
}
