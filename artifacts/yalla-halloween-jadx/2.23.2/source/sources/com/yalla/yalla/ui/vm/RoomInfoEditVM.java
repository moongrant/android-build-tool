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
import p182o00o000O.OooO0o;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/vm/RoomInfoEditVM;", "Lo0Oo0/OooOO0;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/MutableLiveData;", "Lo00o000O/OooO0o;", "uploadRoomHeader", "", "userId", "", "cloudFileInfoList", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "changeImageUrl", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomInfoEditVM extends OooOO0 {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomInfoEditVM$changeImageUrl$1", f = "RoomInfoEditVM.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30919OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f30920OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30921OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ List<OooO0o> f30922OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, List<OooO0o> list, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30920OooO0o = str;
            this.f30922OooO0oO = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f30920OooO0o, this.f30922OooO0oO, continuation);
            oooO00o.f30921OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<Object>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30919OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f30921OooO0o0;
                CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
                this.f30921OooO0o0 = o00oo0o2;
                this.f30919OooO0Oo = 1;
                StringBuffer stringBuffer = new StringBuffer();
                List<OooO0o> list = this.f30922OooO0oO;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    OooO0o oooO0o = (OooO0o) it.next();
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append("|");
                    }
                    stringBuffer.append(oooO0o.f38404OooO0O0);
                }
                int i2 = list.get(0).f38405OooO0OO.f38464OooO00o;
                String strOooO0OO = oo000o.OooO0OO("/WebserversME/PictureME/PicQiniu");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                int code = cloudFileType.getCode();
                StringBuilder sb = new StringBuilder();
                sb.append(code);
                o0oooooOooO00o.OooO0O0(sb.toString(), "type");
                o0oooooOooO00o.OooO0O0(this.f30920OooO0o, "id");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "imgUpType");
                o0oooooOooO00o.OooO0O0(stringBuffer.toString(), "imageurl");
                Object objOooO0Oo = OooOOO.OooO0Oo(new PictureRepo$changeImageUrl$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f30921OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomInfoEditVM$uploadRoomHeader$1$1", f = "RoomInfoEditVM.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MutableLiveData f30923OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<OooO0o> f30924OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f30925OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomInfoEditVM f30926OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Uri f30927OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableLiveData<OooO0o> mutableLiveData, RoomInfoEditVM roomInfoEditVM, Uri uri, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30924OooO0o = mutableLiveData;
            this.f30926OooO0oO = roomInfoEditVM;
            this.f30927OooO0oo = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f30924OooO0o, this.f30926OooO0oO, this.f30927OooO0oo, continuation);
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
            int i = this.f30925OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CloudFileRepo cloudFileRepo = this.f30926OooO0oO.cloudFileRepo;
                CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
                Uri uri = this.f30927OooO0oo;
                MutableLiveData<OooO0o> mutableLiveData2 = this.f30924OooO0o;
                this.f30923OooO0Oo = mutableLiveData2;
                this.f30925OooO0o0 = 1;
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
                mutableLiveData = this.f30923OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o00OO0O0<ApiResult<Object>> changeImageUrl(@NotNull String userId, @NotNull List<OooO0o> cloudFileInfoList) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(cloudFileInfoList, "cloudFileInfoList");
        return o00O.OooO00o(this, new OooO00o(userId, cloudFileInfoList, null));
    }

    @NotNull
    public final MutableLiveData<OooO0o> uploadRoomHeader(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        MutableLiveData<OooO0o> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(mutableLiveData, this, uri, null), 3, null);
        return mutableLiveData;
    }
}
