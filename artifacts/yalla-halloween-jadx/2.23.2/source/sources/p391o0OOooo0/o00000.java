package p391o0OOooo0;

import androidx.lifecycle.MutableLiveData;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.VideoType;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.service.room.OooO00o;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p415o0Oo0oO0.o00Ooo;
import p466o0OooOoo.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$updateAllListData$1", f = "GiftPropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGiftPropManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$updateAllListData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1855#2:382\n1864#2,3:383\n1856#2:386\n*S KotlinDebug\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$updateAllListData$1\n*L\n220#1:382\n223#1:383,3\n220#1:386\n*E\n"})
public final class o00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<GiftPropAll> f43552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f43553OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(List<GiftPropAll> list, Function0<Unit> function0, Continuation<? super o00000> continuation) {
        super(2, continuation);
        this.f43552OooO0Oo = list;
        this.f43553OooO0o0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000(this.f43552OooO0Oo, this.f43553OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map<Integer, GiftPropModel> value = oo0o0Oo.f43573OooO00o.getValue();
        if (value != null) {
            value.clear();
        }
        List<GiftPropAll> value2 = oo0o0Oo.f43576OooO0Oo.getValue();
        if (value2 != null) {
            value2.clear();
        }
        List<GiftPropModel> value3 = oo0o0Oo.f43575OooO0OO.getValue();
        if (value3 != null) {
            value3.clear();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<GiftPropAll> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<GiftPropAll> list = this.f43552OooO0Oo;
        if (list != null) {
            for (GiftPropAll giftPropAll : list) {
                giftPropAll.initTitleNamesAndShowArea();
                arrayList.add(giftPropAll);
                List<GiftPropModel> listAll = giftPropAll.getListAll();
                if (listAll != null) {
                    int i = 0;
                    for (Object obj2 : listAll) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        GiftPropModel giftPropModel = (GiftPropModel) obj2;
                        linkedHashMap.put(Boxing.boxInt(giftPropModel.getGiftId()), giftPropModel);
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                        if (giftPropModel.getEffectFrameType() == 1 || giftPropModel.getEffectFrameType() == 2) {
                            VideoModel videoModelOf = VideoModel.INSTANCE.of(giftPropModel.getVideoUrl(), VideoType.YYEva);
                            RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
                            File file = o0O0o00O.f47844OooO00o;
                            RoomGiftVideoPlayDownloadManager.addDownloadVideo$default(roomGiftVideoPlayDownloadManager, videoModelOf, o0O0o00O.OooO0OO(), GlobalScope.INSTANCE, false, 8, null);
                        }
                        if (giftPropModel.getIsNew()) {
                            arrayList2.add(giftPropModel);
                        }
                        i = i2;
                    }
                }
            }
        }
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oo0o0Oo.f43573OooO00o;
        for (GiftPropAll giftPropAll2 : arrayList) {
            if (giftPropAll2.getIsNewTimeStamp() <= 0 || !o00Ooo.OooOO0O().OooOO0O(giftPropAll2.getGiftPropTypeUser())) {
                giftPropAll2.setRedPostCountLocal(0L);
            } else {
                giftPropAll2.setRedPostCountLocal(1L);
                OooO00o.f24527OooOOo0.OooO0Oo(true);
            }
        }
        oo0o0Oo.f43573OooO00o.postValue(linkedHashMap);
        oo0o0Oo.f43576OooO0Oo.postValue(arrayList);
        oo0o0Oo.f43575OooO0OO.postValue(arrayList2);
        Function0<Unit> function0 = this.f43553OooO0o0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
