package p577o0oOoOo;

import android.app.Application;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.common.support.apm.Sailfish;
import com.common.support.netdiagwrapper.Address;
import com.common.support.netdiagwrapper.NetDiagnosis;
import com.common.support.netdiagwrapper.NetDiagnosisResult;
import com.common.support.networkstate.NetworkStateUtil;
import com.common.support.sailfish_commons.logmodels.NetModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p488o0o00O0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nNetworkTestVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkTestVM.kt\ncom/yalla/yalla/ui/vm/NetworkTestVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final class o0O extends AndroidViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Address> f56497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Address> f56498OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<Address> f56499OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f56500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Float> f56501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public NetDiagnosisResult f56502OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public String f56503OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f56504OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<NetDiagnosis> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetDiagnosis invoke() {
            NetDiagnosis netDiagnosis = new NetDiagnosis();
            o0O o0o = o0O.this;
            return netDiagnosis.hostResolution(o0o.f56497OooO00o).ping(o0o.f56497OooO00o).tcpPing(o0o.f56498OooO0O0).traceRoute(o0o.f56499OooO0OO, 10).publicIp().dns().downStreamSpeed().upStreamSpeed();
        }
    }

    @SourceDebugExtension({"SMAP\nNetworkTestVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkTestVM.kt\ncom/yalla/yalla/ui/vm/NetworkTestVM$startTest$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
    public static final class OooO0O0 implements NetDiagnosis.Callback {

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.NetworkTestVM$startTest$1$onProgress$1", f = "NetworkTestVM.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f56507OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ float f56508OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o0O f56509OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0O o0o, float f, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f56509OooO0o0 = o0o;
                this.f56508OooO0o = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f56509OooO0o0, this.f56508OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f56507OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<Float> mutableSharedFlow = this.f56509OooO0o0.f56501OooO0o;
                    Float fBoxFloat = Boxing.boxFloat(this.f56508OooO0o);
                    this.f56507OooO0Oo = 1;
                    if (mutableSharedFlow.emit(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0oOoOo.o0O$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.NetworkTestVM$startTest$1$onResult$1", f = "NetworkTestVM.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0487OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f56510OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o0O f56511OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0487OooO0O0(o0O o0o, Continuation<? super C0487OooO0O0> continuation) {
                super(2, continuation);
                this.f56511OooO0o0 = o0o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0487OooO0O0(this.f56511OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0487OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f56510OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow<Float> mutableSharedFlow = this.f56511OooO0o0.f56501OooO0o;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    this.f56510OooO0Oo = 1;
                    if (mutableSharedFlow.emit(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0O0() {
        }

        @Override // com.common.support.netdiagwrapper.NetDiagnosis.Callback
        public final void onProgress(int i, int i2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            o0O o0o = o0O.this;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(o0o), null, null, new OooO00o(o0o, i / 100.0f, null), 3, null);
        }

        @Override // com.common.support.netdiagwrapper.NetDiagnosis.Callback
        public final void onResult(@NotNull NetDiagnosisResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            o0O o0o = o0O.this;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(o0o), null, null, new C0487OooO0O0(o0o, null), 3, null);
            o0o.f56502OooO0o0 = result;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String string = o0O00oO0.OooOOo0().toString();
            String strValueOf = o0o.f56503OooO0oO;
            if (StringsKt.isBlank(strValueOf)) {
                strValueOf = String.valueOf(o0O00oO0.OooO0OO().getValue());
            }
            NetModel netModel = result.toNetModel(string, strValueOf, oo0o0Oo.OooO0Oo(), NetworkStateUtil.INSTANCE.networkType(o0o.getApplication()).name());
            o0o.f56500OooO0Oo.setValue(2);
            Lazy lazy = OooOO0.f48912OooO00o;
            Intrinsics.checkNotNullParameter(netModel, "netModel");
            Sailfish sailfish = Sailfish.INSTANCE;
            sailfish.writeNetLog(netModel);
            sailfish.flush();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(@NotNull Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.f56497OooO00o = CollectionsKt.listOf((Object[]) new Address[]{new Address("apiv2.yalla.live", null, 2, null), new Address("room03.yalla.live", null, 2, null), new Address("dtslave.yalla.live", null, 2, null), new Address("file.yalla.live", null, 2, null), new Address("up-as0.qiniup.com", null, 2, null)});
        this.f56498OooO0O0 = CollectionsKt.listOf((Object[]) new Address[]{new Address("www.1688.com", "443"), new Address("apiv2.yalla.live", "443"), new Address("room03.yalla.live", "7000"), new Address("dtslave.yalla.live", "7410"), new Address("file.yalla.live", "443"), new Address("up-as0.qiniup.com", "443")});
        this.f56499OooO0OO = CollectionsKt.listOf((Object[]) new Address[]{new Address("apiv2.yalla.live", null, 2, null), new Address("room03.yalla.live", null, 2, null), new Address("dtslave.yalla.live", null, 2, null)});
        this.f56500OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.f56501OooO0o = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f56503OooO0oO = "";
        this.f56504OooO0oo = LazyKt.lazy(new OooO00o());
    }

    public final void OooO0O0() {
        this.f56500OooO0Oo.setValue(1);
        ((NetDiagnosis) this.f56504OooO0oo.getValue()).start(getApplication(), new OooO0O0());
    }
}
