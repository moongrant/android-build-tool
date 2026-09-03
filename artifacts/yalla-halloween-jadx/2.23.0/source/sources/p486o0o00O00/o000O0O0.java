package p486o0o00O00;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.app.golbalData.ApiRoomShareUtils;
import com.yalla.yalla.app.golbalData.ApiTagUtils;
import com.yalla.yalla.ui.activity.main.MainActivity;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p380o0OOoo0.OooOO0;
import p382o0OOoo0o.o00Oo0;
import p385o0OOooOO.o00O00;
import p385o0OOooOO.o00O000;
import p385o0OOooOO.o00O000o;
import p385o0OOooOO.oOO00O;
import p464o0Oooo.o000000O;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000OO0;
import p579o0oOoo.oOOO00o0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f48284OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48285OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oOO00O.OooO0Oo(true);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1$2", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (o00O00.f44338OooO0OO == null) {
                synchronized (o00O00.class) {
                    if (o00O00.f44338OooO0OO == null) {
                        o00O00.f44338OooO0OO = new o00O00();
                    }
                }
            }
            o00O00 o00o01 = o00O00.f44338OooO0OO;
            o00o01.getClass();
            o00O00.f44338OooO0OO = null;
            o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
            o00O000o o00o000o2 = new o00O000o(o00o01, null);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44135o00000, oO00o000.OooO00o(), o00o000o2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1$3", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (o00Oo0.f44282OooO00o == null) {
                o00Oo0.f44282OooO00o = new o00Oo0();
            }
            o00Oo0.f44282OooO00o.getClass();
            com.yalla.yalla.app.golbalData.OooO00o.OooO0O0(null);
            ApiTagUtils.OooO0O0();
            if (o00O000.f44341OooO00o == null) {
                o00O000.f44341OooO00o = new o00O000();
            }
            o00O000.f44341OooO00o.getClass();
            ApiRoomShareUtils.f22714OooO00o.getClass();
            ApiRoomShareUtils.OooO0OO(true);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1$4", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.app.golbalData.OooO00o.OooO0O0(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(MainActivity mainActivity, Continuation<? super o000O0O0> continuation) {
        super(2, continuation);
        this.f48285OooO0o0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000O0O0 o000o0o1 = new o000O0O0(this.f48285OooO0o0, continuation);
        o000o0o1.f48284OooO0Oo = obj;
        return o000o0o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f48284OooO0Oo;
        o00000OO o00000oo2 = o0000OO0.f56185OooO0Oo;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o00000oo2 = null;
        }
        o00000oo2.OooO0O0();
        int i = MainActivity.f25394OooOoo;
        MainActivity mainActivity = this.f48285OooO0o0;
        mainActivity.OooOoO().clearMediaCache();
        SharedPreferences defaultSharedPreferences = TextUtils.isEmpty("Table_AppFirstStart") ? PreferenceManager.getDefaultSharedPreferences(o000O0.f10354OooO00o) : o000O0.f10354OooO00o.getSharedPreferences("Table_AppFirstStart", 0);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        boolean z = defaultSharedPreferences.getBoolean("AppFirstStart", true);
        if (editorEdit != null) {
            editorEdit.putBoolean("AppFirstStart", false).commit();
        }
        if (z) {
            o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("step", "20");
            ApiEvent.OooO0O0(linkedHashMapOooO00o);
        }
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO00o(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0O0(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0OO(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0o(null), 3, null);
        try {
            if (!com.android.billingclient.api.o0000OO0.OooO0O0().OooO0O0("HAVE_SHORTCUT", false)) {
                oOOO00o0.OooO00o(o000O0.OooO00o(), o0000.OooO0OO(oO00OOo0.single_Yalla), oOo00OO0.ic_logo);
                com.android.billingclient.api.o0000OO0.OooO0O0().OooO0o("HAVE_SHORTCUT", true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooOO0 oooOO0OooO00o = OooOO0.OooO00o();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        long jLongValue = ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue();
        String str = (String) o000000O.OooOOOO().getValue();
        oooOO0OooO00o.getClass();
        OooOO0.OooO0O0(jLongValue, str, mainActivity);
        return Unit.INSTANCE;
    }
}
