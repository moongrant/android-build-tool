package p585o0oOoo00;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.UrlConfigModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.repository.AppConfigRepo$loadUrlConfigList$$inlined$call$1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.cache.SharedUrlManager$loadUrlConfig$1", f = "SharedUrlManager.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSharedUrlManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedUrlManager.kt\ncom/yalla/yalla/data/cache/SharedUrlManager$loadUrlConfig$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,320:1\n1855#2,2:321\n*S KotlinDebug\n*F\n+ 1 SharedUrlManager.kt\ncom/yalla/yalla/data/cache/SharedUrlManager$loadUrlConfig$1\n*L\n267#1:321,2\n*E\n"})
public final class o0000Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56642OooO0Oo;

    public o0000Ooo(Continuation<? super o0000Ooo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000Ooo(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0000Ooo(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56642OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AppConfigRepo appConfigRepo = AppConfigRepo.f24302OooO00o;
            this.f56642OooO0Oo = 1;
            appConfigRepo.getClass();
            String url = oo000o.OooO0OO("/Webservers/User/UrlConfigList");
            Intrinsics.checkNotNullParameter(url, "url");
            obj = OooOOO.OooO0Oo(new AppConfigRepo$loadUrlConfigList$$inlined$call$1(new o0ooOOo(url, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (!apiResult.isSuccess()) {
            return Unit.INSTANCE;
        }
        List<UrlConfigModel> list = (List) apiResult.getData();
        if (list != null) {
            for (UrlConfigModel urlConfigModel : list) {
                switch (urlConfigModel.getType()) {
                    case 2:
                        o00000OO.f56619OooO0Oo.postValue(urlConfigModel.getValue());
                        break;
                    case 4:
                        o00000OO.f56622OooO0oO.postValue(urlConfigModel.getValue());
                        break;
                    case 6:
                        o00000OO.f56615OooO.postValue(urlConfigModel.getValue());
                        break;
                    case 7:
                        o00000OO.f56624OooOO0.postValue(urlConfigModel.getValue());
                        break;
                    case 8:
                        o00000OO.f56625OooOO0O.postValue(urlConfigModel.getValue());
                        break;
                    case 9:
                        o00000OO.f56626OooOO0o.postValue(urlConfigModel.getValue());
                        break;
                    case 10:
                        o00000OO.f56628OooOOO0.postValue(urlConfigModel.getValue());
                        break;
                    case 11:
                        o00000OO.f56618OooO0OO.postValue(urlConfigModel.getValue());
                        break;
                    case 12:
                        o00000OO.f56627OooOOO.postValue(urlConfigModel.getValue());
                        break;
                    case 13:
                        o00000OO.f56623OooO0oo.postValue(urlConfigModel.getValue());
                        break;
                    case 15:
                        o00000OO.f56621OooO0o0.postValue(urlConfigModel.getValue());
                        break;
                    case 16:
                        o00000OO.f56620OooO0o.postValue(urlConfigModel.getValue());
                        break;
                    case 17:
                        o00000OO.f56629OooOOOO.postValue(urlConfigModel.getValue());
                        break;
                    case 18:
                        o00000OO.f56630OooOOOo.postValue(urlConfigModel.getValue());
                        break;
                    case 19:
                        o00000OO.f56632OooOOo0.postValue(urlConfigModel.getValue());
                        break;
                    case 20:
                        o00000OO.f56631OooOOo.postValue(urlConfigModel.getValue());
                        break;
                    case 21:
                        o00000OO.f56633OooOOoo.postValue(urlConfigModel.getValue());
                        break;
                    case 22:
                        o00000OO.f56636OooOo00.postValue(urlConfigModel.getValue());
                        break;
                    case 23:
                        o00000OO.f56635OooOo0.postValue(urlConfigModel.getValue());
                        break;
                    case 27:
                        o00000OO.f56637OooOo0O.postValue(urlConfigModel.getValue());
                        break;
                    case 28:
                        o00000OO.f56638OooOo0o.postValue(urlConfigModel.getValue());
                        break;
                    case 29:
                        o00000OO.f56634OooOo.postValue(urlConfigModel.getValue());
                        break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
