package com.yalla.yalla.ui.vm.event;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFile;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.EventTagModel;
import com.yalla.yalla.model.EventModel;
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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o0000O0;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p520o0o0O0O0.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bd\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R+\u0010*\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R+\u00101\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010)\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00105\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010)\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R+\u00109\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R/\u0010?\u001a\u0004\u0018\u00010\u001a2\b\u0010'\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010F\u001a\u00020@2\u0006\u0010'\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010)\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010J\u001a\u00020@2\u0006\u0010'\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010)\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER+\u0010N\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010)\u001a\u0004\bL\u0010.\"\u0004\bM\u00100R+\u0010R\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010)\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R+\u0010\u0006\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010)\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010[\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010)\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010)\u001a\u0004\b]\u0010.\"\u0004\b^\u00100R+\u0010b\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010)\u001a\u0004\b`\u0010\u0016\"\u0004\ba\u0010\u0018¨\u0006e"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventCreateViewModel;", "Lo00OO/OooO00o;", "", "getTagList", "", "createToken", ContributionFragment.ARG_1, "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "create", "Lcom/yalla/yalla/model/EventModel;", "addToCalendarEventModel", "Lcom/yalla/yalla/model/EventModel;", "getAddToCalendarEventModel", "()Lcom/yalla/yalla/model/EventModel;", "setAddToCalendarEventModel", "(Lcom/yalla/yalla/model/EventModel;)V", "", "showPermission", "Z", "getShowPermission", "()Z", "setShowPermission", "(Z)V", "", "Lcom/yalla/yalla/common/model/EventTagModel;", "tagList", "Ljava/util/List;", "()Ljava/util/List;", "setTagList", "(Ljava/util/List;)V", "", "maxCountName", "I", "getMaxCountName", "()I", "maxCountDescribe", "getMaxCountDescribe", "<set-?>", "isDefaultPic$delegate", "Lo000oOoO/o0O00OO;", "isDefaultPic", "setDefaultPic", "headPath$delegate", "getHeadPath", "()Ljava/lang/String;", "setHeadPath", "(Ljava/lang/String;)V", "headPath", "headUrl$delegate", "getHeadUrl", "setHeadUrl", "headUrl", "name$delegate", "getName", "setName", "name", "selectTag$delegate", "getSelectTag", "()Lcom/yalla/yalla/common/model/EventTagModel;", "setSelectTag", "(Lcom/yalla/yalla/common/model/EventTagModel;)V", "selectTag", "Ljava/util/Calendar;", "dateModelStart$delegate", "getDateModelStart", "()Ljava/util/Calendar;", "setDateModelStart", "(Ljava/util/Calendar;)V", "dateModelStart", "dateModelEnd$delegate", "getDateModelEnd", "setDateModelEnd", "dateModelEnd", "describe$delegate", "getDescribe", "setDescribe", "describe", "roomName$delegate", "getRoomName", "setRoomName", "roomName", "roomId$delegate", "getRoomId", "()J", "setRoomId", "(J)V", "roomIdx$delegate", "getRoomIdx", "setRoomIdx", "roomIdx", "createToken$delegate", "getCreateToken", "setCreateToken", "describeHasFocus$delegate", "getDescribeHasFocus", "setDescribeHasFocus", "describeHasFocus", "_eventModel", "<init>", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventCreateViewModel extends o00OO.OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: createToken$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO createToken;

    /* JADX INFO: renamed from: dateModelEnd$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO dateModelEnd;

    /* JADX INFO: renamed from: dateModelStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO dateModelStart;

    /* JADX INFO: renamed from: describe$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO describe;

    /* JADX INFO: renamed from: describeHasFocus$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO describeHasFocus;

    /* JADX INFO: renamed from: headPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO headPath;

    /* JADX INFO: renamed from: headUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO headUrl;

    /* JADX INFO: renamed from: isDefaultPic$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isDefaultPic;
    private final int maxCountDescribe;
    private final int maxCountName;

    /* JADX INFO: renamed from: name$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO name;

    /* JADX INFO: renamed from: roomId$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO roomId;

    /* JADX INFO: renamed from: roomIdx$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO roomIdx;

    /* JADX INFO: renamed from: roomName$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO roomName;

    /* JADX INFO: renamed from: selectTag$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO selectTag;
    private boolean showPermission;

    @NotNull
    private EventModel addToCalendarEventModel = new EventModel();

    @NotNull
    private List<EventTagModel> tagList = new ArrayList();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventCreateViewModel$create$1", f = "EventCreateViewModel.kt", i = {0, 1, 1, 1, 1}, l = {94, 102}, m = "invokeSuspend", n = {"$this$jobLiveData", "$this$jobLiveData", "eventDesc", "eventStartTime", "eventEndTime"}, s = {"L$0", "L$0", "L$1", "J$0", "J$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<OooOOOO<ApiResult<Long>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25408Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public String f25409Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public long f25410Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public long f25411Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25412OoooO;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25414OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25415OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25415OoooO0O = str;
            this.f25412OoooO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = EventCreateViewModel.this.new OooO00o(this.f25415OoooO0O, this.f25412OoooO, continuation);
            oooO00o.f25414OoooO00 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<Long>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00e9 A[LOOP:0: B:32:0x00e7->B:33:0x00e9, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:36:0x00f6 A[LOOP:1: B:35:0x00f4->B:36:0x00f6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:39:0x0113  */
        /* JADX WARN: Code duplicated, block: B:40:0x0118  */
        /* JADX WARN: Code duplicated, block: B:45:0x0127  */
        /* JADX WARN: Code duplicated, block: B:48:0x014d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x014e  */
        /* JADX WARN: Code duplicated, block: B:52:0x015c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object objUploadFile;
            OooOOOO oooOOOO2;
            long timeInMillis;
            long timeInMillis2;
            String describe;
            int iIndexOf$default;
            int i;
            String strOooOo00;
            EventTagModel selectTag;
            int id;
            EventTagModel selectTag2;
            String tagName;
            String str;
            Object objOooO00o;
            long j;
            long j2;
            OooOOOO oooOOOO3;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f25408Oooo;
            if (i2 != 0) {
                if (i2 == 1) {
                    OooOOOO oooOOOO4 = (OooOOOO) this.f25414OoooO00;
                    ResultKt.throwOnFailure(obj);
                    oooOOOO = oooOOOO4;
                    objUploadFile = obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = this.f25411Oooo0oo;
                    long j4 = this.f25410Oooo0oO;
                    String str2 = this.f25409Oooo0o;
                    oooOOOO3 = (OooOOOO) this.f25414OoooO00;
                    ResultKt.throwOnFailure(obj);
                    str = str2;
                    j2 = j4;
                    j = j3;
                    objOooO00o = obj;
                }
                apiResult = (ApiResult) objOooO00o;
                if (apiResult.isSuccess()) {
                    EventCreateViewModel.this.getAddToCalendarEventModel().setEventName(EventCreateViewModel.this.getName());
                    EventCreateViewModel.this.getAddToCalendarEventModel().setEventDesc(str);
                    EventCreateViewModel.this.getAddToCalendarEventModel().setEventStartTime(j2);
                    EventCreateViewModel.this.getAddToCalendarEventModel().setEventEndTime(j);
                }
                EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                oooOOOO3.postValue(apiResult);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            oooOOOO = (OooOOOO) this.f25414OoooO00;
            EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            if (EventCreateViewModel.this.getHeadPath().length() > 0) {
                if (EventCreateViewModel.this.getHeadUrl().length() == 0) {
                    CloudFileType cloudFileType = CloudFileType.ROOM_EVENT_AVATAR;
                    Uri uri = Uri.parse(EventCreateViewModel.this.getHeadPath());
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(headPath)");
                    this.f25414OoooO00 = oooOOOO;
                    this.f25408Oooo = 1;
                    objUploadFile = CloudFile.INSTANCE.getManager().uploadFile(cloudFileType, uri, (Long) null, false, (Continuation<? super CloudFileInfo>) this);
                    if (objUploadFile == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            oooOOOO2 = oooOOOO;
            long j5 = 1000;
            timeInMillis = EventCreateViewModel.this.getDateModelStart().getTimeInMillis() / j5;
            timeInMillis2 = EventCreateViewModel.this.getDateModelEnd().getTimeInMillis() / j5;
            describe = EventCreateViewModel.this.getDescribe();
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter("\n", "chat");
            i = 0;
            for (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) describe, "\n", 0, false, 6, (Object) null); iIndexOf$default >= 0; iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) describe, "\n", iIndexOf$default + 1, false, 4, (Object) null)) {
                i++;
            }
            strOooOo00 = describe;
            while (i >= 0) {
                i--;
                strOooOo00 = StringsKt.OooOo00(strOooOo00, "\n\n", "\n");
            }
            Oooo0 oooo0 = Oooo0.f42257OooO00o;
            String str3 = this.f25415OoooO0O;
            String str4 = this.f25412OoooO;
            String name = EventCreateViewModel.this.getName();
            selectTag = EventCreateViewModel.this.getSelectTag();
            if (selectTag != null) {
                id = selectTag.getId();
            } else {
                id = 0;
            }
            selectTag2 = EventCreateViewModel.this.getSelectTag();
            if (selectTag2 != null || (tagName = selectTag2.getTagName()) == null) {
                tagName = "";
            }
            String headUrl = EventCreateViewModel.this.getHeadUrl();
            this.f25414OoooO00 = oooOOOO2;
            this.f25409Oooo0o = strOooOo00;
            this.f25410Oooo0oO = timeInMillis;
            this.f25411Oooo0oo = timeInMillis2;
            this.f25408Oooo = 2;
            str = strOooOo00;
            objOooO00o = oooo0.OooO00o(str3, str4, name, id, tagName, headUrl, timeInMillis, timeInMillis2, strOooOo00, this);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = timeInMillis2;
            j2 = timeInMillis;
            oooOOOO3 = oooOOOO2;
            apiResult = (ApiResult) objOooO00o;
            if (apiResult.isSuccess()) {
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventName(EventCreateViewModel.this.getName());
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventDesc(str);
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventStartTime(j2);
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventEndTime(j);
            }
            EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            oooOOOO3.postValue(apiResult);
            return Unit.INSTANCE;
            CloudFileInfo cloudFileInfo = (CloudFileInfo) objUploadFile;
            if (cloudFileInfo != null) {
                if (cloudFileInfo.getUrl().length() > 0) {
                    EventCreateViewModel.this.setHeadUrl(cloudFileInfo.getUrl());
                }
            }
            oooOOOO2 = oooOOOO;
            long j6 = 1000;
            timeInMillis = EventCreateViewModel.this.getDateModelStart().getTimeInMillis() / j6;
            timeInMillis2 = EventCreateViewModel.this.getDateModelEnd().getTimeInMillis() / j6;
            describe = EventCreateViewModel.this.getDescribe();
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter(describe, "<this>");
            Intrinsics.checkNotNullParameter("\n", "chat");
            i = 0;
            while (iIndexOf$default >= 0) {
                i++;
            }
            strOooOo00 = describe;
            while (i >= 0) {
                i--;
                strOooOo00 = StringsKt.OooOo00(strOooOo00, "\n\n", "\n");
            }
            Oooo0 oooo1 = Oooo0.f42257OooO00o;
            String str5 = this.f25415OoooO0O;
            String str6 = this.f25412OoooO;
            String name2 = EventCreateViewModel.this.getName();
            selectTag = EventCreateViewModel.this.getSelectTag();
            if (selectTag != null) {
                id = selectTag.getId();
            } else {
                id = 0;
            }
            selectTag2 = EventCreateViewModel.this.getSelectTag();
            if (selectTag2 != null) {
                tagName = "";
            } else {
                tagName = "";
            }
            String headUrl2 = EventCreateViewModel.this.getHeadUrl();
            this.f25414OoooO00 = oooOOOO2;
            this.f25409Oooo0o = strOooOo00;
            this.f25410Oooo0oO = timeInMillis;
            this.f25411Oooo0oo = timeInMillis2;
            this.f25408Oooo = 2;
            str = strOooOo00;
            objOooO00o = oooo1.OooO00o(str5, str6, name2, id, tagName, headUrl2, timeInMillis, timeInMillis2, strOooOo00, this);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = timeInMillis2;
            j2 = timeInMillis;
            oooOOOO3 = oooOOOO2;
            apiResult = (ApiResult) objOooO00o;
            if (apiResult.isSuccess()) {
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventName(EventCreateViewModel.this.getName());
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventDesc(str);
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventStartTime(j2);
                EventCreateViewModel.this.getAddToCalendarEventModel().setEventEndTime(j);
            }
            EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            oooOOOO3.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventCreateViewModel$getTagList$1", f = "EventCreateViewModel.kt", i = {}, l = {74, 75}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f25416Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25417Oooo0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventCreateViewModel$getTagList$1$1$1", f = "EventCreateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ ApiResult<List<EventTagModel>> f25419Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ EventCreateViewModel f25420Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<List<EventTagModel>> apiResult, EventCreateViewModel eventCreateViewModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25419Oooo0o = apiResult;
                this.f25420Oooo0oO = eventCreateViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25419Oooo0o, this.f25420Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0035  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List<EventTagModel> data;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (this.f25419Oooo0o.isSuccess() && (data = this.f25419Oooo0o.getData()) != null) {
                    EventCreateViewModel eventCreateViewModel = this.f25420Oooo0oO;
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
            int i = this.f25417Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            Oooo0 oooo0 = Oooo0.f42257OooO00o;
            this.f25417Oooo0oO = 1;
            obj = oooo0.OooOO0O(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            EventCreateViewModel eventCreateViewModel = EventCreateViewModel.this;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o((ApiResult) obj, eventCreateViewModel, null);
            this.f25416Oooo0o = obj;
            this.f25417Oooo0oO = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            EventCreateViewModel.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    public EventCreateViewModel(@Nullable EventModel eventModel) {
        Boolean bool = Boolean.FALSE;
        this.isDefaultPic = o0OOO00.OooO0Oo(bool);
        this.headPath = o0OOO00.OooO0Oo("");
        this.headUrl = o0OOO00.OooO0Oo("");
        this.name = o0OOO00.OooO0Oo("");
        this.selectTag = o0OOO00.OooO0Oo(null);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((((long) 3) * 3600000) + System.currentTimeMillis());
        calendar.set(12, 0);
        calendar.set(13, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance().apply {\n  …alendar.SECOND] = 0\n    }");
        this.dateModelStart = o0OOO00.OooO0Oo(calendar);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis((((long) 2) * 3600000) + getDateModelStart().getTimeInMillis());
        Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance().apply {\n  …xt.getHourMillis(2)\n    }");
        this.dateModelEnd = o0OOO00.OooO0Oo(calendar2);
        this.describe = o0OOO00.OooO0Oo("");
        this.roomName = o0OOO00.OooO0Oo("");
        this.roomId = o0OOO00.OooO0Oo(0L);
        this.roomIdx = o0OOO00.OooO0Oo(0L);
        this.createToken = o0OOO00.OooO0Oo("");
        this.describeHasFocus = o0OOO00.OooO0Oo(bool);
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
    public final OooOOOO<ApiResult<Long>> create(@NotNull String createToken, @NotNull String roomId) {
        Intrinsics.checkNotNullParameter(createToken, "createToken");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return OooOOO0.OooO00o(this, new OooO00o(createToken, roomId, null));
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
    public final void m492getTagList() {
        o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0O0(null));
    }
}
