package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.api.old.ApiSearch$barBlockUserSearch$$inlined$call$1;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.MoraHistoryModelList;
import com.yalla.yalla.model.RoomBanEnterUser;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.SearchView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.p0;
import p590o0oOooo0.l0;
import p590o0oOooo0.oOO0OOO;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/BanEnterRoomListActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class BanEnterRoomListActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f26013OooOooo = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f26014OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public TextView f26016OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public p0 f26017OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public RecyclerView f26018OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public XRefreshLayout f26019OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public com.yalla.yalla.ui.activity.room.OooO0OO f26020OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SearchView f26021OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f26024OooOoOO;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f26015OooOOo0 = "";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ArrayList<RoomBanEnterUser> f26023OooOoO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final ArrayList<RoomBanEnterUser> f26022OooOoO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f26026OooOoo0 = 1;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public String f26025OooOoo = "";

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f26027OooOooO = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$searchMyFriendApi$1", f = "BanEnterRoomListActivity.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<p424o0OoO0Oo.o00OO0O0<ApiResult<List<RoomBanEnterUser>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f26028OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f26029OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f26030OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f26031OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ BanEnterRoomListActivity f26032OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, BanEnterRoomListActivity banEnterRoomListActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26029OooO0o = str;
            this.f26031OooO0oO = str2;
            this.f26032OooO0oo = banEnterRoomListActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f26029OooO0o, this.f26031OooO0oO, this.f26032OooO0oo, continuation);
            oooO00o.f26030OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p424o0OoO0Oo.o00OO0O0<ApiResult<List<RoomBanEnterUser>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p424o0OoO0Oo.o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26028OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p424o0OoO0Oo.o00OO0O0 o00oo0o2 = (p424o0OoO0Oo.o00OO0O0) this.f26030OooO0o0;
                String barId = this.f26029OooO0o;
                Intrinsics.checkNotNullExpressionValue(barId, "$barId");
                int i2 = this.f26032OooO0oo.f26026OooOoo0;
                this.f26030OooO0o0 = o00oo0o2;
                this.f26028OooO0Oo = 1;
                String url = p380o0OOoOo.oo000o.OooO0oO(p384o0OOoo0O.Oooo0.f43430o00O0O);
                Intrinsics.checkNotNullParameter(url, "url");
                p380o0OOoOo.o0ooOOo o0ooooo = new p380o0OOoOo.o0ooOOo(url, 0);
                o0ooooo.OooO0O0(barId, "barid");
                o0ooooo.OooO0O0(String.valueOf(i2), "pageindex");
                o0ooooo.OooO0O0(oOO0OOO.OooO0O0(this.f26031OooO0oO), "search");
                o0ooooo.OooO0O0("20", "pagesize");
                Object objOooO0Oo = com.code.android.util.OooOOO.OooO0Oo(new ApiSearch$barBlockUserSearch$$inlined$call$1(o0ooooo, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (p424o0OoO0Oo.o00OO0O0) this.f26030OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<RoomBanEnterUser>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26034OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(1);
            this.f26034OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomBanEnterUser> list) {
            List<RoomBanEnterUser> list2 = list;
            BanEnterRoomListActivity banEnterRoomListActivity = BanEnterRoomListActivity.this;
            banEnterRoomListActivity.f26026OooOoo0++;
            ArrayList<RoomBanEnterUser> arrayList = banEnterRoomListActivity.f26022OooOoO;
            boolean z = this.f26034OooO0o0;
            if (z) {
                arrayList.clear();
            }
            boolean z2 = false;
            com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO = null;
            if (list2 == null || list2.isEmpty()) {
                XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26019OooOo00;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOooo(z, true, true);
                com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO2 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO2 = null;
                }
                oooO0OO2.OooOoO0(arrayList);
                com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO3 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO3;
                }
                oooO0OO.Oooo00o();
                TextView textView = banEnterRoomListActivity.f26016OooOOoo;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                arrayList.addAll(list2);
                com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO4 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO4 = null;
                }
                oooO0OO4.OooOoO0(arrayList);
                XRefreshLayout xRefreshLayout2 = banEnterRoomListActivity.f26019OooOo00;
                if (xRefreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout2 = null;
                }
                if (list2 != null && list2.size() == 0) {
                    z2 = true;
                }
                xRefreshLayout2.OooOooo(z, true, z2);
                com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO5 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO5;
                }
                oooO0OO.Oooo00o();
                banEnterRoomListActivity.f26015OooOOo0 = String.valueOf(list2.get(list2.size() - 1).getExTime());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26036OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f26036OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            BanEnterRoomListActivity banEnterRoomListActivity = BanEnterRoomListActivity.this;
            XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26019OooOo00;
            com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO = null;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout = null;
            }
            xRefreshLayout.OooOoo(this.f26036OooO0o0);
            com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO2 = banEnterRoomListActivity.f26020OooOo0O;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.OooOoo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<RoomBanEnterUser>>, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<RoomBanEnterUser>> apiResult) {
            ApiResult<List<RoomBanEnterUser>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            TextView textView = BanEnterRoomListActivity.this.f26016OooOOoo;
            if (textView != null) {
                textView.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo0(BanEnterRoomListActivity banEnterRoomListActivity, String str) {
        banEnterRoomListActivity.getClass();
        ArrayList arrayList = new ArrayList();
        if (!(str.length() == 0)) {
            banEnterRoomListActivity.OooOo0o(str, true);
            return;
        }
        arrayList.addAll(banEnterRoomListActivity.f26023OooOoO0);
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO = banEnterRoomListActivity.f26020OooOo0O;
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.OooOoO0(arrayList);
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO3 = banEnterRoomListActivity.f26020OooOo0O;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.Oooo0O0(true);
    }

    public final void OooOo0O(final boolean z) {
        this.f26024OooOoOO = false;
        String barid = MixedRoomDataSource.OooO0o0().f22991OooO0o.getBarid();
        if (z) {
            this.f26027OooOooO = 1;
        }
        p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        String str = this.f26015OooOOo0;
        int i = this.f26027OooOooO;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$getBanRoomData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.f26039OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                super.OooO0O0(str2, str3);
                BanEnterRoomListActivity banEnterRoomListActivity = this.f26039OooO0o0;
                XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26019OooOo00;
                OooO0OO oooO0OO = null;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOoo(z);
                OooO0OO oooO0OO2 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO2;
                }
                oooO0OO.OooOoo();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@Nullable String str2) {
                String str3;
                BanEnterRoomListActivity banEnterRoomListActivity = this.f26039OooO0o0;
                TextView textView = banEnterRoomListActivity.f26016OooOOoo;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) oOOO00.OooO0O0(str2, new TypeToken<MoraHistoryModelList<RoomBanEnterUser>>() { // from class: com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$getBanRoomData$1$onFinish$results$1
                }.getType());
                banEnterRoomListActivity.f26027OooOooO = (moraHistoryModelList == null || (str3 = moraHistoryModelList.pageindex) == null) ? 0 : com.code.android.util.o0OoOo0.OooO0o(0, str3);
                OooO0OO oooO0OO = null;
                p0 p0Var = null;
                List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
                Object[] objArr = data == null || data.isEmpty();
                boolean z2 = z;
                if (objArr == true) {
                    XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26019OooOo00;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                        xRefreshLayout = null;
                    }
                    xRefreshLayout.OooOooo(z2, true, true);
                    OooO0OO oooO0OO2 = banEnterRoomListActivity.f26020OooOo0O;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0OO2 = null;
                    }
                    oooO0OO2.OooOoO0(null);
                    OooO0OO oooO0OO3 = banEnterRoomListActivity.f26020OooOo0O;
                    if (oooO0OO3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0OO3 = null;
                    }
                    oooO0OO3.Oooo00o();
                    TextView textView2 = banEnterRoomListActivity.f26016OooOOoo;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    p0 p0Var2 = banEnterRoomListActivity.f26017OooOo;
                    if (p0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        p0Var = p0Var2;
                    }
                    SearchView search = p0Var.f45359OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(search, "search");
                    com.code.android.util.o000O.OooO0O0(search);
                    return;
                }
                ArrayList<RoomBanEnterUser> arrayList = banEnterRoomListActivity.f26023OooOoO0;
                if (z2) {
                    p0 p0Var3 = banEnterRoomListActivity.f26017OooOo;
                    if (p0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                        p0Var3 = null;
                    }
                    SearchView search2 = p0Var3.f45359OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(search2, "search");
                    com.code.android.util.o000O.OooOOOO(search2);
                    p0 p0Var4 = banEnterRoomListActivity.f26017OooOo;
                    if (p0Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                        p0Var4 = null;
                    }
                    View view = p0Var4.f45359OooO0O0.f30103OooO0o;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewLine");
                        view = null;
                    }
                    view.setVisibility(0);
                    arrayList.clear();
                }
                arrayList.addAll(moraHistoryModelList.getData());
                OooO0OO oooO0OO4 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO4 = null;
                }
                oooO0OO4.OooOoO0(arrayList);
                XRefreshLayout xRefreshLayout2 = banEnterRoomListActivity.f26019OooOo00;
                if (xRefreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout2 = null;
                }
                xRefreshLayout2.OooOooo(z2, true, moraHistoryModelList.getData().size() < Integer.parseInt("15"));
                OooO0OO oooO0OO5 = banEnterRoomListActivity.f26020OooOo0O;
                if (oooO0OO5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0OO = oooO0OO5;
                }
                oooO0OO.Oooo00o();
                banEnterRoomListActivity.f26015OooOOo0 = String.valueOf(((RoomBanEnterUser) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getExTime());
            }
        };
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barid", barid);
        linkedHashMapOooO00o.put("pagesize", String.valueOf(15));
        linkedHashMapOooO00o.put("pageindex", String.valueOf(i));
        linkedHashMapOooO00o.put("timestr", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43402o00000o0, linkedHashMapOooO00o, oooO0O0);
    }

    public final void OooOo0o(String str, boolean z) {
        this.f26025OooOoo = str;
        this.f26024OooOoOO = true;
        String barid = MixedRoomDataSource.OooO0o0().f22991OooO0o.getBarid();
        if (z) {
            this.f26026OooOoo0 = 1;
        }
        p424o0OoO0Oo.o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new OooO00o(barid, str, this, null)).observe(this, new p384o0OOoo0O.o000oOoO(new OooO0O0(z), new OooO0OO(z), new OooO0o(), false, 8));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_ban_enter_room_list);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.room_ban_enter_room_title);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationOnClickListener(new OooOOO0(this));
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        p0 p0Var = null;
        this.f26016OooOOoo = headerLayout3 != null ? headerLayout3.OooOoO(getString(p562o0oOo000.o000000.Edit), new OooOOO(this)) : null;
        p0 p0VarInflate = p0.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(p0VarInflate, "inflate(...)");
        this.f26017OooOo = p0VarInflate;
        TextView textView = this.f26016OooOOoo;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View viewFindViewById = findViewById(p562o0oOo000.o0OO00O.move_room_pullToRefreshView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f26019OooOo00 = (XRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(p562o0oOo000.o0OO00O.rv_ban_enter_room_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f26018OooOo0 = (RecyclerView) viewFindViewById2;
        XRefreshLayout xRefreshLayout = this.f26019OooOo00;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new p487o0o00O.o0ooOOo(this, 1));
        XRefreshLayout xRefreshLayout2 = this.f26019OooOo00;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new o000O0O0.Oooo0(this, 2));
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO = new com.yalla.yalla.ui.activity.room.OooO0OO(this, p562o0oOo000.oo0o0Oo.activity_ban_enter_room_list_item);
        this.f26020OooOo0O = oooO0OO;
        oooO0OO.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO2 = this.f26020OooOo0O;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.Oooo000(p562o0oOo000.o000000.no_ban_room_user);
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO3 = this.f26020OooOo0O;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.Oooo0OO(new com.yalla.yalla.ui.activity.room.OooO0o(this));
        RecyclerView recyclerView = this.f26018OooOo0;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f26018OooOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView2 = null;
        }
        l0.OooO00o(recyclerView2);
        RecyclerView recyclerView3 = this.f26018OooOo0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView3 = null;
        }
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO4 = this.f26020OooOo0O;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        recyclerView3.setAdapter(oooO0OO4);
        p0 p0Var2 = this.f26017OooOo;
        if (p0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            p0Var2 = null;
        }
        SearchView search = p0Var2.f45359OooO0O0;
        Intrinsics.checkNotNullExpressionValue(search, "search");
        this.f26021OooOo0o = search;
        if (search == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            search = null;
        }
        search.getEditSearch().setHint(getString(p562o0oOo000.o000000.Search_user_name_or_id));
        SearchView searchView = this.f26021OooOo0o;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        searchView.setEditFocusListener(OooO.f26136OooO0Oo);
        SearchView searchView2 = this.f26021OooOo0o;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView2 = null;
        }
        searchView2.setSearchTextChangedListener(new OooOO0(this));
        SearchView searchView3 = this.f26021OooOo0o;
        if (searchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView3 = null;
        }
        searchView3.setSearchClickListener(new OooOO0O(this));
        com.yalla.yalla.ui.activity.room.OooO0OO oooO0OO5 = this.f26020OooOo0O;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO5 = null;
        }
        p0 p0Var3 = this.f26017OooOo;
        if (p0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
        } else {
            p0Var = p0Var3;
        }
        oooO0OO5.OooOo(p0Var.f45358OooO00o);
        this.f26015OooOOo0 = "";
        OooOo0O(true);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    public final void onEventMainThread(@Nullable p545o0oO0O00.OooOOO<?> oooOOO) {
        super.onEventMainThread(oooOOO);
        if (oooOOO != null && oooOOO.f55758OooO00o == 10068) {
            this.f26015OooOOo0 = "";
            OooOo0O(true);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f26021OooOo0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
        }
        SearchView searchView = this.f26021OooOo0o;
        SearchView searchView2 = null;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        if (searchView.getEditSearch() != null) {
            SearchView searchView3 = this.f26021OooOo0o;
            if (searchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            } else {
                searchView2 = searchView3;
            }
            EditText editSearch = searchView2.getEditSearch();
            kotlin.collections.OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editSearch.getWindowToken(), 0);
        }
    }
}
