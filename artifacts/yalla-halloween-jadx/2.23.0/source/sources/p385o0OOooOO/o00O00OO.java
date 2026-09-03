package p385o0OOooOO;

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
@SourceDebugExtension({"SMAP\nGiftPropManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$addBackpack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,377:1\n1855#2,2:378\n1864#2,3:380\n*S KotlinDebug\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$addBackpack$1\n*L\n286#1:378,2\n292#1:380,3\n*E\n"})
public final class o00O00OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftPropAll f44346OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(GiftPropAll giftPropAll, Continuation<? super o00O00OO> continuation) {
        super(2, continuation);
        this.f44346OooO0Oo = giftPropAll;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00OO(this.f44346OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GiftPropAll giftPropAll = this.f44346OooO0Oo;
        List<GiftPropModel> listAll = giftPropAll.getListAll();
        if (listAll != null) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44352OooO0O0;
            Map<Integer, GiftPropModel> invokeSuspend$lambda$4$lambda$1$lambda$0 = mutableLiveData.getValue();
            List<GiftPropAll> list = null;
            if (invokeSuspend$lambda$4$lambda$1$lambda$0 != null) {
                for (GiftPropModel giftPropModel : listAll) {
                    Intrinsics.checkNotNullExpressionValue(invokeSuspend$lambda$4$lambda$1$lambda$0, "invokeSuspend$lambda$4$lambda$1$lambda$0");
                    invokeSuspend$lambda$4$lambda$1$lambda$0.put(Boxing.boxInt(giftPropModel.getGiftId()), giftPropModel);
                }
            } else {
                invokeSuspend$lambda$4$lambda$1$lambda$0 = null;
            }
            mutableLiveData.postValue(invokeSuspend$lambda$4$lambda$1$lambda$0);
            MutableLiveData<List<GiftPropAll>> mutableLiveData2 = oOO00O.f44354OooO0Oo;
            List<GiftPropAll> value = mutableLiveData2.getValue();
            if (value != null) {
                Intrinsics.checkNotNullExpressionValue(value, "this");
                int i = -1;
                int i2 = 0;
                for (Object obj2 : value) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (((GiftPropAll) obj2).getGiftPropTypeUser() == GiftPropTypeUser.Backpack.getValue()) {
                        i = i2;
                    }
                    i2 = i3;
                }
                if (i < 0 || value.size() <= i) {
                    value.add(giftPropAll);
                } else {
                    value.set(i, giftPropAll);
                }
                list = value;
            }
            mutableLiveData2.postValue(list);
        }
        return Unit.INSTANCE;
    }
}
