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
import p579o0oOoo.oO000Oo0;
import p579o0oOoo.oOO0OOO;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.a9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/BanEnterRoomListActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BanEnterRoomListActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f26465OooOooo = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f26466OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public TextView f26468OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public a9 f26469OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public RecyclerView f26470OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public XRefreshLayout f26471OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public com.yalla.yalla.ui.activity.room.OooO0o f26472OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SearchView f26473OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f26476OooOoOO;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public String f26467OooOOo0 = "";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ArrayList<RoomBanEnterUser> f26475OooOoO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final ArrayList<RoomBanEnterUser> f26474OooOoO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f26478OooOoo0 = 1;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public String f26477OooOoo = "";

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f26479OooOooO = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$searchMyFriendApi$1", f = "BanEnterRoomListActivity.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<p420o0OoO0OO.o0OO00O<ApiResult<List<RoomBanEnterUser>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f26480OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f26481OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f26482OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f26483OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ BanEnterRoomListActivity f26484OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, BanEnterRoomListActivity banEnterRoomListActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26481OooO0o = str;
            this.f26483OooO0oO = str2;
            this.f26484OooO0oo = banEnterRoomListActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f26481OooO0o, this.f26483OooO0oO, this.f26484OooO0oo, continuation);
            oooO00o.f26482OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p420o0OoO0OO.o0OO00O<ApiResult<List<RoomBanEnterUser>>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p420o0OoO0OO.o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26480OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p420o0OoO0OO.o0OO00O o0oo00o3 = (p420o0OoO0OO.o0OO00O) this.f26482OooO0o0;
                String barId = this.f26481OooO0o;
                Intrinsics.checkNotNullExpressionValue(barId, "barId");
                int i2 = this.f26484OooO0oo.f26478OooOoo0;
                this.f26482OooO0o0 = o0oo00o3;
                this.f26480OooO0Oo = 1;
                String url = p376o0OOoOOO.o000OOo0.OooO0oO(p377o0OOoOo.o0000O.f44171o00O0O);
                Intrinsics.checkNotNullParameter(url, "url");
                p376o0OOoOOO.o0O0ooO o0o0ooo = new p376o0OOoOOO.o0O0ooO(url, 0);
                o0o0ooo.OooO0O0(barId, "barid");
                o0o0ooo.OooO0O0(String.valueOf(i2), "pageindex");
                o0o0ooo.OooO0O0(oO000Oo0.OooO0O0(this.f26483OooO0oO), "search");
                o0o0ooo.OooO0O0("20", "pagesize");
                Object objOooO0Oo = com.code.android.util.OooOOO.OooO0Oo(new ApiSearch$barBlockUserSearch$$inlined$call$1(o0o0ooo, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (p420o0OoO0OO.o0OO00O) this.f26482OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o0oo00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<RoomBanEnterUser>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26486OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(1);
            this.f26486OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<RoomBanEnterUser> list) {
            List<RoomBanEnterUser> list2 = list;
            BanEnterRoomListActivity banEnterRoomListActivity = BanEnterRoomListActivity.this;
            banEnterRoomListActivity.f26478OooOoo0++;
            ArrayList<RoomBanEnterUser> arrayList = banEnterRoomListActivity.f26474OooOoO;
            boolean z = this.f26486OooO0o0;
            if (z) {
                arrayList.clear();
            }
            boolean z2 = false;
            com.yalla.yalla.ui.activity.room.OooO0o oooO0o = null;
            if (list2 == null || list2.isEmpty()) {
                XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26471OooOo00;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOooo(z, true, true);
                com.yalla.yalla.ui.activity.room.OooO0o oooO0o2 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0o2 = null;
                }
                oooO0o2.OooOoO0(arrayList);
                com.yalla.yalla.ui.activity.room.OooO0o oooO0o3 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0o = oooO0o3;
                }
                oooO0o.Oooo00o();
                TextView textView = banEnterRoomListActivity.f26468OooOOoo;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else {
                arrayList.addAll(list2);
                com.yalla.yalla.ui.activity.room.OooO0o oooO0o4 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0o4 = null;
                }
                oooO0o4.OooOoO0(arrayList);
                XRefreshLayout xRefreshLayout2 = banEnterRoomListActivity.f26471OooOo00;
                if (xRefreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout2 = null;
                }
                if (list2 != null && list2.size() == 0) {
                    z2 = true;
                }
                xRefreshLayout2.OooOooo(z, true, z2);
                com.yalla.yalla.ui.activity.room.OooO0o oooO0o5 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0o = oooO0o5;
                }
                oooO0o.Oooo00o();
                banEnterRoomListActivity.f26467OooOOo0 = String.valueOf(list2.get(list2.size() - 1).getExTime());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26488OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z) {
            super(1);
            this.f26488OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            BanEnterRoomListActivity banEnterRoomListActivity = BanEnterRoomListActivity.this;
            XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26471OooOo00;
            com.yalla.yalla.ui.activity.room.OooO0o oooO0o = null;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout = null;
            }
            xRefreshLayout.OooOoo(this.f26488OooO0o0);
            com.yalla.yalla.ui.activity.room.OooO0o oooO0o2 = banEnterRoomListActivity.f26472OooOo0O;
            if (oooO0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0o = oooO0o2;
            }
            oooO0o.OooOoo();
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
            TextView textView = BanEnterRoomListActivity.this.f26468OooOOoo;
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
        arrayList.addAll(banEnterRoomListActivity.f26475OooOoO0);
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o = banEnterRoomListActivity.f26472OooOo0O;
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o2 = null;
        if (oooO0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o = null;
        }
        oooO0o.OooOoO0(arrayList);
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o3 = banEnterRoomListActivity.f26472OooOo0O;
        if (oooO0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0o2 = oooO0o3;
        }
        oooO0o2.Oooo0O0(true);
    }

    public final void OooOo0O(final boolean z) {
        this.f26476OooOoOO = false;
        String barid = MixedRoomDataSource.OooO0o0().f23460OooO0o.getBarid();
        if (z) {
            this.f26479OooOooO = 1;
        }
        p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
        String str = this.f26467OooOOo0;
        int i = this.f26479OooOooO;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$getBanRoomData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.f26491OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                super.OooO0O0(str2, str3);
                BanEnterRoomListActivity banEnterRoomListActivity = this.f26491OooO0o0;
                XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26471OooOo00;
                OooO0o oooO0o = null;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOoo(z);
                OooO0o oooO0o2 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0o = oooO0o2;
                }
                oooO0o.OooOoo();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@Nullable String str2) {
                String str3;
                BanEnterRoomListActivity banEnterRoomListActivity = this.f26491OooO0o0;
                TextView textView = banEnterRoomListActivity.f26468OooOOoo;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) oOo00OO0.OooO0O0(str2, new TypeToken<MoraHistoryModelList<RoomBanEnterUser>>() { // from class: com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$getBanRoomData$1$onFinish$results$1
                }.getType());
                banEnterRoomListActivity.f26479OooOooO = (moraHistoryModelList == null || (str3 = moraHistoryModelList.pageindex) == null) ? 0 : com.code.android.util.o0OoOo0.OooO0o(0, str3);
                OooO0o oooO0o = null;
                a9 a9Var = null;
                List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
                Object[] objArr = data == null || data.isEmpty();
                boolean z2 = z;
                if (objArr == true) {
                    XRefreshLayout xRefreshLayout = banEnterRoomListActivity.f26471OooOo00;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                        xRefreshLayout = null;
                    }
                    xRefreshLayout.OooOooo(z2, true, true);
                    OooO0o oooO0o2 = banEnterRoomListActivity.f26472OooOo0O;
                    if (oooO0o2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0o2 = null;
                    }
                    oooO0o2.OooOoO0(null);
                    OooO0o oooO0o3 = banEnterRoomListActivity.f26472OooOo0O;
                    if (oooO0o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0o3 = null;
                    }
                    oooO0o3.Oooo00o();
                    TextView textView2 = banEnterRoomListActivity.f26468OooOOoo;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    a9 a9Var2 = banEnterRoomListActivity.f26469OooOo;
                    if (a9Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                    } else {
                        a9Var = a9Var2;
                    }
                    SearchView searchView = a9Var.f57494OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(searchView, "header.search");
                    com.code.android.util.o000OO00.OooO0O0(searchView);
                    return;
                }
                ArrayList<RoomBanEnterUser> arrayList = banEnterRoomListActivity.f26475OooOoO0;
                if (z2) {
                    a9 a9Var3 = banEnterRoomListActivity.f26469OooOo;
                    if (a9Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                        a9Var3 = null;
                    }
                    SearchView searchView2 = a9Var3.f57494OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(searchView2, "header.search");
                    com.code.android.util.o000OO00.OooOOOO(searchView2);
                    a9 a9Var4 = banEnterRoomListActivity.f26469OooOo;
                    if (a9Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                        a9Var4 = null;
                    }
                    View view = a9Var4.f57494OooO0O0.f30648OooO0o;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewLine");
                        view = null;
                    }
                    view.setVisibility(0);
                    arrayList.clear();
                }
                arrayList.addAll(moraHistoryModelList.getData());
                OooO0o oooO0o4 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0o4 = null;
                }
                oooO0o4.OooOoO0(arrayList);
                XRefreshLayout xRefreshLayout2 = banEnterRoomListActivity.f26471OooOo00;
                if (xRefreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout2 = null;
                }
                xRefreshLayout2.OooOooo(z2, true, moraHistoryModelList.getData().size() < Integer.parseInt("15"));
                OooO0o oooO0o5 = banEnterRoomListActivity.f26472OooOo0O;
                if (oooO0o5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooO0o = oooO0o5;
                }
                oooO0o.Oooo00o();
                banEnterRoomListActivity.f26467OooOOo0 = String.valueOf(((RoomBanEnterUser) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getExTime());
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("barid", barid);
        linkedHashMapOooO00o.put("pagesize", String.valueOf(15));
        linkedHashMapOooO00o.put("pageindex", String.valueOf(i));
        linkedHashMapOooO00o.put("timestr", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44143o00000o0, linkedHashMapOooO00o, oooO0O0);
    }

    public final void OooOo0o(String str, boolean z) {
        this.f26477OooOoo = str;
        this.f26476OooOoOO = true;
        String barid = MixedRoomDataSource.OooO0o0().f23460OooO0o.getBarid();
        if (z) {
            this.f26478OooOoo0 = 1;
        }
        p420o0OoO0OO.o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new OooO00o(barid, str, this, null)).observe(this, new p377o0OOoOo.o0000OO0(new OooO0O0(z), new OooO0OO(z), new OooO0o(), false, 8));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_ban_enter_room_list);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.room_ban_enter_room_title);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationOnClickListener(new OooOOO(this));
        }
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        a9 a9Var = null;
        this.f26468OooOOoo = headerLayout3 != null ? headerLayout3.OooOoO(getString(oO00OOo0.Edit), new OooOOOO(this)) : null;
        a9 a9VarInflate = a9.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(a9VarInflate, "inflate(layoutInflater)");
        this.f26469OooOo = a9VarInflate;
        TextView textView = this.f26468OooOOoo;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View viewFindViewById = findViewById(oO00O0oO.move_room_pullToRefreshView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.move_room_pullToRefreshView)");
        this.f26471OooOo00 = (XRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.rv_ban_enter_room_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.rv_ban_enter_room_list)");
        this.f26470OooOo0 = (RecyclerView) viewFindViewById2;
        XRefreshLayout xRefreshLayout = this.f26471OooOo00;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new com.yalla.yalla.ui.activity.room.OooO00o(this));
        XRefreshLayout xRefreshLayout2 = this.f26471OooOo00;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new p203o00o0o0o.o000OO00(this));
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o = new com.yalla.yalla.ui.activity.room.OooO0o(this, oO00OO0O.activity_ban_enter_room_list_item);
        this.f26472OooOo0O = oooO0o;
        oooO0o.OooOooo(p584o0oOooO0.oOo00OO0.ic_empty_delete);
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o2 = this.f26472OooOo0O;
        if (oooO0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o2 = null;
        }
        oooO0o2.Oooo000(oO00OOo0.no_ban_room_user);
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o3 = this.f26472OooOo0O;
        if (oooO0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o3 = null;
        }
        oooO0o3.Oooo0OO(new OooO(this));
        RecyclerView recyclerView = this.f26470OooOo0;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f26470OooOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView2 = null;
        }
        oOO0OOO.OooO00o(recyclerView2);
        RecyclerView recyclerView3 = this.f26470OooOo0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView3 = null;
        }
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o4 = this.f26472OooOo0O;
        if (oooO0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o4 = null;
        }
        recyclerView3.setAdapter(oooO0o4);
        a9 a9Var2 = this.f26469OooOo;
        if (a9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            a9Var2 = null;
        }
        SearchView searchView = a9Var2.f57494OooO0O0;
        Intrinsics.checkNotNullExpressionValue(searchView, "header.search");
        this.f26473OooOo0o = searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        searchView.getEditSearch().setHint(getString(oO00OOo0.Search_user_name_or_id));
        SearchView searchView2 = this.f26473OooOo0o;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView2 = null;
        }
        searchView2.setEditFocusListener(OooOO0.f26595OooO0Oo);
        SearchView searchView3 = this.f26473OooOo0o;
        if (searchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView3 = null;
        }
        searchView3.setSearchTextChangedListener(new OooOO0O(this));
        SearchView searchView4 = this.f26473OooOo0o;
        if (searchView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView4 = null;
        }
        searchView4.setSearchClickListener(new OooOOO0(this));
        com.yalla.yalla.ui.activity.room.OooO0o oooO0o5 = this.f26472OooOo0O;
        if (oooO0o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0o5 = null;
        }
        a9 a9Var3 = this.f26469OooOo;
        if (a9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
        } else {
            a9Var = a9Var3;
        }
        oooO0o5.OooOo(a9Var.f57493OooO00o);
        this.f26467OooOOo0 = "";
        OooOo0O(true);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(@Nullable p418o0OoO000.OooOo<?> oooOo) {
        super.onEventMainThread(oooOo);
        if (oooOo != null && oooOo.f45532OooO00o == 10068) {
            this.f26467OooOOo0 = "";
            OooOo0O(true);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f26473OooOo0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
        }
        SearchView searchView = this.f26473OooOo0o;
        SearchView searchView2 = null;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        if (searchView.getEditSearch() != null) {
            SearchView searchView3 = this.f26473OooOo0o;
            if (searchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            } else {
                searchView2 = searchView3;
            }
            EditText editSearch = searchView2.getEditSearch();
            p367o0OOo0o0.OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context"), editSearch.getWindowToken(), 0);
        }
    }
}
