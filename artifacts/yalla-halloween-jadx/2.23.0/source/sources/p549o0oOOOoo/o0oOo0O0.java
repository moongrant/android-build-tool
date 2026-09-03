package p549o0oOOOoo;

import androidx.compose.runtime.MutableState;
import com.facebook.internal.security.CertificateUtil;
import java.io.File;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p181o00o000o.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.test.ShowVideoInfoDialogKt$ShowVideoInfoDialog$1$1$1", f = "ShowVideoInfoDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nShowVideoInfoDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowVideoInfoDialog.kt\ncom/yalla/yalla/module/media/test/ShowVideoInfoDialogKt$ShowVideoInfoDialog$1$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,54:1\n215#2,2:55\n*S KotlinDebug\n*F\n+ 1 ShowVideoInfoDialog.kt\ncom/yalla/yalla/module/media/test/ShowVideoInfoDialogKt$ShowVideoInfoDialog$1$1$1\n*L\n35#1:55,2\n*E\n"})
public final class o0oOo0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f55899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f55900OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(String str, MutableState<String> mutableState, Continuation<? super o0oOo0O0> continuation) {
        super(2, continuation);
        this.f55899OooO0Oo = str;
        this.f55900OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0oOo0O0(this.f55899OooO0Oo, this.f55900OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0oOo0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = this.f55899OooO0Oo;
        if (new File(str).exists()) {
            String str2 = "";
            for (Map.Entry<String, Object> entry : oo000o.OooO0Oo(str).entrySet()) {
                String key = entry.getKey();
                str2 = ((Object) str2) + ((Object) key) + CertificateUtil.DELIMITER + entry.getValue() + "\n";
            }
            this.f55900OooO0o0.setValue(str2);
        }
        return Unit.INSTANCE;
    }
}
