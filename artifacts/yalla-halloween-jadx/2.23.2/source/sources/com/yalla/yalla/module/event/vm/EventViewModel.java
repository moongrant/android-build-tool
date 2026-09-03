package com.yalla.yalla.module.event.vm;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.EventRepo;
import com.yalla.yalla.data.repository.EventRepo$getCreateEventState$$inlined$call$1;
import com.yalla.yalla.data.repository.EventRepo$subscribeEvent$$inlined$call$1;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventCreateStateModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.event.EventSubscribeModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.o00O0O;
import p394o0Oo0.OooOO0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R+\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0*8\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R+\u00103\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventViewModel;", "Lo0Oo0/OooOO0;", "", "getSquareEventRoom", "", ContributionFragment.ARG_1, "updateReadState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/event/EventCreateStateModel;", "getCreateEventState", "Lcom/yalla/yalla/model/event/EventModel;", "eventModel", "Lkotlin/Function1;", "", "requestAction", "subscribeEvent", "", "list", "updateTimeDivision", "", "today", "Ljava/lang/String;", "weekly", "nextWeekly", "<set-?>", "roomIdForUser$delegate", "Landroidx/compose/runtime/MutableState;", "getRoomIdForUser", "()J", "setRoomIdForUser", "(J)V", "roomIdForUser", "roomId$delegate", "getRoomId", "setRoomId", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yalla/yalla/model/SquareEventRoomModel;", "squareEventRooms", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getSquareEventRooms", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/runtime/MutableState;", "showAddToCalendarDialog", "getShowAddToCalendarDialog", "()Landroidx/compose/runtime/MutableState;", "addToCalendarEventModel$delegate", "getAddToCalendarEventModel", "()Lcom/yalla/yalla/model/event/EventModel;", "setAddToCalendarEventModel", "(Lcom/yalla/yalla/model/event/EventModel;)V", "addToCalendarEventModel", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEventViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventViewModel.kt\ncom/yalla/yalla/module/event/vm/EventViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n81#2:162\n107#2,2:163\n81#2:165\n107#2,2:166\n81#2:168\n107#2,2:169\n350#3,7:171\n1864#3,3:178\n*S KotlinDebug\n*F\n+ 1 EventViewModel.kt\ncom/yalla/yalla/module/event/vm/EventViewModel\n*L\n39#1:162\n39#1:163,2\n42#1:165\n42#1:166,2\n45#1:168\n45#1:169,2\n68#1:171,7\n122#1:178,3\n*E\n"})
public class EventViewModel extends OooOO0 {
    public static final int $stable = 0;

    @NotNull
    private final String today = o0000.OooO0OO(o000000.Room_Event_Today);

    @NotNull
    private final String weekly = o0000.OooO0OO(o000000.Room_Event_This_Week);

    @NotNull
    private final String nextWeekly = o0000.OooO0OO(o000000.Room_Event_Next_Week);

