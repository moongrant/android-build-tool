package p442o0OoOo0O;

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
import p182o00o000O.OooO0o;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.mixedroom.room_bottom.RoomBottomPersenterUtil$uploadImg$1", f = "RoomBottomPersenterUtil.kt", i = {1}, l = {16, 20}, m = "invokeSuspend", n = {"uploadFile"}, s = {"L$0"})
public final class o0000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f47241OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Uri f47242OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f47243OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<Boolean, OooO0o, Unit> f47244OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O00(Uri uri, Function2<? super Boolean, ? super OooO0o, Unit> function2, Continuation<? super o0000O00> continuation) {
        super(2, continuation);
        this.f47242OooO0o = uri;
        this.f47244OooO0oO = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O00(this.f47242OooO0o, this.f47244OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OooO0o oooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47243OooO0o0;
        Function2<Boolean, OooO0o, Unit> function2 = this.f47244OooO0oO;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0o = this.f47241OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            function2.invoke(Boxing.boxBoolean(((ApiResult) obj).isSuccess()), oooO0o);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CloudFileRepo cloudFileRepo = new CloudFileRepo();
        CloudFileType cloudFileType = CloudFileType.ROOM_CHAT_IMG;
        Uri uri = this.f47242OooO0o;
        this.f47243OooO0o0 = 1;
        obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        OooO0o oooO0o2 = (OooO0o) obj;
        if (oooO0o2 == null || StringsKt.isBlank(oooO0o2.OooO00o())) {
            function2.invoke(Boxing.boxBoolean(false), oooO0o2);
        } else {
            CloudFileType cloudFileType2 = CloudFileType.ROOM_CHAT_IMG;
            int i2 = oooO0o2.f38405OooO0OO.f38464OooO00o;
            this.f47241OooO0Oo = oooO0o2;
            this.f47243OooO0o0 = 2;
            String strOooO0OO = oo000o.OooO0OO("WebserversME/PictureME/PicQiniu");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(cloudFileType2.getCode()), "type");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(0L), "id");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "imgUpType");
            o0oooooOooO00o.OooO0O0(oooO0o2.f38404OooO0O0, "imageurl");
            Object objOooO0Oo = OooOOO.OooO0Oo(new FileApiRepo$changeImageUrl$$inlined$call$1(o0oooooOooO00o, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0o = oooO0o2;
            obj = objOooO0Oo;
            function2.invoke(Boxing.boxBoolean(((ApiResult) obj).isSuccess()), oooO0o);
        }
        return Unit.INSTANCE;
    }
}
