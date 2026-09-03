package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CategoryModel;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.CountryModel;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.TopExploreModel;
import com.google.common.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class MainRoomExploreViewModel extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f25465OooO00o = LazyKt.lazy(OooO.f25472Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f25466OooO0O0 = LazyKt.lazy(OooO0o.f25476Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f25467OooO0OO = LazyKt.lazy(OooO0OO.f25475Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f25468OooO0Oo = LazyKt.lazy(OooO00o.f25473Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f25470OooO0o0 = LazyKt.lazy(OooO0O0.f25474Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f25469OooO0o = 1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f25471OooO0oO = 100;

    public static final class OooO extends Lambda implements Function0<MutableLiveData<TopExploreModel>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f25472Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<TopExploreModel> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Pair<? extends List<? extends CountryModel>, ? extends Integer>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f25473Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends List<? extends CountryModel>, ? extends Integer>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Boolean>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f25474Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Boolean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f25475Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<List<? extends CategoryModel>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f25476Oooo0o = new OooO0o();

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
            this.f25469OooO0o = 1;
        }
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.f25469OooO0o, "");
        int i = this.f25471OooO0oO;
        o00OO0O0.OooO0O0 oooO0O0 = new o00OO0O0.OooO0O0() { // from class: com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$getBarRecommendTotalList$1
            @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
            public final void onError(@NotNull String code2, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code2, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.onError(code2, message);
                this.f25477OooO00o.OooO0OO().setValue(new Pair<>(Boolean.FALSE, Boolean.valueOf(z)));
            }

            @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
            public final void onFinish(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                super.onFinish(response);
                ((MutableLiveData) this.f25477OooO00o.f25467OooO0OO.getValue()).setValue(new Pair((CommonParseMultiListModel) o0Oo0oo.OooO0OO(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$getBarRecommendTotalList$1$onFinish$model$1
                }.f18755Oooo0o), Boolean.valueOf(z)));
                this.f25477OooO00o.OooO0OO().setValue(new Pair<>(Boolean.TRUE, Boolean.valueOf(z)));
            }
        };
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", strOooO00o);
        mapOooO0O0.put("pagesize", i + "");
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32258Oooo0oo, mapOooO0O0, oooO0O0);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Boolean>> OooO0OO() {
        return (MutableLiveData) this.f25470OooO0o0.getValue();
    }
}
