package com.yalla.yalla.ui.screen.moment.media;

import androidx.compose.foundation.pager.PagerState;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$loadMoreState$1$1", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28907OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PagerState f28908OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f28909OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f28910OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f28911OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f28912OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$loadMoreState$1$1$1", f = "VideoFeedScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f28913OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f28914OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PagerState f28915OooO0o0;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.screen.moment.media.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen$MainContent$loadMoreState$1$1$1$1", f = "VideoFeedScreen.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0335OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f28916OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentVideoVM f28917OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ PagerState f28918OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0335OooO00o(PagerState pagerState, MomentVideoVM momentVideoVM, Continuation<? super C0335OooO00o> continuation) {
                super(2, continuation);
                this.f28918OooO0o0 = pagerState;
                this.f28917OooO0o = momentVideoVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0335OooO00o(this.f28918OooO0o0, this.f28917OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0335OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f28916OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f28918OooO0o0.getCurrentPage() + 1 < this.f28917OooO0o.getListData().size()) {
                        PagerState pagerState = this.f28918OooO0o0;
                        int currentPage = pagerState.getCurrentPage() + 1;
                        this.f28916OooO0Oo = 1;
                        if (PagerState.animateScrollToPage$default(pagerState, currentPage, 0.0f, null, this, 6, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CoroutineScope coroutineScope, PagerState pagerState, MomentVideoVM momentVideoVM, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f28913OooO0Oo = coroutineScope;
            this.f28915OooO0o0 = pagerState;
            this.f28914OooO0o = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new OooO00o(this.f28913OooO0Oo, this.f28915OooO0o0, this.f28914OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.f28913OooO0Oo, null, null, new C0335OooO00o(this.f28915OooO0o0, this.f28914OooO0o, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMoreState.values().length];
            try {
                iArr[LoadMoreState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadMoreState.NoMore.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(PagerState pagerState, MomentVideoVM momentVideoVM, int i, long j, Long l, CoroutineScope coroutineScope, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f28908OooO0Oo = pagerState;
        this.f28910OooO0o0 = momentVideoVM;
        this.f28909OooO0o = i;
        this.f28911OooO0oO = j;
        this.f28912OooO0oo = l;
        this.f28907OooO = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(this.f28908OooO0Oo, this.f28910OooO0o0, this.f28909OooO0o, this.f28911OooO0oO, this.f28912OooO0oo, this.f28907OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PagerState pagerState = this.f28908OooO0Oo;
        int currentPage = pagerState.getCurrentPage();
        MomentVideoVM momentVideoVM = this.f28910OooO0o0;
        if (currentPage == momentVideoVM.getListData().size() - 1) {
            int i = OooO0O0.$EnumSwitchMapping$0[momentVideoVM.getLoadMoreState().getValue().ordinal()];
            if (i == 1) {
                MomentVideoVM momentVideoVM2 = this.f28910OooO0o0;
                momentVideoVM2.userMomentList(this.f28909OooO0o, false, this.f28911OooO0oO, this.f28912OooO0oo, new OooO00o(this.f28907OooO, pagerState, momentVideoVM2, null));
            } else if (i == 2) {
                o000O00.OooO0O0(o0000.OooO0OO(o000000.video_feed_no_more));
            }
        }
        return Unit.INSTANCE;
    }
}
