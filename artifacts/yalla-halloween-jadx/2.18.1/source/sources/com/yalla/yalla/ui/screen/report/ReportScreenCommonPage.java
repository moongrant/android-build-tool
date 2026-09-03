package com.yalla.yalla.ui.screen.report;

import android.os.Looper;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.app.base.model.ReportModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import com.yalla.yalla.ui.vm.report.ReportVm;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import come.code.android.easyrefreshcontentstatus.ContentState;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o000;
import p027Oooo0o.o000oOoO;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p032OoooO0.oo000o;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p074o000O0oo.OooOOO;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p254o00ooO0O.o00O00;
import p254o00ooO0O.o0O0ooO;
import p259o00ooOo.o0O0o;
import p261o00ooOoO.p;
import p261o00ooOoO.u;
import p584o0oOoo.o000OO00;
import p595o0oOoooo.u5;
import p595o0oOoooo.w5;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class ReportScreenCommonPage {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ReportScreenCommonPage f24705OooO00o = new ReportScreenCommonPage();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f24708Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f24710Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24711Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00O0O00 o00o0o01, boolean z, int i) {
            super(2);
            this.f24710Oooo0oO = o00o0o01;
            this.f24711Oooo0oo = z;
            this.f24708Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            ReportScreenCommonPage.this.OooO0OO(this.f24710Oooo0oO, this.f24711Oooo0oo, ooo00o, this.f24708Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ReportVm f24712Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ReportVm reportVm) {
            super(3);
            this.f24712Oooo0o = reportVm;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 ContentStatus = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                ReportScreenCommonPage reportScreenCommonPage = ReportScreenCommonPage.f24705OooO00o;
                ReportVm reportVm = this.f24712Oooo0o;
                reportScreenCommonPage.OooO0O0(reportVm, reportVm.getReportType(), ooo00o2, 392);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Integer f24713Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f24715Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f24716Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f24717OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f24718OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00 o00o0o01, ReportVm reportVm, Integer num, boolean z, int i) {
            super(2);
            this.f24715Oooo0oO = o00o0o01;
            this.f24716Oooo0oo = reportVm;
            this.f24713Oooo = num;
            this.f24718OoooO00 = z;
            this.f24717OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            ReportScreenCommonPage.this.OooO00o(this.f24715Oooo0oO, this.f24716Oooo0oo, this.f24713Oooo, this.f24718OoooO00, ooo00o, this.f24717OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o000, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f24719Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ReportVm f24720Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f24721Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo0oo f24722Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ReportVm reportVm, LifecycleOwner lifecycleOwner, oO0Oo0oo oo0oo0oo, int i) {
            super(1);
            this.f24720Oooo0o = reportVm;
            this.f24721Oooo0oO = lifecycleOwner;
            this.f24722Oooo0oo = oo0oo0oo;
            this.f24719Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000 o000Var) {
            o000 LazyColumn = o000Var;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final List<ReportModel> listData = this.f24720Oooo0o.getListData();
            final ReportVm reportVm = this.f24720Oooo0o;
            final LifecycleOwner lifecycleOwner = this.f24721Oooo0oO;
            final oO0Oo0oo oo0oo0oo = this.f24722Oooo0oo;
            final int i = this.f24719Oooo;
            LazyColumn.OooO0OO(listData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.report.ReportScreenCommonPage$ReportList$1$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    listData.get(num.intValue());
                    return null;
                }
            }, o00O0000.OooO0O0(-1091073711, true, new Function4<o000oOoO, Integer, oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.report.ReportScreenCommonPage$ReportList$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
                    int i2;
                    o000oOoO items = o000oooo2;
                    int iIntValue = num.intValue();
                    oOO00O ooo00o2 = ooo00o;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i2 = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i2 = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i2 |= ooo00o2.OooO(iIntValue) ? 32 : 16;
                    }
                    if ((i2 & 731) == 146 && ooo00o2.OooOo0()) {
                        ooo00o2.OooOoo0();
                    } else {
                        ReportModel reportModel = (ReportModel) listData.get(iIntValue);
                        ReportScreenCommonPage.OooO0Oo(ReportScreenCommonPage.f24705OooO00o, o000O0o.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, false, false, null, new OooO00o(lifecycleOwner, reportVm, oo0oo0oo, i, reportModel, iIntValue), KotlinVersion.MAX_COMPONENT_VALUE), reportModel, reportVm, iIntValue, ooo00o2, ((((i2 & 112) | (i2 & 14)) << 6) & 7168) | 25152);
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f24723Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ReportVm f24725Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f24726Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ReportVm reportVm, int i, int i2) {
            super(2);
            this.f24725Oooo0oO = reportVm;
            this.f24726Oooo0oo = i;
            this.f24723Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            ReportScreenCommonPage.this.OooO0O0(this.f24725Oooo0oO, this.f24726Oooo0oo, ooo00o, this.f24723Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f24727Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f24729Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f24730Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00O0O00 o00o0o01, boolean z, int i) {
            super(2);
            this.f24729Oooo0oO = o00o0o01;
            this.f24730Oooo0oo = z;
            this.f24727Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            ReportScreenCommonPage.this.OooO0OO(this.f24729Oooo0oO, this.f24730Oooo0oo, ooo00o, this.f24727Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    public static final void OooO0Oo(ReportScreenCommonPage reportScreenCommonPage, o00OOOO0 o00oooo1, ReportModel reportModel, ReportVm reportVm, int i, oOO00O ooo00o, int i2) {
        Objects.requireNonNull(reportScreenCommonPage);
        oOO00O composer = ooo00o.OooOOo(433640142);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(SizeKt.OooO0o(o00oooo1), 15, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = androidx.compose.ui.platform.o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = androidx.compose.ui.platform.o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = androidx.compose.ui.platform.o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r14 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r14);
        ?? r6 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r6);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r3);
        ?? r16 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0oO2 = PaddingKt.OooO0oO(SizeKt.OooO0o(oooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 20, 1);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        composer.OooO0o0(693286680);
        o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0oO2);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r14, composer, oooO2, r6, composer, layoutDirection2, r3, composer, o00ooooo3, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        String text = reportModel.getText();
        if (text == null) {
            text = "";
        }
        long jOooO0o = u.OooO0O0(composer).OooO0o();
        long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(15, composer);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o0O000O o0o000o = new o0O000O(true);
        oooO00o.OooOOoo(o0o000o);
        o000O0O0.OooO0OO(text, o0o000o, jOooO0o, jOooO00o, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65520);
        o0000oo.OooO0O0(12, null, composer, 6, 2);
        Integer nodeType = reportModel.getNodeType();
        if (nodeType != null && nodeType.intValue() == 3) {
            composer.OooO0o0(-1276522519);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(reportVm.getCurrentSelectedPosition() == i ? R.drawable.icon_circle_green : R.drawable.icon_move_room_dialog_gou_no_select, composer), null, SizeKt.OooOO0(oooO00o, 17), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            composer.Oooo0o0();
        } else {
            composer.OooO0o0(-1276522104);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.ic_poll_time_long, composer), null, SizeKt.OooOO0(oooO00o, 17), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            composer.Oooo0o0();
        }
        o0O0OO0.OooO00o(composer);
        p031OoooO.o00Oo0.OooO00o(null, u.OooO0O0(composer).OooOO0o(), (float) 0.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, composer, 384, 9);
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new w5(reportScreenCommonPage, o00oooo1, reportModel, reportVm, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(o00O0O00 o00o0o01, final ReportVm reportVm, Integer num, boolean z, oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1253848089);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Pair<String, String> pairOooO00o = o0oo0000.OooO0O0.f47633OooO00o.OooO00o(reportVm.getReportType(), num, reportVm.getPrivateChatReportType());
        int i2 = i >> 6;
        u5.f47570OooO00o.OooO0o0(pairOooO00o.getFirst(), z, ooo00oOooOOo, (i2 & 112) | 384, 0);
        String second = pairOooO00o.getSecond();
        long jOooO = u.OooO0O0(ooo00oOooOOo).OooO();
        long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(13, ooo00oOooOOo);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o000O0O0.OooO0OO(second, PaddingKt.OooO0o0(oooO00o, 16), jOooO, jOooO00o, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00oOooOOo, 48, 0, 65520);
        if (reportVm.getListData().isEmpty()) {
            ooo00oOooOOo.OooO0o0(240971890);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(reportVm);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                reportVm.loadReportReason();
                ooo00oOooOOo.Oooo00o(null);
            }
            ooo00oOooOOo.Oooo0o0();
            ContentState contentState = reportVm.getContentState();
            o00OOOO0 o00oooo0OooO00o = o00o0o01.OooO00o(oooO00o, true);
            ooo00oOooOOo.OooO0o0(-651052448);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.yalla.yalla.ui.screen.report.ReportScreenCommonPage$MainContent$$inlined$OnAvoidFastClick$1

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ long f24706Oooo0o = 500;

                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (Math.abs(jCurrentTimeMillis - o00O00.f34345OooO00o) >= this.f24706Oooo0o) {
                        o00O00.f34345OooO00o = jCurrentTimeMillis;
                        reportVm.loadReportReason();
                    }
                    return Unit.INSTANCE;
                }
            };
            ooo00oOooOOo.Oooo0o0();
            o0O0o.OooO0o0(contentState, o00oooo0OooO00o, null, null, null, function0, o00O0000.OooO00o(ooo00oOooOOo, -1934966693, new OooO00o(reportVm)), ooo00oOooOOo, 1572864, 28);
            ooo00oOooOOo.Oooo0o0();
        } else {
            ooo00oOooOOo.OooO0o0(240972346);
            OooO0O0(reportVm, reportVm.getReportType(), ooo00oOooOOo, (i2 & 896) | 8);
            ooo00oOooOOo.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00o0o01, reportVm, num, z, i));
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(final ReportVm reportVm, int i, oOO00O ooo00o, int i2) {
        CreationExtras defaultViewModelCreationExtras;
        Integer nodeType;
        oOO00O composer = ooo00o.OooOOo(830285183);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
        composer.OooO0o0(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(oO0Oo0oo.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
        composer.Oooo0o0();
        final oO0Oo0oo oo0oo0oo = (oO0Oo0oo) viewModel;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        Oooo000.OooO00o(o00oooo0OooO0o.OooOOoo(new o0O000O(true)), null, null, false, null, null, null, false, new OooO0OO(reportVm, lifecycleOwner, oo0oo0oo, i), composer, 0, 254);
        ReportModel reportModel = (ReportModel) CollectionsKt.getOrNull(reportVm.getListData(), 0);
        if ((reportModel == null || (nodeType = reportModel.getNodeType()) == null || nodeType.intValue() != 3) ? false : true) {
            String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.submit_report);
            long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(16, composer);
            float f = 9;
            o0O00O o0o00o2 = new o0O00O(f, f, f, f);
            boolean z = reportVm.getCurrentSelectedPosition() >= 0;
            o00OOOO0 o00oooo0OooO0o2 = PaddingKt.OooO0o(SizeKt.OooO0o(oooO00o), 25, 12);
            composer.OooO0o0(-651052448);
            Function0<Unit> function4 = new Function0<Unit>() { // from class: com.yalla.yalla.ui.screen.report.ReportScreenCommonPage$ReportList$lambda-4$$inlined$OnAvoidFastClick$1

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ long f24738Oooo0o = 500;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (Math.abs(jCurrentTimeMillis - o00O00.f34345OooO00o) >= this.f24738Oooo0o) {
                        o00O00.f34345OooO00o = jCurrentTimeMillis;
                        ReportModel reportModel2 = reportVm.getListData().get(reportVm.getCurrentSelectedPosition());
                        o0oo0000.OooO00o.OooO00o(lifecycleOwner, oo0oo0oo, reportVm, reportModel2.getId(), reportModel2.getCatagoryId());
                    }
                    return Unit.INSTANCE;
                }
            };
            composer.Oooo0o0();
            p.OooO0O0(strOooO0OO, jOooO00o, null, z, false, null, null, null, null, o0o00o2, null, null, o00oooo0OooO0o2, function4, composer, 805306368, 384, 3572);
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooO0o(reportVm, i, i2));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(@NotNull o00O0O00 o00o0o01, boolean z, @Nullable oOO00O ooo00o, int i) {
        int i2;
        CreationExtras defaultViewModelCreationExtras;
        List<ReportModel> listEmptyList;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(625255354);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o0o01) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.OooO0OO(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(this) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(ReportVm.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            ReportVm reportVm = (ReportVm) viewModel;
            Object obj = o000OO00.OooO0O0((NavBackStackEntry) ooo00oOooOOo.OooOO0o(o000OO00.f46954OooO00o), ooo00oOooOOo).get("report_params_data");
            ReportParam reportParam = obj instanceof ReportParam ? (ReportParam) obj : null;
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(reportParam);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                reportVm.setReportType(reportParam != null ? reportParam.f24742Oooo0o : -1);
                reportVm.setSourceId(reportParam != null ? reportParam.f24743Oooo0oO : null);
                reportVm.setMessagesList(reportParam != null ? reportParam.f24746OoooO0 : null);
                reportVm.setExtendSourceId(reportParam != null ? reportParam.f24748OoooO0O : null);
                reportVm.setViewSourceType(reportParam != null ? reportParam.f24749OoooOO0 : null);
                reportVm.setPrivateChatReportType(reportParam != null ? reportParam.f24750o000oOoO : null);
                if (reportVm.getListData().isEmpty()) {
                    if (reportParam == null || (listEmptyList = reportParam.f24744Oooo0oo) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    reportVm.setListData(listEmptyList);
                }
                ooo00oOooOOo.Oooo00o(null);
            }
            ooo00oOooOOo.Oooo0o0();
            if (reportVm.getReportType() < 0) {
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!StringsKt.isBlank("argumentType is empty")) {
                    o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, "argumentType is empty", "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                        p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(o00o0o01, z, i));
                return;
            }
            Integer num = reportParam != null ? reportParam.f24745OoooO : null;
            int i3 = (i2 & 14) | 64;
            int i4 = i2 << 6;
            OooO00o(o00o0o01, reportVm, num, z, ooo00oOooOOo, i3 | (i4 & 7168) | (i4 & 57344));
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOO0(o00o0o01, z, i));
    }
}
