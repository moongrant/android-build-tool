package com.yalla.yalla.ui.vm;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.repository.PictureRepo$changeImageUrl$$inlined$call$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136o00OOOo0.OooO0OO;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/vm/RoomInfoEditVM;", "Lo0Oo00oO/o0O0O00;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/MutableLiveData;", "Lo00OOOo0/OooO0OO;", "uploadRoomHeader", "", "userId", "", "cloudFileInfoList", "Lo0OoO0OO/o0OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "changeImageUrl", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomInfoEditVM extends o0O0O00 {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomInfoEditVM$changeImageUrl$1", f = "RoomInfoEditVM.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OO00O<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31461OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31462OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31463OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ List<OooO0OO> f31464OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, List<OooO0OO> list, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31462OooO0o = str;
            this.f31464OooO0oO = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31462OooO0o, this.f31464OooO0oO, continuation);
            oooO00o.f31463OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<Object>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31461OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31463OooO0o0;
                CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
                this.f31463OooO0o0 = o0oo00o3;
                this.f31461OooO0Oo = 1;
                StringBuffer stringBuffer = new StringBuffer();
                List<OooO0OO> list = this.f31464OooO0oO;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    OooO0OO oooO0OO = (OooO0OO) it.next();
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append("|");
                    }
                    stringBuffer.append(oooO0OO.f37354OooO0O0);
                }
                int i2 = list.get(0).f37355OooO0OO.f37395OooO00o;
                String strOooO0OO = o000OOo0.OooO0OO("/WebserversME/PictureME/PicQiniu");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                int code = cloudFileType.getCode();
                StringBuilder sb = new StringBuilder();
                sb.append(code);
                o0o0oooOooO00o.OooO0O0(sb.toString(), "type");
                o0o0oooOooO00o.OooO0O0(this.f31462OooO0o, "id");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "imgUpType");
                o0o0oooOooO00o.OooO0O0(stringBuffer.toString(), "imageurl");
                Object objOooO0Oo = OooOOO.OooO0Oo(new PictureRepo$changeImageUrl$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31463OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o0oo00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomInfoEditVM$uploadRoomHeader$1$1", f = "RoomInfoEditVM.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MutableLiveData f31465OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<OooO0OO> f31466OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31467OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomInfoEditVM f31468OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Uri f31469OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableLiveData<OooO0OO> mutableLiveData, RoomInfoEditVM roomInfoEditVM, Uri uri, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31466OooO0o = mutableLiveData;
            this.f31468OooO0oO = roomInfoEditVM;
            this.f31469OooO0oo = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31466OooO0o, this.f31468OooO0oO, this.f31469OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31467OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CloudFileRepo cloudFileRepo = this.f31468OooO0oO.cloudFileRepo;
                CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
                Uri uri = this.f31469OooO0oo;
                MutableLiveData<OooO0OO> mutableLiveData2 = this.f31466OooO0o;
                this.f31465OooO0Oo = mutableLiveData2;
                this.f31467OooO0o0 = 1;
                Object objOooO0Oo = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = this.f31465OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o0OO00O<ApiResult<Object>> changeImageUrl(@NotNull String userId, @NotNull List<OooO0OO> cloudFileInfoList) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(cloudFileInfoList, "cloudFileInfoList");
        return o0ooOOo.OooO00o(this, new OooO00o(userId, cloudFileInfoList, null));
    }

    @NotNull
    public final MutableLiveData<OooO0OO> uploadRoomHeader(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        MutableLiveData<OooO0OO> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(mutableLiveData, this, uri, null), 3, null);
        return mutableLiveData;
    }
}
