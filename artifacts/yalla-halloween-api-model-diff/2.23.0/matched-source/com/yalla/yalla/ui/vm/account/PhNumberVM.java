package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.data.repository.LoginRepo$getCountry$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.CountryItemData;
import com.yalla.yalla.model.user.CountryItemList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.e;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;
import p579o0oOoo.oO0OoOO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/PhNumberVM;", "Lo0Oo00oO/o0O0O00;", "Lcom/yalla/yalla/data/constant/ClientCodeType;", "type", "", "initPhoneAreaCodeInfo", "", "phone", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "checkPhoneRegister", "savePhoneInfo", "Lcom/yalla/yalla/model/user/CountryItemData;", "data", "saveCountryData", "", "source", "Lcom/yalla/yalla/model/user/CountryItemList;", "getCountry", "<set-?>", "phoneAreaCodeInfo", "Lcom/yalla/yalla/model/user/CountryItemData;", "getPhoneAreaCodeInfo", "()Lcom/yalla/yalla/model/user/CountryItemData;", "currentType", "Lcom/yalla/yalla/data/constant/ClientCodeType;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class PhNumberVM extends o0O0O00 {
    public static final int $stable = 8;

    @Nullable
    private ClientCodeType currentType;

    @NotNull
    private CountryItemData phoneAreaCodeInfo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClientCodeType.values().length];
            try {
                iArr[ClientCodeType.Change.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientCodeType.BingingPhone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientCodeType.Register.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientCodeType.Login.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PhNumberVM$checkPhoneRegister$1", f = "PhNumberVM.kt", i = {0}, l = {66, 67}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31687OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31689OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31690OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31691OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31690OooO0oO = str;
            this.f31691OooO0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = PhNumberVM.this.new OooO0O0(this.f31690OooO0oO, this.f31691OooO0oo, continuation);
            oooO0O0.f31689OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ClientCodeType clientCodeType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31687OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31689OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31689OooO0o0;
            int source = 0;
            List listListOf = CollectionsKt.listOf((Object[]) new ClientCodeType[]{ClientCodeType.Register, ClientCodeType.BingingPhone, ClientCodeType.Change});
            PhNumberVM phNumberVM = PhNumberVM.this;
            if (CollectionsKt.contains(listListOf, phNumberVM.currentType) && (clientCodeType = phNumberVM.currentType) != null) {
                source = clientCodeType.getSource();
            }
            e eVar = e.f44768OooO00o;
            String str = this.f31690OooO0oO;
            String str2 = this.f31691OooO0oo;
            String isoCode = phNumberVM.getPhoneAreaCodeInfo().getIsoCode();
            this.f31689OooO0o0 = liveDataScope;
            this.f31687OooO0Oo = 1;
            obj = eVar.OooO00o(str, str2, isoCode, source, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31689OooO0o0 = null;
            this.f31687OooO0Oo = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PhNumberVM$getCountry$1", f = "PhNumberVM.kt", i = {0}, l = {88, 89}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<CountryItemList>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31692OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31693OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31694OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31693OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31693OooO0o, continuation);
            oooO0OO.f31694OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<CountryItemList>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31692OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31694OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31694OooO0o0;
            this.f31694OooO0o0 = liveDataScope;
            this.f31692OooO0Oo = 1;
            String str = o0000O.f44166o0000oo;
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str, "url", str, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(this.f31693OooO0o), "source");
            obj = OooOOO.OooO0Oo(new LoginRepo$getCountry$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31694OooO0o0 = null;
            this.f31692OooO0Oo = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public PhNumberVM() {
        CountryItemData countryItemDataOooO0O0 = oO0OoOO0.OooO0O0(new oO0OoOO0());
        countryItemDataOooO0O0.setIcon(OooO.OooO00o(String.valueOf(countryItemDataOooO0O0.getId())));
        this.phoneAreaCodeInfo = countryItemDataOooO0O0;
    }

    public static /* synthetic */ LiveData getCountry$default(PhNumberVM phNumberVM, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return phNumberVM.getCountry(i);
    }

    public static /* synthetic */ void initPhoneAreaCodeInfo$default(PhNumberVM phNumberVM, ClientCodeType clientCodeType, int i, Object obj) {
        if ((i & 1) != 0) {
            clientCodeType = ClientCodeType.Register;
        }
        phNumberVM.initPhoneAreaCodeInfo(clientCodeType);
    }

    public static /* synthetic */ void savePhoneInfo$default(PhNumberVM phNumberVM, String str, String str2, ClientCodeType clientCodeType, int i, Object obj) {
        if ((i & 4) != 0) {
            clientCodeType = phNumberVM.currentType;
        }
        phNumberVM.savePhoneInfo(str, str2, clientCodeType);
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> checkPhoneRegister(@NotNull String phone, @NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return o00oO0o.OooO00o(new OooO0O0(phone, countryCode, null));
    }

    @NotNull
    public final LiveData<ApiResult<CountryItemList>> getCountry(int source) {
        return o00oO0o.OooO00o(new OooO0OO(source, null));
    }

    @NotNull
    public final CountryItemData getPhoneAreaCodeInfo() {
        return this.phoneAreaCodeInfo;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public final void initPhoneAreaCodeInfo(@Nullable ClientCodeType type) {
        int iOooO0OO;
        this.currentType = type;
        int i = type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            iOooO0OO = 0;
        } else if (i == 3) {
            iOooO0OO = o00Oo0.OooO00o().OooO0OO("signCountryId", 0);
        } else if (i != 4) {
            iOooO0OO = 0;
        } else {
            iOooO0OO = o00Oo0.OooO00o().OooO0OO("loginCountryId", 0);
        }
        CountryItemData countryItemDataOooO00o = new oO0OoOO0().OooO00o(iOooO0OO, type == ClientCodeType.Register || type == ClientCodeType.BingingPhone);
        countryItemDataOooO00o.setIcon(OooO.OooO00o(String.valueOf(countryItemDataOooO00o.getId())));
        this.phoneAreaCodeInfo = countryItemDataOooO00o;
    }

    public final void saveCountryData(@NotNull CountryItemData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.phoneAreaCodeInfo = data;
    }

    public final void savePhoneInfo(@NotNull String phone, @NotNull String countryCode, @Nullable ClientCodeType type) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String value = phone.subSequence(countryCode.length(), phone.length()).toString();
        if (type == ClientCodeType.Register) {
            o00Oo0.OooO00o().OooO0oO(this.phoneAreaCodeInfo.getId(), "signCountryId");
            o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
            o00oooOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            o00oooOooO00o.OooO("signInNumber", value);
            return;
        }
        o00Oo0.OooO00o().OooO0oO(this.phoneAreaCodeInfo.getId(), "loginCountryId");
        o00Ooo o00oooOooO00o2 = o00Oo0.OooO00o();
        o00oooOooO00o2.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        o00oooOooO00o2.OooO("loginPhoneNumber", value);
    }
}
