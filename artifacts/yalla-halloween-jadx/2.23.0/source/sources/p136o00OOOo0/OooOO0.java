package p136o00OOOo0;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p135o00OOOo.OooO0o;
import p137o00OOOoO.OooO0OO;
import p138o00OOoo.OooO;
import p138o00OOoo.OooOOO;
import p138o00OOoo.OooOOOO;
import p428o0OoOO0o.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCloudFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1855#2,2:192\n*S KotlinDebug\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager\n*L\n187#1:192,2\n*E\n"})
public final class OooOO0<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static String f37360OooO0o = "";

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static Context f37361OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Oooo000<T> f37362OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f37363OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f37364OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f37365OooO0Oo;

    @DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {0, 0}, l = {188}, m = "invokeInterceptor", n = {"uploadRequest", "fileType"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f37366OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0OO f37367OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Iterator f37368OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f37369OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f37370OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0<T> f37371OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0<T> oooOO1, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f37371OooO0oo = oooOO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37370OooO0oO = obj;
            this.f37366OooO |= Integer.MIN_VALUE;
            return this.f37371OooO0oo.OooO0O0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {}, l = {86}, m = "uploadFile", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f37372OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f37373OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooOO0<T> f37374OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0<T> oooOO1, Continuation<? super OooO0O0> continuation) {
            super(continuation);
            this.f37374OooO0o0 = oooOO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37372OooO0Oo = obj;
            this.f37373OooO0o |= Integer.MIN_VALUE;
            return this.f37374OooO0o0.OooO0OO(null, null, null, false, null, this);
        }
    }

    public OooOO0(@NotNull o0ooOOo uploadInfoLoader) {
        Intrinsics.checkNotNullParameter(uploadInfoLoader, "uploadInfoLoader");
        this.f37362OooO00o = uploadInfoLoader;
        this.f37363OooO0O0 = new ArrayList();
        this.f37364OooO0OO = LazyKt.lazy(OooOO0O.f37375OooO0Oo);
        this.f37365OooO0Oo = LazyKt.lazy(OooO0o.f37359OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(OooOO0 oooOO1, OooO0OO oooO0OO, Object obj, Continuation continuation) throws Throwable {
        OooOOO0 oooOOO0;
        oooOO1.getClass();
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f37387OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f37387OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(oooOO1, continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(oooOO1, continuation);
        }
        Object objWithContext = oooOOO0.f37384OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f37387OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                oooO0OO = oooOOO0.f37385OooO0o0;
                oooOO1 = oooOOO0.f37383OooO0Oo;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return objWithContext;
        }
        ResultKt.throwOnFailure(objWithContext);
        oooOOO0.f37383OooO0Oo = oooOO1;
        oooOOO0.f37385OooO0o0 = oooO0OO;
        oooOOO0.f37387OooO0oo = 1;
        if (oooOO1.OooO0O0(oooO0OO, obj, oooOOO0) == coroutine_suspended) {
            return coroutine_suspended;
        }
        OooO0OO oooO0OO2 = oooO0OO;
        OooOo oooOo = oooO0OO2.f37425OooO00o;
        if (oooOo instanceof OooOo.OooO0O0) {
            OooOOOO oooOOOO = (OooOOOO) oooOO1.f37364OooO0OO.getValue();
            oooOOO0.f37383OooO0Oo = null;
            oooOOO0.f37385OooO0o0 = null;
            oooOOO0.f37387OooO0oo = 2;
            oooOOOO.getClass();
            OooOo oooOo2 = oooO0OO2.f37425OooO00o;
            Intrinsics.checkNotNull(oooOo2, "null cannot be cast to non-null type com.code.android.cloudfilemanager.CloudFileUploadInfo.QiNiuUploadInfo");
            OooOo.OooO0O0 oooO0O0 = (OooOo.OooO0O0) oooOo2;
            File file = oooO0OO2.f37426OooO0O0;
            oooOOOO.f37461OooO0OO = ((double) (file != null ? file.length() : 0L)) > oooOOOO.f37460OooO0O0;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOOO(oooO0OO2, oooO0O0, oooOOOO, null), oooOOO0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (oooOo instanceof OooOo.OooO00o) {
            OooO oooO = (OooO) oooOO1.f37365OooO0Oo.getValue();
            oooOOO0.f37383OooO0Oo = null;
            oooOOO0.f37385OooO0o0 = null;
            oooOOO0.f37387OooO0oo = 3;
            oooO.getClass();
            OooOo oooOo3 = oooO0OO2.f37425OooO00o;
            Intrinsics.checkNotNull(oooOo3, "null cannot be cast to non-null type com.code.android.cloudfilemanager.CloudFileUploadInfo.AWSUploadInfo");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new p138o00OOoo.OooOO0(oooO0OO2, (OooOo.OooO00o) oooOo3, oooO, objectRef, null), oooOOO0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            objWithContext = "";
        }
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(OooO0OO oooO0OO, T t, Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        OooO0OO oooO0OO2;
        Iterator it;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f37366OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f37366OooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f37370OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f37366OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO0OO2 = oooO0OO;
            it = this.f37363OooO0O0.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = oooO00o.f37368OooO0o;
            t = (T) oooO00o.f37369OooO0o0;
            oooO0OO2 = oooO00o.f37367OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            OooO0o oooO0o = (OooO0o) it.next();
            oooO00o.f37367OooO0Oo = oooO0OO2;
            oooO00o.f37369OooO0o0 = t;
            oooO00o.f37368OooO0o = it;
            oooO00o.f37366OooO = 1;
            if (oooO0o.OooO00o(oooO0OO2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object OooO0OO(T t, @NotNull File file, @Nullable Long l, boolean z, @Nullable Boolean bool, @NotNull Continuation<? super OooO0OO> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f37373OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f37373OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object objWithContext = oooO0O0.f37372OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f37373OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            List listMutableListOf = CollectionsKt.mutableListOf(file);
            oooO0O0.f37373OooO0o = 1;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOo00(this, bool, l, t, listMutableListOf, null, z), oooO0O0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        List list = (List) objWithContext;
        if (list != null) {
            return (OooO0OO) list.get(0);
        }
        return null;
    }
}
