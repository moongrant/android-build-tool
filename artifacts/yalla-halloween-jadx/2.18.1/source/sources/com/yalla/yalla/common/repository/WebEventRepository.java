package com.yalla.yalla.common.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.common.model.Response;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class WebEventRepository extends o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final WebEventRepository f20839OooO00o = new WebEventRepository();

    @Nullable
    public final Object OooO0o(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, @NotNull String str, @NotNull EnterRoomParentPage enterRoomParentPage, @NotNull Continuation<? super Response<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1(this, null, arrayList, arrayList2, str, enterRoomParentPage), continuation);
    }

    @Nullable
    public final Object OooO0o0(@NotNull MomentLogSourcePage momentLogSourcePage, @NotNull MomentLogActionType momentLogActionType, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super Response<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$momentBehaviorLog$$inlined$call$1(this, null, momentLogSourcePage, momentLogActionType, str, str2), continuation);
    }
}
