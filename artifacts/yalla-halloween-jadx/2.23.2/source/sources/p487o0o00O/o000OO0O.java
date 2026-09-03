package p487o0o00O;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p269o00oooo0.o0O0oo0o;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p385o0OOoo0o.o000OOo;
import p391o0OOooo0.o0OOO0o;
import p391o0OOooo0.o0Oo0oo;
import p391o0OOooo0.oo0o0Oo;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p569o0oOo0o0.o00000OO;
import p590o0oOooo0.u0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initOnBackground$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f48788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48789OooO0o0;

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
            oo0o0Oo.OooO0Oo(true);
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
            if (o0Oo0oo.f43569OooO0OO == null) {
                synchronized (o0Oo0oo.class) {
                    if (o0Oo0oo.f43569OooO0OO == null) {
                        o0Oo0oo.f43569OooO0OO = new o0Oo0oo();
                    }
                }
            }
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f43569OooO0OO;
            o0oo0oo2.getClass();
            o0Oo0oo.f43569OooO0OO = null;
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            o0OOO0o o0ooo0o2 = new o0OOO0o(o0oo0oo2, null);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43394o00000, OooOOOO.OooO00o(), o0ooo0o2);
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
            if (p386o0OOooO.o0OO00O.f43498OooO00o == null) {
                p386o0OOooO.o0OO00O.f43498OooO00o = new p386o0OOooO.o0OO00O();
            }
            p386o0OOooO.o0OO00O.f43498OooO00o.getClass();
            com.yalla.yalla.app.golbalData.OooO00o.OooO0O0(null);
            ApiTagUtils.OooO0O0();
            if (p391o0OOooo0.o00oO0o.f43563OooO00o == null) {
                p391o0OOooo0.o00oO0o.f43563OooO00o = new p391o0OOooo0.o00oO0o();
            }
            p391o0OOooo0.o00oO0o.f43563OooO00o.getClass();
            ApiRoomShareUtils.f22241OooO00o.getClass();
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
    public o000OO0O(MainActivity mainActivity, Continuation<? super o000OO0O> continuation) {
        super(2, continuation);
        this.f48789OooO0o0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000OO0O o000oo0o2 = new o000OO0O(this.f48789OooO0o0, continuation);
        o000oo0o2.f48788OooO0Oo = obj;
        return o000oo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f48788OooO0Oo;
        p569o0oOo0o0.o0OO00O o0oo00o2 = o00000OO.f56401OooO0Oo;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o0oo00o2 = null;
        }
        o0oo00o2.OooO0OO();
        int i = MainActivity.f24940OooOoo;
        MainActivity mainActivity = this.f48789OooO0o0;
        mainActivity.OooOoO().clearMediaCache();
        SharedPreferences defaultSharedPreferences = TextUtils.isEmpty("Table_AppFirstStart") ? PreferenceManager.getDefaultSharedPreferences(o000O00O.f13421OooO00o) : o000O00O.f13421OooO00o.getSharedPreferences("Table_AppFirstStart", 0);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        boolean z = defaultSharedPreferences.getBoolean("AppFirstStart", true);
        if (editorEdit != null) {
            editorEdit.putBoolean("AppFirstStart", false).commit();
        }
        if (z) {
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("step", "20");
            ApiEvent.OooO0O0(linkedHashMapOooO00o);
        }
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO00o(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0O0(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0OO(null), 3, null);
        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OooO0o(null), 3, null);
        try {
            if (!o0O0oo0o.OooO00o().OooO0O0("HAVE_SHORTCUT", false)) {
                u0.OooO00o(o000O00O.OooO00o(), o0000.OooO0OO(o000000.single_Yalla), p562o0oOo000.o0Oo0oo.ic_logo);
                o0O0oo0o.OooO00o().OooO0o("HAVE_SHORTCUT", true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        o000OOo o000oooOooO00o = o000OOo.OooO00o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        long jLongValue = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
        String str = (String) o0O00oO0.OooOOOO().getValue();
        o000oooOooO00o.getClass();
        o000OOo.OooO0O0(jLongValue, str, mainActivity);
        return Unit.INSTANCE;
    }
}
