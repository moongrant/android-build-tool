package p433o0OoOOo;

import android.net.Uri;
import com.code.android.util.OooOOO;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.repository.FileApiRepo$changeImageUrl$$inlined$call$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136o00OOOo0.OooO0OO;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.mixedroom.room_bottom.RoomBottomPersenterUtil$uploadImg$1", f = "RoomBottomPersenterUtil.kt", i = {1}, l = {16, 20}, m = "invokeSuspend", n = {"uploadFile"}, s = {"L$0"})
public final class o00OO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f45997OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Uri f45998OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f45999OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<Boolean, OooO0OO, Unit> f46000OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OO0O0(Uri uri, Function2<? super Boolean, ? super OooO0OO, Unit> function2, Continuation<? super o00OO0O0> continuation) {
        super(2, continuation);
        this.f45998OooO0o = uri;
        this.f46000OooO0oO = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OO0O0(this.f45998OooO0o, this.f46000OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OooO0OO oooO0OO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45999OooO0o0;
        Function2<Boolean, OooO0OO, Unit> function2 = this.f46000OooO0oO;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0OO = this.f45997OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            function2.invoke(Boxing.boxBoolean(((ApiResult) obj).isSuccess()), oooO0OO);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CloudFileRepo cloudFileRepo = new CloudFileRepo();
        CloudFileType cloudFileType = CloudFileType.ROOM_CHAT_IMG;
        Uri uri = this.f45998OooO0o;
        this.f45999OooO0o0 = 1;
        obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        OooO0OO oooO0OO2 = (OooO0OO) obj;
        if (oooO0OO2 == null || StringsKt.isBlank(oooO0OO2.OooO00o())) {
            function2.invoke(Boxing.boxBoolean(false), oooO0OO2);
        } else {
            CloudFileType cloudFileType2 = CloudFileType.ROOM_CHAT_IMG;
            int i2 = oooO0OO2.f37355OooO0OO.f37395OooO00o;
            this.f45997OooO0Oo = oooO0OO2;
            this.f45999OooO0o0 = 2;
            String strOooO0OO = o000OOo0.OooO0OO("WebserversME/PictureME/PicQiniu");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(cloudFileType2.getCode()), "type");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(0L), "id");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "imgUpType");
            o0o0oooOooO00o.OooO0O0(oooO0OO2.f37354OooO0O0, "imageurl");
            Object objOooO0Oo = OooOOO.OooO0Oo(new FileApiRepo$changeImageUrl$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0OO = oooO0OO2;
            obj = objOooO0Oo;
            function2.invoke(Boxing.boxBoolean(((ApiResult) obj).isSuccess()), oooO0OO);
        }
        return Unit.INSTANCE;
    }
}
