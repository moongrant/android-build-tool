package p535o0o0OOoO;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.billingclient.api.o00000O;
import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.app.base.app.appConfig.apiDataModela.ApiRoomActivityUtils;
import com.app.base.app.appConfig.apiDataModela.ApiRoomShareUtils;
import com.app.base.app.appConfig.apiDataModela.ApiTagUtils;
import com.app.base.http.ApiEvent;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.MainActivity;
import java.util.Objects;
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
import p031OoooO.o0000O;
import p134o00OO0o.o00O0O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p168o00Ooo0.oo0o0Oo;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0O00oO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f43655Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MainActivity f43656Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1$5", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MainActivity f43657Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MainActivity mainActivity, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f43657Oooo0o = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f43657Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MainActivity mainActivity = this.f43657Oooo0o;
            MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
            mainActivity.Oooo00o().loadLimitedPsdRoom();
            return Unit.INSTANCE;
        }
    }

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
            oo0O.OooO0OO.f53327OooO00o.OooO0Oo(true);
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
            oo0O.OooO0O0 oooO0O0OooO00o = oo0O.OooO0O0.OooO00o();
            Objects.requireNonNull(oooO0O0OooO00o);
            oo0O.OooO0O0.f53322OooO0OO = null;
            oooO0O0OooO00o.OooO0O0(null);
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
            if (o00O0O.f31634OooO00o == null) {
                o00O0O.f31634OooO00o = new o00O0O();
            }
            Objects.requireNonNull(o00O0O.f31634OooO00o);
            ApiCountryUtils.init();
            ApiTagUtils.INSTANCE.init();
            ApiRoomActivityUtils.getInstance().init();
            ApiRoomShareUtils.INSTANCE.init(true);
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
            ApiCountryUtils.init();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(MainActivity mainActivity, Continuation<? super oO0O00oO> continuation) {
        super(2, continuation);
        this.f43656Oooo0oO = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oO0O00oO oo0o00oo = new oO0O00oO(this.f43656Oooo0oO, continuation);
        oo0o00oo.f43655Oooo0o = obj;
        return oo0o00oo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0O00oO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f43655Oooo0o;
        SharedPreferences defaultSharedPreferences = TextUtils.isEmpty("Table_AppFirstStart") ? PreferenceManager.getDefaultSharedPreferences(o0000O.f2657OooO00o) : o0000O.f2657OooO00o.getSharedPreferences("Table_AppFirstStart", 0);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        boolean z = defaultSharedPreferences.getBoolean("AppFirstStart", true);
        if (editorEdit != null) {
            editorEdit.putBoolean("AppFirstStart", false).commit();
        }
        if (z) {
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            new ApiEvent().OooO00o(1);
        }
        Context context = null;
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO00o(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0O0(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0OO(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0o(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO(this.f43656Oooo0oO, null), 3, null);
        try {
            if (!o00000O.OooO0O0().OooO0Oo("HAVE_SHORTCUT", false)) {
                Context context2 = o0000O.f2657OooO00o;
                if (context2 != null) {
                    context = context2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                }
                oo0o0Oo.OooO00o(context, o000O0O0.OooO0OO(R.string.single_Yalla));
                o00000O.OooO0O0().OooO0oo("HAVE_SHORTCUT", true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        o00OOOO.OooO00o OooO00o2 = o00OOOO.OooO00o.OooO00o();
        MainActivity mainActivity = this.f43656Oooo0oO;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        OooO00o2.OooO0O0(mainActivity, ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue(), oooOOO.OooOo00().getValue());
        return Unit.INSTANCE;
    }
}
