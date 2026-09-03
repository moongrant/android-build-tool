package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface oo000o extends o00oO0o {

    public interface OooO00o extends o00oO0o, Cloneable {
        oo000o build();

        oo000o buildPartial();

        OooO00o mergeFrom(oo000o oo000oVar);

        OooO00o mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;
    }

    o0OOO0o<? extends oo000o> getParserForType();

    int getSerializedSize();

    OooO00o newBuilderForType();

    OooO00o toBuilder();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
