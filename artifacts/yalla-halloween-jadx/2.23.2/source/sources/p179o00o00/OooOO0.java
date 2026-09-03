package p179o00o00;

import android.content.Context;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.code.android.cloudfilemanager.uploader.UploadException;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import oo00oO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p182o00o000O.OooOO0O;
import p182o00o000O.Oooo000;
import p184o00o00O0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.uploader.AWSUploader$awsUpload$2", f = "AWSUploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f38368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO f38369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo000.OooO00o f38370OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f38371OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO00o oooO00o, Oooo000.OooO00o oooO00o2, OooO oooO, Ref.ObjectRef<String> objectRef, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f38368OooO0Oo = oooO00o;
        this.f38370OooO0o0 = oooO00o2;
        this.f38369OooO0o = oooO;
        this.f38371OooO0oO = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0(this.f38368OooO0Oo, this.f38370OooO0o0, this.f38369OooO0o, this.f38371OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00ce: MOVE (r11 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:207), block:B:37:0x00cd */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Exception e;
        InputStream inputStream;
        Ref.ObjectRef<String> objectRef = this.f38371OooO0oO;
        OooO00o oooO00o = this.f38368OooO0Oo;
        Oooo000.OooO00o oooO00o2 = this.f38370OooO0o0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InputStream inputStream2 = null;
        String string = null;
        try {
            try {
                File file = oooO00o.f60303OooO0O0;
                if (file == null) {
                    Intrinsics.checkNotNull(null);
                    Intrinsics.checkNotNullParameter(null, ShareConstants.MEDIA_URI);
                    Context context = OooOO0O.f38411OooO0o0;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context = null;
                    }
                    context.getContentResolver().getType(null);
                    throw null;
                }
                Intrinsics.checkNotNull(file);
                String strOooO0OO = OooO0o.OooO0OO(file);
                File file2 = oooO00o.f60303OooO0O0;
                Intrinsics.checkNotNull(file2);
                String strOooO0O0 = OooO0o.OooO0O0(file2);
                FileInputStream fileInputStream = new FileInputStream(oooO00o.f60303OooO0O0);
                try {
                    ObjectMetadata objectMetadata = new ObjectMetadata();
                    objectMetadata.f12504OooO0o0.put("Content-Type", strOooO0OO);
                    String str = oooO00o2.f38467OooO0OO;
                    String str2 = oooO00o2.f38468OooO0Oo;
                    ?? r1 = str + "/" + oooO00o.f60305OooO0Oo + "." + strOooO0O0;
                    PutObjectRequest putObjectRequest = new PutObjectRequest(str2, r1, fileInputStream, objectMetadata);
                    OooOO0O oooOO0OOooO00o = OooO.OooO00o(this.f38369OooO0o, oooO00o2);
                    oooOO0OOooO00o.OooO0O0(new InitiateMultipartUploadRequest(str2, r1));
                    oooOO0OOooO00o.OooO0o(putObjectRequest);
                    try {
                        string = oooOO0OOooO00o.OooOOoo(str2, r1).toString();
                    } catch (Exception unused) {
                    }
                    if (string == null || string.length() == 0) {
                        throw new UploadException("AWS Upload : bucket and key cannot be converted to a URL.");
                    }
                    objectRef.element = r1;
                    fileInputStream.close();
                    return objectRef.element;
                } catch (Exception e2) {
                    e = e2;
                    throw new UploadException("AWS Upload : " + e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }
}
