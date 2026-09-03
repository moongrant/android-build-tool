package p154o00OoO00;

import android.util.LruCache;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.opensource.svgaplayer.OooO0OO;
import com.yalla.yalla.base.loadcache.LoadLogic;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import p120o00O0Ooo.o0OO00O;
import p416o0Oo0ooo.y0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Oo0 f38187OooO00o = new o00Oo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final String f38188OooO0O0 = "svga/";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final LruCache<String, oo000o> f38189OooO0OO = new LruCache<>(20);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f38190OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f38191OooO0o0 = new OooO0OO(o000O0.OooO00o());

    public static final class OooO00o extends LoadLogic<String, oo000o> {
        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO00o(Object obj, com.yalla.yalla.base.loadcache.OooO00o oooO00o) {
            return o00Oo0.OooO00o(o00Oo0.f38187OooO00o, (String) obj, oooO00o);
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO0OO(String str) {
            return o00Oo0.f38189OooO0OO.get(str);
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Object OooO0Oo(Object obj, com.yalla.yalla.base.loadcache.OooO00o oooO00o) {
            String str = (String) obj;
            o00Oo0.f38187OooO00o.getClass();
            if (StringsKt.Oooo00o(str, o00Oo0.f38188OooO0O0)) {
                return BuildersKt.withContext(Dispatchers.getIO(), new oo000o(str, null), oooO00o);
            }
            File file = new File(y0.f45409OooO0OO, OooOOOO.OooO00o(o00O0OO0.OooO00o.OooO00o(str), o0OO00O.OooO0O0(str)));
            return file.exists() ? BuildersKt.withContext(Dispatchers.getIO(), new o00oO0o(file, str, null), oooO00o) : null;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Unit OooO0o(Object obj, Object obj2) {
            o00Oo0.f38189OooO0OO.put((String) obj, (oo000o) obj2);
            return Unit.INSTANCE;
        }

        @Override // com.yalla.yalla.base.loadcache.LoadLogic
        public final Unit OooO0o0(Object obj, Object obj2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o00Oo0 o00oo1, String str, Continuation continuation) throws Throwable {
        o0ooOOo o0ooooo;
        o00oo1.getClass();
        if (continuation instanceof o0ooOOo) {
            o0ooooo = (o0ooOOo) continuation;
            int i = o0ooooo.f38206OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooooo.f38206OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o0ooooo = new o0ooOOo(o00oo1, continuation);
            }
        } else {
            o0ooooo = new o0ooOOo(o00oo1, continuation);
        }
        Object objWithContext = o0ooooo.f38203OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0ooooo.f38206OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                str = o0ooooo.f38204OooO0o0;
                o00oo1 = o0ooooo.f38202OooO0Oo;
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
        o0ooooo.f38202OooO0Oo = o00oo1;
        o0ooooo.f38204OooO0o0 = str;
        o0ooooo.f38206OooO0oo = 1;
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o00O0O(str, null), o0ooooo);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        o0ooooo.f38202OooO0Oo = null;
        o0ooooo.f38204OooO0o0 = null;
        o0ooooo.f38206OooO0oo = 2;
        o00oo1.getClass();
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o00oO0o((File) objWithContext, str, null), o0ooooo);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objWithContext;
    }
}
