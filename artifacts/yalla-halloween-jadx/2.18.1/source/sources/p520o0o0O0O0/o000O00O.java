package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.model.MomentBarGetServerIpModel;
import com.app.base.model.NewFollowMomentModel;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.api.service.MomentApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentGift;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.PollConfig;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostSendGiftModel;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O00O f42470OooO00o = new o000O00O();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {223}, m = "circleDiscoveryTopIns", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42471Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42473Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42471Oooo0o = obj;
            this.f42473Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0o0(0L, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {29}, m = "adAddBlockIns", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42474Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42476Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42474Oooo0o = obj;
            this.f42476Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO00o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {61}, m = "checkUserBlack", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42477Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42479Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42477Oooo0o = obj;
            this.f42479Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {232}, m = "circleBlackIns", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42480Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42482Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42480Oooo0o = obj;
            this.f42482Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0OO(0L, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {215}, m = "circleDiscoveryDelete", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42483Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42485Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42483Oooo0o = obj;
            this.f42485Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0Oo(0L, 0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {278}, m = "commentParentCommentInfo", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42486Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42488Oooo0oo;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42486Oooo0o = obj;
            this.f42488Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {68}, m = "commentPraise", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42489Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42491Oooo0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42489Oooo0o = obj;
            this.f42491Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0oO(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {285}, m = "commentWrite", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42492Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42494Oooo0oo;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42492Oooo0o = obj;
            this.f42494Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO(null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {21}, m = "commentSendProp", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42495Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42497Oooo0oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42495Oooo0o = obj;
            this.f42497Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0oo(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {240}, m = "delMoment", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42498Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42500Oooo0oo;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42498Oooo0o = obj;
            this.f42500Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOO0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {271}, m = "getPollInfo", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42501Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42503Oooo0oo;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42501Oooo0o = obj;
            this.f42503Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOO0o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {264}, m = "getPollConfig", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42504Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42506Oooo0oo;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42504Oooo0o = obj;
            this.f42506Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOO0O(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {44, 46}, m = "momentCommentList", n = {}, s = {})
    public static final class Oooo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42507Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42509Oooo0oo;

        public Oooo0(Continuation<? super Oooo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42507Oooo0o = obj;
            this.f42509Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOO(0L, 0, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {168}, m = "momentChangeImagesUrl", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42510Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42512Oooo0oo;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42510Oooo0o = obj;
            this.f42512Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOO0(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {118}, m = "topicMomentList", n = {}, s = {})
    public static final class o00000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42513Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42515Oooo0oo;

        public o00000(Continuation<? super o00000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42513Oooo0o = obj;
            this.f42515Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOooo(0L, 0, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {111}, m = "squareBarMember", n = {}, s = {})
    public static final class o000000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42516Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42518Oooo0oo;

        public o000000(Continuation<? super o000000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42516Oooo0o = obj;
            this.f42518Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOoo(null, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {257}, m = "topInsForUserPost", n = {}, s = {})
    public static final class o000000O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42519Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42521Oooo0oo;

        public o000000O(Continuation<? super o000000O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42519Oooo0o = obj;
            this.f42521Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOooO(0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR}, m = "userMomentList", n = {}, s = {})
    public static final class o00000O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42522Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42524Oooo0oo;

        public o00000O0(Continuation<? super o00000O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42522Oooo0o = obj;
            this.f42524Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.Oooo000(0L, 0L, 0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {54}, m = "sendGift", n = {}, s = {})
    public static final class o000OOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42525Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42527Oooo0oo;

        public o000OOo(Continuation<? super o000OOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42525Oooo0o = obj;
            this.f42527Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOoo0(0L, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {132}, m = "momentDetail", n = {}, s = {})
    public static final class o000oOoO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42528Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42530Oooo0oo;

        public o000oOoO(Continuation<? super o000oOoO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42528Oooo0o = obj;
            this.f42530Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOOO(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {87, 89}, m = "momentFollowList", n = {}, s = {})
    public static final class o00O0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42531Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42533Oooo0oo;

        public o00O0O(Continuation<? super o00O0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42531Oooo0o = obj;
            this.f42533Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOo0(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {36}, m = "momentGiftList", n = {}, s = {})
    public static final class o00Oo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42534Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42536Oooo0oo;

        public o00Oo0(Continuation<? super o00Oo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42534Oooo0o = obj;
            this.f42536Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOo(0, 0L, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {208}, m = "momentPoll", n = {}, s = {})
    public static final class o00Ooo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42537Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42539Oooo0oo;

        public o00Ooo(Continuation<? super o00Ooo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42537Oooo0o = obj;
            this.f42539Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOoo(0, 0L, 0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {125}, m = "momentRecommendUserList", n = {}, s = {})
    public static final class o00oO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42540Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42542Oooo0oo;

        public o00oO0o(Continuation<? super o00oO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42540Oooo0o = obj;
            this.f42542Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOo0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {76, 78}, m = "praiseList", n = {}, s = {})
    public static final class o0O0O00 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42543Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42545Oooo0oo;

        public o0O0O00(Continuation<? super o0O0O00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42543Oooo0o = obj;
            this.f42545Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOoOO(null, 0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {146}, m = "momentsDurationAdd", n = {}, s = {})
    public static final class o0OO00O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42546Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42548Oooo0oo;

        public o0OO00O(Continuation<? super o0OO00O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42546Oooo0o = obj;
            this.f42548Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOoO0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {177, FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "momentSend", n = {}, s = {})
    public static final class o0OOO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42549Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42551Oooo0oo;

        public o0OOO0o(Continuation<? super o0OOO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42549Oooo0o = obj;
            this.f42551Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOo0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {139}, m = "momentSquareFriendIsNew", n = {}, s = {})
    public static final class o0Oo0oo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42552Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42554Oooo0oo;

        public o0Oo0oo(Continuation<? super o0Oo0oo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42552Oooo0o = obj;
            this.f42554Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {97}, m = "momentFeaturedList", n = {}, s = {})
    public static final class o0OoOo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42555Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42557Oooo0oo;

        public o0OoOo0(Continuation<? super o0OoOo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42555Oooo0o = obj;
            this.f42557Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOOOo(0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {161}, m = "momentRoomGetServerIP", n = {}, s = {})
    public static final class o0ooOOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42558Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42560Oooo0oo;

        public o0ooOOo(Continuation<? super o0ooOOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42558Oooo0o = obj;
            this.f42560Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOo0O(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {104}, m = "momentRecommendList", n = {}, s = {})
    public static final class oo000o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42561Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42563Oooo0oo;

        public oo000o(Continuation<? super oo000o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42561Oooo0o = obj;
            this.f42563Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOo00(0L, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.MomentRepository", f = "MomentRepository.kt", i = {}, l = {249}, m = "postPraise", n = {}, s = {})
    public static final class oo0o0Oo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42564Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42566Oooo0oo;

        public oo0o0Oo(Continuation<? super oo0o0Oo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42564Oooo0o = obj;
            this.f42566Oooo0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooOoO(0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooO(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f42494Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f42494Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        OooOOO oooOOO2 = oooOOO;
        Object objCommentWrite = oooOOO2.f42492Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO2.f42494Oooo0oo;
        String str6 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCommentWrite);
                p484o0o000OO.OooOOO oooOOO3 = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                String strOooO0O0 = p516o0o0O000.o000oOoO.OooO0O0(str2);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(content)");
                String strOooO0O1 = p516o0o0O000.o000oOoO.OooO0O0(str5);
                oooOOO2.f42494Oooo0oo = 1;
                objCommentWrite = momentApiServiceOooO00o.commentWrite(str, strOooO0O0, str3, str4, strOooO0O1, oooOOO2);
                if (objCommentWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCommentWrite);
            }
            return objCommentWrite;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str6 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str6, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str6 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str6, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str6 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str6, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO00o(long j, @NotNull Continuation<? super ApiResult<List<Object>>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42476Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42476Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objAdvertiBlockIns = oooO00o.f42474Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42476Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAdvertiBlockIns);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooO00o.f42476Oooo0oo = 1;
                objAdvertiBlockIns = momentApiServiceOooO00o.advertiBlockIns(j, 3, oooO00o);
                if (objAdvertiBlockIns == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAdvertiBlockIns);
            }
            return objAdvertiBlockIns;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0O0(@NotNull String str, @NotNull Continuation<? super ApiResult<CheckUserBlackResultModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42479Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42479Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objCheckUserBlack = oooO0O0.f42477Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42479Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckUserBlack);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooO0O0.f42479Oooo0oo = 1;
                objCheckUserBlack = momentApiServiceOooO00o.checkUserBlack(str, oooO0O0);
                if (objCheckUserBlack == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckUserBlack);
            }
            return objCheckUserBlack;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooO0OO(long j, long j2, int i, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i2 = oooO0OO.f42482Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42482Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objCircleBlackIns = oooO0OO2.f42480Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0OO2.f42482Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objCircleBlackIns);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooO0OO2.f42482Oooo0oo = 1;
                objCircleBlackIns = momentApiServiceOooO00o.circleBlackIns(j, j2, i, oooO0OO2);
                if (objCircleBlackIns == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCircleBlackIns);
            }
            return objCircleBlackIns;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooO0Oo(long j, long j2, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f42485Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f42485Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        OooO0o oooO0o2 = oooO0o;
        Object objCircleDiscoveryDelete = oooO0o2.f42483Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o2.f42485Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCircleDiscoveryDelete);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooO0o2.f42485Oooo0oo = 1;
                objCircleDiscoveryDelete = momentApiServiceOooO00o.circleDiscoveryDelete(j, j2, oooO0o2);
                if (objCircleDiscoveryDelete == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCircleDiscoveryDelete);
            }
            return objCircleDiscoveryDelete;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o(long j, @NotNull Continuation<? super ApiResult<List<PostCommentDetailModel>>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f42488Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f42488Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objCommentParentCommentInfo = oooOO1.f42486Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f42488Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCommentParentCommentInfo);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooOO1.f42488Oooo0oo = 1;
                objCommentParentCommentInfo = momentApiServiceOooO00o.commentParentCommentInfo(j, oooOO1);
                if (objCommentParentCommentInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCommentParentCommentInfo);
            }
            return objCommentParentCommentInfo;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooO0o0(long j, long j2, int i, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i2 = oooO.f42473Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO.f42473Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        OooO oooO2 = oooO;
        Object objCircleDiscoveryTopIns = oooO2.f42471Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO2.f42473Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objCircleDiscoveryTopIns);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooO2.f42473Oooo0oo = 1;
                objCircleDiscoveryTopIns = momentApiServiceOooO00o.circleDiscoveryTopIns(j, j2, i, oooO2);
                if (objCircleDiscoveryTopIns == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCircleDiscoveryTopIns);
            }
            return objCircleDiscoveryTopIns;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oO(@NotNull String str, int i, @NotNull Continuation<? super ApiResult<PraiseCommentResultModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i2 = oooOO0O.f42491Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f42491Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objCommentPraise = oooOO0O.f42489Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOO0O.f42491Oooo0oo;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objCommentPraise);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooOO0O.f42491Oooo0oo = 1;
                objCommentPraise = momentApiServiceOooO00o.commentPraise(str, i, oooOO0O);
                if (objCommentPraise == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCommentPraise);
            }
            return objCommentPraise;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super ApiResult<RewardCommentResultModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f42497Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f42497Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objCommentSendProp = oooOOO0.f42495Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f42497Oooo0oo;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCommentSendProp);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooOOO0.f42497Oooo0oo = 1;
                objCommentSendProp = momentApiServiceOooO00o.commentSendProp(str, str2, oooOOO0);
                if (objCommentSendProp == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCommentSendProp);
            }
            return objCommentSendProp;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0(long j, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f42500Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f42500Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        Object objDelMoment = oooOOOO.f42498Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO.f42500Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objDelMoment);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooOOOO.f42500Oooo0oo = 1;
                objDelMoment = momentApiServiceOooO00o.delMoment(j, oooOOOO);
                if (objDelMoment == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDelMoment);
            }
            return objDelMoment;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0O(@NotNull Continuation<? super ApiResult<PollConfig>> continuation) {
        OooOo00 oooOo00;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i = oooOo00.f42506Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f42506Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        Object voteConfig = oooOo00.f42504Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo00.f42506Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(voteConfig);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooOo00.f42506Oooo0oo = 1;
                voteConfig = momentApiServiceOooO00o.getVoteConfig(oooOo00);
                if (voteConfig == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(voteConfig);
            }
            return voteConfig;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0o(long j, @NotNull Continuation<? super ApiResult<MomentPoll>> continuation) {
        OooOo oooOo;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i = oooOo.f42503Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f42503Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        Object voteInfo = oooOo.f42501Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo.f42503Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(voteInfo);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooOo.f42503Oooo0oo = 1;
                voteInfo = momentApiServiceOooO00o.getVoteInfo(j, oooOo);
                if (voteInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(voteInfo);
            }
            return voteInfo;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Nullable
    public final Object OooOOO(long j, int i, long j2, int i2, @NotNull Continuation<? super ApiResult<List<PostCommentDetailModel>>> continuation) {
        Oooo0 oooo0;
        ?? r2;
        ?? r3;
        int i3;
        String message;
        String strOooO0oo;
        ?? r13;
        String strOooO0oo2;
        if (continuation instanceof Oooo0) {
            oooo0 = (Oooo0) continuation;
            int i4 = oooo0.f42509Oooo0oo;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oooo0.f42509Oooo0oo = i4 - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(continuation);
            }
        } else {
            oooo0 = new Oooo0(continuation);
        }
        Object objMomentCommentList = oooo0.f42507Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = oooo0.f42509Oooo0oo;
        ?? r14 = "WebAPIException";
        ?? r15 = "gson.toJson(model) ?: \"\"";
        try {
            try {
                if (i5 == 0) {
                    ResultKt.throwOnFailure(objMomentCommentList);
                    if (j2 > 0) {
                        p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                        MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                        oooo0.f42509Oooo0oo = 1;
                        Oooo0 oooo1 = oooo0;
                        r2 = "gson.toJson(model) ?: \"\"";
                        r15 = 16;
                        r3 = "WebAPIException";
                        r14 = 0;
                        try {
                            objMomentCommentList = momentApiServiceOooO00o.momentCommentList(j, i, j2, i2, 20, oooo1);
                            if (objMomentCommentList == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (IOException e) {
                            e = e;
                            r15 = r2;
                            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), r3, 1, "time out");
                            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                            strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                            if (strOooO0oo2 == null) {
                                strOooO0oo2 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, r15);
                            }
                            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo2, ApiResult.class);
                            Intrinsics.checkNotNull(objOooO0O0);
                            return objOooO0O0;
                        } catch (CancellationException unused) {
                            r13 = r2;
                            ApiError apiError = new ApiError(3, "canceled");
                            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
                            if (strOooO0oo3 == null) {
                                strOooO0oo3 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, r13);
                            }
                            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo3, ApiResult.class);
                            Intrinsics.checkNotNull(objOooO0O1);
                            return objOooO0O1;
                        } catch (Exception e2) {
                            e = e2;
                            r15 = r2;
                            i3 = 2;
                            o00O00.OooO0o0(r3, e.getMessage());
                            e.printStackTrace();
                            message = e.getMessage();
                            if (message == null) {
                                message = e.getClass().getName();
                            }
                            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                            ApiError apiError2 = new ApiError(i3, message);
                            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                            strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
                            if (strOooO0oo == null) {
                                strOooO0oo = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo, r15);
                            }
                            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo, ApiResult.class);
                            Intrinsics.checkNotNull(objOooO0O2);
                            return objOooO0O2;
                        }
                    } else {
                        r3 = "WebAPIException";
                        try {
                            try {
                                p484o0o000OO.OooOOO oooOOO2 = p484o0o000OO.OooOOO.f40882OooO00o;
                                MomentApiService momentApiServiceOooO00o2 = p484o0o000OO.OooOOO.OooO00o();
                                i3 = 2;
                                r14 = 2;
                                try {
                                    oooo0.f42509Oooo0oo = 2;
                                    objMomentCommentList = momentApiServiceOooO00o2.momentCommentList(j, i, i2, 20, oooo0);
                                    r15 = r15;
                                    if (objMomentCommentList == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    o00O00.OooO0o0(r3, e.getMessage());
                                    e.printStackTrace();
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = e.getClass().getName();
                                    }
                                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                                    ApiError apiError3 = new ApiError(i3, message);
                                    p516o0o0O000.o0OOO0o o0ooo0o5 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                                    strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError3);
                                    if (strOooO0oo == null) {
                                        strOooO0oo = "";
                                    } else {
                                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, r15);
                                    }
                                    Object objOooO0O3 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo, ApiResult.class);
                                    Intrinsics.checkNotNull(objOooO0O3);
                                    return objOooO0O3;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                ApiError apiErrorOooO00o2 = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), r3, 1, "time out");
                                p516o0o0O000.o0OOO0o o0ooo0o6 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                                strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o2);
                                if (strOooO0oo2 == null) {
                                    strOooO0oo2 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOooO0oo2, r15);
                                }
                                Object objOooO0O4 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo2, ApiResult.class);
                                Intrinsics.checkNotNull(objOooO0O4);
                                return objOooO0O4;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            i3 = 2;
                            o00O00.OooO0o0(r3, e.getMessage());
                            e.printStackTrace();
                            message = e.getMessage();
                            if (message == null) {
                                message = e.getClass().getName();
                            }
                            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                            ApiError apiError4 = new ApiError(i3, message);
                            p516o0o0O000.o0OOO0o o0ooo0o7 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                            strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError4);
                            if (strOooO0oo == null) {
                                strOooO0oo = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo, r15);
                            }
                            Object objOooO0O5 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo, ApiResult.class);
                            Intrinsics.checkNotNull(objOooO0O5);
                            return objOooO0O5;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objMomentCommentList);
                    r15 = r15;
                    r14 = r14;
                }
                return objMomentCommentList;
            } catch (CancellationException unused2) {
                r13 = r15;
            }
        } catch (IOException e6) {
            e = e6;
            r2 = r15;
            r3 = r14;
        } catch (Exception e7) {
            e = e7;
            r2 = r15;
            r3 = r14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOO0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super ApiResult<MomentBarGetServerIpModel>> continuation) {
        Oooo000 oooo000;
        String str5;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i = oooo000.f42512Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f42512Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Oooo000 oooo001 = oooo000;
        Object objMomentChangeImagesUrl = oooo001.f42510Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo001.f42512Oooo0oo;
        String str6 = "";
        String str7 = "gson.toJson(model) ?: \"\"";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMomentChangeImagesUrl);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oooo001.f42512Oooo0oo = 1;
                str5 = "gson.toJson(model) ?: \"\"";
                str7 = null;
                try {
                    objMomentChangeImagesUrl = momentApiServiceOooO00o.momentChangeImagesUrl(str, str2, str3, str4, FeedbackType.Suggestions, String.valueOf(p168o00Ooo0.oo000o.OooO0O0()), oooo001);
                    if (objMomentChangeImagesUrl == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str5);
                        str6 = strOooO0oo;
                    }
                    Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str6, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str5);
                        str6 = strOooO0oo2;
                    }
                    Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str6, ApiResult.class);
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
                    p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str5);
                        str6 = strOooO0oo3;
                    }
                    Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str6, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentChangeImagesUrl);
            }
            return objMomentChangeImagesUrl;
        } catch (IOException e3) {
            e = e3;
            str5 = str7;
        } catch (CancellationException unused2) {
            str5 = str7;
        } catch (Exception e4) {
            e = e4;
            str5 = str7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOOOO(@NotNull String str, int i, @NotNull Continuation<? super ApiResult<MomentDetailModel>> continuation) {
        o000oOoO o000oooo2;
        if (continuation instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) continuation;
            int i2 = o000oooo2.f42530Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000oooo2.f42530Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object objMomentDetail = o000oooo2.f42528Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o000oooo2.f42530Oooo0oo;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objMomentDetail);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o000oooo2.f42530Oooo0oo = 1;
                objMomentDetail = momentApiServiceOooO00o.momentDetail(str, i, o000oooo2);
                if (objMomentDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentDetail);
            }
            return objMomentDetail;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOOo(long j, int i, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        o0OoOo0 o0oooo1;
        if (continuation instanceof o0OoOo0) {
            o0oooo1 = (o0OoOo0) continuation;
            int i2 = o0oooo1.f42557Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0oooo1.f42557Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o0oooo1 = new o0OoOo0(continuation);
            }
        } else {
            o0oooo1 = new o0OoOo0(continuation);
        }
        o0OoOo0 o0oooo2 = o0oooo1;
        Object objMomentFeaturedList = o0oooo2.f42555Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o0oooo2.f42557Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objMomentFeaturedList);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o0oooo2.f42557Oooo0oo = 1;
                objMomentFeaturedList = momentApiServiceOooO00o.momentFeaturedList(j, i, 20, o0oooo2);
                if (objMomentFeaturedList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentFeaturedList);
            }
            return objMomentFeaturedList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOo(int i, long j, long j2, int i2, @NotNull Continuation<? super ApiResult<List<MomentGift>>> continuation) {
        o00Oo0 o00oo1;
        if (continuation instanceof o00Oo0) {
            o00oo1 = (o00Oo0) continuation;
            int i3 = o00oo1.f42536Oooo0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o00oo1.f42536Oooo0oo = i3 - Integer.MIN_VALUE;
            } else {
                o00oo1 = new o00Oo0(continuation);
            }
        } else {
            o00oo1 = new o00Oo0(continuation);
        }
        o00Oo0 o00oo2 = o00oo1;
        Object objMomentGiftList = o00oo2.f42534Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = o00oo2.f42536Oooo0oo;
        String str = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objMomentGiftList);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o00oo2.f42536Oooo0oo = 1;
                objMomentGiftList = momentApiServiceOooO00o.momentGiftList(i, j, j2, i2, o00oo2);
                if (objMomentGiftList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentGiftList);
            }
            return objMomentGiftList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOo0(@Nullable Long l, int i, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        o00O0O o00o0o2;
        int i2;
        int i3;
        if (continuation instanceof o00O0O) {
            o00o0o2 = (o00O0O) continuation;
            int i4 = o00o0o2.f42533Oooo0oo;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o00o0o2.f42533Oooo0oo = i4 - Integer.MIN_VALUE;
            } else {
                o00o0o2 = new o00O0O(continuation);
            }
        } else {
            o00o0o2 = new o00O0O(continuation);
        }
        Object objMomentFollowList = o00o0o2.f42531Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = o00o0o2.f42533Oooo0oo;
        String str = "";
        int i6 = 1;
        try {
            try {
                try {
                    if (i5 == 0) {
                        ResultKt.throwOnFailure(objMomentFollowList);
                        try {
                            if (l == null || l.longValue() <= 0) {
                                i3 = 2;
                                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                                o00o0o2.f42533Oooo0oo = 1;
                                objMomentFollowList = momentApiServiceOooO00o.momentFollowList(i, 20, o00o0o2);
                                if (objMomentFollowList == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                p484o0o000OO.OooOOO oooOOO2 = p484o0o000OO.OooOOO.f40882OooO00o;
                                MomentApiService momentApiServiceOooO00o2 = p484o0o000OO.OooOOO.OooO00o();
                                long jLongValue = l.longValue();
                                o00o0o2.f42533Oooo0oo = 2;
                                i3 = 2;
                                i6 = 4;
                                try {
                                    objMomentFollowList = momentApiServiceOooO00o2.momentFollowList(jLongValue, i, 20, o00o0o2);
                                    if (objMomentFollowList == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    i6 = 1;
                                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", i6, "time out");
                                    p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                                    String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                                    if (strOooO0oo != null) {
                                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                                        str = strOooO0oo;
                                    }
                                    Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
                                    Intrinsics.checkNotNull(objOooO0O0);
                                    return objOooO0O0;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i3;
                            o00O00.OooO0o0("WebAPIException", e.getMessage());
                            e.printStackTrace();
                            String message = e.getMessage();
                            if (message == null) {
                                message = e.getClass().getName();
                            }
                            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                            ApiError apiError = new ApiError(i2, message);
                            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
                            if (strOooO0oo2 != null) {
                                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                                str = strOooO0oo2;
                            }
                            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
                            Intrinsics.checkNotNull(objOooO0O1);
                            return objOooO0O1;
                        }
                    } else {
                        if (i5 != 1 && i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objMomentFollowList);
                    }
                    return objMomentFollowList;
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (CancellationException unused) {
                ApiError apiError2 = new ApiError(3, "canceled");
                p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
                if (strOooO0oo3 != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo3;
                }
                Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(objOooO0O2);
                return objOooO0O2;
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooOOoo(int i, long j, long j2, @NotNull Continuation<? super ApiResult<MomentPoll>> continuation) {
        o00Ooo o00ooo2;
        if (continuation instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) continuation;
            int i2 = o00ooo2.f42539Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o00ooo2.f42539Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(continuation);
            }
        } else {
            o00ooo2 = new o00Ooo(continuation);
        }
        o00Ooo o00ooo3 = o00ooo2;
        Object objMomentPoll = o00ooo3.f42537Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o00ooo3.f42539Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objMomentPoll);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o00ooo3.f42539Oooo0oo = 1;
                objMomentPoll = momentApiServiceOooO00o.momentPoll(i, j, j2, o00ooo3);
                if (objMomentPoll == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentPoll);
            }
            return objMomentPoll;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOo(@NotNull String str, @NotNull Continuation<? super ApiResult<NewFollowMomentModel>> continuation) {
        o0Oo0oo o0oo0oo2;
        if (continuation instanceof o0Oo0oo) {
            o0oo0oo2 = (o0Oo0oo) continuation;
            int i = o0oo0oo2.f42554Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo0oo2.f42554Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o0oo0oo2 = new o0Oo0oo(continuation);
            }
        } else {
            o0oo0oo2 = new o0Oo0oo(continuation);
        }
        Object objMomentSquareFriendIsNew = o0oo0oo2.f42552Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0oo0oo2.f42554Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMomentSquareFriendIsNew);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o0oo0oo2.f42554Oooo0oo = 1;
                objMomentSquareFriendIsNew = momentApiServiceOooO00o.momentSquareFriendIsNew(str, o0oo0oo2);
                if (objMomentSquareFriendIsNew == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentSquareFriendIsNew);
            }
            return objMomentSquareFriendIsNew;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOo0(@NotNull Continuation<? super ApiResult<List<RecommendNewPostModel>>> continuation) {
        o00oO0o o00oo0o2;
        if (continuation instanceof o00oO0o) {
            o00oo0o2 = (o00oO0o) continuation;
            int i = o00oo0o2.f42542Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo0o2.f42542Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o00oo0o2 = new o00oO0o(continuation);
            }
        } else {
            o00oo0o2 = new o00oO0o(continuation);
        }
        Object objMomentRecommendUserList = o00oo0o2.f42540Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oo0o2.f42542Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMomentRecommendUserList);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o00oo0o2.f42542Oooo0oo = 1;
                objMomentRecommendUserList = momentApiServiceOooO00o.momentRecommendUserList(o00oo0o2);
                if (objMomentRecommendUserList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentRecommendUserList);
            }
            return objMomentRecommendUserList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOo00(long j, int i, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        oo000o oo000oVar;
        if (continuation instanceof oo000o) {
            oo000oVar = (oo000o) continuation;
            int i2 = oo000oVar.f42563Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oo000oVar.f42563Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oo000oVar = new oo000o(continuation);
            }
        } else {
            oo000oVar = new oo000o(continuation);
        }
        oo000o oo000oVar2 = oo000oVar;
        Object objMomentRecommendList = oo000oVar2.f42561Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oo000oVar2.f42563Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objMomentRecommendList);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oo000oVar2.f42563Oooo0oo = 1;
                objMomentRecommendList = momentApiServiceOooO00o.momentRecommendList(j, i, 20, oo000oVar2);
                if (objMomentRecommendList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentRecommendList);
            }
            return objMomentRecommendList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOo0O(@NotNull String str, @NotNull Continuation<? super ApiResult<MomentBarGetServerIpModel>> continuation) {
        o0ooOOo o0ooooo2;
        if (continuation instanceof o0ooOOo) {
            o0ooooo2 = (o0ooOOo) continuation;
            int i = o0ooooo2.f42560Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0ooooo2.f42560Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o0ooooo2 = new o0ooOOo(continuation);
            }
        } else {
            o0ooooo2 = new o0ooOOo(continuation);
        }
        Object objMomentRoomGetServerIP = o0ooooo2.f42558Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0ooooo2.f42560Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMomentRoomGetServerIP);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o0ooooo2.f42560Oooo0oo = 1;
                objMomentRoomGetServerIP = momentApiServiceOooO00o.momentRoomGetServerIP(str, o0ooooo2);
                if (objMomentRoomGetServerIP == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentRoomGetServerIP);
            }
            return objMomentRoomGetServerIP;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object OooOo0o(@org.jetbrains.annotations.NotNull com.yalla.yalla.model.MomentSendModel r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.yalla.yalla.common.model.ApiResult<com.yalla.yalla.model.MomentSendResultModel>> r24) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p520o0o0O0O0.o000O00O.OooOo0o(com.yalla.yalla.model.MomentSendModel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOoO(long j, int i, @NotNull Continuation<? super ApiResult<PraisePostResultModel>> continuation) {
        oo0o0Oo oo0o0oo;
        if (continuation instanceof oo0o0Oo) {
            oo0o0oo = (oo0o0Oo) continuation;
            int i2 = oo0o0oo.f42566Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oo0o0oo.f42566Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oo0o0oo = new oo0o0Oo(continuation);
            }
        } else {
            oo0o0oo = new oo0o0Oo(continuation);
        }
        Object objPostPraise = oo0o0oo.f42564Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oo0o0oo.f42566Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objPostPraise);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                oo0o0oo.f42566Oooo0oo = 1;
                objPostPraise = momentApiServiceOooO00o.postPraise(j, i, oo0o0oo);
                if (objPostPraise == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPostPraise);
            }
            return objPostPraise;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOoO0(long j, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        o0OO00O o0oo00o2;
        if (continuation instanceof o0OO00O) {
            o0oo00o2 = (o0OO00O) continuation;
            int i = o0oo00o2.f42548Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo00o2.f42548Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o0oo00o2 = new o0OO00O(continuation);
            }
        } else {
            o0oo00o2 = new o0OO00O(continuation);
        }
        Object objMomentsDurationAdd = o0oo00o2.f42546Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0oo00o2.f42548Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMomentsDurationAdd);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o0oo00o2.f42548Oooo0oo = 1;
                objMomentsDurationAdd = momentApiServiceOooO00o.momentsDurationAdd(j, o0oo00o2);
                if (objMomentsDurationAdd == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMomentsDurationAdd);
            }
            return objMomentsDurationAdd;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOoOO(@NotNull String str, long j, int i, @NotNull Continuation<? super ApiResult<List<PostUserModel>>> continuation) {
        o0O0O00 o0o0o00;
        String str2;
        String message;
        String strOooO0oo;
        String strOooO0oo2;
        String strOooO0oo3;
        if (continuation instanceof o0O0O00) {
            o0o0o00 = (o0O0O00) continuation;
            int i2 = o0o0o00.f42545Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0o0o00.f42545Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o0o0o00 = new o0O0O00(continuation);
            }
        } else {
            o0o0o00 = new o0O0O00(continuation);
        }
        Object objPraiseList = o0o0o00.f42543Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o0o0o00.f42545Oooo0oo;
        String str3 = "";
        String str4 = "gson.toJson(model) ?: \"\"";
        int i4 = 2;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objPraiseList);
                if (j <= 0) {
                    try {
                        p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                        MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                        o0o0o00.f42545Oooo0oo = 2;
                        Object objPraiseList2 = momentApiServiceOooO00o.praiseList(str, i, 20, o0o0o00);
                        return objPraiseList2 == coroutine_suspended ? coroutine_suspended : objPraiseList2;
                    } catch (IOException e) {
                        e = e;
                        ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                        p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                        strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                        if (strOooO0oo3 != null) {
                            Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str4);
                            str3 = strOooO0oo3;
                        }
                        Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
                        Intrinsics.checkNotNull(objOooO0O0);
                        return objOooO0O0;
                    } catch (CancellationException unused) {
                        ApiError apiError = new ApiError(3, "canceled");
                        p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                        strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
                        if (strOooO0oo2 != null) {
                            Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str4);
                            str3 = strOooO0oo2;
                        }
                        Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
                        Intrinsics.checkNotNull(objOooO0O1);
                        return objOooO0O1;
                    } catch (Exception e2) {
                        e = e2;
                        o00O00.OooO0o0("WebAPIException", e.getMessage());
                        e.printStackTrace();
                        message = e.getMessage();
                        if (message == null) {
                            message = e.getClass().getName();
                        }
                        Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                        ApiError apiError2 = new ApiError(i4, message);
                        p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                        strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
                        if (strOooO0oo != null) {
                            Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                            str3 = strOooO0oo;
                        }
                        Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
                        Intrinsics.checkNotNull(objOooO0O2);
                        return objOooO0O2;
                    }
                }
                p484o0o000OO.OooOOO oooOOO2 = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o2 = p484o0o000OO.OooOOO.OooO00o();
                o0o0o00.f42545Oooo0oo = 1;
                o0O0O00 o0o0o01 = o0o0o00;
                i4 = 8;
                str2 = "gson.toJson(model) ?: \"\"";
                str4 = null;
                try {
                    objPraiseList = momentApiServiceOooO00o2.praiseList(str, j, i, 20, o0o0o01);
                    if (objPraiseList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e3) {
                    e = e3;
                    str4 = str2;
                    ApiError apiErrorOooO00o2 = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    p516o0o0O000.o0OOO0o o0ooo0o5 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str4);
                        str3 = strOooO0oo3;
                    }
                    Object objOooO0O3 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O3);
                    return objOooO0O3;
                } catch (CancellationException unused2) {
                    str4 = str2;
                    ApiError apiError3 = new ApiError(3, "canceled");
                    p516o0o0O000.o0OOO0o o0ooo0o6 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError3);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str4);
                        str3 = strOooO0oo2;
                    }
                    Object objOooO0O4 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O4);
                    return objOooO0O4;
                } catch (Exception e4) {
                    e = e4;
                    i4 = 2;
                    str4 = str2;
                    o00O00.OooO0o0("WebAPIException", e.getMessage());
                    e.printStackTrace();
                    message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError4 = new ApiError(i4, message);
                    p516o0o0O000.o0OOO0o o0ooo0o7 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError4);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                        str3 = strOooO0oo;
                    }
                    Object objOooO0O5 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O5);
                    return objOooO0O5;
                }
            } else {
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPraiseList);
            }
            return objPraiseList;
        } catch (IOException e5) {
            e = e5;
            str2 = str4;
        } catch (CancellationException unused3) {
            str2 = str4;
        } catch (Exception e6) {
            e = e6;
            str2 = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOoo(@NotNull String str, long j, int i, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        o000000 o000000Var;
        if (continuation instanceof o000000) {
            o000000Var = (o000000) continuation;
            int i2 = o000000Var.f42518Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000000Var.f42518Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o000000Var = new o000000(continuation);
            }
        } else {
            o000000Var = new o000000(continuation);
        }
        o000000 o000000Var2 = o000000Var;
        Object objSquareBarMember = o000000Var2.f42516Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o000000Var2.f42518Oooo0oo;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objSquareBarMember);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o000000Var2.f42518Oooo0oo = 1;
                objSquareBarMember = momentApiServiceOooO00o.squareBarMember(str, j, i, 20, o000000Var2);
                if (objSquareBarMember == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSquareBarMember);
            }
            return objSquareBarMember;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooOoo0(long j, @NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super ApiResult<PostSendGiftModel>> continuation) {
        o000OOo o000ooo2;
        if (continuation instanceof o000OOo) {
            o000ooo2 = (o000OOo) continuation;
            int i2 = o000ooo2.f42527Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000ooo2.f42527Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o000ooo2 = new o000OOo(continuation);
            }
        } else {
            o000ooo2 = new o000OOo(continuation);
        }
        o000OOo o000ooo3 = o000ooo2;
        Object objSendGift = o000ooo3.f42525Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o000ooo3.f42527Oooo0oo;
        String str3 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objSendGift);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o000ooo3.f42527Oooo0oo = 1;
                objSendGift = momentApiServiceOooO00o.sendGift(str, j, str2, i, o000ooo3);
                if (objSendGift == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendGift);
            }
            return objSendGift;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOooO(long j, int i, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        o000000O o000000o2;
        if (continuation instanceof o000000O) {
            o000000o2 = (o000000O) continuation;
            int i2 = o000000o2.f42521Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o000000o2.f42521Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                o000000o2 = new o000000O(continuation);
            }
        } else {
            o000000o2 = new o000000O(continuation);
        }
        Object obj = o000000o2.f42519Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o000000o2.f42521Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o000000o2.f42521Oooo0oo = 1;
                obj = momentApiServiceOooO00o.topInsForUserPost(j, i, o000000o2);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOooo(long j, int i, long j2, int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        o00000 o00000Var;
        String str;
        if (continuation instanceof o00000) {
            o00000Var = (o00000) continuation;
            int i3 = o00000Var.f42515Oooo0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o00000Var.f42515Oooo0oo = i3 - Integer.MIN_VALUE;
            } else {
                o00000Var = new o00000(continuation);
            }
        } else {
            o00000Var = new o00000(continuation);
        }
        o00000 o00000Var2 = o00000Var;
        Object objCircleDiscovery = o00000Var2.f42513Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = o00000Var2.f42515Oooo0oo;
        String str2 = "gson.toJson(model) ?: \"\"";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objCircleDiscovery);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o00000Var2.f42515Oooo0oo = 1;
                str = "gson.toJson(model) ?: \"\"";
                str2 = null;
                try {
                    objCircleDiscovery = momentApiServiceOooO00o.circleDiscovery(j, i, j2, i2, 20, o00000Var2);
                    if (objCircleDiscovery == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo == null) {
                        strOooO0oo = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str);
                    }
                    Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str);
                    }
                    Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo2, ApiResult.class);
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
                    p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 == null) {
                        strOooO0oo3 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str);
                    }
                    Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo3, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCircleDiscovery);
            }
            return objCircleDiscovery;
        } catch (IOException e3) {
            e = e3;
            str = str2;
        } catch (CancellationException unused2) {
            str = str2;
        } catch (Exception e4) {
            e = e4;
            str = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object Oooo000(long j, long j2, int i, int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation) {
        o00000O0 o00000o1;
        String str;
        if (continuation instanceof o00000O0) {
            o00000o1 = (o00000O0) continuation;
            int i3 = o00000o1.f42524Oooo0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o00000o1.f42524Oooo0oo = i3 - Integer.MIN_VALUE;
            } else {
                o00000o1 = new o00000O0(continuation);
            }
        } else {
            o00000o1 = new o00000O0(continuation);
        }
        o00000O0 o00000o2 = o00000o1;
        Object objUserMomentList = o00000o2.f42522Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = o00000o2.f42524Oooo0oo;
        String str2 = "gson.toJson(model) ?: \"\"";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objUserMomentList);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                MomentApiService momentApiServiceOooO00o = p484o0o000OO.OooOOO.OooO00o();
                o00000o2.f42524Oooo0oo = 1;
                str = "gson.toJson(model) ?: \"\"";
                str2 = null;
                try {
                    objUserMomentList = momentApiServiceOooO00o.userMomentList(j, j2, i, i2, 20, o00000o2);
                    if (objUserMomentList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo == null) {
                        strOooO0oo = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str);
                    }
                    Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    ApiError apiError = new ApiError(3, "canceled");
                    p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str);
                    }
                    Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo2, ApiResult.class);
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
                    p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 == null) {
                        strOooO0oo3 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str);
                    }
                    Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(strOooO0oo3, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserMomentList);
            }
            return objUserMomentList;
        } catch (IOException e3) {
            e = e3;
            str = str2;
        } catch (CancellationException unused2) {
            str = str2;
        } catch (Exception e4) {
            e = e4;
            str = str2;
        }
    }
}
