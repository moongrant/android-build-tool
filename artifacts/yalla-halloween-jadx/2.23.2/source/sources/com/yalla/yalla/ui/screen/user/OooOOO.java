package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.common.util.CollectionUtils;
import com.yalla.yalla.model.user.UserHeadFrameModel;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p543o0o0Ooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHeaderFrameScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/HeaderFrameScreen$HeaddressList$3$1$1\n+ 2 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n1#1,387:1\n477#2,14:388\n477#2,14:402\n*S KotlinDebug\n*F\n+ 1 HeaderFrameScreen.kt\ncom/yalla/yalla/ui/screen/user/HeaderFrameScreen$HeaddressList$3$1$1\n*L\n292#1:388,14\n306#1:402,14\n*E\n"})
public final class OooOOO extends Lambda implements Function1<LazyGridScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HeadFrameViewModel f29442OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(HeadFrameViewModel headFrameViewModel) {
        super(1);
        this.f29442OooO0Oo = headFrameViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyGridScope lazyGridScope) {
        LazyGridScope LazyVerticalGrid = lazyGridScope;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        HeadFrameViewModel headFrameViewModel = this.f29442OooO0Oo;
        final OooOOO0 oooOOO0 = new OooOOO0(headFrameViewModel);
        if (!CollectionUtils.isEmpty(headFrameViewModel.getUnLockHeaddressList())) {
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, OooOO0.f29440OooO0Oo, null, oOO0O00O.f55497OooO00o, 5, null);
            final SnapshotStateList<UserHeadFrameModel> unLockHeaddressList = headFrameViewModel.getUnLockHeaddressList();
            LazyVerticalGrid.items(unLockHeaddressList.size(), null, null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    unLockHeaddressList.get(num.intValue());
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(1229287273, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    LazyGridItemScope items = lazyGridItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1229287273, i, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:487)");
                        }
                        HeaderFrameScreen.INSTANCE.HeaddressItem(iIntValue, (UserHeadFrameModel) unLockHeaddressList.get(iIntValue), true, oooOOO0, composer2, ((((i & 112) | (i & 14)) >> 3) & 14) | 25024);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        if (!CollectionUtils.isEmpty(headFrameViewModel.getLockHeaddressList())) {
            LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, OooOO0O.f29441OooO0Oo, null, oOO0O00O.f55498OooO0O0, 5, null);
            final SnapshotStateList<UserHeadFrameModel> lockHeaddressList = headFrameViewModel.getLockHeaddressList();
            LazyVerticalGrid.items(lockHeaddressList.size(), null, null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    lockHeaddressList.get(num.intValue());
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(1229287273, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    LazyGridItemScope items = lazyGridItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1229287273, i, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:487)");
                        }
                        HeaderFrameScreen.INSTANCE.HeaddressItem(iIntValue, (UserHeadFrameModel) lockHeaddressList.get(iIntValue), false, oooOOO0, composer2, ((((i & 112) | (i & 14)) >> 3) & 14) | 25024);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
