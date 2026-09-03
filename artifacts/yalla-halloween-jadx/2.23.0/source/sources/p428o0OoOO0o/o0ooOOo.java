package p428o0OoOO0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000000;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.common.support.crypto.RSAKt;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.UploadTokenModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.repository.CloudFileRepo$loadToken$$inlined$call$1;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p136o00OOOo0.OooOo;
import p136o00OOOo0.Oooo000;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo implements Oooo000<CloudFileType> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CloudFileRepo f45728OooO00o = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.manager.cloud_file.YLUploadInfoLoader", f = "YLUploadInfoLoader.kt", i = {}, l = {17}, m = "getUploadInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f45729OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f45730OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45729OooO0Oo = obj;
            this.f45730OooO0o |= Integer.MIN_VALUE;
            return o0ooOOo.this.OooO00o(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p136o00OOOo0.Oooo000
    @Nullable
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final Object OooO00o(@NotNull CloudFileType cloudFileType, @Nullable Long l, @Nullable Boolean bool, @NotNull Continuation<? super OooOo> continuation) throws Throwable {
        OooO00o oooO00o;
        UploadTokenModel uploadTokenModel;
        OooOo oooO00o2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f45730OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f45730OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objWithContext = oooO00o.f45729OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f45730OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            oooO00o.f45730OooO0o = 1;
            CloudFileRepo cloudFileRepo = this.f45728OooO00o;
            cloudFileRepo.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CloudFileRepo$loadToken$$inlined$call$1(cloudFileRepo, null, cloudFileType, l, bool), oooO00o);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Response response = (Response) objWithContext;
        if (!response.getIsSuccess() || (uploadTokenModel = (UploadTokenModel) response.getData()) == null) {
            return null;
        }
        String strRemoveSuffix = StringsKt.OooOO0O(uploadTokenModel.getFileName(), "/") ? StringsKt__StringsKt.removeSuffix(uploadTokenModel.getFileName(), (CharSequence) "/") : uploadTokenModel.getFileName();
        String str = new String(AESKt.aesDecrypt$default(Base64ExtensionsKt.base64Decode(uploadTokenModel.getUpToken()), RSAKt.rsaDecrypt(Base64ExtensionsKt.base64Decode(uploadTokenModel.getUpAK()), oO000Oo.OooO0O0("K2")), o0o0000.f56518OooO00o, (String) null, 4, (Object) null), Charsets.UTF_8);
        String upType = uploadTokenModel.getUpType();
        if (Intrinsics.areEqual(upType, "1")) {
            oooO00o2 = new OooOo.OooO0O0(strRemoveSuffix, str);
        } else {
            oooO00o2 = Intrinsics.areEqual(upType, FeedbackType.Suggestions) ? new OooOo.OooO00o(strRemoveSuffix, uploadTokenModel.getBucket(), uploadTokenModel.getProviderName(), uploadTokenModel.getIdentityId(), o0OoOo0.OooO00o(uploadTokenModel.getRegion(), CertificateUtil.DELIMITER, uploadTokenModel.getPoolId()), uploadTokenModel.getRegion(), str) : null;
        }
        if (oooO00o2 == null) {
            return null;
        }
        oooO00o2.f37395OooO00o = o000000.OooO0o0(uploadTokenModel.getUpToken());
        String domain = uploadTokenModel.getDomain();
        Intrinsics.checkNotNullParameter(domain, "<set-?>");
        oooO00o2.f37396OooO0O0 = domain;
        return oooO00o2;
    }
}