    /* JADX INFO: renamed from: roomIdForUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState roomIdForUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: roomId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState roomId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    @NotNull
    private final SnapshotStateList<SquareEventRoomModel> squareEventRooms = SnapshotStateKt.mutableStateListOf();

    @NotNull
    private final MutableState<Boolean> showAddToCalendarDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: addToCalendarEventModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState addToCalendarEventModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new EventModel(), null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventViewModel$getCreateEventState$1$1", f = "EventViewModel.kt", i = {}, l = {76, 77}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23639OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<ApiResult<EventCreateStateModel>> f23640OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f23641OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MutableSharedFlow<ApiResult<EventCreateStateModel>> mutableSharedFlow, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f23641OooO0o0 = j;
            this.f23640OooO0o = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f23641OooO0o0, this.f23640OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23639OooO0Oo;
            if (i != 0) {
                if (i == 1) {
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
            this.f23639OooO0Oo = 1;
            String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/CreateBefore");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0O0, "url", strOooO0O0, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f23641OooO0o0), ContributionFragment.ARG_1);
            obj = OooOOO.OooO0Oo(new EventRepo$getCreateEventState$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f23639OooO0Oo = 2;
            if (this.f23640OooO0o.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventViewModel$getSquareEventRoom$1", f = "EventViewModel.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23642OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventViewModel.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23642OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventRepo eventRepo = EventRepo.f22462OooO00o;
                this.f23642OooO0Oo = 1;
                obj = eventRepo.OooO00o(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) ((ApiResult) obj).getData();
            if (list != null) {
                EventViewModel eventViewModel = EventViewModel.this;
                eventViewModel.getSquareEventRooms().clear();
                eventViewModel.getSquareEventRooms().addAll(list);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f23644OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            bool.booleanValue();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventViewModel$subscribeEvent$2", f = "EventViewModel.kt", i = {}, l = {84, 85}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23645OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventModel f23646OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f23647OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f23648OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventViewModel$subscribeEvent$2$1", f = "EventViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiResult<EventSubscribeModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ EventViewModel f23649OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EventViewModel eventViewModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f23649OooO0Oo = eventViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f23649OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<EventSubscribeModel> apiResult, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f23649OooO0Oo.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventViewModel$subscribeEvent$2$2", f = "EventViewModel.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class OooO0O0 extends SuspendLambda implements Function2<EventSubscribeModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f23650OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ EventModel f23651OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f23652OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ EventViewModel f23653OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ Function1<Boolean, Unit> f23654OooO0oo;

            public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ EventViewModel f23655OooO0Oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EventViewModel eventViewModel) {
                    super(1);
                    this.f23655OooO0Oo = eventViewModel;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Boolean bool) {
                    if (bool.booleanValue()) {
                        this.f23655OooO0Oo.getShowAddToCalendarDialog().setValue(Boolean.TRUE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.yalla.yalla.module.event.vm.EventViewModel$OooO0o$OooO0O0$OooO0O0, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventViewModel$subscribeEvent$2$2$2", f = "EventViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0302OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ EventModel f23656OooO0Oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0302OooO0O0(EventModel eventModel, Continuation<? super C0302OooO0O0> continuation) {
                    super(2, continuation);
                    this.f23656OooO0Oo = eventModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0302OooO0O0(this.f23656OooO0Oo, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0302OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    Context contextOooO00o = o000O00O.OooO00o();
                    String title = this.f23656OooO0Oo.getEventName();
                    Intrinsics.checkNotNullParameter(title, "title");
                    if (contextOooO00o != null) {
                        try {
                            Cursor cursorQuery = contextOooO00o.getContentResolver().query(Uri.parse("content://com.android.calendar/events"), null, null, null, null);
                            if (cursorQuery == null) {
                                CloseableKt.closeFinally(cursorQuery, null);
                            } else {
                                try {
                                    if (cursorQuery.getCount() > 0) {
                                        cursorQuery.moveToFirst();
                                        while (!cursorQuery.isAfterLast()) {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                                            if (!TextUtils.isEmpty(title) && Intrinsics.areEqual(title, string)) {
                                                Uri uriWithAppendedId = ContentUris.withAppendedId(Uri.parse("content://com.android.calendar/events"), cursorQuery.getInt(cursorQuery.getColumnIndex("_id")));
                                                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                                                if (contextOooO00o.getContentResolver().delete(uriWithAppendedId, null, null) == -1) {
                                                    CloseableKt.closeFinally(cursorQuery, null);
                                                }
                                            }
                                            cursorQuery.moveToNext();
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(cursorQuery, null);
                                    } else {
                                        Unit unit2 = Unit.INSTANCE;
                                        CloseableKt.closeFinally(cursorQuery, null);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(cursorQuery, th);
                                        throw th2;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(EventModel eventModel, EventViewModel eventViewModel, Continuation continuation, Function1 function1) {
                super(2, continuation);
                this.f23651OooO0o = eventModel;
                this.f23653OooO0oO = eventViewModel;
                this.f23654OooO0oo = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f23651OooO0o, this.f23653OooO0oO, continuation, this.f23654OooO0oo);
                oooO0O0.f23652OooO0o0 = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EventSubscribeModel eventSubscribeModel, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(eventSubscribeModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x007e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                EventSubscribeModel eventSubscribeModel;
                EventSubscribeModel eventSubscribeModel2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f23650OooO0Oo;
                EventModel eventModel = this.f23651OooO0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    eventSubscribeModel = (EventSubscribeModel) this.f23652OooO0o0;
                    boolean hasSubscribe = eventModel.getHasSubscribe();
                    EventViewModel eventViewModel = this.f23653OooO0oO;
                    if (hasSubscribe) {
                        eventViewModel.getShowAddToCalendarDialog().setValue(Boxing.boxBoolean(false));
                        if (com.yalla.yalla.util.permission.OooO00o.OooO00o(o000O00O.OooO00o(), PermissionGroupReveal.f32336OooO0O0)) {
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            C0302OooO0O0 c0302OooO0O0 = new C0302OooO0O0(eventModel, null);
                            this.f23652OooO0o0 = eventSubscribeModel;
                            this.f23650OooO0Oo = 1;
                            if (BuildersKt.withContext(io2, c0302OooO0O0, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eventSubscribeModel2 = eventSubscribeModel;
                        }
                    } else {
                        eventViewModel.setAddToCalendarEventModel(eventModel);
                        Context context = o000O00O.f13421OooO00o;
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32336OooO0O0, null, new OooO00o(eventViewModel));
                        }
                    }
                    LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER").post(new SubscribeNotifyModel(eventModel.getId(), !eventModel.getHasSubscribe(), eventSubscribeModel != null ? eventSubscribeModel.getSubCount() : 0));
                    this.f23654OooO0oo.invoke(Boxing.boxBoolean(!eventModel.getHasSubscribe()));
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventSubscribeModel2 = (EventSubscribeModel) this.f23652OooO0o0;
                ResultKt.throwOnFailure(obj);
                eventSubscribeModel = eventSubscribeModel2;
                LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER").post(new SubscribeNotifyModel(eventModel.getId(), !eventModel.getHasSubscribe(), eventSubscribeModel != null ? eventSubscribeModel.getSubCount() : 0));
                this.f23654OooO0oo.invoke(Boxing.boxBoolean(!eventModel.getHasSubscribe()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(EventModel eventModel, EventViewModel eventViewModel, Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.f23647OooO0o0 = eventViewModel;
            this.f23646OooO0o = eventModel;
            this.f23648OooO0oO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f23646OooO0o, this.f23647OooO0o0, continuation, this.f23648OooO0oO);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23645OooO0Oo;
            EventModel eventModel = this.f23646OooO0o;
            EventViewModel eventViewModel = this.f23647OooO0o0;
            if (i != 0) {
                if (i == 1) {
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
            eventViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            long id = eventModel.getId();
            int i2 = !eventModel.getHasSubscribe() ? 1 : 0;
            this.f23645OooO0Oo = 1;
            String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/Subscribe");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0O0, "url", strOooO0O0, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(id), "eventId");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "type");
            obj = OooOOO.OooO0Oo(new EventRepo$subscribeEvent$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(eventViewModel, null);
            OooO0O0 oooO0O0 = new OooO0O0(eventModel, eventViewModel, null, this.f23648OooO0oO);
            this.f23645OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, oooO00o, null, oooO0O0, this, 5) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public EventViewModel() {
        RoomLoginInformation.RoomBean room;
        RoomIndexModel value = o0O00oO0.f47987Ooooo00.getValue();
        if (value != null) {
            setRoomIdForUser(o0OoOo0.OooO(0L, value.barid));
        }
        RoomLoginInformation roomLoginInformation = MixedRoomDataSource.OooO0o0().f22992OooO0o0;
        if (roomLoginInformation == null || (room = roomLoginInformation.getRoom()) == null) {
            return;
        }
        setRoomId(room.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subscribeEvent$default(EventViewModel eventViewModel, EventModel eventModel, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeEvent");
        }
        if ((i & 2) != 0) {
            function1 = OooO0OO.f23644OooO0Oo;
        }
        eventViewModel.subscribeEvent(eventModel, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final EventModel getAddToCalendarEventModel() {
        return (EventModel) this.addToCalendarEventModel.getValue();
    }

    @NotNull
    public final MutableSharedFlow<ApiResult<EventCreateStateModel>> getCreateEventState(long roomId) {
        MutableSharedFlow<ApiResult<EventCreateStateModel>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(roomId, mutableSharedFlowMutableSharedFlow$default, null), 2, null);
        return mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getRoomId() {
        return ((Number) this.roomId.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getRoomIdForUser() {
        return ((Number) this.roomIdForUser.getValue()).longValue();
    }

    @NotNull
    public final MutableState<Boolean> getShowAddToCalendarDialog() {
        return this.showAddToCalendarDialog;
    }

    public final void getSquareEventRoom() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }

    @NotNull
    public final SnapshotStateList<SquareEventRoomModel> getSquareEventRooms() {
        return this.squareEventRooms;
    }

    public final void setAddToCalendarEventModel(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "<set-?>");
        this.addToCalendarEventModel.setValue(eventModel);
    }

    public final void setRoomId(long j) {
        this.roomId.setValue(Long.valueOf(j));
    }

    public final void setRoomIdForUser(long j) {
        this.roomIdForUser.setValue(Long.valueOf(j));
    }

    public final void subscribeEvent(@NotNull EventModel eventModel, @NotNull Function1<? super Boolean, Unit> requestAction) {
        Intrinsics.checkNotNullParameter(eventModel, "eventModel");
        Intrinsics.checkNotNullParameter(requestAction, "requestAction");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(eventModel, this, null, requestAction), 3, null);
    }

    public final void updateReadState(long roomId) {
        Iterator<SquareEventRoomModel> it = this.squareEventRooms.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getRoomId() == roomId) {
                SquareEventRoomModel squareEventRoomModel = this.squareEventRooms.get(i);
                squareEventRoomModel.setNewRoomEvent(false);
                this.squareEventRooms.set(i, squareEventRoomModel.clone());
            }
            i++;
        }
        i = -1;
        SquareEventRoomModel squareEventRoomModel2 = this.squareEventRooms.get(i);
        squareEventRoomModel2.setNewRoomEvent(false);
        this.squareEventRooms.set(i, squareEventRoomModel2.clone());
    }

    public final void updateTimeDivision(@Nullable List<EventModel> list) {
        if (list != null) {
            String str = "";
            String str2 = "";
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                EventModel eventModel = (EventModel) obj;
                long eventStartTime = eventModel.getEventStartTime();
                Locale locale = Locale.ENGLISH;
                Calendar calendar = Calendar.getInstance(locale);
                Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
                if (String.valueOf(eventStartTime).length() == 10) {
                    eventStartTime *= (long) 1000;
                }
                calendar.setTimeInMillis(eventStartTime);
                Calendar calendar2 = Calendar.getInstance(locale);
                Intrinsics.checkNotNullExpressionValue(calendar2, "apply(...)");
                calendar2.setTimeInMillis(System.currentTimeMillis());
                if (calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
                    if (i == 0 || !Intrinsics.areEqual(str2, this.today)) {
                        eventModel.setDateTag(this.today);
                    } else {
                        eventModel.setDateTag(str);
                    }
                    str2 = this.today;
                } else {
                    long eventStartTime2 = eventModel.getEventStartTime();
                    Calendar calendar3 = Calendar.getInstance(locale);
                    Intrinsics.checkNotNullExpressionValue(calendar3, "getInstance(...)");
                    if (String.valueOf(eventStartTime2).length() == 10) {
                        eventStartTime2 *= (long) 1000;
                    }
                    calendar3.setTimeInMillis(eventStartTime2);
                    Calendar calendar4 = Calendar.getInstance(locale);
                    Intrinsics.checkNotNullExpressionValue(calendar4, "apply(...)");
                    calendar4.setTimeInMillis(System.currentTimeMillis());
                    if (calendar4.get(1) == calendar3.get(1) && calendar4.get(6) == calendar3.get(6) + 1) {
                        if (i == 0 || !Intrinsics.areEqual(str2, this.today)) {
                            eventModel.setDateTag(this.today);
                        } else {
                            eventModel.setDateTag(str);
                        }
                        str2 = this.today;
                    } else {
                        long eventStartTime3 = eventModel.getEventStartTime();
                        Calendar calendar5 = Calendar.getInstance(locale);
                        Intrinsics.checkNotNullExpressionValue(calendar5, "getInstance(...)");
                        if (String.valueOf(eventStartTime3).length() == 10) {
                            eventStartTime3 *= (long) 1000;
                        }
                        calendar5.setTimeInMillis(eventStartTime3);
                        Calendar calendar6 = Calendar.getInstance(locale);
                        Intrinsics.checkNotNullExpressionValue(calendar6, "getInstance(...)");
                        calendar6.setTimeInMillis(System.currentTimeMillis());
                        if (calendar6.get(1) == calendar5.get(1) && calendar6.get(3) == calendar5.get(3)) {
                            if (i == 0 || !Intrinsics.areEqual(str2, this.weekly)) {
                                eventModel.setDateTag(this.weekly);
                            } else {
                                eventModel.setDateTag(str);
                            }
                            str2 = this.weekly;
                        } else {
                            long eventStartTime4 = eventModel.getEventStartTime();
                            Calendar calendar7 = Calendar.getInstance(locale);
                            Intrinsics.checkNotNullExpressionValue(calendar7, "getInstance(...)");
                            if (String.valueOf(eventStartTime4).length() == 10) {
                                eventStartTime4 *= (long) 1000;
                            }
                            calendar7.setTimeInMillis(eventStartTime4);
                            Calendar calendar8 = Calendar.getInstance(locale);
                            Intrinsics.checkNotNullExpressionValue(calendar8, "getInstance(...)");
                            calendar8.setTimeInMillis(System.currentTimeMillis());
                            if (calendar8.get(1) == calendar7.get(1) && calendar8.get(3) == calendar7.get(3) - 1) {
                                if (i == 0 || !Intrinsics.areEqual(str2, this.nextWeekly)) {
                                    eventModel.setDateTag(this.nextWeekly);
                                } else {
                                    eventModel.setDateTag(str);
                                }
                                str2 = this.nextWeekly;
                            } else {
                                eventModel.setDateTag(str);
                            }
                        }
                    }
                }
                i = i2;
                str = str;
            }
        }
    }
}
