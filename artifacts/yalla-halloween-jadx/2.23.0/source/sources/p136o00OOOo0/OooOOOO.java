package p136o00OOOo0;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOooO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager$uploadFile$4", f = "CloudFileManager.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCloudFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager$uploadFile$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1855#2,2:192\n*S KotlinDebug\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager$uploadFile$4\n*L\n71#1:192,2\n*E\n"})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends OooO0OO>>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f37388OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0<Object> f37390OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f37391OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37392OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f37393OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Boolean f37394OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OooOO0 oooOO1, Boolean bool, Long l, Object obj, List list, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f37391OooO0o0 = list;
        this.f37390OooO0o = oooOO1;
        this.f37392OooO0oO = obj;
        this.f37393OooO0oo = l;
        this.f37388OooO = z;
        this.f37394OooOO0 = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        List<Uri> list = this.f37391OooO0o0;
        OooOO0<Object> oooOO1 = this.f37390OooO0o;
        Object obj2 = this.f37392OooO0oO;
        return new OooOOOO(oooOO1, this.f37394OooOO0, this.f37393OooO0oo, obj2, list, continuation, this.f37388OooO);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends OooO0OO>> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37389OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f37391OooO0o0.iterator();
            while (it.hasNext()) {
                File fileOooO00o = OooO.OooO00o((Uri) it.next());
                if (fileOooO00o == null) {
                    return null;
                }
                arrayList.add(fileOooO00o);
            }
            Object obj2 = this.f37392OooO0oO;
            Long l = this.f37393OooO0oo;
            boolean z = this.f37388OooO;
            Boolean bool = this.f37394OooOO0;
            this.f37389OooO0Oo = 1;
            OooOO0<Object> oooOO1 = this.f37390OooO0o;
            oooOO1.getClass();
            obj = BuildersKt.withContext(Dispatchers.getIO(), new OooOo00(oooOO1, bool, l, obj2, arrayList, null, z), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
