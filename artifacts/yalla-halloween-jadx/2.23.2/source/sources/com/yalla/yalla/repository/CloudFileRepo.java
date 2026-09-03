package com.yalla.yalla.repository;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.ChangeUrlModel;
import com.yalla.yalla.model.UploadFileResult;
import com.yalla.yalla.model.http.Response;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p182o00o000O.OooO0o;
import p182o00o000O.OooOO0O;
import p182o00o000O.OooOOOO;
import p182o00o000O.OooOo00;
import p438o0OoOOoO.o0O00O0o;
import p475o0Ooooo0.oO0O000o;
import p475o0Ooooo0.oO0O00oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCloudFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudFileRepo.kt\ncom/yalla/yalla/repository/CloudFileRepo\n+ 2 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n26#2:58\n47#2:59\n26#2:63\n47#2:64\n1864#3,3:60\n*S KotlinDebug\n*F\n+ 1 CloudFileRepo.kt\ncom/yalla/yalla/repository/CloudFileRepo\n*L\n17#1:58\n17#1:59\n52#1:63\n52#1:64\n38#1:60,3\n*E\n"})
public final class CloudFileRepo extends oO0O000o {

    @DebugMetadata(c = "com.yalla.yalla.repository.CloudFileRepo", f = "CloudFileRepo.kt", i = {}, l = {58}, m = "loadVoiceUrl", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24309OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24310OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24309OooO0Oo = obj;
            this.f24310OooO0o |= Integer.MIN_VALUE;
            return CloudFileRepo.this.OooO0OO(null, this);
        }
    }

    public static Object OooO0Oo(CloudFileRepo cloudFileRepo, CloudFileType cloudFileType, Uri uri, Long l, boolean z, Continuation continuation, int i) {
        Long l2 = (i & 4) != 0 ? null : l;
        boolean z2 = (i & 8) != 0 ? false : z;
        Boolean bool = (i & 16) != 0 ? Boolean.FALSE : null;
        cloudFileRepo.getClass();
        OooOO0O oooOO0O = (OooOO0O) o0O00O0o.f47174OooO00o.getValue();
        oooOO0O.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new OooOOOO(uri, oooOO0O, cloudFileType, l2, z2, bool, null), continuation);
    }

    public static Object OooO0o0(CloudFileRepo cloudFileRepo, CloudFileType cloudFileType, File file, Continuation continuation) {
        Boolean bool = Boolean.FALSE;
        cloudFileRepo.getClass();
        return ((OooOO0O) o0O00O0o.f47174OooO00o.getValue()).OooO0OO(cloudFileType, file, null, false, bool, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f24310OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f24310OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objWithContext = oooO00o.f24309OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f24310OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CloudFileRepo$loadVoiceUrl$$inlined$call$1 cloudFileRepo$loadVoiceUrl$$inlined$call$1 = new CloudFileRepo$loadVoiceUrl$$inlined$call$1(this, null, str);
            oooO00o.f24310OooO0o = 1;
            objWithContext = BuildersKt.withContext(io2, cloudFileRepo$loadVoiceUrl$$inlined$call$1, oooO00o);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        ChangeUrlModel changeUrlModel = (ChangeUrlModel) ((Response) objWithContext).getData();
        if (changeUrlModel != null) {
            return changeUrlModel.getVoiceurl();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object OooO0o(@NotNull CloudFileType cloudFileType, @NotNull ArrayList arrayList, @Nullable Long l, boolean z, @Nullable Boolean bool, @NotNull Continuation continuation) throws Throwable {
        oO0O00oO oo0o00oo;
        List list;
        Object objWithContext;
        if (continuation instanceof oO0O00oO) {
            oo0o00oo = (oO0O00oO) continuation;
            int i = oo0o00oo.f48104OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o00oo.f48104OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oo0o00oo = new oO0O00oO(this, continuation);
            }
        } else {
            oo0o00oo = new oO0O00oO(this, continuation);
        }
        Object obj = oo0o00oo.f48103OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oo0o00oo.f48104OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            OooOO0O oooOO0O = (OooOO0O) o0O00O0o.f47174OooO00o.getValue();
            list = arrayList;
            oo0o00oo.f48101OooO0Oo = list;
            oo0o00oo.f48104OooO0oO = 1;
            oooOO0O.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOo00(oooOO0O, bool, l, cloudFileType, arrayList, null, z), oo0o00oo);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = oo0o00oo.f48101OooO0Oo;
            ResultKt.throwOnFailure(obj);
            objWithContext = obj;
            list = list2;
        }
        List list3 = (List) objWithContext;
        if (list3 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj2 : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OooO0o oooO0o = (OooO0o) obj2;
            if (list.size() > i3) {
                arrayList2.add(new UploadFileResult((Uri) list.get(i3), oooO0o));
            }
            i3 = i4;
        }
        return arrayList2;
    }
}
