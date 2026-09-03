package p431o0OoOOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.facebook.appevents.AppEventsLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPayLogUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayLogUpload.kt\ncom/yalla/yalla/manager/unBlur/googlepay/PayLogUpload\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1855#2,2:92\n1855#2,2:94\n*S KotlinDebug\n*F\n+ 1 PayLogUpload.kt\ncom/yalla/yalla/manager/unBlur/googlepay/PayLogUpload\n*L\n48#1:92,2\n76#1:94,2\n*E\n"})
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f45909OooO00o = LazyKt.lazy(OooO00o.f45910OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<AppEventsLogger> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f45910OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppEventsLogger invoke() {
            return AppEventsLogger.INSTANCE.newLogger(o000O0.OooO00o());
        }
    }
}
