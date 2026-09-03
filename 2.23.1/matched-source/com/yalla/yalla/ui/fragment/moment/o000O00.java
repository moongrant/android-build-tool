package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.model.moment.MomentBannerModel;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p196o00o0OOO.oo00o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentListFeaturedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$3$1$5$2$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,280:1\n154#2:281\n58#3:282\n*S KotlinDebug\n*F\n+ 1 MomentListFeaturedFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentListFeaturedFragment$initView$3$1$5$2$1$3\n*L\n244#1:281\n244#1:282\n*E\n"})
public final class o000O00 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFeaturedVM f28332OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f28333OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(MomentFeaturedVM momentFeaturedVM, MutableState<Dp> mutableState) {
        super(3);
        this.f28332OooO0Oo = momentFeaturedVM;
        this.f28333OooO0o0 = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        boolean z;
        List<MomentBannerModel.MomentBannerItem> bannerList;
        LazyItemScope item = lazyItemScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-621978012, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MomentListFeaturedFragment.initView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MomentListFeaturedFragment.kt:239)");
            }
            MomentBannerModel value = this.f28332OooO0Oo.getBannerModel().getValue();
            if (value != null && (bannerList = value.getBannerList()) != null) {
                z = bannerList.isEmpty();
            }
            MutableState<Dp> mutableState = this.f28333OooO0o0;
            oo00o.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.moments_none), p565o0oOo000.o0OOO0o.ic_empty_fans, 0.0f, null, null, false, SizeKt.m511height3ABfNKs(Modifier.INSTANCE, z ? mutableState.getValue().m3789unboximpl() : Dp.m3775constructorimpl(mutableState.getValue().m3789unboximpl() - Dp.m3775constructorimpl(68))), null, null, composer2, 196608, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
