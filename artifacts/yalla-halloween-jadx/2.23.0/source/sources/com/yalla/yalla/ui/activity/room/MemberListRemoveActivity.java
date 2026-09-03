package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.room.MemberVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.g7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/MemberListRemoveActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMemberListRemoveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberListRemoveActivity.kt\ncom/yalla/yalla/ui/activity/room/MemberListRemoveActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n22#2,2:185\n75#3,13:187\n1855#4,2:200\n*S KotlinDebug\n*F\n+ 1 MemberListRemoveActivity.kt\ncom/yalla/yalla/ui/activity/room/MemberListRemoveActivity\n*L\n36#1:185,2\n38#1:187,13\n116#1:200,2\n*E\n"})
public final class MemberListRemoveActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26562OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26563OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(g7.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26566OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(MemberVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.MemberListRemoveActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.MemberListRemoveActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.MemberListRemoveActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26577OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26577OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f26565OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26567OooOo0O = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f26568OooOo0o = 50;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f26564OooOo = LazyKt.lazy(new OooO00o());

    public static final class OooO00o extends Lambda implements Function0<o000O000> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O000 invoke() {
            return new o000O000(MemberListRemoveActivity.this, oO00OO0O.room_activity_member_remove_layout);
        }
    }

    @SourceDebugExtension({"SMAP\nMemberListRemoveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberListRemoveActivity.kt\ncom/yalla/yalla/ui/activity/room/MemberListRemoveActivity$loadData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<RoomMemberListModel<List<RoomUserInfoDTO>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26570OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MemberListRemoveActivity f26571OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MemberListRemoveActivity memberListRemoveActivity, boolean z) {
            super(1);
            this.f26570OooO0Oo = z;
            this.f26571OooO0o0 = memberListRemoveActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RoomMemberListModel<List<RoomUserInfoDTO>> roomMemberListModel) {
            List<RoomUserInfoDTO> list;
            List<RoomUserInfoDTO> list2;
            RoomMemberListModel<List<RoomUserInfoDTO>> roomMemberListModel2 = roomMemberListModel;
            boolean z = this.f26570OooO0Oo;
            MemberListRemoveActivity memberListRemoveActivity = this.f26571OooO0o0;
            if (z) {
                memberListRemoveActivity.f26567OooOo0O.clear();
                memberListRemoveActivity.OooOo().OooOoO0((roomMemberListModel2 == null || (list2 = roomMemberListModel2.data) == null) ? null : NewRoomUserInfoTransformutilsKt.transformToModel(list2));
                if (memberListRemoveActivity.OooOo().f10111OooOOoo.isEmpty()) {
                    memberListRemoveActivity.OooOoO0().f57978OooO0o0.OooO0o0();
                } else {
                    memberListRemoveActivity.OooOoO0().f57978OooO0o0.OooO0Oo();
                }
            } else if (roomMemberListModel2 != null && (list = roomMemberListModel2.data) != null) {
                int i = MemberListRemoveActivity.f26562OooOoO0;
                memberListRemoveActivity.OooOo().OooO0O0(NewRoomUserInfoTransformutilsKt.transformToModel(list));
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
            int i = MemberListRemoveActivity.f26562OooOoO0;
            MemberListRemoveActivity memberListRemoveActivity = MemberListRemoveActivity.this;
            List<RoomUserInfoModel> list = memberListRemoveActivity.OooOo().f10111OooOOoo;
            if (list == null || list.isEmpty()) {
                memberListRemoveActivity.OooOoO0().f57978OooO0o0.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26574OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z) {
            super(1);
            this.f26574OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> apiResult) {
            ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = MemberListRemoveActivity.f26562OooOoO0;
            MemberListRemoveActivity memberListRemoveActivity = MemberListRemoveActivity.this;
            XRefreshLayout xRefreshLayout = memberListRemoveActivity.OooOoO0().f57976OooO0OO;
            boolean zIsSuccess = it.isSuccess();
            RoomMemberListModel<List<RoomUserInfoDTO>> data = it.getData();
            List<RoomUserInfoDTO> list = data != null ? data.data : null;
            xRefreshLayout.OooOooo(this.f26574OooO0o0, zIsSuccess, list == null || list.isEmpty());
            memberListRemoveActivity.OooOoOO();
            return Unit.INSTANCE;
        }
    }

    public final p564o0oOo0OO.o000O<RoomUserInfoModel> OooOo() {
        return (p564o0oOo0OO.o000O) this.f26564OooOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO(boolean z) {
        ((MemberVM) this.f26566OooOo00.getValue()).getBatchRoomMemberList(this.f26565OooOo0, z).observe(this, new p377o0OOoOo.o0000OO0(new OooO0O0(this, z), new OooO0OO(), new OooO0o(z), false, 8));
    }

    public final g7 OooOoO0() {
        return (g7) this.f26563OooOOoo.getValue();
    }

    public final void OooOoOO() {
        ArrayList arrayList = this.f26567OooOo0O;
        if (arrayList.size() > 0) {
            OooOoO0().f57977OooO0Oo.setBackground(com.code.android.util.o0000.OooO0O0(oOo00OO0.bgs_button_green_r360));
            OooOoO0().f57977OooO0Oo.setClickable(true);
        } else {
            OooOoO0().f57977OooO0Oo.setBackground(com.code.android.util.o0000.OooO0O0(oOo00OO0.bgs_button_gray_r360));
            OooOoO0().f57977OooO0Oo.setClickable(false);
        }
        OooOoO0().f57977OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_member_remove_button_remove) + "(" + arrayList.size() + "/" + this.f26568OooOo0o + ")");
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f57974OooO00o);
        OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_member_remove));
        OooOoOO();
        OooOoO0().f57978OooO0o0.OooO0oo();
        OooOoO0().f57976OooO0OO.f31258o00000OO = new o0000O(this);
        OooOoO0().f57976OooO0OO.f31259o00000Oo = new p203o00o0o0o.o00O(this, 1);
        StateLayout stateLayout = OooOoO0().f57978OooO0o0;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new o000O00(this), 3);
        OooOoO0().f57975OooO0O0.setLayoutManager(new LinearLayoutManager(this));
        OooOoO0().f57975OooO0O0.setAdapter(OooOo());
        OooOoO0().f57977OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.room.o0000OO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = MemberListRemoveActivity.f26562OooOoO0;
                MemberListRemoveActivity this$0 = this.f26837OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this$0);
                o0oo00o2.OooOoO(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_member_remove_dialog_title));
                o0oo00o2.OooOo00(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_member_remove_dialog_info), String.valueOf(this$0.f26567OooOo0O.size())));
                o0oo00o2.OooOo0(new o000O00O(this$0));
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOO0o();
            }
        });
        Long value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
        long jLongValue = value == null ? -1L : value.longValue();
        this.f26565OooOo0 = jLongValue;
        if (jLongValue < 0) {
            finish();
        }
        OooOoO(true);
    }
}
