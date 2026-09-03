package p138o00OOoo;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136o00OOOo0.OooOo;
import p137o00OOOoO.OooO0OO;
import p139o00OOooO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.uploader.AWSUploader$awsUpload$2", f = "AWSUploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f37431OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO f37432OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOo.OooO00o f37433OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f37434OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO0OO oooO0OO, OooOo.OooO00o oooO00o, OooO oooO, Ref.ObjectRef<String> objectRef, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f37431OooO0Oo = oooO0OO;
        this.f37433OooO0o0 = oooO00o;
        this.f37432OooO0o = oooO;
        this.f37434OooO0oO = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0(this.f37431OooO0Oo, this.f37433OooO0o0, this.f37432OooO0o, this.f37434OooO0oO, continuation);
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
        Ref.ObjectRef<String> objectRef = this.f37434OooO0oO;
        OooO0OO oooO0OO = this.f37431OooO0Oo;
        OooOo.OooO00o oooO00o = this.f37433OooO0o0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InputStream inputStream2 = null;
        String string = null;
        try {
            try {
                File file = oooO0OO.f37426OooO0O0;
                if (file == null) {
                    Intrinsics.checkNotNull(null);
                    Intrinsics.checkNotNullParameter(null, ShareConstants.MEDIA_URI);
                    Context context = p136o00OOOo0.OooOO0.f37361OooO0o0;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("context");
                        context = null;
                    }
                    context.getContentResolver().getType(null);
                    throw null;
                }
                Intrinsics.checkNotNull(file);
                String strOooO0OO = OooO.OooO0OO(file);
                File file2 = oooO0OO.f37426OooO0O0;
                Intrinsics.checkNotNull(file2);
                String strOooO0O0 = OooO.OooO0O0(file2);
                FileInputStream fileInputStream = new FileInputStream(oooO0OO.f37426OooO0O0);
                try {
                    ObjectMetadata objectMetadata = new ObjectMetadata();
                    objectMetadata.f9414OooO0o0.put("Content-Type", strOooO0OO);
                    String str = oooO00o.f37398OooO0OO;
                    String str2 = oooO00o.f37399OooO0Oo;
                    ?? r1 = str + "/" + oooO0OO.f37428OooO0Oo + "." + strOooO0O0;
                    PutObjectRequest putObjectRequest = new PutObjectRequest(str2, r1, fileInputStream, objectMetadata);
                    OooOO0O oooOO0OOooO00o = OooO.OooO00o(this.f37432OooO0o, oooO00o);
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
