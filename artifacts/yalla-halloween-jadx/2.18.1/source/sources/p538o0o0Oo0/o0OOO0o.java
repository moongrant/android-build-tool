package p538o0o0Oo0;

import com.yalla.yalla.data.db.model.TopicRecentTable;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.AddTopicListActivity$loadRecentlyList$1", f = "AddTopicListActivity.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f44046Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f44047Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.AddTopicListActivity$loadRecentlyList$1$2", f = "AddTopicListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AddTopicListActivity f44048Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Lazy<List<TopicInfoModel>> f44049Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Lazy<List<TopicInfoModel>> f44050Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(AddTopicListActivity addTopicListActivity, Lazy<? extends List<TopicInfoModel>> lazy, Lazy<? extends List<TopicInfoModel>> lazy2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f44048Oooo0o = addTopicListActivity;
            this.f44049Oooo0oO = lazy;
            this.f44050Oooo0oo = lazy2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f44048Oooo0o, this.f44049Oooo0oO, this.f44050Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AddTopicListActivity.OooO00o oooO00oOooOoo = AddTopicListActivity.OooOoo(this.f44048Oooo0o);
            List<TopicInfoModel> listAllTemp = this.f44049Oooo0oO.getValue();
            List<TopicInfoModel> listMax3 = this.f44050Oooo0oo.getValue();
            Objects.requireNonNull(oooO00oOooOoo);
            Intrinsics.checkNotNullParameter(listAllTemp, "listAllTemp");
            Intrinsics.checkNotNullParameter(listMax3, "listMax3");
            oooO00oOooOoo.OooO00o().clear();
            oooO00oOooOoo.OooO0O0().clear();
            oooO00oOooOoo.OooO00o().addAll(listAllTemp);
            oooO00oOooOoo.OooO0O0().addAll(listMax3);
            oooO00oOooOoo.setNewData(listMax3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<TopicInfoModel>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f44051Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<TopicInfoModel> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<List<TopicInfoModel>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f44052Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<TopicInfoModel> invoke() {
            return new ArrayList();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(AddTopicListActivity addTopicListActivity, Continuation<? super o0OOO0o> continuation) {
        super(2, continuation);
        this.f44047Oooo0oO = addTopicListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OOO0o(this.f44047Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44046Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = LazyKt.lazy(OooO0OO.f44052Oooo0o);
            Lazy lazy2 = LazyKt.lazy(OooO0O0.f44051Oooo0o);
            List<TopicRecentTable> listTopicRecent = p491o0o00O00.OooO0OO.OooO00o().Oooo0().OooO0O0(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
            Intrinsics.checkNotNullExpressionValue(listTopicRecent, "listTopicRecent");
            int i2 = 0;
            for (Object obj2 : listTopicRecent) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TopicRecentTable topicRecentTable = (TopicRecentTable) obj2;
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                topicInfoModel.setId(topicRecentTable.topicId);
                String str = topicRecentTable.topicName;
                Intrinsics.checkNotNullExpressionValue(str, "item.topicName");
                topicInfoModel.setName(str);
                topicInfoModel.setRecentlyLocal(true);
                if (i2 == 0) {
                    topicInfoModel.setTitleLocal(true);
                }
                if (i2 < 3) {
                    ((List) lazy.getValue()).add(topicInfoModel);
                }
                ((List) lazy2.getValue()).add(topicInfoModel);
                i2 = i3;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(this.f44047Oooo0oO, lazy2, lazy, null);
            this.f44046Oooo0o = 1;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
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
