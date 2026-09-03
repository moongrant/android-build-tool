package p269o00oooOO;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.common.support.apm.api.ApmApi;
import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import p267o00ooo0o.o00OO000;
import p267o00ooo0o.o00OO0O0;
import p267o00ooo0o.o00OO0OO;
import p268o00oooO.o0O0O0O;
import p268o00oooO.o0oO0O0o;
import p268o00oooO.o0oO0Ooo;
import p272o00oooo0.o0O0o000;
import p273o00ooooO.b0;
import p273o00ooooO.e0;
import p274o00ooooo.f0;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.oOO00O;
import p660o0ooo0o0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO000 f34952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public AtomicInteger f34953OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f34954OooO0OO;

    public static final class OooO00o implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ LiveData<Boolean> f34956OooO0O0;

        public OooO00o(LiveData<Boolean> liveData) {
            this.f34956OooO0O0 = liveData;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            if (x.this.f34953OooO0O0.compareAndSet(0, 1)) {
                z zVar = (z) x.this;
                Objects.requireNonNull(zVar);
                zVar.f34959OooO0o = new f0();
                String str = zVar.f34961OooO0oO;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("logDir");
                    throw null;
                }
                e0 e0Var = new e0(str, zVar.f34952OooO00o, zVar.f34954OooO0OO, y.f34957Oooo0o);
                CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
                Dispatchers dispatchers = Dispatchers.INSTANCE;
                e0Var.f34990OooO0Oo = BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, Dispatchers.getIO(), null, new b0(e0Var, null), 2, null);
                Intrinsics.checkNotNullParameter("Apm initialization success", "error");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, "Apm initialization success");
                }
            } else {
                Intrinsics.checkNotNullParameter("Apm initialization failed", "error");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, "Apm initialization failed");
                }
            }
            this.f34956OooO0O0.removeObserver(this);
        }
    }

    public x(@NotNull o00OO000 sailfishApmConfig) {
        Intrinsics.checkNotNullParameter(sailfishApmConfig, "sailfishApmConfig");
        this.f34952OooO00o = sailfishApmConfig;
        this.f34953OooO0O0 = new AtomicInteger(0);
        o00OO0OO o00oo0oo = new o00OO0OO(sailfishApmConfig);
        this.f34954OooO0OO = o00oo0oo;
        String accessKey = sailfishApmConfig.f34914OooO0o0;
        String baseUrl = sailfishApmConfig.f34908OooO;
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        ApmApi.OooO00o.f12656OooO0Oo = accessKey;
        ApmApi.OooO00o.f12654OooO0O0 = baseUrl;
        Lazy lazy = o0oO0Ooo.f34945OooO00o;
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO00o.OooO0OO(60L, timeUnit);
        oooO00o.OooO0oO(8L, timeUnit);
        oooO00o.OooO(8L);
        oooO00o.OooO0o0(oo0o0O0.NONE);
        oooO00o.f51354OooO0o = true;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        oOO00O connectionPool = new oOO00O(5L);
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        oooO00o.f51351OooO0O0 = connectionPool;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.OooO00o() { // from class: o00oooo0.oo0OOoo
            @Override // okhttp3.logging.HttpLoggingInterceptor.OooO00o
            public final void OooO00o(String it) {
                o0O0o000 o0o0o000 = o0O0o000.f34968OooO00o;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o0o0o000.OooO00o(it);
            }
        });
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        Intrinsics.checkNotNullParameter(level, "level");
        httpLoggingInterceptor.f53044OooO0O0 = level;
        oooO00o.OooO00o(new o0oO0O0o());
        oooO00o.OooO00o(new o0O0O0O());
        oooO00o.OooO00o(httpLoggingInterceptor);
        o00OO o00oo2 = new o00OO(oooO00o);
        Intrinsics.checkNotNullExpressionValue(o00oo2, "builder.build()");
        Intrinsics.checkNotNullParameter(o00oo2, "<set-?>");
        ApmApi.OooO00o.f12655OooO0OO = o00oo2;
        z zVar = (z) this;
        zVar.f34960OooO0o0 = new Xlog();
        String str = zVar.f34952OooO00o.f34915OooO0oO;
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        separator = StringsKt__StringsJVMKt.endsWith$default(str, separator, false, 2, null) ? "" : separator;
        zVar.f34961OooO0oO = zVar.f34952OooO00o.f34915OooO0oO + ((Object) separator) + "xlog";
        String str2 = zVar.f34952OooO00o.f34915OooO0oO + ((Object) separator) + "xlog_cache";
        o00OO000 o00oo001 = zVar.f34952OooO00o;
        int i = o00oo001.f34917OooOO0 ? 0 : 2;
        String str3 = zVar.f34961OooO0oO;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("logDir");
            throw null;
        }
        Xlog.open(true, i, 0, str2, str3, o00oo001.f34916OooO0oo, o00oo001.f34918OooOO0O);
        Xlog xlog = zVar.f34960OooO0o0;
        if (xlog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xlog");
            throw null;
        }
        xlog.setMaxFileSize(0L, zVar.f34958OooO0Oo);
        Xlog xlog2 = zVar.f34960OooO0o0;
        if (xlog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("xlog");
            throw null;
        }
        Log.setLogImp(xlog2);
        Log.setConsoleLogOpen(zVar.f34952OooO00o.f34917OooOO0);
        MutableLiveData mutableLiveData = new MutableLiveData();
        CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
        Dispatchers dispatchers = Dispatchers.INSTANCE;
        BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, Dispatchers.getIO(), null, new o00OO0O0(o00oo0oo, mutableLiveData, null), 2, null);
        new Handler(Looper.getMainLooper()).post(new w(mutableLiveData, new OooO00o(mutableLiveData), 0));
    }
}
