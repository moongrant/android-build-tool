package p460o0Ooo0o;

import com.yalla.yalla.model.media.MediaVideoItemModel;
import java.util.ArrayList;
import java.util.Iterator;
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
@DebugMetadata(c = "com.yalla.yalla.module.media.utils.CameraFileUtils$clearCacheMediaFilesExcept$1", f = "CameraFileUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCameraFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraFileUtils.kt\ncom/yalla/yalla/module/media/utils/CameraFileUtils$clearCacheMediaFilesExcept$1\n+ 2 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n22#2:241\n1855#3,2:242\n*S KotlinDebug\n*F\n+ 1 CameraFileUtils.kt\ncom/yalla/yalla/module/media/utils/CameraFileUtils$clearCacheMediaFilesExcept$1\n*L\n60#1:241\n61#1:242,2\n*E\n"})
public final class o00O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<MediaVideoItemModel> f47778OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(ArrayList<MediaVideoItemModel> arrayList, Continuation<? super o00O0O0> continuation) {
        super(2, continuation);
        this.f47778OooO0Oo = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O0(this.f47778OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooO oooO = new OooO();
        ArrayList<MediaVideoItemModel> arrayList = this.f47778OooO0Oo;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                oooO.put(((MediaVideoItemModel) it.next()).getFilePath(), "");
            }
        }
        Lazy lazy = o00O0OO0.f47783OooO00o;
        o00O0OO0.OooO0O0(o00O0OO0.OooO0OO(), oooO);
        return Unit.INSTANCE;
    }
}
