package com.common.support.okhttpforsdk;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/common/support/okhttpforsdk/HttpLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$OooO00o;", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "log", ViewHierarchyConstants.TAG_KEY, "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HttpLogger implements HttpLoggingInterceptor.OooO00o {

    @NotNull
    private final String tag;

    public HttpLogger(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.OooO00o
    public void log(@NotNull final String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            HttpServiceKt.logD(this.tag, new Function0<String>() { // from class: com.common.support.okhttpforsdk.HttpLogger.log.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() throws UnsupportedEncodingException {
                    String strDecode = URLDecoder.decode(message, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(strDecode, "decode(message, \"UTF-8\")");
                    return strDecode;
                }
            });
        } catch (Throwable unused) {
        }
    }
}
