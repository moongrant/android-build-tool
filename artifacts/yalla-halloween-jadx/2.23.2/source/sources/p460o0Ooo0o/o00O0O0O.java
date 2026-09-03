package p460o0Ooo0o;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.utils.CameraFileUtils$clearMediaCompressFiles$1", f = "CameraFileUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCameraFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraFileUtils.kt\ncom/yalla/yalla/module/media/utils/CameraFileUtils$clearMediaCompressFiles$1\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n22#2:241\n1855#3,2:242\n*S KotlinDebug\n*F\n+ 1 CameraFileUtils.kt\ncom/yalla/yalla/module/media/utils/CameraFileUtils$clearMediaCompressFiles$1\n*L\n82#1:241\n83#1:242,2\n*E\n"})
public final class o00O0O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<String> f47781OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(List<String> list, Continuation<? super o00O0O0O> continuation) {
        super(2, continuation);
        this.f47781OooO0Oo = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O0O(this.f47781OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooO oooO = new OooO();
        List<String> list = this.f47781OooO0Oo;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                oooO.put((String) it.next(), "");
            }
        }
        Lazy lazy = o00O0OO0.f47783OooO00o;
        o00O0OO0.OooO0O0(o00O0OO0.OooO0Oo(), oooO);
        return Unit.INSTANCE;
    }
}
