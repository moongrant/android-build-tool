package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.MomentApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentEditBefore;
import com.yalla.yalla.model.MomentEditResult;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.ReportCommentDetailModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p484o0o000OO.OooOOO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000oOoO;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O0o f42578OooO00o = new o000O0o();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentEditRepo", f = "MomentEditRepo.kt", i = {}, l = {27, 40}, m = "momentEditSend", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42579Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42581Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42579Oooo0o = obj;
            this.f42581Oooo0oo |= Integer.MIN_VALUE;
            return o000O0o.this.OooO0o0(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentEditRepo", f = "MomentEditRepo.kt", i = {}, l = {82}, m = "getCommentInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42582Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42584Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42582Oooo0o = obj;
            this.f42584Oooo0oo |= Integer.MIN_VALUE;
            return o000O0o.this.OooO00o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentEditRepo", f = "MomentEditRepo.kt", i = {}, l = {18}, m = "momentEditBefore", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42585Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42587Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42585Oooo0o = obj;
            this.f42587Oooo0oo |= Integer.MIN_VALUE;
            return o000O0o.this.OooO0O0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentEditRepo", f = "MomentEditRepo.kt", i = {}, l = {61}, m = "momentEditHistory", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42588Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42590Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42588Oooo0o = obj;
            this.f42590Oooo0oo |= Integer.MIN_VALUE;
            return o000O0o.this.OooO0OO(0L, 0, 0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentEditRepo", f = "MomentEditRepo.kt", i = {}, l = {73}, m = "momentEditPicUpdateSet", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42591Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42593Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42591Oooo0o = obj;
            this.f42593Oooo0oo |= Integer.MIN_VALUE;
            return o000O0o.this.OooO0Oo(0L, 0L, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO00o(long j, @NotNull Continuation<? super ApiResult<ReportCommentDetailModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42584Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42584Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object commentInfo = oooO00o.f42582Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42584Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(commentInfo);
                OooOOO oooOOO = OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = OooOOO.OooO00o();
                oooO00o.f42584Oooo0oo = 1;
                commentInfo = momentApiServiceOooO00o.getCommentInfo(j, oooO00o);
                if (commentInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(commentInfo);
            }
            return commentInfo;
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
    public final Object OooO0O0(long j, @NotNull Continuation<? super ApiResult<MomentEditBefore>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42587Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42587Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objEditMomentBefore = oooO0O0.f42585Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42587Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objEditMomentBefore);
                OooOOO oooOOO = OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = OooOOO.OooO00o();
                oooO0O0.f42587Oooo0oo = 1;
                objEditMomentBefore = momentApiServiceOooO00o.editMomentBefore(j, oooO0O0);
                if (objEditMomentBefore == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEditMomentBefore);
            }
            return objEditMomentBefore;
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
    @Nullable
    public final Object OooO0OO(long j, int i, long j2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        OooO0OO oooO0OO;
        String str;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i2 = oooO0OO.f42590Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42590Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object editHistory = oooO0OO2.f42588Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0OO2.f42590Oooo0oo;
        String str2 = "";
        String str3 = "gson.toJson(model) ?: \"\"";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(editHistory);
                OooOOO oooOOO = OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = OooOOO.OooO00o();
                oooO0OO2.f42590Oooo0oo = 1;
                str = "gson.toJson(model) ?: \"\"";
                str3 = null;
                try {
                    editHistory = momentApiServiceOooO00o.getEditHistory(j, i, j2, 20, oooO0OO2);
                    if (editHistory == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str);
                        str2 = strOooO0oo;
                    }
                    Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str);
                        str2 = strOooO0oo2;
                    }
                    Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O1);
                    return objOooO0O1;
                } catch (Exception e2) {
                    e = e2;
                    o00O00.OooO0o0("WebAPIException", e.getMessage());
                    e.printStackTrace();
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError2 = new ApiError(2, message);
                    o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str);
                        str2 = strOooO0oo3;
                    }
                    Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(editHistory);
            }
            return editHistory;
        } catch (IOException e3) {
            e = e3;
            str = str3;
        } catch (CancellationException unused2) {
            str = str3;
        } catch (Exception e4) {
            e = e4;
            str = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooO0Oo(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<Boolean>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f42593Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f42593Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        OooO0o oooO0o2 = oooO0o;
        Object objPicUpdateSet = oooO0o2.f42591Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o2.f42593Oooo0oo;
        String str4 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPicUpdateSet);
                OooOOO oooOOO = OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = OooOOO.OooO00o();
                oooO0o2.f42593Oooo0oo = 1;
                objPicUpdateSet = momentApiServiceOooO00o.picUpdateSet(j, j2, str, str2, str3, oooO0o2);
                if (objPicUpdateSet == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPicUpdateSet);
            }
            return objPicUpdateSet;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str4, ApiResult.class);
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
                str4 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[Catch: CancellationException -> 0x0100, Exception -> 0x0197, IOException -> 0x01f9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x01f9, blocks: (B:46:0x00f9, B:54:0x010c, B:57:0x0129, B:60:0x0142), top: B:95:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0142 A[Catch: CancellationException -> 0x0100, Exception -> 0x0197, IOException -> 0x01f9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x01f9, blocks: (B:46:0x00f9, B:54:0x010c, B:57:0x0129, B:60:0x0142), top: B:95:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX WARN: Code duplicated, block: B:91:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Class, java.lang.Class<com.yalla.yalla.common.model.ApiResult>] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Nullable
    public final Object OooO0o0(@NotNull MomentSendModel momentSendModel, @Nullable String str, @Nullable String str2, @NotNull Continuation<? super ApiResult<MomentEditResult>> continuation) {
        OooO oooO;
        String str3;
        Class cls;
        int i;
        String str4;
        String str5;
        String strOooO0oo;
        int i2;
        Integer value;
        Object objEditMoment;
        String str6 = ApiResult.class;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i3 = oooO.f42581Oooo0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO.f42581Oooo0oo = i3 - Integer.MIN_VALUE;
                str3 = this;
            } else {
                o000O0o o000o0o2 = this;
                oooO = o000o0o2.new OooO(continuation);
                str3 = o000o0o2;
            }
        } else {
            o000O0o o000o0o3 = this;
            oooO = o000o0o3.new OooO(continuation);
            str3 = o000o0o3;
        }
        Object obj = oooO.f42579Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO.f42581Oooo0oo;
        try {
            if (i4 != 0) {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            try {
                try {
                    if (str == null || str.length() == 0) {
                        str4 = "gson.toJson(model) ?: \"\"";
                        str5 = "WebAPIException";
                        OooOOO oooOOO = OooOOO.f40882OooO00o;
                        try {
                            MomentApiService momentApiServiceOooO00o = OooOOO.OooO00o();
                            long postId = momentSendModel.getPostId();
                            int type = momentSendModel.getType();
                            String editToken = momentSendModel.getEditToken();
                            MomentSendContentModel content = momentSendModel.getContent();
                            String strOooO0O0 = o000oOoO.OooO0O0(content != null ? content.toJSONString() : null);
                            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(moment.content?.toJSONString())");
                            value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0Oo().getValue();
                            if (value == null) {
                                value = Boxing.boxInt(0);
                            }
                            int iIntValue = value.intValue();
                            String strOooO0O1 = o000oOoO.OooO0O0(momentSendModel.getAddress());
                            Intrinsics.checkNotNullExpressionValue(strOooO0O1, "utf8ToUnicode(moment.address)");
                            String longitude = momentSendModel.getLongitude();
                            String latitude = momentSendModel.getLatitude();
                            Integer numBoxInt = Boxing.boxInt(momentSendModel.getEditIsNewPic());
                            String strValueOf = String.valueOf(oo000o.OooO0O0());
                            oooO.f42581Oooo0oo = 1;
                            i2 = 1;
                            try {
                                objEditMoment = momentApiServiceOooO00o.editMoment(postId, type, editToken, strOooO0O0, iIntValue, strOooO0O1, longitude, latitude, numBoxInt, strValueOf, oooO);
                                if (objEditMoment == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (IOException e) {
                                e = e;
                                cls = str6;
                                i = i2;
                                ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), str5, i, "time out");
                                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                                strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                                if (strOooO0oo == null) {
                                    strOooO0oo = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                                }
                                Object objOooO0O0 = o0OOO0o.OooO0O0(strOooO0oo, cls);
                                Intrinsics.checkNotNull(objOooO0O0);
                                return objOooO0O0;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            i2 = 1;
                        }
                    } else {
                        if (str2 == null || str2.length() == 0) {
                            str4 = "gson.toJson(model) ?: \"\"";
                            str5 = "WebAPIException";
                            OooOOO oooOOO2 = OooOOO.f40882OooO00o;
                            MomentApiService momentApiServiceOooO00o2 = OooOOO.OooO00o();
                            long postId2 = momentSendModel.getPostId();
                            int type2 = momentSendModel.getType();
                            String editToken2 = momentSendModel.getEditToken();
                            MomentSendContentModel content2 = momentSendModel.getContent();
                            String strOooO0O2 = o000oOoO.OooO0O0(content2 != null ? content2.toJSONString() : null);
                            Intrinsics.checkNotNullExpressionValue(strOooO0O2, "utf8ToUnicode(moment.content?.toJSONString())");
                            value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0Oo().getValue();
                            if (value == null) {
                                value = Boxing.boxInt(0);
                            }
                            int iIntValue2 = value.intValue();
                            String strOooO0O3 = o000oOoO.OooO0O0(momentSendModel.getAddress());
                            Intrinsics.checkNotNullExpressionValue(strOooO0O3, "utf8ToUnicode(moment.address)");
                            String longitude2 = momentSendModel.getLongitude();
                            String latitude2 = momentSendModel.getLatitude();
                            Integer numBoxInt2 = Boxing.boxInt(momentSendModel.getEditIsNewPic());
                            String strValueOf2 = String.valueOf(oo000o.OooO0O0());
                            oooO.f42581Oooo0oo = 1;
                            i2 = 1;
                            objEditMoment = momentApiServiceOooO00o2.editMoment(postId2, type2, editToken2, strOooO0O2, iIntValue2, strOooO0O3, longitude2, latitude2, numBoxInt2, strValueOf2, oooO);
                            if (objEditMoment == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            OooOOO oooOOO3 = OooOOO.f40882OooO00o;
                            MomentApiService momentApiServiceOooO00o3 = OooOOO.OooO00o();
                            long postId3 = momentSendModel.getPostId();
                            int type3 = momentSendModel.getType();
                            String editToken3 = momentSendModel.getEditToken();
                            MomentSendContentModel content3 = momentSendModel.getContent();
                            String strOooO0O4 = o000oOoO.OooO0O0(content3 != null ? content3.toJSONString() : null);
                            Intrinsics.checkNotNullExpressionValue(strOooO0O4, "utf8ToUnicode(moment.content?.toJSONString())");
                            Integer value2 = p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0Oo().getValue();
                            if (value2 == null) {
                                value2 = Boxing.boxInt(0);
                            }
                            int iIntValue3 = value2.intValue();
                            String strOooO0O5 = o000oOoO.OooO0O0(momentSendModel.getAddress());
                            Intrinsics.checkNotNullExpressionValue(strOooO0O5, "utf8ToUnicode(moment.address)");
                            String longitude3 = momentSendModel.getLongitude();
                            String latitude3 = momentSendModel.getLatitude();
                            Integer numBoxInt3 = Boxing.boxInt(momentSendModel.getEditIsNewPic());
                            String strValueOf3 = String.valueOf(oo000o.OooO0O0());
                            oooO.f42581Oooo0oo = 2;
                            objEditMoment = momentApiServiceOooO00o3.editMoment(postId3, type3, editToken3, strOooO0O4, iIntValue3, strOooO0O5, longitude3, latitude3, numBoxInt3, str, str2, strValueOf3, oooO);
                            if (objEditMoment == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return objEditMoment;
                } catch (IOException e3) {
                    e = e3;
                    cls = str6;
                    i = 1;
                    str5 = str6;
                    str4 = str3;
                    ApiError apiErrorOooO00o2 = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), str5, i, "time out");
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                    strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o2);
                    if (strOooO0oo == null) {
                        strOooO0oo = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                    }
                    Object objOooO0O1 = o0OOO0o.OooO0O0(strOooO0oo, cls);
                    Intrinsics.checkNotNull(objOooO0O1);
                    return objOooO0O1;
                }
            } catch (CancellationException unused) {
                ApiError apiError = new ApiError(3, "canceled");
                o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                if (strOooO0oo2 == null) {
                    strOooO0oo2 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str3);
                }
                Object objOooO0O2 = o0OOO0o.OooO0O0(strOooO0oo2, str6);
                Intrinsics.checkNotNull(objOooO0O2);
                return objOooO0O2;
            } catch (Exception e4) {
                e = e4;
                o00O00.OooO0o0(str6, e.getMessage());
                e.printStackTrace();
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                ApiError apiError2 = new ApiError(2, message);
                o0OOO0o o0ooo0o5 = o0OOO0o.f42120OooO00o;
                String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                if (strOooO0oo3 == null) {
                    strOooO0oo3 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str3);
                }
                Object objOooO0O3 = o0OOO0o.OooO0O0(strOooO0oo3, str6);
                Intrinsics.checkNotNull(objOooO0O3);
                return objOooO0O3;
            }
        } catch (IOException e5) {
            e = e5;
            str3 = "gson.toJson(model) ?: \"\"";
            str6 = "WebAPIException";
        } catch (CancellationException unused2) {
            str3 = "gson.toJson(model) ?: \"\"";
        } catch (Exception e6) {
            e = e6;
            str3 = "gson.toJson(model) ?: \"\"";
            str6 = "WebAPIException";
        }
    }
}
