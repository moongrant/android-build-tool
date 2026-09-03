package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/common/model/ImResult;", "", "body", "", "code", "", "([BI)V", "getBody", "()[B", "setBody", "([B)V", "getCode", "()I", "setCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ImResult {
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

    public ImResult(@Nullable byte[] bArr, int i) {
        this.body = bArr;
        this.code = i;
    }

    public static /* synthetic */ ImResult copy$default(ImResult imResult, byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr = imResult.body;
        }
        if ((i2 & 2) != 0) {
            i = imResult.code;
        }
        return imResult.copy(bArr, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final ImResult copy(@Nullable byte[] body, int code2) {
        return new ImResult(body, code2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImResult)) {
            return false;
        }
        ImResult imResult = (ImResult) other;
        return Intrinsics.areEqual(this.body, imResult.body) && this.code == imResult.code;
    }

    @Nullable
    public final byte[] getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        byte[] bArr = this.body;
        return ((bArr == null ? 0 : Arrays.hashCode(bArr)) * 31) + this.code;
    }

    public final void setBody(@Nullable byte[] bArr) {
        this.body = bArr;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ImResult(body=");
        sbOooO0o0.append(Arrays.toString(this.body));
        sbOooO0o0.append(", code=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.code, ')');
    }

    public /* synthetic */ ImResult(byte[] bArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : bArr, (i2 & 2) != 0 ? 200 : i);
    }
}
