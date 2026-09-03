package com.yalla.yalla.developer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.developer.nettest.TestModel;
import kotlin.Metadata;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.Oooo0;
import p022Oooo00O.o00O00OO;
import p411o0Oo0oO0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/developer/TestXbfActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TestXbfActivity extends AppCompatActivity {

    @DebugMetadata(c = "com.yalla.yalla.developer.TestXbfActivity$onCreate$1", f = "TestXbfActivity.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23330OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TestModel f23331OooO0o0;

        /* JADX INFO: renamed from: com.yalla.yalla.developer.TestXbfActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.developer.TestXbfActivity$onCreate$1$1", f = "TestXbfActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0300OooO00o extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f23332OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ TestModel f23333OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0300OooO00o(TestModel testModel, Continuation<? super C0300OooO00o> continuation) {
                super(2, continuation);
                this.f23333OooO0o0 = testModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0300OooO00o c0300OooO00o = new C0300OooO00o(this.f23333OooO0o0, continuation);
                c0300OooO00o.f23332OooO0Oo = obj;
                return c0300OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((C0300OooO00o) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                System.out.println((Object) o00O00OO.OooO00o("111111111111111111111111111111111111111  collectLatest   ", (String) this.f23332OooO0Oo));
                System.out.println((Object) o00O00OO.OooO00o("111111111111111111111111111111111111111  collectLatest2   ", this.f23333OooO0o0.OooO00o()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(TestModel testModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f23331OooO0o0 = testModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f23331OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23330OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TestModel testModel = this.f23331OooO0o0;
                if (testModel.f23376OooO0o0 == null) {
                    testModel.OooO00o();
                }
                MutableStateFlow<String> mutableStateFlow = testModel.f23376OooO0o0;
                Intrinsics.checkNotNull(mutableStateFlow);
                C0300OooO00o c0300OooO00o = new C0300OooO00o(testModel, null);
                this.f23330OooO0Oo = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c0300OooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.developer.TestXbfActivity$onCreate$2", f = "TestXbfActivity.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23334OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TestModel f23335OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(TestModel testModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f23335OooO0o0 = testModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f23335OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23334OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f23334OooO0Oo = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TestModel testModel = this.f23335OooO0o0;
            testModel.getClass();
            Intrinsics.checkNotNullParameter("22222222", AppMeasurementSdk.ConditionalUserProperty.VALUE);
            testModel.f23374OooO0Oo = "22222222";
            if (testModel.f23375OooO0o == null) {
                testModel.f23375OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("22222222", null, 2, null);
            }
            if (testModel.f23376OooO0o0 == null) {
                testModel.f23376OooO0o0 = StateFlowKt.MutableStateFlow(testModel.f23374OooO0Oo);
            }
            MutableStateFlow<String> mutableStateFlow = testModel.f23376OooO0o0;
            Intrinsics.checkNotNull(mutableStateFlow);
            mutableStateFlow.setValue("22222222");
            MutableState<String> mutableState = testModel.f23375OooO0o;
            Intrinsics.checkNotNull(mutableState);
            mutableState.setValue("22222222");
            return Unit.INSTANCE;
        }
    }

    public TestXbfActivity() {
        new TestModel();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Object obj = extras != null ? extras.get("testData") : null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.developer.nettest.TestModel");
        TestModel testModel = (TestModel) obj;
        System.out.println((Object) "111111111111111111111111111111111111111     ");
        System.out.println((Object) "111111111111111111111111111111111111111     ");
        System.out.println((Object) "111111111111111111111111111111111111111     ");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO00o(testModel, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooO0O0(testModel, null), 3, null);
        Oooo0.OooO00o(this, o0OO00O.f45237OooO00o);
    }
}
