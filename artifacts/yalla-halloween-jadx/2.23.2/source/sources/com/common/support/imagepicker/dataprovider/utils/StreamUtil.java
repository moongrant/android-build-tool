package com.common.support.imagepicker.dataprovider.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/utils/StreamUtil;", "", "()V", "copy", "", "input", "Ljava/io/InputStream;", "out", "Ljava/io/OutputStream;", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStreamUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamUtil.kt\ncom/common/support/imagepicker/dataprovider/utils/StreamUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class StreamUtil {

    @NotNull
    public static final StreamUtil INSTANCE = new StreamUtil();

    private StreamUtil() {
    }

    public final long copy(@NotNull InputStream input, @NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[65536];
        long j = 0;
        while (true) {
            int i = input.read(bArr);
            if (i == -1) {
                input.close();
                out.close();
                return j;
            }
            out.write(bArr, 0, i);
            j += (long) i;
        }
    }
}
