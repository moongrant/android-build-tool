package p385o0OOooOO;

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
import p408o0Oo0o0O.o00Oo0;
import p416o0Oo0ooo.y0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$updateAllListData$1", f = "GiftPropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGiftPropManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$updateAllListData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,377:1\n1855#2:378\n1864#2,3:379\n1856#2:382\n*S KotlinDebug\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$updateAllListData$1\n*L\n220#1:378\n223#1:379,3\n220#1:382\n*E\n"})
public final class o00O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<GiftPropAll> f44349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f44350OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(List<GiftPropAll> list, Function0<Unit> function0, Continuation<? super o00O0O00> continuation) {
        super(2, continuation);
        this.f44349OooO0Oo = list;
        this.f44350OooO0o0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O00(this.f44349OooO0Oo, this.f44350OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map<Integer, GiftPropModel> value = oOO00O.f44351OooO00o.getValue();
        if (value != null) {
            value.clear();
        }
        List<GiftPropAll> value2 = oOO00O.f44354OooO0Oo.getValue();
        if (value2 != null) {
            value2.clear();
        }
        List<GiftPropModel> value3 = oOO00O.f44353OooO0OO.getValue();
        if (value3 != null) {
            value3.clear();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<GiftPropAll> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<GiftPropAll> list = this.f44349OooO0Oo;
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
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                        if (giftPropModel.getEffectFrameType() == 1 || giftPropModel.getEffectFrameType() == 2) {
                            VideoModel videoModelOf = VideoModel.INSTANCE.of(giftPropModel.getVideoUrl(), VideoType.YYEva);
                            RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
                            File file = y0.f45407OooO00o;
                            RoomGiftVideoPlayDownloadManager.addDownloadVideo$default(roomGiftVideoPlayDownloadManager, videoModelOf, y0.OooO0OO(), GlobalScope.INSTANCE, false, 8, null);
                        }
                        if (giftPropModel.getIsNew()) {
                            arrayList2.add(giftPropModel);
                        }
                        i = i2;
                    }
                }
            }
        }
        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
        for (GiftPropAll giftPropAll2 : arrayList) {
            if (giftPropAll2.getIsNewTimeStamp() <= 0 || !o00Oo0.OooOO0O().OooOO0O(giftPropAll2.getGiftPropTypeUser())) {
                giftPropAll2.setRedPostCountLocal(0L);
            } else {
                giftPropAll2.setRedPostCountLocal(1L);
                OooO00o.f24989OooOOo0.OooO0Oo(true);
            }
        }
        oOO00O.f44351OooO00o.postValue(linkedHashMap);
        oOO00O.f44354OooO0Oo.postValue(arrayList);
        oOO00O.f44353OooO0OO.postValue(arrayList2);
        Function0<Unit> function0 = this.f44350OooO0o0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
