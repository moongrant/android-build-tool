package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/moment/PostSendGiftModelData;", "Ljava/io/Serializable;", "()V", "data", "Lcom/yalla/yalla/model/moment/PostSendGiftModel;", "getData", "()Lcom/yalla/yalla/model/moment/PostSendGiftModel;", "setData", "(Lcom/yalla/yalla/model/moment/PostSendGiftModel;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostSendGiftModelData implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private PostSendGiftModel data;

    @Nullable
    public final PostSendGiftModel getData() {
        return this.data;
    }

    public final void setData(@Nullable PostSendGiftModel postSendGiftModel) {
        this.data = postSendGiftModel;
    }
}
