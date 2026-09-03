package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ReportData;
import com.yalla.yalla.api.service.EventApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.EventTagModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.EventCreateStateModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.EventSubscribeModel;
import com.yalla.yalla.model.RoomEventListModel;
import com.yalla.yalla.model.SquareEventRoomModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000oOoO;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f42257OooO00o = new Oooo0();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {9}, m = "getEventJoinRoom", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42258Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42260Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42258Oooo0o = obj;
            this.f42260Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {38}, m = "create", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42261Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42263Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42261Oooo0o = obj;
            this.f42263Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO00o(null, null, null, 0, null, null, 0L, 0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {67}, m = "delete", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42264Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42266Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42264Oooo0o = obj;
            this.f42266Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0O0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {57}, m = "detail", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42267Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42269Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42267Oooo0o = obj;
            this.f42269Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0OO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {20}, m = "getCreateEventState", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42270Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42272Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42270Oooo0o = obj;
            this.f42272Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0Oo(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {18}, m = "getMineEventList", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42273Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42275Oooo0oo;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42273Oooo0o = obj;
            this.f42275Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0o(0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {52}, m = "getRoomEvent", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42276Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42278Oooo0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42276Oooo0o = obj;
            this.f42278Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0oO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {15}, m = "getSquareEventList", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42279Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42281Oooo0oo;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42279Oooo0o = obj;
            this.f42281Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO(0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {80}, m = "getRoomEventState", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42282Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42284Oooo0oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42282Oooo0o = obj;
            this.f42284Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooO0oo(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {61}, m = "getSubPage", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42285Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42287Oooo0oo;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42285Oooo0o = obj;
            this.f42287Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooOO0(0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {75}, m = "report", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42288Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42290Oooo0oo;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42288Oooo0o = obj;
            this.f42290Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooOO0o(null, 0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {25}, m = "getTagList", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42291Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42293Oooo0oo;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42291Oooo0o = obj;
            this.f42293Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooOO0O(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {23}, m = "subscribeEvent", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42294Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42296Oooo0oo;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42294Oooo0o = obj;
            this.f42296Oooo0oo |= Integer.MIN_VALUE;
            return Oooo0.this.OooOOO0(0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO(int i, int i2, @NotNull Continuation<? super ApiResult<List<EventModel>>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i3 = oooOOO.f42281Oooo0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOOO.f42281Oooo0oo = i3 - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object squareEventList = oooOOO.f42279Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooOOO.f42281Oooo0oo;
        String str = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(squareEventList);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooOOO.f42281Oooo0oo = 1;
                squareEventList = eventApiServiceOooO00o.getSquareEventList(i, i2, oooOOO);
                if (squareEventList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(squareEventList);
            }
            return squareEventList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @Nullable String str5, long j, long j2, @Nullable String str6, @NotNull Continuation<? super ApiResult<Long>> continuation) {
        OooO00o oooO00o;
        ?? r2;
        String str7;
        ?? r3;
        ?? r4;
        Object obj;
        ?? r5;
        Object objCreate = ApiResult.class;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f42263Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f42263Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj2 = oooO00o.f42261Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o.f42263Oooo0oo;
        ?? r13 = "WebAPIException";
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    o0o0000.OooO00o oooO00o2 = o0o0000.OooO00o.f40768OooO00o;
                    try {
                        EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                        oooO00o.f42263Oooo0oo = 1;
                        obj = objCreate;
                        r5 = "WebAPIException";
                        str7 = "gson.toJson(model) ?: \"\"";
                        long j3 = j2;
                        try {
                            objCreate = eventApiServiceOooO00o.create(str, str2, str3, i, str4, str5, j, j3, str6, oooO00o);
                            if (objCreate == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj2 = objCreate;
                            r13 = j3;
                        } catch (IOException e) {
                            e = e;
                            r3 = obj;
                            r4 = r5;
                            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), r4, 1, "time out");
                            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                            if (strOooO0oo == null) {
                                strOooO0oo = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo, str7);
                            }
                            Object objOooO0O0 = o0OOO0o.OooO0O0(strOooO0oo, r3);
                            Intrinsics.checkNotNull(objOooO0O0);
                            return objOooO0O0;
                        } catch (CancellationException unused) {
                            r2 = obj;
                            ApiError apiError = new ApiError(3, "canceled");
                            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                            if (strOooO0oo2 == null) {
                                strOooO0oo2 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str7);
                            }
                            Object objOooO0O1 = o0OOO0o.OooO0O0(strOooO0oo2, r2);
                            Intrinsics.checkNotNull(objOooO0O1);
                            return objOooO0O1;
                        } catch (Exception e2) {
                            e = e2;
                            o00O00.OooO0o0(r5, e.getMessage());
                            e.printStackTrace();
                            String message = e.getMessage();
                            if (message == null) {
                                message = e.getClass().getName();
                            }
                            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                            ApiError apiError2 = new ApiError(2, message);
                            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                            if (strOooO0oo3 == null) {
                                strOooO0oo3 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str7);
                            }
                            Object objOooO0O2 = o0OOO0o.OooO0O0(strOooO0oo3, obj);
                            Intrinsics.checkNotNull(objOooO0O2);
                            return objOooO0O2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        obj = objCreate;
                        r5 = "WebAPIException";
                        str7 = "gson.toJson(model) ?: \"\"";
                    } catch (CancellationException unused2) {
                        obj = objCreate;
                        str7 = "gson.toJson(model) ?: \"\"";
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    r13 = r13;
                }
                return obj2;
            } catch (Exception e4) {
                e = e4;
                obj = objCreate;
                r5 = r13;
                str7 = "gson.toJson(model) ?: \"\"";
            }
        } catch (IOException e5) {
            e = e5;
            r3 = objCreate;
            r4 = r13;
            str7 = "gson.toJson(model) ?: \"\"";
        } catch (CancellationException unused3) {
            r2 = objCreate;
            str7 = "gson.toJson(model) ?: \"\"";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0O0(long j, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42266Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42266Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objDelete = oooO0O0.f42264Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42266Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDelete);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooO0O0.f42266Oooo0oo = 1;
                objDelete = eventApiServiceOooO00o.delete(j, oooO0O0);
                if (objDelete == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDelete);
            }
            return objDelete;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super ApiResult<EventModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f42269Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42269Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objDetail = oooO0OO.f42267Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f42269Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDetail);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooO0OO.f42269Oooo0oo = 1;
                objDetail = eventApiServiceOooO00o.detail(j, oooO0OO);
                if (objDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDetail);
            }
            return objDetail;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0Oo(long j, @NotNull Continuation<? super ApiResult<EventCreateStateModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f42272Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f42272Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object createEventState = oooO0o.f42270Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f42272Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(createEventState);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooO0o.f42272Oooo0oo = 1;
                createEventState = eventApiServiceOooO00o.getCreateEventState(j, oooO0o);
                if (createEventState == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(createEventState);
            }
            return createEventState;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o(int i, int i2, @NotNull Continuation<? super ApiResult<List<EventModel>>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i3 = oooOO1.f42275Oooo0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOO1.f42275Oooo0oo = i3 - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object mineEventList = oooOO1.f42273Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooOO1.f42275Oooo0oo;
        String str = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(mineEventList);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooOO1.f42275Oooo0oo = 1;
                mineEventList = eventApiServiceOooO00o.getMineEventList(i, i2, oooOO1);
                if (mineEventList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(mineEventList);
            }
            return mineEventList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super ApiResult<List<SquareEventRoomModel>>> continuation) {
        OooO oooO;
        List list;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f42260Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f42260Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object joinRoomList = oooO.f42258Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f42260Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(joinRoomList);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooO.f42260Oooo0oo = 1;
                joinRoomList = eventApiServiceOooO00o.getJoinRoomList(oooO);
                if (joinRoomList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(joinRoomList);
            }
            ApiResult apiResult = (ApiResult) joinRoomList;
            if (!apiResult.isSuccess() || (list = (List) apiResult.getData()) == null) {
                return joinRoomList;
            }
            o000oOoO.OooO00o(list);
            return joinRoomList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oO(long j, @NotNull Continuation<? super ApiResult<RoomEventListModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f42278Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f42278Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object listByRoom = oooOO0O.f42276Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f42278Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(listByRoom);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooOO0O.f42278Oooo0oo = 1;
                listByRoom = eventApiServiceOooO00o.getListByRoom(j, oooOO0O);
                if (listByRoom == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(listByRoom);
            }
            return listByRoom;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oo(long j, @NotNull Continuation<? super Unit> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f42284Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f42284Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object obj = oooOOO0.f42282Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f42284Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooOOO0.f42284Oooo0oo = 1;
                if (eventApiServiceOooO00o.getFirstByRoom(j, oooOOO0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Intrinsics.checkNotNull(o0OOO0o.OooO0O0(str, ApiResult.class));
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Intrinsics.checkNotNull(o0OOO0o.OooO0O0(str, ApiResult.class));
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Intrinsics.checkNotNull(o0OOO0o.OooO0O0(str, ApiResult.class));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0(long j, int i, @NotNull Continuation<? super ApiResult<List<UserInfoModel>>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i2 = oooOOOO.f42287Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOOO.f42287Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        Object subPage = oooOOOO.f42285Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOOOO.f42287Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(subPage);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooOOOO.f42287Oooo0oo = 1;
                subPage = eventApiServiceOooO00o.getSubPage(j, i, oooOOOO);
                if (subPage == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(subPage);
            }
            return subPage;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0O(@NotNull Continuation<? super ApiResult<List<EventTagModel>>> continuation) {
        OooOo00 oooOo00;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i = oooOo00.f42293Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f42293Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        Object tagList = oooOo00.f42291Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo00.f42293Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(tagList);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooOo00.f42293Oooo0oo = 1;
                tagList = eventApiServiceOooO00o.getTagList(oooOo00);
                if (tagList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(tagList);
            }
            return tagList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooOO0o(@NotNull String str, long j, @NotNull String str2, @NotNull Continuation<? super ApiResult<ReportData>> continuation) {
        OooOo oooOo;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i = oooOo.f42290Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f42290Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        OooOo oooOo2 = oooOo;
        Object objReport = oooOo2.f42288Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo2.f42290Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objReport);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                String strOooO0O0 = o000oOoO.OooO0O0(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(content)");
                oooOo2.f42290Oooo0oo = 1;
                objReport = eventApiServiceOooO00o.report(str, j, strOooO0O0, oooOo2);
                if (objReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReport);
            }
            return objReport;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOOO0(long j, int i, @NotNull Continuation<? super ApiResult<EventSubscribeModel>> continuation) {
        Oooo000 oooo000;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i2 = oooo000.f42296Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooo000.f42296Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Object objSubscribeEvent = oooo000.f42294Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooo000.f42296Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objSubscribeEvent);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40768OooO00o;
                EventApiService eventApiServiceOooO00o = o0o0000.OooO00o.OooO00o();
                oooo000.f42296Oooo0oo = 1;
                objSubscribeEvent = eventApiServiceOooO00o.subscribeEvent(j, i, oooo000);
                if (objSubscribeEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSubscribeEvent);
            }
            return objSubscribeEvent;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }
}
