package com.yalla.yalla.module.media.preview;

import android.app.Activity;
import android.net.Uri;
import com.code.android.util.OooOOO;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.module.media.camera.CameraActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo0o.o00Ooo;
import p468o0OoooO0.o0OO0;
import p468o0OoooO0.oo0ooO;
import p526o0o0OOO0.oo0oOO0;
import p549o0oOOOoo.o0O0o000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.YLMediaPreViewScreen$Content$6$1", f = "YLMediaPreViewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Uri f24606OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(Uri uri, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f24606OooO0Oo = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO(this.f24606OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (o00Ooo.OooO0o0() || ((Boolean) o0O0o000.f55890OooO0O0.getValue()).booleanValue()) {
            Lazy lazy = o0OO0.f46906OooO00o;
            OooOOO.OooO0O0(GlobalScope.INSTANCE, new oo0ooO(2000L, null));
        }
        Intrinsics.checkNotNullParameter("视频压缩成功", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        LiveEventBus.get("MOMENT_SEND_EDIT_VIDEO_URI").post(this.f24606OooO0Oo);
        if (com.code.android.util.OooO0O0.OooO00o(MomentSendActivity.class) != null) {
            oo0oOO0.OooO0o(null);
            Activity activityOooO00o = com.code.android.util.OooO0O0.OooO00o(CameraActivity.class);
            if (activityOooO00o != null) {
                activityOooO00o.finish();
            }
        }
        return Unit.INSTANCE;
    }
}
