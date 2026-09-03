package p162o00OoOOo;

import android.net.Uri;
import com.app.base.app.appConfig.apiDataModela.OooO00o;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.manager.cloud_file.CloudFile;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UploadImageUrlModel;
import com.yalla.yalla.common.repository.FileApiRepo$changeImageUrl$$inlined$call$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p486o0o000o0.o0O0O00;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.mixedroom.room_bottom.RoomBottomPersenterUtil$uploadImg$1", f = "RoomBottomPersenterUtil.kt", i = {1}, l = {17, 21}, m = "invokeSuspend", n = {"uploadFile"}, s = {"L$0"})
public final class o0O000Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<CloudFileInfo, Unit> f32500Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public CloudFileInfo f32501Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f32502Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Uri f32503Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O000Oo(Uri uri, Function1<? super CloudFileInfo, Unit> function1, Continuation<? super o0O000Oo> continuation) {
        super(2, continuation);
        this.f32503Oooo0oo = uri;
        this.f32500Oooo = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O000Oo(this.f32503Oooo0oo, this.f32500Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O000Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CloudFileInfo cloudFileInfo;
        ApiResult apiResult;
        String picurl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f32502Oooo0oO;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cloudFileInfo = this.f32501Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                UploadImageUrlModel uploadImageUrlModel = (UploadImageUrlModel) apiResult.getData();
                picurl = uploadImageUrlModel != null ? uploadImageUrlModel.getPicurl() : null;
                if (picurl != null || StringsKt.isBlank(picurl)) {
                    this.f32500Oooo.invoke(cloudFileInfo);
                } else {
                    Object data = apiResult.getData();
                    Intrinsics.checkNotNull(data);
                    cloudFileInfo.setUrl(((UploadImageUrlModel) data).getPicurl());
                    this.f32500Oooo.invoke(cloudFileInfo);
                }
            } else {
                this.f32500Oooo.invoke(cloudFileInfo);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        CloudFileType cloudFileType = CloudFileType.ROOM_CHAT_IMG;
        Uri uri = this.f32503Oooo0oo;
        this.f32502Oooo0oO = 1;
        obj = CloudFile.INSTANCE.getManager().uploadFile(cloudFileType, uri, (Long) null, false, (Continuation<? super CloudFileInfo>) this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        CloudFileInfo cloudFileInfo2 = (CloudFileInfo) obj;
        if (cloudFileInfo2 == null || StringsKt.isBlank(cloudFileInfo2.getUrl())) {
            this.f32500Oooo.invoke(cloudFileInfo2);
        } else {
            CloudFileType cloudFileType2 = CloudFileType.ROOM_CHAT_IMG;
            int uploadType = cloudFileInfo2.getUploadInfo().getUploadType();
            String strImgRemoveHost = CloudImageUtilKt.imgRemoveHost(cloudFileInfo2.getUrl());
            this.f32501Oooo0o = cloudFileInfo2;
            this.f32502Oooo0oO = 2;
            o0O0O00 o0o0o00 = o0O0O00.f40925OooO00o;
            String str = o0O0O00.f40926OooO0O0;
            o00O000o o00o000oOooO0O0 = OooO00o.OooO0O0(str, "url", str, 0);
            o00o000oOooO0O0.OooO0O0("type", Boxing.boxInt(cloudFileType2.getCode()));
            o00o000oOooO0O0.OooO0O0("id", Boxing.boxLong(0L));
            o00o000oOooO0O0.OooO0O0("imgUpType", Boxing.boxInt(uploadType));
            o00o000oOooO0O0.OooO0O0("imageurl", strImgRemoveHost);
            Object objOooO0OO = o0000O0.OooO0OO(new FileApiRepo$changeImageUrl$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            cloudFileInfo = cloudFileInfo2;
            obj = objOooO0OO;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f32500Oooo.invoke(cloudFileInfo);
            } else {
                UploadImageUrlModel uploadImageUrlModel2 = (UploadImageUrlModel) apiResult.getData();
                if (uploadImageUrlModel2 != null) {
                }
                if (picurl != null || StringsKt.isBlank(picurl)) {
                    Object data2 = apiResult.getData();
                    Intrinsics.checkNotNull(data2);
                    cloudFileInfo.setUrl(((UploadImageUrlModel) data2).getPicurl());
                    this.f32500Oooo.invoke(cloudFileInfo);
                } else {
                    this.f32500Oooo.invoke(cloudFileInfo);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
