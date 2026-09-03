package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o000OO;
import p412o0Oo0o0O.o00O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/vm/UserGiftVM;", "Lo0Oo0/OooOO0;", "", "safeToLong", "", "giftId", "i", "", "imageUrl", "Landroidx/lifecycle/MutableLiveData;", "", "sendGift", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class UserGiftVM extends OooOO0 {
    public static final int $stable = 0;

    @NotNull
    public final MutableLiveData<Boolean> sendGift(long safeToLong, int giftId, int i, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "giftUrl");
        ChatMessage msg = o000OO.OooOO0O(safeToLong, giftId, i, imageUrl, null, 0L, false, false, false, false, false, 2032);
        o000OO.OooO0oO(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O00O(msg, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }
}
