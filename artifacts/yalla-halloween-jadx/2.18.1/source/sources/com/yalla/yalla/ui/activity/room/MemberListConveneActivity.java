package com.yalla.yalla.ui.activity.room;

import Oooo000.o00O0O;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.app.base.model.RoomMemberConveneListModel;
import com.app.base.model.RoomMemberListModel;
import com.app.base.view.HeaderLayout;
import com.app.base.view.SearchView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.room.MemberVM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172o00OooO.o00O0O0;
import p192o00o0O0.o0OO00O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p522o0o0O0o.o000O0;
import p522o0o0O0o.o000O0Oo;
import p530o0o0OOO.o00OO00O;
import p544o0o0OoOO.p4;
import p544o0o0OoOO.q4;
import p544o0o0OoOO.r4;
import p544o0o0OoOO.s4;
import p544o0o0OoOO.t4;
import p544o0o0OoOO.u4;
import p544o0o0OoOO.v4;
import p544o0o0OoOO.w4;
import p649o0ooOOoo.pe;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/MemberListConveneActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MemberListConveneActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final /* synthetic */ int f22860o0OoOo0 = 0;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f22867Oooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22861OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(pe.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22862Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.MemberListConveneActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.MemberListConveneActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.MemberListConveneActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22884Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22884Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f22863Ooooo0o = -1;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public Map<Long, RoomUserInfoModel> f22864OooooO0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final int f22865OooooOO = 50;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22866OooooOo = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f22868Oooooo0 = new ArrayList();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final List<RoomUserInfoModel> f22869OoooooO = new ArrayList();

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public String f22870Ooooooo = "";

    public static final class OooO extends Lambda implements Function1<RoomMemberListModel<List<RoomUserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f22871Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MemberListConveneActivity f22872Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, MemberListConveneActivity memberListConveneActivity) {
            super(1);
            this.f22871Oooo0o = z;
            this.f22872Oooo0oO = memberListConveneActivity;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomUserInfoModel>> roomMemberListModel) {
            List<RoomUserInfoModel> list;
            RoomMemberListModel<List<RoomUserInfoModel>> roomMemberListModel2 = roomMemberListModel;
            if (this.f22871Oooo0o) {
                this.f22872Oooo0oO.f22869OoooooO.clear();
            }
            int i = -1;
            if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                o000O0.OooO00o(this.f22872Oooo0oO.f22869OoooooO, list, com.yalla.yalla.ui.activity.room.OooO.f22912Oooo0o);
            }
            ?? r10 = this.f22872Oooo0oO.f22869OoooooO;
            int i2 = 0;
            for (Object obj : r10) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                long userId = ((RoomUserInfoModel) obj).getUserId();
                Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
                if (value != null && userId == value.longValue()) {
                    i = i2;
                }
                i2 = i3;
            }
            if (i > 0 && i < r10.size()) {
                r10.remove(i);
            }
            MemberListConveneActivity memberListConveneActivity = this.f22872Oooo0oO;
            MemberListConveneActivity.OooOoo(memberListConveneActivity, memberListConveneActivity.f22869OoooooO);
            this.f22872Oooo0oO.OooOooO().setNewData(this.f22872Oooo0oO.f22869OoooooO);
            if (this.f22872Oooo0oO.OooOooO().getData().isEmpty()) {
                this.f22872Oooo0oO.OooOooo().f50309OooO0o.OooO0o0();
            } else {
                this.f22872Oooo0oO.OooOooo().f50309OooO0o.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<com.yalla.yalla.ui.activity.room.OooO0OO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.activity.room.OooO0OO invoke() {
            return new com.yalla.yalla.ui.activity.room.OooO0OO(MemberListConveneActivity.this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RoomMemberConveneListModel, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f22874Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MemberListConveneActivity f22875Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MemberListConveneActivity memberListConveneActivity) {
            super(1);
            this.f22874Oooo0o = z;
            this.f22875Oooo0oO = memberListConveneActivity;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberConveneListModel roomMemberConveneListModel) {
            RoomMemberConveneListModel roomMemberConveneListModel2 = roomMemberConveneListModel;
            if (this.f22874Oooo0o) {
                this.f22875Oooo0oO.f22868Oooooo0.clear();
            }
            MemberListConveneActivity memberListConveneActivity = this.f22875Oooo0oO;
            Integer numValueOf = roomMemberConveneListModel2 != null ? Integer.valueOf(roomMemberConveneListModel2.getDatacount()) : null;
            Intrinsics.checkNotNull(numValueOf);
            memberListConveneActivity.f22867Oooooo = numValueOf.intValue();
            List<RoomUserInfoModel> data = roomMemberConveneListModel2.getData();
            if (data != null) {
                o000O0.OooO00o(this.f22875Oooo0oO.f22868Oooooo0, data, com.yalla.yalla.ui.activity.room.OooO0o.f22918Oooo0o);
            }
            MemberListConveneActivity memberListConveneActivity2 = this.f22875Oooo0oO;
            MemberListConveneActivity.OooOoo(memberListConveneActivity2, memberListConveneActivity2.f22868Oooooo0);
            this.f22875Oooo0oO.OooOooO().setNewData(this.f22875Oooo0oO.f22868Oooooo0);
            if (this.f22875Oooo0oO.OooOooO().getData().isEmpty()) {
                this.f22875Oooo0oO.OooOooo().f50309OooO0o.OooO0o0();
            } else {
                SearchView searchView = this.f22875Oooo0oO.OooOooo().f50310OooO0o0;
                Intrinsics.checkNotNullExpressionValue(searchView, "binding.searchView");
                oOO00O.OooO(searchView);
                this.f22875Oooo0oO.OooOooo().f50309OooO0o.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            MemberListConveneActivity memberListConveneActivity = MemberListConveneActivity.this;
            int i = MemberListConveneActivity.f22860o0OoOo0;
            List<RoomUserInfoModel> data = memberListConveneActivity.OooOooO().getData();
            if (data == null || data.isEmpty()) {
                MemberListConveneActivity.this.OooOooo().f50309OooO0o.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<RoomMemberConveneListModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22878Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f22878Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberConveneListModel> apiResult) {
            ApiResult<RoomMemberConveneListModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MemberListConveneActivity memberListConveneActivity = MemberListConveneActivity.this;
            int i = MemberListConveneActivity.f22860o0OoOo0;
            XRefreshLayout xRefreshLayout = memberListConveneActivity.OooOooo().f50308OooO0Oo;
            boolean z = this.f22878Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberConveneListModel data = it.getData();
            List<RoomUserInfoModel> data2 = data != null ? data.getData() : null;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, data2 == null || data2.isEmpty());
            MemberListConveneActivity.this.OooOooo().f50311OooO0oO.setText(o000O0O0.OooO0OO(R.string.room_member_convene_title) + MemberListConveneActivity.this.f22867Oooooo);
            MemberListConveneActivity.this.Oooo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            MemberListConveneActivity memberListConveneActivity = MemberListConveneActivity.this;
            int i = MemberListConveneActivity.f22860o0OoOo0;
            List<RoomUserInfoModel> data = memberListConveneActivity.OooOooO().getData();
            if (data == null || data.isEmpty()) {
                MemberListConveneActivity.this.OooOooo().f50309OooO0o.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f22881Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(1);
            this.f22881Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MemberListConveneActivity memberListConveneActivity = MemberListConveneActivity.this;
            int i = MemberListConveneActivity.f22860o0OoOo0;
            XRefreshLayout xRefreshLayout = memberListConveneActivity.OooOooo().f50308OooO0Oo;
            boolean z = this.f22881Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomUserInfoModel>> data = it.getData();
            List<RoomUserInfoModel> list = data != null ? data.data : null;
            xRefreshLayout.Oooo0o0(z, zIsSuccess, list == null || list.isEmpty());
            MemberListConveneActivity.this.Oooo0();
            return Unit.INSTANCE;
        }
    }

    public static final void OooOoo(MemberListConveneActivity memberListConveneActivity, List list) {
        Objects.requireNonNull(memberListConveneActivity);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) it.next();
            roomUserInfoModel.setSelected(memberListConveneActivity.f22864OooooO0.containsKey(Long.valueOf(roomUserInfoModel.getUserId())));
        }
    }

    public final p188o00o00o0.OooO0OO<RoomUserInfoModel> OooOooO() {
        return (p188o00o00o0.OooO0OO) this.f22866OooooOo.getValue();
    }

    public final pe OooOooo() {
        return (pe) this.f22861OoooOoo.getValue();
    }

    public final void Oooo0() {
        if (!(!this.f22864OooooO0.isEmpty())) {
            OooOooo().f50306OooO0O0.setBackground(o000O0Oo.OooO00o(this, R.drawable.bgs_button_gray_r360));
            OooOooo().f50306OooO0O0.setClickable(false);
            TextView textView = OooOooo().f50306OooO0O0;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(o000O0O0.OooO0OO(R.string.room_member_convene_btn_gray), Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            textView.setText(str);
            return;
        }
        OooOooo().f50306OooO0O0.setBackground(o000O0Oo.OooO00o(this, R.drawable.bgs_button_green_r360));
        OooOooo().f50306OooO0O0.setClickable(true);
        OooOooo().f50306OooO0O0.setText(o000O0O0.OooO0OO(R.string.room_member_convene_btn_gray) + " (" + this.f22864OooooO0.size() + '/' + this.f22865OooooOO + ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MemberVM Oooo000() {
        return (MemberVM) this.f22862Ooooo00.getValue();
    }

    public final void Oooo00O(boolean z) {
        this.f22870Ooooooo = "";
        OooOooo().f50308OooO0Oo.Oooo0o0(z, true, false);
        Oooo000().getConveneBarMemberlist(this.f22863Ooooo0o, z).observe(this, new o0o0000.OooOo(new OooO0O0(z, this), new OooO0OO(), new OooO0o(z), false, 8));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    public final void Oooo00o(String str, boolean z) {
        this.f22870Ooooooo = str;
        if (str == null || StringsKt.isBlank(str)) {
            this.f22869OoooooO.clear();
            Oooo0O0();
            return;
        }
        TextView textView = OooOooo().f50311OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        oOO00O.OooO00o(textView);
        if (z) {
            OooOooo().f50309OooO0o.OooO0oo();
        }
        OooOooo().f50308OooO0Oo.Oooo0o0(z, true, false);
        Oooo000().getSingleBarSearch(this.f22863Ooooo0o, str, false, z).observe(this, new o0o0000.OooOo(new OooO(z, this), new OooOO0(), new OooOO0O(z), false, 8));
    }

    public final void Oooo0O0() {
        this.f22870Ooooooo = "";
        EditText editText = OooOooo().f50310OooO0o0.f12076Oooo0o;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editSearch");
            editText = null;
        }
        editText.clearFocus();
        EditText editSearch = OooOooo().f50310OooO0o0.getEditSearch();
        o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(p025Oooo0O0.o000O0Oo.OooO00o(editSearch, "view.context"), new Handler()));
        TextView textView = OooOooo().f50311OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        oOO00O.OooO(textView);
        OooOooO().setNewData(this.f22868Oooooo0);
        if (OooOooO().getData().isEmpty()) {
            OooOooo().f50309OooO0o.OooO0o0();
        } else {
            OooOooo().f50309OooO0o.OooO0Oo();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooo().f50305OooO00o);
        OooOoO0(o000O0O0.OooO0OO(R.string.room_member_convene));
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.OooOoOO(R.drawable.icon_aristocracy_doubt, new v4(this));
        }
        OooOooo().f50311OooO0oO.setText(o000O0O0.OooO0OO(R.string.room_member_convene_title) + '0');
        Oooo0();
        SearchView searchView = OooOooo().f50310OooO0o0;
        Intrinsics.checkNotNullExpressionValue(searchView, "binding.searchView");
        oOO00O.OooO00o(searchView);
        OooOooo().f50309OooO0o.OooO0oo();
        OooOooo().f50308OooO0Oo.f12222o000O0Oo = new q4(this);
        OooOooo().f50308OooO0Oo.f12224o000OO0O = new o0OO00O(this, 3);
        StateLayout stateLayout = OooOooo().f50309OooO0o;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new w4(this), 3);
        OooOooo().f50307OooO0OO.setLayoutManager(new LinearLayoutManager(this));
        OooOooo().f50307OooO0OO.setAdapter(OooOooO());
        OooOooo().f50306OooO0O0.setOnClickListener(new p4(this, 0));
        OooOooo().f50308OooO0Oo.setOnTouchDownListener(new p142o00OOooO.o0OO00O(this, 1));
        OooOooo().f50310OooO0o0.OooO0O0();
        OooOooo().f50310OooO0o0.setClearListener(new r4(this));
        OooOooo().f50310OooO0o0.setEditFocusListener(new s4(this));
        OooOooo().f50310OooO0o0.setSearchTextChangedListener(new t4(this));
        OooOooo().f50310OooO0o0.setSearchClickListener(new u4(this));
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        long jLongValue = value == null ? -1L : value.longValue();
        this.f22863Ooooo0o = jLongValue;
        if (jLongValue < 0) {
            finish();
        }
        Oooo00O(true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o00O0O0.OooO0O0().OooO00o();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        EditText editSearch = OooOooo().f50310OooO0o0.getEditSearch();
        o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(p025Oooo0O0.o000O0Oo.OooO00o(editSearch, "view.context"), new Handler()));
    }
}
