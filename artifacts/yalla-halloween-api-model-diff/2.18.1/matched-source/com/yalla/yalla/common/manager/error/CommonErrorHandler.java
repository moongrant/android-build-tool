package com.yalla.yalla.common.manager.error;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.ApiError1005;
import com.yalla.yalla.model.DialogLinkFrom;
import com.yalla.yalla.model.DialogLinkManage;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o0OOO0o;
import p522o0o0O0o.o000O;
import p579o0oOoOOo.oO0O0Oo0;
import p579o0oOoOOo.p;
import p617o0oo0o.o00000O0;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.s7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\nH\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0014\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lcom/yalla/yalla/common/manager/error/CommonErrorHandler;", "", "()V", "outDialogShowing", "", "getOutDialogShowing", "()Z", "setOutDialogShowing", "(Z)V", "friendHasThisTheme", "", "handler", "code", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "isLogin", "isDeviceUnavailable", "post", "error", "Lcom/yalla/yalla/common/manager/error/CommonError;", "sendThemeFailedNotFriend", "showAccountBanedDialog", "needToMainPage", "showAccountDeletedDialog", "showCoinFreezeDialog", "showCoinNotEnoughQuickDialog", "showCreateRoomDialog", "showCrystalFreezeDialog", "showCrystalNotEnoughDialog", "showDeviceBanedDialog", "showLoginOtherDeviceDialog", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CommonErrorHandler {
    private static boolean outDialogShowing;

    @NotNull
    public static final CommonErrorHandler INSTANCE = new CommonErrorHandler();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.error.CommonErrorHandler$post$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.error.CommonErrorHandler$post$1", f = "CommonErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CommonError $error;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommonError commonError, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$error = commonError;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$error, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CommonErrorHandler.INSTANCE.handler(this.$error.getCode(), this.$error.getMessage());
            return Unit.INSTANCE;
        }
    }

    private CommonErrorHandler() {
    }

    private final void friendHasThisTheme() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        final FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            oo0ooo0.OooOo0(R.string.room_theme_you_friend_has_it);
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            String strOooO0OO = o000O0O0.OooO0OO(R.string.reselect_aother_theme);
            Intrinsics.checkNotNullParameter(strOooO0OO, "<this>");
            String upperCase = strOooO0OO.toUpperCase(o00000O0.OooO00o());
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            oo0ooo0.OooOOo0(upperCase);
            oo0ooo0.OooOo0o(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$friendHasThisTheme$1$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    fragmentActivity.finish();
                }
            });
            oo0ooo0.OooOOO0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handler(int code2, String message) {
        if (code2 == 9990050) {
            showCoinNotEnoughQuickDialog();
        }
        switch (code2) {
            case CommonError.Account_Has_Deleted /* 99909 */:
                showAccountDeletedDialog();
                break;
            case CommonError.He_Is_Not_Your_Friend /* 99910 */:
                sendThemeFailedNotFriend();
                break;
            case CommonError.Friend_Has_This_Theme /* 99911 */:
                friendHasThisTheme();
                break;
            default:
                switch (code2) {
                    case CommonError.Other_Device_Login /* 999001 */:
                        if (isLogin$default(this, false, 1, null)) {
                            showLoginOtherDeviceDialog(message);
                        }
                        break;
                    case CommonError.Coin_Frozen /* 999002 */:
                        showCoinFreezeDialog();
                        break;
                    case CommonError.Crystal_Frozen /* 999003 */:
                        showCrystalFreezeDialog();
                        break;
                    case CommonError.Account_Suspension /* 999004 */:
                        if (!StringsKt.isBlank(message)) {
                            showAccountBanedDialog(message, isLogin$default(this, false, 1, null));
                        } else {
                            showDeviceBanedDialog(message, isLogin$default(this, false, 1, null));
                        }
                        break;
                    case CommonError.Coin_NotEnough /* 999005 */:
                        p.OooO00o(false, true, null);
                        break;
                    case CommonError.Crystal_NotEnough /* 999006 */:
                        showCrystalNotEnoughDialog();
                        break;
                    case CommonError.Device_Suspension /* 999007 */:
                        showDeviceBanedDialog(message, isLogin(true));
                        break;
                    case CommonError.Create_Room_Tips /* 999008 */:
                        showCreateRoomDialog();
                        break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    private final boolean isLogin(boolean isDeviceUnavailable) {
        boolean z;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
            String value = oooOOO.OooOo00().getValue();
            z = value == null || StringsKt.isBlank(value) ? false : true;
        }
        if (z || isDeviceUnavailable) {
            RoomStateManager.INSTANCE.disconnectRoom();
            oooOOO.OooO00o();
        }
        return z;
    }

    public static /* synthetic */ boolean isLogin$default(CommonErrorHandler commonErrorHandler, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return commonErrorHandler.isLogin(z);
    }

    private final void sendThemeFailedNotFriend() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        Context context = null;
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        if ((contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null) != null) {
            Context contextOooO0O1 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O1 == null) {
                Context context2 = o0000O.f2657OooO00o;
                if (context2 != null) {
                    context = context2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                }
                contextOooO0O1 = context;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(contextOooO0O1);
            oo0ooo0.OooOo0(R.string.message_theme_send_failed_not_friend);
            oo0ooo0.OooOOO0();
        }
    }

    private final synchronized void showAccountBanedDialog(String message, final boolean needToMainPage) {
        ApiError1005.ApiError1005Data data;
        ApiError1005.ApiError1005Data data2;
        String endTime;
        ApiError1005.ApiError1005Data data3;
        if (outDialogShowing) {
            return;
        }
        final Activity activityOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            if (!(activityOooO0O0 instanceof FragmentActivity)) {
                return;
            }
            outDialogShowing = true;
            final oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
            s7 s7VarInflate = s7.inflate(LayoutInflater.from(oo0ooo0.f34199OooO00o), oo0ooo0.f34201OooO0OO, false);
            Intrinsics.checkNotNullExpressionValue(s7VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
            oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.common_dialog_suspension_blocked_title));
            LinearLayout linearLayout = s7VarInflate.f50515OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
            oo0ooo0.OooOo00(linearLayout);
            oo0ooo0.OooOOo(false);
            oo0ooo0.OooOO0O(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$showAccountBanedDialog$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CommonErrorHandler.INSTANCE.setOutDialogShowing(false);
                    if (needToMainPage) {
                        MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
                        MainActivity.OooO00o.OooO00o(activityOooO0O0, true, 0, 28);
                    }
                }
            });
            try {
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                final ApiError1005 apiError1005 = (ApiError1005) o0OOO0o.OooO0O0(message, ApiError1005.class);
                String reason = null;
                s7VarInflate.f50517OooO0OO.setText(String.valueOf((apiError1005 == null || (data3 = apiError1005.getData()) == null) ? null : Long.valueOf(data3.getPrettyId())));
                s7VarInflate.f50518OooO0Oo.setText(o000O0O0.OooO0OO(R.string.common_dialog_suspension_blocked_content));
                TextView textView = s7VarInflate.f50521OooO0oO;
                o00O0 o00o1 = o00O0.f48624OooO00o;
                long jOooO0oO = 0;
                if (apiError1005 != null && (data2 = apiError1005.getData()) != null && (endTime = data2.getEndTime()) != null) {
                    jOooO0oO = OooO.OooO0oO(endTime);
                }
                textView.setText(o00o1.OooO0OO(jOooO0oO, "dd/MM/yyyy HH:mm:ss"));
                TextView textView2 = s7VarInflate.f50520OooO0o0;
                if (apiError1005 != null && (data = apiError1005.getData()) != null) {
                    reason = data.getReason();
                }
                textView2.setText(reason);
                String strOooO0OO = o000O0O0.OooO0OO(R.string.common_dialog_suspension_blocked_request);
                SpannableString spannableString = new SpannableString(strOooO0OO);
                spannableString.setSpan(new UnderlineSpan(), 0, strOooO0OO.length(), 0);
                s7VarInflate.f50519OooO0o.setText(spannableString);
                s7VarInflate.f50519OooO0o.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.common.manager.error.OooO0O0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommonErrorHandler.m285showAccountBanedDialog$lambda6$lambda5$lambda3(needToMainPage, activityOooO0O0, oo0ooo0, apiError1005, view);
                    }
                });
                s7VarInflate.f50516OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.common.manager.error.OooO00o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommonErrorHandler.m286showAccountBanedDialog$lambda6$lambda5$lambda4(needToMainPage, activityOooO0O0, oo0ooo0, view);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
            oo0ooo0.OooOOO0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showAccountBanedDialog$lambda-6$lambda-5$lambda-3, reason: not valid java name */
    public static final void m285showAccountBanedDialog$lambda6$lambda5$lambda3(boolean z, Activity activity, oo0oOO0 this_apply, ApiError1005 apiError1005, View view) {
        ApiError1005.ApiError1005Data data;
        ApiError1005.ApiError1005Data data2;
        ApiError1005.ApiError1005Data data3;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        o0O00000.OooO0OO("Ban_warning_appeal");
        boolean z2 = false;
        if (z) {
            MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
            MainActivity.OooO00o.OooO00o(activity, true, 0, 28);
        }
        outDialogShowing = false;
        this_apply.OooO0Oo();
        if (apiError1005 != null && (data3 = apiError1005.getData()) != null && data3.getIsInLoginShow()) {
            z2 = true;
        }
        long userId = 0;
        if (z2) {
            Observable<Object> observable = LiveEventBus.get("SHOW_APPEAL_DIALOG");
            ApiError1005.ApiError1005Data data4 = apiError1005.getData();
            Long lValueOf = Long.valueOf(data4 != null ? data4.getPrettyId() : 0L);
            ApiError1005.ApiError1005Data data5 = apiError1005.getData();
            observable.post(new Pair(lValueOf, Long.valueOf(data5 != null ? data5.getUserId() : 0L)));
            return;
        }
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            long prettyId = (apiError1005 == null || (data2 = apiError1005.getData()) == null) ? 0L : data2.getPrettyId();
            if (apiError1005 != null && (data = apiError1005.getData()) != null) {
                userId = data.getUserId();
            }
            new oO0O0Oo0(fragmentActivity, prettyId, userId).OooOO0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showAccountBanedDialog$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    public static final void m286showAccountBanedDialog$lambda6$lambda5$lambda4(boolean z, Activity activity, oo0oOO0 this_apply, View view) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        if (z) {
            MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
            MainActivity.OooO00o.OooO00o(activity, true, 0, 28);
        }
        outDialogShowing = false;
        this_apply.OooO0Oo();
    }

    private final void showAccountDeletedDialog() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.room_theme_error_account_canceled));
            oo0ooo0.OooOOO0();
        }
    }

    private final void showCoinFreezeDialog() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            oo0ooo0.OooOo0(R.string.money_freeze);
            oo0ooo0.OooOOO0();
        }
    }

    private final void showCoinNotEnoughQuickDialog() {
        p.OooO00o(true, true, null);
    }

    private final void showCreateRoomDialog() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        final FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            oo0ooo0.OooOo0(R.string.message_theme_accept_failed_not_room);
            oo0ooo0.OooOOOo(R.string.message_theme_error_to_create_room);
            oo0ooo0.OooOo0o(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$showCreateRoomDialog$1$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CreateRoomActivity.f22774Ooooooo.OooO00o(fragmentActivity);
                }
            });
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            oo0ooo0.OooOOO0();
        }
    }

    private final void showCrystalFreezeDialog() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            oo0ooo0.OooOo0(R.string.money_freeze);
            oo0ooo0.OooOOO0();
        }
    }

    private final void showCrystalNotEnoughDialog() {
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        final FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
        if (fragmentActivity != null) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            oo0ooo0.OooOo0(R.string.error_113);
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            oo0ooo0.OooOo0o(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$showCrystalNotEnoughDialog$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    booleanRef.element = true;
                    TaskActivity.f22061o00Oo0.OooO00o(fragmentActivity);
                }
            });
            Function0<Unit> listener = new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$showCrystalNotEnoughDialog$1$1$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (booleanRef.element) {
                        return;
                    }
                    DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog().postPut(DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, true, true);
                }
            };
            Intrinsics.checkNotNullParameter(oo0ooo0, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Lazy lazy = LazyKt.lazy(o000O.f42978Oooo0o);
            ((List) lazy.getValue()).add(listener);
            oo0ooo0.OooOO0O(new p522o0o0O0o.o000O0O0(lazy));
            oo0ooo0.OooOOO0();
        }
    }

    private final synchronized void showDeviceBanedDialog(String message, final boolean needToMainPage) {
        if (outDialogShowing) {
            return;
        }
        final Activity activityOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            if (!(activityOooO0O0 instanceof FragmentActivity)) {
                return;
            }
            outDialogShowing = true;
            oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
            if (StringsKt.isBlank(message)) {
                message = o000O0O0.OooO0OO(R.string.account_closure);
            }
            oo0ooo0.OooOo0O(message);
            oo0ooo0.OooO0oO(false);
            oo0ooo0.OooOO0O(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$showDeviceBanedDialog$1$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CommonErrorHandler.INSTANCE.setOutDialogShowing(false);
                    if (needToMainPage) {
                        MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
                        MainActivity.OooO00o.OooO00o(activityOooO0O0, true, 0, 28);
                    }
                }
            });
            oo0ooo0.OooOOO0();
        }
    }

    private final void showLoginOtherDeviceDialog(String message) {
        final Activity activityOooO0O0;
        if (outDialogShowing || (activityOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0()) == null || !(activityOooO0O0 instanceof FragmentActivity)) {
            return;
        }
        boolean z = true;
        outDialogShowing = true;
        oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
        if (message != null && !StringsKt.isBlank(message)) {
            z = false;
        }
        if (z) {
            message = o000O0O0.OooO0OO(R.string.login_err);
        }
        oo0ooo0.OooOo0O(message);
        oo0ooo0.OooO0oO(false);
        oo0ooo0.OooOO0O(new Function0<Unit>() { // from class: com.yalla.yalla.common.manager.error.CommonErrorHandler$showLoginOtherDeviceDialog$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CommonErrorHandler.INSTANCE.setOutDialogShowing(false);
                MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
                MainActivity.OooO00o.OooO00o(activityOooO0O0, true, 0, 28);
            }
        });
        oo0ooo0.OooOOO0();
    }

    public static /* synthetic */ void showLoginOtherDeviceDialog$default(CommonErrorHandler commonErrorHandler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        commonErrorHandler.showLoginOtherDeviceDialog(str);
    }

    public final boolean getOutDialogShowing() {
        return outDialogShowing;
    }

    public final void post(@NotNull CommonError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            handler(error.getCode(), error.getMessage());
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new AnonymousClass1(error, null), 2, null);
        }
    }

    public final void setOutDialogShowing(boolean z) {
        outDialogShowing = z;
    }
}
