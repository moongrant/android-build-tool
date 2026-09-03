package p200o00o0OoO;

import android.util.LruCache;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.base.loadcache.LoadLogic;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import p146o00Oo000.OooOOO0;
import p466o0OooOoo.o0O0o00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OOO0O f39296OooO00o = new o00OOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final String f39297OooO0O0 = "svga/";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final LruCache<String, o00Ooo> f39298OooO0OO = new LruCache<>(20);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f39299OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f39300OooO0o0 = new OooO0OO(o000O00O.OooO00o());

    public static final class OooO00o extends LoadLogic<String, o00Ooo> {
        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO00o(Object obj, com.yalla.yalla.base.loadcache.OooO00o oooO00o) {
            return o00OOO0O.OooO00o(o00OOO0O.f39296OooO00o, (String) obj, oooO00o);
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO0OO(String str) {
            return o00OOO0O.f39298OooO0OO.get(str);
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO0Oo(Object obj, com.yalla.yalla.base.loadcache.OooO00o oooO00o) {
            String str = (String) obj;
            o00OOO0O.f39296OooO00o.getClass();
            if (StringsKt__StringsJVMKt.startsWith$default(str, o00OOO0O.f39297OooO0O0, false, 2, null)) {
                return BuildersKt.withContext(Dispatchers.getIO(), new o00OOOO0(str, null), oooO00o);
            }
            File file = new File(o0O0o00O.f47846OooO0OO, OooOOOO.OooO00o(o00OOOOo.OooO00o.OooO00o(str), OooOOO0.OooO0O0(str)));
            return file.exists() ? BuildersKt.withContext(Dispatchers.getIO(), new o00OOOOo(file, str, null), oooO00o) : null;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Unit OooO0o(Object obj, Object obj2) {
            o00OOO0O.f39298OooO0OO.put((String) obj, (o00Ooo) obj2);
            return Unit.INSTANCE;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Unit OooO0o0(Object obj, Object obj2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o00OOO0O o00ooo0o2, String str, Continuation continuation) throws Throwable {
        o00Oo00 o00oo00;
        o00ooo0o2.getClass();
        if (continuation instanceof o00Oo00) {
            o00oo00 = (o00Oo00) continuation;
            int i = o00oo00.f39312OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo00.f39312OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o00oo00 = new o00Oo00(o00ooo0o2, continuation);
            }
        } else {
            o00oo00 = new o00Oo00(o00ooo0o2, continuation);
        }
        Object objWithContext = o00oo00.f39309OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oo00.f39312OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                str = o00oo00.f39310OooO0o0;
                o00ooo0o2 = o00oo00.f39308OooO0Oo;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return objWithContext;
        }
        ResultKt.throwOnFailure(objWithContext);
        o00oo00.f39308OooO0Oo = o00ooo0o2;
        o00oo00.f39310OooO0o0 = str;
        o00oo00.f39312OooO0oo = 1;
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o00OOO0(str, null), o00oo00);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00oo00.f39308OooO0Oo = null;
        o00oo00.f39310OooO0o0 = null;
        o00oo00.f39312OooO0oo = 2;
        o00ooo0o2.getClass();
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o00OOOOo((File) objWithContext, str, null), o00oo00);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objWithContext;
    }
}
