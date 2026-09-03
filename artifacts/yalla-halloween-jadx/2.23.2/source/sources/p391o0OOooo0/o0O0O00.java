package p391o0OOooo0;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$addBackpack$1", f = "GiftPropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGiftPropManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$addBackpack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1855#2,2:382\n1864#2,3:384\n*S KotlinDebug\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$addBackpack$1\n*L\n290#1:382,2\n296#1:384,3\n*E\n"})
public final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftPropAll f43564OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(GiftPropAll giftPropAll, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f43564OooO0Oo = giftPropAll;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0O00(this.f43564OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GiftPropAll giftPropAll = this.f43564OooO0Oo;
        List<GiftPropModel> listAll = giftPropAll.getListAll();
        if (listAll != null) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43574OooO0O0;
            Map<Integer, GiftPropModel> value = mutableLiveData.getValue();
            List<GiftPropAll> list = null;
            if (value != null) {
                for (GiftPropModel giftPropModel : listAll) {
                    Intrinsics.checkNotNull(value);
                    value.put(Boxing.boxInt(giftPropModel.getGiftId()), giftPropModel);
                }
            } else {
                value = null;
            }
            mutableLiveData.postValue(value);
            MutableLiveData<List<GiftPropAll>> mutableLiveData2 = oo0o0Oo.f43576OooO0Oo;
            List<GiftPropAll> value2 = mutableLiveData2.getValue();
            if (value2 != null) {
                Intrinsics.checkNotNull(value2);
                int i = -1;
                int i2 = 0;
                for (Object obj2 : value2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((GiftPropAll) obj2).getGiftPropTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
                        i = i2;
                    }
                    i2 = i3;
                }
                if (i < 0 || value2.size() <= i) {
                    value2.add(giftPropAll);
                } else {
                    value2.set(i, giftPropAll);
                }
                list = value2;
            }
            mutableLiveData2.postValue(list);
        }
        return Unit.INSTANCE;
    }
}
