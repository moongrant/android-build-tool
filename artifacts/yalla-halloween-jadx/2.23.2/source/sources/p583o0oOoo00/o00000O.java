package p583o0oOoo00;

import android.util.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.base.loadcache.LoadLogic;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0OooOoo.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final File f56650OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LruCache<String, String> f56651OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f56652OooO0OO;

    @SourceDebugExtension({"SMAP\nSharedThemeVideoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedThemeVideoManager.kt\ncom/yalla/yalla/data/cache/SharedThemeVideoManager$loadLogic$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,60:1\n314#2,11:61\n*S KotlinDebug\n*F\n+ 1 SharedThemeVideoManager.kt\ncom/yalla/yalla/data/cache/SharedThemeVideoManager$loadLogic$1\n*L\n17#1:61,11\n*E\n"})
    public static final class OooO00o extends LoadLogic<String, String> {
        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO00o(Object obj, com.yalla.yalla.base.loadcache.OooO00o oooO00o) throws Throwable {
            String str = (String) obj;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
            cancellableContinuationImpl.initCancellability();
            File file = o00000O.f56650OooO00o;
            String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast(str, "/", "");
            o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o(o00000O.f56650OooO00o);
            oooO00o2.f37468OooO0oo = strSubstringAfterLast;
            oooO00o2.f37464OooO0Oo = new o00000O0(cancellableContinuationImpl, strSubstringAfterLast);
            oooO00o2.f37462OooO0O0 = str;
            oooO00o2.execute(new String[0]);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            return result;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO0OO(String str) {
            return o00000O.f56651OooO0O0.get(str);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002a  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO0Oo(Object obj, com.yalla.yalla.base.loadcache.OooO00o oooO00o) {
            File file = o00000O.f56650OooO00o;
            String strSubstringAfterLast = StringsKt__StringsKt.substringAfterLast((String) obj, "/", "");
            File[] fileArrListFiles = o00000O.f56650OooO00o.listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file2 : fileArrListFiles) {
                if (Intrinsics.areEqual(file2.getName(), strSubstringAfterLast)) {
                    if (file2 != null) {
                        return file2.getAbsolutePath();
                    }
                    return null;
                }
            }
            file2 = null;
            if (file2 != null) {
                return file2.getAbsolutePath();
            }
            return null;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Unit OooO0o(Object obj, Object obj2) {
            o00000O.f56651OooO0O0.put((String) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Unit OooO0o0(Object obj, Object obj2) {
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedThemeVideoManager$loadVideo$1", f = "SharedThemeVideoManager.kt", i = {}, l = {54, 54}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<String>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56653OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f56654OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f56655OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f56654OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f56654OooO0o, continuation);
            oooO0O0.f56655OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<String> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56653OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f56655OooO0o0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f56655OooO0o0;
            OooO00o oooO00o = o00000O.f56652OooO0OO;
            this.f56655OooO0o0 = liveDataScope;
            this.f56653OooO0Oo = 1;
            obj = oooO00o.OooO0O0(this.f56654OooO0o, LoadLogic.LoadLevel.ALL, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str = (String) obj;
            if (str == null) {
                str = "";
            }
            this.f56655OooO0o0 = null;
            this.f56653OooO0Oo = 2;
            if (liveDataScope.emit(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    static {
        File file = o0O0o00O.f47844OooO00o;
        f56650OooO00o = (File) o0O0o00O.f47854OooOO0o.getValue();
        f56651OooO0O0 = new LruCache<>(20);
        f56652OooO0OO = new OooO00o();
    }

    @NotNull
    public static LiveData OooO00o(@NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return o00oO0o.OooO00o(new OooO0O0(videoUrl, null));
    }
}
