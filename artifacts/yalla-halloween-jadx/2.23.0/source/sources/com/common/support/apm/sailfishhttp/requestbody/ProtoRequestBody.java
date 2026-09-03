package com.common.support.apm.sailfishhttp.requestbody;

import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/common/support/apm/sailfishhttp/requestbody/ProtoRequestBody;", "Lo0ooO0oO/oo00oO;", "", "contentLength", "Lo0ooO0oO/o00OOO0;", "contentType", "Lo0oooO00/o0000Ooo;", "sink", "", "writeTo", "", "protoByteArray", "[B", "", "I", "<init>", "([B)V", "Companion", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class ProtoRequestBody extends oo00oO {

    @NotNull
    private static final o00OOO0 protobufMediaType;
    private final int contentLength;

    @NotNull
    private final byte[] protoByteArray;

    static {
        Pattern pattern = o00OOO0.f57234OooO0o0;
        protobufMediaType = o00OOO0.OooO00o.OooO00o("application/x-protobuf");
    }

    public ProtoRequestBody(@NotNull byte[] protoByteArray) {
        Intrinsics.checkNotNullParameter(protoByteArray, "protoByteArray");
        this.protoByteArray = protoByteArray;
        this.contentLength = protoByteArray.length;
    }

    @Override // p634o0ooO0oO.oo00oO
    public long contentLength() {
        return this.contentLength;
    }

    @Override // p634o0ooO0oO.oo00oO
    @NotNull
    public o00OOO0 contentType() {
        return protobufMediaType;
    }

    @Override // p634o0ooO0oO.oo00oO
    public void writeTo(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.protoByteArray);
    }
}
