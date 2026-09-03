package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o00oO0o;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$deleteAccount$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$getAccountConfirmInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$untieAccountBind$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$verifyThirdAccount$$inlined$call$1;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.BindingInfo;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO000;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\bA\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J,\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\bJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R+\u0010*\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R+\u00101\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00105\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R+\u00109\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R+\u0010=\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R+\u0010A\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R+\u0010C\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\u001b\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R+\u0010F\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001b\u001a\u0004\bF\u0010#\"\u0004\bG\u0010%R+\u0010I\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010%R+\u0010L\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u001b\u001a\u0004\bL\u0010#\"\u0004\bM\u0010%R\"\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R$\u0010R\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/LinkedAccountsVM;", "Lo0Oo0/OooOO0;", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/AccountBindInfo;", "syncLinkedAccount", "", "token", "", "type", "twitterSecretOrInsUserId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/AccountBindResult;", "thirdAccountBind", "bindType", "Lo0OoO0Oo/o00OO000;", "", "untieAccountBind", "verifyThirdAccount", "Lcom/yalla/yalla/model/AccountConfirmInfo;", "getAccountConfirmInfo", "Lcom/yalla/yalla/model/DeleteAccountParamsModel;", "deleteAccountParams", "deleteAccount", "Landroidx/compose/runtime/MutableState;", "", "showDeleteDialog", "Landroidx/compose/runtime/MutableState;", "getShowDeleteDialog", "()Landroidx/compose/runtime/MutableState;", "setShowDeleteDialog", "(Landroidx/compose/runtime/MutableState;)V", "<set-?>", "isBindFacebook$delegate", "isBindFacebook", "()Z", "setBindFacebook", "(Z)V", "isBindYallaChat$delegate", "isBindYallaChat", "setBindYallaChat", "isBindTwitter$delegate", "isBindTwitter", "setBindTwitter", "bindPhoneInfo$delegate", "getBindPhoneInfo", "()Ljava/lang/String;", "setBindPhoneInfo", "(Ljava/lang/String;)V", "bindPhoneInfo", "bindFacebookInfo$delegate", "getBindFacebookInfo", "setBindFacebookInfo", "bindFacebookInfo", "bindYallaChatInfo$delegate", "getBindYallaChatInfo", "setBindYallaChatInfo", "bindYallaChatInfo", "bindTwitterInfo$delegate", "getBindTwitterInfo", "setBindTwitterInfo", "bindTwitterInfo", "bindWeChatInfo$delegate", "getBindWeChatInfo", "setBindWeChatInfo", "bindWeChatInfo", "isHideFb$delegate", "isHideFb", "setHideFb", "isHidePh$delegate", "isHidePh", "setHidePh", "isHideYc$delegate", "isHideYc", "setHideYc", "isHideTt$delegate", "isHideTt", "setHideTt", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "Ljava/lang/String;", "getCountryCode", "setCountryCode", "accountBindInfo", "Lcom/yalla/yalla/model/AccountBindInfo;", "getAccountBindInfo", "()Lcom/yalla/yalla/model/AccountBindInfo;", "setAccountBindInfo", "(Lcom/yalla/yalla/model/AccountBindInfo;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLinkedAccountsVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsVM.kt\ncom/yalla/yalla/ui/vm/account/LinkedAccountsVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,105:1\n81#2:106\n107#2,2:107\n81#2:109\n107#2,2:110\n81#2:112\n107#2,2:113\n81#2:115\n107#2,2:116\n81#2:118\n107#2,2:119\n81#2:121\n107#2,2:122\n81#2:124\n107#2,2:125\n81#2:127\n107#2,2:128\n81#2:130\n107#2,2:131\n81#2:133\n107#2,2:134\n81#2:136\n107#2,2:137\n81#2:139\n107#2,2:140\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsVM.kt\ncom/yalla/yalla/ui/vm/account/LinkedAccountsVM\n*L\n25#1:106\n25#1:107,2\n26#1:109\n26#1:110,2\n27#1:112\n27#1:113,2\n29#1:115\n29#1:116,2\n30#1:118\n30#1:119,2\n31#1:121\n31#1:122,2\n32#1:124\n32#1:125,2\n33#1:127\n33#1:128,2\n34#1:130\n34#1:131,2\n35#1:133\n35#1:134,2\n36#1:136\n36#1:137,2\n37#1:139\n37#1:140,2\n*E\n"})
public final class LinkedAccountsVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @Nullable
    private AccountBindInfo accountBindInfo;

    /* JADX INFO: renamed from: bindFacebookInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bindFacebookInfo;

    /* JADX INFO: renamed from: bindPhoneInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bindPhoneInfo;

    /* JADX INFO: renamed from: bindTwitterInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bindTwitterInfo;

    /* JADX INFO: renamed from: bindWeChatInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bindWeChatInfo;

    /* JADX INFO: renamed from: bindYallaChatInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bindYallaChatInfo;

    @NotNull
    private String countryCode;

    /* JADX INFO: renamed from: isBindFacebook$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isBindFacebook;

    /* JADX INFO: renamed from: isBindTwitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isBindTwitter;

    /* JADX INFO: renamed from: isBindYallaChat$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isBindYallaChat;

    /* JADX INFO: renamed from: isHideFb$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isHideFb;

    /* JADX INFO: renamed from: isHidePh$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isHidePh;

    /* JADX INFO: renamed from: isHideTt$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isHideTt;

    /* JADX INFO: renamed from: isHideYc$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isHideYc;

    @NotNull
    private MutableState<Boolean> showDeleteDialog;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$untieAccountBind$1$1", f = "LinkedAccountsVM.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f31067OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<Object> f31068OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31069OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31070OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00OO000<Object> o00oo001, int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f31068OooO0o = o00oo001;
            this.f31070OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f31068OooO0o, this.f31070OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000<Object> o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31069OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22385OooO00o;
                o00OO000<Object> o00oo002 = this.f31068OooO0o;
                this.f31067OooO0Oo = o00oo002;
                this.f31069OooO0o0 = 1;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$untieAccountBind$$inlined$call$1(accountRepo, null, this.f31070OooO0oO), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f31067OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$deleteAccount$1$1", f = "LinkedAccountsVM.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f31071OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<String> f31072OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31073OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountParamsModel f31074OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31075OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO000<String> o00oo001, DeleteAccountParamsModel deleteAccountParamsModel, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31072OooO0o = o00oo001;
            this.f31074OooO0oO = deleteAccountParamsModel;
            this.f31075OooO0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31072OooO0o, this.f31074OooO0oO, this.f31075OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31073OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22385OooO00o;
                DeleteAccountParamsModel deleteAccountParamsModel = this.f31074OooO0oO;
                int reasonTypeOne = deleteAccountParamsModel != null ? deleteAccountParamsModel.getReasonTypeOne() : 0;
                Integer reasonTypeTwo = deleteAccountParamsModel != null ? deleteAccountParamsModel.getReasonTypeTwo() : null;
                o00OO000<String> o00oo002 = this.f31072OooO0o;
                this.f31071OooO0Oo = o00oo002;
                this.f31073OooO0o0 = 1;
                String str = this.f31075OooO0oo;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$deleteAccount$$inlined$call$1(accountRepo, null, reasonTypeOne, reasonTypeTwo, str), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f31071OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$getAccountConfirmInfo$1$1", f = "LinkedAccountsVM.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f31076OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<AccountConfirmInfo> f31077OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31078OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OO000<AccountConfirmInfo> o00oo001, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31077OooO0o = o00oo001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31077OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31078OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22385OooO00o;
                o00OO000<AccountConfirmInfo> o00oo002 = this.f31077OooO0o;
                this.f31076OooO0Oo = o00oo002;
                this.f31078OooO0o0 = 1;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$getAccountConfirmInfo$$inlined$call$1(accountRepo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f31076OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$syncLinkedAccount$1", f = "LinkedAccountsVM.kt", i = {0, 1, 1}, l = {44, 45}, m = "invokeSuspend", n = {"$this$jobLiveData", "$this$jobLiveData", "apiResult"}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0OO extends SuspendLambda implements Function2<o00OO0O0<ApiResult<AccountBindInfo>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f31079OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31080OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31081OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$syncLinkedAccount$1$1", f = "LinkedAccountsVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nLinkedAccountsVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsVM.kt\ncom/yalla/yalla/ui/vm/account/LinkedAccountsVM$syncLinkedAccount$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
        public static final class OooO00o extends SuspendLambda implements Function2<AccountBindInfo, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31083OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountsVM f31084OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LinkedAccountsVM linkedAccountsVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31084OooO0o0 = linkedAccountsVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31084OooO0o0, continuation);
                oooO00o.f31083OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountBindInfo accountBindInfo, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(accountBindInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
            /* JADX WARN: Code duplicated, block: B:61:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:78:0x012c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                String account;
                String account2;
                String account3;
                String account4;
                Object next;
                Object next2;
                Object next3;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                AccountBindInfo accountBindInfo = (AccountBindInfo) this.f31083OooO0Oo;
                LinkedAccountsVM linkedAccountsVM = this.f31084OooO0o0;
                linkedAccountsVM.setAccountBindInfo(accountBindInfo);
                if (accountBindInfo == null) {
                    return Unit.INSTANCE;
                }
                String str = "";
                linkedAccountsVM.setBindPhoneInfo(accountBindInfo.getIsPh().length() > 4 ? accountBindInfo.getIsPh() : "");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooOo0().postValue(Boxing.boxBoolean(!StringsKt.isBlank(linkedAccountsVM.getBindPhoneInfo())));
                linkedAccountsVM.setBindFacebook((StringsKt.isBlank(accountBindInfo.getIsFb()) ^ true) && !Intrinsics.areEqual(accountBindInfo.getIsFb(), AppEventsConstants.EVENT_PARAM_VALUE_NO));
                linkedAccountsVM.setBindYallaChat((StringsKt.isBlank(accountBindInfo.getIsYc()) ^ true) && !Intrinsics.areEqual(accountBindInfo.getIsYc(), AppEventsConstants.EVENT_PARAM_VALUE_NO));
                linkedAccountsVM.setBindTwitter((StringsKt.isBlank(accountBindInfo.getIsTt()) ^ true) && !Intrinsics.areEqual(accountBindInfo.getIsTt(), AppEventsConstants.EVENT_PARAM_VALUE_NO));
                ArrayList<BindingInfo> bindingInfo = accountBindInfo.getBindingInfo();
                Object obj2 = null;
                if (bindingInfo != null) {
                    Iterator<T> it = bindingInfo.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!(((BindingInfo) next3).getSources() == 4));
                    BindingInfo bindingInfo2 = (BindingInfo) next3;
                    if (bindingInfo2 == null || (account = bindingInfo2.getAccount()) == null) {
                        account = "";
                    }
                } else {
                    account = "";
                }
                linkedAccountsVM.setBindFacebookInfo(account);
                ArrayList<BindingInfo> bindingInfo3 = accountBindInfo.getBindingInfo();
                if (bindingInfo3 != null) {
                    Iterator<T> it2 = bindingInfo3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!(((BindingInfo) next2).getSources() == 12));
                    BindingInfo bindingInfo4 = (BindingInfo) next2;
                    if (bindingInfo4 == null || (account2 = bindingInfo4.getAccount()) == null) {
                        account2 = "";
                    }
                } else {
                    account2 = "";
                }
                linkedAccountsVM.setBindYallaChatInfo(account2);
                ArrayList<BindingInfo> bindingInfo5 = accountBindInfo.getBindingInfo();
                if (bindingInfo5 != null) {
                    Iterator<T> it3 = bindingInfo5.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!(((BindingInfo) next).getSources() == 9));
                    BindingInfo bindingInfo6 = (BindingInfo) next;
                    if (bindingInfo6 == null || (account3 = bindingInfo6.getAccount()) == null) {
                        account3 = "";
                    }
                } else {
                    account3 = "";
                }
                linkedAccountsVM.setBindTwitterInfo(account3);
                ArrayList<BindingInfo> bindingInfo7 = accountBindInfo.getBindingInfo();
                if (bindingInfo7 != null) {
                    for (Object obj3 : bindingInfo7) {
                        if (((BindingInfo) obj3).getSources() == 5) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    BindingInfo bindingInfo8 = (BindingInfo) obj2;
                    if (bindingInfo8 != null && (account4 = bindingInfo8.getAccount()) != null) {
                        str = account4;
                    }
                }
                linkedAccountsVM.setBindWeChatInfo(str);
                linkedAccountsVM.setCountryCode(accountBindInfo.getCountryCode());
                linkedAccountsVM.setHideFb(accountBindInfo.getIsHideFb());
                linkedAccountsVM.setHidePh(accountBindInfo.getIsHidePh());
                linkedAccountsVM.setHideYc(accountBindInfo.getIsHideYc());
                linkedAccountsVM.setHideTt(accountBindInfo.getIsHideTt());
                return Unit.INSTANCE;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = LinkedAccountsVM.this.new OooO0OO(continuation);
            oooO0OO.f31080OooO0o = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<AccountBindInfo>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31081OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    o00oo0o1 = (o00OO0O0) this.f31080OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apiResult = this.f31079OooO0Oo;
                    o00oo0o1 = (o00OO0O0) this.f31080OooO0o;
                    ResultKt.throwOnFailure(obj);
                }
                o00oo0o1.postValue(apiResult);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31080OooO0o;
            AccountRepo accountRepo = AccountRepo.f22385OooO00o;
            this.f31080OooO0o = o00oo0o2;
            this.f31081OooO0o0 = 1;
            accountRepo.getClass();
            Object objOooO0Oo = AccountRepo.OooO0Oo(this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00oo0o1 = o00oo0o2;
            obj = objOooO0Oo;
            ApiResult apiResult2 = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(LinkedAccountsVM.this, null);
            this.f31080OooO0o = o00oo0o1;
            this.f31079OooO0Oo = apiResult2;
            this.f31081OooO0o0 = 2;
            if (o00O0O.OooO0OO(apiResult2, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = apiResult2;
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$thirdAccountBind$1", f = "LinkedAccountsVM.kt", i = {}, l = {68, 68}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<AccountBindResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31085OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31086OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31087OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31088OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31089OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.f31086OooO0o = str;
            this.f31088OooO0oO = i;
            this.f31089OooO0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            int i = this.f31088OooO0oO;
            OooO0o oooO0o = new OooO0o(this.f31086OooO0o, this.f31089OooO0oo, i, continuation);
            oooO0o.f31087OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<AccountBindResult>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31085OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31087OooO0o0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f31087OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22385OooO00o;
            this.f31087OooO0o0 = liveDataScope;
            this.f31085OooO0Oo = 1;
            accountRepo.getClass();
            obj = AccountRepo.OooO0OO(this.f31086OooO0o, this.f31089OooO0oo, this.f31088OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31087OooO0o0 = null;
            this.f31085OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LinkedAccountsVM$verifyThirdAccount$1$1", f = "LinkedAccountsVM.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f31090OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00OO000 f31091OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO000<String> f31092OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31093OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31094OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31095OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00OO000<String> o00oo001, int i, String str, String str2, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f31092OooO0o = o00oo001;
            this.f31094OooO0oO = i;
            this.f31095OooO0oo = str;
            this.f31090OooO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f31092OooO0o, this.f31094OooO0oO, this.f31095OooO0oo, this.f31090OooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00OO000 o00oo001;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31093OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22385OooO00o;
                o00OO000<String> o00oo002 = this.f31092OooO0o;
                this.f31091OooO0Oo = o00oo002;
                this.f31093OooO0o0 = 1;
                String str = this.f31095OooO0oo;
                String str2 = this.f31090OooO;
                int i2 = this.f31094OooO0oO;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$verifyThirdAccount$$inlined$call$1(accountRepo, null, i2, str, str2), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo001 = o00oo002;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo001 = this.f31091OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00oo001.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    public LinkedAccountsVM() {
        Boolean bool = Boolean.FALSE;
        this.showDeleteDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isBindFacebook = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isBindYallaChat = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isBindTwitter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.bindPhoneInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.bindFacebookInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.bindYallaChatInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.bindTwitterInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.bindWeChatInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.isHideFb = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isHidePh = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isHideYc = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isHideTt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.countryCode = "";
    }

    @NotNull
    public final o00OO000<String> deleteAccount(@Nullable DeleteAccountParamsModel deleteAccountParams) {
        o00OO000<String> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(o00oo001, deleteAccountParams, (deleteAccountParams == null || deleteAccountParams.getInputText() == null) ? null : oOO0OOO.OooO0O0(deleteAccountParams.getInputText()), null), 3, null);
        return o00oo001;
    }

    @Nullable
    public final AccountBindInfo getAccountBindInfo() {
        return this.accountBindInfo;
    }

    @NotNull
    public final o00OO000<AccountConfirmInfo> getAccountConfirmInfo() {
        o00OO000<AccountConfirmInfo> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(o00oo001, null), 3, null);
        return o00oo001;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getBindFacebookInfo() {
        return (String) this.bindFacebookInfo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getBindPhoneInfo() {
        return (String) this.bindPhoneInfo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getBindTwitterInfo() {
        return (String) this.bindTwitterInfo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getBindWeChatInfo() {
        return (String) this.bindWeChatInfo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getBindYallaChatInfo() {
        return (String) this.bindYallaChatInfo.getValue();
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final MutableState<Boolean> getShowDeleteDialog() {
        return this.showDeleteDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBindFacebook() {
        return ((Boolean) this.isBindFacebook.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBindTwitter() {
        return ((Boolean) this.isBindTwitter.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBindYallaChat() {
        return ((Boolean) this.isBindYallaChat.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHideFb() {
        return ((Boolean) this.isHideFb.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHidePh() {
        return ((Boolean) this.isHidePh.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHideTt() {
        return ((Boolean) this.isHideTt.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isHideYc() {
        return ((Boolean) this.isHideYc.getValue()).booleanValue();
    }

    public final void setAccountBindInfo(@Nullable AccountBindInfo accountBindInfo) {
        this.accountBindInfo = accountBindInfo;
    }

    public final void setBindFacebook(boolean z) {
        this.isBindFacebook.setValue(Boolean.valueOf(z));
    }

    public final void setBindFacebookInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindFacebookInfo.setValue(str);
    }

    public final void setBindPhoneInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindPhoneInfo.setValue(str);
    }

    public final void setBindTwitter(boolean z) {
        this.isBindTwitter.setValue(Boolean.valueOf(z));
    }

    public final void setBindTwitterInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindTwitterInfo.setValue(str);
    }

    public final void setBindWeChatInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindWeChatInfo.setValue(str);
    }

    public final void setBindYallaChat(boolean z) {
        this.isBindYallaChat.setValue(Boolean.valueOf(z));
    }

    public final void setBindYallaChatInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindYallaChatInfo.setValue(str);
    }

    public final void setCountryCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryCode = str;
    }

    public final void setHideFb(boolean z) {
        this.isHideFb.setValue(Boolean.valueOf(z));
    }

    public final void setHidePh(boolean z) {
        this.isHidePh.setValue(Boolean.valueOf(z));
    }

    public final void setHideTt(boolean z) {
        this.isHideTt.setValue(Boolean.valueOf(z));
    }

    public final void setHideYc(boolean z) {
        this.isHideYc.setValue(Boolean.valueOf(z));
    }

    public final void setShowDeleteDialog(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showDeleteDialog = mutableState;
    }

    @NotNull
    public final o00OO0O0<ApiResult<AccountBindInfo>> syncLinkedAccount() {
        return o00O.OooO00o(this, new OooO0OO(null));
    }

    @NotNull
    public final LiveData<ApiResult<AccountBindResult>> thirdAccountBind(@NotNull String token, int type, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(token, "token");
        return o00oO0o.OooO00o(new OooO0o(token, twitterSecretOrInsUserId, type, null));
    }

    @NotNull
    public final o00OO000<Object> untieAccountBind(int bindType) {
        o00OO000<Object> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO(o00oo001, bindType, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final o00OO000<String> verifyThirdAccount(int type, @NotNull String token, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(token, "token");
        o00OO000<String> o00oo001 = new o00OO000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0(o00oo001, type, token, twitterSecretOrInsUserId, null), 3, null);
        return o00oo001;
    }
}
