package p530o0o0OO0O;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ApiError;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0o0000.OooOOOO;
import org.conscrypt.NativeConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p190o00o00oO.oo0o0Oo;
import p255o00ooO0O.o000O0O0;
import p256o00ooO0o.oo0oOO0;
import p517o0o0O00.o00O00;
import p522o0o0O0O0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.error.IMMessageErrorHandler$post$1", f = "IMMessageErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f43153Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o000O0O0 o000o0o1, Continuation<? super o000O> continuation) {
        super(2, continuation);
        this.f43153Oooo = o000o0o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O(this.f43153Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o000O0O0 o000o0o1 = this.f43153Oooo;
        int i = o000o0o1.f43154OooO00o;
        o00O00.OooO0O0("Socket MessageErrorHandler code = " + i + " message = " + o000o0o1.f43155OooO0O0);
        if (i == -1) {
            ToastUtil.f12582OooO00o.OooO00o(R.string.not_network);
        } else if (i == 500) {
            ToastUtil.f12582OooO00o.OooO00o(R.string.Unknown_Failure);
        } else if (i == 630) {
            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_expired));
        } else if (i == 400) {
            ToastUtil.f12582OooO00o.OooO00o(R.string.wrong_parameter);
        } else if (i == 401) {
            ToastUtil.f12582OooO00o.OooO00o(R.string.error_unauthorized);
        } else if (i == 600) {
            ToastUtil.f12582OooO00o.OooO00o(R.string.Friends_Already);
        } else if (i != 601) {
            Context context = null;
            switch (i) {
                case 603:
                    ToastUtil.f12582OooO00o.OooO00o(R.string.ADD_FREIND_NEED_VALIDATION);
                    break;
                case 604:
                    ToastUtil.f12582OooO00o.OooO00o(R.string.On_His_Blacklist);
                    break;
                case 605:
                    ToastUtil.f12582OooO00o.OooO00o(R.string.friend_limit);
                    break;
                case 606:
                    ToastUtil.f12582OooO00o.OooO00o(R.string.friend_user_limit);
                    break;
                case 607:
                    ToastUtil.f12582OooO00o.OooO00o(R.string.friended_too_often);
                    break;
                case 608:
                    oo0o0Oo.OooO0O0(CommonError.Coin_Frozen, null, 2, null, CommonErrorHandler.INSTANCE);
                    break;
                case 609:
                    oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    break;
                case 610:
                    ToastUtil.f12582OooO00o.OooO00o(R.string.microom_code_1013);
                    break;
                case 611:
                    oo0o0Oo.OooO0O0(CommonError.Other_Device_Login, null, 2, null, CommonErrorHandler.INSTANCE);
                    break;
                case 612:
                    oo0o0Oo.OooO0O0(CommonError.Coin_Frozen, null, 2, null, CommonErrorHandler.INSTANCE);
                    break;
                case 613:
                    oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    break;
                case 614:
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0O0O00(null), 2, null);
                    break;
                default:
                    switch (i) {
                        case 616:
                            ToastUtil.f12582OooO00o.OooO00o(R.string.error_friend_add_unacceptable_word);
                            break;
                        case 617:
                            oo0o0Oo.OooO0O0(CommonError.Other_Device_Login, null, 2, null, CommonErrorHandler.INSTANCE);
                            break;
                        case 618:
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0O0O00(null), 2, null);
                            break;
                        case 619:
                            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_too_many_friend_request));
                            break;
                        default:
                            switch (i) {
                                case 641:
                                    ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_send_frequently));
                                    break;
                                case 642:
                                    ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_send_limited));
                                    break;
                                case 643:
                                    Context contextOooO0O0 = OooO0O0.f20522OooO00o.OooO0O0();
                                    if (contextOooO0O0 == null) {
                                        Context context2 = o0000O.f2671OooO00o;
                                        if (context2 != null) {
                                            context = context2;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                        }
                                        contextOooO0O0 = context;
                                    }
                                    oo0oOO0 oo0ooo0 = new oo0oOO0(contextOooO0O0);
                                    oo0ooo0.OooOo0(R.string.Nobility_commodity);
                                    oo0ooo0.OooOOO0();
                                    break;
                                case 644:
                                    Context contextOooO0O1 = OooO0O0.f20522OooO00o.OooO0O0();
                                    if (contextOooO0O1 == null) {
                                        Context context3 = o0000O.f2671OooO00o;
                                        if (context3 != null) {
                                            context = context3;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                        }
                                        contextOooO0O1 = context;
                                    }
                                    oo0oOO0 oo0ooo1 = new oo0oOO0(contextOooO0O1);
                                    oo0ooo1.OooOo0(R.string.Vip_KA_commodity);
                                    oo0ooo1.OooOOO0();
                                    break;
                                case 645:
                                    Context contextOooO0O2 = OooO0O0.f20522OooO00o.OooO0O0();
                                    if (contextOooO0O2 == null) {
                                        Context context4 = o0000O.f2671OooO00o;
                                        if (context4 != null) {
                                            context = context4;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                        }
                                        contextOooO0O2 = context;
                                    }
                                    oo0oOO0 oo0ooo2 = new oo0oOO0(contextOooO0O2);
                                    oo0ooo2.OooOo0(R.string.Vip_commodity_freeze);
                                    oo0ooo2.OooOOO0();
                                    break;
                                default:
                                    switch (i) {
                                        case 650:
                                            ApiError error = new ApiError(NativeConstants.SSL_SIGN_ED25519, null, 2, null);
                                            Intrinsics.checkNotNullParameter(error, "error");
                                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                                            break;
                                        case 651:
                                            oo0o0Oo.OooO0O0(CommonError.Friend_Has_This_Theme, null, 2, null, CommonErrorHandler.INSTANCE);
                                            break;
                                        case 652:
                                            ApiError error2 = new ApiError(RecyclerView.oo0o0Oo.FLAG_MOVED, null, 2, null);
                                            Intrinsics.checkNotNullParameter(error2, "error");
                                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error2, null), 3, null);
                                            break;
                                        case 653:
                                            oo0o0Oo.OooO0O0(CommonError.Account_Has_Deleted, null, 2, null, CommonErrorHandler.INSTANCE);
                                            break;
                                        case 654:
                                            ApiError error3 = new ApiError(NativeConstants.SSL_SIGN_RSA_PSS_RSAE_SHA384, null, 2, null);
                                            Intrinsics.checkNotNullParameter(error3, "error");
                                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error3, null), 3, null);
                                            break;
                                        case 655:
                                            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.face_has_expired));
                                            LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                                            break;
                                        case 656:
                                            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.face_has_sold_out));
                                            LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                                            break;
                                        default:
                                            ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Unknown_Failure));
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            ToastUtil.f12582OooO00o.OooO00o(R.string.microom_code_1003);
        }
        return Unit.INSTANCE;
    }
}
