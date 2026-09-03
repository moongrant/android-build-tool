package io.opentelemetry.proto.trace.v1.internal;

import com.facebook.share.internal.ShareConstants;
import io.opentelemetry.exporter.otlp.internal.ProtoFieldInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class Status {

    public final class DeprecatedStatusCode {
    }

    public final class StatusCode {
    }

    static {
        ProtoFieldInfo.OooO00o(1, 8, "deprecatedCode");
        ProtoFieldInfo.OooO00o(2, 18, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        ProtoFieldInfo.OooO00o(3, 24, "code");
    }
}
