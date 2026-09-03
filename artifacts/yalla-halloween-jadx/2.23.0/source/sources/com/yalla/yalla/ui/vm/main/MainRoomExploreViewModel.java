package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.common.reflect.TypeToken;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.TopExploreModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p426o0OoOO.o0OOO0o;
import p579o0oOoo.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class MainRoomExploreViewModel extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f31744OooO00o = LazyKt.lazy(OooO.f31751OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f31745OooO0O0 = LazyKt.lazy(OooO0o.f31755OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f31746OooO0OO = LazyKt.lazy(OooO0OO.f31754OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f31747OooO0Oo = LazyKt.lazy(OooO00o.f31752OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f31749OooO0o0 = LazyKt.lazy(OooO0O0.f31753OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f31748OooO0o = 1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f31750OooO0oO = 100;

    public static final class OooO extends Lambda implements Function0<MutableLiveData<TopExploreModel>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f31751OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<TopExploreModel> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Pair<? extends List<? extends CountryModel>, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f31752OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends List<? extends CountryModel>, ? extends Integer>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Boolean>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f31753OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Boolean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f31754OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<List<? extends CategoryModel>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f31755OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<List<? extends CategoryModel>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public final void OooO0O0(final boolean z) {
        if (z) {
            this.f31748OooO0o = 1;
        }
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        String strOooO00o = o0OOO0o.OooO00o(this.f31748OooO0o);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$getBarRecommendTotalList$1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                ((MutableLiveData) this.f31757OooO0o0.f31749OooO0o0.getValue()).setValue(new Pair(Boolean.FALSE, Boolean.valueOf(z)));
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOo00OO0.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$getBarRecommendTotalList$1$onFinish$model$1
                }.f19781OooO0Oo);
                MainRoomExploreViewModel mainRoomExploreViewModel = this.f31757OooO0o0;
                MutableLiveData mutableLiveData = (MutableLiveData) mainRoomExploreViewModel.f31746OooO0OO.getValue();
                boolean z2 = z;
                mutableLiveData.setValue(new Pair(commonParseMultiListModel, Boolean.valueOf(z2)));
                ((MutableLiveData) mainRoomExploreViewModel.f31749OooO0o0.getValue()).setValue(new Pair(Boolean.TRUE, Boolean.valueOf(z2)));
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        linkedHashMapOooO00o.put("pagesize", this.f31750OooO0oO + "");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44114Oooo0oo, linkedHashMapOooO00o, oooO0O0);
    }
}
