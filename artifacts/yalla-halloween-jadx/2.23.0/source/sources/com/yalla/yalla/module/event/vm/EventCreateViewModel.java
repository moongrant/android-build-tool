package com.yalla.yalla.module.event.vm;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.EventRepo$create$$inlined$call$1;
import com.yalla.yalla.data.repository.EventRepo$getTagList$$inlined$call$1;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.event.EventTagModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136o00OOOo0.OooO0OO;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bd\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R+\u0010*\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010.\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R/\u00108\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\"\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010?\u001a\u0002092\u0006\u0010 \u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\"\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010C\u001a\u0002092\u0006\u0010 \u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R+\u0010G\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\"\u001a\u0004\bE\u0010'\"\u0004\bF\u0010)R+\u0010K\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\"\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R+\u0010\u0006\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\"\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR+\u0010T\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\"\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\"\u001a\u0004\bV\u0010'\"\u0004\bW\u0010)R+\u0010[\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\"\u001a\u0004\bY\u0010\u0016\"\u0004\bZ\u0010\u0018R\u001a\u0010]\u001a\u00020\\8\u0006X\u0086D¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020\\8\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bb\u0010`¨\u0006e"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventCreateViewModel;", "Lo0Oo00oO/o0O0O00;", "", "getTagList", "", "createToken", ContributionFragment.ARG_1, "Lo0OoO0OO/o0OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "create", "Lcom/yalla/yalla/model/event/EventModel;", "addToCalendarEventModel", "Lcom/yalla/yalla/model/event/EventModel;", "getAddToCalendarEventModel", "()Lcom/yalla/yalla/model/event/EventModel;", "setAddToCalendarEventModel", "(Lcom/yalla/yalla/model/event/EventModel;)V", "", "showPermission", "Z", "getShowPermission", "()Z", "setShowPermission", "(Z)V", "", "Lcom/yalla/yalla/model/event/EventTagModel;", "tagList", "Ljava/util/List;", "()Ljava/util/List;", "setTagList", "(Ljava/util/List;)V", "<set-?>", "isDefaultPic$delegate", "Landroidx/compose/runtime/MutableState;", "isDefaultPic", "setDefaultPic", "headPath$delegate", "getHeadPath", "()Ljava/lang/String;", "setHeadPath", "(Ljava/lang/String;)V", "headPath", "headUrl$delegate", "getHeadUrl", "setHeadUrl", "headUrl", "name$delegate", "getName", "setName", "name", "selectTag$delegate", "getSelectTag", "()Lcom/yalla/yalla/model/event/EventTagModel;", "setSelectTag", "(Lcom/yalla/yalla/model/event/EventTagModel;)V", "selectTag", "Ljava/util/Calendar;", "dateModelStart$delegate", "getDateModelStart", "()Ljava/util/Calendar;", "setDateModelStart", "(Ljava/util/Calendar;)V", "dateModelStart", "dateModelEnd$delegate", "getDateModelEnd", "setDateModelEnd", "dateModelEnd", "describe$delegate", "getDescribe", "setDescribe", "describe", "roomName$delegate", "getRoomName", "setRoomName", "roomName", "roomId$delegate", "getRoomId", "()J", "setRoomId", "(J)V", "roomIdx$delegate", "getRoomIdx", "setRoomIdx", "roomIdx", "createToken$delegate", "getCreateToken", "setCreateToken", "describeHasFocus$delegate", "getDescribeHasFocus", "setDescribeHasFocus", "describeHasFocus", "", "maxCountName", "I", "getMaxCountName", "()I", "maxCountDescribe", "getMaxCountDescribe", "_eventModel", "<init>", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventCreateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventCreateViewModel.kt\ncom/yalla/yalla/module/event/vm/EventCreateViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,122:1\n81#2:123\n107#2,2:124\n81#2:126\n107#2,2:127\n81#2:129\n107#2,2:130\n81#2:132\n107#2,2:133\n81#2:135\n107#2,2:136\n81#2:138\n107#2,2:139\n81#2:141\n107#2,2:142\n81#2:144\n107#2,2:145\n81#2:147\n107#2,2:148\n81#2:150\n107#2,2:151\n81#2:153\n107#2,2:154\n81#2:156\n107#2,2:157\n81#2:159\n107#2,2:160\n*S KotlinDebug\n*F\n+ 1 EventCreateViewModel.kt\ncom/yalla/yalla/module/event/vm/EventCreateViewModel\n*L\n27#1:123\n27#1:124,2\n28#1:126\n28#1:127,2\n29#1:129\n29#1:130,2\n30#1:132\n30#1:133,2\n31#1:135\n31#1:136,2\n32#1:138\n32#1:139,2\n39#1:141\n39#1:142,2\n42#1:144\n42#1:145,2\n43#1:147\n43#1:148,2\n44#1:150\n44#1:151,2\n45#1:153\n45#1:154,2\n46#1:156\n46#1:157,2\n47#1:159\n47#1:160,2\n*E\n"})
public final class EventCreateViewModel extends o0O0O00 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: createToken$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState createToken;

    /* JADX INFO: renamed from: dateModelEnd$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dateModelEnd;

    /* JADX INFO: renamed from: dateModelStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dateModelStart;

    /* JADX INFO: renamed from: describe$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState describe;

    /* JADX INFO: renamed from: describeHasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState describeHasFocus;

    /* JADX INFO: renamed from: headPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState headPath;

    /* JADX INFO: renamed from: headUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState headUrl;

    /* JADX INFO: renamed from: isDefaultPic$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isDefaultPic;
    private final int maxCountDescribe;
    private final int maxCountName;

    /* JADX INFO: renamed from: name$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState name;

    /* JADX INFO: renamed from: roomId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState roomId;

    /* JADX INFO: renamed from: roomIdx$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState roomIdx;

    /* JADX INFO: renamed from: roomName$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState roomName;

    /* JADX INFO: renamed from: selectTag$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState selectTag;
    private boolean showPermission;

    @NotNull
    private EventModel addToCalendarEventModel = new EventModel();

    @NotNull
    private List<EventTagModel> tagList = new ArrayList();

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventCreateViewModel$create$1", f = "EventCreateViewModel.kt", i = {0, 1, 1, 1, 1}, l = {93, 101}, m = "invokeSuspend", n = {"$this$jobLiveData", "$this$jobLiveData", "eventDesc", "eventStartTime", "eventEndTime"}, s = {"L$0", "L$0", "L$1", "J$0", "J$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OO00O<ApiResult<Long>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f24068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f24069OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f24070OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f24071OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f24072OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ String f24073OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ String f24074OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f24073OooOO0 = str;
            this.f24074OooOO0O = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = EventCreateViewModel.this.new OooO00o(this.f24073OooOO0, this.f24074OooOO0O, continuation);
            oooO00o.f24072OooO0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<Long>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00d1 A[LOOP:0: B:32:0x00cf->B:33:0x00d1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:35:0x00dd A[LOOP:1: B:34:0x00db->B:35:0x00dd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:43:0x0100  */
        /* JADX WARN: Code duplicated, block: B:46:0x0166 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x0167  */
        /* JADX WARN: Code duplicated, block: B:50:0x0173  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            o0OO00O o0oo00o3;
            long timeInMillis;
            long timeInMillis2;
            String describe;
            int iIndexOf$default;
            int i;
            EventTagModel selectTag;
            String tagName;
            Object objOooO0Oo;
            String str;
            long j;
            long j2;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f24071OooO0oO;
            EventCreateViewModel eventCreateViewModel = EventCreateViewModel.this;
            if (i2 != 0) {
                if (i2 == 1) {
                    o0oo00o2 = (o0OO00O) this.f24072OooO0oo;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.f24069OooO0o;
                    j = this.f24070OooO0o0;
                    str = this.f24068OooO0Oo;
                    o0oo00o3 = (o0OO00O) this.f24072OooO0oo;
                    ResultKt.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult.isSuccess()) {
                    eventCreateViewModel.getAddToCalendarEventModel().setEventName(eventCreateViewModel.getName());
                    eventCreateViewModel.getAddToCalendarEventModel().setEventDesc(str);
                    eventCreateViewModel.getAddToCalendarEventModel().setEventStartTime(j);
                    eventCreateViewModel.getAddToCalendarEventModel().setEventEndTime(j2);
                }
                eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                o0oo00o3.postValue(apiResult);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o0oo00o2 = (o0OO00O) this.f24072OooO0oo;
            eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            if (eventCreateViewModel.getHeadPath().length() > 0) {
                if (eventCreateViewModel.getHeadUrl().length() == 0) {
                    CloudFileRepo cloudFileRepo = new CloudFileRepo();
                    CloudFileType cloudFileType = CloudFileType.ROOM_EVENT_AVATAR;
                    Uri uri = Uri.parse(eventCreateViewModel.getHeadPath());
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(headPath)");
                    this.f24072OooO0oo = o0oo00o2;
                    this.f24071OooO0oO = 1;
                    obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            o0oo00o3 = o0oo00o2;
            long j3 = 1000;
            timeInMillis = eventCreateViewModel.getDateModelStart().getTimeInMillis() / j3;
            timeInMillis2 = eventCreateViewModel.getDateModelEnd().getTimeInMillis() / j3;
            describe = eventCreateViewModel.getDescribe();
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter("\n", "chat");
            i = 0;
            for (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) describe, "\n", 0, false, 6, (Object) null); iIndexOf$default >= 0; iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) describe, "\n", iIndexOf$default + 1, false, 4, (Object) null)) {
                i++;
            }
            while (i >= 0) {
                i--;
                describe = StringsKt.OooOoO(describe, "\n\n", "\n");
            }
            String name = eventCreateViewModel.getName();
            EventTagModel selectTag2 = eventCreateViewModel.getSelectTag();
            int id = selectTag2 != null ? selectTag2.getId() : 0;
            selectTag = eventCreateViewModel.getSelectTag();
            if (selectTag != null || (tagName = selectTag.getTagName()) == null) {
                tagName = "";
            }
            String headUrl = eventCreateViewModel.getHeadUrl();
            this.f24072OooO0oo = o0oo00o3;
            this.f24068OooO0Oo = describe;
            this.f24070OooO0o0 = timeInMillis;
            this.f24069OooO0o = timeInMillis2;
            this.f24071OooO0oO = 2;
            String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/Create");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 1);
            o0o0oooOooO00o.OooO0O0(this.f24073OooOO0, "createToken");
            o0o0oooOooO00o.OooO0O0(this.f24074OooOO0O, "RoomId");
            o0o0oooOooO00o.OooO0O0(name, "EventName");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(id), "KeyWord");
            o0o0oooOooO00o.OooO0O0(tagName, "KeyWordText");
            o0o0oooOooO00o.OooO0O0(headUrl, "Pic");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(timeInMillis), "StartTime");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(timeInMillis2), "EndTime");
            o0o0oooOooO00o.OooO0O0(describe, "EventDesc");
            objOooO0Oo = OooOOO.OooO0Oo(new EventRepo$create$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = describe;
            obj = objOooO0Oo;
            j = timeInMillis;
            j2 = timeInMillis2;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                eventCreateViewModel.getAddToCalendarEventModel().setEventName(eventCreateViewModel.getName());
                eventCreateViewModel.getAddToCalendarEventModel().setEventDesc(str);
                eventCreateViewModel.getAddToCalendarEventModel().setEventStartTime(j);
                eventCreateViewModel.getAddToCalendarEventModel().setEventEndTime(j2);
            }
            eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            o0oo00o3.postValue(apiResult);
            return Unit.INSTANCE;
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (oooO0OO != null) {
                if (oooO0OO.OooO00o().length() > 0) {
                    eventCreateViewModel.setHeadUrl(oooO0OO.OooO00o());
                }
            }
            o0oo00o3 = o0oo00o2;
            long j4 = 1000;
            timeInMillis = eventCreateViewModel.getDateModelStart().getTimeInMillis() / j4;
            timeInMillis2 = eventCreateViewModel.getDateModelEnd().getTimeInMillis() / j4;
            describe = eventCreateViewModel.getDescribe();
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter("\n", "chat");
            i = 0;
            while (iIndexOf$default >= 0) {
                i++;
            }
            while (i >= 0) {
                i--;
                describe = StringsKt.OooOoO(describe, "\n\n", "\n");
            }
            String name2 = eventCreateViewModel.getName();
            EventTagModel selectTag3 = eventCreateViewModel.getSelectTag();
            if (selectTag3 != null) {
            }
            selectTag = eventCreateViewModel.getSelectTag();
            if (selectTag != null) {
                tagName = "";
            } else {
                tagName = "";
            }
            String headUrl2 = eventCreateViewModel.getHeadUrl();
            this.f24072OooO0oo = o0oo00o3;
            this.f24068OooO0Oo = describe;
            this.f24070OooO0o0 = timeInMillis;
            this.f24069OooO0o = timeInMillis2;
            this.f24071OooO0oO = 2;
            String strOooO0O1 = o000OOo0.OooO0O0("/Webservers/Event/Create");
            o0O0ooO o0o0oooOooO00o2 = o00oOoo.OooO00o(strOooO0O1, "url", strOooO0O1, 1);
            o0o0oooOooO00o2.OooO0O0(this.f24073OooOO0, "createToken");
            o0o0oooOooO00o2.OooO0O0(this.f24074OooOO0O, "RoomId");
            o0o0oooOooO00o2.OooO0O0(name2, "EventName");
            o0o0oooOooO00o2.OooO0O0(Boxing.boxInt(id), "KeyWord");
            o0o0oooOooO00o2.OooO0O0(tagName, "KeyWordText");
            o0o0oooOooO00o2.OooO0O0(headUrl2, "Pic");
            o0o0oooOooO00o2.OooO0O0(Boxing.boxLong(timeInMillis), "StartTime");
            o0o0oooOooO00o2.OooO0O0(Boxing.boxLong(timeInMillis2), "EndTime");
            o0o0oooOooO00o2.OooO0O0(describe, "EventDesc");
            objOooO0Oo = OooOOO.OooO0Oo(new EventRepo$create$$inlined$call$1(o0o0oooOooO00o2, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = describe;
            obj = objOooO0Oo;
            j = timeInMillis;
            j2 = timeInMillis2;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                eventCreateViewModel.getAddToCalendarEventModel().setEventName(eventCreateViewModel.getName());
                eventCreateViewModel.getAddToCalendarEventModel().setEventDesc(str);
                eventCreateViewModel.getAddToCalendarEventModel().setEventStartTime(j);
                eventCreateViewModel.getAddToCalendarEventModel().setEventEndTime(j2);
            }
            eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            o0oo00o3.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventCreateViewModel$getTagList$1", f = "EventCreateViewModel.kt", i = {}, l = {73, 74}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f24075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f24077OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventCreateViewModel$getTagList$1$1$1", f = "EventCreateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ApiResult<List<EventTagModel>> f24078OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ EventCreateViewModel f24079OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<List<EventTagModel>> apiResult, EventCreateViewModel eventCreateViewModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f24078OooO0Oo = apiResult;
                this.f24079OooO0o0 = eventCreateViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f24078OooO0Oo, this.f24079OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0033  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List<EventTagModel> data;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult<List<EventTagModel>> apiResult = this.f24078OooO0Oo;
                if (apiResult.isSuccess() && (data = apiResult.getData()) != null) {
                    EventCreateViewModel eventCreateViewModel = this.f24079OooO0o0;
                    eventCreateViewModel.setTagList(data);
                    if (eventCreateViewModel.getSelectTag() == null) {
                        eventCreateViewModel.setSelectTag(data.get(0));
                    } else {
                        EventTagModel selectTag = eventCreateViewModel.getSelectTag();
                        if (selectTag != null && selectTag.getId() == 0) {
                            eventCreateViewModel.setSelectTag(data.get(0));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventCreateViewModel.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24077OooO0o0;
            EventCreateViewModel eventCreateViewModel = EventCreateViewModel.this;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            this.f24077OooO0o0 = 1;
            String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/GetTagList");
            obj = OooOOO.OooO0Oo(new EventRepo$getTagList$$inlined$call$1(o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o((ApiResult) obj, eventCreateViewModel, null);
            this.f24075OooO0Oo = obj;
            this.f24077OooO0o0 = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            eventCreateViewModel.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    public EventCreateViewModel(@Nullable EventModel eventModel) {
        Boolean bool = Boolean.FALSE;
        this.isDefaultPic = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.headPath = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.headUrl = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.name = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.selectTag = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((((long) 3) * 3600000) + System.currentTimeMillis());
        calendar.set(12, 0);
        calendar.set(13, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply {\n  …alendar.SECOND] = 0\n    }");
        this.dateModelStart = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calendar, null, 2, null);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis((((long) 2) * 3600000) + getDateModelStart().getTimeInMillis());
        Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance().apply {\n  …xt.getHourMillis(2)\n    }");
        this.dateModelEnd = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calendar2, null, 2, null);
        this.describe = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.roomName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.roomId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.roomIdx = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.createToken = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.describeHasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.maxCountName = 120;
        this.maxCountDescribe = 500;
        if (eventModel != null) {
            setDefaultPic(eventModel.getIsDefaultPic());
            setName(eventModel.getEventName());
            EventTagModel eventTagModel = new EventTagModel();
            eventTagModel.setTagName(eventModel.getEventTag());
            eventTagModel.setId(eventModel.getEventTagId());
            eventTagModel.setIcon(eventModel.getEventTagIcon());
            if (eventModel.getIsDefaultPic()) {
                eventTagModel.setEventDefaultPic(eventModel.getEventImage());
            } else {
                setHeadUrl(eventModel.getEventImage());
            }
            setSelectTag(eventTagModel);
            setDescribe(eventModel.getEventDesc());
            setRoomName(eventModel.getRoomName());
            setRoomId(eventModel.getRoomId());
            setRoomIdx(eventModel.getRoomIdx());
            setCreateToken(eventModel.getCreateToken());
        }
    }

    @NotNull
    public final o0OO00O<ApiResult<Long>> create(@NotNull String createToken, @NotNull String roomId) {
        Intrinsics.checkNotNullParameter(createToken, "createToken");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o0ooOOo.OooO00o(this, new OooO00o(createToken, roomId, null));
    }

    @NotNull
    public final EventModel getAddToCalendarEventModel() {
        return this.addToCalendarEventModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getCreateToken() {
        return (String) this.createToken.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Calendar getDateModelEnd() {
        return (Calendar) this.dateModelEnd.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Calendar getDateModelStart() {
        return (Calendar) this.dateModelStart.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getDescribe() {
        return (String) this.describe.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDescribeHasFocus() {
        return ((Boolean) this.describeHasFocus.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getHeadPath() {
        return (String) this.headPath.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getHeadUrl() {
        return (String) this.headUrl.getValue();
    }

    public final int getMaxCountDescribe() {
        return this.maxCountDescribe;
    }

    public final int getMaxCountName() {
        return this.maxCountName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getName() {
        return (String) this.name.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getRoomId() {
        return ((Number) this.roomId.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getRoomIdx() {
        return ((Number) this.roomIdx.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getRoomName() {
        return (String) this.roomName.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final EventTagModel getSelectTag() {
        return (EventTagModel) this.selectTag.getValue();
    }

    public final boolean getShowPermission() {
        return this.showPermission;
    }

    @NotNull
    public final List<EventTagModel> getTagList() {
        return this.tagList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDefaultPic() {
        return ((Boolean) this.isDefaultPic.getValue()).booleanValue();
    }

    public final void setAddToCalendarEventModel(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "<set-?>");
        this.addToCalendarEventModel = eventModel;
    }

    public final void setCreateToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createToken.setValue(str);
    }

    public final void setDateModelEnd(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.dateModelEnd.setValue(calendar);
    }

    public final void setDateModelStart(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<set-?>");
        this.dateModelStart.setValue(calendar);
    }

    public final void setDefaultPic(boolean z) {
        this.isDefaultPic.setValue(Boolean.valueOf(z));
    }

    public final void setDescribe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.describe.setValue(str);
    }

    public final void setDescribeHasFocus(boolean z) {
        this.describeHasFocus.setValue(Boolean.valueOf(z));
    }

    public final void setHeadPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headPath.setValue(str);
    }

    public final void setHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headUrl.setValue(str);
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name.setValue(str);
    }

    public final void setRoomId(long j) {
        this.roomId.setValue(Long.valueOf(j));
    }

    public final void setRoomIdx(long j) {
        this.roomIdx.setValue(Long.valueOf(j));
    }

    public final void setRoomName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomName.setValue(str);
    }

    public final void setSelectTag(@Nullable EventTagModel eventTagModel) {
        this.selectTag.setValue(eventTagModel);
    }

    public final void setShowPermission(boolean z) {
        this.showPermission = z;
    }

    public final void setTagList(@NotNull List<EventTagModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tagList = list;
    }

    /* JADX INFO: renamed from: getTagList, reason: collision with other method in class */
    public final void m4199getTagList() {
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0O0(null));
    }
}
