package p488o0o00O0;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.code.android.util.o000OOo;
import com.common.support.apm.Sailfish;
import com.common.support.networkstate.NetworkStateUtil;
import com.common.support.networkstate.NetworkType;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.AccessToken;
import com.yalla.yalla.statistical.event.RoomEventType;
import io.agora.rtc.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FLog.kt\ncom/yalla/yalla/statistical/net/FLog\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,174:1\n215#2,2:175\n*S KotlinDebug\n*F\n+ 1 FLog.kt\ncom/yalla/yalla/statistical/net/FLog\n*L\n101#1:175,2\n*E\n"})
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f48912OooO00o = LazyKt.lazy(OooO00o.f48913OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<SimpleDateFormat> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48913OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.statistical.net.FLog$equipPhoneInfo$1", f = "FLog.kt", i = {}, l = {149, Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT, Constants.ERR_PUBLISH_STREAM_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public CustomLogModel f48914OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CustomLogModel f48915OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f48916OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.statistical.net.FLog$equipPhoneInfo$1$1", f = "FLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public OooO00o(Continuation<? super OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(o000OOo.OooO00o("www.1688.com"));
            }
        }

        /* JADX INFO: renamed from: o0o00O0.OooOO0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.statistical.net.FLog$equipPhoneInfo$1$2", f = "FLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0463OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public C0463OooO0O0(Continuation<? super C0463OooO0O0> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0463OooO0O0(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return new C0463OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(o000OOo.OooO00o("8.8.8.8"));
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.statistical.net.FLog$equipPhoneInfo$1$3", f = "FLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public OooO0OO(Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0OO(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(o000OOo.OooO00o("api.yalla.live"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CustomLogModel customLogModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f48915OooO0o = customLogModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f48915OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0087 A[Catch: Exception -> 0x009e, NumberFormatException -> 0x00a0, TryCatch #2 {NumberFormatException -> 0x00a0, Exception -> 0x009e, blocks: (B:8:0x001a, B:43:0x00a4, B:45:0x00c6, B:46:0x00cc, B:13:0x0029, B:30:0x0087, B:16:0x002f, B:26:0x0075, B:19:0x0036, B:21:0x0062), top: B:52:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0096 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x0097  */
        /* JADX WARN: Code duplicated, block: B:35:0x009a  */
        /* JADX WARN: Code duplicated, block: B:36:0x009c  */
        /* JADX WARN: Code duplicated, block: B:42:0x00a3 A[PHI: r2
          0x00a3: PHI (r2v10 com.common.support.sailfish_commons.logmodels.CustomLogModel) = 
          (r2v4 com.common.support.sailfish_commons.logmodels.CustomLogModel)
          (r2v6 com.common.support.sailfish_commons.logmodels.CustomLogModel)
          (r2v7 com.common.support.sailfish_commons.logmodels.CustomLogModel)
          (r2v11 com.common.support.sailfish_commons.logmodels.CustomLogModel)
         binds: [B:41:0x00a2, B:25:0x0073, B:29:0x0085, B:35:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c6 A[Catch: Exception -> 0x009e, NumberFormatException -> 0x00a0, TryCatch #2 {NumberFormatException -> 0x00a0, Exception -> 0x009e, blocks: (B:8:0x001a, B:43:0x00a4, B:45:0x00c6, B:46:0x00cc, B:13:0x0029, B:30:0x0087, B:16:0x002f, B:26:0x0075, B:19:0x0036, B:21:0x0062), top: B:52:0x0010 }] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CustomLogModel customLogModel;
            CustomLogModel customLogModel2;
            Long lBoxLong;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48916OooO0o0;
            boolean z = true;
            CustomLogModel customLogModel3 = this.f48915OooO0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    customLogModel3.setTime(OooOO0.OooO0O0());
                    NetworkType networkType = NetworkStateUtil.INSTANCE.networkType(o000O00O.OooO00o());
                    StringBuilder sb = new StringBuilder();
                    sb.append(networkType);
                    customLogModel3.setNetworkType(sb.toString());
                    if (Intrinsics.areEqual("INFO", customLogModel3.getLevel())) {
                        customLogModel = customLogModel3;
                    } else {
                        OooO00o oooO00o = new OooO00o(null);
                        this.f48914OooO0Oo = customLogModel3;
                        this.f48916OooO0o0 = 1;
                        obj = TimeoutKt.withTimeoutOrNull(5000L, oooO00o, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        customLogModel = customLogModel3;
                    }
                    customLogModel2 = customLogModel;
                    customLogModel2.setNetworkAvailable(z);
                    customLogModel3.addParams("operator", NetworkStateUtil.INSTANCE.networkOperatorName(o000O00O.OooO00o()));
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    lBoxLong = (Long) o0O00oO0.OooOOo0().getValue();
                    if (lBoxLong == null) {
                        lBoxLong = Boxing.boxLong(0L);
                    }
                    customLogModel3.addParams(AccessToken.USER_ID_KEY, lBoxLong.longValue());
                    customLogModel3.addParams("app_version", String.valueOf(oo0o0Oo.OooO0OO()));
                    customLogModel3.addParams("platform", "Android " + Build.VERSION.RELEASE);
                    Sailfish.INSTANCE.writeCustomLog(customLogModel3, 2);
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    customLogModel = this.f48914OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        customLogModel = this.f48914OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            OooO0OO oooO0OO = new OooO0OO(null);
                            this.f48914OooO0Oo = customLogModel;
                            this.f48916OooO0o0 = 3;
                            obj = TimeoutKt.withTimeoutOrNull(5000L, oooO0OO, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            customLogModel2 = customLogModel;
                        } else {
                            customLogModel2 = customLogModel;
                        }
                        customLogModel2.setNetworkAvailable(z);
                        customLogModel3.addParams("operator", NetworkStateUtil.INSTANCE.networkOperatorName(o000O00O.OooO00o()));
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        lBoxLong = (Long) o0O00oO0.OooOOo0().getValue();
                        if (lBoxLong == null) {
                            lBoxLong = Boxing.boxLong(0L);
                        }
                        customLogModel3.addParams(AccessToken.USER_ID_KEY, lBoxLong.longValue());
                        customLogModel3.addParams("app_version", String.valueOf(oo0o0Oo.OooO0OO()));
                        customLogModel3.addParams("platform", "Android " + Build.VERSION.RELEASE);
                        Sailfish.INSTANCE.writeCustomLog(customLogModel3, 2);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    customLogModel2 = this.f48914OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    customLogModel = customLogModel2;
                    customLogModel2 = customLogModel;
                } else {
                    z = false;
                }
                customLogModel2.setNetworkAvailable(z);
                customLogModel3.addParams("operator", NetworkStateUtil.INSTANCE.networkOperatorName(o000O00O.OooO00o()));
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                lBoxLong = (Long) o0O00oO0.OooOOo0().getValue();
                if (lBoxLong == null) {
                    lBoxLong = Boxing.boxLong(0L);
                }
                customLogModel3.addParams(AccessToken.USER_ID_KEY, lBoxLong.longValue());
                customLogModel3.addParams("app_version", String.valueOf(oo0o0Oo.OooO0OO()));
                customLogModel3.addParams("platform", "Android " + Build.VERSION.RELEASE);
                Sailfish.INSTANCE.writeCustomLog(customLogModel3, 2);
                return Unit.INSTANCE;
                if (obj == null) {
                    C0463OooO0O0 c0463OooO0O0 = new C0463OooO0O0(null);
                    this.f48914OooO0Oo = customLogModel;
                    this.f48916OooO0o0 = 2;
                    obj = TimeoutKt.withTimeoutOrNull(5000L, c0463OooO0O0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj == null) {
                        OooO0OO oooO0OO2 = new OooO0OO(null);
                        this.f48914OooO0Oo = customLogModel;
                        this.f48916OooO0o0 = 3;
                        obj = TimeoutKt.withTimeoutOrNull(5000L, oooO0OO2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        customLogModel2 = customLogModel;
                        if (obj != null) {
                            customLogModel = customLogModel2;
                            customLogModel2 = customLogModel;
                        } else {
                            z = false;
                        }
                    } else {
                        customLogModel2 = customLogModel;
                    }
                } else {
                    customLogModel2 = customLogModel;
                }
                customLogModel2.setNetworkAvailable(z);
                customLogModel3.addParams("operator", NetworkStateUtil.INSTANCE.networkOperatorName(o000O00O.OooO00o()));
                o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                lBoxLong = (Long) o0O00oO0.OooOOo0().getValue();
                if (lBoxLong == null) {
                    lBoxLong = Boxing.boxLong(0L);
                }
                customLogModel3.addParams(AccessToken.USER_ID_KEY, lBoxLong.longValue());
                customLogModel3.addParams("app_version", String.valueOf(oo0o0Oo.OooO0OO()));
                customLogModel3.addParams("platform", "Android " + Build.VERSION.RELEASE);
                Sailfish.INSTANCE.writeCustomLog(customLogModel3, 2);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static void OooO00o(CustomLogModel customLogModel) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooO0O0(customLogModel, null), 2, null);
    }

    @NotNull
    public static String OooO0O0() {
        String str = ((SimpleDateFormat) f48912OooO00o.getValue()).format(new Date(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static void OooO0OO(@NotNull RoomEventType tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        CustomLogModel customLogModel = new CustomLogModel();
        customLogModel.setLevel("ERROR");
        customLogModel.setTag(tag.toString());
        customLogModel.setMessage("");
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        customLogModel.addParams("room_id", String.valueOf(oooO00o.OooO00o().f24539OooO0Oo.getValue()));
        customLogModel.addParams("room_idx", String.valueOf(oooO00o.OooO00o().f24538OooO0OO.getValue()));
        OooO00o(customLogModel);
    }
}
