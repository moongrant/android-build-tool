package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/ImResult;", "", "body", "", "code", "", "([BI)V", "getBody", "()[B", "setBody", "([B)V", "getCode", "()I", "setCode", "(I)V", "isSuccess", "", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImResult {
    public static final int Add_Friend_Complete_Directly = 2;
    public static final int Add_Friend_Frequency_Limit = 6;
    public static final int Add_Friend_Repeat = 3;
    public static final int Add_Friend_Send_Success = 1;
    public static final int Send_Failed = -1;

    @Nullable
    private byte[] body;
    private int code;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public ImResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final byte[] getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean isSuccess() {
        return this.code == 200;
    }

    public final void setBody(@Nullable byte[] bArr) {
        this.body = bArr;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public ImResult(@Nullable byte[] bArr, int i) {
        this.body = bArr;
        this.code = i;
    }

    public /* synthetic */ ImResult(byte[] bArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bArr, (i2 & 2) != 0 ? 200 : i);
    }
}
