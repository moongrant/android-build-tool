package p527o0o0OOOO;

import android.app.NotificationManager;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.message.FriendRequestMessageScreenKt$FriendRequestMessageScreenContent$1$4", f = "FriendRequestMessageScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53626OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(FriendRequestMessageVM friendRequestMessageVM, Continuation<? super o0O000> continuation) {
        super(2, continuation);
        this.f53626OooO0Oo = friendRequestMessageVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O000(this.f53626OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f53626OooO0Oo.updateAllMessageStateRead();
        Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
        Object systemService = o000O0.OooO00o().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
        return Unit.INSTANCE;
    }
}
