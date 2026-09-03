package p182o00o000O;

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
import p179o00o00.OooO;
import p179o00o00.OooOO0;
import p179o00o00.OooOOO;
import p179o00o00.OooOOOO;
import p183o00o000o.o0OoOo0;
import p438o0OoOOoO.o0O00O;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCloudFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1855#2,2:192\n*S KotlinDebug\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager\n*L\n187#1:192,2\n*E\n"})
public final class OooOO0O<T> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static String f38410OooO0o = "";

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static Context f38411OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Oooo0<T> f38412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f38413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f38414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f38415OooO0Oo;

    @DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {0, 0}, l = {188}, m = "invokeInterceptor", n = {"uploadRequest", "fileType"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f38416OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public oo00oO.OooO00o f38417OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Iterator f38418OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f38419OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f38420OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<T> f38421OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O<T> oooOO0O, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f38421OooO0oo = oooOO0O;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38420OooO0oO = obj;
            this.f38416OooO |= Integer.MIN_VALUE;
            return this.f38421OooO0oo.OooO0O0(null, null, this);
        }
    }

    @DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {}, l = {86}, m = "uploadFile", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f38422OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f38423OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<T> f38424OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0O<T> oooOO0O, Continuation<? super OooO0O0> continuation) {
            super(continuation);
            this.f38424OooO0o0 = oooOO0O;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38422OooO0Oo = obj;
            this.f38423OooO0o |= Integer.MIN_VALUE;
            return this.f38424OooO0o0.OooO0OO(null, null, null, false, null, this);
        }
    }

    public OooOO0O(@NotNull o0O00O uploadInfoLoader) {
        Intrinsics.checkNotNullParameter(uploadInfoLoader, "uploadInfoLoader");
        this.f38412OooO00o = uploadInfoLoader;
        this.f38413OooO0O0 = new ArrayList();
        this.f38414OooO0OO = LazyKt.lazy(OooOOO0.f38430OooO0Oo);
        this.f38415OooO0Oo = LazyKt.lazy(OooO.f38402OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(OooOO0O oooOO0O, oo00oO.OooO00o oooO00o, Object obj, Continuation continuation) throws Throwable {
        OooOOO oooOOO;
        oooOO0O.getClass();
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f38429OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f38429OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(oooOO0O, continuation);
            }
        } else {
            oooOOO = new OooOOO(oooOO0O, continuation);
        }
        Object objWithContext = oooOOO.f38426OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f38429OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                oooO00o = oooOOO.f38427OooO0o0;
                oooOO0O = oooOOO.f38425OooO0Oo;
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
        oooOOO.f38425OooO0Oo = oooOO0O;
        oooOOO.f38427OooO0o0 = oooO00o;
        oooOOO.f38429OooO0oo = 1;
        if (oooOO0O.OooO0O0(oooO00o, obj, oooOOO) == coroutine_suspended) {
            return coroutine_suspended;
        }
        oo00oO.OooO00o oooO00o2 = oooO00o;
        Oooo000 oooo000 = oooO00o2.f60302OooO00o;
        if (oooo000 instanceof Oooo000.OooO0O0) {
            OooOOOO oooOOOO = (OooOOOO) oooOO0O.f38414OooO0OO.getValue();
            oooOOO.f38425OooO0Oo = null;
            oooOOO.f38427OooO0o0 = null;
            oooOOO.f38429OooO0oo = 2;
            oooOOOO.getClass();
            Oooo000 oooo001 = oooO00o2.f60302OooO00o;
            Intrinsics.checkNotNull(oooo001, "null cannot be cast to non-null type com.code.android.cloudfilemanager.CloudFileUploadInfo.QiNiuUploadInfo");
            Oooo000.OooO0O0 oooO0O0 = (Oooo000.OooO0O0) oooo001;
            File file = oooO00o2.f60303OooO0O0;
            oooOOOO.f38398OooO0OO = ((double) (file != null ? file.length() : 0L)) > oooOOOO.f38397OooO0O0;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOOO(oooO00o2, oooO0O0, oooOOOO, null), oooOOO);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (oooo000 instanceof Oooo000.OooO00o) {
            OooO oooO = (OooO) oooOO0O.f38415OooO0Oo.getValue();
            oooOOO.f38425OooO0Oo = null;
            oooOOO.f38427OooO0o0 = null;
            oooOOO.f38429OooO0oo = 3;
            oooO.getClass();
            Oooo000 oooo002 = oooO00o2.f60302OooO00o;
            Intrinsics.checkNotNull(oooo002, "null cannot be cast to non-null type com.code.android.cloudfilemanager.CloudFileUploadInfo.AWSUploadInfo");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOO0(oooO00o2, (Oooo000.OooO00o) oooo002, oooO, objectRef, null), oooOOO);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            objWithContext = "";
        }
        return objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(oo00oO.OooO00o oooO00o, T t, Continuation<? super Unit> continuation) {
        OooO00o oooO00o2;
        oo00oO.OooO00o oooO00o3;
        Iterator it;
        if (continuation instanceof OooO00o) {
            oooO00o2 = (OooO00o) continuation;
            int i = oooO00o2.f38416OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o2.f38416OooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o2 = new OooO00o(this, continuation);
            }
        } else {
            oooO00o2 = new OooO00o(this, continuation);
        }
        Object obj = oooO00o2.f38420OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o2.f38416OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o3 = oooO00o;
            it = this.f38413OooO0O0.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = oooO00o2.f38418OooO0o;
            t = (T) oooO00o2.f38419OooO0o0;
            oooO00o3 = oooO00o2.f38417OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            o0OoOo0 o0oooo1 = (o0OoOo0) it.next();
            oooO00o2.f38417OooO0Oo = oooO00o3;
            oooO00o2.f38419OooO0o0 = t;
            oooO00o2.f38418OooO0o = it;
            oooO00o2.f38416OooO = 1;
            if (o0oooo1.OooO00o(oooO00o3) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object OooO0OO(T t, @NotNull File file, @Nullable Long l, boolean z, @Nullable Boolean bool, @NotNull Continuation<? super OooO0o> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f38423OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f38423OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object objWithContext = oooO0O0.f38422OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f38423OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            List listMutableListOf = CollectionsKt.mutableListOf(file);
            oooO0O0.f38423OooO0o = 1;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOo(this, bool, l, t, listMutableListOf, null, z), oooO0O0);
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
            return (OooO0o) list.get(0);
        }
        return null;
    }
}
