package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.api.old.service.RoomApiService;
import com.yalla.yalla.model.LiveRoomMemberRoomRankModel;
import com.yalla.yalla.model.LiveRoomMemberUserRankModel;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.model.TreasureBoxModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberHostTaskModel;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00oO0o;
import p384o0OOoo0O.OooOOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomRepo.kt\ncom/yalla/yalla/data/repository/RoomRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,80:1\n18#2,7:81\n25#2,10:89\n18#2,7:99\n25#2,10:107\n18#2,7:117\n25#2,10:125\n18#2,7:135\n25#2,10:143\n18#2,7:153\n25#2,10:161\n18#2,7:172\n25#2,10:180\n18#2,7:190\n25#2,10:198\n109#3:88\n109#3:106\n109#3:124\n109#3:142\n109#3:160\n109#3:179\n109#3:197\n62#4:171\n62#4:208\n62#4:209\n*S KotlinDebug\n*F\n+ 1 RoomRepo.kt\ncom/yalla/yalla/data/repository/RoomRepo\n*L\n21#1:81,7\n21#1:89,10\n25#1:99,7\n25#1:107,10\n29#1:117,7\n29#1:125,10\n32#1:135,7\n32#1:143,10\n34#1:153,7\n34#1:161,10\n47#1:172,7\n47#1:180,10\n54#1:190,7\n54#1:198,10\n21#1:88\n25#1:106\n29#1:124\n32#1:142\n34#1:160\n47#1:179\n54#1:197\n41#1:171\n65#1:208\n77#1:209\n*E\n"})
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OO f46151OooO00o = new o00OO();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {29}, m = "getUserInfoInRoom", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MutableLiveData f46152OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f46153OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public MutableLiveData f46154OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f46156OooO0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46153OooO0o = obj;
            this.f46156OooO0oo |= Integer.MIN_VALUE;
            return o00OO.this.OooO0o0(0L, 0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {34}, m = "getHostMemberTask", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46157OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46158OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46157OooO0Oo = obj;
            this.f46158OooO0o |= Integer.MIN_VALUE;
            return o00OO.this.OooO00o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {47}, m = "getMemberRankList", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46160OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46161OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46160OooO0Oo = obj;
            this.f46161OooO0o |= Integer.MIN_VALUE;
            return o00OO.this.OooO0O0(0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {32}, m = "getMemberTask", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46163OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46164OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46163OooO0Oo = obj;
            this.f46164OooO0o |= Integer.MIN_VALUE;
            return o00OO.this.OooO0OO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {54}, m = "getRoomTeamWeekRankData", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46166OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46167OooO0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46166OooO0Oo = obj;
            this.f46167OooO0o |= Integer.MIN_VALUE;
            return o00OO.this.OooO0Oo(0L, false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {25}, m = "loadTreasureBoxCarouselInfo", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46169OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46170OooO0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46169OooO0Oo = obj;
            this.f46170OooO0o |= Integer.MIN_VALUE;
            return o00OO.this.OooO0o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.RoomRepo", f = "RoomRepo.kt", i = {}, l = {21}, m = "loadTreasureBoxInfo", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46172OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46173OooO0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46172OooO0Oo = obj;
            this.f46173OooO0o |= Integer.MIN_VALUE;
            return o00OO.this.OooO0oO(0L, 0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(long j, @NotNull Continuation<? super ApiResult<RoomMemberHostTaskModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f46158OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46158OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object taskInfo = oooO00o.f46157OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46158OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(taskInfo);
                RoomApiService roomApiServiceOooO0O0 = OooOOO.OooO0O0();
                oooO00o.f46158OooO0o = 1;
                taskInfo = roomApiServiceOooO0O0.getTaskInfo(j, oooO00o);
                if (taskInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(taskInfo);
            }
            return taskInfo;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0O0(long j, int i, @NotNull Continuation<? super ApiResult<LiveRoomMemberUserRankModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f46161OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f46161OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object userRankData = oooO0O0.f46160OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f46161OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(userRankData);
                RoomApiService roomApiServiceOooO0O0 = OooOOO.OooO0O0();
                oooO0O0.f46161OooO0o = 1;
                userRankData = roomApiServiceOooO0O0.getUserRankData(j, i, oooO0O0);
                if (userRankData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(userRankData);
            }
            return userRankData;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super ApiResult<RoomMemberTaskModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f46164OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f46164OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object memberInfo = oooO0OO.f46163OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f46164OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(memberInfo);
                RoomApiService roomApiServiceOooO0O0 = OooOOO.OooO0O0();
                oooO0OO.f46164OooO0o = 1;
                memberInfo = roomApiServiceOooO0O0.getMemberInfo(j, oooO0OO);
                if (memberInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(memberInfo);
            }
            return memberInfo;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object OooO0Oo(long j, boolean z, @NotNull Continuation<? super ApiResult<LiveRoomMemberRoomRankModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f46167OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f46167OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object roomTeamWeekRankData = oooO0o.f46166OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f46167OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(roomTeamWeekRankData);
                RoomApiService roomApiServiceOooO0O0 = OooOOO.OooO0O0();
                boolean z2 = z;
                oooO0o.f46167OooO0o = 1;
                roomTeamWeekRankData = roomApiServiceOooO0O0.getRoomTeamWeekRankData(j, z2, oooO0o);
                if (roomTeamWeekRankData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(roomTeamWeekRankData);
            }
            return roomTeamWeekRankData;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(@NotNull Continuation<? super ApiResult<List<TreasureBoxCarouselInfo>>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f46170OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f46170OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objBarboxGetResultList = oooOO1.f46169OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f46170OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objBarboxGetResultList);
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooOO1.f46170OooO0o = 1;
                objBarboxGetResultList = mainApiServiceOooO00o.barboxGetResultList(1, oooOO1);
                if (objBarboxGetResultList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objBarboxGetResultList);
            }
            return objBarboxGetResultList;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o0(long j, long j2, @NotNull Continuation<? super MutableLiveData<ApiResult<RoomUserInfoDTO>>> continuation) {
        OooO oooO;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        CancellationException cancellationException;
        IOException iOException;
        String message;
        String name;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f46156OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f46156OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        OooO oooO2 = oooO;
        Object userInfo = oooO2.f46153OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO2.f46156OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(userInfo);
            MutableLiveData mutableLiveData3 = new MutableLiveData();
            try {
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooO2.f46152OooO0Oo = mutableLiveData3;
                oooO2.f46154OooO0o0 = mutableLiveData3;
                oooO2.f46156OooO0oo = 1;
                userInfo = mainApiServiceOooO00o.getUserInfo(j, j2, oooO2);
                if (userInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData3;
                mutableLiveData2 = mutableLiveData;
            } catch (IOException e) {
                iOException = e;
                mutableLiveData = mutableLiveData3;
                mutableLiveData2 = mutableLiveData;
                String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", iOException, 1, "time out", null, 4, null));
                userInfo = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
                Intrinsics.checkNotNull(userInfo);
            } catch (CancellationException e2) {
                cancellationException = e2;
                mutableLiveData = mutableLiveData3;
                mutableLiveData2 = mutableLiveData;
                String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", cancellationException, 3, "canceled", null, 4, null));
                userInfo = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
                Intrinsics.checkNotNull(userInfo);
            } catch (Exception e3) {
                e = e3;
                mutableLiveData = mutableLiveData3;
                mutableLiveData2 = mutableLiveData;
                o0000O00.OooO0o0("WebAPIException", e.getMessage(), e);
                message = e.getMessage();
                if (message == null) {
                    name = e.getClass().getName();
                } else {
                    name = message;
                }
                Intrinsics.checkNotNull(name);
                String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
                userInfo = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
                Intrinsics.checkNotNull(userInfo);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = oooO2.f46154OooO0o0;
            mutableLiveData2 = oooO2.f46152OooO0Oo;
            try {
                ResultKt.throwOnFailure(userInfo);
            } catch (IOException e4) {
                iOException = e4;
                String strOooO0oo4 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", iOException, 1, "time out", null, 4, null));
                userInfo = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo4 != null ? strOooO0oo4 : "");
                Intrinsics.checkNotNull(userInfo);
            } catch (CancellationException e5) {
                cancellationException = e5;
                String strOooO0oo5 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", cancellationException, 3, "canceled", null, 4, null));
                userInfo = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo5 != null ? strOooO0oo5 : "");
                Intrinsics.checkNotNull(userInfo);
            } catch (Exception e6) {
                e = e6;
                o0000O00.OooO0o0("WebAPIException", e.getMessage(), e);
                message = e.getMessage();
                if (message == null) {
                    name = e.getClass().getName();
                } else {
                    name = message;
                }
                Intrinsics.checkNotNull(name);
                String strOooO0oo6 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
                userInfo = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo6 != null ? strOooO0oo6 : "");
                Intrinsics.checkNotNull(userInfo);
            }
        }
        mutableLiveData.postValue(userInfo);
        return mutableLiveData2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0oO(long j, long j2, int i, @NotNull Continuation<? super ApiResult<TreasureBoxModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i2 = oooOO0O.f46173OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f46173OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        OooOO0O oooOO0O2 = oooOO0O;
        Object objBarboxGetDetail = oooOO0O2.f46172OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOO0O2.f46173OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objBarboxGetDetail);
                MainApiService mainApiServiceOooO00o = OooOOO.OooO00o();
                oooOO0O2.f46173OooO0o = 1;
                objBarboxGetDetail = mainApiServiceOooO00o.barboxGetDetail(j, j2, i, oooOO0O2);
                if (objBarboxGetDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objBarboxGetDetail);
            }
            return objBarboxGetDetail;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
